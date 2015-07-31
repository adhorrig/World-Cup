package worldcupapp;

import java.io.Serializable;

/*
 * News.java
 * Version 2014-04-03
 * Date 3rd April 2014
 * @author Nilsson Denver 13114492
 */
public class News implements Serializable{

    protected int articlenbr;
    protected String newstypeNews;
    protected String headlinetext;
    protected String fullarticletext;
    protected String imagesmall;
    protected String imagelarge;

    public News(int articlenbr, String newstypeNews, String headlinetext, String fullarticletext, String imagesmall, String imagelarge) {

        this.articlenbr = articlenbr;
        this.newstypeNews = newstypeNews;
        this.headlinetext = headlinetext;
        this.fullarticletext = fullarticletext;
        this.imagesmall = imagesmall;
        this.imagelarge = imagelarge;
    }

    //articlenbr
    public void setArticlenbr(int articlenbr) {
        this.articlenbr = articlenbr;
    }

    public int getArticlenbr() {
        return articlenbr;
    }

    //newstypeNews
    public void setNewstypeNews(String newstypeNews) {
        this.newstypeNews = newstypeNews;
    }

    public String getNewstypeNews() {
        return newstypeNews;
    }
           //newstypeOther
    //headlinetext
    public void setHeadlinetext(String headlinetext) {
        this.headlinetext = headlinetext;
    }

    public String getHeadlinetext() {
        return headlinetext;
    }

    //fullarticletext
    public void setFullarticletext(String fullarticletext) {
        this.fullarticletext = fullarticletext;
    }

    public String getFullarticletext() {
        return fullarticletext;
    }

    //imagesmall
    public void setImagesmall(String imagesmall) {
        this.imagesmall = imagesmall;
    }

    public String getImagesmall() {
        return imagesmall;
    }

    //imagelarge
    public void setImagelarge(String imagelarge) {
        this.imagelarge = imagelarge;
    }

    public String getImagelarge() {
        return imagelarge;
    }

}
