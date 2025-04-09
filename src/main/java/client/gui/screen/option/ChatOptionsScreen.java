package yarnwrap.client.gui.screen.option;
public class ChatOptionsScreen { public net.minecraft.client.gui.screen.option.ChatOptionsScreen wrapperContained; public ChatOptionsScreen(net.minecraft.client.gui.screen.option.ChatOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }

}