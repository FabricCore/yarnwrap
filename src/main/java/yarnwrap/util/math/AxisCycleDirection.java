package yarnwrap.util.math;
public class AxisCycleDirection { public net.minecraft.util.math.AxisCycleDirection wrapperContained; public AxisCycleDirection(net.minecraft.util.math.AxisCycleDirection wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.AxisCycleDirection[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.util.math.AxisCycleDirection[] value) { wrapperContained.VALUES = value; }
public static net.minecraft.util.math.AxisCycleDirection[] VALUES() { return net.minecraft.util.math.AxisCycleDirection.VALUES; }
// public static void VALUES(net.minecraft.util.math.AxisCycleDirection[] value, ) { net.minecraft.util.math.AxisCycleDirection.VALUES = value; }

// public Object AXES() { return wrapperContained.AXES; }
// // public void AXES(Object value) { wrapperContained.AXES = value; }
// public static Object AXES() { return net.minecraft.util.math.AxisCycleDirection.AXES; }
// // public static void AXES(Object value, ) { net.minecraft.util.math.AxisCycleDirection.AXES = value; }

public yarnwrap.util.math.AxisCycleDirection opposite() { return new yarnwrap.util.math.AxisCycleDirection(wrapperContained.opposite()); }
// public static yarnwrap.util.math.AxisCycleDirection opposite() { return new yarnwrap.util.math.AxisCycleDirection(net.minecraft.util.math.AxisCycleDirection.opposite()); }
// public int choose(int x,int y,int z,Object axis) { return wrapperContained.choose(x,y,z,axis); }
// public static int choose(int x,int y,int z,Object axis, ) { return net.minecraft.util.math.AxisCycleDirection.choose(x,y,z,axis); }
// public yarnwrap.util.math.AxisCycleDirection between(Object from,Object to) { return new yarnwrap.util.math.AxisCycleDirection(wrapperContained.between(from,to)); }
// public static yarnwrap.util.math.AxisCycleDirection between(Object from,Object to, ) { return new yarnwrap.util.math.AxisCycleDirection(net.minecraft.util.math.AxisCycleDirection.between(from,to)); }
// public Object cycle(Object axis) { return wrapperContained.cycle(axis); }
// public static Object cycle(Object axis, ) { return net.minecraft.util.math.AxisCycleDirection.cycle(axis); }
// public double choose(double x,double y,double z,Object axis) { return wrapperContained.choose(x,y,z,axis); }
// public static double choose(double x,double y,double z,Object axis, ) { return net.minecraft.util.math.AxisCycleDirection.choose(x,y,z,axis); }

}