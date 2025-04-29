package yarnwrap.client.realms.gui.screen;
public class DisconnectedRealmsScreen { public net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen wrapperContained; public DisconnectedRealmsScreen(net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text reason() { return new yarnwrap.text.Text(wrapperContained.reason); }
// public void reason(yarnwrap.text.Text value) { wrapperContained.reason = value.wrapperContained; }
// public static yarnwrap.text.Text reason() { return new yarnwrap.text.Text(net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen.reason); }
// public static void reason(yarnwrap.text.Text value, ) { net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen.reason = value.wrapperContained; }

// public yarnwrap.client.font.MultilineText lines() { return new yarnwrap.client.font.MultilineText(wrapperContained.lines); }
// public void lines(yarnwrap.client.font.MultilineText value) { wrapperContained.lines = value.wrapperContained; }
// public static yarnwrap.client.font.MultilineText lines() { return new yarnwrap.client.font.MultilineText(net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen.lines); }
// public static void lines(yarnwrap.client.font.MultilineText value, ) { net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen.lines = value.wrapperContained; }

// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen.parent); }
// public static void parent(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen.parent = value.wrapperContained; }

// public int textHeight() { return wrapperContained.textHeight; }
// public void textHeight(int value) { wrapperContained.textHeight = value; }
// public static int textHeight() { return net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen.textHeight; }
// public static void textHeight(int value, ) { net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen.textHeight = value; }

public DisconnectedRealmsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text title,yarnwrap.text.Text reason) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen(parent.wrapperContained,title.wrapperContained,reason.wrapperContained); }

}