package observer;

public class TestSubs {

	public static void main(String[] args) {
		User eric = new User("Eric");
		User chris = new User("Chris");
		User pat = new User("Pat");
		
		
		eric.addFollower(chris);
		chris.addFollower(eric);

		eric.setStatus("taking photo of lunch");
		
		eric.addFollower(pat);
		
		eric.setStatus("updating status again");
		pat.addFollower(eric);
		pat.addFollower(chris);
		
		pat.setStatus("drinking tea");
		eric.setStatus("working on Software Engineering coursework");
		pat.removeFollower(eric);
		eric.removeFollower(pat);
		
		pat.setStatus("not friends with Eric anymore");
		eric.setStatus("taking photo of cat");
		chris.setStatus("staring into the abyss");
	}
 

}
