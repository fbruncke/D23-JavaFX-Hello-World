package com.example.d23javafxhelloworld;

public class Craftsman<T, E> {
    private T tool;
    private E anotherTool;

    public Craftsman(T tool, E aTool) {
        this.tool = tool;
        this.anotherTool=aTool;
    }

    public void setTool(T tool) {
        this.tool = tool;
    }

    public void setAnotherTool(E anotherTool) {
        this.anotherTool = anotherTool;
    }

    public static void main(String[] args) {
        Craftsman<Hammer, Anvil> blackSmith = new Craftsman<>(new Hammer(), new Anvil());
        //blackSmith.setTool();
        //blackSmith.setAnotherTool();

    }
}
