package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Music {

    // 2 albums
    List<AlbumOne> albumOneList = new ArrayList<>();
    List<AlbumTwo> albumTwoList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    String input;
    String choice;

    public String Menu () {

        System.out.println("Bienvenue sur La playlist");
        System.out.println("Vous allez pouvoir choisir votre album entre deux album");

        System.out.println("--------------------------------------------------------");

        AlbumOnePrint();

        System.out.println("--------------------------------------------------------");

        AlbumTwoPrint();

        System.out.println("--------------------------------------------------------");

        System.out.println("Ecrit Premier pour Le premier Album");
        System.out.println("Ecrit Deuxième pour Le premier Album");

        input = scanner.nextLine();

        choice = input;

        while (!(choice.equals("Premier") || choice.equals("Deuxième"))) {

            try {
                choice = input;
            } catch (Exception e) {
                System.out.println("L'album choisi n'est pas valide, veuillez réessayer");
                input = scanner.nextLine();
            }

            if (!choice.equals("j") && !choice.equals("q")) {
                System.out.println("L'album choisi n'est pas valide, veuillez réessayer");
                input = scanner.nextLine();
            }

        }

        System.out.println("Vous avez choisi l'album " + input);

        return choice;

    }

    public void AlbumOnePrint () {
        albumOneList.add(new AlbumOne("Freeze Raël", "Freeze Corleone\n"));
        albumOneList.add(new AlbumOne("Hors ligne", "Freeze Corleone\n"));
        albumOneList.add(new AlbumOne("Scellé part.2", "Freeze Corleone\n"));
        albumOneList.add(new AlbumOne("Tarkov", "Freeze Corleone\n"));
        albumOneList.add(new AlbumOne("Rap catéchisme", "Freeze Corleone\n"));
        albumOneList.add(new AlbumOne("Stretch 4", "Freeze Corleone\n"));

        System.out.println("Premier Album (LMF/Freeze Corleone)");
        for (AlbumOne albumOne : this.albumOneList) {
            System.out.println("\t" + " Nom : " + albumOne.getNom());
        }

    }

    public void AlbumTwoPrint () {
        albumTwoList.add(new AlbumTwo("MEVTR", "Damso"));
        albumTwoList.add(new AlbumTwo("LIFE LIFE", "Damso"));
        albumTwoList.add(new AlbumTwo("DEUX TOILES DE MER", "Damso"));
        albumTwoList.add(new AlbumTwo("SENTIMENTAL", "Damso"));
        albumTwoList.add(new AlbumTwo("THEVIE RADIO (Interlude)", "Damso"));
        albumTwoList.add(new AlbumTwo("BXL ZOO", "Damso"));

        System.out.println("Deuxième Album (QALF / DAMSO)");
        for (AlbumTwo albumTwo : this.albumTwoList) {
            System.out.println("\t" + " Nom : " + albumTwo.getNom());
        }

    }

}
