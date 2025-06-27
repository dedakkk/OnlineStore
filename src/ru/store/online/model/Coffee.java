package ru.store.online.model;

import ru.store.online.model.enumeration.CoffeType;
import ru.store.online.model.enumeration.Roasting;


public class Coffee extends Drink {
        private CoffeType teaType;
        private Roasting roasting;

    public Roasting getRoasting() {
        return roasting;
    }

    public void setRoasting(Roasting roasting) {
        this.roasting = roasting;
    }

    public CoffeType getTeaType() {
        return teaType;
    }

    public void setTeaType(CoffeType teaType) {
        this.teaType = teaType;
    }
}
