package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private long oldCard;
    private int balance;
    private long card;

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    public long getCard() {
        return card;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
