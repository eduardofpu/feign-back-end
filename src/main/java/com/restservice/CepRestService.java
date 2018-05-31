package com.restservice;

import com.cep.CepService;
import com.response.CepResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("v1/cep")
public class CepRestService {

    private final CepService cepService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{cep}")
    public CepResponse getCep(@PathVariable String cep) {

        CepResponse json = cepService.getCep(cep);
        System.out.println("------------------------ "+json+" ------------------------");
        return json;
    }
}