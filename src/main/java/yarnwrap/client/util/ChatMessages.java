package yarnwrap.client.util;
public class ChatMessages { public net.minecraft.client.util.ChatMessages wrapperContained; public ChatMessages(net.minecraft.client.util.ChatMessages wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.OrderedText SPACES() { return new yarnwrap.text.OrderedText(wrapperContained.SPACES); }
// public void SPACES(yarnwrap.text.OrderedText value) { wrapperContained.SPACES = value.wrapperContained; }
// public static yarnwrap.text.OrderedText SPACES() { return new yarnwrap.text.OrderedText(net.minecraft.client.util.ChatMessages.SPACES); }
// public static void SPACES(yarnwrap.text.OrderedText value, ) { net.minecraft.client.util.ChatMessages.SPACES = value.wrapperContained; }

// public java.lang.String getRenderedChatMessage(java.lang.String message) { return wrapperContained.getRenderedChatMessage(message); }
// public static java.lang.String getRenderedChatMessage(java.lang.String message, ) { return net.minecraft.client.util.ChatMessages.getRenderedChatMessage(message); }
// public java.util.List breakRenderedChatMessageLines(yarnwrap.text.StringVisitable message,int width,yarnwrap.client.font.TextRenderer textRenderer) { return wrapperContained.breakRenderedChatMessageLines(message.wrapperContained,width,textRenderer.wrapperContained); }
// public static java.util.List breakRenderedChatMessageLines(yarnwrap.text.StringVisitable message,int width,yarnwrap.client.font.TextRenderer textRenderer, ) { return net.minecraft.client.util.ChatMessages.breakRenderedChatMessageLines(message.wrapperContained,width,textRenderer.wrapperContained); }
// public java.util.Optional method_27536(yarnwrap.client.util.TextCollector style,yarnwrap.text.Style message) { return wrapperContained.method_27536(style.wrapperContained,message.wrapperContained); }
// public static java.util.Optional method_27536(yarnwrap.client.util.TextCollector style,yarnwrap.text.Style message, ) { return net.minecraft.client.util.ChatMessages.method_27536(style.wrapperContained,message.wrapperContained); }
// public void method_30886(java.util.List text,yarnwrap.text.StringVisitable lastLineWrapped) { wrapperContained.method_30886(text,lastLineWrapped.wrapperContained); }
// public static void method_30886(java.util.List text,yarnwrap.text.StringVisitable lastLineWrapped, ) { net.minecraft.client.util.ChatMessages.method_30886(text,lastLineWrapped.wrapperContained); }

}