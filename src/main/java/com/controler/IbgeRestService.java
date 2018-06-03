package com.controler;

import com.service.IbgeServiceFeign;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/localidades/mesorregioes")
public class IbgeRestService {

    private final IbgeServiceFeign ibgeService;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getId(@PathVariable String id) {

        ResponseEntity<?> json = ibgeService.getIbgeJson(id);
        System.out.println("Body --------"+json.getBody()+"--------------------------");
        Map<String, Object> map = getStringObjectMap(json);
        getMap(map);

        return new ResponseEntity<>(json.getBody(), HttpStatus.OK);
    }

    private Map<String, Object> getStringObjectMap(ResponseEntity<?> json) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.putAll((Map<? extends String, ? >) json.getBody());
        System.out.println("map = "+map.entrySet());
        return map;
    }

    private void getMap(Map<String, Object> map) {
        //String retirar = null;
        for(Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key = "+entry.getKey());
            System.out.println("value = "+entry.getValue());
           // retirar = String.valueOf(entry.getValue());
           // getRetirar(retirar);
        }
    }

    private void getRetirar(String retirar) {
        retirar = retirar.replace("{","");
        retirar = retirar.replace("}","");
        System.out.println( retirar);
    }


}