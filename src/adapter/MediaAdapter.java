package adapter;

/**
 * @author steve
 * Example of adapter pattern. MediaAdapter extends the target (MediaPlayer) by adapting 
 * FancyNewMediaPlayer. Appropriate behaviour is used from either target or adaptee.
 */
public class MediaAdapter extends MediaPlayer {
	private FancyNewMediaPlayer newPlayer = new FancyNewMediaPlayer();
	
	public void play(String type){
		switch (type.toLowerCase()){
		case "aac":
			newPlayer.playAAC();
			break;
		case "ogg":
			newPlayer.playOGG();
			break;
		default:
			super.play(type);
			break;			
				
		}
		
		
	}
}
