package yarnwrap.client.particle;
public class GlowParticle { public net.minecraft.client.particle.GlowParticle wrapperContained; public GlowParticle(net.minecraft.client.particle.GlowParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }

}