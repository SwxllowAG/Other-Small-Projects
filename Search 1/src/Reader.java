import javax.swing.JFrame;

public class Reader {
	public static void main(String args[])
	{
		Search r = new Search("Search");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(180, 130);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}
