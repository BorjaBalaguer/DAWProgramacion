package Tema5;

public class TicketMachine2 {
     // The price of a ticket from this machine.
     private int price;
     // The amount of money entered by a customer so far.
     private int balance;
     // The total amount of money collected by this machine.
     private int total;

     private int discount;
 
     //1
     public int emptyMachine(){
        int acum = total;
        total = 0;
        return acum;
     }

     //3
     public void setDiscount(){
       ;
     }

     /**
      * Create a machine that issues tickets of the given price.
      */
     public TicketMachine2(int cost)
     {
         price = cost;
         balance = 0;
         total = 0;
         discount = 0;
     }
       
     public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = 20;
    }

    public void resetDiscount(){
        this.discount = 0;
    }

    /**
      * @Return The price of a ticket.
      */
     public int getPrice()
     {
         return price;
     }
 
     /**
      * Return The amount of money already inserted for the
      * next ticket.
      */
     public int getBalance()
     {
         return balance;
     }
 
     /**
      * Receive an amount of money from a customer.
      * Check that the amount is sensible.
      */
     public void insertMoney(int amount)
     {
         if(amount > 0) {
             balance = balance + amount;
         }
         else {
             System.out.println("Use a positive amount rather than: " +
                                amount);
         }
     }
 
     /**
      * Print a ticket if enough money has been inserted, and
      * reduce the current balance by the ticket price. Print
      * an error message if more money is required.
      */
     public void printTicket()
     {
        int actuaPrice = price * (100 - discount)/100;
        int amountToPay = actuaPrice - balance;


         if(amountToPay <=0) {
             // Simulate the printing of a ticket.
             System.out.println("##################");
             System.out.println("# The BlueJ Line");
             System.out.println("# Ticket");
             System.out.println("# " + actuaPrice + " cents.");
             System.out.println("##################");
             System.out.println();
 
             // Update the total collected with the price.
             total = total + actuaPrice;
             // Reduce the balance by the price.
             balance = balance - actuaPrice;
         }
         else {
             System.out.println("You must insert at least: " +
                                (amountToPay) + " more cents.");
                     
         }
     }
 
     /**
      * Return the money in the balance.
      * The balance is cleared.
      */
     public int refundBalance()
     {
         int amountToRefund;
         amountToRefund = balance;
         balance = 0;
         return amountToRefund;

    }
}