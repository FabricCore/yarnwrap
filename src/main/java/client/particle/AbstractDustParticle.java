package yarnwrap.client.particle;
public class AbstractDustParticle { public net.minecraft.client.particle.AbstractDustParticle wrapperContained; public AbstractDustParticle(net.minecraft.client.particle.AbstractDustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public float darken(float colorComponent,float multiplier) { return wrapperContained.darken(colorComponent,multiplier); }

}