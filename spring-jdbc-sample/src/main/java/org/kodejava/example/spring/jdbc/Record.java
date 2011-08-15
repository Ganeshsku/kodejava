/*
 * $Id: $
 */
package org.kodejava.example.spring.jdbc;

import java.util.Date;

/**
 * @author <a href="mailto:wayan.saryada@sigma.co.id">I Wayan Saryada</a>
 * @version $Revision: $
 */
public class Record {
    private long id;
    private String title;
    private Date releaseDate;
    private long artistId;
    private long labelId;
    private Date created;
    private Date modified;

    public Record() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public long getLabelId() {
        return labelId;
    }

    public void setLabelId(long labelId) {
        this.labelId = labelId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
