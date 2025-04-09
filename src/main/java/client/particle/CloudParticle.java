package yarnwrap.client.particle;
public class CloudParticle { public net.minecraft.client.particle.CloudParticle wrapperContained; public CloudParticle(net.minecraft.client.particle.CloudParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }

}