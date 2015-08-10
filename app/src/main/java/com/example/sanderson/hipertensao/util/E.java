package com.example.sanderson.hipertensao.util;

/**
 * Created by sanderson on 09/08/2015.
 */
public class E {

    public static class user{
        public static String CREATE = "CREATE TABLE pessoa(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "year INTEGER not null"+
                ")";

    }

    public static class frequence{
        public static String CREATE = "CREATE TABLE frequencias("+
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "data_time TEXT not null," +
                "frequencia TEXT not null" +
                ")";
    }
}
