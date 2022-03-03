package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<T extends Animal> {
    private Size size;
    private T zooAnimal;

    private HashMap<String, T> storageAviary  = new HashMap<>();

    public Aviary(Size size) {
        this.size = size;
    }

    public void addAnimal(T zooAnimal) {
        if (size.equals(zooAnimal.getSize())) {
            storageAviary.put(zooAnimal.getName(), zooAnimal);
        } else {
            throw new WrongSizeException("Размер вольера не предназначен для " + zooAnimal.getName());
        }
    }

    public Animal getAnimal(String name) {
        return storageAviary.get(name);
    }

    public boolean removeAnimal(String name) {
        if (storageAviary.containsKey(name)) {
            storageAviary.remove(name);
        return true;
        }
        else {
            System.out.println(zooAnimal.getName() + " не в вольере");
            return false;
        }

    }
}
