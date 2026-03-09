package com.angelclaire;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import com.google.gson.Gson;
import com.angelclaire.model.Person;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Person person = new Person("Franklin","Lieste", "32", emailAddress: "tinfoilhat@valdivian.org", phoneNumber: "+1 078 485 9285", dateOfBirth: "2025-6-17", homeAddress: "Valdivian HQ, Coolsville","True", nationality: "American", gender: "Male");

        Gson gson = new Gson();

        String json = gson.toJson(person);

        System.out.println(json);

        FileWriter fw = new FileWriter("json/data/person.json");
        gson.toJson(person, fw);

        fw.close();
    }

}