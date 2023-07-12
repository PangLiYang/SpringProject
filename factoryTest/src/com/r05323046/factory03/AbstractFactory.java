package com.r05323046.factory03;

// The factory that can produce all relevant product at once.
public interface AbstractFactory {
    AbstractSupport produceSupport();
    AbstractItem produceItem();
}
