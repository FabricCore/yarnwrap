package yarnwrap.client.particle;
public class SpellParticle { public net.minecraft.client.particle.SpellParticle wrapperContained; public SpellParticle(net.minecraft.client.particle.SpellParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
// public float defaultAlpha() { return wrapperContained.defaultAlpha; }
// public void defaultAlpha(float value) { wrapperContained.defaultAlpha = value; }
// public boolean isInvisible() { return wrapperContained.isInvisible(); }

}