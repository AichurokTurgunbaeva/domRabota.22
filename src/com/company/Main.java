package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("Alphabet.txt")) {
            writer.write("Aa\n");
            writer.write("Bb\n");
            writer.write("Cc\n");
            writer.write("Dd\n");
            writer.write("Ee\n");
            writer.write("Ff\n");
            writer.write("Gg\n");
            writer.write("Hh\n");
            writer.write("Ii\n");
            writer.write("Jj\n");
            writer.write("Kk\n");
            writer.write("Ll\n");
            writer.write("Mm\n");
            writer.write("Nn\n");
            writer.write("Oo\n");
            writer.write("Pp\n");
            writer.write("Qq\n");
            writer.write("Rr\n");
            writer.write("Ss\n");
            writer.write("Tt\n");
            writer.write("Uu\n");
            writer.write("Vv\n");
            writer.write("Ww\n");
            writer.write("Xx\n");
            writer.write("Yy\n");
            writer.write("Zz\n");
            writer.write("0\n");
            writer.write("1\n");
            writer.write("2\n");
            writer.write("3\n");
            writer.write("4\n");
            writer.write("5\n");
            writer.write("6\n");
            writer.write("7\n");
            writer.write("8\n");
            writer.write("9\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
            try(FileReader reader = new FileReader("Alphabet.txt")) {
                Scanner scanner = new Scanner(reader);
                while (scanner.hasNextLine()) {
                }
                } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }
