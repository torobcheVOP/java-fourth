package mp3;

import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class test {
     static int jj;
     public static int yy;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Album album1= new Album();

        ArrayList<Playlist> playlists = new ArrayList<>();
        Playlist playlistt = new Playlist();
        System.out.println("---------------MP3 managment-----------------");
        while (true) {
            System.out.println("please select what proc do you want to do:" + "\n" + "1-creating a playlist" + "\n" + "2-addsong" + "\n" + "3-addAlbum" + "\n" + "4-removeSong" + "\n" + "5-getCurrentSong" + "\n" + "6-go to next Song" + "\n" + "7-go to previous song" + "\n" + "8-play the song" + "\n" + "9-pause the song"+"\n"+"10-return the name of that album"+"\n"+"11-return the genre of that album"+"\n"+"12-return the name of that album"+"\n"+"13-showing all the songs in a specific album");
            int j = scanner.nextInt();
            scanner.nextLine();
            int r;
            if (j == 1)
            {
                System.out.println("please choose a name for your playlist");
                String name = scanner.nextLine();
                Playlist playlist = new Playlist(name);
                playlists.add(playlist);
                System.out.println("playlist" + name + "added to your MP3 managment ");


            }
            //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            else if (j == 2) {
                System.out.println("we are going to add a new song so we need playlist name and the other thing");
                System.out.println("please choose the playlist");
                int y = playlists.size();
                for (int i = 0; i < playlists.size(); i++) {
                    System.out.println(i + "-" + playlists.get(i).names);
                }
                System.out.println("please enter the playlist number:");
                int p = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < playlists.size(); i++) {
                    if (p == i) {
                        System.out.println("please enter the name of that artist:");
                        String artist_name = scanner.nextLine();
                        Artist artist = new Artist(artist_name);
                        System.out.println("please enter the name of that song:");
                        String song_name = scanner.nextLine();
                        System.out.println("please enter the name of that album:");
                        String album_name = scanner.nextLine();
                        System.out.println("please enter the name of that genre:");
                        String genre_name = scanner.nextLine();
                        Album album = new Album(album_name, artist, genre_name);
                        Song song = new Song(song_name, artist);
                        song.album = album;
                        playlists.get(p).addSong(song);
                        System.out.println("song added successfully :D");
                        for(int m=0;m<playlists.get(p).songs.size();m++)
                        {
                            System.out.println(playlists.get(p).songs.get(m).name);
                        }
                    }

                }


            }


            //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            else if (j == 3) {
                System.out.println("we want to add a new album so we need a playlist and name for the album and genre and a name for the artist");
                System.out.println("please choose the playlist");
                int y = playlists.size();
                for (int i = 0; i < playlists.size(); i++) {
                    System.out.println(i + "-" + playlists.get(i).names);
                }
                System.out.println("please enter the playlist number:");
                int p = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < playlists.size(); i++) {
                    if (p == i) {
                        System.out.println("please enter the name of that artist:");
                        String artist_name = scanner.nextLine();
                        Artist artist = new Artist(artist_name);
                        /*System.out.println("please enter the name of that song:");

                        String song_name = scanner.nextLine();
                         */
                        System.out.println("please enter the name of that album:");
                        String album_name = scanner.nextLine();
                        System.out.println("please enter the name of that genre:");
                        String genre_name = scanner.nextLine();
                        Album album = new Album(album_name, artist, genre_name);
                        //Song song = new Song(song_name, artist);
                        //song.album = album;
                        playlists.get(p).addAlbum(album);
                        System.out.println("album added successfully :D");

                    }
                }
            } else if (j == 4) {
                System.out.println("we want to remove a song so we need the name of that playlist and song");
                for (int i = 0; i < playlists.size(); i++) {
                    System.out.println(i + "-" + playlists.get(i).names);
                }
                System.out.println("please choose the playlist");
                int p=scanner.nextInt();
                for (int o = 0; o < playlists.size(); o++) {
                    if (p == o) {
                        for(int yt=0;yt<playlists.get(p).songs.size();yt++)
                        {

                            System.out.println(yt+"-"+""+playlists.get(p).songs.get(yt).name);
                        }
                        System.out.println("Please enter the song number");
                        int d=scanner.nextInt();
                       playlists.get(p).removeSong(playlists.get(p).songs.get(d));
                       System.out.println("removing the song successfull");
                    }

                }
            } else if (j == 5) {
                System.out.println("current song:");
                System.out.println(playlistt.currentSong());

            }
            //next prop(next song)---------------------------------------------------------------------------------------------------------------
            else if (j == 6) {
                System.out.println("go to next song:");
                playlists.get(jj).goNext();

            }
            //next prop(prev song)----------------------------------------------------------------------------------------------------------------------------
            else if (j == 7) {
                System.out.println("go to previous song:");
                playlists.get(jj).goNext();

            }
            //next prop(playing the song)----------------------------------------------------------------------------------------------------------------------------
            else if (j == 8)
            {
                System.out.println("please choose the playlist for playing its song:");
                int y = playlists.size();
                System.out.println("please enter the playlist number:");
                for (int i = 0; i < playlists.size(); i++) {
                    System.out.println(i + "-" + playlists.get(i).names);
                }
                int m=scanner.nextInt();
                for(int i=0;i<playlists.size();i++)
                {
                    if(m==i)
                    {
                        jj=m;
playlists.get(m).play();
                    }
                }


            }
            //next prop(pausing the song)-----------------------------------------------------------------------------------------------------------------------------
            else if (j == 9)
            {
                System.out.println("pause the song:");
                playlistt.stop();


            }
            else if (j==10)
            {
                System.out.println("here you can see the artist of the albums ");
                for(int rr=0;rr<playlists.size();rr++)
                {
                    for (int oo=0;oo<playlists.get(rr).albums.size();oo++)
                    {
                        System.out.println(playlists.get(rr).albums.get(oo).getArtist().name);
                    }
                }
            }
            else if (j==11)
            {
                System.out.println("here you can see the genre of the albums ");
                for(int rr=0;rr<playlists.size();rr++)
                {
                    for (int oo=0;oo<playlists.get(rr).albums.size();oo++)
                    {
                        System.out.println(playlists.get(rr).albums.get(oo).getGenre());
                    }
                }
            }
            else if (j==12)
            {
                System.out.println("here you can see the genre of the albums ");
                for(int rr=0;rr<playlists.size();rr++)
                {
                    for (int oo=0;oo<playlists.get(rr).albums.size();oo++)
                    {
                        System.out.println(playlists.get(rr).albums.get(oo).getName());
                    }
                }
            }
            else if(j==13)
            {
                System.out.println("here you can see all the songs of the albums ");
                for(int rr=0;rr<playlists.size();rr++)
                {
                    for (int oo=0;oo<playlists.get(rr).albums.size();oo++)
                    {
                        System.out.println(playlists.get(rr).albums.get(oo).getSong());
                    }
                }
            }
            //the end of the operations----------------------------------------------------------------------------------------------------------------------------





            System.out.print("if you want to go to the main page enter 1 else enter 0 for exiting from the app" + "\n");
            r = scanner.nextInt();
            if (r == 1) {
         continue;

            } else if (r == 0) {
                break;
            }

        }


    }
        }




