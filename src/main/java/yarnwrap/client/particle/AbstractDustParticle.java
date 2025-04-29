package yarnwrap.client.particle;
public class AbstractDustParticle { public net.minecraft.client.particle.AbstractDustParticle wrapperContained; public AbstractDustParticle(net.minecraft.client.particle.AbstractDustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.AbstractDustParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.AbstractDustParticle.spriteProvider = value.wrapperContained; }

// public AbstractDustParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.particle.AbstractDustParticleEffect parameters,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.AbstractDustParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,parameters.wrapperContained,spriteProvider.wrapperContained); }
// public float darken(float colorComponent,float multiplier) { return wrapperContained.darken(colorComponent,multiplier); }
// public static float darken(float colorComponent,float multiplier, ) { return net.minecraft.client.particle.AbstractDustParticle.darken(colorComponent,multiplier); }

}