package org.kodejava.example.spring.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Album {
    private String title;
    private int year;
    private List<Song> songs = new ArrayList<Song>();
    private Map maps = new HashMap();
    private Properties props;

    public Album() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", songs=" + songs +
                '}';
    }
}
