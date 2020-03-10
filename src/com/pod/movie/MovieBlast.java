package com.pod.movie;

import java.util.function.BiFunction;

public class MovieBlast {
    enum Type {
        REGULAR (ComputeService::computeRegularPrice),
        NEW_RELEASE(ComputeService::computeNewReleasePrice),
        CHILDREN(ComputeService::computeChildrenPrice);

        public final BiFunction<ComputeService, Integer, Integer> priceAlgo;

        private Type(BiFunction<ComputeService, Integer, Integer> priceAlgo) {
            this.priceAlgo = priceAlgo;
        }
    }

    private final Type type;

    public MovieBlast(Type type) {
        this.type = type;
    }

    public static void main(String[] args) {
        ComputeService service = new ComputeService();

        System.out.println("Price: " + service.computePrice(Type.CHILDREN, 2) );
        System.out.println("Price: " + service.computePrice(Type.NEW_RELEASE, 2) );

        System.out.println("Price: " + service.computePrice(Type.REGULAR, 2) );
    }
}

class ComputeService {
    public int computeRegularPrice(int days) {
        return days + 1;
    }

    public int computeNewReleasePrice(int days) {
        return days * 2;
    }

    public int computeChildrenPrice(int days) {
        return days + 10;
    }

    public int computePrice (MovieBlast.Type type, int days) {
        return type.priceAlgo.apply(this, days);
    }
}

