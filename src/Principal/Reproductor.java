package Principal;

import java.io.BufferedInputStream;
import javazoom.jl.player.Player;

public class Reproductor implements Runnable {
	
	private Player player; 

	@Override
	public void run() {
		try {
			BufferedInputStream bis = new BufferedInputStream(getClass().getResourceAsStream("/Audio/SonidoBttn.mp3"));
			player = new Player(bis);
			player.play();
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
