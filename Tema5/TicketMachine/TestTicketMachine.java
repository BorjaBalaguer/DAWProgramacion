package Tema5.TicketMachine;

public class TestTicketMachine {
    public static void main(String[] args) {
        TicketMachine maquina = new TicketMachine();
       
        maquina.prompt();
        maquina.insertMoney(200);
        maquina.insertMoney(100);
        maquina.printTicket();
        maquina.showPrice();
        maquina.empty();
        maquina.showPrice();
        
    }
}
