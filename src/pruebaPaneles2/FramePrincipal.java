package pruebaPaneles2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FramePrincipal extends JFrame {

	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	private JPanel contentPane;
	private static JPanel VentanaPrincipal;
	private static JPanel VentanaA;
	private static JPanel VentanaF;
	private static JPanel VentanaK;
	private static JPanel VentanaO;
	private static JPanel VentanaT;
	private JTextArea txt;
	private JTextArea txtA;
	private JTextArea txtF;
	private JTextArea txtK;
	private JTextArea txtO;
	private JTextArea txtT;
	private CardLayout card = new CardLayout();
	private static FramePrincipal instance = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,ancho,alto);
		setUndecorated(true); //OCULTA EL TITULO DE LA VENTANA Y LA BARRA DE TAREAS DE WINDOWS (QUEDA LA PANTALLA LIMPIA)
		setExtendedState(MAXIMIZED_BOTH); //MAXIMIZA LA PANTALLA
		contentPane = new JPanel();
		setContentPane(contentPane);
		VentanaPrincipalConstructor();
		VentanaAConstructor();
		VentanaFConstructor();
		VentanaKConstructor();
		VentanaOConstructor();
		VentanaTConstructor();
		contentPane.setLayout(card);
		contentPane.add(VentanaPrincipal,"VentanaPrincipal");
		contentPane.add(VentanaA,"VentanaA");
		contentPane.add(VentanaF,"VentanaF");
		contentPane.add(VentanaK,"VentanaK");
		contentPane.add(VentanaO,"VentanaO");
		contentPane.add(VentanaT,"VentanaT");	
		card.show(contentPane, "VentanaPrincipal");
		
	}
	
	 public void VentanaPrincipalConstructor(){
		 
			VentanaPrincipal = new JPanel();
			//VentanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
			VentanaPrincipal.setLayout(null);
			 
			JButton BttnPrA = new JButton("A");
			BttnPrA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					card.show(contentPane, "VentanaA");
					txtA.setText(txt.getText());
				}
			});
			BttnPrA.setBackground(new Color(230, 230, 250));
			BttnPrA.setForeground(new Color(0, 0, 128));
			BttnPrA.setFont(new Font("Arial", Font.PLAIN, 99));
			BttnPrA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
			VentanaPrincipal.add(BttnPrA);
			
			JButton BttnPrF = new JButton("F");
			BttnPrF.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					card.show(contentPane, "VentanaF");
					txtF.setText(txt.getText());
				}
			});
			BttnPrF.setBackground(new Color(230, 230, 250));
			BttnPrF.setForeground(new Color(255, 0, 0));
			BttnPrF.setFont(new Font("Arial", Font.PLAIN, 99));
			BttnPrF.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
			VentanaPrincipal.add(BttnPrF);
			
			JButton BttnPrK = new JButton("K");
			BttnPrK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					card.show(contentPane, "VentanaK");
					txtK.setText(txt.getText());
				}
			});
			BttnPrK.setBackground(new Color(230, 230, 250));
			BttnPrK.setForeground(new Color(34, 139, 34));
			BttnPrK.setFont(new Font("Arial", Font.PLAIN, 99));
			BttnPrK.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
			VentanaPrincipal.add(BttnPrK);
			
			JButton BttnPrO = new JButton("O");
			BttnPrO.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					card.show(contentPane, "VentanaO");
					txtO.setText(txt.getText());
				}
			});
			BttnPrO.setBackground(new Color(230, 230, 250));
			BttnPrO.setFont(new Font("Arial", Font.PLAIN, 99));
			BttnPrO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
			VentanaPrincipal.add(BttnPrO);
			
			JButton BttnPrT = new JButton("T");
			BttnPrT.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					card.show(contentPane, "VentanaT");
					txtT.setText(txt.getText());
				}
			});
			BttnPrT.setBackground(new Color(230, 230, 250));
			BttnPrT.setForeground(new Color(255, 140, 0));
			BttnPrT.setFont(new Font("Arial", Font.PLAIN, 99));
			BttnPrT.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
			VentanaPrincipal.add(BttnPrT);
			
			JButton BttnPrEspacio = new JButton("");
			BttnPrEspacio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txt.setText(txt.getText()+" ");
				}
			});
			BttnPrEspacio.setBackground(new Color(148, 0, 211));
			BttnPrEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
			VentanaPrincipal.add(BttnPrEspacio);
			
			JButton BttnPrPunto = new JButton(".");
			BttnPrPunto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txt.setText(txt.getText()+".");
				}
			});
			BttnPrPunto.setBackground(new Color(230, 230, 250));
			BttnPrPunto.setFont(new Font("Arial", Font.PLAIN, 99));
			BttnPrPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
			VentanaPrincipal.add(BttnPrPunto);
			
			JButton BttnPrBorrar = new JButton("Borrar");
			BttnPrBorrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txt.setText(txt.getText().substring(0,txt.getText().length()-1));
				}
			});
			BttnPrBorrar.setBackground(new Color(230, 230, 250));
			BttnPrBorrar.setFont(new Font("Arial", Font.PLAIN, 25));
			BttnPrBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
			VentanaPrincipal.add(BttnPrBorrar);
			
			JButton BttnPrSI = new JButton("SI");
			BttnPrSI.setBackground(new Color(255, 165, 0));
			BttnPrSI.setFont(new Font("Arial", Font.PLAIN, 30));
			BttnPrSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
			VentanaPrincipal.add(BttnPrSI);
			
			JButton BttnPrNO = new JButton("NO");
			BttnPrNO.setBackground(new Color(0, 206, 209));
			BttnPrNO.setFont(new Font("Arial", Font.PLAIN, 30));
			BttnPrNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
			VentanaPrincipal.add(BttnPrNO);
			
			
			txt = new JTextArea();
			txt.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			txt.setBackground(Color.LIGHT_GRAY);
			txt.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
			txt.setEditable(false);
			txt.setFont(new Font("Arial", Font.BOLD, 30));
			VentanaPrincipal.add(txt);
			txt.setText("HOLA");

		 }
		 public void VentanaAConstructor(){
			 
			 	VentanaA = new JPanel();
				VentanaA.setBorder(new EmptyBorder(5, 5, 5, 5));
				VentanaA.setLayout(null);
			 
				JButton BttnA = new JButton("Boton A");
				BttnA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText()+"A");
					}
				});
				BttnA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaA.add(BttnA);
				
				JButton BttnB = new JButton("Boton B");
				BttnB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText()+"B");
					}
				});
				BttnB.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaA.add(BttnB);
				
				JButton BttnC = new JButton("Boton C");
				BttnC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText()+"C");
					}
				});
				BttnC.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaA.add(BttnC);
				
				JButton BttnD = new JButton("Boton D");
				BttnD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText()+"D");
					}
				});
				BttnD.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaA.add(BttnD);
				
				JButton BttnE = new JButton("Boton E");
				BttnE.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText()+"E");
					}
				});
				BttnE.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaA.add(BttnE);
				
				JButton BttnEspacio = new JButton("Espacio");
				BttnA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
					}
				});
				BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaA.add(BttnEspacio);
				
				JButton BttnPunto = new JButton("Punto");
				BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaA.add(BttnPunto);
				
				JButton BttnBorrar = new JButton("Borrar");
				BttnA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtA.setText(txtA.getText().substring(0,txtA.getText().length()-1));
					}
				});
				BttnBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaA.add(BttnBorrar);
				
				JButton BttnSI = new JButton("SI");
				BttnSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaA.add(BttnSI);
				
				JButton BttnNO = new JButton("NO");
				BttnNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaA.add(BttnNO);
				
				txtA = new JTextArea();
				txtA.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				txtA.setBackground(Color.LIGHT_GRAY);
				txtA.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
				txtA.setEditable(false);
				txtA.setFont(new Font("Arial", Font.BOLD, 30));
				VentanaA.add(txtA);
			
		 }
		 public void VentanaFConstructor(){
			 
			 	VentanaF = new JPanel();
				VentanaF.setBorder(new EmptyBorder(5, 5, 5, 5));
				VentanaF.setLayout(null);
				
			 	JButton BttnF = new JButton("Boton F");
				BttnF.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtF.getText()+"F");
					}
				});
				BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaF.add(BttnF);
				
				JButton BttnG = new JButton("Boton G");
				BttnG.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtF.getText()+"G");
					}
				});
				BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaF.add(BttnG);
				
				JButton BttnH = new JButton("Boton H");
				BttnH.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText()+"H");
					}
				});
				BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaF.add(BttnH);
				
				JButton BttnI = new JButton("Boton I");
				BttnI.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText()+"I");
					}
				});
				BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaF.add(BttnI);
				
				JButton BttnJ = new JButton("Boton J");
				BttnJ.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText()+"J");
					}
				});
				BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaF.add(BttnJ);
				
				JButton BttnEspacio = new JButton("Espacio");
				BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaF.add(BttnEspacio);
				
				JButton BttnPunto = new JButton("Punto");
				BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaF.add(BttnPunto);
				
				JButton BttnBorrar = new JButton("Borrar");
				BttnBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaF.add(BttnBorrar);
				
				JButton BttnSI = new JButton("SI");
				BttnSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaF.add(BttnSI);
				
				JButton BttnNO = new JButton("NO");
				BttnNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaF.add(BttnNO);
		 
		 }

		 public void VentanaKConstructor(){
			 
			 	VentanaK = new JPanel();
				VentanaK.setBorder(new EmptyBorder(5, 5, 5, 5));
				VentanaK.setLayout(null);
				
			 	JButton BttnF = new JButton("Boton K");
				BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnF);
				
				JButton BttnG = new JButton("Boton L");
				BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnG);
				
				JButton BttnH = new JButton("Boton M");
				BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnH);
				
				JButton BttnI = new JButton("Boton N");
				BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnI);
				
				JButton BttnJ = new JButton("Boton Ñ");
				BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnJ);
				
				JButton BttnEspacio = new JButton("Espacio");
				BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaK.add(BttnEspacio);
				
				JButton BttnPunto = new JButton("Punto");
				BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaK.add(BttnPunto);
				
				JButton BttnBorrar = new JButton("Borrar");
				BttnBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaK.add(BttnBorrar);
				
				JButton BttnSI = new JButton("SI");
				BttnSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaK.add(BttnSI);
				
				JButton BttnNO = new JButton("NO");
				BttnNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaK.add(BttnNO);
		 
		 }
		 
		 public void VentanaOConstructor(){
			 
			 	VentanaO = new JPanel();
				VentanaO.setBorder(new EmptyBorder(5, 5, 5, 5));
				VentanaO.setLayout(null);
				
			 	JButton BttnF = new JButton("Boton O");
				BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnF);
				
				JButton BttnG = new JButton("Boton P");
				BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnG);
				
				JButton BttnH = new JButton("Boton QU");
				BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnH);
				
				JButton BttnI = new JButton("Boton R");
				BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnI);
				
				JButton BttnJ = new JButton("Boton S");
				BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnJ);
				
				JButton BttnEspacio = new JButton("Espacio");
				BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaO.add(BttnEspacio);
				
				JButton BttnPunto = new JButton("Punto");
				BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaO.add(BttnPunto);
				
				JButton BttnBorrar = new JButton("Borrar");
				BttnBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaO.add(BttnBorrar);
				
				JButton BttnSI = new JButton("SI");
				BttnSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaO.add(BttnSI);
				
				JButton BttnNO = new JButton("NO");
				BttnNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaO.add(BttnNO);
		 
		 }
		
		 public void VentanaTConstructor(){
			 
			 	VentanaT = new JPanel();
				VentanaT.setBorder(new EmptyBorder(5, 5, 5, 5));
				VentanaT.setLayout(null);
				
			 	JButton BttnF = new JButton("Boton T");
				BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnF);
				
				JButton BttnG = new JButton("Boton U");
				BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnG);
				
				JButton BttnH = new JButton("Boton V");
				BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnH);
				
				JButton BttnI = new JButton("Boton X");
				BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnI);
				
				JButton BttnJ = new JButton("Boton Y");
				BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnJ);
				
				JButton BttnEspacio = new JButton("Espacio");
				BttnEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaT.add(BttnEspacio);
				
				JButton BttnPunto = new JButton("Punto");
				BttnPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaT.add(BttnPunto);
				
				JButton BttnBorrar = new JButton("Borrar");
				BttnBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaT.add(BttnBorrar);
				
				JButton BttnSI = new JButton("SI");
				BttnSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaT.add(BttnSI);
				
				JButton BttnNO = new JButton("NO");
				BttnNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaT.add(BttnNO);
		 
		 }
}
