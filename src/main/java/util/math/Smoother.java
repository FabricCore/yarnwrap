package yarnwrap.util.math;
public class Smoother { public net.minecraft.util.math.Smoother wrapperContained; public Smoother(net.minecraft.util.math.Smoother wrapperContained) { this.wrapperContained = wrapperContained; }

// public double movementLatency() { return wrapperContained.movementLatency; }
// public double smoothedSum() { return wrapperContained.smoothedSum; }
// public double actualSum() { return wrapperContained.actualSum; }
public void clear() { wrapperContained.clear(); }
public double smooth(double original,double smoother) { return wrapperContained.smooth(original,smoother); }

}