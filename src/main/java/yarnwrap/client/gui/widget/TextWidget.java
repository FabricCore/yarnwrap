package yarnwrap.client.gui.widget;
public class TextWidget { public net.minecraft.client.gui.widget.TextWidget wrapperContained; public TextWidget(net.minecraft.client.gui.widget.TextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public float horizontalAlignment() { return wrapperContained.horizontalAlignment; }
// public void horizontalAlignment(float value) { wrapperContained.horizontalAlignment = value; }
public TextWidget(int x,int y,int width,int height,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.TextWidget(x,y,width,height,message.wrapperContained,textRenderer.wrapperContained); }
public TextWidget(int width,int height,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.TextWidget(width,height,message.wrapperContained,textRenderer.wrapperContained); }
public TextWidget(yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.TextWidget(message.wrapperContained,textRenderer.wrapperContained); }
public yarnwrap.client.gui.widget.TextWidget setTextColor(int textColor) { return new yarnwrap.client.gui.widget.TextWidget(wrapperContained.setTextColor(textColor)); }
public yarnwrap.client.gui.widget.TextWidget alignLeft() { return new yarnwrap.client.gui.widget.TextWidget(wrapperContained.alignLeft()); }
public yarnwrap.client.gui.widget.TextWidget alignCenter() { return new yarnwrap.client.gui.widget.TextWidget(wrapperContained.alignCenter()); }
// public yarnwrap.client.gui.widget.TextWidget align(float horizontalAlignment) { return new yarnwrap.client.gui.widget.TextWidget(wrapperContained.align(horizontalAlignment)); }
public yarnwrap.client.gui.widget.TextWidget alignRight() { return new yarnwrap.client.gui.widget.TextWidget(wrapperContained.alignRight()); }
// public yarnwrap.text.OrderedText trim(yarnwrap.text.Text text,int width) { return new yarnwrap.text.OrderedText(wrapperContained.trim(text.wrapperContained,width)); }

}