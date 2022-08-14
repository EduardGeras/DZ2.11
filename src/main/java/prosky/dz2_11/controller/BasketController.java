package prosky.dz2_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prosky.dz2_11.service.BasketService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam("id") Integer[] ids) {
        for (int i = 0; i < ids.length; i++) {
            basketService.add(ids[i]);
        }
        List<Integer> basket = basketService.getBasket();
        return basket;
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return basketService.getBasket();
    }

}
