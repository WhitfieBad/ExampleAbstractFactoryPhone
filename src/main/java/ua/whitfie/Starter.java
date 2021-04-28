package ua.whitfie;

import ua.whitfie.abstractfactory.FactoryProduct;
import ua.whitfie.exeptions.NotFoundTypeProduct;
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
            String nameModel = arrayArguments[1];
            String nameCompany = arrayArguments[0].equalsIgnoreCase("noname") ? "" : arrayArguments[0];
            String serialNumber = arrayArguments[2].equalsIgnoreCase("nosn") ? "" : arrayArguments[2];

            try {
                phones.add(FactoryProduct.createProduct(nameCompany, nameModel, serialNumber));
            } catch (NotFoundTypeProduct notFoundTypeProduct) {
                notFoundTypeProduct.printStackTrace();
            }
        }

        phones.forEach(System.out::println);
    }
}
