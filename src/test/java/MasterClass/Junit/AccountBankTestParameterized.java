package MasterClass.Junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountBankTestParameterized {

    private AccountBank accountBank;
    private double amount;
    private boolean branch;
    private double expected;

    public AccountBankTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setup() {
        accountBank = new AccountBank("Andrey", "Ermolenko", 1000.00, AccountBank.CHEKING);
        System.out.println("Running a test...");
    }


    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000.00}
        });
    }

    @Test
    public void deposit() {
        accountBank.deposit(amount, branch);
        assertEquals(expected, accountBank.getBalance(), .01);
    }
}
