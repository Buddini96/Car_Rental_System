/**
 * author - Buddini
 * version - 1.0.0 11:21 AM 10/27/2023
 **/

package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    private String customerId;
    private String name;
    private String address;
    private int contactNo;
    private String email;
    private String nicNo;
    private String nicFrontImg;
    private String nicBackImg;
    private String licenceNo;
    private String licenceImg;
    private String username;
    private String password;
    private String status;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<CarRent> rentals = new ArrayList<>();

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();
}
