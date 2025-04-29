package yarnwrap.block;
public class FrostedIceBlock { public net.minecraft.block.FrostedIceBlock wrapperContained; public FrostedIceBlock(net.minecraft.block.FrostedIceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.FrostedIceBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.FrostedIceBlock.AGE = value.wrapperContained; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.FrostedIceBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.FrostedIceBlock.MAX_AGE = value; }

// public int NEIGHBORS_CHECKED_ON_SCHEDULED_TICK() { return wrapperContained.NEIGHBORS_CHECKED_ON_SCHEDULED_TICK; }
// public void NEIGHBORS_CHECKED_ON_SCHEDULED_TICK(int value) { wrapperContained.NEIGHBORS_CHECKED_ON_SCHEDULED_TICK = value; }
// public static int NEIGHBORS_CHECKED_ON_SCHEDULED_TICK() { return net.minecraft.block.FrostedIceBlock.NEIGHBORS_CHECKED_ON_SCHEDULED_TICK; }
// public static void NEIGHBORS_CHECKED_ON_SCHEDULED_TICK(int value, ) { net.minecraft.block.FrostedIceBlock.NEIGHBORS_CHECKED_ON_SCHEDULED_TICK = value; }

// public int NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE() { return wrapperContained.NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE; }
// public void NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE(int value) { wrapperContained.NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE = value; }
// public static int NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE() { return net.minecraft.block.FrostedIceBlock.NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE; }
// public static void NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE(int value, ) { net.minecraft.block.FrostedIceBlock.NEIGHBORS_CHECKED_ON_NEIGHBOR_UPDATE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FrostedIceBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FrostedIceBlock.CODEC = value; }

// public boolean increaseAge(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.increaseAge(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean increaseAge(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.FrostedIceBlock.increaseAge(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean canMelt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int maxNeighbors) { return wrapperContained.canMelt(world.wrapperContained,pos.wrapperContained,maxNeighbors); }
// public static boolean canMelt(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int maxNeighbors, ) { return net.minecraft.block.FrostedIceBlock.canMelt(world.wrapperContained,pos.wrapperContained,maxNeighbors); }

}