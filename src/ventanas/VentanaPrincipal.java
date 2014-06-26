package ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	public static JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {		
					VentanaPrincipal frame = new VentanaPrincipal();
					//frame.setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
					//frame.setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
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
				dispose();
			}
		});
		BttnPrA.setBackground(new Color(230, 230, 250));
		BttnPrA.setForeground(new Color(0, 0, 128));
		BttnPrA.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrA);
		
		JButton BttnPrF = new JButton("F");
		BttnPrF.setBackground(new Color(230, 230, 250));
		BttnPrF.setForeground(new Color(255, 0, 0));
		BttnPrF.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrF.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrF);
		
		JButton BttnPrK = new JButton("K");
		BttnPrK.setBackground(new Color(230, 230, 250));
		BttnPrK.setForeground(new Color(34, 139, 34));
		BttnPrK.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrK.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrK);
		
		JButton BttnPrO = new JButton("O");
		BttnPrO.setBackground(new Color(230, 230, 250));
		BttnPrO.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrO);
		
		JButton BttnPrT = new JButton("T");
		BttnPrT.setBackground(new Color(230, 230, 250));
		BttnPrT.setForeground(new Color(255, 140, 0));
		BttnPrT.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrT.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		contentPane.add(BttnPrT);
		
		JButton BttnPrEspacio = new JButton("");
		BttnPrEspacio.setBackground(new Color(148, 0, 211));
		BttnPrEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		contentPane.add(BttnPrEspacio);
		
		JButton BttnPrPunto = new JButton(".");
		BttnPrPunto.setBackground(new Color(230, 230, 250));
		BttnPrPunto.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnPrPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		contentPane.add(BttnPrPunto);
		
		JButton BttnPrBorrar = new JButton("Borrar");
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
		
		JPanel PanelTxt = new JPanel();
		PanelTxt.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PanelTxt.setBackground(new Color(192, 192, 192));
		PanelTxt.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		contentPane.add(PanelTxt);
		PanelTxt.setLayout(null);
		
		JLabel LblTxt1 = new JLabel("V");
		LblTxt1.setFont(new Font("Arial", Font.BOLD, 30));
		LblTxt1.setBounds(10, 10, (int)(this.ancho*0.5)-20,20);
		PanelTxt.add(LblTxt1);
		
		JLabel LblTxt2 = new JLabel("V");
		LblTxt2.setFont(new Font("Calibri", Font.BOLD, 30));
		LblTxt2.setBounds(10, 40, (int)(this.ancho*0.5)-20,20);
		PanelTxt.add(LblTxt2);
		
		JLabel LblTxt3 = new JLabel("V");
		LblTxt3.setFont(new Font("Calibri", Font.BOLD, 30));
		LblTxt3.setBounds(10, 70, (int)(this.ancho*0.5)-20,20);
		PanelTxt.add(LblTxt3);
	
	
	}
}