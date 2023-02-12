package actions.account;

import users.User;
public interface IAccount {

    User createAccount();

    void verifyAccount();

    User disableAccount();

}
