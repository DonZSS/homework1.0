package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<T extends Animal> {
    private Size size;
    private T zooAnimal;

    private HashMap<String, T> aviaryMap  = new HashMap<>();

    public Aviary(Size size) {
        this.size = size;
    }

    public void addAnimal(T zooAnimal) {
        if (size.equals(zooAnimal.getSize())) {
            aviaryMap.put(zooAnimal.getName(), zooAnimal);
        } else {
            throw new WrongSizeException("Размер вольера не предназначен для " + zooAnimal.getName());
        }
    }

    public animals.Animal getAnimal(String name) {
        return aviaryMap.get(name);
    }

    public boolean removeAnimal(String name) {
        if (aviaryMap.containsKey(name)) {
            aviaryMap.remove(name);
        return true;
        }
        else {
            System.out.println(zooAnimal.getName() + " не в вольере");
            return false;
        }

    }
}
