import javax.swing.JOptionPane;

public class VaultRunner {
public static void main(String[] args) {
	
	JamesBond jb = new JamesBond();
	Vault v = new Vault(1257);
	jb.findCode(v);
}
}
