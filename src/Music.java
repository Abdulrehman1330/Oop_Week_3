import java.util.Objects;

public class Music {
    private String title;
    private String duration;
    private String genre;
    private Date releaseDate;
    private Singer singer;


    public String toString() {
        return String.format("%s %s %s %s %s", title, duration, genre, singer.getName(), releaseDate);
    }

    public Music(String title, String duration, String genre, Date releaseDate, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Music music)) return false;
        return Objects.equals(title, music.title) && Objects.equals(duration, music.duration);
    }
}

