package com.demo.checked.exception;

@FunctionalInterface
public interface ThrowingCustomException<T, E extends Exception> {

	void accept(T t) throws E;
}
