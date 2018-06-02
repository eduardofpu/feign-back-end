package com.controler;

import com.service.IbgeServiceFeign;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/localidades/mesorregioes")
public class IbgeRestService {

    private final IbgeServiceFeign ibgeService;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getId(@PathVariable String id) {

        ResponseEntity<?> json = ibgeService.getIbge(id);
        System.out.println("Body --------"+json.getBody()+"--------------------------");

        return new ResponseEntity<>(json.getBody(),HttpStatus.OK);
    }


}