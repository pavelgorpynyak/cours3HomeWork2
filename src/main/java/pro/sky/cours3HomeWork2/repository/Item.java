package pro.sky.cours3HomeWork2.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope
public class Item {

    private final List<Integer> bucket = new ArrayList<>();

    public void add( Integer item ) {
        bucket.add(item);
    }

    public List<Integer> get() {
        return bucket;
    }
}

