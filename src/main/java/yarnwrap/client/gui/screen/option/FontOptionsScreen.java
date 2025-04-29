package yarnwrap.client.gui.screen.option;
public class FontOptionsScreen { public net.minecraft.client.gui.screen.option.FontOptionsScreen wrapperContained; public FontOptionsScreen(net.minecraft.client.gui.screen.option.FontOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public FontOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.FontOptionsScreen(parent.wrapperContained,gameOptions.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }
// public static net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions, ) { return net.minecraft.client.gui.screen.option.FontOptionsScreen.getOptions(gameOptions.wrapperContained); }

}