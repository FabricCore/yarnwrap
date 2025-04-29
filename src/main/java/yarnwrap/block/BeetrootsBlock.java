package yarnwrap.block;
public class BeetrootsBlock { public net.minecraft.block.BeetrootsBlock wrapperContained; public BeetrootsBlock(net.minecraft.block.BeetrootsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BEETROOTS_MAX_AGE() { return wrapperContained.BEETROOTS_MAX_AGE; }
// public void BEETROOTS_MAX_AGE(int value) { wrapperContained.BEETROOTS_MAX_AGE = value; }
public static int BEETROOTS_MAX_AGE() { return net.minecraft.block.BeetrootsBlock.BEETROOTS_MAX_AGE; }
// public static void BEETROOTS_MAX_AGE(int value, ) { net.minecraft.block.BeetrootsBlock.BEETROOTS_MAX_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BeetrootsBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BeetrootsBlock.CODEC = value; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
// public void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return net.minecraft.block.BeetrootsBlock.AGE_TO_SHAPE; }
// public static void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.BeetrootsBlock.AGE_TO_SHAPE = value; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.BeetrootsBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.BeetrootsBlock.AGE = value.wrapperContained; }


}