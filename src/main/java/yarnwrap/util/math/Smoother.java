package yarnwrap.util.math;
public class Smoother { public net.minecraft.util.math.Smoother wrapperContained; public Smoother(net.minecraft.util.math.Smoother wrapperContained) { this.wrapperContained = wrapperContained; }

// public double movementLatency() { return wrapperContained.movementLatency; }
// public void movementLatency(double value) { wrapperContained.movementLatency = value; }
// public static double movementLatency() { return net.minecraft.util.math.Smoother.movementLatency; }
// public static void movementLatency(double value, ) { net.minecraft.util.math.Smoother.movementLatency = value; }

// public double smoothedSum() { return wrapperContained.smoothedSum; }
// public void smoothedSum(double value) { wrapperContained.smoothedSum = value; }
// public static double smoothedSum() { return net.minecraft.util.math.Smoother.smoothedSum; }
// public static void smoothedSum(double value, ) { net.minecraft.util.math.Smoother.smoothedSum = value; }

// public double actualSum() { return wrapperContained.actualSum; }
// public void actualSum(double value) { wrapperContained.actualSum = value; }
// public static double actualSum() { return net.minecraft.util.math.Smoother.actualSum; }
// public static void actualSum(double value, ) { net.minecraft.util.math.Smoother.actualSum = value; }

public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.util.math.Smoother.clear(); }
public double smooth(double original,double smoother) { return wrapperContained.smooth(original,smoother); }
// public static double smooth(double original,double smoother, ) { return net.minecraft.util.math.Smoother.smooth(original,smoother); }

}