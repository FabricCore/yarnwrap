package yarnwrap.block;
public class IceBlock { public net.minecraft.block.IceBlock wrapperContained; public IceBlock(net.minecraft.block.IceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.IceBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.IceBlock.CODEC = value; }

// public void melt(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.melt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void melt(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.IceBlock.melt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getMeltedState() { return new yarnwrap.block.BlockState(wrapperContained.getMeltedState()); }
public static yarnwrap.block.BlockState getMeltedState() { return new yarnwrap.block.BlockState(net.minecraft.block.IceBlock.getMeltedState()); }

}