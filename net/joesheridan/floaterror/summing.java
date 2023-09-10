package net.joesheridan.floaterror;

public class summing {

    public static void main(String[] args) {
        // let's start with a $14 deposit
        double punterWallet = 14.0;
        // make a bunch of wagers
        for (int i = 0; i < 10; i++) {
            punterWallet += 0.1;
        }
        double wantToWithdrawItAll = 15;
        System.out.println("Can I withdraw? " + (punterWallet >= wantToWithdrawItAll ? "OK" : "Insufficient Funds"));
        System.out.println("You don't have $15, you have $" + punterWallet);
    }
}
