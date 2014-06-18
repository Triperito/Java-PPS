package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import sun.security.x509.AVA;
import java.awt.GridBagLayout;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds((int)(this.ancho*0.03),(int)(this.alto*0.03),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds((int)(this.ancho*0.03),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds((int)(this.ancho*0.787),(int)(this.alto*0.03),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds((int)(this.ancho*0.787),(int)(this.alto*0.744),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(btnNewButton_3);
	}
}