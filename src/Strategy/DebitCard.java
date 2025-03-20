package Strategy;

public class DebitCard implements Card{

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "DebitCard PR@BHU";
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return "DebitCard 1234567";
	}

	@Override
	public String displayCardType() {
		return "DebitCard MasterCard";
	}

	@Override
	public String displayBalance() {
		return "DebitCard 50k";
	}

}
