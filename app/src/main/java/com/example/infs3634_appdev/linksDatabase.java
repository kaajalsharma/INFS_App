package com.example.infs3634_appdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class linksDatabase {
    public static Links getLinkById(int LinkId){
        return links.get(LinkId);
    }

    public static ArrayList<Links> getAllLinks(){
        return new ArrayList<Links>((List) Arrays.asList(links.values().toArray()));
    }

    private static final HashMap<Integer,Links> links = new HashMap<>();

    static {
        links.put(1, new Links (
                1,
                "Fun Videos for Kindergarten and Year 1 Students!!",
                "https://www.youtube.com/watch?v=R9intHqlzhc",
                "https://www.youtube.com/watch?v=4c6FyuetSVo"
        ));
        links.put(2, new Links (
                2,
                "Very Cool Videos For Very Cool Year 2 to Year 3 Students!!",
                "https://www.youtube.com/watch?v=Wwfhpm1xjF8",
                "https://www.youtube.com/watch?v=zisZPCk8DCs"

        ));

        links.put(3, new Links (
                3,
                "Awesome Learning Videos For You Smart Year 4 to Year 6 Students!",
                "https://www.youtube.com/watch?v=WVHlVbIgUH0",
                "https://www.youtube.com/watch?v=79fIJQ05oIU"

        ));


    }
}


