package yarnwrap.client.particle;
public class FishingParticle { public net.minecraft.client.particle.FishingParticle wrapperContained; public FishingParticle(net.minecraft.client.particle.FishingParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }

}