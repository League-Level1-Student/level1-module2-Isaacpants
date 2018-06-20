
import javax.swing.JOptionPane;

public class Popcornaker {
	public static void main(String[] args) {
		String f = JOptionPane.showInputDialog("WHAT FLAVOR U WANT");
		String ti = JOptionPane.showInputDialog("WUT TIME U PUT IN");
		int t = Integer.parseInt(ti);
		Microwave mw = new Microwave();
		Popcorn p = new Popcorn(f);
mw.setTime(t);
mw.putInMicrowave(p);
mw.startMicrowave();
	}
}
