package yarnwrap.client.gui.widget;
public class EmptyWidget { public net.minecraft.client.gui.widget.EmptyWidget wrapperContained; public EmptyWidget(net.minecraft.client.gui.widget.EmptyWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int x() { return wrapperContained.x; }
// public int y() { return wrapperContained.y; }
// public int width() { return wrapperContained.width; }
// public int height() { return wrapperContained.height; }
public yarnwrap.client.gui.widget.EmptyWidget ofWidth(int width) { return new yarnwrap.client.gui.widget.EmptyWidget(wrapperContained.ofWidth(width)); }
public yarnwrap.client.gui.widget.EmptyWidget ofHeight(int height) { return new yarnwrap.client.gui.widget.EmptyWidget(wrapperContained.ofHeight(height)); }

}