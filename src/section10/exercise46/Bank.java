package section10.exercise46;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }
        return branches.add(new Branch(name));
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        var customers = branch.getCustomers();
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return false;
            }
        }

        return branch.newCustomer(customerName, transaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        var customers = branch.getCustomers();
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                customer.addTransaction(transaction);
                return true;
            }
        }

        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {

        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        var customers = branch.getCustomers();
        System.out.println("Customer details for branch " + branchName);
        for (int i = 0; i < customers.size(); i++) {

            System.out.printf("Customer: %s[%d]\n", customers.get(i).getName(), i + 1);
            if (printTransactions) {

                var transactions = customers.get(i).getTransactions();
                System.out.println("Transactions");
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.printf("[%d] Amount %.2f\n", j + 1, transactions.get(j));
                }
            }
        }

        return true;
    }
}
