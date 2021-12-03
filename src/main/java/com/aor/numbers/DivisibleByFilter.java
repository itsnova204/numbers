package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    int div;

    public DivisibleByFilter(Integer div) {
        this.div = div;
    }

    public boolean accept(Integer number){
        return (number % div == 0);
    }


}
