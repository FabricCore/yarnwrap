package yarnwrap.util.math;
public class EightWayDirection { public net.minecraft.util.math.EightWayDirection wrapperContained; public EightWayDirection(net.minecraft.util.math.EightWayDirection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set directions() { return wrapperContained.directions; }
// public void directions(java.util.Set value) { wrapperContained.directions = value; }
// public static java.util.Set directions() { return net.minecraft.util.math.EightWayDirection.directions; }
// public static void directions(java.util.Set value, ) { net.minecraft.util.math.EightWayDirection.directions = value; }

// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.Vec3i value) { wrapperContained.offset = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.EightWayDirection.offset); }
// public static void offset(yarnwrap.util.math.Vec3i value, ) { net.minecraft.util.math.EightWayDirection.offset = value.wrapperContained; }

// public EightWayDirection(java.lang.String directions) { this.wrapperContained = new net.minecraft.util.math.EightWayDirection(directions); }
public java.util.Set getDirections() { return wrapperContained.getDirections(); }
// public static java.util.Set getDirections() { return net.minecraft.util.math.EightWayDirection.getDirections(); }
public int getOffsetX() { return wrapperContained.getOffsetX(); }
// public static int getOffsetX() { return net.minecraft.util.math.EightWayDirection.getOffsetX(); }
public int getOffsetZ() { return wrapperContained.getOffsetZ(); }
// public static int getOffsetZ() { return net.minecraft.util.math.EightWayDirection.getOffsetZ(); }

}