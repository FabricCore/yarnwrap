package yarnwrap.util.math;
public class VerticalSurfaceType { public net.minecraft.util.math.VerticalSurfaceType wrapperContained; public VerticalSurfaceType(net.minecraft.util.math.VerticalSurfaceType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.Direction direction() { return new yarnwrap.util.math.Direction(wrapperContained.direction); }
// public void direction(yarnwrap.util.math.Direction value) { wrapperContained.direction = value.wrapperContained; }
// public int offset() { return wrapperContained.offset; }
// public void offset(int value) { wrapperContained.offset = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getDirection()); }
public int getOffset() { return wrapperContained.getOffset(); }

}