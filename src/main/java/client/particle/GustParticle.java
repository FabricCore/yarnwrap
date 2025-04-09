package yarnwrap.client.particle;
public class GustParticle { public net.minecraft.client.particle.GustParticle wrapperContained; public GustParticle(net.minecraft.client.particle.GustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }

}