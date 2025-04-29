package yarnwrap.block;
public class Fertilizable { public net.minecraft.block.Fertilizable wrapperContained; public Fertilizable(net.minecraft.block.Fertilizable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.BlockPos getFertilizeParticlePos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getFertilizeParticlePos(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getFertilizeParticlePos(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.block.Fertilizable.getFertilizeParticlePos(pos.wrapperContained)); }
public Object getFertilizableType() { return wrapperContained.getFertilizableType(); }
// public static Object getFertilizableType() { return net.minecraft.block.Fertilizable.getFertilizableType(); }
public boolean canGrow(yarnwrap.world.World world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canGrow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean canGrow(yarnwrap.world.World world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.Fertilizable.canGrow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isFertilizable(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.isFertilizable(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean isFertilizable(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.Fertilizable.isFertilizable(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void grow(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.grow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void grow(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.Fertilizable.grow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}