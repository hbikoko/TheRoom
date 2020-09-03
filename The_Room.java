import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//first, create the GUI window.Lines 17-24 are the way to create a window
//second, create a text box (a JPanel) on the window. You will put the text on this panel soon. (Lines 29-34)
//third, create the text to the put on the panel. When creating the text, add the label to the panel and then: set opaque to true, add background, add foreground, add font, etc 
//fourth, create the start button.
//fifth, add a function to the button so that clicking it takes you to a new screen.
public class The_Room {
	 
	JFrame window;
	Container container;
	
	JPanel titleNamePanel;
	JPanel mainPanel;
	JPanel textPanel1A;
	JPanel go_northButtonPanel;
	JPanel westButtonPanel;
	JPanel textPanel2A;
	JPanel lift_paintingButtonPanel;
	JPanel lift_mattressButtonPanel;
	JPanel textPanel2B;
	JPanel bottleButtonPanel;
	JPanel hammerButtonPanel;
	JPanel textPanel3A;
	JPanel textPanel3B;
	JPanel keyButtonPanel;
	JPanel hammerBButtonPanel;
	JPanel open_door_ButtonPanel;
	JPanel textPanel4A;
	JPanel break_lockButtonPanel;
	JPanel textPanel4B;
	JPanel textPanel4C;
	JPanel unlock_doorButtonPanel;
	JPanel youDied5A;
	JPanel textPanel5A;
	JPanel youWon5B;
	JPanel textPanel5B;
	JPanel youDied5C;
	JPanel textPanel5C;
	
	JButton startButton;
	JButton go_north;
	JButton west;
	JButton lift_painting;
	JButton lift_mattress;
	JButton bottle;
	JButton hammer;
	JButton key;
	JButton hammerB;
	JButton open_door_;
	JButton break_lock;
	JButton unlock_door;
	
	JTextArea TextArea1A; //A JLabel that allows multiple lines of text
	JTextArea TextArea2A;
	JTextArea TextArea2B;
	JTextArea TextArea3A;
	JTextArea TextArea3B;
	JTextArea TextArea4A;
	JTextArea TextArea4B;
	JTextArea TextArea4C;
	JTextArea TextArea5A;
	JTextArea TextArea5B;
	JTextArea TextArea5C;
	
	JLabel titleNameLabel;
	JLabel youDied5ALabel;
	JLabel youWon5BLabel;
	JLabel youDied5CLabel;
	
	public static void main(String[] args) {
		new The_Room();
	}
	
	public The_Room() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.MAGENTA); //you can't change color w/o .getContentPane() 
		window.setLayout(null); //set it to null now (the default), so that you can customize the layout later
		window.setVisible(true);
		window.setTitle("THE ROOM");
		container = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(10, 100, 800, 150); //I can use setBounds(x, y, width, height) to specify the position and size of a GUI component (in this case, the JPanel) if you set the layout to null. Then (x, y) is the coordinate of the upper-left corner of that component.
		//The numbers help set aside the space that my title will be on. The space will start from (100,100) and have a width of 600 and length of 150.
		titleNamePanel.setBackground(Color.MAGENTA);
		titleNameLabel = new JLabel("THE ROOM");
		container.add(titleNamePanel); //so, the Container is the base of the JFrame. Everything (panel, button, etc) goes on top of the frame and thus, on top of the container.
		//If you didn't add titleNamePanel to the container, you wouldnt be able to see titleNamePanel. 
		titleNamePanel.add(titleNameLabel);
		titleNameLabel.setFont(new java.awt.Font("Arial", Font.BOLD, 120));
		titleNameLabel.setOpaque(true);
		titleNameLabel.setBackground(Color.MAGENTA);
		titleNameLabel.setForeground(Color.WHITE); //This method is how you set the text color
		
		startButton = new JButton();
		startButton.setText("START");
		startButton.setFont(new java.awt.Font("Arial", Font.BOLD, 50));
		startButton.setBounds(300, 300, 200, 100);
		startButton.addActionListener(new ButtonListener());
		container.add(startButton);
		
	}
	
	public void createGameScreen() {
			
			titleNamePanel.setVisible(false); //this panel and the start button will be set invisible, so that the new screen (brought by the TitleHandler class) can replace them
			startButton.setVisible(false);
			
			go_northButtonPanel = new JPanel();
			go_northButtonPanel.setBounds(300,400,200,100);
			go_northButtonPanel.setBackground(Color.MAGENTA);
			
			go_north = new JButton();
			go_north.setBackground(Color.BLACK);
			go_north.setForeground(Color.BLACK);
			go_north.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
			go_north.setBounds(300, 300, 200, 100);
			go_north.addActionListener(new ButtonListener());
			go_northButtonPanel.add(go_north);
			go_north.setText("GO NORTH");
			container.add(go_northButtonPanel);
			
			westButtonPanel = new JPanel();
			westButtonPanel.setBounds(300,500,200,200);
			westButtonPanel.setBackground(Color.MAGENTA);
			container.add(westButtonPanel);
			
			west = new JButton();
			west.setBackground(Color.BLACK);
			west.setForeground(Color.BLACK);
			west.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
			west.setBounds(300, 500, 200, 200);
			west.addActionListener(new ButtonListener());
			westButtonPanel.add(west);
			west.setText("GO WEST");
			
			textPanel1A = new JPanel();
			textPanel1A.setBounds(0,100,800,850);
			textPanel1A.setBackground(Color.MAGENTA);
			container.add(textPanel1A);
			
			TextArea1A = new JTextArea("You wake up in a small, cell-like room. Where are you? Who are you? You don't remember anything, but all you know is that you're trapped inside this room and you need to ESCAPE.");
			TextArea1A.setBounds(0,100,800,850);
			TextArea1A.setBackground(Color.MAGENTA);
			TextArea1A.setForeground(Color.BLACK);
			TextArea1A.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
			TextArea1A.setLineWrap(true);
			TextArea1A.setWrapStyleWord(true);
			textPanel1A.add(TextArea1A);
			
			
	}
	
	public void createGameScreen2A() {
		titleNamePanel.setVisible(false);
		startButton.setVisible(false);
		go_northButtonPanel.setVisible(false);
		westButtonPanel.setVisible(false);
		west.setVisible(false);
		textPanel1A.setVisible(false);
		TextArea1A.setVisible(false);
		
		lift_paintingButtonPanel = new JPanel();
		lift_paintingButtonPanel.setBounds(300,400,200,100);
		lift_paintingButtonPanel.setBackground(Color.MAGENTA);
		
		lift_painting = new JButton();
		lift_painting.setBackground(Color.BLACK);
		lift_painting.setForeground(Color.BLACK);
		lift_painting.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		lift_painting.setBounds(300, 300, 200, 100);
		lift_painting.addActionListener(new ButtonListener());
		lift_paintingButtonPanel.add(lift_painting);
		lift_painting.setText("LIFT PAINTING");
		container.add(lift_paintingButtonPanel); 
		
		textPanel2A = new JPanel();
		textPanel2A.setBounds(0,100,800,850);
		textPanel2A.setBackground(Color.MAGENTA);
		container.add(textPanel2A);
		
		TextArea2A = new JTextArea("In front of you, there's a large, impeccable painting. The immaculate painting features a blonde, blue-eyed young mother smiling down at her similarly blond and blue-eyed baby boy. Could the painting be a distraction, covering up a clue on the wall?");
		TextArea2A.setBounds(0,100,800,850);
		TextArea2A.setBackground(Color.MAGENTA);
		TextArea2A.setForeground(Color.BLACK);
		TextArea2A.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea2A.setLineWrap(true);
		TextArea2A.setWrapStyleWord(true);
		textPanel2A.add(TextArea2A);
		
	}
	
	public void createGameScreen2B() {
		go_northButtonPanel.setVisible(false);
		westButtonPanel.setVisible(false);
		west.setVisible(false);
		textPanel1A.setVisible(false);
		TextArea1A.setVisible(false);
		
		lift_mattressButtonPanel = new JPanel();
		lift_mattressButtonPanel.setBounds(300,400,200,100);
		lift_mattressButtonPanel.setBackground(Color.MAGENTA);
		
		lift_mattress = new JButton();
		lift_mattress.setBackground(Color.BLACK);
		lift_mattress.setForeground(Color.BLACK);
		lift_mattress.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		lift_mattress.setBounds(300, 300, 200, 100);
		lift_mattress.addActionListener(new ButtonListener());
		lift_mattressButtonPanel.add(lift_mattress);
		lift_mattress.setText("LIFT MATTRESS");
		container.add(lift_mattressButtonPanel); 
		
		textPanel2B = new JPanel();
		textPanel2B.setBounds(0,100,800,850);
		textPanel2B.setBackground(Color.MAGENTA);
		container.add(textPanel2B);
		
		TextArea2B = new JTextArea("The wretched, disgusting smell is the first thing you notice. The mattress itself has the smell of alcohol, and several stains. Could someone have been here drinking on the mattress? But, where is the alcohol? Maybe under the mattress?");
		TextArea2B.setBounds(0,100,800,850);
		TextArea2B.setBackground(Color.MAGENTA);
		TextArea2B.setForeground(Color.BLACK);
		TextArea2B.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea2B.setLineWrap(true);
		TextArea2B.setWrapStyleWord(true);
		textPanel2B.add(TextArea2B);
		
	}
	
	public void createGameScreen3A() {
		lift_paintingButtonPanel.setVisible(false);
		lift_painting.setVisible(false);
		textPanel2A.setVisible(false);
		TextArea2A.setVisible(false);
		
		bottleButtonPanel = new JPanel();
		bottleButtonPanel.setBounds(300,400,200,100);
		bottleButtonPanel.setBackground(Color.MAGENTA);
		
		bottle = new JButton();
		bottle.setBackground(Color.BLACK);
		bottle.setForeground(Color.BLACK);
		bottle.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		bottle.setBounds(300, 300, 200, 100);
		bottle.addActionListener(new ButtonListener());
		bottleButtonPanel.add(bottle);
		bottle.setText("TAKE BOTTLE");
		container.add(bottleButtonPanel); 
		
		hammerButtonPanel = new JPanel();
		hammerButtonPanel.setBounds(300,500,200,100);
		hammerButtonPanel.setBackground(Color.MAGENTA);
		
		hammer = new JButton();
		hammer.setBackground(Color.BLACK);
		hammer.setForeground(Color.BLACK);
		hammer.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		hammer.setBounds(300, 500, 200, 100);
		hammer.addActionListener(new ButtonListener());
		hammerButtonPanel.add(hammer);
		hammer.setText("TAKE HAMMER");
		container.add(hammerButtonPanel); 
		
		textPanel3A = new JPanel();
		textPanel3A.setBounds(0,100,800,850);
		textPanel3A.setBackground(Color.MAGENTA);
		container.add(textPanel3A);
		
		TextArea3A = new JTextArea("The painting is heavy, but you manage to take it down quietly. Don't want any loud noises - after all, who knows if there's someone outside this door, waiting for you? The thought is too creepy to consider. Now that you've taken the painting down, you see a hammer and a pepper spray bottle taped to the wall where the painting had been. You can only take one. Pepper spray isn't bad - there could be someone waiting to attack you once you escape the room. Which do you choose to escape the room?");
		TextArea3A.setBounds(0,100,800,850);
		TextArea3A.setBackground(Color.MAGENTA);
		TextArea3A.setForeground(Color.BLACK);
		TextArea3A.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea3A.setLineWrap(true);
		TextArea3A.setWrapStyleWord(true);
		textPanel3A.add(TextArea3A);
		
	}
	
	public void createGameScreen3B() {
		lift_mattressButtonPanel.setVisible(false);
		lift_mattress.setVisible(false);
		textPanel2B.setVisible(false);
		TextArea2B.setVisible(false);
		
		keyButtonPanel = new JPanel();
		keyButtonPanel.setBounds(300,400,200,100);
		keyButtonPanel.setBackground(Color.MAGENTA);
		
		key = new JButton();
		key.setBackground(Color.BLACK);
		key.setForeground(Color.BLACK);
		key.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		key.setBounds(300, 300, 200, 100);
		key.addActionListener(new ButtonListener());
		keyButtonPanel.add(key);
		key.setText("TAKE KEY");
		container.add(keyButtonPanel); 
		
		hammerBButtonPanel = new JPanel();
		hammerBButtonPanel.setBounds(300, 500, 200, 100);
		hammerBButtonPanel.setBackground(Color.MAGENTA);
		
		hammerB = new JButton();
		hammerB.setBackground(Color.BLACK);
		hammerB.setForeground(Color.BLACK);
		hammerB.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		hammerB.setBounds(300, 500, 200, 100);
		hammerB.addActionListener(new ButtonListener());
		hammerBButtonPanel.add(hammerB);
		hammerB.setText("TAKE HAMMER");
		container.add(hammerBButtonPanel); 
		
		textPanel3B = new JPanel();
		textPanel3B.setBounds(0,100,800,850);
		textPanel3B.setBackground(Color.MAGENTA);
		container.add(textPanel3B);
		
		TextArea3B = new JTextArea("Holding your breath as you lift the mattress, you don't see any alcohol bottles. No telling where that alcohol smell is coming from. Instead, you see a bright yellow key. Is this your way out? Right next to the key is a hammer. You can only take one, either the key or the hammer. Well, there could be an attacker outside the room, so a hammer would be nice. But, the hammer would make such a ruckus. However, a key is silent and can allow you to slip out of the room without a sound. Which do you take?");
		TextArea3B.setBounds(0,100,800,850);
		TextArea3B.setBackground(Color.MAGENTA);
		TextArea3B.setForeground(Color.BLACK);
		TextArea3B.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea3B.setLineWrap(true);
		TextArea3B.setWrapStyleWord(true);
		textPanel3B.add(TextArea3B);
	}
	
	public void createGameScreen4A() {
		bottleButtonPanel.setVisible(false);
		bottle.setVisible(false);
		hammerButtonPanel.setVisible(false);
		hammer.setVisible(false);
		textPanel3A.setVisible(false);
		TextArea3A.setVisible(false);
		
		open_door_ButtonPanel = new JPanel();
		open_door_ButtonPanel.setBounds(300,400,200,100);
		open_door_ButtonPanel.setBackground(Color.MAGENTA);
		
		open_door_ = new JButton();
		open_door_.setBackground(Color.BLACK);
		open_door_.setForeground(Color.BLACK);
		open_door_.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		open_door_.setBounds(300, 400, 200, 100);
		open_door_.addActionListener(new ButtonListener());
		open_door_ButtonPanel.add(open_door_);
		open_door_.setText("GO TO DOOR");
		container.add(open_door_ButtonPanel); 
		
		textPanel4A = new JPanel();
		textPanel4A.setBounds(0,100,800,850);
		textPanel4A.setBackground(Color.MAGENTA);
		container.add(textPanel4A);
		
		TextArea4A = new JTextArea("You grabbed the pepper spray. Right choice? We'll see. At least, if someone is nearby and they aren't friendly, you have a way to protect yourself. Anxious, you go to the door of the room and wrap your hand around the cold, eery doorknob. Oh wait - it's not even locked anymore! What? Someone must have unlocked the door from the outside. But how? When? Nonetheless, you grip your pepper spray and take a deep breath. Time to see what's out there.");
		TextArea4A.setBounds(0,100,800,850);
		TextArea4A.setBackground(Color.MAGENTA);
		TextArea4A.setForeground(Color.BLACK);
		TextArea4A.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea4A.setLineWrap(true);
		TextArea4A.setWrapStyleWord(true);
		textPanel4A.add(TextArea4A);
	}
	
	public void createGameScreen4B() {
		
		break_lockButtonPanel = new JPanel();
		break_lockButtonPanel.setBounds(300,400,200,100);
		break_lockButtonPanel.setBackground(Color.MAGENTA);
		
		break_lock = new JButton();
		break_lock.setBackground(Color.BLACK);
		break_lock.setForeground(Color.BLACK);
		break_lock.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		break_lock.setBounds(300, 400, 200, 100);
		break_lock.addActionListener(new ButtonListener());
		break_lockButtonPanel.add(break_lock);
		break_lock.setText("BREAK LOCK");
		container.add(break_lockButtonPanel); 
		
		textPanel4B = new JPanel();
		textPanel4B.setBounds(0,100,800,850);
		textPanel4B.setBackground(Color.MAGENTA);
		container.add(textPanel4B);
		
		TextArea4B = new JTextArea("You grabbed the hammer. If there's anyone outside who isn't friendly, you can deal with them with your hammer. Plus, so what if they hear you breaking the lock? As long as you have your weapon, you're prepared for anything. So, you walk up to the closed door and feel the cold doorknob - the door's unlocked now! Closed, but unlocked. How? Regardless, you open the door and walk into a new room. The room is so small, and vacant. There's another door up ahead now. Locked. This is clearly some kind of set-up. It's time to find the truth.");
		TextArea4B.setBounds(0,100,800,850);
		TextArea4B.setBackground(Color.MAGENTA);
		TextArea4B.setForeground(Color.BLACK);
		TextArea4B.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea4B.setLineWrap(true);
		TextArea4B.setWrapStyleWord(true);
		textPanel4B.add(TextArea4B);
	}
	
	public void createGameScreen4C() {
		keyButtonPanel.setVisible(false);
		key.setVisible(false);
		hammerBButtonPanel.setVisible(false);
		hammerB.setVisible(false);
		textPanel3B.setVisible(false);
		TextArea3B.setVisible(false);
		
		unlock_doorButtonPanel = new JPanel();
		unlock_doorButtonPanel.setBounds(300,400,200,100);
		unlock_doorButtonPanel.setBackground(Color.MAGENTA);
		
		unlock_door = new JButton();
		unlock_door.setBackground(Color.BLACK);
		unlock_door.setForeground(Color.BLACK);
		unlock_door.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		unlock_door.setBounds(300, 400, 200, 100);
		unlock_door.addActionListener(new ButtonListener());
		unlock_doorButtonPanel.add(unlock_door);
		unlock_door.setText("UNLOCK DOOR");
		container.add(unlock_doorButtonPanel); 
		
		textPanel4C = new JPanel();
		textPanel4C.setBounds(0,100,800,850);
		textPanel4C.setBackground(Color.MAGENTA);
		container.add(textPanel4C);
		
		TextArea4C = new JTextArea("With your key, you head over to the door. Wrapping your hand around the cold knob, you realize that the door has actually been unlocked. It was locked when you first woke up - what happened? Regardless, you open it, only to be right in front of another door. This second door is locked. This has clearly been set up by someone. Time to unlock this second door and find out who.");
		TextArea4C.setBounds(0,100,800,850);
		TextArea4C.setBackground(Color.MAGENTA);
		TextArea4C.setForeground(Color.BLACK);
		TextArea4C.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea4C.setLineWrap(true);
		TextArea4C.setWrapStyleWord(true);
		textPanel4C.add(TextArea4C);
	}
	
	public void createGameScreen5A() {
		open_door_ButtonPanel.setVisible(false);
		open_door_.setVisible(false);
		textPanel4A.setVisible(false);
		TextArea4A.setVisible(false);
		
		youDied5A = new JPanel();
		youDied5A.setBounds(300,400,200,100);
		youDied5A.setBackground(Color.BLACK);
		container.add(youDied5A);
		
		youDied5ALabel = new JLabel();
		youDied5ALabel.setBounds(300,600,200,100);
		youDied5ALabel.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
		youDied5ALabel.setBackground(Color.BLACK);
		youDied5ALabel.setForeground(Color.WHITE);
		youDied5ALabel.setText("YOU LOST.");
		youDied5A.add(youDied5ALabel);
		
		
		textPanel5A = new JPanel();
		textPanel5A.setBounds(0,100,800,850);
		textPanel5A.setBackground(Color.MAGENTA);
		container.add(textPanel5A);
		
		TextArea5A = new JTextArea("In front you... is another door. You feel the second door's doorknob and it's locked. Damn, you should have gotten the hammer! As you turn around to go back to get the hammer, the first door shuts automatically. Someone's controlling the locks remotely! With only a bottle of pepper spray, you're powerless as you're trapped in between two locked doors. There's no escape, and you have to sit here trapped between two locked doors - for the rest of your life.");
		TextArea5A.setBounds(0,100,800,850);
		TextArea5A.setBackground(Color.MAGENTA);
		TextArea5A.setForeground(Color.BLACK);
		TextArea5A.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea5A.setLineWrap(true);
		TextArea5A.setWrapStyleWord(true);
		textPanel5A.add(TextArea5A);
	}
	
	public void createGameScreen5B() {
		break_lockButtonPanel.setVisible(false);
		break_lock.setVisible(false);
		textPanel4B.setVisible(false);
		TextArea4B.setVisible(false);
		
		youWon5B = new JPanel();
		youWon5B.setBounds(300,400,200,100);
		youWon5B.setBackground(Color.WHITE);
		container.add(youWon5B);
		
		youWon5BLabel = new JLabel();
		youWon5BLabel.setBounds(300,600,200,100);
		youWon5BLabel.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
		youWon5BLabel.setBackground(Color.WHITE);
		youWon5BLabel.setForeground(Color.BLACK);
		youWon5BLabel.setText("YOU WON.");
		youWon5B.add(youWon5BLabel);
		
		textPanel5B = new JPanel();
		textPanel5B.setBounds(0,100,800,850);
		textPanel5B.setBackground(Color.MAGENTA);
		container.add(textPanel5B);
		
		TextArea5B = new JTextArea("BANG! BANG! BANG! After 3 tries, you've popped the lock so loudly that your eardrums rang a bit. Obviously, if someone's nearby, they heard the sound. With the lock busted, you easily pry the door open. Now that you've passed the second door, in front of you lies the largest dog you've ever seen. Its teeth are huge, and the dog is covered in thick, black fur. Someone placed this dog here intentionally. As the dog growls at you, you pull your hammer out of your pocket and grip it for dear life. Scared, the dog turns around and runs down the hallway. This long, narrow hallway seems to be the only way out of here. At the end of the hallway, you can see a white door that's open and leads directly outdoors. The cold wind coming inside from the open door makes you shiver, but you're finally happy that you can leave and find out what's going on.");
		TextArea5B.setBounds(0,100,800,850);
		TextArea5B.setBackground(Color.MAGENTA);
		TextArea5B.setForeground(Color.BLACK);
		TextArea5B.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea5B.setLineWrap(true);
		TextArea5B.setWrapStyleWord(true);
		textPanel5B.add(TextArea5B);
	}

	public void createGameScreen5C() {
		unlock_doorButtonPanel.setVisible(false);
		unlock_door.setVisible(false);
		textPanel4C.setVisible(false);
		TextArea4C.setVisible(false);
		
		youDied5C = new JPanel();
		youDied5C.setBounds(300,400,200,100);
		youDied5C.setBackground(Color.BLACK);
		container.add(youDied5C);
		
		youDied5CLabel = new JLabel();
		youDied5CLabel.setBounds(300,600,200,100);
		youDied5CLabel.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
		youDied5CLabel.setBackground(Color.BLACK);
		youDied5CLabel.setForeground(Color.WHITE);
		youDied5CLabel.setText("YOU LOST.");
		youDied5C.add(youDied5CLabel);
		
		textPanel5C = new JPanel();
		textPanel5C.setBounds(0,100,800,850);
		textPanel5C.setBackground(Color.MAGENTA);
		container.add(textPanel5C);
		
		TextArea5C = new JTextArea("Without a sound, you unlock the second door. In front of you, there's the largest dog you've ever seen! Covered in thick, black fur and growling with sharp teeth, all you have is a key to defend yourself. Before you can think of a resourceful way to attack the dog with the key, he lunges at you. It's over.");
		TextArea5C.setBounds(0,100,800,850);
		TextArea5C.setBackground(Color.MAGENTA);
		TextArea5C.setForeground(Color.BLACK);
		TextArea5C.setFont(new java.awt.Font("Arial", Font.PLAIN, 20));
		TextArea5C.setLineWrap(true);
		TextArea5C.setWrapStyleWord(true);
		textPanel5C.add(TextArea5C);
	}
	
	//we needed to make an action listener, so that the button can react to clicks. 
	//when you click the button, it executes the actionPerformed() in the ButtonListener class.
	
private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == startButton) {
				createGameScreen();
			} else if(e.getSource() == go_north) {
				createGameScreen2A();
			} else if(e.getSource() == west) {
				createGameScreen2B();
			} else if(e.getSource() == lift_painting) {
				createGameScreen3A();
			} else if(e.getSource() == lift_mattress) {
				createGameScreen3B();
			} else if(e.getSource() == bottle) {
				createGameScreen4A();
			} else if(e.getSource() == hammer) {
				bottleButtonPanel.setVisible(false);
				bottle.setVisible(false);
				hammerButtonPanel.setVisible(false);
				hammer.setVisible(false);
				textPanel3A.setVisible(false);
				TextArea3A.setVisible(false);
				createGameScreen4B();
			} else if(e.getSource() == key) {
				createGameScreen4C(); //GameScreen3B becomes GameScreen4C IF you choose the key.
			} else if(e.getSource() == hammerB) {
				keyButtonPanel.setVisible(false);
				key.setVisible(false);
				hammerBButtonPanel.setVisible(false);
				hammerB.setVisible(false);
				createGameScreen4B();
			} else if(e.getSource() == open_door_) {
				createGameScreen5A();
			} else if(e.getSource() == break_lock) {
				createGameScreen5B();
			} else if(e.getSource() == unlock_door) {
				createGameScreen5C();
			}
			
		}
	}
}