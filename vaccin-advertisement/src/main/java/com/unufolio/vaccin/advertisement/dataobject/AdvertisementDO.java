package com.unufolio.vaccin.advertisement.dataobject;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/31
 */
public class AdvertisementDO extends BaseEntity {

    private String forwardUrl;

    private String title;

    private String image;

    public String getForwardUrl() {
        return forwardUrl;
    }

    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "AdvertisementDO{" +
                "forwardUrl='" + forwardUrl + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                "} " + super.toString();
    }
}
