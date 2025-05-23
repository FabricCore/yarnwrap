package yarnwrap.client.gui.widget;
public class SimplePositioningWidget { public net.minecraft.client.gui.widget.SimplePositioningWidget wrapperContained; public SimplePositioningWidget(net.minecraft.client.gui.widget.SimplePositioningWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public static java.util.List elements() { return net.minecraft.client.gui.widget.SimplePositioningWidget.elements; }
// public static void elements(java.util.List value, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.elements = value; }

// public int minWidth() { return wrapperContained.minWidth; }
// public void minWidth(int value) { wrapperContained.minWidth = value; }
// public static int minWidth() { return net.minecraft.client.gui.widget.SimplePositioningWidget.minWidth; }
// public static void minWidth(int value, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.minWidth = value; }

// public int minHeight() { return wrapperContained.minHeight; }
// public void minHeight(int value) { wrapperContained.minHeight = value; }
// public static int minHeight() { return net.minecraft.client.gui.widget.SimplePositioningWidget.minHeight; }
// public static void minHeight(int value, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.minHeight = value; }

// public yarnwrap.client.gui.widget.Positioner mainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.mainPositioner); }
// public void mainPositioner(yarnwrap.client.gui.widget.Positioner value) { wrapperContained.mainPositioner = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.Positioner mainPositioner() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.SimplePositioningWidget.mainPositioner); }
// public static void mainPositioner(yarnwrap.client.gui.widget.Positioner value, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.mainPositioner = value.wrapperContained; }

public SimplePositioningWidget(int width,int height) { this.wrapperContained = new net.minecraft.client.gui.widget.SimplePositioningWidget(width,height); }
// public void setPos(int low,int high,int length,java.util.function.Consumer setter,float relative) { wrapperContained.setPos(low,high,length,setter,relative); }
// public static void setPos(int low,int high,int length,java.util.function.Consumer setter,float relative, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.setPos(low,high,length,setter,relative); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained)); }
// public static yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.SimplePositioningWidget.add(widget.wrapperContained)); }
// public void setPos(yarnwrap.client.gui.widget.Widget widget,int left,int top,int right,int bottom) { wrapperContained.setPos(widget.wrapperContained,left,top,right,bottom); }
// public static void setPos(yarnwrap.client.gui.widget.Widget widget,int left,int top,int right,int bottom, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.setPos(widget.wrapperContained,left,top,right,bottom); }
// public void setPos(yarnwrap.client.gui.widget.Widget widget,int left,int top,int right,int bottom,float relativeX,float relativeY) { wrapperContained.setPos(widget.wrapperContained,left,top,right,bottom,relativeX,relativeY); }
// public static void setPos(yarnwrap.client.gui.widget.Widget widget,int left,int top,int right,int bottom,float relativeX,float relativeY, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.setPos(widget.wrapperContained,left,top,right,bottom,relativeX,relativeY); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.widget.Positioner positioner) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,positioner.wrapperContained)); }
// public static yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.widget.Positioner positioner, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.SimplePositioningWidget.add(widget.wrapperContained,positioner.wrapperContained)); }
public yarnwrap.client.gui.widget.SimplePositioningWidget setDimensions(int minWidth,int minHeight) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.setDimensions(minWidth,minHeight)); }
// public static yarnwrap.client.gui.widget.SimplePositioningWidget setDimensions(int minWidth,int minHeight, ) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(net.minecraft.client.gui.widget.SimplePositioningWidget.setDimensions(minWidth,minHeight)); }
public yarnwrap.client.gui.widget.SimplePositioningWidget setMinHeight(int minHeight) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.setMinHeight(minHeight)); }
// public static yarnwrap.client.gui.widget.SimplePositioningWidget setMinHeight(int minHeight, ) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(net.minecraft.client.gui.widget.SimplePositioningWidget.setMinHeight(minHeight)); }
public yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.copyPositioner()); }
// public static yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.SimplePositioningWidget.copyPositioner()); }
public yarnwrap.client.gui.widget.SimplePositioningWidget setMinWidth(int minWidth) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.setMinWidth(minWidth)); }
// public static yarnwrap.client.gui.widget.SimplePositioningWidget setMinWidth(int minWidth, ) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(net.minecraft.client.gui.widget.SimplePositioningWidget.setMinWidth(minWidth)); }
public yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.getMainPositioner()); }
// public static yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.SimplePositioningWidget.getMainPositioner()); }
// public void method_48228(java.util.function.Consumer element) { wrapperContained.method_48228(element); }
// public static void method_48228(java.util.function.Consumer element, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.method_48228(element); }
// public void setPos(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.ScreenRect rect) { wrapperContained.setPos(widget.wrapperContained,rect.wrapperContained); }
// public static void setPos(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.ScreenRect rect, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.setPos(widget.wrapperContained,rect.wrapperContained); }
// public void setPos(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.ScreenRect rect,float relativeX,float relativeY) { wrapperContained.setPos(widget.wrapperContained,rect.wrapperContained,relativeX,relativeY); }
// public static void setPos(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.ScreenRect rect,float relativeX,float relativeY, ) { net.minecraft.client.gui.widget.SimplePositioningWidget.setPos(widget.wrapperContained,rect.wrapperContained,relativeX,relativeY); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,callback)); }
// public static yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback, ) { return new yarnwrap.client.gui.widget.Widget(net.minecraft.client.gui.widget.SimplePositioningWidget.add(widget.wrapperContained,callback)); }

}