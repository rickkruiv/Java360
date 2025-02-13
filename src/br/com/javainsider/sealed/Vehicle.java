package br.com.javainsider.sealed;

public abstract sealed class Vehicle permits Car, Bus {

   public abstract void drive();
}
