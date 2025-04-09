package yarnwrap.block;
public class BeehiveBlock { public net.minecraft.block.BeehiveBlock wrapperContained; public BeehiveBlock(net.minecraft.block.BeehiveBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public yarnwrap.state.property.IntProperty HONEY_LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.HONEY_LEVEL); }
public int FULL_HONEY_LEVEL() { return wrapperContained.FULL_HONEY_LEVEL; }
// public int DROPPED_HONEYCOMB_COUNT() { return wrapperContained.DROPPED_HONEYCOMB_COUNT; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void addHoneyParticle(yarnwrap.world.World world,double minX,double maxX,double minZ,double maxZ,double height) { wrapperContained.addHoneyParticle(world.wrapperContained,minX,maxX,minZ,maxZ,height); }
// public void takeHoney(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,Object beeState) { wrapperContained.takeHoney(world.wrapperContained,state.wrapperContained,pos.wrapperContained,player.wrapperContained,beeState); }
public void dropHoneycomb(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.dropHoneycomb(world.wrapperContained,pos.wrapperContained); }
// public void spawnHoneyParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.spawnHoneyParticles(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void addHoneyParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.shape.VoxelShape shape,double height) { wrapperContained.addHoneyParticle(world.wrapperContained,pos.wrapperContained,shape.wrapperContained,height); }
public void takeHoney(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { wrapperContained.takeHoney(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public void angerNearbyBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.angerNearbyBees(world.wrapperContained,pos.wrapperContained); }
// public boolean hasBees(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasBees(world.wrapperContained,pos.wrapperContained); }

}