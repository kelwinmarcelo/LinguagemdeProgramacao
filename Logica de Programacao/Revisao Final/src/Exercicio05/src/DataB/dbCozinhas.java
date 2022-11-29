package DataB;

import java.util.ArrayList;

import Class.Cozinha;

public class dbCozinhas {
    private ArrayList<Cozinha> cozinhas = new ArrayList<Cozinha>();

    public ArrayList<Cozinha> getCozinhas() {
        this.cozinhas.add(
                new Cozinha("Árabe", dbPratos.gePratos()));
        this.cozinhas.add(
                new Cozinha("Italiana", dbPratos.gePratos()));
        this.cozinhas.add(
                new Cozinha("Mineira", dbPratos.gePratos()));

        return cozinhas;
    }

}