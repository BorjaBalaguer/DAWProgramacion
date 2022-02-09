package Tema5.MusicOrganizerv1;

public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer M1 = new MusicOrganizer();
        M1.addFile("Primera Cancion");
        M1.addFile("Segunda Cancion");
        System.out.println(M1.getNumberOfFiles());
        M1.listFile(1);
        M1.removeFile(1);
        M1.isValidIndex(1);
    }
}
