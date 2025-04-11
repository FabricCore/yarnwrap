package yarnwrap.util.math;
public class GravityField { public net.minecraft.util.math.GravityField wrapperContained; public GravityField(net.minecraft.util.math.GravityField wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List points() { return wrapperContained.points; }
// public void points(java.util.List value) { wrapperContained.points = value; }
public void addPoint(yarnwrap.util.math.BlockPos pos,double mass) { wrapperContained.addPoint(pos.wrapperContained,mass); }
public double calculate(yarnwrap.util.math.BlockPos pos,double mass) { return wrapperContained.calculate(pos.wrapperContained,mass); }

}