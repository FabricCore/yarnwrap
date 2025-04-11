package yarnwrap.client.particle;
public class BlockMarkerParticle { public net.minecraft.client.particle.BlockMarkerParticle wrapperContained; public BlockMarkerParticle(net.minecraft.client.particle.BlockMarkerParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public BlockMarkerParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.client.particle.BlockMarkerParticle(world.wrapperContained,x,y,z,state.wrapperContained); }

}