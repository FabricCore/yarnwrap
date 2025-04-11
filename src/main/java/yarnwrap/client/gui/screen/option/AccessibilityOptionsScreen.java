package yarnwrap.client.gui.screen.option;
public class AccessibilityOptionsScreen { public net.minecraft.client.gui.screen.option.AccessibilityOptionsScreen wrapperContained; public AccessibilityOptionsScreen(net.minecraft.client.gui.screen.option.AccessibilityOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
public AccessibilityOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.AccessibilityOptionsScreen(parent.wrapperContained,gameOptions.wrapperContained); }
// public void method_31384(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_31384(button.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }

}