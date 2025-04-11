package yarnwrap.util.math.noise;
public class OctaveSimplexNoiseSampler { public net.minecraft.util.math.noise.OctaveSimplexNoiseSampler wrapperContained; public OctaveSimplexNoiseSampler(net.minecraft.util.math.noise.OctaveSimplexNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.noise.SimplexNoiseSampler[] octaveSamplers() { return wrapperContained.octaveSamplers; }
// public void octaveSamplers(net.minecraft.util.math.noise.SimplexNoiseSampler[] value) { wrapperContained.octaveSamplers = value; }
// public double persistence() { return wrapperContained.persistence; }
// public void persistence(double value) { wrapperContained.persistence = value; }
// public double lacunarity() { return wrapperContained.lacunarity; }
// public void lacunarity(double value) { wrapperContained.lacunarity = value; }
public double sample(double x,double y,boolean useOrigin) { return wrapperContained.sample(x,y,useOrigin); }

}