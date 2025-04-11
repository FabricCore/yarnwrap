package yarnwrap.client.particle;
public class SculkChargeParticle { public net.minecraft.client.particle.SculkChargeParticle wrapperContained; public SculkChargeParticle(net.minecraft.client.particle.SculkChargeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }

}