package MVVM;
/*
Музыкальный плейлист:
Модель Track с полями title, artist, isPlaying. ViewModel управляет переключением треков и синхронизирует их состояние с View.
*/
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Mad World", "UNSECRET"));
        tracks.add(new Track("Noble Blood", "Tommee Profitt"));
        tracks.add(new Track("City of the Dead", "Eurielle"));
        tracks.add(new Track("The Calling", "TheFatRat"));

        PlaylistViewModel viewModel = new PlaylistViewModel(tracks);

        ConsolePlaylistView view = new ConsolePlaylistView(viewModel);

        view.displayPlaylist();

        view.playNext();
        view.playNext();
        view.playPrevious();
        view.playNext();
        view.playNext();
    }
}
