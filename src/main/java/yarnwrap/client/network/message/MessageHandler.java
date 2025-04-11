package yarnwrap.client.network.message;
public class MessageHandler { public net.minecraft.client.network.message.MessageHandler wrapperContained; public MessageHandler(net.minecraft.client.network.message.MessageHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Deque delayedMessages() { return wrapperContained.delayedMessages; }
// public void delayedMessages(java.util.Deque value) { wrapperContained.delayedMessages = value; }
// public long chatDelay() { return wrapperContained.chatDelay; }
// public void chatDelay(long value) { wrapperContained.chatDelay = value; }
// public long lastProcessTime() { return wrapperContained.lastProcessTime; }
// public void lastProcessTime(long value) { wrapperContained.lastProcessTime = value; }
// public yarnwrap.text.Text VALIDATION_ERROR_TEXT() { return new yarnwrap.text.Text(wrapperContained.VALIDATION_ERROR_TEXT); }
// public void VALIDATION_ERROR_TEXT(yarnwrap.text.Text value) { wrapperContained.VALIDATION_ERROR_TEXT = value.wrapperContained; }
public MessageHandler(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.network.message.MessageHandler(client.wrapperContained); }
// public yarnwrap.client.network.message.MessageTrustStatus getStatus(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,java.time.Instant receptionTimestamp) { return new yarnwrap.client.network.message.MessageTrustStatus(wrapperContained.getStatus(message.wrapperContained,decorated.wrapperContained,receptionTimestamp)); }
// public java.util.UUID extractSender(yarnwrap.text.Text text) { return wrapperContained.extractSender(text.wrapperContained); }
// public void addToChatLog(yarnwrap.text.Text message,java.time.Instant timestamp) { wrapperContained.addToChatLog(message.wrapperContained,timestamp); }
public void onGameMessage(yarnwrap.text.Text message,boolean overlay) { wrapperContained.onGameMessage(message.wrapperContained,overlay); }
// public void addToChatLog(yarnwrap.network.message.SignedMessage message,Object params,com.mojang.authlib.GameProfile sender,yarnwrap.client.network.message.MessageTrustStatus trustStatus) { wrapperContained.addToChatLog(message.wrapperContained,params,sender,trustStatus.wrapperContained); }
// public boolean isAlwaysTrusted(java.util.UUID sender) { return wrapperContained.isAlwaysTrusted(sender); }
public void processDelayedMessages() { wrapperContained.processDelayedMessages(); }
public void setChatDelay(double chatDelay) { wrapperContained.setChatDelay(chatDelay); }
public void process() { wrapperContained.process(); }
// public void narrate(Object params,yarnwrap.text.Text message) { wrapperContained.narrate(params,message.wrapperContained); }
// public boolean shouldDelay() { return wrapperContained.shouldDelay(); }
// public void process(yarnwrap.network.message.MessageSignatureData signature,java.util.function.BooleanSupplier processor) { wrapperContained.process(signature.wrapperContained,processor); }
public boolean removeDelayedMessage(yarnwrap.network.message.MessageSignatureData signature) { return wrapperContained.removeDelayedMessage(signature.wrapperContained); }
// public boolean processChatMessageInternal(Object params,yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,com.mojang.authlib.GameProfile sender,boolean onlyShowSecureChat,java.time.Instant receptionTimestamp) { return wrapperContained.processChatMessageInternal(params,message.wrapperContained,decorated.wrapperContained,sender,onlyShowSecureChat,receptionTimestamp); }
public long getUnprocessedMessageCount() { return wrapperContained.getUnprocessedMessageCount(); }
public void processAll() { wrapperContained.processAll(); }
// public void onProfilelessMessage(yarnwrap.text.Text content,Object params) { wrapperContained.onProfilelessMessage(content.wrapperContained,params); }
// public boolean method_45747(yarnwrap.network.message.MessageSignatureData message) { return wrapperContained.method_45747(message.wrapperContained); }
// public void onChatMessage(yarnwrap.network.message.SignedMessage message,com.mojang.authlib.GameProfile sender,Object params) { wrapperContained.onChatMessage(message.wrapperContained,sender,params); }
// public void onUnverifiedMessage(java.util.UUID sender,Object parameters) { wrapperContained.onUnverifiedMessage(sender,parameters); }

}