package com.mygdx.game.Helpers;

import java.awt.*;

public class screenHelper {
    public static double screenLength;
    public static double screenHeight;

    public static void setDimensions () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenLength = screenSize.getWidth();
        screenHeight = screenSize.getHeight();
    }
}
