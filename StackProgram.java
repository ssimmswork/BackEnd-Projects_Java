import javax.swing.*;
	import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Stack;

	public abstract class StackProgram implements ActionListener{

	public static Stack <Integer> stack = new Stack <Integer>();

	public static void main(String[] args) {
		final String orgText = "Enter a number you would like to Push. \n"
	    		+ " or \n"
	    		+ " POP and Peek numbers in your stack";
		
	    JFrame frame = new JFrame("Stack");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(900, 900);
	    
	    JPanel pane = new JPanel();
	    pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
	    JPanel panel = new JPanel();
	    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

	    JTextPane message = new JTextPane();
	    message.setText(orgText);
	    
	    pane.add(message);
	    
	    JTextField input = new JTextField();
	    pane.add(input);
	    input.setColumns(4);
	    
	    JTextArea myArea = new JTextArea(20, 1);
	    myArea.setEditable(false);
	    pane.add(myArea);
	
	    JButton pushButton = new JButton("Push");
	    pane.add(pushButton);
	    pushButton.addActionListener(new ActionListener() {
	       
	public void actionPerformed(ActionEvent e) {
	        	 String text = input.getText();
	        	 if (!text.isEmpty()) {
	        		 message.setText(orgText);
	        		 input.setText("");
	        		  stack.push(Integer.parseInt(text));
	        		  System.out.println("input = " + input);
	        		  myArea.setText(printStack());
	        		 
	                }
	        	 else{
	        		 String error = message.getText() +  "\n No Input";
	        		 message.setText(error);
	        	 }
	        	
	        }

	         });


	    JButton popButton  = new JButton("Pop");
	    pane.add(popButton);
	    popButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (!stack.isEmpty()) {
	    			stack.pop();
	    			 myArea.setText(printStack());
	    		}
	    		 else{
	    			 String error = message.getText() +  "\n No Input";
	        		 message.setText(error);
	                }
	    	}  		
	    
	    });

	    JButton peekButton = new JButton("Peek");
	   pane.add(peekButton);
	    peekButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (!stack.isEmpty()) {
	    			stack.peek();
	    			 myArea.setText(printStack());
	    		}
	    		 else{
	    			 String error = message.getText() +  "\n No Input";
	        		 message.setText(error);
	                }
	    	}  		
	    
	    });
	    
	    
	    
	    
	    JPanel display = new JPanel();
	    panel.add(display, BorderLayout.CENTER);
	   
	     
	    frame.getContentPane().add(pane);
	    frame.setVisible(true);

	}
	public static String printStack() {
		String container = "";
		for(int i : stack) {
			container += i+"\n";
		}
		return container;
	}}
	