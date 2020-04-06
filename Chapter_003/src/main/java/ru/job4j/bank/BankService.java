package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void addAccount(String passport, Account account) {
        if (findByPassport(passport) != null) {
            users.get(findByPassport(passport)).add(account);
        }


    }

    public User findByPassport(String passport) {
        User user1 = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                user1 = user;
                break;
            }
        }


        return user1;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account find = null;
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    find = account;
                    break;
                }
            }
        }
        return find;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account Account1 = findByRequisite(srcPassport, srcRequisite);
        Account Account2 = findByRequisite(destPassport, dеstRequisite);
        if (Account1 != null && Account2 != null) {
            double srcMoney = Account1.getBalance();
            double destMoney = Account2.getBalance();
            if (srcMoney <= amount) {
                Account1.setBalance(srcMoney - amount);
                Account2.setBalance(destMoney + amount);
                rsl = true;
            }
        }

        return rsl;
    }
 }