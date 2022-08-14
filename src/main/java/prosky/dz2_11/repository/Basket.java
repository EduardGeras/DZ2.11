package prosky.dz2_11.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> productBucket = new ArrayList<>();

    public List<Integer> getProductBucket() {
        return productBucket;
    }

}
