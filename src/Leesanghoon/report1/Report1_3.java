package Leesanghoon.report1;
// 2-8 번 문제
public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x=" +x);
        System.out.println("y=" +y);
        System.out.println("z=" +z);
    }
}