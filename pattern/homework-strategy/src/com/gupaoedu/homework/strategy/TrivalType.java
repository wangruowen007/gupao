package com.gupaoedu.homework.strategy;

public enum TrivalType {
    DRIVE(new Drive()), PLANE(new Plane());

    private Trival trival;
    TrivalType(Trival trival) {
        this.trival = trival;
    }

    public Trival take() {
        return this.trival;
    }
}
