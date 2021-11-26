package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setBossWeapon(new Weapon("Steel Arms", "Knife"));
        System.out.println("Здоровье" + " " + boss.getHealth() + " " + "Урон" + " " + boss.getDamage() + " " + boss.getBossWeapon().getSteelArms() + " " + boss.getBossWeapon().getKnife());

    }
}
