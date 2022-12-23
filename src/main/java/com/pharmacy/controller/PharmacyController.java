package com.pharmacy.controller;

import com.pharmacy.controller.dto.PharmacyResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

    @GetMapping
        public PharmacyResponse enterPharm(){
            return new PharmacyResponse("Araújo" ,"Pharmacy created");
        }
}
