package yarnwrap.client.gui.screen;
public class ChatScreen { public net.minecraft.client.gui.screen.ChatScreen wrapperContained; public ChatScreen(net.minecraft.client.gui.screen.ChatScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String originalChatText() { return wrapperContained.originalChatText; }
// public void originalChatText(java.lang.String value) { wrapperContained.originalChatText = value; }
// public static java.lang.String originalChatText() { return net.minecraft.client.gui.screen.ChatScreen.originalChatText; }
// public static void originalChatText(java.lang.String value, ) { net.minecraft.client.gui.screen.ChatScreen.originalChatText = value; }

// public yarnwrap.client.gui.screen.ChatInputSuggestor chatInputSuggestor() { return new yarnwrap.client.gui.screen.ChatInputSuggestor(wrapperContained.chatInputSuggestor); }
// public void chatInputSuggestor(yarnwrap.client.gui.screen.ChatInputSuggestor value) { wrapperContained.chatInputSuggestor = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ChatInputSuggestor chatInputSuggestor() { return new yarnwrap.client.gui.screen.ChatInputSuggestor(net.minecraft.client.gui.screen.ChatScreen.chatInputSuggestor); }
// public static void chatInputSuggestor(yarnwrap.client.gui.screen.ChatInputSuggestor value, ) { net.minecraft.client.gui.screen.ChatScreen.chatInputSuggestor = value.wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget chatField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.chatField); }
// public void chatField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.chatField = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.TextFieldWidget chatField() { return new yarnwrap.client.gui.widget.TextFieldWidget(net.minecraft.client.gui.screen.ChatScreen.chatField); }
// public static void chatField(yarnwrap.client.gui.widget.TextFieldWidget value, ) { net.minecraft.client.gui.screen.ChatScreen.chatField = value.wrapperContained; }

// public int messageHistoryIndex() { return wrapperContained.messageHistoryIndex; }
// public void messageHistoryIndex(int value) { wrapperContained.messageHistoryIndex = value; }
// public static int messageHistoryIndex() { return net.minecraft.client.gui.screen.ChatScreen.messageHistoryIndex; }
// public static void messageHistoryIndex(int value, ) { net.minecraft.client.gui.screen.ChatScreen.messageHistoryIndex = value; }

// public java.lang.String chatLastMessage() { return wrapperContained.chatLastMessage; }
// public void chatLastMessage(java.lang.String value) { wrapperContained.chatLastMessage = value; }
// public static java.lang.String chatLastMessage() { return net.minecraft.client.gui.screen.ChatScreen.chatLastMessage; }
// public static void chatLastMessage(java.lang.String value, ) { net.minecraft.client.gui.screen.ChatScreen.chatLastMessage = value; }

// public double SHIFT_SCROLL_AMOUNT() { return wrapperContained.SHIFT_SCROLL_AMOUNT; }
// public void SHIFT_SCROLL_AMOUNT(double value) { wrapperContained.SHIFT_SCROLL_AMOUNT = value; }
public static double SHIFT_SCROLL_AMOUNT() { return net.minecraft.client.gui.screen.ChatScreen.SHIFT_SCROLL_AMOUNT; }
// public static void SHIFT_SCROLL_AMOUNT(double value, ) { net.minecraft.client.gui.screen.ChatScreen.SHIFT_SCROLL_AMOUNT = value; }

// public yarnwrap.text.Text USAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.USAGE_TEXT); }
// public void USAGE_TEXT(yarnwrap.text.Text value) { wrapperContained.USAGE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text USAGE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ChatScreen.USAGE_TEXT); }
// public static void USAGE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ChatScreen.USAGE_TEXT = value.wrapperContained; }

// public int MAX_INDICATOR_TOOLTIP_WIDTH() { return wrapperContained.MAX_INDICATOR_TOOLTIP_WIDTH; }
// public void MAX_INDICATOR_TOOLTIP_WIDTH(int value) { wrapperContained.MAX_INDICATOR_TOOLTIP_WIDTH = value; }
// public static int MAX_INDICATOR_TOOLTIP_WIDTH() { return net.minecraft.client.gui.screen.ChatScreen.MAX_INDICATOR_TOOLTIP_WIDTH; }
// public static void MAX_INDICATOR_TOOLTIP_WIDTH(int value, ) { net.minecraft.client.gui.screen.ChatScreen.MAX_INDICATOR_TOOLTIP_WIDTH = value; }

public ChatScreen(java.lang.String originalChatText) { this.wrapperContained = new net.minecraft.client.gui.screen.ChatScreen(originalChatText); }
// public void setText(java.lang.String text) { wrapperContained.setText(text); }
// public static void setText(java.lang.String text, ) { net.minecraft.client.gui.screen.ChatScreen.setText(text); }
public void setChatFromHistory(int offset) { wrapperContained.setChatFromHistory(offset); }
// public static void setChatFromHistory(int offset, ) { net.minecraft.client.gui.screen.ChatScreen.setChatFromHistory(offset); }
// public void onChatFieldUpdate(java.lang.String chatText) { wrapperContained.onChatFieldUpdate(chatText); }
// public static void onChatFieldUpdate(java.lang.String chatText, ) { net.minecraft.client.gui.screen.ChatScreen.onChatFieldUpdate(chatText); }
// public yarnwrap.text.Style getTextStyleAt(double x,double y) { return new yarnwrap.text.Style(wrapperContained.getTextStyleAt(x,y)); }
// public static yarnwrap.text.Style getTextStyleAt(double x,double y, ) { return new yarnwrap.text.Style(net.minecraft.client.gui.screen.ChatScreen.getTextStyleAt(x,y)); }
public java.lang.String normalize(java.lang.String chatText) { return wrapperContained.normalize(chatText); }
// public static java.lang.String normalize(java.lang.String chatText, ) { return net.minecraft.client.gui.screen.ChatScreen.normalize(chatText); }
public void sendMessage(java.lang.String chatText,boolean addToHistory) { wrapperContained.sendMessage(chatText,addToHistory); }
// public static void sendMessage(java.lang.String chatText,boolean addToHistory, ) { net.minecraft.client.gui.screen.ChatScreen.sendMessage(chatText,addToHistory); }

}