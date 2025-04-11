package yarnwrap.util.math.noise;
public class SimplexNoiseSampler { public net.minecraft.util.math.noise.SimplexNoiseSampler wrapperContained; public SimplexNoiseSampler(net.minecraft.util.math.noise.SimplexNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

public double originZ() { return wrapperContained.originZ; }
// public void originZ(double value) { wrapperContained.originZ = value; }
public double originY() { return wrapperContained.originY; }
// public void originY(double value) { wrapperContained.originY = value; }
public double originX() { return wrapperContained.originX; }
// public void originX(double value) { wrapperContained.originX = value; }
// public double SQRT_3() { return wrapperContained.SQRT_3; }
// public void SQRT_3(double value) { wrapperContained.SQRT_3 = value; }
// public int[] permutation() { return wrapperContained.permutation; }
// public void permutation(int[] value) { wrapperContained.permutation = value; }
// public int[][] GRADIENTS() { return wrapperContained.GRADIENTS; }
// public void GRADIENTS(int[][] value) { wrapperContained.GRADIENTS = value; }
// public double UNSKEW_FACTOR_2D() { return wrapperContained.UNSKEW_FACTOR_2D; }
// public void UNSKEW_FACTOR_2D(double value) { wrapperContained.UNSKEW_FACTOR_2D = value; }
// public double SKEW_FACTOR_2D() { return wrapperContained.SKEW_FACTOR_2D; }
// public void SKEW_FACTOR_2D(double value) { wrapperContained.SKEW_FACTOR_2D = value; }
public SimplexNoiseSampler(yarnwrap.util.math.random.Random random) { this.wrapperContained = new net.minecraft.util.math.noise.SimplexNoiseSampler(random.wrapperContained); }
// public double dot(int gradient,double x,double y,double z) { return wrapperContained.dot(gradient,x,y,z); }
public double sample(double x,double y) { return wrapperContained.sample(x,y); }
// public double grad(int hash,double x,double y,double z,double distance) { return wrapperContained.grad(hash,x,y,z,distance); }
// public int map(int input) { return wrapperContained.map(input); }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }

}