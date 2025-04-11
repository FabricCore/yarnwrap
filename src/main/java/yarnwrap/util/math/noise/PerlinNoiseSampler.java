package yarnwrap.util.math.noise;
public class PerlinNoiseSampler { public net.minecraft.util.math.noise.PerlinNoiseSampler wrapperContained; public PerlinNoiseSampler(net.minecraft.util.math.noise.PerlinNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

public double originZ() { return wrapperContained.originZ; }
// public void originZ(double value) { wrapperContained.originZ = value; }
public double originY() { return wrapperContained.originY; }
// public void originY(double value) { wrapperContained.originY = value; }
// public byte[] permutation() { return wrapperContained.permutation; }
// public void permutation(byte[] value) { wrapperContained.permutation = value; }
public double originX() { return wrapperContained.originX; }
// public void originX(double value) { wrapperContained.originX = value; }
public PerlinNoiseSampler(yarnwrap.util.math.random.Random random) { this.wrapperContained = new net.minecraft.util.math.noise.PerlinNoiseSampler(random.wrapperContained); }
public double sample(double x,double y,double z,double yScale,double yMax) { return wrapperContained.sample(x,y,z,yScale,yMax); }
// public double grad(int hash,double x,double y,double z) { return wrapperContained.grad(hash,x,y,z); }
// public int map(int input) { return wrapperContained.map(input); }
// public double sample(int sectionX,int sectionY,int sectionZ,double localX,double localY,double localZ,double fadeLocalY) { return wrapperContained.sample(sectionX,sectionY,sectionZ,localX,localY,localZ,fadeLocalY); }
public double sample(double x,double y,double z) { return wrapperContained.sample(x,y,z); }
// public double sampleDerivative(double x,double y,double z) { return wrapperContained.sampleDerivative(x,y,z); }
// public double sampleDerivative(int sectionX,int sectionY,int sectionZ,double localX,double localY,double localZ) { return wrapperContained.sampleDerivative(sectionX,sectionY,sectionZ,localX,localY,localZ); }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }

}