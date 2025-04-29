package yarnwrap.client.particle;
public class BlockFallingDustParticle { public net.minecraft.client.particle.BlockFallingDustParticle wrapperContained; public BlockFallingDustParticle(net.minecraft.client.particle.BlockFallingDustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.BlockFallingDustParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.BlockFallingDustParticle.spriteProvider = value.wrapperContained; }

// public float rotationSpeed() { return wrapperContained.rotationSpeed; }
// public void rotationSpeed(float value) { wrapperContained.rotationSpeed = value; }
// public static float rotationSpeed() { return net.minecraft.client.particle.BlockFallingDustParticle.rotationSpeed; }
// public static void rotationSpeed(float value, ) { net.minecraft.client.particle.BlockFallingDustParticle.rotationSpeed = value; }

// public BlockFallingDustParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,float red,float green,float blue,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.BlockFallingDustParticle(world.wrapperContained,x,y,z,red,green,blue,spriteProvider.wrapperContained); }

}