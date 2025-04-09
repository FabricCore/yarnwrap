package yarnwrap.util.math.noise;
public class SimplexNoiseSampler { public net.minecraft.util.math.noise.SimplexNoiseSampler wrapperContained; public SimplexNoiseSampler(net.minecraft.util.math.noise.SimplexNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

public double originZ() { return wrapperContained.originZ; }
public double originY() { return wrapperContained.originY; }
public double originX() { return wrapperContained.originX; }
// public double SQRT_3() { return wrapperContained.SQRT_3; }
// public int[] permutation() { return wrapperContained.permutation; }
// public int[][] GRADIENTS() { return wrapperContained.GRADIENTS; }
// public double UNSKEW_FACTOR_2D() { return wrapperContained.UNSKEW_FACTOR_2D; }
// public double SKEW_FACTOR_2D() { return wrapperContained.SKEW_FACTOR_2D; }
// public double dot(int gradient,double x,double y,double z) { return wrapperContained.dot(gradient,x,y,z); }
public double sample(double x,double y) { return wrapperContained.sample(x,y); }
// public double grad(int hash,double x,double y,double z,double distance) { return wrapperContained.grad(hash,x,y,z,distance); }
// public int map(int input) { return wrapperContained.map(input); }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }

}