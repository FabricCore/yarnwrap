package yarnwrap.client.gui.widget;
public class NarratedMultilineTextWidget { public net.minecraft.client.gui.widget.NarratedMultilineTextWidget wrapperContained; public NarratedMultilineTextWidget(net.minecraft.client.gui.widget.NarratedMultilineTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_MARGIN() { return wrapperContained.DEFAULT_MARGIN; }
// public void DEFAULT_MARGIN(int value) { wrapperContained.DEFAULT_MARGIN = value; }
// public static int DEFAULT_MARGIN() { return net.minecraft.client.gui.widget.NarratedMultilineTextWidget.DEFAULT_MARGIN; }
// public static void DEFAULT_MARGIN(int value, ) { net.minecraft.client.gui.widget.NarratedMultilineTextWidget.DEFAULT_MARGIN = value; }

// public boolean alwaysShowBorders() { return wrapperContained.alwaysShowBorders; }
// public void alwaysShowBorders(boolean value) { wrapperContained.alwaysShowBorders = value; }
// public static boolean alwaysShowBorders() { return net.minecraft.client.gui.widget.NarratedMultilineTextWidget.alwaysShowBorders; }
// public static void alwaysShowBorders(boolean value, ) { net.minecraft.client.gui.widget.NarratedMultilineTextWidget.alwaysShowBorders = value; }

// public int margin() { return wrapperContained.margin; }
// public void margin(int value) { wrapperContained.margin = value; }
// public static int margin() { return net.minecraft.client.gui.widget.NarratedMultilineTextWidget.margin; }
// public static void margin(int value, ) { net.minecraft.client.gui.widget.NarratedMultilineTextWidget.margin = value; }

// public boolean fillBackground() { return wrapperContained.fillBackground; }
// public void fillBackground(boolean value) { wrapperContained.fillBackground = value; }
// public static boolean fillBackground() { return net.minecraft.client.gui.widget.NarratedMultilineTextWidget.fillBackground; }
// public static void fillBackground(boolean value, ) { net.minecraft.client.gui.widget.NarratedMultilineTextWidget.fillBackground = value; }

public NarratedMultilineTextWidget(int maxWidth,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.NarratedMultilineTextWidget(maxWidth,message.wrapperContained,textRenderer.wrapperContained); }
public NarratedMultilineTextWidget(int maxWidth,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer,int margin) { this.wrapperContained = new net.minecraft.client.gui.widget.NarratedMultilineTextWidget(maxWidth,message.wrapperContained,textRenderer.wrapperContained,margin); }
// public NarratedMultilineTextWidget(int maxWidth,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer,boolean alwaysShowBorders,boolean fillBackground,int margin) { this.wrapperContained = new net.minecraft.client.gui.widget.NarratedMultilineTextWidget(maxWidth,message.wrapperContained,textRenderer.wrapperContained,alwaysShowBorders,fillBackground,margin); }
public void initMaxWidth(int baseWidth) { wrapperContained.initMaxWidth(baseWidth); }
// public static void initMaxWidth(int baseWidth, ) { net.minecraft.client.gui.widget.NarratedMultilineTextWidget.initMaxWidth(baseWidth); }

}