package yarnwrap.util.math.noise;
public class SimplexNoiseSampler { public net.minecraft.util.math.noise.SimplexNoiseSampler wrapperContained; public SimplexNoiseSampler(net.minecraft.util.math.noise.SimplexNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

public double originZ() { return wrapperContained.originZ; }
// public void originZ(double value) { wrapperContained.originZ = value; }
// public static double originZ() { return net.minecraft.util.math.noise.SimplexNoiseSampler.originZ; }
// public static void originZ(double value, ) { net.minecraft.util.math.noise.SimplexNoiseSampler.originZ = value; }

public double originY() { return wrapperContained.originY; }
// public void originY(double value) { wrapperContained.originY = value; }
// public static double originY() { return net.minecraft.util.math.noise.SimplexNoiseSampler.originY; }
// public static void originY(double value, ) { net.minecraft.util.math.noise.SimplexNoiseSampler.originY = value; }

public double originX() { return wrapperContained.originX; }
// public void originX(double value) { wrapperContained.originX = value; }
// public static double originX() { return net.minecraft.util.math.noise.SimplexNoiseSampler.originX; }
// public static void originX(double value, ) { net.minecraft.util.math.noise.SimplexNoiseSampler.originX = value; }

// public double SQRT_3() { return wrapperContained.SQRT_3; }
// public void SQRT_3(double value) { wrapperContained.SQRT_3 = value; }
// public static double SQRT_3() { return net.minecraft.util.math.noise.SimplexNoiseSampler.SQRT_3; }
// public static void SQRT_3(double value, ) { net.minecraft.util.math.noise.SimplexNoiseSampler.SQRT_3 = value; }

// public int[] permutation() { return wrapperContained.permutation; }
// public void permutation(int[] value) { wrapperContained.permutation = value; }
// public static int[] permutation() { return net.minecraft.util.math.noise.SimplexNoiseSampler.permutation; }
// public static void permutation(int[] value, ) { net.minecraft.util.math.noise.SimplexNoiseSampler.permutation = value; }

// public int[][] GRADIENTS() { return wrapperContained.GRADIENTS; }
// public void GRADIENTS(int[][] value) { wrapperContained.GRADIENTS = value; }
// public static int[][] GRADIENTS() { return net.minecraft.util.math.noise.SimplexNoiseSampler.GRADIENTS; }
// public static void GRADIENTS(int[][] value, ) { net.minecraft.util.math.noise.SimplexNoiseSampler.GRADIENTS = value; }

// public double UNSKEW_FACTOR_2D() { return wrapperContained.UNSKEW_FACTOR_2D; }
// public void UNSKEW_FACTOR_2D(double value) { wrapperContained.UNSKEW_FACTOR_2D = value; }
// public static double UNSKEW_FACTOR_2D() { return net.minecraft.util.math.noise.SimplexNoiseSampler.UNSKEW_FACTOR_2D; }
// public static void UNSKEW_FACTOR_2D(double value, ) { net.minecraft.util.math.noise.SimplexNoiseSampler.UNSKEW_FACTOR_2D = value; }

// public double SKEW_FACTOR_2D() { return wrapperContained.SKEW_FACTOR_2D; }
// public void SKEW_FACTOR_2D(double value) { wrapperContained.SKEW_FACTOR_2D = value; }
// public static double SKEW_FACTOR_2D() { return net.minecraft.util.math.noise.SimplexNoiseSampler.SKEW_FACTOR_2D; }
// public static void SKEW_FACTOR_2D(double value, ) { net.minecraft.util.math.noise.SimplexNoiseSampler.SKEW_FACTOR_2D = value; }

public SimplexNoiseSampler(yarnwrap.util.math.random.Random random) { this.wrapperContained = new net.minecraft.util.math.noise.SimplexNoiseSampler(random.wrapperContained); }
// public double dot(int gradient,double x,double y,double z) { return wrapperContained.dot(gradient,x,y,z); }
// public static double dot(int gradient,double x,double y,double z, ) { return net.minecraft.util.math.noise.SimplexNoiseSampler.dot(gradient,x,y,z); }
public double sample(double x,double y) { return wrapperContained.sample(x,y); }
// public static double sample(double x,double y, ) { return net.minecraft.util.math.noise.SimplexNoiseSampler.sample(x,y); }
// public double grad(int hash,double x,double y,double z,double distance) { return wrapperContained.grad(hash,x,y,z,distance); }
// public static double grad(int hash,double x,double y,double z,double distance, ) { return net.minecraft.util.math.noise.SimplexNoiseSampler.grad(hash,x,y,z,distance); }
// public int map(int input) { return wrapperContained.map(input); }
// public static int map(int input, ) { return net.minecraft.util.math.noise.SimplexNoiseSampler.map(input); }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }
// public static double sample(double x,double y,double z, ) { return net.minecraft.util.math.noise.SimplexNoiseSampler.sample(x,y,z); }

}