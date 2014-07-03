package ventanas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnA = new JButton("A");
		BttnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"A");
				dispose();
			}
		});
		BttnA.setBackground(new Color(230, 230, 250));
		BttnA.setForeground(new Color(0, 0, 128));
		BttnA.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnA);
		
		JButton BttnB = new JButton("B");
		BttnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"B");
				dispose();
			}
		});
		BttnB.setBackground(new Color(230, 230, 250));
		BttnB.setForeground(new Color(0, 0, 128));
		BttnB.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnB.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnB);
		
		JButton BttnC = new JButton("C");
		BttnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"C");
				dispose();
			}
		});
		BttnC.setBackground(new Color(230, 230, 250));
		BttnC.setForeground(new Color(0, 0, 128));
		BttnC.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnC.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnC);
		
		JButton BttnD = new JButton("D");
		BttnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"D");
				dispose();
			}
		});
		BttnD.setBackground(new Color(230, 230, 250));
		BttnD.setForeground(new Color(0, 0, 128));
		BttnD.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnD.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnD);
		
		JButton BttnE = new JButton("E");
		BttnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtA.getText()+"E");
				dispose();
			}
		});
		BttnE.setBackground(new Color(230, 230, 250));
		BttnE.setForeground(new Color(0, 0, 128));
		BttnE.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnE.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnE);
		
		JButton BttnEspacio = new JButton("");
		BttnEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		BttnEspacio.setBackground(new Color(148, 0, 211));
		BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		contentPane.add(BttnEspacio);
		
		JButton BttnPunto = new JButton(".");
		BttnPunto.setBackground(new Color(230, 230, 250));
		BttnPunto.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPunto);
		
		JButton BttnBorrar = new JButton("Borrar");
		BttnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = txtA.getText().length();
				if (i>0){
					if((i>1)&&(txtA.getText().charAt(i-1) == 'U') && (txtA.getText().charAt(i-2) == 'Q')){
					txtA.setText(txtA.getText().substring(0, i-2));
					VentanaPrincipal.txt.setText(txtA.getText().substring(0, i-2));
					}
					else{
						txtA.setText(txtA.getText().substring(0, i-1));
						VentanaPrincipal.txt.setText(txtA.getText().substring(0, i-1));
					}
				}
			}
		});
		BttnBorrar.setBackground(new Color(230, 230, 250));
		BttnBorrar.setFont(new Font("Arial", Font.PLAIN, 25));
		BttnBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnBorrar);
		
		JButton BttnSI = new JButton("SI");
		BttnSI.setBackground(new Color(255, 165, 0));
		BttnSI.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnSI);
		
		JButton BttnNO = new JButton("NO");
		BttnNO.setBackground(new Color(0, 206, 209));
		BttnNO.setFont(new Font("Arial", Font.PLAIN, 30));
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