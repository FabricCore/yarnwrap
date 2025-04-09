package yarnwrap.particle;
public class EntityEffectParticleEffect { public net.minecraft.particle.EntityEffectParticleEffect wrapperContained; public EntityEffectParticleEffect(net.minecraft.particle.EntityEffectParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(wrapperContained.type); }
// public int color() { return wrapperContained.color; }
public com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type) { return wrapperContained.createCodec(type.wrapperContained); }
public yarnwrap.particle.EntityEffectParticleEffect create(yarnwrap.particle.ParticleType type,float r,float g,float b) { return new yarnwrap.particle.EntityEffectParticleEffect(wrapperContained.create(type.wrapperContained,r,g,b)); }
public yarnwrap.particle.EntityEffectParticleEffect create(yarnwrap.particle.ParticleType type,int color) { return new yarnwrap.particle.EntityEffectParticleEffect(wrapperContained.create(type.wrapperContained,color)); }
public float getRed() { return wrapperContained.getRed(); }
public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(type.wrapperContained)); }
public float getGreen() { return wrapperContained.getGreen(); }
public float getBlue() { return wrapperContained.getBlue(); }
public float getAlpha() { return wrapperContained.getAlpha(); }

}