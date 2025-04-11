package yarnwrap.client.gui.widget;
public class MultilineTextWidget { public net.minecraft.client.gui.widget.MultilineTextWidget wrapperContained; public MultilineTextWidget(net.minecraft.client.gui.widget.MultilineTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean centered() { return wrapperContained.centered; }
// public void centered(boolean value) { wrapperContained.centered = value; }
// public java.util.OptionalInt maxWidth() { return wrapperContained.maxWidth; }
// public void maxWidth(java.util.OptionalInt value) { wrapperContained.maxWidth = value; }
// public java.util.OptionalInt maxRows() { return wrapperContained.maxRows; }
// public void maxRows(java.util.OptionalInt value) { wrapperContained.maxRows = value; }
// public yarnwrap.util.CachedMapper cacheKeyToText() { return new yarnwrap.util.CachedMapper(wrapperContained.cacheKeyToText); }
// public void cacheKeyToText(yarnwrap.util.CachedMapper value) { wrapperContained.cacheKeyToText = value.wrapperContained; }
public MultilineTextWidget(int x,int y,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.MultilineTextWidget(x,y,message.wrapperContained,textRenderer.wrapperContained); }
public MultilineTextWidget(yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.MultilineTextWidget(message.wrapperContained,textRenderer.wrapperContained); }
// public yarnwrap.client.font.MultilineText method_48980(yarnwrap.client.font.TextRenderer cacheKey) { return new yarnwrap.client.font.MultilineText(wrapperContained.method_48980(cacheKey.wrapperContained)); }
public yarnwrap.client.gui.widget.MultilineTextWidget setCentered(boolean centered) { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.setCentered(centered)); }
// public Object getCacheKey() { return wrapperContained.getCacheKey(); }
public yarnwrap.client.gui.widget.MultilineTextWidget setMaxWidth(int maxWidth) { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.setMaxWidth(maxWidth)); }
public yarnwrap.client.gui.widget.MultilineTextWidget setMaxRows(int maxRows) { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.setMaxRows(maxRows)); }

}