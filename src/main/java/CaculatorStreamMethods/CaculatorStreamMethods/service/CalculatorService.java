package CaculatorStreamMethods.CaculatorStreamMethods.service;

import CaculatorStreamMethods.CaculatorStreamMethods.CalculatorResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service


public class CalculatorService {

    public CalculatorResponse calculatorResponse(@RequestBody Calculator calculator) {

        int max = calculator.getMax();
        int divisor = calculator.getDivisor();
        int limit = calculator.getLimit();
      List<String> data= IntStream.rangeClosed(1, max).filter(num -> num % divisor == 0).boxed()
                .sorted(Comparator.reverseOrder()).limit(limit).map(num -> "i am " + (num + 2)).collect(Collectors.toList());
               return new CalculatorResponse(data);

    }
}
