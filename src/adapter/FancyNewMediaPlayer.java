package adapter;

/**
 * @author Steve Riddle
 * Example of adapter pattern. This class is the adaptee
 */
public class FancyNewMediaPlayer {
	public void playAAC() {
		 System.out.println("Playing an aac on my shiny new media player");
	}
	
	public void playOGG() {
		 System.out.println("Playing an ogg on my shiny new media player");
	}
}
