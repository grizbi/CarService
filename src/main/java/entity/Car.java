package entity;

import javax.persistence.*;

@Entity
public class Car {


    public Car(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;

    @Column(name="Name")
    String name;

    @Column(name="Year of production")
    int yearOfProduction;

    @Column(name="Price")
    int price;

    @Column(name="Weight")
    int weight;

    @Column(name="Country of production")
    String countryOfProduction;

    public Car(String name, int yearOfProduction, int price, int weight, String countryOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.countryOfProduction = countryOfProduction;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }




}
