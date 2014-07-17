package Principal;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

@SuppressWarnings("serial")
public class FramePrincipal extends JFrame{

	private JPanel contentPane;
	private static JPanel VentanaPrincipal;
	private static JPanel VentanaA;
	private static JPanel VentanaF;
	private static JPanel VentanaK;
	private static JPanel VentanaO;
	private static JPanel VentanaT;
	private CardLayout card = new CardLayout();
	private Timer timer;
	private int milisegundos = 500;
	public static JTextArea txt;
	public static JTextArea txtA;
	public static JTextArea txtF;
	public static JTextArea txtK;
	public static JTextArea txtO;
	public static JTextArea txtT;
	
	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		});
	}

	public FramePrincipal(){
		
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
		VentanaPrincipal.setLayout(null);
		
		
		
		/* -- BOTON A (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrA = new JButton("ABCDE");
		BttnPrA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaA");
				txtA.setText(txt.getText());
			}
		});
		BttnPrA.setBackground(new Color(230, 230, 250));
		BttnPrA.setForeground(new Color(0, 0, 128));
		BttnPrA.setFont(new Font("Arial", Font.PLAIN, 65));
		BttnPrA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrA);
		
		
		
		/* -- BOTON F (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrF = new JButton("FGHIJ");
		BttnPrF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaF");
				txtF.setText(txt.getText());
			}
		});
		BttnPrF.setBackground(new Color(230, 230, 250));
		BttnPrF.setForeground(new Color(255, 0, 0));
		BttnPrF.setFont(new Font("Arial", Font.PLAIN, 65));
		BttnPrF.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrF);
		
		
		
		/* -- BOTON K (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrK = new JButton("KLMN\u00D1");
		BttnPrK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaK");
				txtK.setText(txt.getText());
			}
		});
		BttnPrK.setBackground(new Color(230, 230, 250));
		BttnPrK.setForeground(new Color(34, 139, 34));
		BttnPrK.setFont(new Font("Arial", Font.PLAIN, 65));
		BttnPrK.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrK);
		
		
		
		/* -- BOTON O (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrO = new JButton("OPQRS");
		BttnPrO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaO");
				txtO.setText(txt.getText());
			}
		});
		BttnPrO.setBackground(new Color(230, 230, 250));
		BttnPrO.setFont(new Font("Arial", Font.PLAIN, 64));
		BttnPrO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrO);
		
		
		
		/* -- BOTON T (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrT = new JButton("TUVXY");
		BttnPrT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaT");
				txtT.setText(txt.getText());
			}
		});
		BttnPrT.setBackground(new Color(230, 230, 250));
		BttnPrT.setForeground(new Color(255, 140, 0));
		BttnPrT.setFont(new Font("Arial", Font.PLAIN, 65));
		BttnPrT.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrT);
		
		
		
		/* -- BOTON ESPACIO (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrEspacio = new JButton("");
		BttnPrEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+" ");
			}
		});
		BttnPrEspacio.setBackground(new Color(148, 0, 211));
		BttnPrEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaPrincipal.add(BttnPrEspacio);
		
		
		
		/* -- BOTON PUNTO (VENTANA PRINCIPAL) -- */
		
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
		
		
		
		/* -- BOTON BORRAR (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrBorrar = new JButton("Borrar");
		BttnPrBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Borrar t = new Borrar(timer,'P');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnPrBorrar.setBackground(new Color(230, 230, 250));
		BttnPrBorrar.setFont(new Font("Arial", Font.PLAIN, 25));
		BttnPrBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaPrincipal.add(BttnPrBorrar);
		
		
		
		/* -- BOTON SI (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrSI = new JButton("SI");
		BttnPrSI.setBackground(new Color(255, 165, 0));
		BttnPrSI.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnPrSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaPrincipal.add(BttnPrSI);
		
		
		
		/* -- BOTON NO (VENTANA PRINCIPAL) -- */
		
		JButton BttnPrNO = new JButton("NO");
		BttnPrNO.setBackground(new Color(0, 206, 209));
		BttnPrNO.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnPrNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaPrincipal.add(BttnPrNO);
		

		
		
		/* -- AREA DE TEXTO (VENTANA PRINCIPAL) -- */
		
		JScrollPane scrollPanePr = new JScrollPane(txt);
		scrollPanePr.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPanePr.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		VentanaPrincipal.add(scrollPanePr);
		txt = new JTextArea();
		txt.setLineWrap(true);
		txt.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txt.setBackground(Color.LIGHT_GRAY);
		txt.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		txt.setEditable(false);
		txt.setFont(new Font("Arial", Font.BOLD, 30));
		scrollPanePr.setViewportView(txt);
		

		
	}
	 
	 
	 
	public void VentanaAConstructor(){
		 
		VentanaA = new JPanel();
		VentanaA.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaA.setLayout(null);
	 
		
		
		/* -- BOTON LETRA A (VENTANA A) -- */
		
		JButton BttnA = new JButton("A");
		BttnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
					txt.setText(txtA.getText()+"A");
			}
		});
		BttnA.setBackground(new Color(230, 230, 250));
		BttnA.setForeground(new Color(0, 0, 128));
		BttnA.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnA);
		
		
		
		/* -- BOTON LETRA B (VENTANA A) -- */
		
		JButton BttnB = new JButton("B");
		BttnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"B");
		}
		});
		BttnB.setBackground(new Color(230, 230, 250));
		BttnB.setForeground(new Color(0, 0, 128));
		BttnB.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnB.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnB);
		
		
		
		/* -- BOTON LETRA C (VENTANA A) -- */
		
		JButton BttnC = new JButton("C");
		BttnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"C");
			}
		});
		BttnC.setBackground(new Color(230, 230, 250));
		BttnC.setForeground(new Color(0, 0, 128));
		BttnC.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnC.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnC);
		
		
		
		/* -- BOTON LETRA D (VENTANA A) -- */
		
		JButton BttnD = new JButton("D");
		BttnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"D");
			}
		});
		BttnD.setBackground(new Color(230, 230, 250));
		BttnD.setForeground(new Color(0, 0, 128));
		BttnD.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnD.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnD);
		
		
		
		/* -- BOTON LETRA E (VENTANA A) -- */
		
		JButton BttnE = new JButton("E");
		BttnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"E");
			}
		});
		BttnE.setBackground(new Color(230, 230, 250));
		BttnE.setForeground(new Color(0, 0, 128));
		BttnE.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnE.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnE);
		
		
		
		/* -- BOTON ESPACIO (VENTANA A) -- */
		
		JButton BttnAEspacio = new JButton("");
		BttnAEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText());
			}
		});
		BttnAEspacio.setBackground(new Color(148, 0, 211));
		BttnAEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaA.add(BttnAEspacio);
		
		
		
		/* -- BOTON PUNTO (VENTANA A) -- */
		
		JButton BttnAPunto = new JButton(".");
		BttnAPunto.setBackground(new Color(230, 230, 250));
		BttnAPunto.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnAPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaA.add(BttnAPunto);
		
		
		
		/* -- BOTON BORRAR (VENTANA A) -- */
		
		JButton BttnABorrar = new JButton("Borrar");
		BttnABorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Borrar t = new Borrar(timer,'A');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnABorrar.setBackground(new Color(230, 230, 250));
		BttnABorrar.setFont(new Font("Arial", Font.PLAIN, 25));
		BttnABorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaA.add(BttnABorrar);
		
		
		
		/* -- BOTON SI (VENTANA A) -- */
		
		JButton BttnASI = new JButton("SI");
		BttnASI.setBackground(new Color(255, 165, 0));
		BttnASI.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnASI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaA.add(BttnASI);
		
		
		
		/* -- BOTON NO (VENTANA A) -- */
		
		JButton BttnANO = new JButton("NO");
		BttnANO.setBackground(new Color(0, 206, 209));
		BttnANO.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnANO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaA.add(BttnANO);
		
		
		
		/* -- AREA DE TEXTO (VENTANA A) -- */
		
		JScrollPane scrollPaneA = new JScrollPane(txtA);
		scrollPaneA.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneA.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		VentanaA.add(scrollPaneA);
		txtA = new JTextArea();
		txtA.setLineWrap(true);
		txtA.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtA.setBackground(Color.LIGHT_GRAY);
		txtA.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		txtA.setEditable(false);
		txtA.setFont(new Font("Arial", Font.BOLD, 30));
		scrollPaneA.setViewportView(txtA);
		
	}
	
	
	
	public void VentanaFConstructor(){
		
	 	VentanaF = new JPanel();
		VentanaF.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaF.setLayout(null);
		
		
		
		/* -- BOTON LETRA F (VENTANA F) -- */
		
	 	JButton BttnF = new JButton("F");
		BttnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"F");
			}
		});
		BttnF.setBackground(new Color(230, 230, 250));
		BttnF.setForeground(new Color(255, 0, 0));
		BttnF.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnF);
		
		
		
		/* -- BOTON LETRA G (VENTANA F) -- */
		
		JButton BttnG = new JButton("G");
		BttnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"G");
			}
		});
		BttnG.setBackground(new Color(230, 230, 250));
		BttnG.setForeground(new Color(255, 0, 0));
		BttnG.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnG);
		
		
		
		/* -- BOTON LETRA H (VENTANA F) -- */
		
		JButton BttnH = new JButton("H");
		BttnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"H");
			}
		});
		BttnH.setBackground(new Color(230, 230, 250));
		BttnH.setForeground(new Color(255, 0, 0));
		BttnH.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnH);
		
		
		
		/* -- BOTON LETRA I (VENTANA F) -- */
		
		JButton BttnI = new JButton("I");
		BttnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"I");
			}
		});
		BttnI.setBackground(new Color(230, 230, 250));
		BttnI.setForeground(new Color(255, 0, 0));
		BttnI.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnI);
		
		
		
		/* -- BOTON LETRA J (VENTANA F) -- */
		
		JButton BttnJ = new JButton("J");
		BttnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"J");
			}
		});
		BttnJ.setBackground(new Color(230, 230, 250));
		BttnJ.setForeground(new Color(255, 0, 0));
		BttnJ.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnJ);
		
		
		
		/* -- BOTON ESPACIO (VENTANA F) -- */
		
		JButton BttnFEspacio = new JButton("");
		BttnFEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText());
			}
		});
		BttnFEspacio.setBackground(new Color(148, 0, 211));
		BttnFEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaF.add(BttnFEspacio);
		
		
		
		/* -- BOTON PUNTO (VENTANA F) -- */
		
		JButton BttnFPunto = new JButton(".");
		BttnFPunto.setBackground(new Color(230, 230, 250));
		BttnFPunto.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnFPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaF.add(BttnFPunto);
		
		
		
		/* -- BOTON BORRAR (VENTANA F) -- */
		
		JButton BttnFBorrar = new JButton("Borrar");
		BttnFBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Borrar t = new Borrar(timer,'F');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnFBorrar.setBackground(new Color(230, 230, 250));
		BttnFBorrar.setFont(new Font("Arial", Font.PLAIN, 25));
		BttnFBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaF.add(BttnFBorrar);
		
		
		
		/* -- BOTON SI (VENTANA F) -- */
		
		JButton BttnFSI = new JButton("SI");
		BttnFSI.setBackground(new Color(255, 165, 0));
		BttnFSI.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnFSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaF.add(BttnFSI);
		
		
		
		/* -- BOTON NO (VENTANA F) -- */
		
		JButton BttnFNO = new JButton("NO");
		BttnFNO.setBackground(new Color(0, 206, 209));
		BttnFNO.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnFNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaF.add(BttnFNO);
		
		
		
		/* -- AREA DE TEXTO (VENTANA F) -- */
		JScrollPane scrollPaneF = new JScrollPane(txtF);
		scrollPaneF.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneF.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		VentanaF.add(scrollPaneF);
		txtF = new JTextArea();
		txtF.setLineWrap(true);
		txtF.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtF.setBackground(Color.LIGHT_GRAY);
		txtF.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		txtF.setEditable(false);
		txtF.setFont(new Font("Arial", Font.BOLD, 30));
		scrollPaneF.setViewportView(txtF);
		
	}
	
	
	
	public void VentanaKConstructor(){
		
	 	VentanaK = new JPanel();
		VentanaK.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaK.setLayout(null);
		
		
		
		/* -- BOTON LETRA K (VENTANA K) -- */
		
	 	JButton BttnK = new JButton("K");
		BttnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"K");
			}
		});
		BttnK.setBackground(new Color(230, 230, 250));
		BttnK.setForeground(new Color(34, 139, 34));
		BttnK.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnK.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(BttnK);
		
		
		
		/* -- BOTON LETRA L (VENTANA K) -- */
		
		JButton BttnL = new JButton("L");
		BttnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"L");
			}
		});
		BttnL.setBackground(new Color(230, 230, 250));
		BttnL.setForeground(new Color(34, 139, 34));
		BttnL.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnL.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(BttnL);
		
		
		
		/* -- BOTON LETRA M (VENTANA K) -- */
		
		JButton BttnM = new JButton("M");
		BttnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"M");
			}
		});
		BttnM.setBackground(new Color(230, 230, 250));
		BttnM.setForeground(new Color(34, 139, 34));
		BttnM.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnM.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(BttnM);
		
		
		
		/* -- BOTON LETRA N (VENTANA K) -- */
		
		JButton BttnN = new JButton("N");
		BttnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"N");
			}
		});
		BttnN.setBackground(new Color(230, 230, 250));
		BttnN.setForeground(new Color(34, 139, 34));
		BttnN.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnN.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(BttnN);
		
		
		
		/* -- BOTON LETRA — (VENTANA K) -- */
		
		JButton Bttn— = new JButton("—");
		Bttn—.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"—");
			}
		});
		Bttn—.setBackground(new Color(230, 230, 250));
		Bttn—.setForeground(new Color(34, 139, 34));
		Bttn—.setFont(new Font("Arial", Font.PLAIN, 99));
		Bttn—.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(Bttn—);
		
		
		
		/* -- BOTON ESPACIO (VENTANA K) -- */
		
		JButton BttnKEspacio = new JButton("");
		BttnKEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText());
			}
		});
		BttnKEspacio.setBackground(new Color(148, 0, 211));
		BttnKEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaK.add(BttnKEspacio);
		
		
		
		/* -- BOTON PUNTO (VENTANA K) -- */
		
		JButton BttnKPunto = new JButton(".");
		BttnKPunto.setBackground(new Color(230, 230, 250));
		BttnKPunto.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnKPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaK.add(BttnKPunto);
		
		
		
		/* -- BOTON BORRAR (VENTANA K) -- */
		
		JButton BttnKBorrar = new JButton("Borrar");
		BttnKBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Borrar t = new Borrar(timer,'K');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnKBorrar.setBackground(new Color(230, 230, 250));
		BttnKBorrar.setFont(new Font("Arial", Font.PLAIN, 25));
		BttnKBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaK.add(BttnKBorrar);
		
		
		
		/* -- BOTON SI (VENTANA K) -- */
		
		JButton BttnKSI = new JButton("SI");
		BttnKSI.setBackground(new Color(255, 165, 0));
		BttnKSI.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnKSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaK.add(BttnKSI);
		
		
		
		/* -- BOTON NO (VENTANA K) -- */
		
		JButton BttnKNO = new JButton("NO");
		BttnKNO.setBackground(new Color(0, 206, 209));
		BttnKNO.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnKNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaK.add(BttnKNO);
		
		
		
		/* -- AREA DE TEXTO (VENTANA K) -- */
		JScrollPane scrollPaneK = new JScrollPane(txtK);
		scrollPaneK.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneK.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		VentanaK.add(scrollPaneK);
		txtK = new JTextArea();
		txtK.setLineWrap(true);
		txtK.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtK.setBackground(Color.LIGHT_GRAY);
		txtK.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		txtK.setEditable(false);
		txtK.setFont(new Font("Arial", Font.BOLD, 30));
		scrollPaneK.setViewportView(txtK);
		
	}
	 
	
	
	public void VentanaOConstructor(){
		
	 	VentanaO = new JPanel();
		VentanaO.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaO.setLayout(null);
		
		
		
		/* -- BOTON LETRA O (VENTANA O) -- */
		
	 	JButton BttnO = new JButton("O");
	 	BttnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"O");
			}
		});
	 	BttnO.setBackground(new Color(230, 230, 250));
		BttnO.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnO);
		
		
		
		/* -- BOTON LETRA P (VENTANA O) -- */
		
		JButton BttnP = new JButton("P");
		BttnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"P");
			}
		});
		BttnP.setBackground(new Color(230, 230, 250));
		BttnP.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnP.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnP);
		
		
		
		/* -- BOTON LETRA QU (VENTANA O) -- */
		
		JButton BttnQU = new JButton("QU");
		BttnQU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"QU");
			}
		});
		BttnQU.setBackground(new Color(230, 230, 250));
		BttnQU.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnQU.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnQU);
		
		
		
		/* -- BOTON LETRA R (VENTANA O) -- */
		
		JButton BttnR = new JButton("R");
		BttnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"R");
			}
		});
		BttnR.setBackground(new Color(230, 230, 250));
		BttnR.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnR.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnR);
		
		
		
		/* -- BOTON LETRA S (VENTANA O) -- */
		
		JButton BttnS = new JButton("S");
		BttnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"S");
			}
		});
		BttnS.setBackground(new Color(230, 230, 250));
		BttnS.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnS.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnS);
		
		
		
		/* -- BOTON ESPACIO (VENTANA O) -- */
		
		JButton BttnOEspacio = new JButton("");
		BttnOEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText());
			}
		});
		BttnOEspacio.setBackground(new Color(148, 0, 211));
		BttnOEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaO.add(BttnOEspacio);
		
		
		
		/* -- BOTON PUNTO (VENTANA O) -- */
			
		JButton BttnOPunto = new JButton(".");
		BttnOPunto.setBackground(new Color(230, 230, 250));
		BttnOPunto.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnOPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaO.add(BttnOPunto);
		
		
		
		/* -- BOTON BORRAR (VENTANA O) -- */
		
		JButton BttnOBorrar = new JButton("Borrar");
		BttnOBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Borrar t = new Borrar(timer,'O');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnOBorrar.setBackground(new Color(230, 230, 250));
		BttnOBorrar.setFont(new Font("Arial", Font.PLAIN, 25));
		BttnOBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaO.add(BttnOBorrar);
		
		
		
		/* -- BOTON SI (VENTANA O) -- */
		
		JButton BttnOSI = new JButton("SI");
		BttnOSI.setBackground(new Color(255, 165, 0));
		BttnOSI.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnOSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaO.add(BttnOSI);
		
		
		
		/* -- BOTON NO (VENTANA O) -- */
		
		JButton BttnONO = new JButton("NO");
		BttnONO.setBackground(new Color(0, 206, 209));
		BttnONO.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnONO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaO.add(BttnONO);
		
		
		
		/* -- AREA DE TEXTO (VENTANA O) -- */
		JScrollPane scrollPaneO = new JScrollPane(txtO);
		scrollPaneO.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneO.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		VentanaO.add(scrollPaneO);
		txtO = new JTextArea();
		txtO.setLineWrap(true);
		txtO.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtO.setBackground(Color.LIGHT_GRAY);
		txtO.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		txtO.setEditable(false);
		txtO.setFont(new Font("Arial", Font.BOLD, 30));
		scrollPaneO.setViewportView(txtO);
		
	}
	
	
	
	public void VentanaTConstructor(){
		
	 	VentanaT = new JPanel();
	 	VentanaT.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaT.setLayout(null);
		
		
		
		/* -- BOTON LETRA T (VENTANA T) -- */
		
		JButton BttnT = new JButton("T");
		BttnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"T");
			}
		});
		BttnT.setBackground(new Color(230, 230, 250));
		BttnT.setForeground(new Color(255, 140, 0));
		BttnT.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnT.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnT);
		
		
		
		/* -- BOTON LETRA U (VENTANA T) -- */
		
		JButton BttnU = new JButton("U");
		BttnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"U");
			}
		});
		BttnU.setBackground(new Color(230, 230, 250));
		BttnU.setForeground(new Color(255, 140, 0));
		BttnU.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnU.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnU);
		
		
		
		/* -- BOTON LETRA V (VENTANA T) -- */
		
		JButton BttnV = new JButton("V");
		BttnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"V");
			}
		});
		BttnV.setBackground(new Color(230, 230, 250));
		BttnV.setForeground(new Color(255, 140, 0));
		BttnV.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnV.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnV);
		
		
		
		/* -- BOTON LETRA X (VENTANA T) -- */
		
		JButton BttnX = new JButton("X");
		BttnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"X");
			}
		});
		BttnX.setBackground(new Color(230, 230, 250));
		BttnX.setForeground(new Color(255, 140, 0));
		BttnX.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnX.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnX);
		
		
		
		/* -- BOTON LETRA Y (VENTANA T) -- */
		
		JButton BttnY = new JButton("Y");
		BttnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"Y");
			}
		});
		BttnY.setBackground(new Color(230, 230, 250));
		BttnY.setForeground(new Color(255, 140, 0));
		BttnY.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnY.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnY);
		
		
		
		/* -- BOTON ESPACIO (VENTANA T) -- */
		
		JButton BttnTEspacio = new JButton("");
		BttnTEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText());
			}
		});
		BttnTEspacio.setBackground(new Color(148, 0, 211));
		BttnTEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaT.add(BttnTEspacio);
		
		
		
		/* -- BOTON PUNTO (VENTANA T) -- */
		
		JButton BttnTPunto = new JButton(".");
		BttnTPunto.setBackground(new Color(230, 230, 250));
		BttnTPunto.setFont(new Font("Arial", Font.PLAIN, 99));
		BttnTPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaT.add(BttnTPunto);
		
		
		
		/* -- BOTON BORRAR (VENTANA T) -- */
		
		JButton BttnTBorrar = new JButton("Borrar");
		BttnTBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Borrar t = new Borrar(timer,'T');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnTBorrar.setBackground(new Color(230, 230, 250));
		BttnTBorrar.setFont(new Font("Arial", Font.PLAIN, 25));
		BttnTBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaT.add(BttnTBorrar);
		
		
		
		/* -- BOTON SI (VENTANA T) -- */
		
		JButton BttnTSI = new JButton("SI");
		BttnTSI.setBackground(new Color(255, 165, 0));
		BttnTSI.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnTSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaT.add(BttnTSI);
		
		
		
		/* -- BOTON NO (VENTANA T) -- */
		
		JButton BttnTNO = new JButton("NO");
		BttnTNO.setBackground(new Color(0, 206, 209));
		BttnTNO.setFont(new Font("Arial", Font.PLAIN, 30));
		BttnTNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaT.add(BttnTNO);
		
		
		
		/* -- AREA DE TEXTO (VENTANA T) -- */
		JScrollPane scrollPaneT = new JScrollPane(txtT);
		scrollPaneT.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneT.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		VentanaT.add(scrollPaneT);
		txtT = new JTextArea();
		txtT.setLineWrap(true);
		txtT.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtT.setBackground(Color.LIGHT_GRAY);
		txtT.setBounds((int)(this.ancho*0.25),(int)(this.alto*0.879),(int)(this.ancho*0.5),(int)(this.alto*0.12));
		txtT.setEditable(false);
		txtT.setFont(new Font("Arial", Font.BOLD, 30));
		scrollPaneT.setViewportView(txtT);
		
		
	}
}
