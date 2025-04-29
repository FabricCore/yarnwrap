package yarnwrap.client.particle;
public class AscendingParticle { public net.minecraft.client.particle.AscendingParticle wrapperContained; public AscendingParticle(net.minecraft.client.particle.AscendingParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.AscendingParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.AscendingParticle.spriteProvider = value.wrapperContained; }

// public AscendingParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,float randomVelocityXMultiplier,float randomVelocityYMultiplier,float randomVelocityZMultiplier,double velocityX,double velocityY,double velocityZ,float scaleMultiplier,yarnwrap.client.particle.SpriteProvider spriteProvider,float colorMultiplier,int baseMaxAge,float gravityStrength,boolean collidesWithWorld) { this.wrapperContained = new net.minecraft.client.particle.AscendingParticle(world.wrapperContained,x,y,z,randomVelocityXMultiplier,randomVelocityYMultiplier,randomVelocityZMultiplier,velocityX,velocityY,velocityZ,scaleMultiplier,spriteProvider.wrapperContained,colorMultiplier,baseMaxAge,gravityStrength,collidesWithWorld); }

}