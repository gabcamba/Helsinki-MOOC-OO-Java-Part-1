
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gab Camba
 */
public class Team {
    private String name;
    private ArrayList<Player> player = new ArrayList<Player>();
    private int maxSize = 16;
    
    public Team(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void addPlayer(Player player)
    {
        if(this.player.size() < maxSize)
        {
            this.player.add(player);
        }
        
    }
    
    public void printPlayers()
    {
        for(Player players : this.player)
        {
            System.out.println(players);
        }
    }
    
    public void setMaxSize(int maxSize)
    {
        this.maxSize = maxSize;
    }
    
    public int size()
    {
        return this.player.size();
    }
    
    public int goals()
    {
        int goals = 0;
        for(Player players : this.player)
        {
            goals += players.goals();
        }
        return goals;
    }
    
}
