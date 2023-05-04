package cn.r2ys.manifold.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

@SpringBootApplication
public class ManifoldDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManifoldDemoApplication.class, args);

//        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, Object> linkedHashMap = null;
//        linkedHashMap.put("policy", "p001");
//        linkedHashMap.put("name", "name001");
//        linkedHashMap.put("time", "2023-03-31");
        System.out.println(linkedHashMap.toCsvLineSplittedByComma());

        BigDecimal bigDecimalString = new BigDecimal("1000");
        BigDecimal bigDecimalInteger = new BigDecimal(1000);
        BigDecimal bigDecimalFloat = new BigDecimal(1000.0);
        BigDecimal bigDecimalFloatScaled = new BigDecimal(1000.00897);
        System.out.println(bigDecimalString.toDisplayText());
        System.out.println(bigDecimalInteger.toDisplayText());
        System.out.println(bigDecimalFloat.toDisplayText());
        System.out.println(bigDecimalFloatScaled.toDisplayText());

    }

}
