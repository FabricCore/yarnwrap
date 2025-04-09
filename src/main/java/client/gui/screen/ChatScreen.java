package yarnwrap.client.gui.screen;
public class ChatScreen { public net.minecraft.client.gui.screen.ChatScreen wrapperContained; public ChatScreen(net.minecraft.client.gui.screen.ChatScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String originalChatText() { return wrapperContained.originalChatText; }
// public yarnwrap.client.gui.screen.ChatInputSuggestor chatInputSuggestor() { return new yarnwrap.client.gui.screen.ChatInputSuggestor(wrapperContained.chatInputSuggestor); }
// public yarnwrap.client.gui.widget.TextFieldWidget chatField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.chatField); }
// public int messageHistoryIndex() { return wrapperContained.messageHistoryIndex; }
// public java.lang.String chatLastMessage() { return wrapperContained.chatLastMessage; }
public double SHIFT_SCROLL_AMOUNT() { return wrapperContained.SHIFT_SCROLL_AMOUNT; }
// public yarnwrap.text.Text USAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.USAGE_TEXT); }
// public int MAX_INDICATOR_TOOLTIP_WIDTH() { return wrapperContained.MAX_INDICATOR_TOOLTIP_WIDTH; }
// public void setText(java.lang.String text) { wrapperContained.setText(text); }
public void setChatFromHistory(int offset) { wrapperContained.setChatFromHistory(offset); }
// public void onChatFieldUpdate(java.lang.String chatText) { wrapperContained.onChatFieldUpdate(chatText); }
// public yarnwrap.text.Style getTextStyleAt(double x,double y) { return new yarnwrap.text.Style(wrapperContained.getTextStyleAt(x,y)); }
public java.lang.String normalize(java.lang.String chatText) { return wrapperContained.normalize(chatText); }
public void sendMessage(java.lang.String chatText,boolean addToHistory) { wrapperContained.sendMessage(chatText,addToHistory); }

}