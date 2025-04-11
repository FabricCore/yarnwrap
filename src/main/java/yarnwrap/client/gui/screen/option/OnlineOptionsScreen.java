package yarnwrap.client.gui.screen.option;
public class OnlineOptionsScreen { public net.minecraft.client.gui.screen.option.OnlineOptionsScreen wrapperContained; public OnlineOptionsScreen(net.minecraft.client.gui.screen.option.OnlineOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.option.SimpleOption difficulty() { return new yarnwrap.client.option.SimpleOption(wrapperContained.difficulty); }
// public void difficulty(yarnwrap.client.option.SimpleOption value) { wrapperContained.difficulty = value.wrapperContained; }
// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
public OnlineOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.OnlineOptionsScreen(parent.wrapperContained,gameOptions.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] collectOptions(yarnwrap.client.option.GameOptions gameOptions,yarnwrap.client.MinecraftClient client) { return wrapperContained.collectOptions(gameOptions.wrapperContained,client.wrapperContained); }
// public yarnwrap.client.option.SimpleOption method_60334(yarnwrap.client.world.ClientWorld world) { return new yarnwrap.client.option.SimpleOption(wrapperContained.method_60334(world.wrapperContained)); }

}