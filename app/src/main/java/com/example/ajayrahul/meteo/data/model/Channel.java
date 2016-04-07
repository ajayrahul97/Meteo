
package com.example.ajayrahul.meteo.data.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Channel {

    @SerializedName("units")
    @Expose
    private Units units;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("lastBuildDate")
    @Expose
    private String lastBuildDate;
    @SerializedName("ttl")
    @Expose
    private String ttl;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("wind")
    @Expose
    private Wind wind;
    @SerializedName("atmosphere")
    @Expose
    private Atmosphere atmosphere;
    @SerializedName("astronomy")
    @Expose
    private Astronomy astronomy;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("item")
    @Expose
    private Item item;

    /**
     * 
     * @return
     *     The units
     */
    public Units getUnits() {
        return units;
    }

    /**
     * 
     * @param units
     *     The units
     */
    public void setUnits(Units units) {
        this.units = units;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The lastBuildDate
     */
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     * 
     * @param lastBuildDate
     *     The lastBuildDate
     */
    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    /**
     * 
     * @return
     *     The ttl
     */
    public String getTtl() {
        return ttl;
    }

    /**
     * 
     * @param ttl
     *     The ttl
     */
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * 
     * @param wind
     *     The wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * 
     * @return
     *     The atmosphere
     */
    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    /**
     * 
     * @param atmosphere
     *     The atmosphere
     */
    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    /**
     * 
     * @return
     *     The astronomy
     */
    public Astronomy getAstronomy() {
        return astronomy;
    }

    /**
     * 
     * @param astronomy
     *     The astronomy
     */
    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    /**
     * 
     * @return
     *     The image
     */
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The item
     */
    public Item getItem() {
        return item;
    }

    /**
     * 
     * @param item
     *     The item
     */
    public void setItem(Item item) {
        this.item = item;
    }

}
