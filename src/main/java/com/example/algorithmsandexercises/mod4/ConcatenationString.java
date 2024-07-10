package com.example.algorithmsandexercises.mod4;

import java.util.ArrayList;
import java.util.List;

public class ConcatenationString {

    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String con = "";

        for (int i = 0; i < companies.size(); i++) {
            con = con + companies.get(i) + ",";
        }
        con = con.substring(0, con.length() - 1);
        System.out.println(con);


        // inna metoda

        String con1 = String.join(",", companies);
        System.out.println(con1);

        //inna metoda

        StringBuilder sb = new StringBuilder();
        for (String company : companies) {
            sb.append(company).append(",");
        }
        sb.setLength(con.length());
        System.out.println(sb.toString());
    }
}
