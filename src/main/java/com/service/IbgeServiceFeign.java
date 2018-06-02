package com.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "ibge", url = "http://servicodados.ibge.gov.br")
public interface IbgeServiceFeign {
    @RequestMapping("/api/v1/localidades/mesorregioes/{id}")
    ResponseEntity<?> getIbge(@PathVariable("id") String id);
}