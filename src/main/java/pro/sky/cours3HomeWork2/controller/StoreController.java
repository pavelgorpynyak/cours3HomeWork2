package pro.sky.cours3HomeWork2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cours3HomeWork2.service.BucketService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final BucketService bucketService;
    private int id;

    public StoreController( BucketService bucketService ) {
        this.bucketService = bucketService;
    }

    @GetMapping("/add")
    public List<Integer> add( @RequestParam int id ) {
        this.id = id;
        return bucketService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return bucketService.get();
    }
}
