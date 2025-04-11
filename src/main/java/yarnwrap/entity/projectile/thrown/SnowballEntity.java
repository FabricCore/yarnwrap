package yarnwrap.entity.projectile.thrown;
public class SnowballEntity { public net.minecraft.entity.projectile.thrown.SnowballEntity wrapperContained; public SnowballEntity(net.minecraft.entity.projectile.thrown.SnowballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.ParticleEffect getParticleParameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticleParameters()); }

}