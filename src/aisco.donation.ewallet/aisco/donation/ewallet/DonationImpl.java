package aisco.donation.ewallet;
import aisco.donation.core.DonationComponent;
import java.util.ArrayList;
import java.util.List;

public class DonationImpl extends DonationComponent {
    private List<Object> donationList;
    private String ewalletName;

    public DonationImpl() {
        System.out.println("Donation via E-Wallet");
        donationList = new ArrayList<>();
        addDonation(); 
    }

    
    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod, String ewalletName) {
        super(name, email, phone, amount, paymentMethod);
        this.ewalletName = ewalletName;
        donationList = new ArrayList<>();
    }

    public void getDonation() {
        System.out.println(donationList);
    }

    public void addDonation() {
        donationList.add(new DonationImpl("Sarah", "sarah@email.com", "+62812 3456 7890", 750000, "E-Wallet", "GoPay"));
        donationList.add(new DonationImpl("Mike", "mike@email.com", "+62811 2345 6789", 1250000, "E-Wallet", "OVO"));
        donationList.add(new DonationImpl("Emma", "emma@email.com", "+62813 4567 8901", 500000, "E-Wallet", "Dana"));
    }

    @Override
    public String toString() {
        return "- Donasi E-Wallet " + name + " melalui " + ewalletName + ": " + amount + " Payment Method: " + paymentMethod + "\n";
    }
}
