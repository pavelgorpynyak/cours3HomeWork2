package pro.sky.cours3HomeWork2.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.cours3HomeWork2.repository.Item;

import java.util.Collections;
import java.util.List;

@Service
@Scope

public class BucketServiceImpl implements BucketService {

    private final Item item;

    public BucketServiceImpl( Item item ) {
        this.item = item;
    }

    @Override
    public List<Integer> add( int id ) {
        item.add(id);
        return Collections.singletonList(id);
    }

    @Override
    public List<Integer> get() {
        return item.get();
    }
}
