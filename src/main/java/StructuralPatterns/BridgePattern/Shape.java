package StructuralPatterns.BridgePattern;

import sun.security.provider.SHA;

/**
 * Created by Ankh on 2017/7/16.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
