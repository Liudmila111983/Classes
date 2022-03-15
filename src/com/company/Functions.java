package com.company;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
            // Функциональное программирование
            int number = input();
            int result = calc(number);
            print(result);

        }

        static int input(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ВВедите число: ");
            int number = scanner.nextInt();
            return number;
        }

        static int calc(int number){
            int doubleNum = number*2;
            return doubleNum;
        }

        static void print(int number){
            System.out.println("Answer:"+number);
        }
    }

