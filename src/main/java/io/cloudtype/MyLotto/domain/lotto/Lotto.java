package io.cloudtype.MyLotto.domain.lotto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class Lotto {
    private List<Integer> lottoNumber;

    @Override
    public String toString() {
        return "로또번호 " + lottoNumber;
    }
    
    public Lotto sort(){
        this.lottoNumber = this.lottoNumber.stream()
                .sorted()
                .collect(Collectors.toList());
        return this;
    }
}
