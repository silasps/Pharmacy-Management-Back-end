package com.pharmacy.controllers;

import com.pharmacy.controllers.dto.PharmacyResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

    @GetMapping
        public PharmacyResponse enterPharm(){
            return new PharmacyResponse("Araújo" ,"Pharmacy created");
        }
}
