package CaculatorStreamMethods.CaculatorStreamMethods;

import CaculatorStreamMethods.CaculatorStreamMethods.service.Calculator;
import CaculatorStreamMethods.CaculatorStreamMethods.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;


     @PostMapping("/ai/calculation2")
      public CalculatorResponse calculatorResponse(@RequestBody Calculator calculator){

        calculatorService.calculatorResponse(calculator);
return calculatorService.calculatorResponse(calculator);
       }



}
