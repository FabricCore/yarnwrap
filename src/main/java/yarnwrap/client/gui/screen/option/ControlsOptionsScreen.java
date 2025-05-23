package yarnwrap.client.gui.screen.option;
public class ControlsOptionsScreen { public net.minecraft.client.gui.screen.option.ControlsOptionsScreen wrapperContained; public ControlsOptionsScreen(net.minecraft.client.gui.screen.option.ControlsOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.option.ControlsOptionsScreen.TITLE_TEXT); }
// public static void TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.option.ControlsOptionsScreen.TITLE_TEXT = value.wrapperContained; }

public ControlsOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions options) { this.wrapperContained = new net.minecraft.client.gui.screen.option.ControlsOptionsScreen(parent.wrapperContained,options.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }
// public static net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions, ) { return net.minecraft.client.gui.screen.option.ControlsOptionsScreen.getOptions(gameOptions.wrapperContained); }
// public void method_60340(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_60340(button.wrapperContained); }
// public static void method_60340(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.option.ControlsOptionsScreen.method_60340(button.wrapperContained); }
// public void method_60341(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_60341(button.wrapperContained); }
// public static void method_60341(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.option.ControlsOptionsScreen.method_60341(button.wrapperContained); }

}