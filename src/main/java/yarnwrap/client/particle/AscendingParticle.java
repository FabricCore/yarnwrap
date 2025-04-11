package yarnwrap.client.particle;
public class AscendingParticle { public net.minecraft.client.particle.AscendingParticle wrapperContained; public AscendingParticle(net.minecraft.client.particle.AscendingParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }

}