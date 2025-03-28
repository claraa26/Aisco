package aisco.donation.ewallet;
import aisco.donation.core.DonationComponent;
import java.util.ArrayList;
import java.util.List;

public class DonationImpl extends DonationComponent {
	private List<Object> donationList;

    // Konstruktor default yang langsung menambah data
    public DonationImpl() {
        System.out.println("Donation via E-Wallet");
        donationList = new ArrayList<>();
        addDonation(); // Langsung panggil method untuk tambah data
    }

    // Konstruktor dengan parameter (tetap ada)
    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod) {
        super(name, email, phone, amount, paymentMethod);
        donationList = new ArrayList<>();
    }


    public void getDonation() {
        System.out.println(donationList);
    }

   
    public void addDonation() {
        // Tambahkan beberapa data default
        donationList.add(new DonationImpl("Sarah", "sarah@email.com", "+62812 3456 7890", 750000, "E-Wallet"));
        donationList.add(new DonationImpl("Mike", "mike@email.com", "+62811 2345 6789", 1250000, "E-Wallet"));
        donationList.add(new DonationImpl("Emma", "emma@email.com", "+62813 4567 8901", 500000, "E-Wallet"));
    }


    public String toString() {
        return "- Donasi E-Wallet " + name + ": " + amount + " Payment Method: " + paymentMethod + "\n";
    }

}
