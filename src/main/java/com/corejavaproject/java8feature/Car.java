package java8feature;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car implements Vehicle{
    @Override
    public void start() {
        log.info("Car start");
    }

    @Override
    public void fillFuel() {
        log.info(" filling the Car fuel");
    }
}
