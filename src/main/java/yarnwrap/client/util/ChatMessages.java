package yarnwrap.client.util;
public class ChatMessages { public net.minecraft.client.util.ChatMessages wrapperContained; public ChatMessages(net.minecraft.client.util.ChatMessages wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.OrderedText SPACES() { return new yarnwrap.text.OrderedText(wrapperContained.SPACES); }
// public void SPACES(yarnwrap.text.OrderedText value) { wrapperContained.SPACES = value.wrapperContained; }
// public java.lang.String getRenderedChatMessage(java.lang.String message) { return wrapperContained.getRenderedChatMessage(message); }
public java.util.List breakRenderedChatMessageLines(yarnwrap.text.StringVisitable message,int width,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.breakRenderedChatMessageLines(message.wrapperContained,width,textRenderer.wrapperContained); }
// public java.util.Optional method_27536(yarnwrap.client.util.TextCollector style,yarnwrap.text.Style message) { return wrapperContained.method_27536(style.wrapperContained,message.wrapperContained); }
// public void method_30886(java.util.List text,yarnwrap.text.StringVisitable lastLineWrapped) { wrapperContained.method_30886(text,lastLineWrapped.wrapperContained); }

}