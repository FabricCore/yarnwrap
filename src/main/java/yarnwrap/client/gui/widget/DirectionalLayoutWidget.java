package yarnwrap.client.gui.widget;
public class DirectionalLayoutWidget { public net.minecraft.client.gui.widget.DirectionalLayoutWidget wrapperContained; public DirectionalLayoutWidget(net.minecraft.client.gui.widget.DirectionalLayoutWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.GridWidget grid() { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.grid); }
// public void grid(yarnwrap.client.gui.widget.GridWidget value) { wrapperContained.grid = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.GridWidget grid() { return new yarnwrap.client.gui.widget.GridWidget(net.minecraft.client.gui.widget.DirectionalLayoutWidget.grid); }
// public static void grid(yarnwrap.client.gui.widget.GridWidget value, ) { net.minecraft.client.gui.widget.DirectionalLayoutWidget.grid = value.wrapperContained; }

// public Object axis() { return wrapperContained.axis; }
// // public void axis(Object value) { wrapperContained.axis = value; }
// // public static Object axis() { return net.minecraft.client.gui.widget.DirectionalLayoutWidget.axis; }
// // public static void axis(Object value, ) { net.minecraft.client.gui.widget.DirectionalLayoutWidget.axis = value; }

// public int currentIndex() { return wrapperContained.currentIndex; }
// public void currentIndex(int value) { wrapperContained.currentIndex = value; }
// public static int currentIndex() { return net.minecraft.client.gui.widget.DirectionalLayoutWidget.currentIndex; }
// public static void currentIndex(int value, ) { net.minecraft.client.gui.widget.DirectionalLayoutWidget.currentIndex = value; }

// public DirectionalLayoutWidget(int x,int y,Object axis) { this.wrapperContained = new net.minecraft.client.gui.widget.DirectionalLayoutWidget(x,y,axis); }
// public DirectionalLayoutWidget(Object axis) { this.wrapperContained = new net.minecraft.client.gui.widget.DirectionalLayoutWidget(axis); }
public yarnwrap.client.gui.widget.DirectionalLayoutWidget spacing(int spacing) { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.spacing(spacing)); }
// public static yarnwrap.client.gui.widget.DirectionalLayoutWidget spacing(int spacing, ) { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(net.minecraft.client.gui.widget.DirectionalLayoutWidget.spacing(spacing)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained)); }
// public static yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.DirectionalLayoutWidget.add(widget.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.widget.Positioner positioner) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,positioner.wrapperContained)); }
// public static yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.widget.Positioner positioner, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.DirectionalLayoutWidget.add(widget.wrapperContained,positioner.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,callback)); }
// public static yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.DirectionalLayoutWidget.add(widget.wrapperContained,callback)); }
public yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.copyPositioner()); }
// public static yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.DirectionalLayoutWidget.copyPositioner()); }
public yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.getMainPositioner()); }
// public static yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.DirectionalLayoutWidget.getMainPositioner()); }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget vertical() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.vertical()); }
public static yarnwrap.client.gui.widget.DirectionalLayoutWidget vertical() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(net.minecraft.client.gui.widget.DirectionalLayoutWidget.vertical()); }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget horizontal() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.horizontal()); }
public static yarnwrap.client.gui.widget.DirectionalLayoutWidget horizontal() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(net.minecraft.client.gui.widget.DirectionalLayoutWidget.horizontal()); }

}