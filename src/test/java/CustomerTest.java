import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Artwork artwork;

    Gallery gallery;

    Customer customer;
    Artist vincent;
    Artist leonardo;
    Artist bob;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Alice");
        gallery = new Gallery("MJ's Gallery");
        artist = new Artist("Vincent");
        artist = new Artist("Leonardo");
        artist = new Artist("Bob");
        artwork = new Artwork("Sun", 10);
        artwork = new Artwork("Moon", 20);
        artwork = new Artwork("Star", 30);

        gallery.addArtwork("Sun");
        gallery.addArtwork("Moon");
        gallery.addArtwork("Star");
    }

    @Test
    public  void hasName(){
        assertThat(customer.getName()).isEqualTo("Alice");
    }

    @Test
    public void customerAmountWalletStartAtZero(){
        assertThat(customer.getCustomerWallet()).isEqualTo(0);
    }

    @Test
    public void customerAddAmountForWallet(){
        customer.customerWallet(gallery);
        assertThat(customer.getCustomerWallet()).isEqualTo(100);

    }

    @Test
    public void customerRemoveAmountFromWallet(){
        customer.customerWallet(gallery);
        customer.RemoveAmountFromWallet(gallery);
        assertThat(gallery.getArtworkForSale()).isEqualTo(60);
        assertThat(gallery.getCustomerWallet()).isEqualTo(40);


    }

}
