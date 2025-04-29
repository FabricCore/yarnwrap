package yarnwrap.block;
public class CommandBlock { public net.minecraft.block.CommandBlock wrapperContained; public CommandBlock(net.minecraft.block.CommandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.CommandBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.CommandBlock.FACING = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.CommandBlock.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.CommandBlock.LOGGER = value; }

// public yarnwrap.state.property.BooleanProperty CONDITIONAL() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CONDITIONAL); }
// public void CONDITIONAL(yarnwrap.state.property.BooleanProperty value) { wrapperContained.CONDITIONAL = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty CONDITIONAL() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CommandBlock.CONDITIONAL); }
// public static void CONDITIONAL(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CommandBlock.CONDITIONAL = value.wrapperContained; }

// public boolean auto() { return wrapperContained.auto; }
// public void auto(boolean value) { wrapperContained.auto = value; }
// public static boolean auto() { return net.minecraft.block.CommandBlock.auto; }
// public static void auto(boolean value, ) { net.minecraft.block.CommandBlock.auto = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CommandBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CommandBlock.CODEC = value; }

// public CommandBlock(boolean auto,Object settings) { this.wrapperContained = new net.minecraft.block.CommandBlock(auto,settings); }
// public com.mojang.datafixers.kinds.App method_53998(Object instance) { return wrapperContained.method_53998(instance); }
// public static com.mojang.datafixers.kinds.App method_53998(Object instance, ) { return net.minecraft.block.CommandBlock.method_53998(instance); }
// public java.lang.Boolean method_53999(yarnwrap.block.CommandBlock block) { return wrapperContained.method_53999(block.wrapperContained); }
// public static java.lang.Boolean method_53999(yarnwrap.block.CommandBlock block, ) { return net.minecraft.block.CommandBlock.method_53999(block.wrapperContained); }
// public void executeCommandChain(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing) { wrapperContained.executeCommandChain(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
// public static void executeCommandChain(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing, ) { net.minecraft.block.CommandBlock.executeCommandChain(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
// public void execute(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.CommandBlockExecutor executor,boolean hasCommand) { wrapperContained.execute(state.wrapperContained,world.wrapperContained,pos.wrapperContained,executor.wrapperContained,hasCommand); }
// public static void execute(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.CommandBlockExecutor executor,boolean hasCommand, ) { net.minecraft.block.CommandBlock.execute(state.wrapperContained,world.wrapperContained,pos.wrapperContained,executor.wrapperContained,hasCommand); }

}