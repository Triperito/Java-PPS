package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameSettings extends JFrame {

	private JPanel contentPane;
	
	public int altoPantalla  = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public int alto = (int) (altoPantalla*0.5);
	public int ancho = (int) (anchoPantalla*0.5);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSettings frame = new FrameSettings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrameSettings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((anchoPantalla/2)-(ancho/2), (altoPantalla/2)-(alto/2), ancho, alto);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConfiguraciones = new JLabel("Bienvenidos al Intercomunicador Java");
		lblConfiguraciones.setFont(new Font("Calibri", Font.BOLD, 30));
		lblConfiguraciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfiguraciones.setBounds((int)(0.095*ancho),(int)(0.027*alto),(int)(0.781*ancho),(int)(0.075*alto));
		contentPane.add(lblConfiguraciones);
		
		JLabel lblVoces = new JLabel("Voces:");
		lblVoces.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoces.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblVoces.setBounds((int)(0.016*ancho),(int)(0.177*alto), (int)(0.125*ancho), (int)(0.062*alto));
		contentPane.add(lblVoces);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 20));
		comboBox.setBounds((int)(0.16*ancho), (int)(0.177*alto), (int)(0.312*ancho), (int)(0.062*alto));
		comboBox.addItem((Object)"Juan");
		comboBox.addItem((Object)"Juliana");
		comboBox.addItem((Object)"Leandro");
		comboBox.addItem((Object)"Florencia");
		comboBox.addItem((Object)"Luciano");
		comboBox.addItem((Object)"María");
		comboBox.addItem((Object)"Hugo");
		contentPane.add(comboBox);
		
		JButton btnPlay = new JButton("");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Speak.eSpeak("Hola, esta es la voz de "+comboBox.getSelectedItem());
			}
		});
		btnPlay.setBackground(Color.WHITE);
		btnPlay.setBorder(null);
		ImageIcon Play = new ImageIcon(FrameSettings.class.getResource("/Graficos/Play.png"));
		ImageIcon PlayMod = new ImageIcon(Play.getImage().getScaledInstance((int)(0.078*ancho),(int)(0.125*alto), java.awt.Image.SCALE_DEFAULT));
		ImageIcon PlayClicked = new ImageIcon(FrameSettings.class.getResource("/Graficos/PlayClickeado.png"));
		ImageIcon PlayModClicked = new ImageIcon(PlayClicked.getImage().getScaledInstance((int)(0.078*ancho),(int)(0.125*alto), java.awt.Image.SCALE_DEFAULT));
		btnPlay.setIcon(PlayMod);
		btnPlay.setPressedIcon(PlayModClicked);
		btnPlay.setBounds((int)(0.515*ancho), (int)(0.137*alto), (int)(0.078*ancho), (int)(0.125*alto));
		contentPane.add(btnPlay);
		
		JCheckBox chckbxActivarSonidoDe = new JCheckBox("Activar sonido de botones");
		chckbxActivarSonidoDe.setFont(new Font("Calibri", Font.PLAIN, 20));
		chckbxActivarSonidoDe.setBackground(Color.WHITE);
		chckbxActivarSonidoDe.setBounds((int)(0.016*ancho), (int)(0.257*alto), (int)(0.468*ancho), (int)(0.075*alto));
		contentPane.add(chckbxActivarSonidoDe);
		
		JCheckBox chckbxActivarGuardadoDe = new JCheckBox("Activar guardado de texto");
		chckbxActivarGuardadoDe.setFont(new Font("Calibri", Font.PLAIN, 20));
		chckbxActivarGuardadoDe.setBackground(Color.WHITE);
		chckbxActivarGuardadoDe.setBounds((int)(0.016*ancho), (int)(0.340*alto), (int)(0.468*ancho), (int)(0.075*alto));
		contentPane.add(chckbxActivarGuardadoDe);
		
		JButton btnIntruccionesDeUso = new JButton("Intrucciones de uso");
		btnIntruccionesDeUso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIntruccionesDeUso.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnIntruccionesDeUso.setBounds((int)(0.016*ancho), (int)(0.432*alto), (int)(0.312*ancho), (int)(0.075*alto));
		contentPane.add(btnIntruccionesDeUso);
		
		JButton btnimportante = new JButton("");
		btnimportante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnimportante.setBounds((int)(0.016*ancho), (int)(0.535*alto), ancho-(2*((int)(0.029*ancho))), (int)(0.250*alto));
		contentPane.add(btnimportante);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePrincipal frame = new FramePrincipal();
				frame.setVisible(true);
				dispose();
			}
		});
		//btnFinalizar.setBounds(241, 320, 124, 30);
		btnFinalizar.setBounds((ancho/2)-(int)((0.194*ancho)/2), (int)(0.800*alto), (int)(0.194*ancho), (int)(0.075*alto));
		contentPane.add(btnFinalizar);
	}
}
