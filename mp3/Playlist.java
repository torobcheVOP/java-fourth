package mp3;

import java.util.ArrayList;

public class Playlist {
    String names;
    static int l;
    public static Song current_song;
    ArrayList<Song> songs = new ArrayList<>();
    ArrayList<Album> albums =new ArrayList<>();
    public Playlist()
    {

    }
    public Playlist(String name){
this.names=name;
}
public void addSong(Song song){
songs.add(song);
}
public void addAlbum(Album album){
albums.add(album);
}
public boolean removeSong(Song song) {
        int j=1;
    for (int i = 0; i <= songs.size(); i++) {
        if (song == songs.get(i)) {
            songs.remove(i);
            j=0;
            break;
        }
    }
    if(j==0)
    {
        return true;
    }
    else return false;
}
public Song currentSong()
 {
if(current_song!=null)
{
    return current_song;
}
else return current_song;
 }
 public void goNext()
 {
     l++;
     int y=l;
     y++;
     if(y>songs.size())
     {
         l=0;
         current_song=songs.get(l);
         System.out.println(current_song.name+" "+"is playing");
     }
     else
     {
         current_song=songs.get(l);
         System.out.println(current_song.name+" "+"is playing");
     }

 }
 public void goPrevious()
 {
     if(l==0)
     {
         current_song=songs.get(l);
         System.out.println(current_song.name+" "+"is playing");
     }
     else {
         l--;
         current_song=songs.get(l);
         System.out.println(current_song.name+" "+"is playing");
     }


 }
 public void play()
 {
     l=0;
         current_song=songs.get(l);
         String name=songs.get(l).getName();
         System.out.print(name+" "+"is plaing now");

 }
 public void stop()
 {
     if(current_song==null)
     {
         System.out.print("there is nothing to play");
     }
     else
     {
         current_song=null;
test test=new test();
test.yy=0;
         System.out.print("the song was stop so the"+""+current_song+""+"is playng now");
     }

 }
}
