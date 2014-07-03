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
public class VentanaK extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	public JTextArea txtK;
	
	public VentanaK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
		setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnK = new JButton("K");
		BttnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtK.getText()+"K");
				dispose();
			}
		});
		BttnK.setBackground(new Color(230, 230, 250));
		BttnK.setForeground(new Color(34, 139, 34));
		BttnK.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnK.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnK);
		
		JButton BttnL = new JButton("L");
		BttnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtK.getText()+"L");
				dispose();
			}
		});
		BttnL.setBackground(new Color(230, 230, 250));
		BttnL.setForeground(new Color(34, 139, 34));
		BttnL.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnL.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnL);
		
		JButton BttnM = new JButton("M");
		BttnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtK.getText()+"M");
				dispose();
			}
		});
		BttnM.setBackground(new Color(230, 230, 250));
		BttnM.setForeground(new Color(34, 139, 34));
		BttnM.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnM.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnM);
		
		JButton BttnN = new JButton("N");
		BttnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtK.getText()+"N");
				dispose();
			}
		});
		BttnN.setBackground(new Color(230, 230, 250));
		BttnN.setForeground(new Color(34, 139, 34));
		BttnN.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnN.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnN);
		
		JButton BttnÑ = new JButton("Ñ");
		BttnÑ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtK.getText()+"Ñ");
				dispose();
			}
		});
		BttnÑ.setBackground(new Color(230, 230, 250));
		BttnÑ.setForeground(new Color(34, 139, 34));
		BttnÑ.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnÑ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnÑ);
		
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
				int i = txtK.getText().length();
				if (i>0){
					if((i>1)&&(txtK.getText().charAt(i-1) == 'U') && (txtK.getText().charAt(i-2) == 'Q')){
						txtK.setText(txtK.getText().substring(0, i-2));
						VentanaPrincipal.txt.setText(txtK.getText().substring(0, i-2));
					}
					else{
						txtK.setText(txtK.getText().substring(0, i-1));
						VentanaPrincipal.txt.setText(txtK.getText().substring(0, i-1));
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
		
		txtK = new JTextArea();
		txtK.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtK.setBackground(Color.LIGHT_GRAY);
		txtK.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(txtK);
		txtK.setEditable(false);
		txtK.setFont(new Font("Arial", Font.BOLD, 30));
		txtK.setText(VentanaPrincipal.txt.getText());
		
	}
	
}