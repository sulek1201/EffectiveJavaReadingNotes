package com.effectivejava.sulek.chapter1;

public class Main {


    public static void main(String[] args) {
        staticFactoryMethodTry();
        telescopingConstructorTry("telescoping", 1);
        javaBeanPattern("javaBean", 1);
        builderPattern("builder", 1);
    }

    private static void staticFactoryMethodTry() {
        System.out.println(Item1StaticFactoryMethods.valueOf(false));
    }

    private static Item2BuilderPattern telescopingConstructorTry(String textField, Integer sayiField) {
        return new Item2BuilderPattern(textField, sayiField);
    }

    private static Item2BuilderPattern javaBeanPattern(String textField, Integer sayiField) {
        Item2BuilderPattern item2BuilderPattern = new Item2BuilderPattern();
        item2BuilderPattern.setSayiField(sayiField);
        item2BuilderPattern.setTextField(textField);
        return item2BuilderPattern;
    }

    private static Item2BuilderPattern builderPattern(String textField, Integer sayiField) {
        return new Item2BuilderPattern.Builder().sayiField(sayiField).textField(textField).build();
    }
}
