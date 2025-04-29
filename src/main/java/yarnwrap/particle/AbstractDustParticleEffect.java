package yarnwrap.particle;
public class AbstractDustParticleEffect { public net.minecraft.particle.AbstractDustParticleEffect wrapperContained; public AbstractDustParticleEffect(net.minecraft.particle.AbstractDustParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scale() { return wrapperContained.scale; }
// public void scale(float value) { wrapperContained.scale = value; }
// public static float scale() { return net.minecraft.particle.AbstractDustParticleEffect.scale; }
// public static void scale(float value, ) { net.minecraft.particle.AbstractDustParticleEffect.scale = value; }

// public float MIN_SCALE() { return wrapperContained.MIN_SCALE; }
// public void MIN_SCALE(float value) { wrapperContained.MIN_SCALE = value; }
public static float MIN_SCALE() { return net.minecraft.particle.AbstractDustParticleEffect.MIN_SCALE; }
// public static void MIN_SCALE(float value, ) { net.minecraft.particle.AbstractDustParticleEffect.MIN_SCALE = value; }

// public float MAX_SCALE() { return wrapperContained.MAX_SCALE; }
// public void MAX_SCALE(float value) { wrapperContained.MAX_SCALE = value; }
public static float MAX_SCALE() { return net.minecraft.particle.AbstractDustParticleEffect.MAX_SCALE; }
// public static void MAX_SCALE(float value, ) { net.minecraft.particle.AbstractDustParticleEffect.MAX_SCALE = value; }

// public com.mojang.serialization.Codec SCALE_CODEC() { return wrapperContained.SCALE_CODEC; }
// public void SCALE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SCALE_CODEC = value; }
// public static com.mojang.serialization.Codec SCALE_CODEC() { return net.minecraft.particle.AbstractDustParticleEffect.SCALE_CODEC; }
// public static void SCALE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.particle.AbstractDustParticleEffect.SCALE_CODEC = value; }

// public AbstractDustParticleEffect(float scale) { this.wrapperContained = new net.minecraft.particle.AbstractDustParticleEffect(scale); }
// public com.mojang.serialization.DataResult method_59844(java.lang.Float scale) { return wrapperContained.method_59844(scale); }
// public static com.mojang.serialization.DataResult method_59844(java.lang.Float scale, ) { return net.minecraft.particle.AbstractDustParticleEffect.method_59844(scale); }
public float getScale() { return wrapperContained.getScale(); }
// public static float getScale() { return net.minecraft.particle.AbstractDustParticleEffect.getScale(); }

}