package ru.store.online.model;

import ru.store.online.model.enumeration.Country;
import ru.store.online.model.enumeration.Status;

import java.time.LocalDateTime;

public class Order {
    private LocalDateTime orderDateTime;
    private User user;
    private Address address;
    private Status status;
    private CartItem[] cartItemsArray;

    public static class Address {
        private Country country;
        private String region;
        private String city;
        private String street;
        private String house;
        private String apartment;
        private String index;

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getHouse() {
            return house;
        }

        public void setHouse(String house) {
            this.house = house;
        }

        public String getApartment() {
            return apartment;
        }

        public void setApartment(String apartment) {
            this.apartment = apartment;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public CartItem[] getCartItemsArray() {
        return cartItemsArray;
    }

    public void setCartItemsArray(CartItem[] cartItemsArray) {
        this.cartItemsArray = cartItemsArray;
    }
}
