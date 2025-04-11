package yarnwrap.particle;
public class AbstractDustParticleEffect { public net.minecraft.particle.AbstractDustParticleEffect wrapperContained; public AbstractDustParticleEffect(net.minecraft.particle.AbstractDustParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scale() { return wrapperContained.scale; }
// public void scale(float value) { wrapperContained.scale = value; }
public float MIN_SCALE() { return wrapperContained.MIN_SCALE; }
// public void MIN_SCALE(float value) { wrapperContained.MIN_SCALE = value; }
public float MAX_SCALE() { return wrapperContained.MAX_SCALE; }
// public void MAX_SCALE(float value) { wrapperContained.MAX_SCALE = value; }
// public com.mojang.serialization.Codec SCALE_CODEC() { return wrapperContained.SCALE_CODEC; }
// public void SCALE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SCALE_CODEC = value; }
public float getScale() { return wrapperContained.getScale(); }

}