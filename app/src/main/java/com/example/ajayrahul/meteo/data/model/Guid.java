
package com.example.ajayrahul.meteo.data.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Guid {

    @SerializedName("isPermaLink")
    @Expose
    private String isPermaLink;

    /**
     * 
     * @return
     *     The isPermaLink
     */
    public String getIsPermaLink() {
        return isPermaLink;
    }

    /**
     * 
     * @param isPermaLink
     *     The isPermaLink
     */
    public void setIsPermaLink(String isPermaLink) {
        this.isPermaLink = isPermaLink;
    }

}
