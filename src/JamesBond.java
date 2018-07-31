import javax.swing.JOptionPane;

public class JamesBond {
	

	 int findCode(Vault Vault) {
	 for (int i = 0; i < 1000000; i++) {
		if(Vault.tryCode(i)) {
			System.out.println(i);
			return(i);
		}
	}
	 return(-1);
	 }
}
