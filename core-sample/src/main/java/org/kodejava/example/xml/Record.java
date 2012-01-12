package org.kodejava.example.xml;

public class Record {
    private String title;
    private String artist;
    private String genre;
    private int year;

    public Record() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Record{" +
                "title='" + title + "'\n" +
                ", artist='" + artist + "'\n" +
                ", genre='" + genre + "'\n" +
                ", year=" + year +
                '}';
    }
}
