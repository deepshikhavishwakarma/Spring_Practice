package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
//@PropertySource("commons/info.properties")
@Component
public class PlayerService {
    @Autowired
    private Player player;
    
    public void displayPlayerInfo(){
        System.out.println(player.getPlayerId());
        System.out.println(player.getPlayerName());
        System.out.println(player.getYearsNumber());
        System.out.println(player.getTeamName());
        System.out.println(player);
    }
}
