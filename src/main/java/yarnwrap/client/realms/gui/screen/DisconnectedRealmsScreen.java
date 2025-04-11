package yarnwrap.client.realms.gui.screen;
public class DisconnectedRealmsScreen { public net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen wrapperContained; public DisconnectedRealmsScreen(net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text reason() { return new yarnwrap.text.Text(wrapperContained.reason); }
// public void reason(yarnwrap.text.Text value) { wrapperContained.reason = value.wrapperContained; }
// public yarnwrap.client.font.MultilineText lines() { return new yarnwrap.client.font.MultilineText(wrapperContained.lines); }
// public void lines(yarnwrap.client.font.MultilineText value) { wrapperContained.lines = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public int textHeight() { return wrapperContained.textHeight; }
// public void textHeight(int value) { wrapperContained.textHeight = value; }
public DisconnectedRealmsScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text title,yarnwrap.text.Text reason) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.DisconnectedRealmsScreen(parent.wrapperContained,title.wrapperContained,reason.wrapperContained); }

}