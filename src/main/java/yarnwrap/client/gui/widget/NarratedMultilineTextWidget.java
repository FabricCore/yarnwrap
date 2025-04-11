package yarnwrap.client.gui.widget;
public class NarratedMultilineTextWidget { public net.minecraft.client.gui.widget.NarratedMultilineTextWidget wrapperContained; public NarratedMultilineTextWidget(net.minecraft.client.gui.widget.NarratedMultilineTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_MARGIN() { return wrapperContained.DEFAULT_MARGIN; }
// public void DEFAULT_MARGIN(int value) { wrapperContained.DEFAULT_MARGIN = value; }
// public boolean alwaysShowBorders() { return wrapperContained.alwaysShowBorders; }
// public void alwaysShowBorders(boolean value) { wrapperContained.alwaysShowBorders = value; }
// public int margin() { return wrapperContained.margin; }
// public void margin(int value) { wrapperContained.margin = value; }
public NarratedMultilineTextWidget(int maxWidth,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.NarratedMultilineTextWidget(maxWidth,message.wrapperContained,textRenderer.wrapperContained); }
public NarratedMultilineTextWidget(int maxWidth,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer,int margin) { this.wrapperContained = new net.minecraft.client.gui.widget.NarratedMultilineTextWidget(maxWidth,message.wrapperContained,textRenderer.wrapperContained,margin); }
public NarratedMultilineTextWidget(int maxWidth,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer,boolean alwaysShowBorders,int margin) { this.wrapperContained = new net.minecraft.client.gui.widget.NarratedMultilineTextWidget(maxWidth,message.wrapperContained,textRenderer.wrapperContained,alwaysShowBorders,margin); }
public void initMaxWidth(int baseWidth) { wrapperContained.initMaxWidth(baseWidth); }

}