package encap;

public class AccountMain {
	public static void main(String[] args) {
	Account a = new Account(11,"Sachi",20000);
	a.withdraw(78);
	System.out.println(a.getBalance());
}
}
