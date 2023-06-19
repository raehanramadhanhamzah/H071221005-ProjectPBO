package com.raehan.projectpbo.layouts;

import java.util.Scanner;


public class Menu {
    public static void main(String[] args)  {
        menu();
        Scanner inputMenu = new Scanner(System.in);
        System.out.print("Pilih : ");
        int inputan = Integer.parseInt(inputMenu.nextLine());
        while(inputan != 0){
            if(inputan== (1)){
                System.out.println("----------------------DAFTAR BARANG----------------------");
                ReadData.getDatabase();
                System.out.println("-------------------------------------------------------");
                break;
            }else if(inputan== (2)){
                InsertData.insertData();
                System.out.println("-------------------------------------------------------");
                break;
            }else if(inputan== (3)){
                EditData.editData();
                break;
            }else if(inputan== (4)){
                DeleteData.deleteData();
                break;
            }else{
                menu();
                System.out.print("Pilih : ");
                inputan = Integer.parseInt(inputMenu.nextLine());
            }
            menu();
            System.out.print("Pilih : ");
            inputan = inputMenu.nextInt();
        }
        System.out.println("------------------------TERIMA KASIH------------------------");
        inputMenu.close();
       
    }
    public static void menu(){
        System.out.println("-------------SELAMAT DATANG DI JAYA HP STORE-------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("1.) Read Data ");
        System.out.println("2.) Insert Data ");
        System.out.println("3.) Edit Data ");
        System.out.println("4.) Delete Data ");
        System.out.println("0.) Exit ");
        System.out.println("---------------------------------------------------------");
    }
}
