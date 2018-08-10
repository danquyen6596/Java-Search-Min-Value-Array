package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class MinValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] interger = new int[5];
        int min;

//Nhập vào các phần tử
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < interger.length; i++)
        {
            System.out.print("interger["+i+"]= ");
            interger[i] = scanner.nextInt();
        }

        min = interger[0];


//Tìm phần tử nhỏ nhất trong mảng
        for (int i = 1; i < interger.length; i++)
        {
            if (min > interger[i]){
                min = interger[i];
            }
        }

//In giá trị min ra màn hình
        System.out.print("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
