// This app needs the class Die.java in the root directory

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoDiceGUI extends JFrame implements ActionListener
{
	// Instance Variables / graphical components for this class
	Font mainFont = new Font("Impact", Font.PLAIN, 32);
	JLabel title = new JLabel("Two Dice Game");
	JLabel playerLabel = new JLabel("The player's roll was: ");
	JLabel comLabel = new JLabel("The computer's roll was: ");
	JLabel result = new JLabel("");
	JTextField pRoll = new JTextField(4);
	JTextField cRoll = new JTextField(4);
	JButton button = new JButton("Click to Play");

	// Custom constructor for this class
	public TwoDiceGUI()
	{
		super("Two Dice Game");
		setBounds(450, 250, 300, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FlowLayout());
		setVisible(true);

		title.setFont(mainFont);
		result.setFont(mainFont);
		button.setBackground(Color.WHITE);
		button.setForeground(Color.BLACK);
		pRoll.setEditable(false);
		cRoll.setEditable(false);

		add(title);
		add(playerLabel);
		add(pRoll);
		add(comLabel);
		add(cRoll);
		add(button);
		add(result);

		// Add the event listener to the button component
		button.addActionListener(this);
	}

	//Event handling method for this class

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Create two objects from Die.java class
		Die playerDie = new Die();
		Die comDie = new Die();
		String outcome;

		// Processing phase to decide the outcome of the game
		if(playerDie.getDieValue() == comDie.getDieValue())
		{
			outcome = "We have a tie!";
			result.setForeground(Color.CYAN);
		}
		else if(playerDie.getDieValue() > comDie.getDieValue())
		{
			outcome = "The Player Wins!";
			result.setForeground(Color.GREEN);
		}
		else
		{
			outcome = "The Computer Wins :(";
			result.setForeground(Color.RED);
		}

		// Output to the GUI
		pRoll.setText("" + playerDie.getDieValue());
		cRoll.setText("" + comDie.getDieValue());
		result.setText(outcome);
		button.setText("Play Again?");
	}

	public static void main(String args[])
	{
		TwoDiceGUI frame = new TwoDiceGUI();
	}
}