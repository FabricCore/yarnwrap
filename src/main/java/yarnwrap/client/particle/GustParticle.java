package yarnwrap.client.particle;
public class GustParticle { public net.minecraft.client.particle.GustParticle wrapperContained; public GustParticle(net.minecraft.client.particle.GustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.GustParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.GustParticle.spriteProvider = value.wrapperContained; }

// public GustParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.GustParticle(world.wrapperContained,x,y,z,spriteProvider.wrapperContained); }

}