package yarnwrap.client.gui.screen.option;
public class SkinOptionsScreen { public net.minecraft.client.gui.screen.option.SkinOptionsScreen wrapperContained; public SkinOptionsScreen(net.minecraft.client.gui.screen.option.SkinOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
public SkinOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.SkinOptionsScreen(parent.wrapperContained,gameOptions.wrapperContained); }

}