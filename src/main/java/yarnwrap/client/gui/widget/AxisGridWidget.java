package yarnwrap.client.gui.widget;
public class AxisGridWidget { public net.minecraft.client.gui.widget.AxisGridWidget wrapperContained; public AxisGridWidget(net.minecraft.client.gui.widget.AxisGridWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object axis() { return wrapperContained.axis; }
// // public void axis(Object value) { wrapperContained.axis = value; }
// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public yarnwrap.client.gui.widget.Positioner mainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.mainPositioner); }
// public void mainPositioner(yarnwrap.client.gui.widget.Positioner value) { wrapperContained.mainPositioner = value.wrapperContained; }
// public AxisGridWidget(int x,int y,int width,int height,Object axis) { this.wrapperContained = new net.minecraft.client.gui.widget.AxisGridWidget(x,y,width,height,axis); }
// public AxisGridWidget(int width,int height,Object axis) { this.wrapperContained = new net.minecraft.client.gui.widget.AxisGridWidget(width,height,axis); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.widget.Positioner positioner) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,positioner.wrapperContained)); }
public yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.copyPositioner()); }
public yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.getMainPositioner()); }
// public void method_48230(java.util.function.Consumer element) { wrapperContained.method_48230(element); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,callback)); }

}