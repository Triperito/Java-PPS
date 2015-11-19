package Principal;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class Instrucciones extends JFrame {

	private JPanel contentPane;
	
	public int altoPantalla  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public int alto = (int) (altoPantalla*0.4);
	public int ancho = (int) (anchoPantalla*0.4);
	private String[] cadenas = {
			"Ventana de Configuracion:","\r",
			"-Si es la priemra vez que utiliza la aplicacion debera instalar",
			"el eSpeak para poder escuchar las voces, esto lo realiza",
			"con el boton de instalacion.",
			"-Podra elegir una voz para que sea la que se reproduzca en la ",
			"aplicaicon, mediante el boton azul podra escucharlas.",
			"-\"Activar sonido de botones\" genera un sonido cada vez que ",
			"cada vez que se presiona una letra o espacio en la aplicacion.",
			"-\"Activar guardado de texto\" dara la posibilidad de guardar",
			"lo escrito hasta el momento en un archivo en la carpeta \"Textos\"",
			"-El boton \"Reproducir archivo\" dara la posibilidad de elegir ",
			"un archivo previamente guardado para su reproduccion.","\n",
			"En la aplicacion:","\r",
			"-Dispondra de grupos de letras a los cuales debera introducirse",
			"para escoger la letra correspondiente, si se equivoca de grupo ",
			"podra volver atras con el boton espacio (boton violeta).",
			"-Si se equivoca y es necesario borrar puede precionar el boton",
			"\"Borrar\" para eliminar una letra, o mantenerlo precionado para",
			"borrar todo.",
			"-Al presion el boton Punto se terminara una oracion, la misma",
			"sera reproducida con la voz elegida."	
	};
	
	public Instrucciones() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Instrucciones.class.getResource("/Graficos/IconoVentanas.png")));
		this.setTitle("Instrucciones de uso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((anchoPantalla/2)-(ancho/2), (altoPantalla/2)-(alto/2), 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Instruncciones de uso");
		lblTitulo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		JTextPane textPaneInstrucciones = new JTextPane();
		textPaneInstrucciones.setFocusable(false);
		textPaneInstrucciones.setEditable(false);
		textPaneInstrucciones.setAutoscrolls(true);
		textPaneInstrucciones.setText(cadenas[0]+"\n");
		for(int i=1; i<cadenas.length; i++) {
			textPaneInstrucciones.setText(textPaneInstrucciones.getText() + cadenas[i]+"\n");
		}
		
		JScrollPane sp = new JScrollPane(textPaneInstrucciones);
		sp.setFocusable(false);
		sp.setAutoscrolls(true);
		contentPane.add(sp, BorderLayout.CENTER);
	}
}
