package yarnwrap.util;
public class TextifiedException { public net.minecraft.util.TextifiedException wrapperContained; public TextifiedException(net.minecraft.util.TextifiedException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text messageText() { return new yarnwrap.text.Text(wrapperContained.messageText); }
// public void messageText(yarnwrap.text.Text value) { wrapperContained.messageText = value.wrapperContained; }
public TextifiedException(yarnwrap.text.Text messageText) { this.wrapperContained = new net.minecraft.util.TextifiedException(messageText.wrapperContained); }
public TextifiedException(yarnwrap.text.Text messageText,java.lang.Throwable cause) { this.wrapperContained = new net.minecraft.util.TextifiedException(messageText.wrapperContained,cause); }
public yarnwrap.text.Text getMessageText() { return new yarnwrap.text.Text(wrapperContained.getMessageText()); }

}