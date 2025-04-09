package yarnwrap.client.gui.widget;
public class AxisGridWidget { public net.minecraft.client.gui.widget.AxisGridWidget wrapperContained; public AxisGridWidget(net.minecraft.client.gui.widget.AxisGridWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object axis() { return wrapperContained.axis; }
// public java.util.List elements() { return wrapperContained.elements; }
// public yarnwrap.client.gui.widget.Positioner mainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.mainPositioner); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.widget.Positioner positioner) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,positioner.wrapperContained)); }
public yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.copyPositioner()); }
public yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.getMainPositioner()); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,callback)); }

}