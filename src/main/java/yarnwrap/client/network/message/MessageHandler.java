package yarnwrap.client.network.message;
public class MessageHandler { public net.minecraft.client.network.message.MessageHandler wrapperContained; public MessageHandler(net.minecraft.client.network.message.MessageHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.network.message.MessageHandler.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.network.message.MessageHandler.client = value.wrapperContained; }

// public java.util.Deque delayedMessages() { return wrapperContained.delayedMessages; }
// public void delayedMessages(java.util.Deque value) { wrapperContained.delayedMessages = value; }
// public static java.util.Deque delayedMessages() { return net.minecraft.client.network.message.MessageHandler.delayedMessages; }
// public static void delayedMessages(java.util.Deque value, ) { net.minecraft.client.network.message.MessageHandler.delayedMessages = value; }

// public long chatDelay() { return wrapperContained.chatDelay; }
// public void chatDelay(long value) { wrapperContained.chatDelay = value; }
// public static long chatDelay() { return net.minecraft.client.network.message.MessageHandler.chatDelay; }
// public static void chatDelay(long value, ) { net.minecraft.client.network.message.MessageHandler.chatDelay = value; }

// public long lastProcessTime() { return wrapperContained.lastProcessTime; }
// public void lastProcessTime(long value) { wrapperContained.lastProcessTime = value; }
// public static long lastProcessTime() { return net.minecraft.client.network.message.MessageHandler.lastProcessTime; }
// public static void lastProcessTime(long value, ) { net.minecraft.client.network.message.MessageHandler.lastProcessTime = value; }

// public yarnwrap.text.Text VALIDATION_ERROR_TEXT() { return new yarnwrap.text.Text(wrapperContained.VALIDATION_ERROR_TEXT); }
// public void VALIDATION_ERROR_TEXT(yarnwrap.text.Text value) { wrapperContained.VALIDATION_ERROR_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text VALIDATION_ERROR_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.network.message.MessageHandler.VALIDATION_ERROR_TEXT); }
// public static void VALIDATION_ERROR_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.network.message.MessageHandler.VALIDATION_ERROR_TEXT = value.wrapperContained; }

public MessageHandler(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.network.message.MessageHandler(client.wrapperContained); }
// public yarnwrap.client.network.message.MessageTrustStatus getStatus(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,java.time.Instant receptionTimestamp) { return new yarnwrap.client.network.message.MessageTrustStatus(wrapperContained.getStatus(message.wrapperContained,decorated.wrapperContained,receptionTimestamp)); }
// public static yarnwrap.client.network.message.MessageTrustStatus getStatus(yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,java.time.Instant receptionTimestamp, ) { return new yarnwrap.client.network.message.MessageTrustStatus(net.minecraft.client.network.message.MessageHandler.getStatus(message.wrapperContained,decorated.wrapperContained,receptionTimestamp)); }
// public java.util.UUID extractSender(yarnwrap.text.Text text) { return wrapperContained.extractSender(text.wrapperContained); }
// public static java.util.UUID extractSender(yarnwrap.text.Text text, ) { return net.minecraft.client.network.message.MessageHandler.extractSender(text.wrapperContained); }
// public void addToChatLog(yarnwrap.text.Text message,java.time.Instant timestamp) { wrapperContained.addToChatLog(message.wrapperContained,timestamp); }
// public static void addToChatLog(yarnwrap.text.Text message,java.time.Instant timestamp, ) { net.minecraft.client.network.message.MessageHandler.addToChatLog(message.wrapperContained,timestamp); }
public void onGameMessage(yarnwrap.text.Text message,boolean overlay) { wrapperContained.onGameMessage(message.wrapperContained,overlay); }
// public static void onGameMessage(yarnwrap.text.Text message,boolean overlay, ) { net.minecraft.client.network.message.MessageHandler.onGameMessage(message.wrapperContained,overlay); }
// public void addToChatLog(yarnwrap.network.message.SignedMessage message,Object params,com.mojang.authlib.GameProfile sender,yarnwrap.client.network.message.MessageTrustStatus trustStatus) { wrapperContained.addToChatLog(message.wrapperContained,params,sender,trustStatus.wrapperContained); }
// public static void addToChatLog(yarnwrap.network.message.SignedMessage message,Object params,com.mojang.authlib.GameProfile sender,yarnwrap.client.network.message.MessageTrustStatus trustStatus, ) { net.minecraft.client.network.message.MessageHandler.addToChatLog(message.wrapperContained,params,sender,trustStatus.wrapperContained); }
// public boolean isAlwaysTrusted(java.util.UUID sender) { return wrapperContained.isAlwaysTrusted(sender); }
// public static boolean isAlwaysTrusted(java.util.UUID sender, ) { return net.minecraft.client.network.message.MessageHandler.isAlwaysTrusted(sender); }
public void processDelayedMessages() { wrapperContained.processDelayedMessages(); }
// public static void processDelayedMessages() { net.minecraft.client.network.message.MessageHandler.processDelayedMessages(); }
public void setChatDelay(double chatDelay) { wrapperContained.setChatDelay(chatDelay); }
// public static void setChatDelay(double chatDelay, ) { net.minecraft.client.network.message.MessageHandler.setChatDelay(chatDelay); }
public void process() { wrapperContained.process(); }
// public static void process() { net.minecraft.client.network.message.MessageHandler.process(); }
// public void narrate(Object params,yarnwrap.text.Text message) { wrapperContained.narrate(params,message.wrapperContained); }
// public static void narrate(Object params,yarnwrap.text.Text message, ) { net.minecraft.client.network.message.MessageHandler.narrate(params,message.wrapperContained); }
// public boolean shouldDelay() { return wrapperContained.shouldDelay(); }
// public static boolean shouldDelay() { return net.minecraft.client.network.message.MessageHandler.shouldDelay(); }
// public void process(yarnwrap.network.message.MessageSignatureData signature,java.util.function.BooleanSupplier processor) { wrapperContained.process(signature.wrapperContained,processor); }
// public static void process(yarnwrap.network.message.MessageSignatureData signature,java.util.function.BooleanSupplier processor, ) { net.minecraft.client.network.message.MessageHandler.process(signature.wrapperContained,processor); }
public boolean removeDelayedMessage(yarnwrap.network.message.MessageSignatureData signature) { return wrapperContained.removeDelayedMessage(signature.wrapperContained); }
// public static boolean removeDelayedMessage(yarnwrap.network.message.MessageSignatureData signature, ) { return net.minecraft.client.network.message.MessageHandler.removeDelayedMessage(signature.wrapperContained); }
// public boolean processChatMessageInternal(Object params,yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,com.mojang.authlib.GameProfile sender,boolean onlyShowSecureChat,java.time.Instant receptionTimestamp) { return wrapperContained.processChatMessageInternal(params,message.wrapperContained,decorated.wrapperContained,sender,onlyShowSecureChat,receptionTimestamp); }
// public static boolean processChatMessageInternal(Object params,yarnwrap.network.message.SignedMessage message,yarnwrap.text.Text decorated,com.mojang.authlib.GameProfile sender,boolean onlyShowSecureChat,java.time.Instant receptionTimestamp, ) { return net.minecraft.client.network.message.MessageHandler.processChatMessageInternal(params,message.wrapperContained,decorated.wrapperContained,sender,onlyShowSecureChat,receptionTimestamp); }
public long getUnprocessedMessageCount() { return wrapperContained.getUnprocessedMessageCount(); }
// public static long getUnprocessedMessageCount() { return net.minecraft.client.network.message.MessageHandler.getUnprocessedMessageCount(); }
public void processAll() { wrapperContained.processAll(); }
// public static void processAll() { net.minecraft.client.network.message.MessageHandler.processAll(); }
// public void onProfilelessMessage(yarnwrap.text.Text content,Object params) { wrapperContained.onProfilelessMessage(content.wrapperContained,params); }
// public static void onProfilelessMessage(yarnwrap.text.Text content,Object params, ) { net.minecraft.client.network.message.MessageHandler.onProfilelessMessage(content.wrapperContained,params); }
// public boolean method_45747(yarnwrap.network.message.MessageSignatureData message) { return wrapperContained.method_45747(message.wrapperContained); }
// public static boolean method_45747(yarnwrap.network.message.MessageSignatureData message, ) { return net.minecraft.client.network.message.MessageHandler.method_45747(message.wrapperContained); }
// public void onChatMessage(yarnwrap.network.message.SignedMessage message,com.mojang.authlib.GameProfile sender,Object params) { wrapperContained.onChatMessage(message.wrapperContained,sender,params); }
// public static void onChatMessage(yarnwrap.network.message.SignedMessage message,com.mojang.authlib.GameProfile sender,Object params, ) { net.minecraft.client.network.message.MessageHandler.onChatMessage(message.wrapperContained,sender,params); }
// public void onUnverifiedMessage(java.util.UUID sender,yarnwrap.network.message.MessageSignatureData signature,Object parameters) { wrapperContained.onUnverifiedMessage(sender,signature.wrapperContained,parameters); }
// public static void onUnverifiedMessage(java.util.UUID sender,yarnwrap.network.message.MessageSignatureData signature,Object parameters, ) { net.minecraft.client.network.message.MessageHandler.onUnverifiedMessage(sender,signature.wrapperContained,parameters); }

}