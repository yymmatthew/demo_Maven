import org.junit.Test;

import java.net.ConnectException;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by YYM-M on 5/30/16.
 */

public class AccoutTest implements IAssessmentService {

    private int CREDIT;

    @Test
    public void should_increase_balance_when_deposit_from_DebitAccount() {
        //given
        Account debit=Account.openDebitAccount();
        long oldbalance=debit.getBalance();

        //When
        debit.deposit(100L);
        //Then
        assertThat(debit.getBalance(),is(oldbalance+100L));
    }

    @Test
    public void should_decrese_balance_when_withdraw_from_DebitAccount() {
        //given
        Account debit=Account.openDebitAccount();
        long oldbalance=debit.getBalance();
        //When
        debit.deposit(100L);
        debit.withdraw(100L);
        //Then
        assertThat(debit.getBalance(),is(oldbalance));
    }

    @Test
    public void should_decrese_balance_when_withdraw_without_balance_from_DebitAccount() {
        //given
        Account debit=Account.openDebitAccount();
        long oldbalance=debit.getBalance();
        //When


        //Then
        try{
            debit.withdraw(oldbalance+100L);
            fail();
        }catch (InsufficientFundsException e){
            assertThat(debit.getBalance(),is(oldbalance));
        }

    }

    @Test
    public void should_increase_balance_when_deposit_from_creditAccount() throws ConnectException {
        //given
        CREDIT =3000;
        Account account=Account.openCreditAccount(this);
        long oldbalance=account.getBalance();

        //When
        account.deposit(100L);
        //Then
        assertThat(account.getBalance(),is(oldbalance+100L));
        //Then
    }

    @Test
    public void should_decrese_balance_when_withdraw_from_creditAccount() throws ConnectException {
        //given
        CREDIT = 5000;
        Account account=Account.openCreditAccount(this);
        long oldbalance=account.getBalance();
        //When
//      account.deposit(100L);

        account.withdraw(3000L);


        assertThat(account.getBalance(),is(-3000L));
        //Then

    }

    @Test
    public void should_decrese_balance_when_withdraw_without_balance_from_creditAccount() throws ConnectException {
        //given
        CREDIT = 3000;
        Account account=Account.openCreditAccount(this);
        long oldbalance=account.getBalance();
        //When


        //Then
        try{
            account.withdraw(oldbalance+ this.CREDIT +100L);
            fail();
        }catch (InsufficientFundsException e){
            assertThat(account.getBalance(),is(oldbalance));
        }

    }


    @Override
    public long getCredit(String socialSecurityNumber) throws ConnectException {

        return CREDIT;
    }
}
