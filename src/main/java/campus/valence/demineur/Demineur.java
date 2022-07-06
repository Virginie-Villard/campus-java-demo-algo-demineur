package campus.valence.demineur;

import java.util.*;

public class Demineur {

    private int bombCount;
    private int boardSize;

    // création d'un ensemble unique de bombes
    private Set<Case.BombCase> bombes = new HashSet<Case.BombCase>();

    public static Demineur create(int bombCount, int boardSize) {
        Case[][] board = new Case[boardSize][boardSize];
        // placeBombes();
        return null;
    }

    public Set<Case.BombCase> placeBombes() {
        // tant que mon ensemble contient moins que le nombre de bombes que j'ai choisi dans Main
        while (bombes.size() < bombCount){
            int min = 0;
            int max = boardSize;



//            System.out.println("Random value in int from "+min+" to "+max+ ": ");
//            int random_int_1 = (int)Math.floor(Math.random()*(max-min+1)+min);
//            int random_int_2 = (int)Math.floor(Math.random()*(max-min+1)+min);
//            System.out.println(random_int_1 + " / " + random_int_2);
//
//            Case.BombCase nouvelleBombe = (Case.BombCase) board[random_int_1][random_int_2];
//
//            System.out.println(bombes.size());
//            // j'ajoute une bombe à mon ensemble, si une même bombes existe déjà elle ne sera pas ajoutée mais remplacée
//            bombes.add(nouvelleBombe);
        }

//        System.out.println(bombes);
//        return bombes;
    }

    private Case[][] board;

    protected Demineur(Case[][] board) {
        this.board = board;
    }

    public String boardAsString() {
        return "";
    }

    public Case[][] getBoard() {
        return board;
    }

    public int countBombsAround(int x, int y) {
        throw new RuntimeException("To be implemented");
    }
}
