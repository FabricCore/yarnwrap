package yarnwrap.block;
public class Fertilizable { public net.minecraft.block.Fertilizable wrapperContained; public Fertilizable(net.minecraft.block.Fertilizable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.BlockPos getFertilizeParticlePos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getFertilizeParticlePos(pos.wrapperContained)); }
public Object getFertilizableType() { return wrapperContained.getFertilizableType(); }
public boolean canGrow(yarnwrap.world.World world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canGrow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isFertilizable(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.isFertilizable(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void grow(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.grow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}