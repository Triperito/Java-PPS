package Principal;
import java.io.BufferedInputStream;
import javazoom.jl.player.Player;

public class Reproductor {
	
	private Player player; 
	
	public void SimplePlayer() {
		try {
			BufferedInputStream bis = new BufferedInputStream(getClass().getResourceAsStream("/Audio/SonidoBttn.mp3"));
			player = new Player(bis);
			player.play();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
