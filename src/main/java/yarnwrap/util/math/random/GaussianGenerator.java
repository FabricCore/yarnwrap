package yarnwrap.util.math.random;
public class GaussianGenerator { public net.minecraft.util.math.random.GaussianGenerator wrapperContained; public GaussianGenerator(net.minecraft.util.math.random.GaussianGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.random.Random baseRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.baseRandom); }
// public void baseRandom(yarnwrap.util.math.random.Random value) { wrapperContained.baseRandom = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random baseRandom() { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.GaussianGenerator.baseRandom); }
// public static void baseRandom(yarnwrap.util.math.random.Random value, ) { net.minecraft.util.math.random.GaussianGenerator.baseRandom = value.wrapperContained; }

// public double nextNextGaussian() { return wrapperContained.nextNextGaussian; }
// public void nextNextGaussian(double value) { wrapperContained.nextNextGaussian = value; }
// public static double nextNextGaussian() { return net.minecraft.util.math.random.GaussianGenerator.nextNextGaussian; }
// public static void nextNextGaussian(double value, ) { net.minecraft.util.math.random.GaussianGenerator.nextNextGaussian = value; }

// public boolean hasNextGaussian() { return wrapperContained.hasNextGaussian; }
// public void hasNextGaussian(boolean value) { wrapperContained.hasNextGaussian = value; }
// public static boolean hasNextGaussian() { return net.minecraft.util.math.random.GaussianGenerator.hasNextGaussian; }
// public static void hasNextGaussian(boolean value, ) { net.minecraft.util.math.random.GaussianGenerator.hasNextGaussian = value; }

public GaussianGenerator(yarnwrap.util.math.random.Random baseRandom) { this.wrapperContained = new net.minecraft.util.math.random.GaussianGenerator(baseRandom.wrapperContained); }
public double next() { return wrapperContained.next(); }
// public static double next() { return net.minecraft.util.math.random.GaussianGenerator.next(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.util.math.random.GaussianGenerator.reset(); }

}