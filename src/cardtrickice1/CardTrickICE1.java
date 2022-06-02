package CardTrickICE1;
import java.util.Random;
import java.util.Scanner;
import CardTrickICE1.Card.suits;
public class CardTrickICE1 {
	
   
    public static void main(String[] args) {
	    Card luckyCard = new Card();
	    luckyCard.setvalue(4);
	    luckyCard.setSuits(Card.SUITS[2]);
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i]  = new Card();
            Random randomObject = new Random();
			
			int randomCardValue = randomObject.nextInt(13)+1;
			int randomCardSuit = randomObject.nextInt(4);
			
			
            magicHand[i].setValue(randomCardValue);
            magicHand[i].setSuits(Card.SUITS[randomCardSuit]);
            System.out.println(magicHand[i].getValue());
            System.out.println(magicHand[i].getSuits());
            
        }
        Scanner sc = new Scanner(System.in);
		System.out.println("Card Value : Enter value from {1 - 13} : ");
		int selectedCardByUserValue = sc.nextInt();
		
		System.out.println("Card Suit : Enter value from {1 - 4} : ");
		int selectedCardByUserSuit = sc.nextInt();
			
		Card selectedCardByUser = new Card();
		selectedCardByUser.setValue(selectedCardByUserValue);
        selectedCardByUser.setSuits(Card.SUITS[selectedCardByUserSuit-1]);
        
		
		
        for (Card magicHand1 : magicHand) {
            if (selectedCardByUser.getSuits()
                    .equals(magicHand1.getSuits()) && selectedCardByUser.getValue() == magicHand1.getValue()) {
                System.out.println("Card found ");
            } else {
                System.out.println("Card Not found !!");
            }
        }
	}
}
