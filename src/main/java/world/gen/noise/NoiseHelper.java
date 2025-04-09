package yarnwrap.world.gen.noise;
public class NoiseHelper { public net.minecraft.world.gen.noise.NoiseHelper wrapperContained; public NoiseHelper(net.minecraft.world.gen.noise.NoiseHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public void appendDebugInfo(java.lang.StringBuilder builder,double originX,double originY,double originZ,byte permutation) { wrapperContained.appendDebugInfo(builder,originX,originY,originZ,permutation); }
// public void appendDebugInfo(java.lang.StringBuilder builder,double originX,double originY,double originZ,int permutation) { wrapperContained.appendDebugInfo(builder,originX,originY,originZ,permutation); }

}