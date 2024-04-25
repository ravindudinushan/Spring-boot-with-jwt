package lk.ijse.gdse66.springbootwithjwt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO implements Serializable {
    private String id;
    private String name;
    private String address;
}
