package yarnwrap.client.gui.widget;
public class DirectionalLayoutWidget { public net.minecraft.client.gui.widget.DirectionalLayoutWidget wrapperContained; public DirectionalLayoutWidget(net.minecraft.client.gui.widget.DirectionalLayoutWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.GridWidget grid() { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.grid); }
// public void grid(yarnwrap.client.gui.widget.GridWidget value) { wrapperContained.grid = value.wrapperContained; }
// public Object axis() { return wrapperContained.axis; }
// // public void axis(Object value) { wrapperContained.axis = value; }
// public int currentIndex() { return wrapperContained.currentIndex; }
// public void currentIndex(int value) { wrapperContained.currentIndex = value; }
public yarnwrap.client.gui.widget.DirectionalLayoutWidget spacing(int spacing) { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.spacing(spacing)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.widget.Positioner positioner) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,positioner.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,callback)); }
public yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.copyPositioner()); }
public yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.getMainPositioner()); }
public yarnwrap.client.gui.widget.DirectionalLayoutWidget vertical() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.vertical()); }
public yarnwrap.client.gui.widget.DirectionalLayoutWidget horizontal() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.horizontal()); }

}