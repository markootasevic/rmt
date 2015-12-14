import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.LinkedList;

public class ServerNit extends Thread{

	Socket soketZaKomunikaciju = null;
	LinkedList<ServerNit> klijenti;
	
	public  ServerNit (Socket soket, LinkedList<ServerNit> klijenti) {
		this.soketZaKomunikaciju = soket;
		this.klijenti = klijenti;
	}
	
	@Override
	public void run() {
		try {

			PrintStream kaKlijentu = new PrintStream(
					soketZaKomunikaciju.getOutputStream());
			BufferedReader odKlijenta = new BufferedReader(
					new InputStreamReader(soketZaKomunikaciju.getInputStream()));

			String BrojeviOdKlijenta = odKlijenta.readLine();
			String[] niz = BrojeviOdKlijenta.split(" ");
			int rezultat = 0;
			if (niz[niz.length - 1].equals("sabiranje")) {
				for (int i = 0; i < niz.length - 1; i++) {
					int broj = Integer.parseInt(niz[i]);
					rezultat += broj;
				}
			}
			
			if (niz[niz.length - 1].equals("oduzumanje")) {
				rezultat = Integer.parseInt(niz[0]);
				for (int i = 1; i < niz.length - 1; i++) {
					int broj = Integer.parseInt(niz[i]);
					rezultat -= broj;
				}
			}
			
			if (niz[niz.length - 1].equals("mnozenje")) {
				rezultat = 1;
				for (int i = 0; i < niz.length - 1; i++) {
					int broj = Integer.parseInt(niz[i]);
					rezultat *= broj;
				}
			}
			
			if (niz[niz.length - 1].equals("deljenje")) {
				rezultat = Integer.parseInt(niz[0]);
				for (int i = 0; i < niz.length - 1; i++) {
					int broj = Integer.parseInt(niz[i]);
					rezultat /= broj;
				}
			}
			
			String zaSlanje = rezultat + "";

			kaKlijentu.println(zaSlanje);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
