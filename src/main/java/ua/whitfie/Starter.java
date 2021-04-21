package ua.whitfie;

import ua.whitfie.abstractfactory.ElectronicGadgetsFactory;
import ua.whitfie.abstractfactory.PhoneFactory;
import ua.whitfie.exeptions.NotFoundTypePhone;
import ua.whitfie.model.AbstractPhone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<AbstractPhone> phones = new ArrayList<>();
        List<String> phonesDataList = Files.readAllLines(Path.of(scanner.nextLine()));
        ElectronicGadgetsFactory<AbstractPhone> electronicGadgetsFactory = new PhoneFactory();

        for (String phoneString: phonesDataList) {
            String arrayArguments[] = phoneString.split("[^\\w\\s]", 3);
            String nameModel = arrayArguments[1];
            String noName = arrayArguments[0].equalsIgnoreCase("noname") ? "" : arrayArguments[0];
            String serialNumber = arrayArguments[2].equalsIgnoreCase("nosn") ? "" : arrayArguments[2];

            try {
                phones.add(electronicGadgetsFactory.create(noName, nameModel, serialNumber));
            } catch (NotFoundTypePhone notFoundTypePhone) {
                notFoundTypePhone.printStackTrace();
            }
        }

        phones.forEach(System.out::println);
    }
}
