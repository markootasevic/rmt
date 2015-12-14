import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class KlijentGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnDa;
	private JButton btnNe;
	private JLabel lblDaLiZelite;
	private JLabel lblUnesiteBrojeveRazdvojene;
	private JTextField textFieldBrojevi;
	private JLabel lblNewJgoodiesLabel;
	private JLabel lblIzaberiteOperaciju;
	private JRadioButton rdbtnSabiranje;
	private JRadioButton rdbtnOduzimanje;
	private JRadioButton rdbtnMnozenje;
	private JRadioButton rdbtnDeljenje;
	private JLabel lblRezultat;
	private JTextField textFieldRezultat;
	private JLabel lblNewLabel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnIzracunaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KlijentGUI frame = new KlijentGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public KlijentGUI() {
		setResizable(false);
		setTitle("RMT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnDa());
		contentPane.add(getBtnNe());
		contentPane.add(getLblDaLiZelite());
		contentPane.add(getLblUnesiteBrojeveRazdvojene());
		contentPane.add(getTextFieldBrojevi());
		contentPane.add(getLblNewJgoodiesLabel());
		contentPane.add(getLblIzaberiteOperaciju());
		contentPane.add(getRdbtnSabiranje());
		contentPane.add(getRdbtnOduzimanje());
		contentPane.add(getRdbtnMnozenje());
		contentPane.add(getRdbtnDeljenje());
		contentPane.add(getLblRezultat());
		contentPane.add(getTextFieldRezultat());
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnIzracunaj());
	}

	private JButton getBtnDa() {
		if (btnDa == null) {
			btnDa = new JButton("Da");
			btnDa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rdbtnDeljenje.setSelected(true);
				}
			});
			btnDa.setBounds(62, 45, 89, 23);
		}
		return btnDa;
	}
	private JButton getBtnNe() {
		if (btnNe == null) {
			btnNe = new JButton("Ne");
			btnNe.setBounds(242, 45, 89, 23);
		}
		return btnNe;
	}
	private JLabel getLblDaLiZelite() {
		if (lblDaLiZelite == null) {
			lblDaLiZelite = new JLabel("Da li zelite da racunate?");
			lblDaLiZelite.setHorizontalAlignment(SwingConstants.CENTER);
			lblDaLiZelite.setBounds(62, 11, 269, 23);
		}
		return lblDaLiZelite;
	}
	private JLabel getLblUnesiteBrojeveRazdvojene() {
		if (lblUnesiteBrojeveRazdvojene == null) {
			lblUnesiteBrojeveRazdvojene = new JLabel("Unesite brojeve razdvojene razmakom(space dugme)");
			lblUnesiteBrojeveRazdvojene.setBounds(10, 97, 262, 23);
		}
		return lblUnesiteBrojeveRazdvojene;
	}
	private JTextField getTextFieldBrojevi() {
		if (textFieldBrojevi == null) {
			textFieldBrojevi = new JTextField();
			textFieldBrojevi.setBounds(10, 143, 262, 32);
			textFieldBrojevi.setColumns(10);
		}
		return textFieldBrojevi;
	}
	private JLabel getLblNewJgoodiesLabel() {
		if (lblNewJgoodiesLabel == null) {
			lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
			lblNewJgoodiesLabel.setBounds(81, 161, 92, 14);
		}
		return lblNewJgoodiesLabel;
	}
	private JLabel getLblIzaberiteOperaciju() {
		if (lblIzaberiteOperaciju == null) {
			lblIzaberiteOperaciju = new JLabel("Izaberite operaciju");
			lblIzaberiteOperaciju.setHorizontalAlignment(SwingConstants.CENTER);
			lblIzaberiteOperaciju.setBounds(62, 186, 196, 23);
		}
		return lblIzaberiteOperaciju;
	}
	private JRadioButton getRdbtnSabiranje() {
		if (rdbtnSabiranje == null) {
			rdbtnSabiranje = new JRadioButton("Sabiranje (+)");
			buttonGroup.add(rdbtnSabiranje);
			rdbtnSabiranje.setBounds(10, 216, 154, 23);
		}
		return rdbtnSabiranje;
	}
	private JRadioButton getRdbtnOduzimanje() {
		if (rdbtnOduzimanje == null) {
			rdbtnOduzimanje = new JRadioButton("Oduzimanje (-)");
			buttonGroup.add(rdbtnOduzimanje);
			rdbtnOduzimanje.setBounds(181, 216, 131, 23);
		}
		return rdbtnOduzimanje;
	}
	private JRadioButton getRdbtnMnozenje() {
		if (rdbtnMnozenje == null) {
			rdbtnMnozenje = new JRadioButton("Mnozenje (*)");
			buttonGroup.add(rdbtnMnozenje);
			rdbtnMnozenje.setBounds(10, 253, 111, 23);
		}
		return rdbtnMnozenje;
	}
	private JRadioButton getRdbtnDeljenje() {
		if (rdbtnDeljenje == null) {
			rdbtnDeljenje = new JRadioButton("Deljenje (/)");
			buttonGroup.add(rdbtnDeljenje);
			rdbtnDeljenje.setBounds(181, 253, 98, 23);
		}
		return rdbtnDeljenje;
	}
	private JLabel getLblRezultat() {
		if (lblRezultat == null) {
			lblRezultat = new JLabel("Rezultat");
			lblRezultat.setHorizontalAlignment(SwingConstants.CENTER);
			lblRezultat.setBounds(10, 293, 177, 31);
		}
		return lblRezultat;
	}
	private JTextField getTextFieldRezultat() {
		if (textFieldRezultat == null) {
			textFieldRezultat = new JTextField();
			textFieldRezultat.setBounds(242, 292, 200, 32);
			textFieldRezultat.setColumns(10);
		}
		return textFieldRezultat;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Niste lepo uneli,pokusajte ponovo");
			lblNewLabel.setVisible(false);
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setBackground(Color.WHITE);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel.setBounds(282, 134, 172, 41);
		}
		return lblNewLabel;
	}
	private JButton getBtnIzracunaj() {
		if (btnIzracunaj == null) {
			btnIzracunaj = new JButton("Izracunaj");
			btnIzracunaj.setBounds(312, 235, 118, 23);
		}
		return btnIzracunaj;
	}
}
