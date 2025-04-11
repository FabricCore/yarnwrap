package yarnwrap.client.gui.widget;
public class AbstractTextWidget { public net.minecraft.client.gui.widget.AbstractTextWidget wrapperContained; public AbstractTextWidget(net.minecraft.client.gui.widget.AbstractTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public int textColor() { return wrapperContained.textColor; }
// public void textColor(int value) { wrapperContained.textColor = value; }
// public yarnwrap.client.font.TextRenderer getTextRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.getTextRenderer()); }
public yarnwrap.client.gui.widget.AbstractTextWidget setTextColor(int textColor) { return new yarnwrap.client.gui.widget.AbstractTextWidget(wrapperContained.setTextColor(textColor)); }
// public int getTextColor() { return wrapperContained.getTextColor(); }

}