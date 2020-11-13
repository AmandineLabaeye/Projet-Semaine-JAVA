package com.company;

import java.util.Scanner;

public class GameString {

    String choice;
    Scanner scanner = new Scanner(System.in);
    String input;

    int route;
    int colline;
    int building;
    int vallee;
    int foret;

    int position;


    public String Menu() {

        System.out.println("Bienvenue sur le jeu");
        System.out.println("Écrit j pour lancer le jeu");
        System.out.println("Écrit q pour quitter le jeu");
        input = scanner.nextLine();

        choice = input;

        while (!(choice.equals("j") || choice.equals("q"))) {

            try {
                choice = input;
            } catch (Exception e) {
                System.out.println("La lettre écrit n'est pas valide, veuillez réessayer");
                input = scanner.nextLine();
            }

            if (!choice.equals("j") && !choice.equals("q")) {
                System.out.println("La lettre écrit n'est pas vallide, veuillez réessayer");
                input = scanner.nextLine();
            }

        }

        return choice;
    }


    public void Play() {

        System.out.println("Le jeu commence");

        route = 1;
        colline = 2;
        building = 3;
        vallee = 4;
        foret = 5;

        // Position de départ
        position = 0;

        boolean finished = false;

        while (!finished) {

            switch (position) {
                case 1:
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Vous êtes au bout de la route devant un petit immeuble en brique. Un petit ruisseau coule\n" +
                            "a côté du building en bas d’une rigole.");

                    System.out.println("---------------------------------------------------------------------");
                    // Pour allez partout
                    System.out.println("Écrit N si tu veux allez en haut");
                    System.out.println("Écrit S si tu veux allez en bas");
                    System.out.println("Écrit E si tu veux allez à droite");
                    System.out.println("Écrit W si tu veux allez à gauche");
                    System.out.println("Écrit Q si tu veux quitter le jeu");

                    input = scanner.nextLine();

                    while (!(input.equals("N") || input.equals("S") || input.equals("E") || input.equals("W") || input.equals("Q"))) {

                        System.out.println("La lettre écrit n'est pas vallide, veuillez réessayer");
                        input = scanner.nextLine();

                    }

                    if (input.equals("N")) {
                        position = 5;
                        System.out.println("Vous avez choisi d'allez vers la Fôret");
                    } else if (input.equals("S")) {
                        position = 4;
                        System.out.println("Vous avez choisi d'allez vers la Vallée");
                    } else if (input.equals("E")) {
                        position = 3;
                        System.out.println("Vous avez choisi d'allez vers le Building");
                    } else if (input.equals("W")) {
                        position = 2;
                        System.out.println("Vous avez choisi d'allez vers Colline");
                    } else if (input.equals("Q")) {
                        System.out.println("Vous avez décidé de quitter le jeu");
                        finished = true;
                        position = 0;
                    }

                    break;

                case 2:
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Vous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre\n" +
                            "se déplacer a grande vitesse avec un grand couteau.");

                    System.out.println("---------------------------------------------------------------------");

                    System.out.println("Écrit N si tu veux allez en haut");
                    System.out.println("Écrit Q si tu veux quitter le jeu");

                    input = scanner.nextLine();

                    while (!(input.equals("N") || input.equals("Q"))) {

                        System.out.println("La lettre écrit n'est pas vallide, veuillez réessayer");
                        input = scanner.nextLine();

                    }

                    if (input.equals("N")) {
                        position = 5;
                        System.out.println("Vous avez choisi d'allez vers la Fôret");
                    } else if (input.equals("Q")) {
                        System.out.println("Vous avez décidé de quitter le jeu");
                        finished = true;
                        position = 0;
                    }

                    break;

                case 3:
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes. Un homme\n" +
                            "git là au milieu d’une marre de sang.");

                    System.out.println("---------------------------------------------------------------------");

                    System.out.println("Écrit W si tu veux allez à gauche");
                    System.out.println("Écrit Q si tu veux quitter le jeu");

                    input = scanner.nextLine();

                    while (!(input.equals("W") || input.equals("Q"))) {

                        System.out.println("La lettre écrit n'est pas vallide, veuillez réessayer");
                        input = scanner.nextLine();

                    }

                    if (input.equals("W")) {
                        position = 1;
                        System.out.println("Vous avez choisi d'allez vers la Route");
                    } else if (input.equals("Q")) {
                        System.out.println("Vous avez décidé de quitter le jeu");
                        finished = true;
                        position = 0;
                    }

                    break;
                case 4:
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Vous êtes dans une vallée a coté d’un ruisseau. Un corps flotte là dans l’eau.");

                    System.out.println("---------------------------------------------------------------------");

                    System.out.println("Écrit N si tu veux allez en haut");
                    System.out.println("Écrit W si tu veux allez à gauche");
                    System.out.println("Écrit Q si tu veux quitter le jeu");

                    input = scanner.nextLine();

                    while (!(input.equals("N") || input.equals("W") || input.equals("Q"))) {

                        System.out.println("La lettre écrit n'est pas vallide, veuillez réessayer");
                        input = scanner.nextLine();

                    }

                    if (input.equals("N")) {
                        position = 1;
                        System.out.println("Vous avez choisi d'allez vers la Route");
                    } else if (input.equals("W")) {
                        position = 2;
                        System.out.println("Vous avez choisi d'allez vers la Colline");
                    } else if (input.equals("Q")) {
                        System.out.println("Vous avez décidé de quitter le jeu");
                        finished = true;
                        position = 0;
                    }

                    break;

                case 5:

                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Vous êtes dans la foret noire. Vous entendez des hurlements stridents");

                    System.out.println("---------------------------------------------------------------------");

                    System.out.println("Écrit S si tu veux allez en bas");
                    System.out.println("Écrit Q si tu veux quitter le jeu");

                    input = scanner.nextLine();

                    while (!(input.equals("S") || input.equals("Q"))) {

                        System.out.println("La lettre écrit n'est pas vallide, veuillez réessayer");
                        input = scanner.nextLine();

                    }

                    if (input.equals("S")) {
                        position = 1;
                        System.out.println("Vous avez choisi d'allez vers la Route");
                    } else if (input.equals("Q")) {
                        System.out.println("Vous avez décidé de quitter le jeu");
                        finished = true;
                        position = 0;
                    }

                    break;
                default:

                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Vous êtes chez vous devant votre ordinateur en plein cours Java\n");

                    System.out.println("---------------------------------------------------------------------");

                    System.out.println("Ecrit exit pour sortir de la maison");

                    input = scanner.nextLine();

                    while (!(input.equals("exit"))) {

                        System.out.println("La lettre écrit n'est pas vallide, veuillez réessayer");
                        input = scanner.nextLine();

                    }

                    System.out.println("Vous avez choisi d'allez vers la route");

                    if (input.equals("exit")) {
                        position = 1;
                    }

                    System.out.println(position);
            }

        }

    }

    public void Leave() {
        System.out.println("Vous avez décider de quitter le jeu");
        System.exit(200);
        // Mettre redirection vers Menu du logiciel
    }

}
