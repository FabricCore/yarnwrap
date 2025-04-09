package yarnwrap.client.particle;
public class SpellParticle { public net.minecraft.client.particle.SpellParticle wrapperContained; public SpellParticle(net.minecraft.client.particle.SpellParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public float defaultAlpha() { return wrapperContained.defaultAlpha; }
// public boolean isInvisible() { return wrapperContained.isInvisible(); }

}