package yarnwrap.command.argument;
public class BlockStateArgument { public net.minecraft.command.argument.BlockStateArgument wrapperContained; public BlockStateArgument(net.minecraft.command.argument.BlockStateArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set properties() { return wrapperContained.properties; }
// public void properties(java.util.Set value) { wrapperContained.properties = value; }
// public static java.util.Set properties() { return net.minecraft.command.argument.BlockStateArgument.properties; }
// public static void properties(java.util.Set value, ) { net.minecraft.command.argument.BlockStateArgument.properties = value; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(net.minecraft.command.argument.BlockStateArgument.state); }
// public static void state(yarnwrap.block.BlockState value, ) { net.minecraft.command.argument.BlockStateArgument.state = value.wrapperContained; }

// public yarnwrap.nbt.NbtCompound data() { return new yarnwrap.nbt.NbtCompound(wrapperContained.data); }
// public void data(yarnwrap.nbt.NbtCompound value) { wrapperContained.data = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound data() { return new yarnwrap.nbt.NbtCompound(net.minecraft.command.argument.BlockStateArgument.data); }
// public static void data(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.command.argument.BlockStateArgument.data = value.wrapperContained; }

public BlockStateArgument(yarnwrap.block.BlockState state,java.util.Set properties,yarnwrap.nbt.NbtCompound data) { this.wrapperContained = new net.minecraft.command.argument.BlockStateArgument(state.wrapperContained,properties,data.wrapperContained); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }
// public static boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.command.argument.BlockStateArgument.test(world.wrapperContained,pos.wrapperContained); }
public java.util.Set getProperties() { return wrapperContained.getProperties(); }
// public static java.util.Set getProperties() { return net.minecraft.command.argument.BlockStateArgument.getProperties(); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public static yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(net.minecraft.command.argument.BlockStateArgument.getBlockState()); }
public boolean setBlockState(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,int flags) { return wrapperContained.setBlockState(world.wrapperContained,pos.wrapperContained,flags); }
// public static boolean setBlockState(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,int flags, ) { return net.minecraft.command.argument.BlockStateArgument.setBlockState(world.wrapperContained,pos.wrapperContained,flags); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.command.argument.BlockStateArgument.test(context); }

}