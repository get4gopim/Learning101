package com.pod;

@FunctionalInterface
public interface ShortToByteFunction {

    byte shortToByte(short s);

    static ShortToByteFunction convert() {
        return x -> (byte) (x * 3);
    }
}
