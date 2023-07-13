import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {


    Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery ("Universe");
        Artwork sun = new Artwork(Sun, "Vincent", 10);
        Artwork moon = new Artwork(Moon, "Leonardo", 20);
        Artwork star = new Artwork(Star,"Bob", 30);
        gallery.addArtwork(Sun);
        gallery.addArtwork(Moon);
        gallery.addArtwork(Star);
    }

    @Test
    public void galleryHasName() {assertThat(gallery.getName()).isEqualTo("Universe"); }

    @Test
    public void canCountArtists () {assertThat(gallery.getArtistCount()).isEqualTo(3);}
    @Test
    public void galleryTill () {assertThat(gallery.getTillAmount()).isEqualTo(500);}

    @Test
    public void galleryStock () {assertThat(gallery.getStockAmount()).isEqualTo(3);}

    @Test
    public void canCountArtworkForSale() { assertThat(gallery.getArtworkForSale()).isEqualTo(0); }

    @Test
    public void canSetArtworkForSale() {
        gallery.setArtworkForSale(3);
        assertThat(gallery.getArtworkForSale()).isEqualTo(3);
    }

    @Test
    public void canAddTill() {assertThat(gallery.canAddTill()).isEqualTo(gallery.canAddTill)); }




}
