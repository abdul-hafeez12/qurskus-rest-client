package com.acme.model;

import java.net.URL;
import java.util.Set;

public class TvSeries {
    private Long id;
    private String name;
    private URL url;
    private String summary;
    private String language;
    private Set<String> genres;
    private URL officialSite;

    public TvSeries() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    public URL getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(URL officialSite) {
        this.officialSite = officialSite;
    }
}
