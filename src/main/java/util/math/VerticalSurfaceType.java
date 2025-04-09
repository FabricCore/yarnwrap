package yarnwrap.util.math;
public class VerticalSurfaceType { public net.minecraft.util.math.VerticalSurfaceType wrapperContained; public VerticalSurfaceType(net.minecraft.util.math.VerticalSurfaceType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.Direction direction() { return new yarnwrap.util.math.Direction(wrapperContained.direction); }
// public int offset() { return wrapperContained.offset; }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getDirection()); }
public int getOffset() { return wrapperContained.getOffset(); }

}