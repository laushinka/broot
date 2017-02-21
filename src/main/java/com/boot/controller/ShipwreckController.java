package com.boot.controller;

import com.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @RequestMapping(value = "shipwreck", method = GET)
    public List<Shipwreck> list() {
        return ShipwreckStub.list();
    }
}
