package yarnwrap.client.gui.screen;
public class MessageScreen { public net.minecraft.client.gui.screen.MessageScreen wrapperContained; public MessageScreen(net.minecraft.client.gui.screen.MessageScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.NarratedMultilineTextWidget textWidget() { return new yarnwrap.client.gui.widget.NarratedMultilineTextWidget(wrapperContained.textWidget); }
// public void textWidget(yarnwrap.client.gui.widget.NarratedMultilineTextWidget value) { wrapperContained.textWidget = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.NarratedMultilineTextWidget textWidget() { return new yarnwrap.client.gui.widget.NarratedMultilineTextWidget(net.minecraft.client.gui.screen.MessageScreen.textWidget); }
// public static void textWidget(yarnwrap.client.gui.widget.NarratedMultilineTextWidget value, ) { net.minecraft.client.gui.screen.MessageScreen.textWidget = value.wrapperContained; }


}