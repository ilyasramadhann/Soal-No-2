public class AccountManager {
    public static int totalAccount;

    public static Account newAccount(String nama, String noHP, String email, String password) {
        totalAccount++;
        return new Account(nama, noHP, email, password);
    }

    public static int totalAccount() {
        return totalAccount;
    }
}
