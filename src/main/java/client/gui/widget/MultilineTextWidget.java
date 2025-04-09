package yarnwrap.client.gui.widget;
public class MultilineTextWidget { public net.minecraft.client.gui.widget.MultilineTextWidget wrapperContained; public MultilineTextWidget(net.minecraft.client.gui.widget.MultilineTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean centered() { return wrapperContained.centered; }
// public java.util.OptionalInt maxWidth() { return wrapperContained.maxWidth; }
// public java.util.OptionalInt maxRows() { return wrapperContained.maxRows; }
// public yarnwrap.util.CachedMapper cacheKeyToText() { return new yarnwrap.util.CachedMapper(wrapperContained.cacheKeyToText); }
public yarnwrap.client.gui.widget.MultilineTextWidget setCentered(boolean centered) { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.setCentered(centered)); }
// public Object getCacheKey() { return wrapperContained.getCacheKey(); }
public yarnwrap.client.gui.widget.MultilineTextWidget setMaxWidth(int maxWidth) { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.setMaxWidth(maxWidth)); }
public yarnwrap.client.gui.widget.MultilineTextWidget setMaxRows(int maxRows) { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.setMaxRows(maxRows)); }

}