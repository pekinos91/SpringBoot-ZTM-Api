package pl.bartek.springbootztmAPI;




import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.bartek.springbootztmAPI.model.Vehicle;
import pl.bartek.springbootztmAPI.model.ZtmGpsLocalVehicles;

import java.util.List;


@Controller
public class HelloControler {

    @GetMapping("/hello")
    public String getApi(Model model){


        RestTemplate restTemplate = new RestTemplate();
        HttpEntity httpEntity = new HttpEntity(null);
        ResponseEntity <ZtmGpsLocalVehicles> responseEntity = restTemplate.exchange(
                "http://ckan2.multimediagdansk.pl/gpsPositions",
                HttpMethod.GET,httpEntity, ZtmGpsLocalVehicles.class);

      List<Vehicle> vehicles = responseEntity.getBody().getVehicles();

        for (Vehicle vehicle: vehicles
             ) {
            vehicle.getLon();
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setLat(23.0);
        vehicle.setLon(43.0);
      model.addAttribute("vehicles",vehicles);
        model.addAttribute("vehicle",vehicle);

        return "hello";



    }
}
