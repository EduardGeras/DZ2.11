package prosky.dz2_11.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import prosky.dz2_11.repository.Basket;
import prosky.dz2_11.service.BasketService;

import java.util.List;


@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private Basket basket;

    @Override
    public List<Integer> getBasket() {
        return basket.getProductBucket();
    }

    @Override
    public List<Integer> add(Integer id) {
        basket.getProductBucket().add(id);
        return basket.getProductBucket();
    }
}
