package ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VentanaF extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {		
					VentanaF frame = new VentanaF();
					frame.setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
					frame.setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public VentanaF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnF = new JButton("Boton F");
		BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnF);
		
		JButton BttnG = new JButton("Boton G");
		BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnG);
		
		JButton BttnH = new JButton("Boton H");
		BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnH);
		
		JButton BttnI = new JButton("Boton I");
		BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnI);
		
		JButton BttnJ = new JButton("Boton J");
		BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnJ);
		
		JButton BttnEspacio = new JButton("Espacio");
		BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		contentPane.add(BttnEspacio);
		
		JButton BttnPunto = new JButton("Punto");
		BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPunto);
		
		JButton BttnBorrar = new JButton("Borrar");
		BttnBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnBorrar);
		
		JButton BttnSI = new JButton("SI");
		BttnSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnSI);
		
		JButton BttnNO = new JButton("NO");
		BttnNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnNO);
		
		textField = new JTextField();
		textField.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
}