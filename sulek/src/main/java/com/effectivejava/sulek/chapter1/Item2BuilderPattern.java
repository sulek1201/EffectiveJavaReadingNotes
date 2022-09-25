package com.effectivejava.sulek.chapter1;


public class Item2BuilderPattern {

    private String textField;
    private Integer sayiField;

    public Item2BuilderPattern(String textField, Integer sayiField) {
        this.textField = textField;
        this.sayiField = sayiField;
    }

    public Item2BuilderPattern() {
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public Integer getSayiField() {
        return sayiField;
    }

    public void setSayiField(Integer sayiField) {
        this.sayiField = sayiField;
    }

    public static class Builder{
        private String textField;
        private Integer sayiField;

        public Builder textField(String value){
            textField = value;
            return this;
        }
        public Builder sayiField(Integer value){
            sayiField = value;
            return this;
        }

        public Item2BuilderPattern build(){
            return new Item2BuilderPattern(this);
        }
    }

    private Item2BuilderPattern(Builder builder){
        textField = builder.textField;
        sayiField = builder.sayiField;
    }
}
