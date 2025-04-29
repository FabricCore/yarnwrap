package yarnwrap.client.gui.screen.ingame;
public class ScreenHandlerProvider { public net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider wrapperContained; public ScreenHandlerProvider(net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.screen.ScreenHandler getScreenHandler() { return new yarnwrap.screen.ScreenHandler(wrapperContained.getScreenHandler()); }
// public static yarnwrap.screen.ScreenHandler getScreenHandler() { return new yarnwrap.screen.ScreenHandler(net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider.getScreenHandler()); }

}