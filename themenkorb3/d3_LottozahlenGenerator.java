package themenkorb3;

import java.util.Random;

public class d3_LottozahlenGenerator {
    public static void main(String[] args) {
        int anzahlZahlen = 6;
        int maxZahl = 45;

        int[] lottozahlen = generiereLottozahlen(anzahlZahlen, maxZahl);

        System.out.print("Lottozahlen: ");
        for (int zahl : lottozahlen) {
            System.out.print(zahl + " ");
        }
        System.out.println();
    }

    public static int[] generiereLottozahlen(int anzahl, int maxZahl) {
        int[] lottozahlen = new int[anzahl];
        Random random = new Random();

        for (int i = 0; i < anzahl; i++) {
            int zahl;
            do {
                zahl = random.nextInt(maxZahl) + 1;
            } while (enthältZahl(lottozahlen, zahl));

            lottozahlen[i] = zahl;
        }

        return lottozahlen;
    }

    public static boolean enthältZahl(int[] zahlen, int zahl) {
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] == zahl) {
                return true;
            }
        }
        return false;
    }
}
