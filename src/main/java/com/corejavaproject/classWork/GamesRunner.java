package com.corejavaproject.classWork;

import lombok.extern.log4j.Log4j2;

import java.util.LinkedList;
import java.util.List;
@Log4j2

public class GamesRunner {
    public static void main(String[] args) {
        List<Games> list = new LinkedList<Games>();
        Games games = new Games();
        games.setName("Badminton");
        games.setNoOfPlayers(5);
        games.setCaptainName("Shashank");
        list.add(games);

        Games games2 = new Games();
        games2.setName("Vollyball");
        games2.setNoOfPlayers(6);
        games2.setCaptainName("Sharath");
        list.add(games2);

        Games games3 = new Games();
        games3.setName("Cricket");
        games3.setNoOfPlayers(15);
        games3.setCaptainName("Shashi");
        list.add(games3);


        log.info("Games Information List");
        list.forEach(data -> log.info(data));

    }
}
