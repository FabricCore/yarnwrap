package yarnwrap.client.gui.screen.option;
public class SoundOptionsScreen { public net.minecraft.client.gui.screen.option.SoundOptionsScreen wrapperContained; public SoundOptionsScreen(net.minecraft.client.gui.screen.option.SoundOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
public SoundOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions options) { this.wrapperContained = new net.minecraft.client.gui.screen.option.SoundOptionsScreen(parent.wrapperContained,options.wrapperContained); }
// public yarnwrap.client.option.SimpleOption method_45628(yarnwrap.sound.SoundCategory category) { return new yarnwrap.client.option.SimpleOption(wrapperContained.method_45628(category.wrapperContained)); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }
// public boolean method_45630(yarnwrap.sound.SoundCategory category) { return wrapperContained.method_45630(category.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] getVolumeOptions() { return wrapperContained.getVolumeOptions(); }

}