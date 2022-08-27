package com.company;
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vector> lstOfRandomVectors = Vector.generateListOfVectors();
        System.out.println(lstOfRandomVectors);
        System.out.println(lstOfRandomVectors.get(0).lengthOfVector());
    }
}


class Vector {
    int x;
    int y;
    int z;
    Random random = new Random();

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(){
        this.x = this.generateRandomNum();
        this.y = this.generateRandomNum();
        this.z = this.generateRandomNum();
    }

    private int generateRandomNum() {
        return this.random.nextInt(100);
    }

    public int lengthOfVector() {
        int sumOfSquares = (this.x * this.x + this.y * this.y + this.z * this.z);
        return (int) Math.sqrt(sumOfSquares);
    }

    public int scalarProduct(Vector vector) {
        return vector.x * this.x + vector.y * this.y + vector.z * this.z;
    }

    public int scalarProduct() {
        Vector vector = new Vector();
        return vector.x * this.x + vector.y * this.y + vector.z * this.z;
    }

    public static ArrayList<Vector> generateListOfVectors(int len) {
        ArrayList<Vector> finalLst = new ArrayList<>();
        for (int i = 0; i<len; i++) {
            finalLst.add(new Vector());
        }
        return finalLst;

    }

    public static ArrayList<Vector> generateListOfVectors() {
        Random rand = new Random();
        int len = rand.nextInt(20);

        ArrayList<Vector> finalLst = new ArrayList<>();
        for (int i = 0; i<len; i++) {
            finalLst.add(new Vector());
        }
        return finalLst;

    }
}
