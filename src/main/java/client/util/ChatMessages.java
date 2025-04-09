package yarnwrap.client.util;
public class ChatMessages { public net.minecraft.client.util.ChatMessages wrapperContained; public ChatMessages(net.minecraft.client.util.ChatMessages wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.OrderedText SPACES() { return new yarnwrap.text.OrderedText(wrapperContained.SPACES); }
// public java.lang.String getRenderedChatMessage(java.lang.String message) { return wrapperContained.getRenderedChatMessage(message); }
public java.util.List breakRenderedChatMessageLines(yarnwrap.text.StringVisitable message,int width,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.breakRenderedChatMessageLines(message.wrapperContained,width,textRenderer.wrapperContained); }

}