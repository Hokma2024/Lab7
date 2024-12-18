package MVVM;

import java.util.List;

public class PlaylistViewModel
{
    private List<Track> tracks;
    private int currentTrackIndex;

    public PlaylistViewModel(List<Track> tracks)
    {
        this.tracks = tracks;
        this.currentTrackIndex = -1;
    }

    public List<Track> getTracks()
    {
        return tracks;
    }

    public void playTrack(int index)
    {
        if (index < 0 || index >= tracks.size())
        {
            System.out.println("Ошибка: индекс трека вне допустимого диапазона!");
            return;
        }

        if (currentTrackIndex != -1)
        {
            tracks.get(currentTrackIndex).setPlaying(false);
        }

        Track trackToPlay = tracks.get(index);
        trackToPlay.setPlaying(true);
        currentTrackIndex = index;

        System.out.println("Сейчас играет: " + trackToPlay.getTitle() + " - " + trackToPlay.getArtist());
    }

    public void nextTrack()
    {
        if (tracks.isEmpty())
        {
            System.out.println("Плейлист пуст!");
            return;
        }

        int nextIndex = (currentTrackIndex + 1) % tracks.size();
        playTrack(nextIndex);
    }

    public void previousTrack()
    {
        if (tracks.isEmpty())
        {
            System.out.println("Плейлист пуст!");
            return;
        }

        int previousIndex = (currentTrackIndex - 1 + tracks.size()) % tracks.size();
        playTrack(previousIndex);
    }
}
