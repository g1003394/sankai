package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Imas> imasList = new ArrayList<>();
            imasList.add(new Imas("島村卯月", "17", "キュート"));
            imasList.add(new Imas("渋谷凛", "15", "クール"));
            imasList.add(new Imas("本田未央", "15", "パッション"));
            System.out.println(imasList.get(3));
        } catch (Exception e) {
            System.out.println("例外が発生しました");
            System.out.println("詳細:" + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("プログラムを終了します");
        }
    }
}

