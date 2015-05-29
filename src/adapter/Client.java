package adapter;

/**
 * @author steve
 * Example of adapter pattern. Client knows nothing about
 * which class actually provides the service (MediaPlayer or FancyNewMediaPlayer).
 * Uses MediaAdapter instance as MediaPlayer.
 */
public class Client {
	
	
	public static void main(String[] args) {
		MediaPlayer m = new MediaAdapter();
		System.out.print("Client plays ogg: .... ");
		m.play("ogg");
		System.out.print("Client plays mp3: .... ");
		m.play("mp3");
		System.out.print("Client plays aac: .... ");
		m.play("aac");
		System.out.print("Client plays wma: .... ");
		m.play("wma");
		
	}
	
}
