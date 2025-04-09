package yarnwrap.client.network.message;
public class MessageTrustStatus { public net.minecraft.client.network.message.MessageTrustStatus wrapperContained; public MessageTrustStatus(net.minecraft.client.network.message.MessageTrustStatus wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String id() { return wrapperContained.id; }
public boolean isInsecure() { return wrapperContained.isInsecure(); }
public yarnwrap.client.gui.hud.MessageIndicator createIndicator(yarnwrap.network.message.SignedMessage message) { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.createIndicator(message.wrapperContained)); }
public yarnwrap.client.network.message.MessageTrustStatus getStatus(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,java.time.Instant receptionTimestamp) { return new yarnwrap.client.network.message.MessageTrustStatus(wrapperContained.getStatus(message.wrapperContained,decorated.wrapperContained,receptionTimestamp)); }
// public boolean isNotInDefaultFont(yarnwrap.text.Text content) { return wrapperContained.isNotInDefaultFont(content.wrapperContained); }
// public boolean isModified(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated) { return wrapperContained.isModified(message.wrapperContained,decorated.wrapperContained); }
// public boolean isNotInDefaultFont(yarnwrap.text.Style style) { return wrapperContained.isNotInDefaultFont(style.wrapperContained); }

}