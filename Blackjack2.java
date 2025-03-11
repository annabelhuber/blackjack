import java.util.ArrayList;
import java.util.Random;


public class Blackjack2 {
    Deck myDeck = new Deck();
    Hand playerHand = new Hand();
    Hand dealerHand = new Hand();
    int reshuffleCutoff = 25;



    public static void main(String[] args)  {
        Blackjack2 myBlackjack = new Blackjack2(22);
        // Card card1 = new Card();
        // Card card2 = new Card(2);
        // System.out.println(card2);
        // myDeck.toString();
    }






    Blackjack2( int reshuffleCutoff)  {
        this.reshuffleCutoff = reshuffleCutoff;
        // Card myCard = new Card(3);
        // playerHand.add(myCard);
        // System.out.println(playerHand.size());
        System.out.println("The Deck is: ");
        myDeck.toString();
    }


    // public void reset(){
    //     // clears both the player Hand and the dealer Hand
    //     //if number of cards in the deck < reshuffleCutoff then make a new shuffled deck
    //     this.Hand.reset();
    // }


    // public void deal(){
    //     //deal out 2 cards from deck to dealer Hand and player Hand
    // }



    // public boolean playerTurn(){
    //     //have the player draw cards until the total >= 16
    //     //if total >21 return false
    // }




    // public boolean dealerTurn(){
    //     // same as playerturn except must draw a 17 or above
    // }




    public void setReshuffleCutoff(int cutoff){
        //assign the new cutoff value to the internal reshuffle cutoff field
        reshuffleCutoff = cutoff;
    }




    // public int getReshuffleCutoff(){
    //     //returns the current value of the reshuffle cutoff field
    // }



    // public String toString(){
    //     //returns a String that reps the state of the game - show both hands and totals
    // }





}




    class Card{

        private int num;

        public Card(){
            num = 0;
        }


        // constructor
        public Card(int v){
                num = v;
                if(v > 11){
                    System.out.println("Error: not in range of 1-11");
                }
                if (v<1){
                    System.out.println("Error: not in range of 1-11");
                }
        }


        // return the numeric value of the card
        public int getValue(){
            return num;
        }


        public String toString(){
        //what
            return Integer.toString(num);
         } 

    }









    class Hand  {
        ArrayList<Card> handArr = new ArrayList<Card>();

        public Hand(){
            // initialize the array list
            // this.handArr = new ArrayList();
        }


        public void reset(){
            // reset the hand to empty
            handArr.clear();
        }


        public void add(Card card){
            // add the card object to the hand
            handArr.add(card);
        }


        public int size(){
            //returns number of cards in the hand
            return handArr.size();
        }



        // public Card getCard(int i){
        //     // returns the card with index i
        //     return handArr.get(i); 
        // }



        // public int getTotalValue(){
        //     //returns the sum of the values in the hand

        //     for(int i = 0; i < handArr.size(); i++){
        //         int sum = handArr.get(i-1);
        //         return sum + sum;
        //     }
        // }




        public String toString(){
            // returns a string that has the contents of the hand
            return "hand: " + this.handArr;
        }

    }










class Deck  {
    ArrayList<Card> deckArr = new ArrayList<Card>();
   

    public Deck()   {
        // uses .build to build a deck of 52 cards
        // this.deckArr = new ArrayList();
        //build(deckArr); somehow use build to build it
        build();
    }



    public void build() {
        //builds a deck of 52 - 4 of each 2-9 &11, 16 cards of 10
        for(int i = 0; i < 4; i++){ // adds for of each 2-11
            for(int j = 2; j < 11; j++) {
                Card newCard = new Card(j);
                deckArr.add(newCard);
            }
        }

    
        // for(int k = 0; k < 13; k++){
        //     Card newCard = new Card(10);
        //     deckArr.add(newCard);
        // }
        
    }



    public int size()   {
        //returns number of cards in a deck
        return deckArr.size();
    }



    // public Card deal(int i){
    //     // returns top card (index 0) and removes from the deck
    //     i = 0;
    //     // String x = this.deckArr.get(i); does not like this
    //     // return x;
    //     // this.deckArr.remove(i);
    // }




//     public Card pick(int i){
//         // (optional) returns the card at position i and removes from the deck
//     }




    // public void shuffle(){
    //     //shuffles the deck
    //     Random myRandom = new Random();
    //     int x = myRandom.nextInt(deckArr.size());
    //     this.shuffleDeck.add(x);
    //     shuffleDeck = deckArr;
    // }



    public String toString()    {
        StringBuilder sb = new StringBuilder(300);
        //returns a string that has the deck written in a nice format (see the ordering)
        for(int i = 0; i < deckArr.size(); i++){
            Card y = deckArr.get(i);
            sb.append(y.toString());
            sb.append(",");
            
        }
        System.out.println(sb);
        return sb.toString();
    }


}

