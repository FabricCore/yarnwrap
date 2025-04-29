package yarnwrap.client.session.report.log;
public class ReceivedMessage { public net.minecraft.client.session.report.log.ReceivedMessage wrapperContained; public ReceivedMessage(net.minecraft.client.session.report.log.ReceivedMessage wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getContent() { return new yarnwrap.text.Text(wrapperContained.getContent()); }
// public static yarnwrap.text.Text getContent() { return new yarnwrap.text.Text(net.minecraft.client.session.report.log.ReceivedMessage.getContent()); }
// public Object of(com.mojang.authlib.GameProfile gameProfile,yarnwrap.network.message.SignedMessage message,yarnwrap.client.network.message.MessageTrustStatus trustStatus) { return wrapperContained.of(gameProfile,message.wrapperContained,trustStatus.wrapperContained); }
// public static Object of(com.mojang.authlib.GameProfile gameProfile,yarnwrap.network.message.SignedMessage message,yarnwrap.client.network.message.MessageTrustStatus trustStatus, ) { return net.minecraft.client.session.report.log.ReceivedMessage.of(gameProfile,message.wrapperContained,trustStatus.wrapperContained); }
public boolean isSentFrom(java.util.UUID uuid) { return wrapperContained.isSentFrom(uuid); }
// public static boolean isSentFrom(java.util.UUID uuid, ) { return net.minecraft.client.session.report.log.ReceivedMessage.isSentFrom(uuid); }
// public Object of(yarnwrap.text.Text message,java.time.Instant timestamp) { return wrapperContained.of(message.wrapperContained,timestamp); }
// public static Object of(yarnwrap.text.Text message,java.time.Instant timestamp, ) { return net.minecraft.client.session.report.log.ReceivedMessage.of(message.wrapperContained,timestamp); }
public yarnwrap.text.Text getNarration() { return new yarnwrap.text.Text(wrapperContained.getNarration()); }
// public static yarnwrap.text.Text getNarration() { return new yarnwrap.text.Text(net.minecraft.client.session.report.log.ReceivedMessage.getNarration()); }

}