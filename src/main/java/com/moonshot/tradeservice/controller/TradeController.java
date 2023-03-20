package com.moonshot.tradeservice.controller;

import com.moonshot.tradeservice.entity.LegalEntityRefData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/TradeService")
public class TradeController {

    @RequestMapping("/LegalEntity")
    public List<LegalEntityRefData> fetchReferenceData(){

        //currently hardcoding
        return Collections.singletonList(
                new LegalEntityRefData(100,"NewYork")
        );
    }
}
