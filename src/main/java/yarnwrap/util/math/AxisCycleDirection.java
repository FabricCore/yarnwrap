package yarnwrap.util.math;
public class AxisCycleDirection { public net.minecraft.util.math.AxisCycleDirection wrapperContained; public AxisCycleDirection(net.minecraft.util.math.AxisCycleDirection wrapperContained) { this.wrapperContained = wrapperContained; }

public net.minecraft.util.math.AxisCycleDirection[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.util.math.AxisCycleDirection[] value) { wrapperContained.VALUES = value; }
public Object AXES() { return wrapperContained.AXES; }
// // public void AXES(Object value) { wrapperContained.AXES = value; }
public yarnwrap.util.math.AxisCycleDirection opposite() { return new yarnwrap.util.math.AxisCycleDirection(wrapperContained.opposite()); }
// public int choose(int x,int y,int z,Object axis) { return wrapperContained.choose(x,y,z,axis); }
// public yarnwrap.util.math.AxisCycleDirection between(Object from,Object to) { return new yarnwrap.util.math.AxisCycleDirection(wrapperContained.between(from,to)); }
// public Object cycle(Object axis) { return wrapperContained.cycle(axis); }
// public double choose(double x,double y,double z,Object axis) { return wrapperContained.choose(x,y,z,axis); }

}