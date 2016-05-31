/**
 * Created by YYM-M on 5/30/16.
 */
public class CreditAccount extends Account {
    protected CreditAccount() {
        super(false);
    }


    @Override
    public void withdraw(long amount) {

        boolean insufficientFunds = getBalance()+credit < amount;
        if (insufficientFunds) {
            throw new InsufficientFundsException();
        }
        super.withdraw(amount);
    }
}
