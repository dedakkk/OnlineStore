package ru.store.online.model;

import ru.store.online.model.enumeration.Manufacturer;

import java.math.BigDecimal;

import ru.store.online.model.enumeration.Country;
import ru.store.online.model.enumeration.Package;
public abstract class Drink {
    private String name;
    private BigDecimal price;
    private Float weight;
    private Manufacturer manufacturer;
    private Country country;
    private Package aPackage;
}
