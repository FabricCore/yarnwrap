package yarnwrap.util.math;
public class Position { public net.minecraft.util.math.Position wrapperContained; public Position(net.minecraft.util.math.Position wrapperContained) { this.wrapperContained = wrapperContained; }

public double getY() { return wrapperContained.getY(); }
public double getZ() { return wrapperContained.getZ(); }
public double getX() { return wrapperContained.getX(); }

}