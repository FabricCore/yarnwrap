package yarnwrap.util.math.noise;
public class OctaveSimplexNoiseSampler { public net.minecraft.util.math.noise.OctaveSimplexNoiseSampler wrapperContained; public OctaveSimplexNoiseSampler(net.minecraft.util.math.noise.OctaveSimplexNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.noise.SimplexNoiseSampler[] octaveSamplers() { return wrapperContained.octaveSamplers; }
// public void octaveSamplers(net.minecraft.util.math.noise.SimplexNoiseSampler[] value) { wrapperContained.octaveSamplers = value; }
// public double persistence() { return wrapperContained.persistence; }
// public void persistence(double value) { wrapperContained.persistence = value; }
// public double lacunarity() { return wrapperContained.lacunarity; }
// public void lacunarity(double value) { wrapperContained.lacunarity = value; }
// public OctaveSimplexNoiseSampler(yarnwrap.util.math.random.Random random,it.unimi.dsi.fastutil.ints.IntSortedSet octaves) { this.wrapperContained = new net.minecraft.util.math.noise.OctaveSimplexNoiseSampler(random.wrapperContained,octaves); }
public OctaveSimplexNoiseSampler(yarnwrap.util.math.random.Random random,java.util.List octaves) { this.wrapperContained = new net.minecraft.util.math.noise.OctaveSimplexNoiseSampler(random.wrapperContained,octaves); }
public double sample(double x,double y,boolean useOrigin) { return wrapperContained.sample(x,y,useOrigin); }

}