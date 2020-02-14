package models;

import java.util.Map;

public class ObjectFromResponse {
    private String id;
    private String lat;
    private String lon;
    private Map<String, String> tags;
    private String version;

    public ObjectFromResponse() {
    }

    public ObjectFromResponse(String id, String lat, String lon, Map<String, String> tags, String version) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        this.tags = tags;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

