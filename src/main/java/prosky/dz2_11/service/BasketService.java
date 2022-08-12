package prosky.dz2_11.service;

import java.util.List;

public  interface BasketService {
    List<Integer> getBasket();

    List<Integer> add(Integer id);
}
