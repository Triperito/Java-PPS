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
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ScrollPaneConstants;

import java.awt.ComponentOrientation;

@SuppressWarnings("serial")
public class Instrucciones extends JFrame {

	private JPanel contentPane;
	
	public int altoPantalla  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public int alto = (int) (altoPantalla*0.4);
	public int ancho = (int) (anchoPantalla*0.4);
	
	public Instrucciones() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Instrucciones.class.getResource("/Graficos/Icono.png")));
		this.setTitle("Instrucciones de uso");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds((anchoPantalla/2)-(ancho/2), (altoPantalla/2)-(alto/2), ancho, alto);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Instruncciones de uso");
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 20));
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		JTextPane textPaneInstrucciones = new JTextPane();
		textPaneInstrucciones.setFont(new Font("Arial", Font.PLAIN, 12));
		textPaneInstrucciones.setDisabledTextColor(Color.BLACK);
		textPaneInstrucciones.setFocusable(false);
		textPaneInstrucciones.setEditable(false);
		textPaneInstrucciones.setAutoscrolls(true);
		textPaneInstrucciones.setText("----------Ventana Configuraci\u00F3n----------\r\n\u2022 Si es la priemra vez que utiliza la aplicaci\u00F3n debera seguir las intrucciones paso a paso de como instalar el motor de voz de la aplicaci\u00F3n, para esto haga click en el bot\u00F3n Manual de instalaci\u00F3n y le abrira un PDF con dichas instrucciones.\r\n\u2022 Podra elegir una voz que sera la que se reproduzca en la aplicaci\u00F3n, mediante el bot\u00F3n azul podra escucharlas preliminarmente.\r\n\u2022 Activar sonido de botones: Genera un sonido cada vez que se presiona una letra o espacio en la aplicaci\u00F3n.\r\n\u2022 Activar guardado de texto: Dara la posibilidad de guardar lo escrito hasta el momento en un archivo de texto en la carpeta \"Textos\".\r\n\u2022 Bot\u00F3n Reproducir archivo: Dara la posibilidad de elegir un archivo previamente guardado para su reproducci\u00F3n.\r\n\u2022 Bot\u00F3n Manual de Instalci\u00F3n: Abrira un PDF con las intrucciones paso a paso de como instalar el motor de voz de la aplicaci\u00F3n. \r\n\r\n----------En la Aplicaci\u00F3n----------\r\n\u2022 Dispondra de grupos de letras a los cuales debera introducirse para escoger la letra correspondiente, si se equivoca de grupo, podra volver atras con el bot\u00F3n espacio (Bot\u00F3n violeta).\r\n\u2022 Si se equivoca y es necesario borrar puede precionar el bot\u00F3n \"Borrar\" para eliminar una letra, o mantenerlo precionado para borrar grupos de letras\".\r\n\u2022 Al presionar el bot\u00F3n \"Punto\" se terminara una oraci\u00F3n, la misma sera reproducida con la voz elegida.");
		
		JScrollPane sp = new JScrollPane(textPaneInstrucciones);
		sp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		sp.setFocusable(false);
		sp.setAutoscrolls(true);
		contentPane.add(sp, BorderLayout.CENTER);
		
	}
	
}
