package yarnwrap.util.math;
public class EightWayDirection { public net.minecraft.util.math.EightWayDirection wrapperContained; public EightWayDirection(net.minecraft.util.math.EightWayDirection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set directions() { return wrapperContained.directions; }
// public void directions(java.util.Set value) { wrapperContained.directions = value; }
// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.Vec3i value) { wrapperContained.offset = value.wrapperContained; }
public java.util.Set getDirections() { return wrapperContained.getDirections(); }
public int getOffsetX() { return wrapperContained.getOffsetX(); }
public int getOffsetZ() { return wrapperContained.getOffsetZ(); }

}