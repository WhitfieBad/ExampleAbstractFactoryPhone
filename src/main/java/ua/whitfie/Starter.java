package ua.whitfie;

import ua.whitfie.abstractfactory.BrandFactoryProvider;
import ua.whitfie.abstractfactory.FactoryProvider;
import ua.whitfie.abstractfactory.ProductBrandFactory;
import ua.whitfie.decorator.RegexBrandFactoryDecorator;
import ua.whitfie.decorator.RegexProviderFactoryDecorator;
import ua.whitfie.model.AbstractProduct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<AbstractProduct> phones = new ArrayList<>();
        List<String> phonesDataList = Files.readAllLines(Path.of(scanner.nextLine()));

        FactoryProvider<ProductBrandFactory> factoryProvider = new BrandFactoryProvider();
        factoryProvider = new RegexProviderFactoryDecorator(factoryProvider,":");

        for (String productString: phonesDataList) {
            ProductBrandFactory<AbstractProduct> productBrandFactory = factoryProvider.getFactory(productString);
            productBrandFactory = new RegexBrandFactoryDecorator(productBrandFactory, ":");
            phones.add(productBrandFactory.create(productString));
        }

        phones.forEach(System.out::println);
    }
}
