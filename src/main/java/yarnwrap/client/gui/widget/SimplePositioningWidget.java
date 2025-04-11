package yarnwrap.client.gui.widget;
public class SimplePositioningWidget { public net.minecraft.client.gui.widget.SimplePositioningWidget wrapperContained; public SimplePositioningWidget(net.minecraft.client.gui.widget.SimplePositioningWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public int minHeight() { return wrapperContained.minHeight; }
// public void minHeight(int value) { wrapperContained.minHeight = value; }
// public int minWidth() { return wrapperContained.minWidth; }
// public void minWidth(int value) { wrapperContained.minWidth = value; }
// public yarnwrap.client.gui.widget.Positioner mainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.mainPositioner); }
// public void mainPositioner(yarnwrap.client.gui.widget.Positioner value) { wrapperContained.mainPositioner = value.wrapperContained; }
public SimplePositioningWidget(int width,int height) { this.wrapperContained = new net.minecraft.client.gui.widget.SimplePositioningWidget(width,height); }
public void setPos(int low,int high,int length,java.util.function.Consumer setter,float relative) { wrapperContained.setPos(low,high,length,setter,relative); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained)); }
public void setPos(yarnwrap.client.gui.widget.Widget widget,int left,int top,int right,int bottom) { wrapperContained.setPos(widget.wrapperContained,left,top,right,bottom); }
public void setPos(yarnwrap.client.gui.widget.Widget widget,int left,int top,int right,int bottom,float relativeX,float relativeY) { wrapperContained.setPos(widget.wrapperContained,left,top,right,bottom,relativeX,relativeY); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.widget.Positioner positioner) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,positioner.wrapperContained)); }
public yarnwrap.client.gui.widget.SimplePositioningWidget setDimensions(int minWidth,int minHeight) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.setDimensions(minWidth,minHeight)); }
public yarnwrap.client.gui.widget.SimplePositioningWidget setMinHeight(int minWidth) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.setMinHeight(minWidth)); }
public yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.copyPositioner()); }
public yarnwrap.client.gui.widget.SimplePositioningWidget setMinWidth(int minHeight) { return new yarnwrap.client.gui.widget.SimplePositioningWidget(wrapperContained.setMinWidth(minHeight)); }
public yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.getMainPositioner()); }
// public void method_48228(java.util.function.Consumer element) { wrapperContained.method_48228(element); }
public void setPos(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.ScreenRect rect) { wrapperContained.setPos(widget.wrapperContained,rect.wrapperContained); }
public void setPos(yarnwrap.client.gui.widget.Widget widget,yarnwrap.client.gui.ScreenRect rect,float relativeX,float relativeY) { wrapperContained.setPos(widget.wrapperContained,rect.wrapperContained,relativeX,relativeY); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,callback)); }

}