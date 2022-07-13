package MasterClass.Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountBankTest {

    @Test
    public void deposit() {
        AccountBank accountBank = new AccountBank("Andrey", "Ermolenko", 1000.00, AccountBank.CHEKING);
        double balance = accountBank.deposit(200, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdrow() {
        fail("This test has yet to be implemented");
    }

    @Test
    public void getBalance_deposit() {
        AccountBank accountBank = new AccountBank("Andrey", "Ermolenko", 1000.00, AccountBank.CHEKING);
        accountBank.deposit(200, true);
        assertEquals(1200.00, accountBank.getBalance(), 0);
    }

    @Test
    public void getBalance_withdrow() {
        AccountBank accountBank = new AccountBank("Andrey", "Ermolenko", 1000.00, AccountBank.CHEKING);
        accountBank.withdrow(200, true);
        assertEquals(800.00, accountBank.getBalance(), 0);
    }

    @Test
    public void isCheking_true() {
        AccountBank accountBank = new AccountBank("Andrey", "Ermolenko", 1000.00, AccountBank.CHEKING);
        assertTrue("Account is not a cheking account", accountBank.isCheking());
    }

}

