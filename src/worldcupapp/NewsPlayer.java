package worldcupapp;

import java.io.Serializable;

/*
 * NewPlayer.java
 * Version 2014-04-03
 * Date 3rd April 2013
 * @author Nilsson Denver 13114492
 */
public class NewsPlayer extends NewsTeam implements Serializable{

    protected String newstypePlayer;

    /**
     *
     * @param articlenbr
     * @param newstypeNews
     * @param headlinetext
     * @param fullarticletext
     * @param imagesmall
     * @param imagelarge
     * @param newstypeTeam
     * @param newstypePlayer
     */
    public NewsPlayer(int articlenbr, String newstypeNews, String headlinetext, String fullarticletext, String imagesmall, String imagelarge, String newstypeTeam, String newstypePlayer) {
        super(articlenbr, newstypeNews, headlinetext, fullarticletext, imagesmall, imagelarge, newstypeTeam);
        this.newstypePlayer = newstypePlayer;
    }

    //newstypePlayer
    public void setNewstypePlayer(String newstypePlayer) {
        this.newstypePlayer = newstypePlayer;
    }

    public String getNewstypePlayer() {
        return newstypePlayer;
    }
}
