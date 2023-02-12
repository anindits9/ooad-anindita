package actions.account;

import users.Admin;
import users.User;
import users.UserType;

public class Account implements IAccount {

    enum AccountStatus{
        CREATED,
        VERIFIED,
        DISABLED,
    }

    public Account() {
    }

    public Account(UserType userType) {
        this.userType = userType;
    }

    private User userAccount;

    private UserType userType;
    private String creationDate;

    private AccountStatus accountStatus;

    private Admin createdBy;

    @Override
    public User createAccount() {
        return null;
    }

    @Override
    public void verifyAccount() {

    }

    @Override
    public User disableAccount() {
        return null;
    }

    public User getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(User userAccount) {
        this.userAccount = userAccount;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Admin getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Admin createdBy) {
        this.createdBy = createdBy;
    }
}
