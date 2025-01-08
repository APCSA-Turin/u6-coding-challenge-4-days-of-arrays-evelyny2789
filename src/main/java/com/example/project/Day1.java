package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if(name.equals(null) || name.equals("")){
            throw new IllegalArgumentException("Name cannot be null or empty"); 
        } else{
            int stringNum = elf_names.length + 1;
            int num = (int) Math.random() * (stringNum - 1) + 1; 
            String elfName = elf_names[num - 1];
            return elfName + " " + name; 
        }
        
    }
        
}
