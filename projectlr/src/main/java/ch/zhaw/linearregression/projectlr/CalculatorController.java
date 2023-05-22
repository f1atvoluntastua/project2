package ch.zhaw.linearregression.projectlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    
    @Autowired
    CalculatorService calculatorService;

    @PostMapping("/calculate")
    public double calculateSalary(@RequestBody Data data) {
        return calculatorService.calculateSalary(data);
    }
}
