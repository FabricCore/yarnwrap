package yarnwrap.client.network.message;
public class MessageTrustStatus { public net.minecraft.client.network.message.MessageTrustStatus wrapperContained; public MessageTrustStatus(net.minecraft.client.network.message.MessageTrustStatus wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.network.message.MessageTrustStatus.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.network.message.MessageTrustStatus.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.client.network.message.MessageTrustStatus.id; }
// public static void id(java.lang.String value, ) { net.minecraft.client.network.message.MessageTrustStatus.id = value; }

// public MessageTrustStatus(java.lang.String id) { this.wrapperContained = new net.minecraft.client.network.message.MessageTrustStatus(id); }
public boolean isInsecure() { return wrapperContained.isInsecure(); }
// public static boolean isInsecure() { return net.minecraft.client.network.message.MessageTrustStatus.isInsecure(); }
public yarnwrap.client.gui.hud.MessageIndicator createIndicator(yarnwrap.network.message.SignedMessage message) { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.createIndicator(message.wrapperContained)); }
// public static yarnwrap.client.gui.hud.MessageIndicator createIndicator(yarnwrap.network.message.SignedMessage message, ) { return new yarnwrap.client.gui.hud.MessageIndicator(net.minecraft.client.network.message.MessageTrustStatus.createIndicator(message.wrapperContained)); }
// public yarnwrap.client.network.message.MessageTrustStatus getStatus(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,java.time.Instant receptionTimestamp) { return new yarnwrap.client.network.message.MessageTrustStatus(wrapperContained.getStatus(message.wrapperContained,decorated.wrapperContained,receptionTimestamp)); }
// public static yarnwrap.client.network.message.MessageTrustStatus getStatus(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,java.time.Instant receptionTimestamp, ) { return new yarnwrap.client.network.message.MessageTrustStatus(net.minecraft.client.network.message.MessageTrustStatus.getStatus(message.wrapperContained,decorated.wrapperContained,receptionTimestamp)); }
// public boolean isNotInDefaultFont(yarnwrap.text.Text content) { return wrapperContained.isNotInDefaultFont(content.wrapperContained); }
// public static boolean isNotInDefaultFont(yarnwrap.text.Text content, ) { return net.minecraft.client.network.message.MessageTrustStatus.isNotInDefaultFont(content.wrapperContained); }
// public boolean isModified(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated) { return wrapperContained.isModified(message.wrapperContained,decorated.wrapperContained); }
// public static boolean isModified(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated, ) { return net.minecraft.client.network.message.MessageTrustStatus.isModified(message.wrapperContained,decorated.wrapperContained); }
// public boolean isNotInDefaultFont(yarnwrap.text.Style style) { return wrapperContained.isNotInDefaultFont(style.wrapperContained); }
// public static boolean isNotInDefaultFont(yarnwrap.text.Style style, ) { return net.minecraft.client.network.message.MessageTrustStatus.isNotInDefaultFont(style.wrapperContained); }
// public java.util.Optional method_45757(yarnwrap.text.Style style,java.lang.String part) { return wrapperContained.method_45757(style.wrapperContained,part); }
// public static java.util.Optional method_45757(yarnwrap.text.Style style,java.lang.String part, ) { return net.minecraft.client.network.message.MessageTrustStatus.method_45757(style.wrapperContained,part); }

}