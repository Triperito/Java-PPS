package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaF extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	public JTextField txtF;
	
	public VentanaF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
		setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnF = new JButton("Boton F");
		BttnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"F");
				dispose();
			}
		});
		BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnF);
		
		JButton BttnG = new JButton("Boton G");
		BttnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"G");
				dispose();
			}
		});
		BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnG);
		
		JButton BttnH = new JButton("Boton H");
		BttnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"H");
				dispose();
			}
		});
		BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnH);
		
		JButton BttnI = new JButton("Boton I");
		BttnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"I");
				dispose();
			}
		});
		BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnI);
		
		JButton BttnJ = new JButton("Boton J");
		BttnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+"J");
				dispose();
			}
		});
		BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnJ);
		
		JButton BttnEspacio = new JButton("Espacio");
		BttnEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+" ");
				dispose();
			}
		});
		BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		contentPane.add(BttnEspacio);
		
		JButton BttnPunto = new JButton("Punto");
		BttnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText()+".");
				dispose();
			}
		});
		BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPunto);
		
		JButton BttnBorrar = new JButton("Borrar");
		BttnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.txt.setText(txtF.getText().substring(0, txtF.getText().length()-1));
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
		
		JPanel PanelTxt = new JPanel();
		PanelTxt.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PanelTxt.setBackground(new Color(192, 192, 192));
		PanelTxt.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(PanelTxt);
		PanelTxt.setLayout(null);
		
		txtF = new JTextField();
		txtF.setEditable(false);
		txtF.setFont(new Font("Arial", Font.BOLD, 30));
		txtF.setBounds(10, 10, (int)(this.ancho*0.5)-20,20);
		txtF.setText(VentanaPrincipal.txt.getText());
		PanelTxt.add(txtF);
	}
	
}