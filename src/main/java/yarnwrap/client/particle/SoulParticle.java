package yarnwrap.client.particle;
public class SoulParticle { public net.minecraft.client.particle.SoulParticle wrapperContained; public SoulParticle(net.minecraft.client.particle.SoulParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public boolean sculk() { return wrapperContained.sculk; }
// public void sculk(boolean value) { wrapperContained.sculk = value; }

}