public class AccountBalance {
	public static void main(String[] args) {
		double balance = 1000;
		double interest = 0.05;
		System.out.print("Initial balance is ");
		System.out.println(balance);

		balance=balance+(balance*interest);
		System.out.print("First year balance is ");
		System.out.println(balance);

		balance=balance+(balance*interest);
		System.out.print("Second year balance is ");
		System.out.println(balance);

		balance=balance+(balance*interest);
		System.out.print("Third year balance is ");
		System.out.println(balance);
	}
}
