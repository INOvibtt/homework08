package com.example;

import java.util.Scanner;

public class ShapeManager {

    public void inputShape() {
        Scanner in = new Scanner(System.in);
        System.out.println("Привіт! Давай створимо фігуру!\nДля початку обери тип фігури (введи її номер):" +
                "\n1.Коло" +
                "\n2.Квадрат" +
                "\n3.Трикутник" +
                "\n4.Ромб" +
                "\n5.Трапеція");
        int num;
        while (true) {
            num = in.nextInt();
            if(num >= 1 && num <= 5){
                break;
            } else{
                System.out.println("Будь-ласка, переглянь ще раз список фігур та введи правильний номер фігури (1-5):");
            }
        }

        Shape shape = createShape(num);

        System.out.println("Чудово ти обрав фігуру: " + shape.getShapeName() + "! Тепер можна ввести колір фігури:");
        in.nextLine();
        String color = in.nextLine();

        System.out.println("Тепер введи площу фігури:");
        float area = in.nextFloat();

        shape.setColor(color);
        shape.setArea(area);

        System.out.println("Вітаю! Ти повністю створив фігуру!");
        shape.getShapeInfo();
    }

    private Shape createShape(int num){
        switch (num) {
            case 1: return new Circle();
            case 2: return new Quad();
            case 3: return new Triangle();
            case 4: return new Diamond();
            case 5: return new Trapeze();
            default: throw new IllegalArgumentException("Невірний номер фігури: " + num);
        }
    }
}
