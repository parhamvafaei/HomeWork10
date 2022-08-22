package org.example.entities.electricProduct;

public class Radio {
    private int id;
    private String name;
    private int cost;
    private EnergyUsage energyUsage;

    public Radio(String name, int cost, EnergyUsage energyUsage) {
        this.name = name;
        this.cost = cost;
        this.energyUsage = energyUsage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public EnergyUsage getEnergyUsage() {
        return energyUsage;
    }

    public void setEnergyUsage(EnergyUsage energyUsage) {
        this.energyUsage = energyUsage;
    }
}
