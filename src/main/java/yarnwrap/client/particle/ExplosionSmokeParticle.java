package yarnwrap.client.particle;
public class ExplosionSmokeParticle { public net.minecraft.client.particle.ExplosionSmokeParticle wrapperContained; public ExplosionSmokeParticle(net.minecraft.client.particle.ExplosionSmokeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }

}