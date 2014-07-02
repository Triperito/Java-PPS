package ventanas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class VentanaA extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	public JTextArea txtA;
	
	public VentanaA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
		setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnA = new JButton("Boton A");
		BttnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"A");
				dispose();
			}
		});
		BttnA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnA);
		
		JButton BttnB = new JButton("Boton B");
		BttnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"B");
				dispose();
			}
		});
		BttnB.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnB);
		
		JButton BttnC = new JButton("Boton C");
		BttnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"C");
				dispose();
			}
		});
		BttnC.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnC);
		
		JButton BttnD = new JButton("Boton D");
		BttnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"D");
				dispose();
			}
		});
		BttnD.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnD);
		
		JButton BttnE = new JButton("Boton E");
		BttnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"E");
				dispose();
			}
		});
		BttnE.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnE);
		
		JButton BttnEspacio = new JButton("Espacio");
		BttnEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+" ");
				dispose();
			}
		});
		BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		contentPane.add(BttnEspacio);
		
		JButton BttnPunto = new JButton("Punto");
		BttnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+".");
				dispose();
			}
		});
		BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPunto);
		
		JButton BttnBorrar = new JButton("Borrar");
		BttnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText().substring(0, txtA.getText().length()-1));
				dispose();
			}
		});
		BttnBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnBorrar);
		
		JButton BttnSI = new JButton("SI");
		BttnSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnSI);
		
		JButton BttnNO = new JButton("NO");
		BttnNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnNO);
		
		txtA = new JTextArea();
		txtA.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtA.setBackground(Color.LIGHT_GRAY);
		txtA.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(txtA);
		txtA.setEditable(false);
		txtA.setFont(new Font("Arial", Font.BOLD, 30));
		txtA.setText(VentanaPrincipal.txt.getText());
	}
	
}