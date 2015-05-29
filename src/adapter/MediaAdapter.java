package adapter;

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
