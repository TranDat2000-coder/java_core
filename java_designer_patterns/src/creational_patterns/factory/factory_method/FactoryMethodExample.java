package creational_patterns.factory.factory_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4. Client code
 */
public class FactoryMethodExample {
    public static void main(String[] args) throws IOException {
        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String planName = buf.readLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(buf.readLine());

        Plan p = getPlanFactory.getPlan(planName);

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);

    }
}
