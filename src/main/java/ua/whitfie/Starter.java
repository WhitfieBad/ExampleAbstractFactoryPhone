package ua.whitfie;

import ua.whitfie.abstractfactory.FactoryPhone;
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

        for (String phoneString: phonesDataList) {
            try {
                phones.add(FactoryPhone.createPhone(phoneString));
            } catch (NotFoundTypePhone notFoundTypePhone) {
                notFoundTypePhone.printStackTrace();
            }
        }

        phones.forEach(System.out::println);
    }
}
