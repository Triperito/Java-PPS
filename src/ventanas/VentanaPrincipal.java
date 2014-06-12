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

	public int alto=java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho=java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	
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
					frame.setUndecorated(true); //Oculta titulo de ventana y barra de tarea(maximza la pantalla)
					frame.setExtendedState(MAXIMIZED_BOTH);
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
		btnNewButton.setBounds((int) (ancho*0.9), (int) (alto*0.9), (int) (ancho*0.2), (int) (alto*0.15));
		contentPane.add(btnNewButton);
	}

}
