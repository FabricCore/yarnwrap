package yarnwrap.client.gui.screen.option;
public class ControlsOptionsScreen { public net.minecraft.client.gui.screen.option.ControlsOptionsScreen wrapperContained; public ControlsOptionsScreen(net.minecraft.client.gui.screen.option.ControlsOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
public ControlsOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions options) { this.wrapperContained = new net.minecraft.client.gui.screen.option.ControlsOptionsScreen(parent.wrapperContained,options.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }

}