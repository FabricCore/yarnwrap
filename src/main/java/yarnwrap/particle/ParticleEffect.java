package yarnwrap.particle;
public class ParticleEffect { public net.minecraft.particle.ParticleEffect wrapperContained; public ParticleEffect(net.minecraft.particle.ParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.particle.ParticleType getType() { return new yarnwrap.particle.ParticleType(wrapperContained.getType()); }

}