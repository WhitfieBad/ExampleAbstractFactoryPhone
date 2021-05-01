package ua.whitfie;

import ua.whitfie.abstractfactory.BrandFactoryProvider;
import ua.whitfie.abstractfactory.ProductBrandFactory;
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

        for (String productString: phonesDataList) {
            String arrayArguments[] = productString.split("[^\\w\\s]", 3);

            ProductBrandFactory<AbstractProduct> factor = BrandFactoryProvider.getFactoryOfBrandName(arrayArguments[0]);
            phones.add(factor.create(arrayArguments[1], arrayArguments[2]));
        }

        phones.forEach(System.out::println);
    }
}
