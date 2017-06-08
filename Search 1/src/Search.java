import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Search extends JFrame 
{
	JButton start;
	JTextField first, second, third, fourth, fifth, field;
	int[] mm = new int[5];
	int s;
	GAction handler = new GAction();
	public Search (String s)
	{
		super(s);
		setLayout (new FlowLayout());
		first = new JTextField (2);
		second = new JTextField (2);
		third = new JTextField (2);
		fourth = new JTextField (2);
		fifth = new JTextField (2);
		field = new JTextField (2);
		start = new JButton ("Search");
		add (first);
		add (second);
		add (third);
		add (fourth);
		add (fifth);
		add (field);
		add (start);
		start.addActionListener(handler);
	}
	public class GAction implements ActionListener
	{
		public void actionPerformed(ActionEvent ae) 
		{
			if (ae.getSource()==start)
			{
				mm[0] = Integer.parseInt(first.getText());
				mm[1] = Integer.parseInt(second.getText());
				mm[2] = Integer.parseInt(third.getText());
				mm[3] = Integer.parseInt(fourth.getText());
				mm[4] = Integer.parseInt(fifth.getText());
				s = Integer.parseInt(field.getText());
				for (int xx = 0; xx<5; xx++)
				{
					if (mm[xx]==s)
					{
						JOptionPane.showMessageDialog(null, "field index = " + xx);
					}
					else
					{
						
					}
				}
			}
		}
		
	}
	
}
