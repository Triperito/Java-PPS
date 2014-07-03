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
public class VentanaT extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	public JTextArea txtT;
	
	public VentanaT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
		setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnT = new JButton("T");
		BttnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtT.getText()+"T");
				dispose();
			}
		});
		BttnT.setBackground(new Color(230, 230, 250));
		BttnT.setForeground(new Color(255, 140, 0));
		BttnT.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnT.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnT);
		
		JButton BttnU = new JButton("U");
		BttnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtT.getText()+"U");
				dispose();
			}
		});
		BttnU.setBackground(new Color(230, 230, 250));
		BttnU.setForeground(new Color(255, 140, 0));
		BttnU.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnU.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnU);
		
		JButton BttnV = new JButton("V");
		BttnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtT.getText()+"V");
				dispose();
			}
		});
		BttnV.setBackground(new Color(230, 230, 250));
		BttnV.setForeground(new Color(255, 140, 0));
		BttnV.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnV.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnV);
		
		JButton BttnX = new JButton("X");
		BttnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtT.getText()+"X");
				dispose();
			}
		});
		BttnX.setBackground(new Color(230, 230, 250));
		BttnX.setForeground(new Color(255, 140, 0));
		BttnX.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnX.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnX);
		
		JButton BttnY = new JButton("Y");
		BttnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtT.getText()+"Y");
				dispose();
			}
		});
		BttnY.setBackground(new Color(230, 230, 250));
		BttnY.setForeground(new Color(255, 140, 0));
		BttnY.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnY.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnY);
		
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
				int i = txtT.getText().length();
				if (i>0){
					if((i>1)&&(txtT.getText().charAt(i-1) == 'U') && (txtT.getText().charAt(i-2) == 'Q')){
						txtT.setText(txtT.getText().substring(0, i-2));
						VentanaPrincipal.txt.setText(txtT.getText().substring(0, i-2));
					}
					else{
						txtT.setText(txtT.getText().substring(0, i-1));
						VentanaPrincipal.txt.setText(txtT.getText().substring(0, i-1));
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
		
		txtT = new JTextArea();
		txtT.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtT.setBackground(Color.LIGHT_GRAY);
		txtT.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(txtT);
		txtT.setEditable(false);
		txtT.setFont(new Font("Arial", Font.BOLD, 30));
		txtT.setText(VentanaPrincipal.txt.getText());
	}
	
}