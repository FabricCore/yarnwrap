package yarnwrap.client.gui.hud;
public class ChatHud { public net.minecraft.client.gui.hud.ChatHud wrapperContained; public ChatHud(net.minecraft.client.gui.hud.ChatHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List messages() { return wrapperContained.messages; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.util.collection.ArrayListDeque messageHistory() { return new yarnwrap.util.collection.ArrayListDeque(wrapperContained.messageHistory); }
// public java.util.List visibleMessages() { return wrapperContained.visibleMessages; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int scrolledLines() { return wrapperContained.scrolledLines; }
// public boolean hasUnreadNewMessages() { return wrapperContained.hasUnreadNewMessages; }
// public int MAX_MESSAGES() { return wrapperContained.MAX_MESSAGES; }
// public int MISSING_MESSAGE_INDEX() { return wrapperContained.MISSING_MESSAGE_INDEX; }
// public int OFFSET_FROM_BOTTOM() { return wrapperContained.OFFSET_FROM_BOTTOM; }
// public int REMOVAL_QUEUE_TICKS() { return wrapperContained.REMOVAL_QUEUE_TICKS; }
// public yarnwrap.text.Text DELETED_MARKER_TEXT() { return new yarnwrap.text.Text(wrapperContained.DELETED_MARKER_TEXT); }
// public java.util.List removalQueue() { return wrapperContained.removalQueue; }
public void scroll(int scroll) { wrapperContained.scroll(scroll); }
public void addToMessageHistory(java.lang.String message) { wrapperContained.addToMessageHistory(message); }
public void render(yarnwrap.client.gui.DrawContext context,int currentTick,int mouseX,int mouseY,boolean focused) { wrapperContained.render(context.wrapperContained,currentTick,mouseX,mouseY,focused); }
public int getWidth(double widthOption) { return wrapperContained.getWidth(widthOption); }
public void clear(boolean clearHistory) { wrapperContained.clear(clearHistory); }
public yarnwrap.util.collection.ArrayListDeque getMessageHistory() { return new yarnwrap.util.collection.ArrayListDeque(wrapperContained.getMessageHistory()); }
public int getHeight() { return wrapperContained.getHeight(); }
public int getWidth() { return wrapperContained.getWidth(); }
public void addMessage(yarnwrap.text.Text message) { wrapperContained.addMessage(message.wrapperContained); }
public int getVisibleLineCount() { return wrapperContained.getVisibleLineCount(); }
public double getChatScale() { return wrapperContained.getChatScale(); }
// public void addVisibleMessage(yarnwrap.client.gui.hud.ChatHudLine message) { wrapperContained.addVisibleMessage(message.wrapperContained); }
public yarnwrap.text.Style getTextStyleAt(double x,double y) { return new yarnwrap.text.Style(wrapperContained.getTextStyleAt(x,y)); }
public void reset() { wrapperContained.reset(); }
public int getHeight(double heightOption) { return wrapperContained.getHeight(heightOption); }
public boolean isChatFocused() { return wrapperContained.isChatFocused(); }
public void resetScroll() { wrapperContained.resetScroll(); }
// public double getMessageOpacityMultiplier(int age) { return wrapperContained.getMessageOpacityMultiplier(age); }
// public boolean isChatHidden() { return wrapperContained.isChatHidden(); }
public boolean mouseClicked(double mouseX,double mouseY) { return wrapperContained.mouseClicked(mouseX,mouseY); }
public double getDefaultUnfocusedHeight() { return wrapperContained.getDefaultUnfocusedHeight(); }
// public boolean isXInsideIndicatorIcon(double x,Object line,yarnwrap.client.gui.hud.MessageIndicator indicator) { return wrapperContained.isXInsideIndicatorIcon(x,line,indicator.wrapperContained); }
// public void drawIndicatorIcon(yarnwrap.client.gui.DrawContext context,int x,int y,Object icon) { wrapperContained.drawIndicatorIcon(context.wrapperContained,x,y,icon); }
// public int getIndicatorX(Object line) { return wrapperContained.getIndicatorX(line); }
// public double toChatLineX(double x) { return wrapperContained.toChatLineX(x); }
public yarnwrap.client.gui.hud.MessageIndicator getIndicatorAt(double mouseX,double mouseY) { return new yarnwrap.client.gui.hud.MessageIndicator(wrapperContained.getIndicatorAt(mouseX,mouseY)); }
// public double toChatLineY(double y) { return wrapperContained.toChatLineY(y); }
// public int getMessageLineIndex(double chatLineX,double chatLineY) { return wrapperContained.getMessageLineIndex(chatLineX,chatLineY); }
// public int getLineHeight() { return wrapperContained.getLineHeight(); }
public void addMessage(yarnwrap.text.Text message,yarnwrap.network.message.MessageSignatureData signatureData,yarnwrap.client.gui.hud.MessageIndicator indicator) { wrapperContained.addMessage(message.wrapperContained,signatureData.wrapperContained,indicator.wrapperContained); }
public void removeMessage(yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.removeMessage(signature.wrapperContained); }
// public void refresh() { wrapperContained.refresh(); }
// public void logChatMessage(yarnwrap.client.gui.hud.ChatHudLine message) { wrapperContained.logChatMessage(message.wrapperContained); }
public void tickRemovalQueueIfExists() { wrapperContained.tickRemovalQueueIfExists(); }
// public yarnwrap.client.gui.hud.ChatHudLine createRemovalMarker(yarnwrap.client.gui.hud.ChatHudLine original) { return new yarnwrap.client.gui.hud.ChatHudLine(wrapperContained.createRemovalMarker(original.wrapperContained)); }
// public Object queueForRemoval(yarnwrap.network.message.MessageSignatureData signature) { return wrapperContained.queueForRemoval(signature.wrapperContained); }
// public int getMessageIndex(double chatLineX,double chatLineY) { return wrapperContained.getMessageIndex(chatLineX,chatLineY); }
// public void tickRemovalQueue() { wrapperContained.tickRemovalQueue(); }
// public void restoreChatState(Object state) { wrapperContained.restoreChatState(state); }
// public void addMessage(yarnwrap.client.gui.hud.ChatHudLine message) { wrapperContained.addMessage(message.wrapperContained); }
public Object toChatState() { return wrapperContained.toChatState(); }

}