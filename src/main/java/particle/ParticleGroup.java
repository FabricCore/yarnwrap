package yarnwrap.particle;
public class ParticleGroup { public net.minecraft.particle.ParticleGroup wrapperContained; public ParticleGroup(net.minecraft.particle.ParticleGroup wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.particle.ParticleGroup SPORE_BLOSSOM_AIR() { return new yarnwrap.particle.ParticleGroup(wrapperContained.SPORE_BLOSSOM_AIR); }
// public int maxCount() { return wrapperContained.maxCount; }
public int getMaxCount() { return wrapperContained.getMaxCount(); }

}