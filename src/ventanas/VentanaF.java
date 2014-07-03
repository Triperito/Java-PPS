package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaF extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	public JTextArea txtF;
	
	public VentanaF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
		setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnF = new JButton("F");
		BttnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"F");
				dispose();
			}
		});
		BttnF.setBackground(new Color(230, 230, 250));
		BttnF.setForeground(new Color(255, 0, 0));
		BttnF.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnF);
		
		JButton BttnG = new JButton("G");
		BttnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"G");
				dispose();
			}
		});
		BttnG.setBackground(new Color(230, 230, 250));
		BttnG.setForeground(new Color(255, 0, 0));
		BttnG.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnG);
		
		JButton BttnH = new JButton("H");
		BttnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"H");
				dispose();
			}
		});
		BttnH.setBackground(new Color(230, 230, 250));
		BttnH.setForeground(new Color(255, 0, 0));
		BttnH.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnH);
		
		JButton BttnI = new JButton("I");
		BttnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"I");
				dispose();
			}
		});
		BttnI.setBackground(new Color(230, 230, 250));
		BttnI.setForeground(new Color(255, 0, 0));
		BttnI.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnI);
		
		JButton BttnJ = new JButton("J");
		BttnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"J");
				dispose();
			}
		});
		BttnJ.setBackground(new Color(230, 230, 250));
		BttnJ.setForeground(new Color(255, 0, 0));
		BttnJ.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnJ);
		
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
				int i = txtF.getText().length();
				if((txtF.getText().charAt(i-1) == 'U') && (txtF.getText().charAt(i-2) == 'Q')){
					txtF.setText(txtF.getText().substring(0, i-2));
					VentanaPrincipal.txt.setText(txtF.getText().substring(0, i-2));
				}
				else{
					txtF.setText(txtF.getText().substring(0, i-1));
					VentanaPrincipal.txt.setText(txtF.getText().substring(0, i-1));
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
		
		txtF = new JTextArea();
		txtF.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtF.setBackground(Color.LIGHT_GRAY);
		txtF.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(txtF);
		txtF.setEditable(false);
		txtF.setFont(new Font("Arial", Font.BOLD, 30));
		txtF.setText(VentanaPrincipal.txt.getText());
	}
	
}