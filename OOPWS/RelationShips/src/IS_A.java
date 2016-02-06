class Account{
	void withDraw(){
		System.out.println("Account Class WithDraw");
	}
	void deposit(){
		System.out.println("Account Class Deposit");
	}
	void roi(){
		System.out.println("Account Class ROI");
	}
}
class SavingAccount extends Account{
	@Override
	void roi(){
		super.roi();
		System.out.println("Saving Account Class ROI Pay");
	}
}
class CurrentAccount extends Account{
	
}
public class IS_A {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.withDraw();
		sa.roi();

	}

}
