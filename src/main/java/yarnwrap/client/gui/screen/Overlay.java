package yarnwrap.client.gui.screen;
public class Overlay { public net.minecraft.client.gui.screen.Overlay wrapperContained; public Overlay(net.minecraft.client.gui.screen.Overlay wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean pausesGame() { return wrapperContained.pausesGame(); }
// public static boolean pausesGame() { return net.minecraft.client.gui.screen.Overlay.pausesGame(); }

}