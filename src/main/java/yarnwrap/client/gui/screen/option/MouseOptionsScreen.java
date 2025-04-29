package yarnwrap.client.gui.screen.option;
public class MouseOptionsScreen { public net.minecraft.client.gui.screen.option.MouseOptionsScreen wrapperContained; public MouseOptionsScreen(net.minecraft.client.gui.screen.option.MouseOptionsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.option.MouseOptionsScreen.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.option.MouseOptionsScreen.TITLE = value.wrapperContained; }

public MouseOptionsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.option.GameOptions gameOptions) { this.wrapperContained = new net.minecraft.client.gui.screen.option.MouseOptionsScreen(parent.wrapperContained,gameOptions.wrapperContained); }
// public net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions) { return wrapperContained.getOptions(gameOptions.wrapperContained); }
// public static net.minecraft.client.option.SimpleOption[] getOptions(yarnwrap.client.option.GameOptions gameOptions, ) { return net.minecraft.client.gui.screen.option.MouseOptionsScreen.getOptions(gameOptions.wrapperContained); }

}