package com.zp.designpattern.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangpeng01 on 2019/1/31.
 */
public class FlyweightFactory {

    public static Map<String,Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String type){
        Shape shape = shapeMap.get(type);
        if(shape == null){
            shape = new Circle(type);
            shapeMap.put(type,shape);
        }
        return shape;
    }


}
