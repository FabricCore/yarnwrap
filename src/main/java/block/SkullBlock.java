package yarnwrap.block;
public class SkullBlock { public net.minecraft.block.SkullBlock wrapperContained; public SkullBlock(net.minecraft.block.SkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(wrapperContained.ROTATION); }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public int MAX_ROTATION_INDEX() { return wrapperContained.MAX_ROTATION_INDEX; }
// public int MAX_ROTATIONS() { return wrapperContained.MAX_ROTATIONS; }
// public yarnwrap.util.shape.VoxelShape PIGLIN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.PIGLIN_SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}