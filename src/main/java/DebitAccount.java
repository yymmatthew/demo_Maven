/**
 * Created by YYM-M on 5/30/16.
 */
public class DebitAccount extends Account {
    protected DebitAccount() {
        super(true);
    }

    @Override
    public void withdraw(long amount) {
        boolean insufficientFunds = getBalance() < amount;
        if (insufficientFunds) {
            throw new InsufficientFundsException();
        }
        super.withdraw(amount);
    }
}
