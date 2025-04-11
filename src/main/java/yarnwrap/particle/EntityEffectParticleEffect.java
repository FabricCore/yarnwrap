package yarnwrap.particle;
public class EntityEffectParticleEffect { public net.minecraft.particle.EntityEffectParticleEffect wrapperContained; public EntityEffectParticleEffect(net.minecraft.particle.EntityEffectParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(wrapperContained.type); }
// public void type(yarnwrap.particle.ParticleType value) { wrapperContained.type = value.wrapperContained; }
// public int color() { return wrapperContained.color; }
// public void color(int value) { wrapperContained.color = value; }
// public EntityEffectParticleEffect(yarnwrap.particle.ParticleType type,int color) { this.wrapperContained = new net.minecraft.particle.EntityEffectParticleEffect(type.wrapperContained,color); }
// public java.lang.Integer method_58253(yarnwrap.particle.EntityEffectParticleEffect particleEffect) { return wrapperContained.method_58253(particleEffect.wrapperContained); }
public com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type) { return wrapperContained.createCodec(type.wrapperContained); }
public yarnwrap.particle.EntityEffectParticleEffect create(yarnwrap.particle.ParticleType type,float r,float g,float b) { return new yarnwrap.particle.EntityEffectParticleEffect(wrapperContained.create(type.wrapperContained,r,g,b)); }
public yarnwrap.particle.EntityEffectParticleEffect create(yarnwrap.particle.ParticleType type,int color) { return new yarnwrap.particle.EntityEffectParticleEffect(wrapperContained.create(type.wrapperContained,color)); }
// public yarnwrap.particle.EntityEffectParticleEffect method_58258(yarnwrap.particle.ParticleType color) { return new yarnwrap.particle.EntityEffectParticleEffect(wrapperContained.method_58258(color.wrapperContained)); }
public float getRed() { return wrapperContained.getRed(); }
// public java.lang.Integer method_58260(yarnwrap.particle.EntityEffectParticleEffect effect) { return wrapperContained.method_58260(effect.wrapperContained); }
public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(type.wrapperContained)); }
// public yarnwrap.particle.EntityEffectParticleEffect method_58262(yarnwrap.particle.ParticleType color) { return new yarnwrap.particle.EntityEffectParticleEffect(wrapperContained.method_58262(color.wrapperContained)); }
public float getGreen() { return wrapperContained.getGreen(); }
public float getBlue() { return wrapperContained.getBlue(); }
public float getAlpha() { return wrapperContained.getAlpha(); }

}