package yarnwrap.block;
public class CocoaBlock { public net.minecraft.block.CocoaBlock wrapperContained; public CocoaBlock(net.minecraft.block.CocoaBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_WEST_SHAPE() { return wrapperContained.AGE_TO_WEST_SHAPE; }
// public void AGE_TO_WEST_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_WEST_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] AGE_TO_WEST_SHAPE() { return net.minecraft.block.CocoaBlock.AGE_TO_WEST_SHAPE; }
// public static void AGE_TO_WEST_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.CocoaBlock.AGE_TO_WEST_SHAPE = value; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_NORTH_SHAPE() { return wrapperContained.AGE_TO_NORTH_SHAPE; }
// public void AGE_TO_NORTH_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_NORTH_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] AGE_TO_NORTH_SHAPE() { return net.minecraft.block.CocoaBlock.AGE_TO_NORTH_SHAPE; }
// public static void AGE_TO_NORTH_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.CocoaBlock.AGE_TO_NORTH_SHAPE = value; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_EAST_SHAPE() { return wrapperContained.AGE_TO_EAST_SHAPE; }
// public void AGE_TO_EAST_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_EAST_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] AGE_TO_EAST_SHAPE() { return net.minecraft.block.CocoaBlock.AGE_TO_EAST_SHAPE; }
// public static void AGE_TO_EAST_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.CocoaBlock.AGE_TO_EAST_SHAPE = value; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.CocoaBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.CocoaBlock.AGE = value.wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SOUTH_SHAPE() { return wrapperContained.AGE_TO_SOUTH_SHAPE; }
// public void AGE_TO_SOUTH_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_SOUTH_SHAPE = value; }
// public static net.minecraft.util.shape.VoxelShape[] AGE_TO_SOUTH_SHAPE() { return net.minecraft.block.CocoaBlock.AGE_TO_SOUTH_SHAPE; }
// public static void AGE_TO_SOUTH_SHAPE(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.CocoaBlock.AGE_TO_SOUTH_SHAPE = value; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.CocoaBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.CocoaBlock.MAX_AGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CocoaBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CocoaBlock.CODEC = value; }


}