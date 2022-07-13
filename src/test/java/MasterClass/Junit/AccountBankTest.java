package MasterClass.Junit;

import org.junit.*;

import static org.junit.Assert.*;

public class AccountBankTest {

    private AccountBank accountBank;
    private static int count;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @Before
    public void setup() {
        accountBank = new AccountBank("Andrey", "Ermolenko", 1000.00, AccountBank.CHEKING);
        System.out.println("Running a test...");

    }


    @Test
    public void deposit() {
        double balance = accountBank.deposit(200, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdrow_branch() {
        double balance = accountBank.withdrow(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdrow_notBranch(){
        double balance = accountBank.withdrow(600.00, false);
        assertEquals(400.00, balance, 0);
    }


    @Test
    public void getBalance_deposit() {
        accountBank.deposit(200, true);
        assertEquals(1200.00, accountBank.getBalance(), 0);
    }

    @Test
    public void getBalance_withdrow() {
        accountBank.withdrow(200, true);
        assertEquals(800.00, accountBank.getBalance(), 0);
    }

    @Test
    public void isCheking_true() {
        assertTrue("Account is not a cheking account", accountBank.isCheking());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @After
    public void teardown() {
        System.out.println("Count = " + count++);
    }

}

