public class Customer {

    private String name;
    private double customerWallet;

    public Customer(String inputName){
        this.name = inputName;
        this.customerWallet = 0;
    }

    public String getName(){
        return this.name;
    }

    public double getCustomerWallet(){
        return this.customerWallet;
    }

    public void customerWallet (Gallery gallery){
        double totalWallet = 0;
        for (Customer customer : gallery.getCustomerWallet()) {
            totalWallet += customer.customerWallet();
            customer.setCustomerWallet(0);
        }
        this.customerWallet = totalWallet;
        }

        public void customerRemoveAmountFromWallet(Gallery gallery){
        gallery.setArtworkForSale(this.customerWallet -40);
        this.customerWallet = 40;
    }


}
