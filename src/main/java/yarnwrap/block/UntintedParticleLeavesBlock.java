package yarnwrap.block;
public class UntintedParticleLeavesBlock { public net.minecraft.block.UntintedParticleLeavesBlock wrapperContained; public UntintedParticleLeavesBlock(net.minecraft.block.UntintedParticleLeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.UntintedParticleLeavesBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.UntintedParticleLeavesBlock.CODEC = value; }

// public yarnwrap.particle.ParticleEffect leafParticleEffect() { return new yarnwrap.particle.ParticleEffect(wrapperContained.leafParticleEffect); }
// public void leafParticleEffect(yarnwrap.particle.ParticleEffect value) { wrapperContained.leafParticleEffect = value.wrapperContained; }
// public static yarnwrap.particle.ParticleEffect leafParticleEffect() { return new yarnwrap.particle.ParticleEffect(net.minecraft.block.UntintedParticleLeavesBlock.leafParticleEffect); }
// public static void leafParticleEffect(yarnwrap.particle.ParticleEffect value, ) { net.minecraft.block.UntintedParticleLeavesBlock.leafParticleEffect = value.wrapperContained; }

// public UntintedParticleLeavesBlock(float leafParticleChance,yarnwrap.particle.ParticleEffect leafParticleEffect,Object settings) { this.wrapperContained = new net.minecraft.block.UntintedParticleLeavesBlock(leafParticleChance,leafParticleEffect.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_67239(Object instance) { return wrapperContained.method_67239(instance); }
// public static com.mojang.datafixers.kinds.App method_67239(Object instance, ) { return net.minecraft.block.UntintedParticleLeavesBlock.method_67239(instance); }

}