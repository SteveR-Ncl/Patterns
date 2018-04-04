package observer;
import java.awt.*;
import javax.swing.*;


public class StreamFrame {
	static int lastPos = 0;
	final int pad = 200;
	
	JTextArea textArea;
	
	private void createAndShowStream(String uname) {
		//Create and set up the window.
		JFrame frame = new JFrame(uname);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setPreferredSize(new Dimension(10, 20));
			
		textArea = new JTextArea(10, 50);
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		//Set the menu bar and add the label to the content pane.
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frame.setLocation(0, lastPos);
		lastPos += pad;
		//Display the window.
		frame.pack();
		frame.setVisible(true);
	    }
	 
	    public void addLine(String text){
	    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
	    		public void run() {
	    			textArea.append(text + "\n");
	    			textArea.setCaretPosition(textArea.getDocument().getLength());
	    		}
	    	});
	    }
	    
	    public StreamFrame(String uname) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowStream(uname);
	            }
	        });
	}
}
