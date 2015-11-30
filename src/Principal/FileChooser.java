package Principal;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class FileChooser extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public FileChooser() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FileChooser.class.getResource("/Graficos/Icono.png")));
		this.setTitle("Eliga el archivo a reproducir...");
		setBounds(100, 100, 656, 432);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JFileChooser Chooser = new JFileChooser();
		Chooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
					Speak.eSpeakFile(Chooser.getSelectedFile().getAbsolutePath());
					dispose();
				}
				else if (e.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)) {
					dispose();
				}
			}
		});
		Chooser.setBounds(0, 0, 623, 397);
		contentPanel.add(Chooser);
		Chooser.setCurrentDirectory(new File(Speak.path() + "Textos"));
		{

		}
	}

}
