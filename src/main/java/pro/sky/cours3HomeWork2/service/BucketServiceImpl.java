package pro.sky.cours3HomeWork2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.cours3HomeWork2.repository.Item;

import java.util.List;

@Service
@SessionScope
public class BucketServiceImpl implements BucketService {

    private final Item item;

    public BucketServiceImpl( Item item ) {
        this.item = item;
    }

    @Override
    public List<Integer> add( int id ) {
        item.add(id);
        return (List<Integer>) item;
    }

    @Override
    public List<Integer> get() {
        return item.get();
    }
}
