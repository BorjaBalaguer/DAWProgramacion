package Tema5.Club;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...

    private static ArrayList<Membership> miembrosclub = new ArrayList<>();
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        miembrosclub.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return miembrosclub.size();
    }

    public int joinedlnMonth(int month){
        int contadorMiembros = 0;

        if (month >= 1 & month <= 12) {
            for (Membership memberships : miembrosclub) {
                if (memberships.getMonth() == month) {
                    contadorMiembros++;
                }
            }
        }else{
            System.out.println("El mes no existe");
        }

        return contadorMiembros;
    }

    public int purge(int month){
        Iterator<Membership> it = miembrosclub.iterator();
        int miembrosEliminados= 0;

        while(it.hasNext()){
            Membership iMembership = it.next();
            if (iMembership.getMonth() == month) {
                it.remove();
                miembrosEliminados++;
            }
        }
        return miembrosEliminados;
    }
}