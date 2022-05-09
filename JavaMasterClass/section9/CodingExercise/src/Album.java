import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs =new SongList();
    }
    public boolean addSong(String songTitle,double songDuration){
        return this.songs.add(new Song(songTitle,songDuration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song checkedSong=this.songs.findSong(trackNumber);
        if(checkedSong!=null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String songTitle, LinkedList<Song> playList){
        Song existingSong=this.songs.findSong(songTitle);
        if(existingSong==null) {
            return false;
        }
        playList.add(existingSong);
        return true;
    }
    public static class SongList{
        private  ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }
        private boolean add(Song song){
            Song existingSong=findSong(song.getTitle());
            if(existingSong!=null){
                return false;
            }
            else {
                this.songs.add(song);
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

        private Song findSong(int  trackNumber){
            int idx=trackNumber-1;
            if(idx<0 || idx>=this.songs.size()){
                return null;
            }
            else {
                return this.songs.get(idx);
            }
        }

    }
}
