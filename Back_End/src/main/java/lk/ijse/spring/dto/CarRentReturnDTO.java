/**
 * author - Buddini
 * version - 1.0.0 9:15 PM 11/1/2023
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
public class CarRentReturnDTO {
    private String returnId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    private double noOfKm;
    private CarRentDTO rental;
    private PaymentDTO payment;
}
