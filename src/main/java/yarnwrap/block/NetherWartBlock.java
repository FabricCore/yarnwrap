package yarnwrap.block;
public class NetherWartBlock { public net.minecraft.block.NetherWartBlock wrapperContained; public NetherWartBlock(net.minecraft.block.NetherWartBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
// public void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return net.minecraft.block.NetherWartBlock.AGE_TO_SHAPE; }
// public static void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.NetherWartBlock.AGE_TO_SHAPE = value; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.NetherWartBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.NetherWartBlock.AGE = value.wrapperContained; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.NetherWartBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.NetherWartBlock.MAX_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.NetherWartBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.NetherWartBlock.CODEC = value; }


}