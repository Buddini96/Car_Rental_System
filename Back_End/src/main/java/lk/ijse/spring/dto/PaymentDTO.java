/**
 * author - Buddini
 * version - 1.0.0 9:18 PM 11/1/2023
 **/

package lk.ijse.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PaymentDTO {
    private String paymentId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    private double amount;
    private CarRentDTO rental;
    private CustomerDTO customer;
}