package Tema5.MusicOrganizerv2;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    public void listAllFiles(){
        for (String filename : files) {
            System.out.println(filename);
        }
    }

    public void listMatching(String match){
        for (String filename : getMatching(match)) {
                System.out.println(filename);
        }      
           
        if (getMatching(match).size() == 0) {
                    System.out.println("No se ha encontrado ninguna cancion con esa cadena");
        }
            
        
    }

    public void playMatching(String match){
       
        for (String filename : getMatching(match)) {
                System.out.println(filename);
                this.player.playSample(filename);
            
        }
    }

    public ArrayList<String> getMatching(String match){
      
        ArrayList<String> files2;
        files2 = new ArrayList<>();

        for (String filename : files) {
            if (filename.contains(match)) {
                files2.add(filename);
            }
        }
        return files2;
    }

    public int findFirst(String searchString)
    {
        boolean found = false;
        int cancionEncontrada = -1;
        int index = 0;  
        int longitudFiles = files.size();
        while (!found && index < longitudFiles)
        {
            if(this.files.get(index).contains(searchString))
            {
                found = true;
                cancionEncontrada = index;
            }
            index++;
        }
        return cancionEncontrada;
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
}
