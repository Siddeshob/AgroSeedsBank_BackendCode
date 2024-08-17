package seeds.bank.ReactSeedBank.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;
    private String imageLink;
    private String itemName;
    private Double price;
    private String villageAddress;

    public Card(){}

    public String getImageLink() {
        return imageLink;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getPrice() {
        return price;
    }

    public String getVillageAddress() {
        return villageAddress;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setVillageAddress(String villageAddress) {
        this.villageAddress = villageAddress;
    }

    public Card(String imageLink, String itemName, Double price, String villageAddress) {
        this.imageLink = imageLink;
        this.itemName = itemName;
        this.price = price;
        this.villageAddress = villageAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", imageLink='" + imageLink + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", villageAddress='" + villageAddress + '\'' +
                '}';
    }
}
