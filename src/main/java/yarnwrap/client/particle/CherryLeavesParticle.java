package yarnwrap.client.particle;
public class CherryLeavesParticle { public net.minecraft.client.particle.CherryLeavesParticle wrapperContained; public CherryLeavesParticle(net.minecraft.client.particle.CherryLeavesParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public CherryLeavesParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.CherryLeavesParticle(world.wrapperContained,x,y,z,spriteProvider.wrapperContained); }

}