package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	public static JTextArea txt;
	public static JTextArea txt2;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {		
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
		setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BttnPrA = new JButton("A");
		BttnPrA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaA NewVentanaA= new VentanaA();
				NewVentanaA.setVisible(true);
			}
		});
		BttnPrA.setBackground(new Color(230, 230, 250));
		BttnPrA.setForeground(new Color(0, 0, 128));
		BttnPrA.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrA);
		
		JButton BttnPrF = new JButton("F");
		BttnPrF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaF NewVentanaF= new VentanaF();
				NewVentanaF.setVisible(true);
			}
		});
		BttnPrF.setBackground(new Color(230, 230, 250));
		BttnPrF.setForeground(new Color(255, 0, 0));
		BttnPrF.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrF.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrF);
		
		JButton BttnPrK = new JButton("K");
		BttnPrK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaK NewVentanaK= new VentanaK();
				NewVentanaK.setVisible(true);
			}
		});
		BttnPrK.setBackground(new Color(230, 230, 250));
		BttnPrK.setForeground(new Color(34, 139, 34));
		BttnPrK.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrK.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrK);
		
		JButton BttnPrO = new JButton("O");
		BttnPrO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaO NewVentanaO= new VentanaO();
				NewVentanaO.setVisible(true);
			}
		});
		BttnPrO.setBackground(new Color(230, 230, 250));
		BttnPrO.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrO);
		
		JButton BttnPrT = new JButton("T");
		BttnPrT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaT NewVentanaT= new VentanaT();
				NewVentanaT.setVisible(true);
			}
		});
		BttnPrT.setBackground(new Color(230, 230, 250));
		BttnPrT.setForeground(new Color(255, 140, 0));
		BttnPrT.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrT.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrT);
		
		JButton BttnPrEspacio = new JButton("");
		BttnPrEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt.setText(txt.getText()+" ");
			}
		});
		BttnPrEspacio.setBackground(new Color(148, 0, 211));
		BttnPrEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		contentPane.add(BttnPrEspacio);
		
		JButton BttnPrPunto = new JButton(".");
		BttnPrPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt.setText(txt.getText()+".");
			}
		});
		BttnPrPunto.setBackground(new Color(230, 230, 250));
		BttnPrPunto.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPrPunto);
		
		JButton BttnPrBorrar = new JButton("Borrar");
		BttnPrBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = txt.getText().length();
				if (i>0){
				if( (i>i)&&(txt.getText().charAt(i-1) == 'U') && (txt.getText().charAt(i-2) == 'Q') ){
					txt.setText(txt.getText().substring(0, i-2));
				}
				else{
					txt.setText(txt.getText().substring(0, i-1));
				}
				}
			}
		});
		BttnPrBorrar.setBackground(new Color(230, 230, 250));
		BttnPrBorrar.setFont(new Font("Arial", Font.PLAIN, 25));
		BttnPrBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPrBorrar);
		
		JButton BttnPrSI = new JButton("SI");
		BttnPrSI.setBackground(new Color(255, 165, 0));
		BttnPrSI.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnPrSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPrSI);
		
		JButton BttnPrNO = new JButton("NO");
		BttnPrNO.setBackground(new Color(0, 206, 209));
		BttnPrNO.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnPrNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPrNO);
		
		txt = new JTextArea();
		txt.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txt.setBackground(Color.LIGHT_GRAY);
		txt.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(txt);
		txt.setEditable(false);
		txt.setFont(new Font("Arial", Font.BOLD, 30));
		txt.setText(VentanaPrincipal.txt.getText());
	}
}