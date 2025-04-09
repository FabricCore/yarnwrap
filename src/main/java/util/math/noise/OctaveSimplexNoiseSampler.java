package yarnwrap.util.math.noise;
public class OctaveSimplexNoiseSampler { public net.minecraft.util.math.noise.OctaveSimplexNoiseSampler wrapperContained; public OctaveSimplexNoiseSampler(net.minecraft.util.math.noise.OctaveSimplexNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.noise.SimplexNoiseSampler[] octaveSamplers() { return wrapperContained.octaveSamplers; }
// public double persistence() { return wrapperContained.persistence; }
// public double lacunarity() { return wrapperContained.lacunarity; }
public double sample(double x,double y,boolean useOrigin) { return wrapperContained.sample(x,y,useOrigin); }

}