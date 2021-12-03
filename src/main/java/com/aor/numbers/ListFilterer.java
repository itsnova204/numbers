package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private GenericListFilter filter;

    public ListFilterer(GenericListFilter filter) {
        this.filter = filter;
    }
    
    public List<Integer> filter(List<Integer> list){
        List<Integer> out=new ArrayList<>();

        for (Integer numb:list){
            if (filter.accept(numb)){out.add(numb);}
        }
        return out;
    }
}
