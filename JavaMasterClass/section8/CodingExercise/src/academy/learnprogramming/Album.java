package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<>();
    }
    public boolean addSong(String songTitle,double songDuration){
        Song existingSong=findSong(songTitle);
        if(existingSong!=null){
            return false;
        }
        else {
            this.songs.add(new Song(songTitle,songDuration));
            return true;
        }
    }
    private Song findSong(String songTitle){

        for(int i=0;i<this.songs.size();++i){
           if(this.songs.get(i).getTitle().equals(songTitle)){
               return this.songs.get(i);
           }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
         int idx=trackNumber-1;
          if(idx<0 || idx>=this.songs.size()){
              return false;
          }
          playList.add(this.songs.get(idx));
          return true;

    }
    public boolean addToPlayList(String songTitle, LinkedList<Song> playList){
        Song existingSong=findSong(songTitle);
        if(existingSong==null) {
            return false;
        }
        playList.add(existingSong);
        return true;
    }
}
