package yarnwrap.command.argument;
public class BlockStateArgument { public net.minecraft.command.argument.BlockStateArgument wrapperContained; public BlockStateArgument(net.minecraft.command.argument.BlockStateArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set properties() { return wrapperContained.properties; }
// public void properties(java.util.Set value) { wrapperContained.properties = value; }
// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public yarnwrap.nbt.NbtCompound data() { return new yarnwrap.nbt.NbtCompound(wrapperContained.data); }
// public void data(yarnwrap.nbt.NbtCompound value) { wrapperContained.data = value.wrapperContained; }
public BlockStateArgument(yarnwrap.block.BlockState state,java.util.Set properties,yarnwrap.nbt.NbtCompound data) { this.wrapperContained = new net.minecraft.command.argument.BlockStateArgument(state.wrapperContained,properties,data.wrapperContained); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }
public java.util.Set getProperties() { return wrapperContained.getProperties(); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public boolean setBlockState(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,int flags) { return wrapperContained.setBlockState(world.wrapperContained,pos.wrapperContained,flags); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }

}