package io.cloudtype.Demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Lotto {

   @GetMapping("/lotto")
    public String Lotto(@RequestParam String param){
        if (param.equals("0")){
            throw new IllegalArgumentException("number is 0");
        }

        return "lotto number : " + param;
    }
}
