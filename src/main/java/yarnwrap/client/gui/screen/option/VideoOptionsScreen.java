package yarnwrap.client.gui.screen.option;
public class VideoOptionsScreen { public net.minecraft.client.gui.screen.option.VideoOptionsScreen wrapperContained; public VideoOptionsScreen(net.minecraft.client.gui.screen.option.VideoOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public int mipmapLevels() { return wrapperContained.mipmapLevels; }
// public void mipmapLevels(int value) { wrapperContained.mipmapLevels = value; }
// public yarnwrap.text.Text GRAPHICS_FABULOUS_TEXT() { return new yarnwrap.text.Text(wrapperContained.GRAPHICS_FABULOUS_TEXT); }
// public void GRAPHICS_FABULOUS_TEXT(yarnwrap.text.Text value) { wrapperContained.GRAPHICS_FABULOUS_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text GRAPHICS_WARNING_MESSAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.GRAPHICS_WARNING_MESSAGE_TEXT); }
// public void GRAPHICS_WARNING_MESSAGE_TEXT(yarnwrap.text.Text value) { wrapperContained.GRAPHICS_WARNING_MESSAGE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text GRAPHICS_WARNING_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.GRAPHICS_WARNING_TITLE_TEXT); }
// public void GRAPHICS_WARNING_TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.GRAPHICS_WARNING_TITLE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text GRAPHICS_WARNING_ACCEPT_TEXT() { return new yarnwrap.text.Text(wrapperContained.GRAPHICS_WARNING_ACCEPT_TEXT); }
// public void GRAPHICS_WARNING_ACCEPT_TEXT(yarnwrap.text.Text value) { wrapperContained.GRAPHICS_WARNING_ACCEPT_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text GRAPHICS_WARNING_CANCEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.GRAPHICS_WARNING_CANCEL_TEXT); }
// public void GRAPHICS_WARNING_CANCEL_TEXT(yarnwrap.text.Text value) { wrapperContained.GRAPHICS_WARNING_CANCEL_TEXT = value.wrapperContained; }
// public yarnwrap.client.resource.VideoWarningManager warningManager() { return new yarnwrap.client.resource.VideoWarningManager(wrapperContained.warningManager); }
// public void warningManager(yarnwrap.client.resource.VideoWarningManager value) { wrapperContained.warningManager = value.wrapperContained; }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
public VideoOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.MinecraftClient client,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.VideoOptionsScreen(parent.wrapperContained,client.wrapperContained,gameOptions.wrapperContained); }
// public void method_30052(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_30052(button.wrapperContained); }
// public void method_30053(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_30053(button.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }
// public void method_60338(yarnwrap.client.util.Monitor value) { wrapperContained.method_60338(value.wrapperContained); }
// public yarnwrap.text.Text method_60339(yarnwrap.client.util.Monitor optionText,yarnwrap.text.Text value) { return new yarnwrap.text.Text(wrapperContained.method_60339(optionText.wrapperContained,value.wrapperContained)); }

}