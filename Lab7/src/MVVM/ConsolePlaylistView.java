package MVVM;

import java.util.List;

public class ConsolePlaylistView
{
    private PlaylistViewModel viewModel;

    public ConsolePlaylistView(PlaylistViewModel viewModel)
    {
        this.viewModel = viewModel;
    }

    public void displayPlaylist()
    {
        List<Track> tracks = viewModel.getTracks();
        System.out.println("Текущий плейлист:");

        for (int i = 0; i < tracks.size(); i++)
        {
            Track track = tracks.get(i);
            System.out.print((track.isPlaying() ? ">> " : "   ") + track.getTitle() + " - " + track.getArtist());
            if (track.isPlaying()) {
                System.out.print(" (Играет)");
            }
            System.out.println();
        }

        System.out.println();
    }

    public void playNext()
    {
        viewModel.nextTrack();
        displayPlaylist();
    }

    public void playPrevious()
    {
        viewModel.previousTrack();
        displayPlaylist();
    }
}
