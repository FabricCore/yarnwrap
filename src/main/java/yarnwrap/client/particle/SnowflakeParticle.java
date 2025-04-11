package yarnwrap.client.particle;
public class SnowflakeParticle { public net.minecraft.client.particle.SnowflakeParticle wrapperContained; public SnowflakeParticle(net.minecraft.client.particle.SnowflakeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }

}