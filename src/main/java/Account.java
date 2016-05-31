import java.net.ConnectException;

public  class Account {
    private static IAssessmentService service = new IAssessmentService.AssessmentService();
    static long credit;

    private final boolean isDebit;
    long balance;



    protected Account(boolean isDebit) {
        this.isDebit = isDebit;
    }

    public static Account openDebitAccount() {
        return new DebitAccount();
    }

    public static Account openCreditAccount(IAssessmentService service) throws ConnectException {
        credit = service.getCredit("asd");
        return new CreditAccount();
    }

    public static Account openAccount() {
        return new Account(false);
    }



    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) {

        balance -= amount;
    }

    public long getBalance() {
        return balance;
    }
}
