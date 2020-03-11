package com.mygdx.game;

public class Environment {
    public int currentTime;

    public class Background {
        /* The background is rendered in terms of r, b, g, a.
        We can name a set of periodic functions over time that define the change in color, with each function passing time as an argument.
        We first have to find these functions.
         */
        public int redValue(int time) {
            return 0;
        }
        public int blueValue(int time) {
            return 0;
        }
        public int greenValue(int time) {
            return 0;
        }
        public int alphaValue(int time) {
            return 0;
        }
    }
}
