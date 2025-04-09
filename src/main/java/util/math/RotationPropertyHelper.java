package yarnwrap.util.math;
public class RotationPropertyHelper { public net.minecraft.util.math.RotationPropertyHelper wrapperContained; public RotationPropertyHelper(net.minecraft.util.math.RotationPropertyHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX() { return wrapperContained.MAX; }
// public int NORTH() { return wrapperContained.NORTH; }
// public int EAST() { return wrapperContained.EAST; }
// public int SOUTH() { return wrapperContained.SOUTH; }
// public int WEST() { return wrapperContained.WEST; }
// public yarnwrap.util.math.RotationCalculator CALCULATOR() { return new yarnwrap.util.math.RotationCalculator(wrapperContained.CALCULATOR); }
public int getMax() { return wrapperContained.getMax(); }
public int fromYaw(float yaw) { return wrapperContained.fromYaw(yaw); }
public java.util.Optional toDirection(int rotation) { return wrapperContained.toDirection(rotation); }
public int fromDirection(yarnwrap.util.math.Direction direction) { return wrapperContained.fromDirection(direction.wrapperContained); }
public float toDegrees(int rotation) { return wrapperContained.toDegrees(rotation); }

}