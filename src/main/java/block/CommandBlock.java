package yarnwrap.block;
public class CommandBlock { public net.minecraft.block.CommandBlock wrapperContained; public CommandBlock(net.minecraft.block.CommandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.state.property.BooleanProperty CONDITIONAL() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CONDITIONAL); }
// public boolean auto() { return wrapperContained.auto; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void executeCommandChain(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing) { wrapperContained.executeCommandChain(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
// public void execute(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.CommandBlockExecutor executor,boolean hasCommand) { wrapperContained.execute(state.wrapperContained,world.wrapperContained,pos.wrapperContained,executor.wrapperContained,hasCommand); }

}