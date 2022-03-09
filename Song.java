package mp3;

import java.util.ArrayList;

public class Song {
    Artist artist;
    String name;
    Album album;
    public Song(String name,Artist artist)
    {
        this.artist=artist;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }
    public Album getAlbum()
    {
return album;
    }





    public String toString()
    {
String total=getName()+""+ getArtist();
return total;
    }


}
