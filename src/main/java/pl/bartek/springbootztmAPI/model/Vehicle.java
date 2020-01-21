
package pl.bartek.springbootztmAPI.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DataGenerated",
    "Line",
    "Route",
    "VehicleCode",
    "VehicleService",
    "VehicleId",
    "Speed",
    "Delay",
    "Lat",
    "Lon",
    "GPSQuality"
})
public class Vehicle {

    @JsonProperty("DataGenerated")
    private String dataGenerated;
    @JsonProperty("Line")
    private String line;
    @JsonProperty("Route")
    private String route;
    @JsonProperty("VehicleCode")
    private String vehicleCode;
    @JsonProperty("VehicleService")
    private String vehicleService;
    @JsonProperty("VehicleId")
    private Integer vehicleId;
    @JsonProperty("Speed")
    private Integer speed;
    @JsonProperty("Delay")
    private Integer delay;
    @JsonProperty("Lat")
    private Double lat;
    @JsonProperty("Lon")
    private Double lon;
    @JsonProperty("GPSQuality")
    private Integer gPSQuality;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



    @JsonProperty("DataGenerated")
    public String getDataGenerated() {
        return dataGenerated;
    }

    @JsonProperty("DataGenerated")
    public void setDataGenerated(String dataGenerated) {
        this.dataGenerated = dataGenerated;
    }

    @JsonProperty("Line")
    public String getLine() {
        return line;
    }

    @JsonProperty("Line")
    public void setLine(String line) {
        this.line = line;
    }

    @JsonProperty("Route")
    public String getRoute() {
        return route;
    }

    @JsonProperty("Route")
    public void setRoute(String route) {
        this.route = route;
    }

    @JsonProperty("VehicleCode")
    public String getVehicleCode() {
        return vehicleCode;
    }

    @JsonProperty("VehicleCode")
    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    @JsonProperty("VehicleService")
    public String getVehicleService() {
        return vehicleService;
    }

    @JsonProperty("VehicleService")
    public void setVehicleService(String vehicleService) {
        this.vehicleService = vehicleService;
    }

    @JsonProperty("VehicleId")
    public Integer getVehicleId() {
        return vehicleId;
    }

    @JsonProperty("VehicleId")
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    @JsonProperty("Speed")
    public Integer getSpeed() {
        return speed;
    }

    @JsonProperty("Speed")
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @JsonProperty("Delay")
    public Integer getDelay() {
        return delay;
    }

    @JsonProperty("Delay")
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @JsonProperty("Lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("Lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("Lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("Lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("GPSQuality")
    public Integer getGPSQuality() {
        return gPSQuality;
    }

    @JsonProperty("GPSQuality")
    public void setGPSQuality(Integer gPSQuality) {
        this.gPSQuality = gPSQuality;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
