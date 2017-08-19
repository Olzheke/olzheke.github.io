package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human Grandfather1 = new Human("Gf1",true, 50);
        Human Grandfather2 = new Human("Gf2",true, 55);
        Human Grandmother1 = new Human("Gm1", false, 50);
        Human Grandmother2 = new Human("Gm2", false, 55);
        Human father = new Human("f1", true, 30, Grandfather1, Grandmother1);
        Human mother = new Human("m1", false, 28, Grandfather2, Grandmother2);
        Human son1 = new Human("s1", true, 14, father, mother);
        Human son2 = new Human("s2", true, 10, father, mother);
        Human daughter1 = new Human("d1", false, 7,father,mother);

        System.out.println(Grandfather1);
        System.out.println(Grandfather2);
        System.out.println(Grandmother1);
        System.out.println(Grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter1);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















