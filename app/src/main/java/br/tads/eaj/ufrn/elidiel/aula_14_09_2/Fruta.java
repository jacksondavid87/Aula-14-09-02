package br.tads.eaj.ufrn.elidiel.aula_14_09_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aluno on 14/09/2016.
 */
public class Fruta {
    public String nome;
    public int img;

    public Fruta(String nome, int img) {
        this.nome = nome;
        this.img = img;
    }
    public static List<Fruta> getFrutas(){
        List<Fruta> frutas = new ArrayList<Fruta>();
        frutas.add((new Fruta("Laranja", R.drawable.laranja)));
        frutas.add((new Fruta("Maca", R.drawable.maca)));
        frutas.add((new Fruta("Pera", R.drawable.pera)));
        frutas.add((new Fruta("Uva", R.drawable.uva)));
        frutas.add((new Fruta("Goiaba", R.drawable.goiaba)));
        frutas.add((new Fruta("Melao", R.drawable.melao)));
        frutas.add((new Fruta("Limao", R.drawable.limao)));
        return frutas;
    }


}
