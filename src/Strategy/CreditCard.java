package Strategy;

public class CreditCard implements Card {

	@Override
	public String getPassword() {
		return "Credit Card Passoword R@J@";
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return "CreditCard Number 123456";
	}

	@Override
	public String displayCardType() {
		// TODO Auto-generated method stub
		return "Credit Card VISA";
	}

	@Override
	public String displayBalance() {
		return "Credit Card Balance 20K";
	}

}
