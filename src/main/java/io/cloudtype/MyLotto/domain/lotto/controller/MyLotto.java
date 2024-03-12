package io.cloudtype.MyLotto.domain.lotto.controller;

import io.cloudtype.MyLotto.domain.lotto.Lotto;
import io.cloudtype.MyLotto.domain.lotto.service.GenerateWinNumber;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MyLotto {
    @Autowired
    GenerateWinNumber getLottoWinNumber;

   @GetMapping("/lotto")
    public String ExrateLotto(){
       Lotto lottoNumber = getLottoWinNumber.getLottoWinNumberList();
       return lottoNumber.toString();
    }


}
