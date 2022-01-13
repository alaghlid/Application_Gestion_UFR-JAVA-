package Metier;

import java.util.Comparator;

public class The_Comparator implements Comparator<Etudiant> {

    public int compare(Etudiant E1, Etudiant E2)
    {
        return E1.getNummerEtudiant().compareTo(E2.getNummerEtudiant());
    }

}
