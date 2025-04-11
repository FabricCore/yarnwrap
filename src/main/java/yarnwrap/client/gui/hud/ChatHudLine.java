package yarnwrap.client.gui.hud;
public class ChatHudLine { public net.minecraft.client.gui.hud.ChatHudLine wrapperContained; public ChatHudLine(net.minecraft.client.gui.hud.ChatHudLine wrapperContained) { this.wrapperContained = wrapperContained; }

// public int creationTick() { return wrapperContained.creationTick; }
// public void creationTick(int value) { wrapperContained.creationTick = value; }
// public yarnwrap.client.gui.hud.MessageIndicator indicator() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.indicator); }
// public void indicator(yarnwrap.client.gui.hud.MessageIndicator value) { wrapperContained.indicator = value.wrapperContained; }
// public ChatHudLine(int creationTick) { this.wrapperContained = new net.minecraft.client.gui.hud.ChatHudLine(creationTick); }
// public int creationTick() { return wrapperContained.creationTick(); }
// public yarnwrap.client.gui.hud.MessageIndicator indicator() { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.indicator()); }
public Object getIcon() { return wrapperContained.getIcon(); }

}