package com.company.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HouseIterator implements Iterator<House.Part> {
    private House house;
    private int wordPartsCount;

    public HouseIterator(House house) {
        this.house = house;
        this.wordPartsCount = house.getNumberPartsOfHouse();
    }

    @Override
    public boolean hasNext() {
        if (wordPartsCount == 4) {
            return house.hasWall() || house.hasFoundation() || house.hasRoof() || house.hasWindow();
        } else if (wordPartsCount == 3) {
            return house.hasWall() || house.hasFoundation() || house.hasRoof();
        } else if (wordPartsCount == 2) {
            return house.hasWall() || house.hasFoundation();
        } else if (wordPartsCount == 1) {
            return house.hasFoundation();
        }
        return false;
    }

    @Override
    public House.Part next() throws NoSuchElementException {
        if (wordPartsCount <= 0) {
            throw new NoSuchElementException("No more elements in this word!");
        }

        try {
            if (wordPartsCount == 4) {
                return house.getWindows();
            }
            if (wordPartsCount == 3) {
                return house.getRoof();
            }
            if (wordPartsCount == 2) {
                return house.getWall();
            }
            return house.getFoundation();
        } finally {
            wordPartsCount--;
        }
    }
}