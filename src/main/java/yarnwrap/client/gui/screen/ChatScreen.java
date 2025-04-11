package yarnwrap.client.gui.screen;
public class ChatScreen { public net.minecraft.client.gui.screen.ChatScreen wrapperContained; public ChatScreen(net.minecraft.client.gui.screen.ChatScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String originalChatText() { return wrapperContained.originalChatText; }
// public void originalChatText(java.lang.String value) { wrapperContained.originalChatText = value; }
// public yarnwrap.client.gui.screen.ChatInputSuggestor chatInputSuggestor() { return new yarnwrap.client.gui.screen.ChatInputSuggestor(wrapperContained.chatInputSuggestor); }
// public void chatInputSuggestor(yarnwrap.client.gui.screen.ChatInputSuggestor value) { wrapperContained.chatInputSuggestor = value.wrapperContained; }
// public yarnwrap.client.gui.widget.TextFieldWidget chatField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.chatField); }
// public void chatField(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.chatField = value.wrapperContained; }
// public int messageHistoryIndex() { return wrapperContained.messageHistoryIndex; }
// public void messageHistoryIndex(int value) { wrapperContained.messageHistoryIndex = value; }
// public java.lang.String chatLastMessage() { return wrapperContained.chatLastMessage; }
// public void chatLastMessage(java.lang.String value) { wrapperContained.chatLastMessage = value; }
public double SHIFT_SCROLL_AMOUNT() { return wrapperContained.SHIFT_SCROLL_AMOUNT; }
// public void SHIFT_SCROLL_AMOUNT(double value) { wrapperContained.SHIFT_SCROLL_AMOUNT = value; }
// public yarnwrap.text.Text USAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.USAGE_TEXT); }
// public void USAGE_TEXT(yarnwrap.text.Text value) { wrapperContained.USAGE_TEXT = value.wrapperContained; }
// public int MAX_INDICATOR_TOOLTIP_WIDTH() { return wrapperContained.MAX_INDICATOR_TOOLTIP_WIDTH; }
// public void MAX_INDICATOR_TOOLTIP_WIDTH(int value) { wrapperContained.MAX_INDICATOR_TOOLTIP_WIDTH = value; }
public ChatScreen(java.lang.String originalChatText) { this.wrapperContained = new net.minecraft.client.gui.screen.ChatScreen(originalChatText); }
// public void setText(java.lang.String text) { wrapperContained.setText(text); }
public void setChatFromHistory(int offset) { wrapperContained.setChatFromHistory(offset); }
// public void onChatFieldUpdate(java.lang.String chatText) { wrapperContained.onChatFieldUpdate(chatText); }
// public yarnwrap.text.Style getTextStyleAt(double x,double y) { return new yarnwrap.text.Style(wrapperContained.getTextStyleAt(x,y)); }
public java.lang.String normalize(java.lang.String chatText) { return wrapperContained.normalize(chatText); }
public void sendMessage(java.lang.String chatText,boolean addToHistory) { wrapperContained.sendMessage(chatText,addToHistory); }

}