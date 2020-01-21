
package pl.bartek.springbootztmAPI.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LastUpdateData",
    "Vehicles"
})
public class ZtmGpsLocalVehicles {

    @JsonProperty("LastUpdateData")
    private String lastUpdateData;
    @JsonProperty("Vehicles")
    private List<Vehicle> vehicles = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LastUpdateData")
    public String getLastUpdateData() {
        return lastUpdateData;
    }

    @JsonProperty("LastUpdateData")
    public void setLastUpdateData(String lastUpdateData) {
        this.lastUpdateData = lastUpdateData;
    }

    @JsonProperty("Vehicles")
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @JsonProperty("Vehicles")
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
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
