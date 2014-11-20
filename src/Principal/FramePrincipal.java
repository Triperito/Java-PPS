package Principal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
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
import javax.swing.UIManager;

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
	public static Timer timerClose;
	private int milisegundos = 500;
	public static JTextArea txt;
	public static JTextArea txtA;
	public static JTextArea txtF;
	public static JTextArea txtK;
	public static JTextArea txtO;
	public static JTextArea txtT;
	public static boolean okCerrar=false;
	
	public int alto  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	
	ImageIcon Cerrar = new ImageIcon(FramePrincipal.class.getResource("/Graficos/ImagenFondo.png"));
	ImageIcon CerrarMod = new ImageIcon(Cerrar.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTONES (VENTANA PRINCIPAL) -- */
	ImageIcon APrincipal = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnPrA.png"));
	ImageIcon APrincipalMod = new ImageIcon(APrincipal.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon APrincipalCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnclickeadoPrA.png"));
	ImageIcon APrincipalModCliked = new ImageIcon(APrincipalCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon FPrincipal = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnPrF.png"));
	ImageIcon FPrincipalMod = new ImageIcon(FPrincipal.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon FPrincipalCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnclickeadoPrF.png"));
	ImageIcon FPrincipalModCliked = new ImageIcon(FPrincipalCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon KPrincipal = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnPrK.png"));
	ImageIcon KPrincipalMod = new ImageIcon(KPrincipal.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon KPrincipalCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoPrK.png"));
	ImageIcon KPrincipalModCliked = new ImageIcon(KPrincipalCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon OPrincipal = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnPrO.png"));
	ImageIcon OPrincipalMod = new ImageIcon(OPrincipal.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon OPrincipalCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoPrO.png"));
	ImageIcon OPrincipalModCliked = new ImageIcon(OPrincipalCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon TPrincipal = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnPrT.png"));
	ImageIcon TPrincipalMod = new ImageIcon(TPrincipal.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon TPrincipalCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoPrT.png"));
	ImageIcon TPrincipalModCliked = new ImageIcon(TPrincipalCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTONES VENTANA A  -- */
	ImageIcon BotonA = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnA.png"));
	ImageIcon BotonAMod = new ImageIcon(BotonA.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonACliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoA.png"));
	ImageIcon BotonAModCliked = new ImageIcon(BotonACliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonB = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnB.png"));
	ImageIcon BotonBMod = new ImageIcon(BotonB.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonBCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoB.png"));
	ImageIcon BotonBModCliked = new ImageIcon(BotonBCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonC = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnC.png"));
	ImageIcon BotonCMod = new ImageIcon(BotonC.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonCCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoC.png"));
	ImageIcon BotonCModCliked = new ImageIcon(BotonCCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonD = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnD.png"));
	ImageIcon BotonDMod = new ImageIcon(BotonD.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonDCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoD.png"));
	ImageIcon BotonDModCliked = new ImageIcon(BotonDCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonE = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnE.png"));
	ImageIcon BotonEMod = new ImageIcon(BotonE.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonECliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoE.png"));
	ImageIcon BotonEModCliked = new ImageIcon(BotonECliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTONES VENTANA F  -- */
	ImageIcon BotonF = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnF.png"));
	ImageIcon BotonFMod = new ImageIcon(BotonF.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonFCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoF.png"));
	ImageIcon BotonFModCliked = new ImageIcon(BotonFCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonG = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnG.png"));
	ImageIcon BotonGMod = new ImageIcon(BotonG.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonGCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoG.png"));
	ImageIcon BotonGModCliked = new ImageIcon(BotonGCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonH = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnH.png"));
	ImageIcon BotonHMod = new ImageIcon(BotonH.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonHCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoH.png"));
	ImageIcon BotonHModCliked = new ImageIcon(BotonHCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonI = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnI.png"));
	ImageIcon BotonIMod = new ImageIcon(BotonI.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonICliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoI.png"));
	ImageIcon BotonIModCliked = new ImageIcon(BotonICliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonJ = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnJ.png"));
	ImageIcon BotonJMod = new ImageIcon(BotonJ.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonJCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoJ.png"));
	ImageIcon BotonJModCliked = new ImageIcon(BotonJCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTONES VENTANA K  -- */
	ImageIcon BotonK = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnK.png"));
	ImageIcon BotonKMod = new ImageIcon(BotonK.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonKCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoK.png"));
	ImageIcon BotonKModCliked = new ImageIcon(BotonKCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonL = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnL.png"));
	ImageIcon BotonLMod = new ImageIcon(BotonL.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonLCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoL.png"));
	ImageIcon BotonLModCliked = new ImageIcon(BotonLCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonM = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnM.png"));
	ImageIcon BotonMMod = new ImageIcon(BotonM.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonMCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoM.png"));
	ImageIcon BotonMModCliked = new ImageIcon(BotonMCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonN = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnN.png"));
	ImageIcon BotonNMod = new ImageIcon(BotonN.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonNCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoN.png"));
	ImageIcon BotonNModCliked = new ImageIcon(BotonNCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon Boton� = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttn�.png"));
	ImageIcon Boton�Mod = new ImageIcon(Boton�.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon Boton�Cliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeado�.png"));
	ImageIcon Boton�ModCliked = new ImageIcon(Boton�Cliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTONES VENTANA O  -- */
	ImageIcon BotonO = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnO.png"));
	ImageIcon BotonOMod = new ImageIcon(BotonO.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonOCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoO.png"));
	ImageIcon BotonOModCliked = new ImageIcon(BotonOCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonP = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnP.png"));
	ImageIcon BotonPMod = new ImageIcon(BotonP.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonPCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoP.png"));
	ImageIcon BotonPModCliked = new ImageIcon(BotonPCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonQU = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnQU.png"));
	ImageIcon BotonQUMod = new ImageIcon(BotonQU.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonQUCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoQU.png"));
	ImageIcon BotonQUModCliked = new ImageIcon(BotonQUCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonR = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnR.png"));
	ImageIcon BotonRMod = new ImageIcon(BotonR.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonRCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoR.png"));
	ImageIcon BotonRModCliked = new ImageIcon(BotonRCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonS = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnS.png"));
	ImageIcon BotonSMod = new ImageIcon(BotonS.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonSCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoS.png"));
	ImageIcon BotonSModCliked = new ImageIcon(BotonSCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTONES VENTANA T  -- */
	ImageIcon BotonT = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnT.png"));
	ImageIcon BotonTMod = new ImageIcon(BotonT.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonTCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoT.png"));
	ImageIcon BotonTModCliked = new ImageIcon(BotonTCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonU = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnU.png"));
	ImageIcon BotonUMod = new ImageIcon(BotonU.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonUCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoU.png"));
	ImageIcon BotonUModCliked = new ImageIcon(BotonUCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonV = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnV.png"));
	ImageIcon BotonVMod = new ImageIcon(BotonV.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonVCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoV.png"));
	ImageIcon BotonVModCliked = new ImageIcon(BotonVCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonX = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnX.png"));
	ImageIcon BotonXMod = new ImageIcon(BotonX.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonXCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoX.png"));
	ImageIcon BotonXModCliked = new ImageIcon(BotonXCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	ImageIcon BotonY = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnY.png"));
	ImageIcon BotonYMod = new ImageIcon(BotonY.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	ImageIcon BotonYCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/bttnClickeadoY.png"));
	ImageIcon BotonYModCliked = new ImageIcon(BotonYCliked.getImage().getScaledInstance((int)(this.ancho*0.21),(int)(this.alto*0.25), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTON ESPACIO  -- */
	//ImageIcon BotonEspacio = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonEspacioMod = new ImageIcon(BotonEspacio.getImage().getScaledInstance((int)(this.ancho*0.4),(int)(this.alto*0.1), java.awt.Image.SCALE_DEFAULT));
	//ImageIcon BotonEspacioCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonEspacioModCliked = new ImageIcon(BotonEspacioCliked.getImage().getScaledInstance((int)(this.ancho*0.4),(int)(this.alto*0.1), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTON PUNTO  -- */
	//ImageIcon BotonPunto = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonPuntoMod = new ImageIcon(BotonPunto.getImage().getScaledInstance((int)(this.ancho*0.11),(int)(this.alto*0.14), java.awt.Image.SCALE_DEFAULT));
	//ImageIcon BotonPuntoCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonPuntoModCliked = new ImageIcon(BotonPuntoCliked.getImage().getScaledInstance((int)(this.ancho*0.11),(int)(this.alto*0.14), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTON BORRAR  -- */
	//ImageIcon BotonBorrar = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonBorrarMod = new ImageIcon(BotonBorrar.getImage().getScaledInstance((int)(this.ancho*0.11),(int)(this.alto*0.14), java.awt.Image.SCALE_DEFAULT));
	//ImageIcon BotonBorrarCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonBorrarModCliked = new ImageIcon(BotonBorrarCliked.getImage().getScaledInstance((int)(this.ancho*0.11),(int)(this.alto*0.14), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTON SI  -- */
	//ImageIcon BotonSI = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonSIMod = new ImageIcon(BotonSI.getImage().getScaledInstance((int)(this.ancho*0.11),(int)(this.alto*0.14), java.awt.Image.SCALE_DEFAULT));
	//ImageIcon BotonSICliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonSIModCliked = new ImageIcon(BotonSICliked.getImage().getScaledInstance((int)(this.ancho*0.11),(int)(this.alto*0.14), java.awt.Image.SCALE_DEFAULT));
	
	/* -- BOTON NO  -- */
	//ImageIcon BotonNO = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonNOMod = new ImageIcon(BotonNO.getImage().getScaledInstance((int)(this.ancho*0.11),(int)(this.alto*0.14), java.awt.Image.SCALE_DEFAULT));
	//ImageIcon BotonNOCliked = new ImageIcon(FramePrincipal.class.getResource("/Graficos/.png"));
	//ImageIcon BotonNOModCliked = new ImageIcon(BotonNOCliked.getImage().getScaledInstance((int)(this.ancho*0.11),(int)(this.alto*0.14), java.awt.Image.SCALE_DEFAULT));
	
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
		JButton BttnPrA = new JButton("");
		BttnPrA.setIcon(APrincipalMod);
		BttnPrA.setPressedIcon(APrincipalModCliked);
		BttnPrA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaA");
				txtA.setText(txt.getText());
			}
		});
		BttnPrA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrA);
		
		/* -- BOTON F (VENTANA PRINCIPAL) -- */
		JButton BttnPrF = new JButton("");
		BttnPrF.setIcon(FPrincipalMod);
		BttnPrF.setPressedIcon(FPrincipalModCliked);
		BttnPrF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaF");
				txtF.setText(txt.getText());
			}
		});
		BttnPrF.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrF);
		
		/* -- BOTON K (VENTANA PRINCIPAL) -- */
		JButton BttnPrK = new JButton("");
		BttnPrK.setIcon(KPrincipalMod);
		BttnPrK.setPressedIcon(KPrincipalModCliked);
		BttnPrK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaK");
				txtK.setText(txt.getText());
			}
		});
		BttnPrK.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrK);
		
		/* -- BOTON O (VENTANA PRINCIPAL) -- */
		JButton BttnPrO = new JButton("");
		BttnPrO.setIcon(OPrincipalMod);
		BttnPrO.setPressedIcon(OPrincipalModCliked);
		BttnPrO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaO");
				txtO.setText(txt.getText());
			}
		});
		BttnPrO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrO);
		
		/* -- BOTON T (VENTANA PRINCIPAL) -- */
		JButton BttnPrT = new JButton("");
		BttnPrT.setIcon(TPrincipalMod);
		BttnPrT.setPressedIcon(TPrincipalModCliked);
		BttnPrT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaT");
				txtT.setText(txt.getText());
			}
		});
		BttnPrT.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnPrT);
		
		/* -- BOTON ESPACIO (VENTANA PRINCIPAL) -- */
		JButton BttnPrEspacio = new JButton("");
		//BttnPrEspacio.setIcon(BotonEspacioMod);
		//BttnPrEspacio.setPressedIcon(BotonEspacioModCliked);
		BttnPrEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+" ");
			}
		});
		BttnPrEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaPrincipal.add(BttnPrEspacio);
		
		/* -- BOTON PUNTO (VENTANA PRINCIPAL) -- */
		JButton BttnPrPunto = new JButton("");
		//BttnPrPunto.setIcon(BotonPuntoMod);
		//BttnPrPunto.setPressedIcon(BotonPuntoModCliked);
		BttnPrPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText(txt.getText()+".");
			}
		});
		BttnPrPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaPrincipal.add(BttnPrPunto);
		
		/* -- BOTON BORRAR (VENTANA PRINCIPAL) -- */
		JButton BttnPrBorrar = new JButton("");
		//BttnPrBorrar.setIcon(BotonBorrarMod);
		//BttnPrBorrar.setPressedIcon(BotonBorrarModCliked);
		BttnPrBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Timers t = new Timers(timer,'P');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnPrBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaPrincipal.add(BttnPrBorrar);
		
		/* -- BOTON SI (VENTANA PRINCIPAL) -- */
		JButton BttnPrSI = new JButton("");
		//BttnPrSI.setIcon(BotonSIMod);
		//BttnPrSI.setPressedIcon(BotonSIModCliked);
		BttnPrSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaPrincipal.add(BttnPrSI);
		
		/* -- BOTON NO (VENTANA PRINCIPAL) -- */
		JButton BttnPrNO = new JButton("");
		//BttnPrNO.setIcon(BotonNOMod);
		//BttnPrNO.setPressedIcon(BotonNOModCliked);
		BttnPrNO.setBounds((int)(this.ancho*0.597),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaPrincipal.add(BttnPrNO);
		
		/* -- BOTON CERRAR1 (VENTANA PRINCIPAL) --*/
		JButton BttnClose1 = new JButton("");
		BttnClose1.setIcon(CerrarMod);
		BttnClose1.setOpaque(false);
		BttnClose1.setBorderPainted(false);
		BttnClose1.setBorder(null);
		BttnClose1.setBackground(new Color(255, 255, 255));
		BttnClose1.setForeground(UIManager.getColor("Panel.background"));
		BttnClose1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BttnClose1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(timerClose != null){
					timerClose.cancel();
				}
				timerClose = new Timer();
				Timers t1 = new Timers(timerClose,'1');
				timerClose.schedule(t1, 1, 2000);
			}
		});
		BttnClose1.setBounds((int)(this.ancho*0.643),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnClose1); 

		/* -- BOTON CERRAR2 (VENTANA PRINCIPAL) --*/
		JButton BttnClose2 = new JButton("");
		BttnClose2.setIcon(CerrarMod);
		BttnClose2.setOpaque(false);
		BttnClose2.setBorderPainted(false);
		BttnClose2.setBorder(null);
		BttnClose2.setBackground(new Color(255, 255, 255));
		BttnClose2.setForeground(UIManager.getColor("Panel.background"));
		BttnClose2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(timerClose != null){
					timerClose.cancel();
				}
				timerClose = new Timer();
				Timers t2 = new Timers(timerClose,'2');
				timerClose.schedule(t2, 1, 100);
			}
		});
		BttnClose2.setBounds((int)(this.ancho*0.143),(int)(this.alto*0.375), (int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaPrincipal.add(BttnClose2);
		
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
		txt.setFont(new Font("Arial", Font.BOLD, (int) (alto*0.033)));
		scrollPanePr.setViewportView(txt);
		
	}
	 
	public void VentanaAConstructor(){
		 
		VentanaA = new JPanel();
		VentanaA.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaA.setLayout(null);
		
		/* -- BOTON LETRA A (VENTANA A) -- */
		JButton BttnA = new JButton("");
		BttnA.setIcon(BotonAMod);
		BttnA.setPressedIcon(BotonAModCliked);
		BttnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"A");
			}
		});
		BttnA.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnA);
		
		/* -- BOTON LETRA B (VENTANA A) -- */
		JButton BttnB = new JButton("");
		BttnB.setIcon(BotonBMod);
		BttnB.setPressedIcon(BotonBModCliked);
		BttnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"B");
		}
		});
		BttnB.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnB);
		
		/* -- BOTON LETRA C (VENTANA A) -- */
		JButton BttnC = new JButton("");
		BttnC.setIcon(BotonCMod);
		BttnC.setPressedIcon(BotonCModCliked);
		BttnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"C");
			}
		});
		BttnC.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnC);
		
		/* -- BOTON LETRA D (VENTANA A) -- */
		JButton BttnD = new JButton("");
		BttnD.setIcon(BotonDMod);
		BttnD.setPressedIcon(BotonDModCliked);
		BttnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"D");
			}
		});
		BttnD.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnD);
		
		/* -- BOTON LETRA E (VENTANA A) -- */
		JButton BttnE = new JButton("");
		BttnE.setIcon(BotonEMod);
		BttnE.setPressedIcon(BotonEModCliked);
		BttnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText()+"E");
			}
		});
		BttnE.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaA.add(BttnE);
		
		/* -- BOTON ESPACIO (VENTANA A) -- */
		JButton BttnAEspacio = new JButton("");
		//BttnAEspacio.setIcon(BotonEspacioMod);
		//BttnAEspacio.setPressedIcon(BotonEspacioModCliked);
		BttnAEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtA.getText());
			}
		});
		BttnAEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaA.add(BttnAEspacio);
		
		/* -- BOTON PUNTO (VENTANA A) -- */
		JButton BttnAPunto = new JButton("");
		//BttnAPunto.setIcon(BotonPuntoMod);
		//BttnAPunto.setPressedIcon(BotonPuntoModCliked);
		BttnAPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaA.add(BttnAPunto);
		
		/* -- BOTON BORRAR (VENTANA A) -- */
		JButton BttnABorrar = new JButton("");
		//BttnABorrar.setIcon(BotonBorrarMod);
		//BttnABorrar.setPressedIcon(BotonBorrarModCliked);
		BttnABorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Timers t = new Timers(timer,'A');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnABorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaA.add(BttnABorrar);
		
		/* -- BOTON SI (VENTANA A) -- */
		JButton BttnASI = new JButton("");
		//BttnASI.setIcon(BotonSIMod);
		//BttnASI.setPressedIcon(BotonSIModCliked);
		BttnASI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaA.add(BttnASI);
		
		/* -- BOTON NO (VENTANA A) -- */
		JButton BttnANO = new JButton("");
		//BttnANO.setIcon(BotonNOMod);
		//BttnANO.setPressedIcon(BotonNOModCliked);
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
		txtA.setFont(new Font("Arial", Font.BOLD, (int) (alto*0.033)));
		scrollPaneA.setViewportView(txtA);
		
	}
	
	public void VentanaFConstructor(){
		
	 	VentanaF = new JPanel();
		VentanaF.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaF.setLayout(null);
		
		/* -- BOTON LETRA F (VENTANA F) -- */
	 	JButton BttnF = new JButton("");
	 	BttnF.setIcon(BotonFMod);
		BttnF.setPressedIcon(BotonFModCliked);
		BttnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"F");
			}
		});
		BttnF.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnF);
		
		/* -- BOTON LETRA G (VENTANA F) -- */
		JButton BttnG = new JButton("");
		BttnG.setIcon(BotonGMod);
		BttnG.setPressedIcon(BotonGModCliked);
		BttnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"G");
			}
		});
		BttnG.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnG);
		
		/* -- BOTON LETRA H (VENTANA F) -- */
		JButton BttnH = new JButton("");
		BttnH.setIcon(BotonHMod);
		BttnH.setPressedIcon(BotonHModCliked);
		BttnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"H");
			}
		});
		BttnH.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnH);
		
		/* -- BOTON LETRA I (VENTANA F) -- */
		JButton BttnI = new JButton("");
		BttnI.setIcon(BotonIMod);
		BttnI.setPressedIcon(BotonIModCliked);
		BttnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"I");
			}
		});
		BttnI.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnI);
		
		/* -- BOTON LETRA J (VENTANA F) -- */
		JButton BttnJ = new JButton("");
		BttnJ.setIcon(BotonJMod);
		BttnJ.setPressedIcon(BotonJModCliked);
		BttnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText()+"J");
			}
		});
		BttnJ.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaF.add(BttnJ);
		
		/* -- BOTON ESPACIO (VENTANA F) -- */
		JButton BttnFEspacio = new JButton("");
		//BttnFEspacio.setIcon(BotonEspacioMod);
		//BttnFEspacio.setPressedIcon(BotonEspacioModCliked);
		BttnFEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtF.getText());
			}
		});
		BttnFEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaF.add(BttnFEspacio);
		
		/* -- BOTON PUNTO (VENTANA F) -- */
		JButton BttnFPunto = new JButton("");
		//BttnFPunto.setIcon(BotonPuntoMod);
		//BttnFPunto.setPressedIcon(BotonPuntoModCliked);
		BttnFPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaF.add(BttnFPunto);
		
		/* -- BOTON BORRAR (VENTANA F) -- */
		JButton BttnFBorrar = new JButton("");
		//BttnFBorrar.setIcon(BotonBorrarMod);
		//BttnFBorrar.setPressedIcon(BotonBorrarModCliked);
		BttnFBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Timers t = new Timers(timer,'F');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnFBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaF.add(BttnFBorrar);
		
		/* -- BOTON SI (VENTANA F) -- */
		JButton BttnFSI = new JButton("");
		//BttnFSI.setIcon(BotonSIMod);
		//BttnFSI.setPressedIcon(BotonSIModCliked);
		BttnFSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaF.add(BttnFSI);
		
		/* -- BOTON NO (VENTANA F) -- */
		JButton BttnFNO = new JButton("");
		//BttnFNO.setIcon(BotonNOMod);
		//BttnFNO.setPressedIcon(BotonNOModCliked);
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
		txtF.setFont(new Font("Arial", Font.BOLD, (int) (alto*0.033)));
		scrollPaneF.setViewportView(txtF);
		
	}
	
	public void VentanaKConstructor(){
		
	 	VentanaK = new JPanel();
		VentanaK.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaK.setLayout(null);
		
		/* -- BOTON LETRA K (VENTANA K) -- */
	 	JButton BttnK = new JButton("");
	 	BttnK.setIcon(BotonKMod);
		BttnK.setPressedIcon(BotonKModCliked);
		BttnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"K");
			}
		});
		BttnK.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(BttnK);
		
		/* -- BOTON LETRA L (VENTANA K) -- */
		JButton BttnL = new JButton("");
		BttnL.setIcon(BotonLMod);
		BttnL.setPressedIcon(BotonLModCliked);
		BttnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"L");
			}
		});
		BttnL.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(BttnL);
		
		/* -- BOTON LETRA M (VENTANA K) -- */
		JButton BttnM = new JButton("");
		BttnM.setIcon(BotonMMod);
		BttnM.setPressedIcon(BotonMModCliked);
		BttnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"M");
			}
		});
		BttnM.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(BttnM);
		
		/* -- BOTON LETRA N (VENTANA K) -- */
		JButton BttnN = new JButton("");
		BttnN.setIcon(BotonNMod);
		BttnN.setPressedIcon(BotonNModCliked);
		BttnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"N");
			}
		});
		BttnN.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(BttnN);
		
		/* -- BOTON LETRA � (VENTANA K) -- */
		JButton Bttn� = new JButton("");
		Bttn�.setIcon(Boton�Mod);
		Bttn�.setPressedIcon(Boton�ModCliked);
		Bttn�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText()+"�");
			}
		});
		Bttn�.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaK.add(Bttn�);
		
		/* -- BOTON ESPACIO (VENTANA K) -- */
		JButton BttnKEspacio = new JButton("");
		//BttnKEspacio.setIcon(BotonEspacioMod);
		//BttnKEspacio.setPressedIcon(BotonEspacioModCliked);
		BttnKEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtK.getText());
			}
		});
		BttnKEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaK.add(BttnKEspacio);
		
		/* -- BOTON PUNTO (VENTANA K) -- */
		JButton BttnKPunto = new JButton("");
		//BttnKPunto.setIcon(BotonPuntoMod);
		//BttnKPunto.setPressedIcon(BotonPuntoModCliked);
		BttnKPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaK.add(BttnKPunto);
		
		/* -- BOTON BORRAR (VENTANA K) -- */
		JButton BttnKBorrar = new JButton("");
		//BttnKBorrar.setIcon(BotonBorrarMod);
		//BttnKBorrar.setPressedIcon(BotonBorrarModCliked);
		BttnKBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Timers t = new Timers(timer,'K');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnKBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaK.add(BttnKBorrar);
		
		/* -- BOTON SI (VENTANA K) -- */
		JButton BttnKSI = new JButton("");
		//BttnKSI.setIcon(BotonSIMod);
		//BttnKSI.setPressedIcon(BotonSIModCliked);
		BttnKSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaK.add(BttnKSI);
		
		/* -- BOTON NO (VENTANA K) -- */
		JButton BttnKNO = new JButton("");
		//BttnKNO.setIcon(BotonNOMod);
		//BttnKNO.setPressedIcon(BotonNOModCliked);
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
		txtK.setFont(new Font("Arial", Font.BOLD, (int) (alto*0.033)));
		scrollPaneK.setViewportView(txtK);
		
	}
	
	public void VentanaOConstructor(){
		
	 	VentanaO = new JPanel();
		VentanaO.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaO.setLayout(null);
		
		/* -- BOTON LETRA O (VENTANA O) -- */
	 	JButton BttnO = new JButton("");
	 	BttnO.setIcon(BotonOMod);
		BttnO.setPressedIcon(BotonOModCliked);
	 	BttnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"O");
			}
		});
		BttnO.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnO);
		
		/* -- BOTON LETRA P (VENTANA O) -- */
		JButton BttnP = new JButton("");
		BttnP.setIcon(BotonPMod);
		BttnP.setPressedIcon(BotonPModCliked);
		BttnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"P");
			}
		});
		BttnP.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnP);
		
		/* -- BOTON LETRA QU (VENTANA O) -- */
		JButton BttnQU = new JButton("");
		BttnQU.setIcon(BotonQUMod);
		BttnQU.setPressedIcon(BotonQUModCliked);
		BttnQU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"QU");
			}
		});
		BttnQU.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnQU);
		
		/* -- BOTON LETRA R (VENTANA O) -- */
		JButton BttnR = new JButton("");
		BttnR.setIcon(BotonRMod);
		BttnR.setPressedIcon(BotonRModCliked);
		BttnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"R");
			}
		});
		BttnR.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnR);
		
		/* -- BOTON LETRA S (VENTANA O) -- */
		JButton BttnS = new JButton("");
		BttnS.setIcon(BotonSMod);
		BttnS.setPressedIcon(BotonSModCliked);
		BttnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText()+"S");
			}
		});
		BttnS.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaO.add(BttnS);
		
		/* -- BOTON ESPACIO (VENTANA O) -- */
		JButton BttnOEspacio = new JButton("");
		//BttnOEspacio.setIcon(BotonEspacioMod);
		//BttnOEspacio.setPressedIcon(BotonEspacioModCliked);
		BttnOEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtO.getText());
			}
		});
		BttnOEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaO.add(BttnOEspacio);
		
		/* -- BOTON PUNTO (VENTANA O) -- */
		JButton BttnOPunto = new JButton("");
		//BttnOPunto.setIcon(BotonPuntoMod);
		//BttnOPunto.setPressedIcon(BotonPuntoModCliked);
		BttnOPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaO.add(BttnOPunto);
		
		/* -- BOTON BORRAR (VENTANA O) -- */
		JButton BttnOBorrar = new JButton("");
		//BttnOBorrar.setIcon(BotonBorrarMod);
		//BttnOBorrar.setPressedIcon(BotonBorrarModCliked);
		BttnOBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Timers t = new Timers(timer,'O');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnOBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaO.add(BttnOBorrar);
		
		/* -- BOTON SI (VENTANA O) -- */
		JButton BttnOSI = new JButton("");
		//BttnOSI.setIcon(BotonSIMod);
		//BttnOSI.setPressedIcon(BotonSIModCliked);
		BttnOSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaO.add(BttnOSI);
		
		/* -- BOTON NO (VENTANA O) -- */
		JButton BttnONO = new JButton("");
		//BttnONO.setIcon(BotonNOMod);
		//BttnONO.setPressedIcon(BotonNOModCliked);
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
		txtO.setFont(new Font("Arial", Font.BOLD, (int) (alto*0.033)));
		scrollPaneO.setViewportView(txtO);
		
	}
	
	public void VentanaTConstructor(){
		
	 	VentanaT = new JPanel();
	 	VentanaT.setBorder(new EmptyBorder(5, 5, 5, 5));
		VentanaT.setLayout(null);
		
		/* -- BOTON LETRA T (VENTANA T) -- */
		JButton BttnT = new JButton("");
		BttnT.setIcon(BotonTMod);
		BttnT.setPressedIcon(BotonTModCliked);
		BttnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"T");
			}
		});
		BttnT.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnT);
		
		/* -- BOTON LETRA U (VENTANA T) -- */
		JButton BttnU = new JButton("");
		BttnU.setIcon(BotonUMod);
		BttnU.setPressedIcon(BotonUModCliked);
		BttnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"U");
			}
		});
		BttnU.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.003),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnU);
		
		/* -- BOTON LETRA V (VENTANA T) -- */
		JButton BttnV = new JButton("");
		BttnV.setIcon(BotonVMod);
		BttnV.setPressedIcon(BotonVModCliked);
		BttnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"V");
			}
		});
		BttnV.setBounds((int)(this.ancho*0.393),(int)(this.alto*0.375),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnV);
		
		/* -- BOTON LETRA X (VENTANA T) -- */
		JButton BttnX = new JButton("");
		BttnX.setIcon(BotonXMod);
		BttnX.setPressedIcon(BotonXModCliked);
		BttnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"X");
			}
		});
		BttnX.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnX);
		
		/* -- BOTON LETRA Y (VENTANA T) -- */
		JButton BttnY = new JButton("");
		BttnY.setIcon(BotonYMod);
		BttnY.setPressedIcon(BotonYModCliked);
		BttnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText()+"Y");
			}
		});
		BttnY.setBounds((int)(this.ancho*0.789),(int)(this.alto*0.747),(int)(this.ancho*0.21),(int)(this.alto*0.25));
		VentanaT.add(BttnY);
		
		/* -- BOTON ESPACIO (VENTANA T) -- */
		JButton BttnTEspacio = new JButton("");
		//BttnTEspacio.setIcon(BotonEspacioMod);
		//BttnTEspacio.setPressedIcon(BotonEspacioModCliked);
		BttnTEspacio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "VentanaPrincipal");
				txt.setText(txtT.getText());
			}
		});
		BttnTEspacio.setBounds((int)(this.ancho*0.3),(int)(this.alto*0.003),(int)(this.ancho*0.4),(int)(this.alto*0.1));
		VentanaT.add(BttnTEspacio);
		
		/* -- BOTON PUNTO (VENTANA T) -- */
		JButton BttnTPunto = new JButton("");
		//BttnTPunto.setIcon(BotonPuntoMod);
		//BttnTPunto.setPressedIcon(BotonPuntoModCliked);
		BttnTPunto.setBounds((int)(this.ancho*0.003),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaT.add(BttnTPunto);
		
		/* -- BOTON BORRAR (VENTANA T) -- */
		JButton BttnTBorrar = new JButton("");
		//BttnTBorrar.setIcon(BotonBorrarMod);
		//BttnTBorrar.setPressedIcon(BotonBorrarModCliked);
		BttnTBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				timer = new Timer();
				Timers t = new Timers(timer,'T');
				timer.schedule(t, 1, milisegundos);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				timer.cancel();
			}
		});
		BttnTBorrar.setBounds((int)(this.ancho*0.889),(int)(this.alto*0.43),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaT.add(BttnTBorrar);
		
		/* -- BOTON SI (VENTANA T) -- */
		JButton BttnTSI = new JButton("");
		//BttnTSI.setIcon(BotonSIMod);
		//BttnTSI.setPressedIcon(BotonSIModCliked);
		BttnTSI.setBounds((int)(this.ancho*0.293),(int)(this.alto*0.717),(int)(this.ancho*0.11),(int)(this.alto*0.14));
		VentanaT.add(BttnTSI);
		
		/* -- BOTON NO (VENTANA T) -- */
		JButton BttnTNO = new JButton("");
		//BttnTNO.setIcon(BotonNOMod);
		//BttnTNO.setPressedIcon(BotonNOModCliked);
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
		txtT.setFont(new Font("Arial", Font.BOLD, (int) (alto*0.033)));
		scrollPaneT.setViewportView(txtT);
		
	}
}
