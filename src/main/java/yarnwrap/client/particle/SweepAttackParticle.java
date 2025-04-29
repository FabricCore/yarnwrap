package yarnwrap.client.particle;
public class SweepAttackParticle { public net.minecraft.client.particle.SweepAttackParticle wrapperContained; public SweepAttackParticle(net.minecraft.client.particle.SweepAttackParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public static yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(net.minecraft.client.particle.SweepAttackParticle.spriteProvider); }
// public static void spriteProvider(yarnwrap.client.particle.SpriteProvider value, ) { net.minecraft.client.particle.SweepAttackParticle.spriteProvider = value.wrapperContained; }

// public SweepAttackParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.SweepAttackParticle(world.wrapperContained,x,y,z,spriteProvider); }

}