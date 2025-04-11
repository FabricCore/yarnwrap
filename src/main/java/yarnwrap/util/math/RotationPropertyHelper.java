package yarnwrap.util.math;
public class RotationPropertyHelper { public net.minecraft.util.math.RotationPropertyHelper wrapperContained; public RotationPropertyHelper(net.minecraft.util.math.RotationPropertyHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX() { return wrapperContained.MAX; }
// public void MAX(int value) { wrapperContained.MAX = value; }
// public int NORTH() { return wrapperContained.NORTH; }
// public void NORTH(int value) { wrapperContained.NORTH = value; }
// public int EAST() { return wrapperContained.EAST; }
// public void EAST(int value) { wrapperContained.EAST = value; }
// public int SOUTH() { return wrapperContained.SOUTH; }
// public void SOUTH(int value) { wrapperContained.SOUTH = value; }
// public int WEST() { return wrapperContained.WEST; }
// public void WEST(int value) { wrapperContained.WEST = value; }
// public yarnwrap.util.math.RotationCalculator CALCULATOR() { return new yarnwrap.util.math.RotationCalculator(wrapperContained.CALCULATOR); }
// public void CALCULATOR(yarnwrap.util.math.RotationCalculator value) { wrapperContained.CALCULATOR = value.wrapperContained; }
public int getMax() { return wrapperContained.getMax(); }
public int fromYaw(float yaw) { return wrapperContained.fromYaw(yaw); }
public java.util.Optional toDirection(int rotation) { return wrapperContained.toDirection(rotation); }
public int fromDirection(yarnwrap.util.math.Direction direction) { return wrapperContained.fromDirection(direction.wrapperContained); }
public float toDegrees(int rotation) { return wrapperContained.toDegrees(rotation); }

}