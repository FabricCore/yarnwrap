package yarnwrap.client.gui.widget;
public class ScrollableTextWidget { public net.minecraft.client.gui.widget.ScrollableTextWidget wrapperContained; public ScrollableTextWidget(net.minecraft.client.gui.widget.ScrollableTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public yarnwrap.client.gui.widget.MultilineTextWidget wrapped() { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.wrapped); }
public yarnwrap.client.gui.widget.ScrollableTextWidget textColor(int textColor) { return new yarnwrap.client.gui.widget.ScrollableTextWidget(wrapperContained.textColor(textColor)); }
public boolean textOverflows() { return wrapperContained.textOverflows(); }

}