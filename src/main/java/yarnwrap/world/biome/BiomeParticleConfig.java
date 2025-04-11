package yarnwrap.world.biome;
public class BiomeParticleConfig { public net.minecraft.world.biome.BiomeParticleConfig wrapperContained; public BiomeParticleConfig(net.minecraft.world.biome.BiomeParticleConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.particle.ParticleEffect particle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.particle); }
// public void particle(yarnwrap.particle.ParticleEffect value) { wrapperContained.particle = value.wrapperContained; }
public BiomeParticleConfig(yarnwrap.particle.ParticleEffect particle,float probability) { this.wrapperContained = new net.minecraft.world.biome.BiomeParticleConfig(particle.wrapperContained,probability); }
public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
public boolean shouldAddParticle(yarnwrap.util.math.random.Random random) { return wrapperContained.shouldAddParticle(random.wrapperContained); }
// public java.lang.Float method_28398(yarnwrap.world.biome.BiomeParticleConfig config) { return wrapperContained.method_28398(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28399(Object instance) { return wrapperContained.method_28399(instance); }
// public yarnwrap.particle.ParticleEffect method_28400(yarnwrap.world.biome.BiomeParticleConfig config) { return new yarnwrap.particle.ParticleEffect(wrapperContained.method_28400(config.wrapperContained)); }

}