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
        int totalArtwork = 0;
        for (Artwork artwork : gallery.getArtworks()){
            totalArtwork +=
        }
    }


}
