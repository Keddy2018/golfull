package com.softecnology.autocenter.service;

import com.pi4j.Pi4J;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.DigitalState;
import org.springframework.stereotype.Service;

@Service
public class SendingService {
    private Boolean STATE_LED = false;
    private static final int PIN_LED = 22;
    public String swithLed(String state){
        String msg = "LED A ESTADO: " + state;
        var gpio = Pi4J.newAutoContext();
        var ledConfig = DigitalOutput.newConfigBuilder(gpio)
                .id("led")
                .name("LED Flasher")
                .address(PIN_LED)
                .shutdown(DigitalState.LOW)
                .initial(DigitalState.LOW)
                .provider("pigpio-digital-output");

        var led = gpio.create(ledConfig);
        if(state.equals("ON")) led.high();
        if(state.equals("OFF")) led.low();
        return msg;
    }

}
