package adapter;

public class MediaPlayer {
	 void play(String type){
		 // just plays mp3
		 if (type.equalsIgnoreCase("mp3")) {
		 System.out.println("Playing an mp3");
		 }
		 else {
			 System.out.println("Error, unknown type");
		 }
	 }

}
