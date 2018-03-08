package com.xujiaji.thingking._10._8_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaji on 2018/3/8.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c)
    {
        eventList.add(c);
    }

    public void run()
    {
        while (eventList.size() > 0)
        {
            for (Event e : new ArrayList<>(eventList))
            {
                if (e.ready())
                {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
