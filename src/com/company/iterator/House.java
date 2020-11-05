package com.company.iterator;

import java.util.Iterator;

public class House implements Iterable<House.Part> {



    @Override
    public Iterator<Part> iterator() {
        return new HouseIterator(this);
    }

    public interface Part { }
    public static class Roof implements Part {
        @Override
        public String toString() {
            return "Roof";
        }
    }
    public static class Windows implements Part {
        @Override
        public String toString() {
            return "Windows";
        }
    }
    public static class Wall implements Part {
        @Override
        public String toString() {
            return "Wall";
        }
    }
    public static class Foundation implements Part{
        @Override
        public String toString() {
            return "Foundation";
        }
    }

    private Roof roof;
    private Windows windows;
    private Wall wall;
    private Foundation foundation;
    private int numberPartsOfHouse;


    public House() {
        numberPartsOfHouse=0;
    }
    public House(Foundation foundation) {
        this.foundation = foundation;
        numberPartsOfHouse=1;
    }

    public House(Wall wall, Foundation foundation) {
        this.wall = wall;
        this.foundation = foundation;
        numberPartsOfHouse=2;
    }

    public House(Roof roof, Wall wall, Foundation foundation) {
        this.roof = roof;
        this.wall = wall;
        this.foundation = foundation;
        numberPartsOfHouse=3;
    }

    public House(Roof roof, Windows windows, Wall wall, Foundation foundation) {
        this.roof = roof;
        this.windows = windows;
        this.wall = wall;
        this.foundation = foundation;
        numberPartsOfHouse=4;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public boolean hasRoof(){
        return roof !=null;
    }

    public boolean hasWall(){
        return wall !=null;
    }

    public boolean hasWindow(){
        return windows !=null;
    }

    public boolean hasFoundation(){
        return foundation !=null;
    }


    public Foundation getFoundation() {
        return foundation;
    }

    public int getNumberPartsOfHouse() {
        return numberPartsOfHouse;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }


}
