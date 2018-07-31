import javax.swing.JOptionPane;

public class VaultRunner {
public static void main(String[] args) {
	
	JamesBond jb = new JamesBond();
	Vault v = new Vault();
	
	if(jb.findCode(v)==-1) {
		JOptionPane.showMessageDialog(null, "nope");
	}else {
		JOptionPane.showMessageDialog(null, "yea");
		
	}
}
}
