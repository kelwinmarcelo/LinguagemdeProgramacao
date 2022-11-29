package DataB;

import java.util.ArrayList;

import Class.Prato;

public class dbPratos {
    static ArrayList<Prato> pratos = new ArrayList<Prato>();

    public static ArrayList<Prato> gePratos() {
        pratos.add(
                new Prato("Tropeiro", 25.));
        pratos.add(
                new Prato("Carbonara", 30.));

        return pratos;
    }

}