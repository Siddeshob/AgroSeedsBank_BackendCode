package seeds.bank.ReactSeedBank.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PreOrderEntity {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String MobileNumber;
    private String NameAndQuantity;

    public PreOrderEntity(){

    }
    public PreOrderEntity(String mobileNumber, String nameAndQuantity) {
        MobileNumber = mobileNumber;
        NameAndQuantity = nameAndQuantity;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getNameAndQuantity() {
        return NameAndQuantity;
    }

    public void setNameAndQuantity(String nameAndQuantity) {
        NameAndQuantity = nameAndQuantity;
    }
}
