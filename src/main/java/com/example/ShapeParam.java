package com.example;

abstract class ShapeParam {

    private String color;
    private float area;

    public void setColor(String color){
        this.color = color;
    }

    public void setArea(float area){
        this.area = area;
    }

    public String getShapeName(){return "";}

    public void getShapeInfo() {
        System.out.println("Інформація:\nФігура: " + getShapeName() + "\nКолір: " + color + "\nПлоща: " + area);
    }
}
