package com.pod.movie;

public class Movie {

    enum Type {
        REGULAR {
            public int computePrice(int days) {
                return days + 1;
            }
        }, NEW_RELEASE {
            public int computePrice(int days) {
                return days * 2;
            }
        }, CHILDREN {
            public int computePrice(int days) {
                return 5;
            }
        };

        public abstract int computePrice(int days);
    }

    private final Type type;

    public Movie(Type type) {
        this.type = type;
    }

    public int computePrice(int days) {
        return type.computePrice(days);
    }

    public static void main(String[] args) {
        Movie movie = new Movie(Type.CHILDREN);
        System.out.println("Price: " + movie.computePrice(4));
    }
}
