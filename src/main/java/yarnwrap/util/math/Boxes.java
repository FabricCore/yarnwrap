package yarnwrap.util.math;
public class Boxes { public net.minecraft.util.math.Boxes wrapperContained; public Boxes(net.minecraft.util.math.Boxes wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Box stretch(yarnwrap.util.math.Box box,yarnwrap.util.math.Direction direction,double length) { return new yarnwrap.util.math.Box(wrapperContained.stretch(box.wrapperContained,direction.wrapperContained,length)); }
// public static yarnwrap.util.math.Box stretch(yarnwrap.util.math.Box box,yarnwrap.util.math.Direction direction,double length, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Boxes.stretch(box.wrapperContained,direction.wrapperContained,length)); }

}