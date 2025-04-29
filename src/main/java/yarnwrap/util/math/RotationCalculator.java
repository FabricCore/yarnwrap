package yarnwrap.util.math;
public class RotationCalculator { public net.minecraft.util.math.RotationCalculator wrapperContained; public RotationCalculator(net.minecraft.util.math.RotationCalculator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int max() { return wrapperContained.max; }
// public void max(int value) { wrapperContained.max = value; }
// public static int max() { return net.minecraft.util.math.RotationCalculator.max; }
// public static void max(int value, ) { net.minecraft.util.math.RotationCalculator.max = value; }

// public int precision() { return wrapperContained.precision; }
// public void precision(int value) { wrapperContained.precision = value; }
// public static int precision() { return net.minecraft.util.math.RotationCalculator.precision; }
// public static void precision(int value, ) { net.minecraft.util.math.RotationCalculator.precision = value; }

// public float rotationPerDegrees() { return wrapperContained.rotationPerDegrees; }
// public void rotationPerDegrees(float value) { wrapperContained.rotationPerDegrees = value; }
// public static float rotationPerDegrees() { return net.minecraft.util.math.RotationCalculator.rotationPerDegrees; }
// public static void rotationPerDegrees(float value, ) { net.minecraft.util.math.RotationCalculator.rotationPerDegrees = value; }

// public float degreesPerRotation() { return wrapperContained.degreesPerRotation; }
// public void degreesPerRotation(float value) { wrapperContained.degreesPerRotation = value; }
// public static float degreesPerRotation() { return net.minecraft.util.math.RotationCalculator.degreesPerRotation; }
// public static void degreesPerRotation(float value, ) { net.minecraft.util.math.RotationCalculator.degreesPerRotation = value; }

public RotationCalculator(int precision) { this.wrapperContained = new net.minecraft.util.math.RotationCalculator(precision); }
public int getMax() { return wrapperContained.getMax(); }
// public static int getMax() { return net.minecraft.util.math.RotationCalculator.getMax(); }
public int toRotation(float degrees) { return wrapperContained.toRotation(degrees); }
// public static int toRotation(float degrees, ) { return net.minecraft.util.math.RotationCalculator.toRotation(degrees); }
public float toDegrees(int rotation) { return wrapperContained.toDegrees(rotation); }
// public static float toDegrees(int rotation, ) { return net.minecraft.util.math.RotationCalculator.toDegrees(rotation); }
public boolean areRotationsParallel(int alpha,int beta) { return wrapperContained.areRotationsParallel(alpha,beta); }
// public static boolean areRotationsParallel(int alpha,int beta, ) { return net.minecraft.util.math.RotationCalculator.areRotationsParallel(alpha,beta); }
public int toRotation(yarnwrap.util.math.Direction direction) { return wrapperContained.toRotation(direction.wrapperContained); }
// public static int toRotation(yarnwrap.util.math.Direction direction, ) { return net.minecraft.util.math.RotationCalculator.toRotation(direction.wrapperContained); }
public int toClampedRotation(float degrees) { return wrapperContained.toClampedRotation(degrees); }
// public static int toClampedRotation(float degrees, ) { return net.minecraft.util.math.RotationCalculator.toClampedRotation(degrees); }
public float toWrappedDegrees(int rotation) { return wrapperContained.toWrappedDegrees(rotation); }
// public static float toWrappedDegrees(int rotation, ) { return net.minecraft.util.math.RotationCalculator.toWrappedDegrees(rotation); }
public int clamp(int rotationBits) { return wrapperContained.clamp(rotationBits); }
// public static int clamp(int rotationBits, ) { return net.minecraft.util.math.RotationCalculator.clamp(rotationBits); }

}