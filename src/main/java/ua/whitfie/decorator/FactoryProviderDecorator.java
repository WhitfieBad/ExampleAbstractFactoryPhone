package ua.whitfie.decorator;

import ua.whitfie.abstractfactory.FactoryProvider;

public abstract class FactoryProviderDecorator<T> implements FactoryProvider<T> {

    protected FactoryProvider<T> decoratedProviderFactory;

    public FactoryProviderDecorator(FactoryProvider<T> decoratedProviderFactory) {
        this.decoratedProviderFactory = decoratedProviderFactory;
    }
}
