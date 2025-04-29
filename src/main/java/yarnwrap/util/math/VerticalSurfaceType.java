package yarnwrap.util.math;
public class VerticalSurfaceType { public net.minecraft.util.math.VerticalSurfaceType wrapperContained; public VerticalSurfaceType(net.minecraft.util.math.VerticalSurfaceType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.math.VerticalSurfaceType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.VerticalSurfaceType.CODEC = value; }

// public yarnwrap.util.math.Direction direction() { return new yarnwrap.util.math.Direction(wrapperContained.direction); }
// public void direction(yarnwrap.util.math.Direction value) { wrapperContained.direction = value.wrapperContained; }
// public static yarnwrap.util.math.Direction direction() { return new yarnwrap.util.math.Direction(net.minecraft.util.math.VerticalSurfaceType.direction); }
// public static void direction(yarnwrap.util.math.Direction value, ) { net.minecraft.util.math.VerticalSurfaceType.direction = value.wrapperContained; }

// public int offset() { return wrapperContained.offset; }
// public void offset(int value) { wrapperContained.offset = value; }
// public static int offset() { return net.minecraft.util.math.VerticalSurfaceType.offset; }
// public static void offset(int value, ) { net.minecraft.util.math.VerticalSurfaceType.offset = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.math.VerticalSurfaceType.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.math.VerticalSurfaceType.name = value; }

// // public VerticalSurfaceType(java.lang.String direction,int offset,yarnwrap.util.math.Direction name) { this.wrapperContained = new net.minecraft.util.math.VerticalSurfaceType(direction,offset,name.wrapperContained); }
public yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getDirection()); }
// public static yarnwrap.util.math.Direction getDirection() { return new yarnwrap.util.math.Direction(net.minecraft.util.math.VerticalSurfaceType.getDirection()); }
public int getOffset() { return wrapperContained.getOffset(); }
// public static int getOffset() { return net.minecraft.util.math.VerticalSurfaceType.getOffset(); }

}