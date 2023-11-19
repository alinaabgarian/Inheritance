package com.itgen.lesson;

import java.util.Objects;

public class Dollar {
    private int valueInCents;

    Dollar(int valueInCents){
        this.valueInCents = valueInCents;

    }

    public int getValueInCents() {
        return valueInCents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return valueInCents == dollar.valueInCents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueInCents);
    }
}
