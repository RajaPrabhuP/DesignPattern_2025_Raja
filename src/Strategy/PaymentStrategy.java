package Strategy;

public class PaymentStrategy {
		Card card;
		public PaymentStrategy() {
			this.card = card;
		}

		public void setCard(Card card){this.card = card;}
		void displayPassword() {
			System.out.println(card.getPassword());
		}
		void displayAccountNumeber() {
			System.out.println(card.getAccountNumber());
		}
		void displayBalance() {
			System.out.println(card.displayBalance());
		}
		void displayCardType() {
			System.out.println(card.displayCardType());
		}
}
