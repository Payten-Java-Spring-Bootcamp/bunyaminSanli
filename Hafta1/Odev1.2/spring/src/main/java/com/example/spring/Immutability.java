package com.example.spring;

import lombok.Getter;

//immutability kavramını kullanmak için class final anahtar kelimesi ile oluşturulur
//lomboktan getter anotasyonu eklenir
@Getter
final public class Immutability {
    //field private tanımlanır
    private String data;

    //constructor olusturup değişkene ilk değerini atadım
    public Immutability() {
        this.data = "6546546541656";
    }
}
