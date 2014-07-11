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
					int i= txt.getText().length();
					if (i>0){
						if ((i>1) && (txt.getText().charAt(i-2)=='Q') && (txt.getText().charAt(i-1)=='U'))
							txt.setText(txt.getText().substring(0, i-2));
						else
							txt.setText(txt.getText().substring(0, i-1));
							
									
					}
					
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
				
				JButton BttnAEspacio = new JButton("Espacio");
				BttnAEspacio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtA.getText());
					}
				});
				BttnAEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaA.add(BttnAEspacio);
				
				JButton BttnAPunto = new JButton("Punto");
				BttnAPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaA.add(BttnAPunto);
				
				JButton BttnABorrar = new JButton("Borrar");
				BttnABorrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int i= txtA.getText().length();
						if (i>0){
							if ((i>1) && (txtA.getText().charAt(i-2)=='Q') && (txtA.getText().charAt(i-1)=='U'))
								txtA.setText(txtA.getText().substring(0, i-2));
							else
								txtA.setText(txtA.getText().substring(0, i-1));
								
										
						}
						
					}
				});
				BttnABorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaA.add(BttnABorrar);
				
				JButton BttnASI = new JButton("SI");
				BttnASI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaA.add(BttnASI);
				
				JButton BttnANO = new JButton("NO");
				BttnANO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaA.add(BttnANO);
				
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
				
				JButton BttnFEspacio = new JButton("Espacio");
				BttnFEspacio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtF.getText());
					}
				});
				BttnFEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaF.add(BttnFEspacio);
				
				JButton BttnFPunto = new JButton("Punto");
				BttnFPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaF.add(BttnFPunto);
				
				JButton BttnFBorrar = new JButton("Borrar");
				BttnFBorrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int i= txtF.getText().length();
						if (i>0){
							if ((i>1) && (txtF.getText().charAt(i-2)=='Q') && (txtF.getText().charAt(i-1)=='U'))
								txtF.setText(txtF.getText().substring(0, i-2));
							else
								txtF.setText(txtF.getText().substring(0, i-1));
								
										
						}
						
					}
				});
				BttnFBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaF.add(BttnFBorrar);
				
				JButton BttnFSI = new JButton("SI");
				BttnFSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaF.add(BttnFSI);
				
				JButton BttnFNO = new JButton("NO");
				BttnFNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaF.add(BttnFNO);
				
				txtF = new JTextArea();
				txtF.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				txtF.setBackground(Color.LIGHT_GRAY);
				txtF.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
				txtF.setEditable(false);
				txtF.setFont(new Font("Arial", Font.BOLD, 30));
				VentanaF.add(txtF);
		 
		 }

		 public void VentanaKConstructor(){
			 
			 	VentanaK = new JPanel();
				VentanaK.setBorder(new EmptyBorder(5, 5, 5, 5));
				VentanaK.setLayout(null);
				
			 	JButton BttnK = new JButton("Boton K");
				BttnK.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtK.getText()+"K");
					}
				});
				BttnK.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnK);
				
				JButton BttnL = new JButton("Boton L");
				BttnL.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtK.getText()+"L");
					}
				});
				BttnL.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnL);
				
				JButton BttnM = new JButton("Boton M");
				BttnM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtK.getText()+"M");
					}
				});
				BttnM.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnM);
				
				JButton BttnN = new JButton("Boton N");
				BttnN.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtK.getText()+"N");
					}
				});
				BttnN.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnN);
				
				JButton BttnÑ = new JButton("Boton Ñ");
				BttnÑ.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtK.getText()+"Ñ");
					}
				});
				BttnÑ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaK.add(BttnÑ);
				
				JButton BttnKEspacio = new JButton("Espacio");
				BttnKEspacio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtK.getText());
					}
				});
				BttnKEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaK.add(BttnKEspacio);
				
				JButton BttnKPunto = new JButton("Punto");
				BttnKPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaK.add(BttnKPunto);
				
				JButton BttnKBorrar = new JButton("Borrar");
				BttnKBorrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int i= txtK.getText().length();
						if (i>0){
							if ((i>1) && (txtK.getText().charAt(i-2)=='Q') && (txtK.getText().charAt(i-1)=='U'))
								txtK.setText(txtK.getText().substring(0, i-2));
							else
								txtK.setText(txtK.getText().substring(0, i-1));
								
										
						}
						
					}
				});
				BttnKBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaK.add(BttnKBorrar);
				
				JButton BttnKSI = new JButton("SI");
				BttnKSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaK.add(BttnKSI);
				
				JButton BttnKNO = new JButton("NO");
				BttnKNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaK.add(BttnKNO);
				
				txtK = new JTextArea();
				txtK.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				txtK.setBackground(Color.LIGHT_GRAY);
				txtK.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
				txtK.setEditable(false);
				txtK.setFont(new Font("Arial", Font.BOLD, 30));
				VentanaK.add(txtK);
		 }
		 
		 public void VentanaOConstructor(){
			 
			 	VentanaO = new JPanel();
				VentanaO.setBorder(new EmptyBorder(5, 5, 5, 5));
				VentanaO.setLayout(null);
				
			 	JButton BttnO = new JButton("Boton O");
			 	BttnO.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtO.getText()+"O");
					}
				});
				BttnO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnO);
				
				JButton BttnP = new JButton("Boton P");
			 	BttnP.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtO.getText()+"P");
					}
				});
				BttnP.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnP);
				
				JButton BttnQU = new JButton("Boton QU");
			 	BttnQU.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtO.getText()+"QU");
					}
				});
				BttnQU.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnQU);
				
				JButton BttnR = new JButton("Boton R");
			 	BttnR.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtO.getText()+"R");
					}
				});
				BttnR.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnR);
				
				JButton BttnS = new JButton("Boton S");
			 	BttnS.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtO.getText()+"S");
					}
				});
				BttnS.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaO.add(BttnS);
				
				JButton BttnOEspacio = new JButton("Espacio");
			 	BttnOEspacio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtO.getText());
					}
				});
				BttnOEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaO.add(BttnOEspacio);
				
				JButton BttnOPunto = new JButton("Punto");
				BttnOPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaO.add(BttnOPunto);
				
				JButton BttnOBorrar = new JButton("Borrar");
			 	BttnOBorrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int i= txtO.getText().length();
						if (i>0){
							if ((i>1) && (txtO.getText().charAt(i-2)=='Q') && (txtO.getText().charAt(i-1)=='U'))
								txtO.setText(txtO.getText().substring(0, i-2));
							else
								txtO.setText(txtO.getText().substring(0, i-1));
								
										
						}
						
					}
				});
				BttnOBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaO.add(BttnOBorrar);
				
				JButton BttnOSI = new JButton("SI");
				BttnOSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaO.add(BttnOSI);
				
				JButton BttnONO = new JButton("NO");
				BttnONO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaO.add(BttnONO);
		 
				txtO = new JTextArea();
				txtO.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				txtO.setBackground(Color.LIGHT_GRAY);
				txtO.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
				txtO.setEditable(false);
				txtO.setFont(new Font("Arial", Font.BOLD, 30));
				VentanaO.add(txtO);
		 }
		
		 public void VentanaTConstructor(){
			 
			 	VentanaT = new JPanel();
				VentanaT.setBorder(new EmptyBorder(5, 5, 5, 5));
				VentanaT.setLayout(null);
				
			 	JButton BttnT = new JButton("Boton T");
			 	BttnT.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtT.getText()+"T");
					}
				});
				BttnT.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnT);
				
				JButton BttnU = new JButton("Boton U");
				BttnU.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtT.getText()+"U");
					}
				});
				BttnU.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnU);
				
				JButton BttnV = new JButton("Boton V");
				BttnV.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtT.getText()+"V");
					}
				});
				BttnV.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnV);
				
				JButton BttnX = new JButton("Boton X");
				BttnX.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtT.getText()+"X");
					}
				});
				BttnX.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnX);
				
				JButton BttnY = new JButton("Boton Y");
				BttnY.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtT.getText()+"Y");
					}
				});
				BttnY.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
				VentanaT.add(BttnY);
				
				JButton BttnTEspacio = new JButton("Espacio");
				BttnTEspacio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						card.show(contentPane, "VentanaPrincipal");
						txt.setText(txtT.getText());
					}
				});
				BttnTEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
				VentanaT.add(BttnTEspacio);
				
				JButton BttnTPunto = new JButton("Punto");
				BttnTPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaT.add(BttnTPunto);
				
				JButton BttnTBorrar = new JButton("Borrar");
				BttnTBorrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int i= txtT.getText().length();
						if (i>0){
							if ((i>1) && (txtT.getText().charAt(i-2)=='Q') && (txtT.getText().charAt(i-1)=='U'))
								txtT.setText(txtT.getText().substring(0, i-2));
							else
								txtT.setText(txtT.getText().substring(0, i-1));
								
										
						}
						
					}
				});
				BttnTBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaT.add(BttnTBorrar);
				
				JButton BttnTSI = new JButton("SI");
				BttnTSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaT.add(BttnTSI);
				
				JButton BttnTNO = new JButton("NO");
				BttnTNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
				VentanaT.add(BttnTNO);
				
				txtT = new JTextArea();
				txtT.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				txtT.setBackground(Color.LIGHT_GRAY);
				txtT.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
				txtT.setEditable(false);
				txtT.setFont(new Font("Arial", Font.BOLD, 30));
				VentanaT.add(txtT);
		 
		 }
}
