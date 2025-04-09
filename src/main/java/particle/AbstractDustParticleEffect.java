package yarnwrap.particle;
public class AbstractDustParticleEffect { public net.minecraft.particle.AbstractDustParticleEffect wrapperContained; public AbstractDustParticleEffect(net.minecraft.particle.AbstractDustParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scale() { return wrapperContained.scale; }
public float MIN_SCALE() { return wrapperContained.MIN_SCALE; }
public float MAX_SCALE() { return wrapperContained.MAX_SCALE; }
// public com.mojang.serialization.Codec SCALE_CODEC() { return wrapperContained.SCALE_CODEC; }
public float getScale() { return wrapperContained.getScale(); }

}