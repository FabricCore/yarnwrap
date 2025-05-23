package yarnwrap.block;
public class ObserverBlock { public net.minecraft.block.ObserverBlock wrapperContained; public ObserverBlock(net.minecraft.block.ObserverBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ObserverBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ObserverBlock.POWERED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ObserverBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ObserverBlock.CODEC = value; }

// public void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateNeighbors(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.ObserverBlock.updateNeighbors(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void scheduleTick(yarnwrap.world.WorldView world,yarnwrap.world.tick.ScheduledTickView tickView,yarnwrap.util.math.BlockPos pos) { wrapperContained.scheduleTick(world.wrapperContained,tickView.wrapperContained,pos.wrapperContained); }
// public static void scheduleTick(yarnwrap.world.WorldView world,yarnwrap.world.tick.ScheduledTickView tickView,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.ObserverBlock.scheduleTick(world.wrapperContained,tickView.wrapperContained,pos.wrapperContained); }

}