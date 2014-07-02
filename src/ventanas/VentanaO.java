package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaO extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	public JTextArea txtO;
	
	public VentanaO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
		setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnO = new JButton("Boton O");
		BttnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"O");
				dispose();
			}
		});
		BttnO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnO);
		
		JButton BttnP = new JButton("Boton P");
		BttnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"P");
				dispose();
			}
		});
		BttnP.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnP);
		
		JButton BttnQu = new JButton("Boton Qu");
		BttnQu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"QU");
				dispose();
			}
		});
		BttnQu.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnQu);
		
		JButton BttnR = new JButton("Boton R");
		BttnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"R");
				dispose();
			}
		});
		BttnR.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnR);
		
		JButton BttnS = new JButton("Boton S");
		BttnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"S");
				dispose();
			}
		});
		BttnS.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnS);
		
		JButton BttnEspacio = new JButton("Espacio");
		BttnEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+" ");
				dispose();
			}
		});
		BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		contentPane.add(BttnEspacio);
		
		JButton BttnPunto = new JButton("Punto");
		BttnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+".");
				dispose();
			}
		});
		BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPunto);
		
		JButton BttnBorrar = new JButton("Borrar");
		BttnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText().substring(0,txtO.getText().length()-1));
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
		
		txtO = new JTextArea();
		txtO.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtO.setBackground(Color.LIGHT_GRAY);
		txtO.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(txtO);
		txtO.setEditable(false);
		txtO.setFont(new Font("Arial", Font.BOLD, 30));
		txtO.setText(VentanaPrincipal.txt.getText());
	}
	
}