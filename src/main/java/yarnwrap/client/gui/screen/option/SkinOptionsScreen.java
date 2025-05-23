package yarnwrap.client.gui.screen.option;
public class SkinOptionsScreen { public net.minecraft.client.gui.screen.option.SkinOptionsScreen wrapperContained; public SkinOptionsScreen(net.minecraft.client.gui.screen.option.SkinOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.option.SkinOptionsScreen.TITLE_TEXT); }
// public static void TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.option.SkinOptionsScreen.TITLE_TEXT = value.wrapperContained; }

public SkinOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.SkinOptionsScreen(parent.wrapperContained,gameOptions.wrapperContained); }
// public void method_60337(yarnwrap.entity.player.PlayerModelPart button,yarnwrap.client.gui.widget.CyclingButtonWidget enabled) { wrapperContained.method_60337(button.wrapperContained,enabled.wrapperContained); }
// public static void method_60337(yarnwrap.entity.player.PlayerModelPart button,yarnwrap.client.gui.widget.CyclingButtonWidget enabled, ) { net.minecraft.client.gui.screen.option.SkinOptionsScreen.method_60337(button.wrapperContained,enabled.wrapperContained); }

}