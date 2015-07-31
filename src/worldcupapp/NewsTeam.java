package worldcupapp;

import java.io.Serializable;

/*
 * NewTeam.java
 * Version 2014-04-03
 * Date 3rd April 2013
 * @author Nilsson Denver 13114492
 */
public class NewsTeam extends News implements Serializable{

    protected String newstypeTeam;

    public NewsTeam(int articlenbr, String newstypeNews, String headlinetext, String fullarticletext, String imagesmall, String imagelarge, String newstypeTeam) {
        super(articlenbr, newstypeNews, headlinetext, fullarticletext, imagesmall, imagelarge);
        this.newstypeTeam = newstypeTeam;
    }
//newstypeTeam

    public void setNewstypeTeam(String newstypeTeam) {
        this.newstypeTeam = newstypeTeam;
    }

    public String getNewstypeTeam() {
        return newstypeTeam;
    }

}
