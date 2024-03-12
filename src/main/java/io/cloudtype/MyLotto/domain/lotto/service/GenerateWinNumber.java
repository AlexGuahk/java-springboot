package io.cloudtype.MyLotto.domain.lotto.service;

import io.cloudtype.MyLotto.domain.lotto.Lotto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class GenerateWinNumber {
    public static Lotto getLottoWinNumberList() {
        List<Integer> lottoNumbers = new ArrayList<>();
        Random random = new Random();
        int i;
        for (i = 0; i < 6 ; i++) {
            lottoNumbers.add(random.nextInt(45)+1);
        }
        
        return new Lotto(lottoNumbers).sort();
    }
}
