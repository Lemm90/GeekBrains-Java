package ru.khorolskiy.level_2.lesson_2;

public class MyArrayDataException extends NumberFormatException{
    private int index;
    private int velue;

    public int getIndex(){
        return index;
    }

    public int getVelue(){
        return velue;
    }

    public MyArrayDataException(int index, int velue){
        super("В ячейке " + index + " X " + velue + " отсутствует число");
        this.index = index;
        this.velue = velue;

    }
}
