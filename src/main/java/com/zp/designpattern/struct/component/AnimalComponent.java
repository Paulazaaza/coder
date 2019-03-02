package com.zp.designpattern.struct.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangpeng01 on 2019/1/16.
 */
public class AnimalComponent implements Animal{

    public List<Animal> list = new ArrayList<Animal>();

    public void addAnimal(Animal animal){
        list.add(animal);
    }

    @Override
    public void eat() {
        for(Animal a : list){
            a.eat();
        }
    }
}
