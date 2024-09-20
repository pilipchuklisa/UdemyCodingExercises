package section13.exercise49;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {

            if (findSong(song.getTitle()) == null) {
                return songs.add(song);
            }

            return false;
        }

        private Song findSong(String title) {

            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }

            return null;
        }

        private Song findSong(int trackNumber) {

            if (trackNumber > 0 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }

            return null;
        }
    }

    public boolean addSong(String title, double duration) {

        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {

        if (trackNumber <= 0 || trackNumber > songs.songs.size()) {
            return false;
        }
        return playlist.add(songs.songs.get(trackNumber - 1));
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {

        Song song = songs.findSong(title);
        if (song == null) {
            return false;
        }
        return playlist.add(song);
    }
}
