package yarnwrap.client.gui.widget;
public class Positioner { public net.minecraft.client.gui.widget.Positioner wrapperContained; public Positioner(net.minecraft.client.gui.widget.Positioner wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.gui.widget.Positioner alignLeft() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.alignLeft()); }
// public static yarnwrap.client.gui.widget.Positioner alignLeft() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.alignLeft()); }
public yarnwrap.client.gui.widget.Positioner relativeX(float relativeX) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.relativeX(relativeX)); }
// public static yarnwrap.client.gui.widget.Positioner relativeX(float relativeX, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.relativeX(relativeX)); }
public yarnwrap.client.gui.widget.Positioner relative(float x,float y) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.relative(x,y)); }
// public static yarnwrap.client.gui.widget.Positioner relative(float x,float y, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.relative(x,y)); }
public yarnwrap.client.gui.widget.Positioner margin(int value) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.margin(value)); }
// public static yarnwrap.client.gui.widget.Positioner margin(int value, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.margin(value)); }
public yarnwrap.client.gui.widget.Positioner margin(int x,int y) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.margin(x,y)); }
// public static yarnwrap.client.gui.widget.Positioner margin(int x,int y, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.margin(x,y)); }
public yarnwrap.client.gui.widget.Positioner margin(int left,int top,int right,int bottom) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.margin(left,top,right,bottom)); }
// public static yarnwrap.client.gui.widget.Positioner margin(int left,int top,int right,int bottom, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.margin(left,top,right,bottom)); }
public yarnwrap.client.gui.widget.Positioner alignHorizontalCenter() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.alignHorizontalCenter()); }
// public static yarnwrap.client.gui.widget.Positioner alignHorizontalCenter() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.alignHorizontalCenter()); }
public yarnwrap.client.gui.widget.Positioner relativeY(float relativeY) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.relativeY(relativeY)); }
// public static yarnwrap.client.gui.widget.Positioner relativeY(float relativeY, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.relativeY(relativeY)); }
public yarnwrap.client.gui.widget.Positioner marginLeft(int marginLeft) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.marginLeft(marginLeft)); }
// public static yarnwrap.client.gui.widget.Positioner marginLeft(int marginLeft, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.marginLeft(marginLeft)); }
public yarnwrap.client.gui.widget.Positioner alignRight() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.alignRight()); }
// public static yarnwrap.client.gui.widget.Positioner alignRight() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.alignRight()); }
public yarnwrap.client.gui.widget.Positioner marginTop(int marginTop) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.marginTop(marginTop)); }
// public static yarnwrap.client.gui.widget.Positioner marginTop(int marginTop, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.marginTop(marginTop)); }
public yarnwrap.client.gui.widget.Positioner alignTop() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.alignTop()); }
// public static yarnwrap.client.gui.widget.Positioner alignTop() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.alignTop()); }
public yarnwrap.client.gui.widget.Positioner marginRight(int marginRight) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.marginRight(marginRight)); }
// public static yarnwrap.client.gui.widget.Positioner marginRight(int marginRight, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.marginRight(marginRight)); }
public yarnwrap.client.gui.widget.Positioner alignVerticalCenter() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.alignVerticalCenter()); }
// public static yarnwrap.client.gui.widget.Positioner alignVerticalCenter() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.alignVerticalCenter()); }
public yarnwrap.client.gui.widget.Positioner marginBottom(int marginBottom) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.marginBottom(marginBottom)); }
// public static yarnwrap.client.gui.widget.Positioner marginBottom(int marginBottom, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.marginBottom(marginBottom)); }
public yarnwrap.client.gui.widget.Positioner alignBottom() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.alignBottom()); }
// public static yarnwrap.client.gui.widget.Positioner alignBottom() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.alignBottom()); }
public yarnwrap.client.gui.widget.Positioner marginX(int marginX) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.marginX(marginX)); }
// public static yarnwrap.client.gui.widget.Positioner marginX(int marginX, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.marginX(marginX)); }
public yarnwrap.client.gui.widget.Positioner copy() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.copy()); }
// public static yarnwrap.client.gui.widget.Positioner copy() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.copy()); }
public yarnwrap.client.gui.widget.Positioner marginY(int marginY) { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.marginY(marginY)); }
// public static yarnwrap.client.gui.widget.Positioner marginY(int marginY, ) { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.marginY(marginY)); }
public Object toImpl() { return wrapperContained.toImpl(); }
// public static Object toImpl() { return net.minecraft.client.gui.widget.Positioner.toImpl(); }
// public yarnwrap.client.gui.widget.Positioner create() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.create()); }
public static yarnwrap.client.gui.widget.Positioner create() { return new yarnwrap.client.gui.widget.Positioner(net.minecraft.client.gui.widget.Positioner.create()); }

}