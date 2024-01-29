package be.vdab.treemap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VBTreeMap {
    public static void main(String[] args) {

        Map<String, String> landen = new TreeMap<>();
        landen.put("B", "Belgie");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");

        String eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);

        String vorigLand = landen.put("F", "Finland");
        System.out.println("Vorig land met code F: " + vorigLand);
        eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);

        System.out.println("\n*** View van de Keys ***");
        for (String eenLandcode : landen.keySet()) {
            System.out.println(eenLandcode);
        }

        System.out.println("\n*** View van de Keys met bijhorende value-waarde ***");
        for (String eenLandnaam : landen.keySet()) {
            System.out.println(eenLandnaam + " heeft als landnaam: " + landen.get(eenLandnaam));
        }

        System.out.println("\n*** View van de values ***");
        for (String eenLandnaam : landen.values()) {
            System.out.println(eenLandnaam);
        }

        System.out.println("\n*** View van de Key-Value-paren ***");
        for (Map.Entry<String, String> eenLandEntry : landen.entrySet()) {
            System.out.println(eenLandEntry + "-> " + eenLandEntry.getKey() + ": " + eenLandEntry.getValue());
        }

    }
}


