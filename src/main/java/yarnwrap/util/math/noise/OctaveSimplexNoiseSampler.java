package yarnwrap.util.math.noise;
public class OctaveSimplexNoiseSampler { public net.minecraft.util.math.noise.OctaveSimplexNoiseSampler wrapperContained; public OctaveSimplexNoiseSampler(net.minecraft.util.math.noise.OctaveSimplexNoiseSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.noise.SimplexNoiseSampler[] octaveSamplers() { return wrapperContained.octaveSamplers; }
// public void octaveSamplers(net.minecraft.util.math.noise.SimplexNoiseSampler[] value) { wrapperContained.octaveSamplers = value; }
// public static net.minecraft.util.math.noise.SimplexNoiseSampler[] octaveSamplers() { return net.minecraft.util.math.noise.OctaveSimplexNoiseSampler.octaveSamplers; }
// public static void octaveSamplers(net.minecraft.util.math.noise.SimplexNoiseSampler[] value, ) { net.minecraft.util.math.noise.OctaveSimplexNoiseSampler.octaveSamplers = value; }

// public double persistence() { return wrapperContained.persistence; }
// public void persistence(double value) { wrapperContained.persistence = value; }
// public static double persistence() { return net.minecraft.util.math.noise.OctaveSimplexNoiseSampler.persistence; }
// public static void persistence(double value, ) { net.minecraft.util.math.noise.OctaveSimplexNoiseSampler.persistence = value; }

// public double lacunarity() { return wrapperContained.lacunarity; }
// public void lacunarity(double value) { wrapperContained.lacunarity = value; }
// public static double lacunarity() { return net.minecraft.util.math.noise.OctaveSimplexNoiseSampler.lacunarity; }
// public static void lacunarity(double value, ) { net.minecraft.util.math.noise.OctaveSimplexNoiseSampler.lacunarity = value; }

// public OctaveSimplexNoiseSampler(yarnwrap.util.math.random.Random random,it.unimi.dsi.fastutil.ints.IntSortedSet octaves) { this.wrapperContained = new net.minecraft.util.math.noise.OctaveSimplexNoiseSampler(random.wrapperContained,octaves); }
public OctaveSimplexNoiseSampler(yarnwrap.util.math.random.Random random,java.util.List octaves) { this.wrapperContained = new net.minecraft.util.math.noise.OctaveSimplexNoiseSampler(random.wrapperContained,octaves); }
public double sample(double x,double y,boolean useOrigin) { return wrapperContained.sample(x,y,useOrigin); }
// public static double sample(double x,double y,boolean useOrigin, ) { return net.minecraft.util.math.noise.OctaveSimplexNoiseSampler.sample(x,y,useOrigin); }

}