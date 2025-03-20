package Strategy;

public class PaymentModule {

	public static void main(String[] args) {
		
		PaymentStrategy strategy = new PaymentStrategy();
		strategy.setCard(new CreditCard());
		strategy.displayAccountNumeber();
		strategy.displayBalance();
		strategy.displayCardType();
		strategy.displayPassword();
		strategy.displayPassword();
	}

}
