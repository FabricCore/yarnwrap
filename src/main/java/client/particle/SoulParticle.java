package yarnwrap.client.particle;
public class SoulParticle { public net.minecraft.client.particle.SoulParticle wrapperContained; public SoulParticle(net.minecraft.client.particle.SoulParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public boolean sculk() { return wrapperContained.sculk; }

}