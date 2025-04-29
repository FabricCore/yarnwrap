package yarnwrap.util.math;
public class Position { public net.minecraft.util.math.Position wrapperContained; public Position(net.minecraft.util.math.Position wrapperContained) { this.wrapperContained = wrapperContained; }

public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.util.math.Position.getY(); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.util.math.Position.getZ(); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.util.math.Position.getX(); }

}