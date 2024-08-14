package com.ht.文字冒险;

public class UIDsystem {


    private String UID;
    private String Password;
    private int attack;
    private int defense;
    private int HP;

    void setUID(String UID) {
        this.UID = UID;
    }
    void setPassword(String Password) {
        this.Password = Password;
    }
    void setAttack(int attack){
        this.attack = attack;
    }
    void setDefense(int defense){
        this.defense = defense;
    }
    void setHP(int HP){
        this.HP = HP;
    }

    String getUID() {
        return this.UID;
    }
    String getPassword() {
        return this.Password;
    }
    int getAttack(){
        return this.attack;
    }
    int getDefense(){
        return this.defense;
    }
    int getHP(){
        return this.HP;
    }





}
