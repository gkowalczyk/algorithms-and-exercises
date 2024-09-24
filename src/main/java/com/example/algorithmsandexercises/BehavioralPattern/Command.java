package com.example.algorithmsandexercises.BehavioralPattern;
//Wzorzec Command   -
public interface Command {
    void execute();
}

class Light {
    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}

class LightCommandOn implements Command {

    private Light light;

    public LightCommandOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

class LightCommandOff implements Command {

    private Light light;

    public LightCommandOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }


    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightCommandOn(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
    }
}