package yarnwrap.util;
public class CubicSampler { public net.minecraft.util.CubicSampler wrapperContained; public CubicSampler(net.minecraft.util.CubicSampler wrapperContained) { this.wrapperContained = wrapperContained; }

// public double[] DENSITY_CURVE() { return wrapperContained.DENSITY_CURVE; }
// public int FIRST_SEGMENT_OFFSET() { return wrapperContained.FIRST_SEGMENT_OFFSET; }
// public int NUM_SEGMENTS() { return wrapperContained.NUM_SEGMENTS; }
// public yarnwrap.util.math.Vec3d sampleColor(yarnwrap.util.math.Vec3d pos,Object rgbFetcher) { return new yarnwrap.util.math.Vec3d(wrapperContained.sampleColor(pos.wrapperContained,rgbFetcher)); }

}