package com.xujiaji.thingking._10._8_2;

/**
 * Created by jiaji on 2018/3/8.
 */
public class GreenhouseController
{
    public static void main(String[] args) {
        args = new String[]{"1000"};
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(new Integer(args[0])));
        gc.run();;
    }
}
