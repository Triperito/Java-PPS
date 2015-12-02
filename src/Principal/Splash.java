package Principal;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Splash extends JFrame implements Runnable {

	private JPanel contentPane;
	
	public int altoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	public int anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	
	Thread hilo;
	ImageIcon ImgSplash = new ImageIcon(FramePrincipal.class.getResource("/Graficos/Splash.png"));
	
	public Splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, ImgSplash.getIconWidth(), ImgSplash.getIconHeight());
		setIconImage(Toolkit.getDefaultToolkit().getImage(Instrucciones.class.getResource("/Graficos/Icono.png")));
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JLabel lblSplash = new JLabel("");
		lblSplash.setAlignmentY(0.0f);
		lblSplash.setIcon(new ImageIcon(Splash.class.getResource("/Graficos/Splash.png")));
		lblSplash.setSize(ImgSplash.getIconHeight(), ImgSplash.getIconWidth());
		contentPane.add(lblSplash, BorderLayout.CENTER);
		
	}

	@Override
	public void run() {
		try{
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			Thread.sleep(4000);
			FrameSettings.frame.setVisible(true);
			this.dispose();
		}
		catch(InterruptedException ex){
			Logger.getLogger(Splash.class.getName()).log(Level.SEVERE,null,ex);
		}
	}

}
