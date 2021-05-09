package ua.whitfie.decorator;

import ua.whitfie.abstractfactory.FactoryProvider;

public class RegexProviderFactoryDecorator<T> extends FactoryProviderDecorator<T> {

    private String regex;

    public RegexProviderFactoryDecorator(FactoryProvider<T> factoryProvider, String regex) {
        super(factoryProvider);
        this.regex = regex;
    }

    @Override
    public T getFactory(String arg) {
        String[] argumets = arg.split(regex, 3);
        return decoratedProviderFactory.getFactory(argumets[0]);
    }
}
