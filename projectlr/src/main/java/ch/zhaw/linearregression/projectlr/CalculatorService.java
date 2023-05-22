package ch.zhaw.linearregression.projectlr;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    
    public double calculateSalary(Data data) {
        // This is a simple linear regression model
        // In reality, this model would be much more complex and trained on data
        double slope = 50000.0 / 40.0;
        double intercept = 50000.0 - (slope * 20.0);
        
        return slope * data.getAge() + intercept;
    }
}
