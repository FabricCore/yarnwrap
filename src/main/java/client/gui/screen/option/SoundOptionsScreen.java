package yarnwrap.client.gui.screen.option;
public class SoundOptionsScreen { public net.minecraft.client.gui.screen.option.SoundOptionsScreen wrapperContained; public SoundOptionsScreen(net.minecraft.client.gui.screen.option.SoundOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] getVolumeOptions() { return wrapperContained.getVolumeOptions(); }

}