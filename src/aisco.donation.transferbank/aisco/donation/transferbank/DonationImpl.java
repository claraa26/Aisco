package aisco.donation.transferbank;

import aisco.donation.core.DonationComponent;
import java.util.ArrayList;
import java.util.List;

public class DonationImpl extends DonationComponent {
    private List<Object> donationList;
    private String bankName;
    private String accountNumber;

    public DonationImpl() {
        System.out.println("Donation via Bank Transfer");
        donationList = new ArrayList<>();
        addDonation(); 
    }

    public DonationImpl(String name, String email, String phone, int amount, String bankName, String accountNumber) {
        super(name, email, phone, amount, "Bank Transfer");
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        donationList = new ArrayList<>();
    }

    public void getDonation() {
        System.out.println(donationList);
    }

    public void addDonation() {
        donationList.add(new DonationImpl("Sarah", "sarah@email.com", "+62812 3456 7890", 750000, "BCA", "1234567890"));
        donationList.add(new DonationImpl("Mike", "mike@email.com", "+62811 2345 6789", 1250000, "Mandiri", "0987654321"));
    }


    public String toString() {
        return "- Donasi Bank Transfer " + name + ": " + amount + " melalui " + bankName + " (Rek: " + accountNumber + ")\n";
    }
}
