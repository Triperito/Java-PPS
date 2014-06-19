package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import sun.security.x509.AVA;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {		
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setSize(frame.ancho,frame.alto-50);
					frame.setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
					frame.setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, ancho, alto);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnPrA = new JButton("Boton A");
		BttnPrA.setBounds((int)(this.ancho*0.03),(int)(this.alto*0.03),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrA);
		
		JButton BttnPrO = new JButton("Boton O");
		BttnPrO.setBounds((int)(this.ancho*0.03),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrO);
		
		JButton BttnPrF = new JButton("Boton F");
		BttnPrF.setBounds((int)(this.ancho*0.787),(int)(this.alto*0.03),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrF);
		
		JButton BttnPrT = new JButton("Boton T");
		BttnPrT.setBounds((int)(this.ancho*0.787),(int)(this.alto*0.744),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrT);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.03),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds((int)(this.ancho*0.03),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds((int)(this.ancho*0.365),(int)(this.alto*0.365),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds((int)(this.ancho*0.827),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds((int)(this.ancho*0.253),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds((int)(this.ancho*0.637),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(btnNewButton_5);
		
		textField = new JTextField();
		textField.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.877),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(textField);
		textField.setColumns(10);
	}
}