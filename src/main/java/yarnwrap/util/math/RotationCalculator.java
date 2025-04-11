package yarnwrap.util.math;
public class RotationCalculator { public net.minecraft.util.math.RotationCalculator wrapperContained; public RotationCalculator(net.minecraft.util.math.RotationCalculator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public int precision() { return wrapperContained.precision; }
// public void precision(int value) { wrapperContained.precision = value; }
// public float rotationPerDegrees() { return wrapperContained.rotationPerDegrees; }
// public void rotationPerDegrees(float value) { wrapperContained.rotationPerDegrees = value; }
// public float degreesPerRotation() { return wrapperContained.degreesPerRotation; }
// public void degreesPerRotation(float value) { wrapperContained.degreesPerRotation = value; }
public RotationCalculator(int precision) { this.wrapperContained = new net.minecraft.util.math.RotationCalculator(precision); }
public int getMax() { return wrapperContained.getMax(); }
public int toRotation(float degrees) { return wrapperContained.toRotation(degrees); }
public float toDegrees(int rotation) { return wrapperContained.toDegrees(rotation); }
public boolean areRotationsParallel(int alpha,int beta) { return wrapperContained.areRotationsParallel(alpha,beta); }
public int toRotation(yarnwrap.util.math.Direction direction) { return wrapperContained.toRotation(direction.wrapperContained); }
public int toClampedRotation(float degrees) { return wrapperContained.toClampedRotation(degrees); }
public float toWrappedDegrees(int rotation) { return wrapperContained.toWrappedDegrees(rotation); }
public int clamp(int rotationBits) { return wrapperContained.clamp(rotationBits); }

}