package yarnwrap.world.biome;
public class BiomeParticleConfig { public net.minecraft.world.biome.BiomeParticleConfig wrapperContained; public BiomeParticleConfig(net.minecraft.world.biome.BiomeParticleConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.particle.ParticleEffect particle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.particle); }
public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
public boolean shouldAddParticle(yarnwrap.util.math.random.Random random) { return wrapperContained.shouldAddParticle(random.wrapperContained); }

}