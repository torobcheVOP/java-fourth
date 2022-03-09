package mp3;

import java.util.ArrayList;

public class Album {
    String name;
    Artist artist;
    String genre;
     ArrayList<Song> songs;
public Album()
{

}
    public Album(String name,Artist artist,String genre){
        this.artist=artist;
        this.genre=genre;
        this.name=name;
         songs = new ArrayList<Song>();

    }
    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }
    //next----------------------------------------------------------------------------------------------------------------
    public Boolean addSong(Song song) {
        if (artist == song.artist) {
            songs.add(song);
            return true;
        }else
            return false;
    }
    public void removeSong(Song song) {
        for(int i=0;i<songs.size();i++) {
            if (songs.get(i) == song) {
                songs.remove(song);
                break;
            }
            else System.out.println("there was nothing to remove");
break;
        }


    }
    public ArrayList<Song> getSong()
    {

        return songs;
    }


    public String toString()
    {
        String toString= getName()+""+getGenre()+""+getSong();
    return toString;
    }


}
