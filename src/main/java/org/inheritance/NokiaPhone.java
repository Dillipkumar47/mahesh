package org.inheritance;

public class NokiaPhone implements Phone{

    public int cameraPixel=40;
    public void Calling() {
        System.out.println("Calling function is available in Nokia Phone");
    }

    public String voiceRecord() {
        return "Voice recording is available in Nokia Phone";
    }

    public int getCameraPixel(){
        return this.cameraPixel;
    }
}
