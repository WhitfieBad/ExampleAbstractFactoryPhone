package ua.whitfie.abstractfactory;

import ua.whitfie.exeptions.NotFoundTypeProduct;
import ua.whitfie.model.AbstractProduct;
import ua.whitfie.model.BmwProduct;

public class GermanyFactory implements ProductCountryFactory<AbstractProduct> {

    @Override
    public AbstractProduct create(String nameCompany, String nameModel, String serialNumber) throws NotFoundTypeProduct {
        switch (nameCompany.toLowerCase()) {
            case "bmw" : return new BmwProduct(nameModel, serialNumber);
        }
        throw new NotFoundTypeProduct();
    }
}
