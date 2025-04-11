package yarnwrap.client.particle;
public class SweepAttackParticle { public net.minecraft.client.particle.SweepAttackParticle wrapperContained; public SweepAttackParticle(net.minecraft.client.particle.SweepAttackParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }

}