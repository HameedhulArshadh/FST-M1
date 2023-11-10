package activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    public void notEnoughFunds(){
        BankAccount account = new BankAccount(10000);
        assertThrows(NotEnoughFundsException.class, () -> account.withDraw(10001), "Cant withdraw more than the balance");
    }
    @Test
    public void enoughFunds(){
        BankAccount account = new BankAccount(10000);
        assertDoesNotThrow(() -> account.withDraw(9999));
    }

}
