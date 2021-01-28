package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void withDrawFromAccount(){
        Account account = new Account ();
        account.deposit(200);
        account.withDraw(100);
        assertThat(account.getBalance()).isEqualTo(100);
    }
    public void depositAmount(){
        Account account = new Account();
        account.deposit(100);
        assertThat(account.getBalance()).isEqualTo(100);
    }
}
