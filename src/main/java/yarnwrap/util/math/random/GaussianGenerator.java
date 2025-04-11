package yarnwrap.util.math.random;
public class GaussianGenerator { public net.minecraft.util.math.random.GaussianGenerator wrapperContained; public GaussianGenerator(net.minecraft.util.math.random.GaussianGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.random.Random baseRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.baseRandom); }
// public void baseRandom(yarnwrap.util.math.random.Random value) { wrapperContained.baseRandom = value.wrapperContained; }
// public double nextNextGaussian() { return wrapperContained.nextNextGaussian; }
// public void nextNextGaussian(double value) { wrapperContained.nextNextGaussian = value; }
// public boolean hasNextGaussian() { return wrapperContained.hasNextGaussian; }
// public void hasNextGaussian(boolean value) { wrapperContained.hasNextGaussian = value; }
public double next() { return wrapperContained.next(); }
public void reset() { wrapperContained.reset(); }

}