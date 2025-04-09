package yarnwrap.block;
public class CocoaBlock { public net.minecraft.block.CocoaBlock wrapperContained; public CocoaBlock(net.minecraft.block.CocoaBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] AGE_TO_WEST_SHAPE() { return wrapperContained.AGE_TO_WEST_SHAPE; }
// public net.minecraft.util.shape.VoxelShape[] AGE_TO_NORTH_SHAPE() { return wrapperContained.AGE_TO_NORTH_SHAPE; }
// public net.minecraft.util.shape.VoxelShape[] AGE_TO_EAST_SHAPE() { return wrapperContained.AGE_TO_EAST_SHAPE; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SOUTH_SHAPE() { return wrapperContained.AGE_TO_SOUTH_SHAPE; }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}