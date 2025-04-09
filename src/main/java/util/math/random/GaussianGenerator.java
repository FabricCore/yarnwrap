package yarnwrap.util.math.random;
public class GaussianGenerator { public net.minecraft.util.math.random.GaussianGenerator wrapperContained; public GaussianGenerator(net.minecraft.util.math.random.GaussianGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.random.Random baseRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.baseRandom); }
// public double nextNextGaussian() { return wrapperContained.nextNextGaussian; }
// public boolean hasNextGaussian() { return wrapperContained.hasNextGaussian; }
public double next() { return wrapperContained.next(); }
public void reset() { wrapperContained.reset(); }

}