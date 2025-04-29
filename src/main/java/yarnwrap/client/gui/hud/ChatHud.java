package yarnwrap.client.gui.hud;
public class ChatHud { public net.minecraft.client.gui.hud.ChatHud wrapperContained; public ChatHud(net.minecraft.client.gui.hud.ChatHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List messages() { return wrapperContained.messages; }
// public void messages(java.util.List value) { wrapperContained.messages = value; }
// public static java.util.List messages() { return net.minecraft.client.gui.hud.ChatHud.messages; }
// public static void messages(java.util.List value, ) { net.minecraft.client.gui.hud.ChatHud.messages = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.hud.ChatHud.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.hud.ChatHud.client = value.wrapperContained; }

// public yarnwrap.util.collection.ArrayListDeque messageHistory() { return new yarnwrap.util.collection.ArrayListDeque(wrapperContained.messageHistory); }
// public void messageHistory(yarnwrap.util.collection.ArrayListDeque value) { wrapperContained.messageHistory = value.wrapperContained; }
// public static yarnwrap.util.collection.ArrayListDeque messageHistory() { return new yarnwrap.util.collection.ArrayListDeque(net.minecraft.client.gui.hud.ChatHud.messageHistory); }
// public static void messageHistory(yarnwrap.util.collection.ArrayListDeque value, ) { net.minecraft.client.gui.hud.ChatHud.messageHistory = value.wrapperContained; }

// public java.util.List visibleMessages() { return wrapperContained.visibleMessages; }
// public void visibleMessages(java.util.List value) { wrapperContained.visibleMessages = value; }
// public static java.util.List visibleMessages() { return net.minecraft.client.gui.hud.ChatHud.visibleMessages; }
// public static void visibleMessages(java.util.List value, ) { net.minecraft.client.gui.hud.ChatHud.visibleMessages = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gui.hud.ChatHud.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gui.hud.ChatHud.LOGGER = value; }

// public int scrolledLines() { return wrapperContained.scrolledLines; }
// public void scrolledLines(int value) { wrapperContained.scrolledLines = value; }
// public static int scrolledLines() { return net.minecraft.client.gui.hud.ChatHud.scrolledLines; }
// public static void scrolledLines(int value, ) { net.minecraft.client.gui.hud.ChatHud.scrolledLines = value; }

// public boolean hasUnreadNewMessages() { return wrapperContained.hasUnreadNewMessages; }
// public void hasUnreadNewMessages(boolean value) { wrapperContained.hasUnreadNewMessages = value; }
// public static boolean hasUnreadNewMessages() { return net.minecraft.client.gui.hud.ChatHud.hasUnreadNewMessages; }
// public static void hasUnreadNewMessages(boolean value, ) { net.minecraft.client.gui.hud.ChatHud.hasUnreadNewMessages = value; }

// public int MAX_MESSAGES() { return wrapperContained.MAX_MESSAGES; }
// public void MAX_MESSAGES(int value) { wrapperContained.MAX_MESSAGES = value; }
// public static int MAX_MESSAGES() { return net.minecraft.client.gui.hud.ChatHud.MAX_MESSAGES; }
// public static void MAX_MESSAGES(int value, ) { net.minecraft.client.gui.hud.ChatHud.MAX_MESSAGES = value; }

// public int MISSING_MESSAGE_INDEX() { return wrapperContained.MISSING_MESSAGE_INDEX; }
// public void MISSING_MESSAGE_INDEX(int value) { wrapperContained.MISSING_MESSAGE_INDEX = value; }
// public static int MISSING_MESSAGE_INDEX() { return net.minecraft.client.gui.hud.ChatHud.MISSING_MESSAGE_INDEX; }
// public static void MISSING_MESSAGE_INDEX(int value, ) { net.minecraft.client.gui.hud.ChatHud.MISSING_MESSAGE_INDEX = value; }

// public int OFFSET_FROM_BOTTOM() { return wrapperContained.OFFSET_FROM_BOTTOM; }
// public void OFFSET_FROM_BOTTOM(int value) { wrapperContained.OFFSET_FROM_BOTTOM = value; }
// public static int OFFSET_FROM_BOTTOM() { return net.minecraft.client.gui.hud.ChatHud.OFFSET_FROM_BOTTOM; }
// public static void OFFSET_FROM_BOTTOM(int value, ) { net.minecraft.client.gui.hud.ChatHud.OFFSET_FROM_BOTTOM = value; }

// public int REMOVAL_QUEUE_TICKS() { return wrapperContained.REMOVAL_QUEUE_TICKS; }
// public void REMOVAL_QUEUE_TICKS(int value) { wrapperContained.REMOVAL_QUEUE_TICKS = value; }
// public static int REMOVAL_QUEUE_TICKS() { return net.minecraft.client.gui.hud.ChatHud.REMOVAL_QUEUE_TICKS; }
// public static void REMOVAL_QUEUE_TICKS(int value, ) { net.minecraft.client.gui.hud.ChatHud.REMOVAL_QUEUE_TICKS = value; }

// public yarnwrap.text.Text DELETED_MARKER_TEXT() { return new yarnwrap.text.Text(wrapperContained.DELETED_MARKER_TEXT); }
// public void DELETED_MARKER_TEXT(yarnwrap.text.Text value) { wrapperContained.DELETED_MARKER_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text DELETED_MARKER_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.hud.ChatHud.DELETED_MARKER_TEXT); }
// public static void DELETED_MARKER_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.hud.ChatHud.DELETED_MARKER_TEXT = value.wrapperContained; }

// public java.util.List removalQueue() { return wrapperContained.removalQueue; }
// public void removalQueue(java.util.List value) { wrapperContained.removalQueue = value; }
// public static java.util.List removalQueue() { return net.minecraft.client.gui.hud.ChatHud.removalQueue; }
// public static void removalQueue(java.util.List value, ) { net.minecraft.client.gui.hud.ChatHud.removalQueue = value; }

public ChatHud(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.gui.hud.ChatHud(client.wrapperContained); }
public void scroll(int scroll) { wrapperContained.scroll(scroll); }
// public static void scroll(int scroll, ) { net.minecraft.client.gui.hud.ChatHud.scroll(scroll); }
public void addToMessageHistory(java.lang.String message) { wrapperContained.addToMessageHistory(message); }
// public static void addToMessageHistory(java.lang.String message, ) { net.minecraft.client.gui.hud.ChatHud.addToMessageHistory(message); }
public void render(yarnwrap.client.gui.DrawContext context,int currentTick,int mouseX,int mouseY,boolean focused) { wrapperContained.render(context.wrapperContained,currentTick,mouseX,mouseY,focused); }
// public static void render(yarnwrap.client.gui.DrawContext context,int currentTick,int mouseX,int mouseY,boolean focused, ) { net.minecraft.client.gui.hud.ChatHud.render(context.wrapperContained,currentTick,mouseX,mouseY,focused); }
// public int getWidth(double widthOption) { return wrapperContained.getWidth(widthOption); }
// public static int getWidth(double widthOption, ) { return net.minecraft.client.gui.hud.ChatHud.getWidth(widthOption); }
public void clear(boolean clearHistory) { wrapperContained.clear(clearHistory); }
// public static void clear(boolean clearHistory, ) { net.minecraft.client.gui.hud.ChatHud.clear(clearHistory); }
public yarnwrap.util.collection.ArrayListDeque getMessageHistory() { return new yarnwrap.util.collection.ArrayListDeque(wrapperContained.getMessageHistory()); }
// public static yarnwrap.util.collection.ArrayListDeque getMessageHistory() { return new yarnwrap.util.collection.ArrayListDeque(net.minecraft.client.gui.hud.ChatHud.getMessageHistory()); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.client.gui.hud.ChatHud.getHeight(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.client.gui.hud.ChatHud.getWidth(); }
public void addMessage(yarnwrap.text.Text message) { wrapperContained.addMessage(message.wrapperContained); }
// public static void addMessage(yarnwrap.text.Text message, ) { net.minecraft.client.gui.hud.ChatHud.addMessage(message.wrapperContained); }
public int getVisibleLineCount() { return wrapperContained.getVisibleLineCount(); }
// public static int getVisibleLineCount() { return net.minecraft.client.gui.hud.ChatHud.getVisibleLineCount(); }
public double getChatScale() { return wrapperContained.getChatScale(); }
// public static double getChatScale() { return net.minecraft.client.gui.hud.ChatHud.getChatScale(); }
// public void addVisibleMessage(yarnwrap.client.gui.hud.ChatHudLine message) { wrapperContained.addVisibleMessage(message.wrapperContained); }
// public static void addVisibleMessage(yarnwrap.client.gui.hud.ChatHudLine message, ) { net.minecraft.client.gui.hud.ChatHud.addVisibleMessage(message.wrapperContained); }
public yarnwrap.text.Style getTextStyleAt(double x,double y) { return new yarnwrap.text.Style(wrapperContained.getTextStyleAt(x,y)); }
// public static yarnwrap.text.Style getTextStyleAt(double x,double y, ) { return new yarnwrap.text.Style(net.minecraft.client.gui.hud.ChatHud.getTextStyleAt(x,y)); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.gui.hud.ChatHud.reset(); }
// public int getHeight(double heightOption) { return wrapperContained.getHeight(heightOption); }
// public static int getHeight(double heightOption, ) { return net.minecraft.client.gui.hud.ChatHud.getHeight(heightOption); }
public boolean isChatFocused() { return wrapperContained.isChatFocused(); }
// public static boolean isChatFocused() { return net.minecraft.client.gui.hud.ChatHud.isChatFocused(); }
public void resetScroll() { wrapperContained.resetScroll(); }
// public static void resetScroll() { net.minecraft.client.gui.hud.ChatHud.resetScroll(); }
// public double getMessageOpacityMultiplier(int age) { return wrapperContained.getMessageOpacityMultiplier(age); }
// public static double getMessageOpacityMultiplier(int age, ) { return net.minecraft.client.gui.hud.ChatHud.getMessageOpacityMultiplier(age); }
// public boolean isChatHidden() { return wrapperContained.isChatHidden(); }
// public static boolean isChatHidden() { return net.minecraft.client.gui.hud.ChatHud.isChatHidden(); }
public boolean mouseClicked(double mouseX,double mouseY) { return wrapperContained.mouseClicked(mouseX,mouseY); }
// public static boolean mouseClicked(double mouseX,double mouseY, ) { return net.minecraft.client.gui.hud.ChatHud.mouseClicked(mouseX,mouseY); }
// public double getDefaultUnfocusedHeight() { return wrapperContained.getDefaultUnfocusedHeight(); }
public static double getDefaultUnfocusedHeight() { return net.minecraft.client.gui.hud.ChatHud.getDefaultUnfocusedHeight(); }
// public boolean isXInsideIndicatorIcon(double x,Object line,yarnwrap.client.gui.hud.MessageIndicator indicator) { return wrapperContained.isXInsideIndicatorIcon(x,line,indicator.wrapperContained); }
// public static boolean isXInsideIndicatorIcon(double x,Object line,yarnwrap.client.gui.hud.MessageIndicator indicator, ) { return net.minecraft.client.gui.hud.ChatHud.isXInsideIndicatorIcon(x,line,indicator.wrapperContained); }
// public void drawIndicatorIcon(yarnwrap.client.gui.DrawContext context,int x,int y,Object icon) { wrapperContained.drawIndicatorIcon(context.wrapperContained,x,y,icon); }
// public static void drawIndicatorIcon(yarnwrap.client.gui.DrawContext context,int x,int y,Object icon, ) { net.minecraft.client.gui.hud.ChatHud.drawIndicatorIcon(context.wrapperContained,x,y,icon); }
// public int getIndicatorX(Object line) { return wrapperContained.getIndicatorX(line); }
// public static int getIndicatorX(Object line, ) { return net.minecraft.client.gui.hud.ChatHud.getIndicatorX(line); }
// public double toChatLineX(double x) { return wrapperContained.toChatLineX(x); }
// public static double toChatLineX(double x, ) { return net.minecraft.client.gui.hud.ChatHud.toChatLineX(x); }
public yarnwrap.client.gui.hud.MessageIndicator getIndicatorAt(double mouseX,double mouseY) { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.getIndicatorAt(mouseX,mouseY)); }
// public static yarnwrap.client.gui.hud.MessageIndicator getIndicatorAt(double mouseX,double mouseY, ) { return new yarnwrap.client.gui.hud.MessageIndicator(net.minecraft.client.gui.hud.ChatHud.getIndicatorAt(mouseX,mouseY)); }
// public double toChatLineY(double y) { return wrapperContained.toChatLineY(y); }
// public static double toChatLineY(double y, ) { return net.minecraft.client.gui.hud.ChatHud.toChatLineY(y); }
// public int getMessageLineIndex(double chatLineX,double chatLineY) { return wrapperContained.getMessageLineIndex(chatLineX,chatLineY); }
// public static int getMessageLineIndex(double chatLineX,double chatLineY, ) { return net.minecraft.client.gui.hud.ChatHud.getMessageLineIndex(chatLineX,chatLineY); }
// public int getLineHeight() { return wrapperContained.getLineHeight(); }
// public static int getLineHeight() { return net.minecraft.client.gui.hud.ChatHud.getLineHeight(); }
public void addMessage(yarnwrap.text.Text message,yarnwrap.network.message.MessageSignatureData signatureData,yarnwrap.client.gui.hud.MessageIndicator indicator) { wrapperContained.addMessage(message.wrapperContained,signatureData.wrapperContained,indicator.wrapperContained); }
// public static void addMessage(yarnwrap.text.Text message,yarnwrap.network.message.MessageSignatureData signatureData,yarnwrap.client.gui.hud.MessageIndicator indicator, ) { net.minecraft.client.gui.hud.ChatHud.addMessage(message.wrapperContained,signatureData.wrapperContained,indicator.wrapperContained); }
public void removeMessage(yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.removeMessage(signature.wrapperContained); }
// public static void removeMessage(yarnwrap.network.message.MessageSignatureData signature, ) { net.minecraft.client.gui.hud.ChatHud.removeMessage(signature.wrapperContained); }
// public void refresh() { wrapperContained.refresh(); }
// public static void refresh() { net.minecraft.client.gui.hud.ChatHud.refresh(); }
// public void logChatMessage(yarnwrap.client.gui.hud.ChatHudLine message) { wrapperContained.logChatMessage(message.wrapperContained); }
// public static void logChatMessage(yarnwrap.client.gui.hud.ChatHudLine message, ) { net.minecraft.client.gui.hud.ChatHud.logChatMessage(message.wrapperContained); }
public void tickRemovalQueueIfExists() { wrapperContained.tickRemovalQueueIfExists(); }
// public static void tickRemovalQueueIfExists() { net.minecraft.client.gui.hud.ChatHud.tickRemovalQueueIfExists(); }
// public boolean method_45585(int message) { return wrapperContained.method_45585(message); }
// public static boolean method_45585(int message, ) { return net.minecraft.client.gui.hud.ChatHud.method_45585(message); }
// public yarnwrap.client.gui.hud.ChatHudLine createRemovalMarker(yarnwrap.client.gui.hud.ChatHudLine original) { return new yarnwrap.client.gui.hud.ChatHudLine(wrapperContained.createRemovalMarker(original.wrapperContained)); }
// public static yarnwrap.client.gui.hud.ChatHudLine createRemovalMarker(yarnwrap.client.gui.hud.ChatHudLine original, ) { return new yarnwrap.client.gui.hud.ChatHudLine(net.minecraft.client.gui.hud.ChatHud.createRemovalMarker(original.wrapperContained)); }
// public Object queueForRemoval(yarnwrap.network.message.MessageSignatureData signature) { return wrapperContained.queueForRemoval(signature.wrapperContained); }
// public static Object queueForRemoval(yarnwrap.network.message.MessageSignatureData signature, ) { return net.minecraft.client.gui.hud.ChatHud.queueForRemoval(signature.wrapperContained); }
// public int getMessageIndex(double chatLineX,double chatLineY) { return wrapperContained.getMessageIndex(chatLineX,chatLineY); }
// public static int getMessageIndex(double chatLineX,double chatLineY, ) { return net.minecraft.client.gui.hud.ChatHud.getMessageIndex(chatLineX,chatLineY); }
// public void tickRemovalQueue() { wrapperContained.tickRemovalQueue(); }
// public static void tickRemovalQueue() { net.minecraft.client.gui.hud.ChatHud.tickRemovalQueue(); }
// public void restoreChatState(Object state) { wrapperContained.restoreChatState(state); }
// public static void restoreChatState(Object state, ) { net.minecraft.client.gui.hud.ChatHud.restoreChatState(state); }
// public void addMessage(yarnwrap.client.gui.hud.ChatHudLine message) { wrapperContained.addMessage(message.wrapperContained); }
// public static void addMessage(yarnwrap.client.gui.hud.ChatHudLine message, ) { net.minecraft.client.gui.hud.ChatHud.addMessage(message.wrapperContained); }
public Object toChatState() { return wrapperContained.toChatState(); }
// public static Object toChatState() { return net.minecraft.client.gui.hud.ChatHud.toChatState(); }

}