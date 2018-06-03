package com.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//http://servicodados.ibge.gov.br/api/v1/localidades/mesorregioes/3301

@FeignClient(name = "ibge", url = "http://servicodados.ibge.gov.br")
public interface IbgeServiceFeign {
    @RequestMapping("/api/v1/localidades/mesorregioes/{id}")
    ResponseEntity<?> getIbgeJson(@PathVariable("id") String id);
}