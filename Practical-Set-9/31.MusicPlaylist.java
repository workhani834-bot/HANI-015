import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        System.out.println("Initial Playlist: " + playlist);

        // 3. Play first song (Remove from front)
        String first = playlist.removeFirst();
        System.out.println("Playing first song: " + first);
        System.out.println("Updated Playlist: " + playlist);

        // 4. Skip last song (Remove from end)
        String last = playlist.removeLast();
        System.out.println("Skipped last song: " + last);
        System.out.println("Final Playlist: " + playlist);
    }
}
