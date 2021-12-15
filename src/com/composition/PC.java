package com.composition;

//with inhreritance you can only inhrerit one class at a time,
// but with composition we can use more classes
public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUP() {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo () {
        monitor.drawPixelAt(1200, 50, "yeallow");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
