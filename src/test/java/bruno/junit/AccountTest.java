package bruno.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AccountTest {

    @Test
    void validateBalance() {
        Account account = new Account("123456", 100d);
        Account accountToNull = new Account("2222", 250d);
        Assertions.assertNotNull(account);

        account.deposit(50d);

        Assertions.assertEquals(150d, account.getBalance());

        account.withdraw(50d);

        Assertions.assertEquals(100d, account.getBalance());

        Assertions.assertNotEquals(101d, account.getBalance());

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(250d);
        });

        Assertions.assertDoesNotThrow(() -> account.withdraw(10d));


        accountToNull = null;
        Assertions.assertNull(accountToNull);

    }

}
