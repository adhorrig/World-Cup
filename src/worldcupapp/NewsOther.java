package worldcupapp;

import java.io.Serializable;

/*
 * NewsOther.java
 * Version 2014-04-03 - DRAFT NOT IN USE
 * Date 3rd April 2013
 * @author Nilsson Denver 13114492
 */
public class NewsOther extends NewsPlayer implements Serializable{

    protected String newstypeOther;

    public NewsOther(int articlenbr, String newstypeNews, String headlinetext, String fullarticletext, String imagesmall, String imagelarge, String newstypeTeam, String newstypePlayer, String newstypeOther) {
        super(articlenbr, newstypeNews, headlinetext, fullarticletext, imagesmall, imagelarge, newstypeTeam, newstypePlayer);
        this.newstypeOther = newstypeOther;
    }

    //newstypePlayer
    public void setNewstypeOther(String newstypeOther) {
        this.newstypeOther = newstypeOther;
    }

    public String getNewstypeOther() {
        return newstypeOther;
    }
}
