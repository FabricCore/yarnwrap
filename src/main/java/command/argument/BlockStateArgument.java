package yarnwrap.command.argument;
public class BlockStateArgument { public net.minecraft.command.argument.BlockStateArgument wrapperContained; public BlockStateArgument(net.minecraft.command.argument.BlockStateArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set properties() { return wrapperContained.properties; }
// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public yarnwrap.nbt.NbtCompound data() { return new yarnwrap.nbt.NbtCompound(wrapperContained.data); }
public boolean test(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.test(world.wrapperContained,pos.wrapperContained); }
public java.util.Set getProperties() { return wrapperContained.getProperties(); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public boolean setBlockState(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,int flags) { return wrapperContained.setBlockState(world.wrapperContained,pos.wrapperContained,flags); }

}