package guru.springframework.msscbrewery.web.model;

import java.util.UUID;

public class CustomerDTO {

    private UUID id;
    private String customerName;

    public CustomerDTO(UUID id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public CustomerDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
