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
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnO = new JButton("O");
		BttnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"O");
				dispose();
			}
		});
		BttnO.setBackground(new Color(230, 230, 250));
		BttnO.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnO);
		
		JButton BttnP = new JButton("P");
		BttnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"P");
				dispose();
			}
		});
		BttnP.setBackground(new Color(230, 230, 250));
		BttnP.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnP.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnP);
		
		JButton BttnQu = new JButton("Qu");
		BttnQu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"QU");
				dispose();
			}
		});
		BttnQu.setBackground(new Color(230, 230, 250));
		BttnQu.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnQu.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnQu);
		
		JButton BttnR = new JButton("R");
		BttnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"R");
				dispose();
			}
		});
		BttnR.setBackground(new Color(230, 230, 250));
		BttnR.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnR.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnR);
		
		JButton BttnS = new JButton("S");
		BttnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtO.getText()+"S");
				dispose();
			}
		});
		BttnS.setBackground(new Color(230, 230, 250));
		BttnS.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnS.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnS);
		
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
				int i = txtO.getText().length();
				if((txtO.getText().charAt(i-1) == 'U') && (txtO.getText().charAt(i-2) == 'Q')){
					txtO.setText(txtO.getText().substring(0, i-2));
					VentanaPrincipal.txt.setText(txtO.getText().substring(0, i-2));
				}
				else{
					txtO.setText(txtO.getText().substring(0, i-1));
					VentanaPrincipal.txt.setText(txtO.getText().substring(0, i-1));
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