import javax.swing.JOptionPane;



public class TeaRunner {
public static void main(String[] args) {
	String f = JOptionPane.showInputDialog("do u want GREEN ,MINT ,CHAMOMILE, or PASSION_FRUIT");
	TeaBag tb = new TeaBag(f);
	Kettle k = new Kettle();
	Cup c = new Cup();
	k.boil();
	c.makeTea(tb,k.getWater() );
}
}
