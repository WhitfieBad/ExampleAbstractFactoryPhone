package ua.whitfie.abstractfactory;

public interface FactoryProvider<T> {

    T getFactory(String arg);
}
