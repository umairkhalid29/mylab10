

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author umair
 */
@Entity
@Table(name="city")
public class GeoCity implements Serializable {
    
    @Id
    private int id;
    
    @Column
    private String code;
    
    @Column
    private String country;
    
    @Column
    private int region;
    
    @Column
    private int lat, lon;

    public int getId() {
        return id;
    }

    public GeoCity setId(int id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public GeoCity setCode(String code) {
        this.code = code;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public GeoCity setCountry(String country) {
        this.country = country;
        return this;
    }

    public int getRegion() {
        return region;
    }

    public GeoCity setRegion(int region) {
        this.region = region;
        return this;
    }

    public int getLat() {
        return lat;
    }

    public GeoCity setLat(int lat) {
        this.lat = lat;
        return this;
    }

    public int getLon() {
        return lon;
    }

    public GeoCity setLon(int lon) {
        this.lon = lon;
        return this;
    }
}
