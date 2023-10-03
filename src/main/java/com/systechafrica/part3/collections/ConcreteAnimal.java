package com.systechafrica.part3.collections;

public class ConcreteAnimal implements Animal{
    String name;
    String sound;
    String type;

    public ConcreteAnimal(String name, String sound, String type) {
        this.name = name;
        this.sound = sound;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    
}
