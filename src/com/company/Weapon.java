package com.company;

public class Weapon {
    private String typeWeapon;
    private String nameWeapon;

    public Weapon(String typeWeapon, String nameWeapon) {
        this.typeWeapon = typeWeapon;
        this.nameWeapon = nameWeapon;
    }

    public String getSteelArms() {
        return typeWeapon;
    }

    public void setSteelArms(String steelArms) {
        this.typeWeapon = typeWeapon;
    }

    public String getKnife() {
        return nameWeapon;
    }

    public void setKnife(String knife) {
        this.nameWeapon = nameWeapon;
    }
}

