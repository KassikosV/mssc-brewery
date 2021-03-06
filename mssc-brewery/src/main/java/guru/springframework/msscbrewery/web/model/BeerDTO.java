package guru.springframework.msscbrewery.web.model;

import java.util.UUID;

public class BeerDTO {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public String getBeerStyle() {
        return beerStyle;
    }

    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    public BeerDTO(UUID id, String beerName, String beerStyle, Long upc) {
        this.id = id;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
    }

    public BeerDTO() {
    }

    @Override
    public String toString() {
        return "BeerDTO{" +
                "id=" + id +
                ", beerName='" + beerName + '\'' +
                ", beerStyle='" + beerStyle + '\'' +
                ", upc=" + upc +
                '}';
    }
}
