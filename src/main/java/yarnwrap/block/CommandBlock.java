package yarnwrap.block;
public class CommandBlock { public net.minecraft.block.CommandBlock wrapperContained; public CommandBlock(net.minecraft.block.CommandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.state.property.BooleanProperty CONDITIONAL() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CONDITIONAL); }
// public void CONDITIONAL(yarnwrap.state.property.BooleanProperty value) { wrapperContained.CONDITIONAL = value.wrapperContained; }
// public boolean auto() { return wrapperContained.auto; }
// public void auto(boolean value) { wrapperContained.auto = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void executeCommandChain(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing) { wrapperContained.executeCommandChain(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
// public void execute(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.CommandBlockExecutor executor,boolean hasCommand) { wrapperContained.execute(state.wrapperContained,world.wrapperContained,pos.wrapperContained,executor.wrapperContained,hasCommand); }

}