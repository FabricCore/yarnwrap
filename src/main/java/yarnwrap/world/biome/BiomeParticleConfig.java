package yarnwrap.world.biome;
public class BiomeParticleConfig { public net.minecraft.world.biome.BiomeParticleConfig wrapperContained; public BiomeParticleConfig(net.minecraft.world.biome.BiomeParticleConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.particle.ParticleEffect particle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.particle); }
// public void particle(yarnwrap.particle.ParticleEffect value) { wrapperContained.particle = value.wrapperContained; }
public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
public boolean shouldAddParticle(yarnwrap.util.math.random.Random random) { return wrapperContained.shouldAddParticle(random.wrapperContained); }

}