package yarnwrap.block;
public class CactusBlock { public net.minecraft.block.CactusBlock wrapperContained; public CactusBlock(net.minecraft.block.CactusBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public yarnwrap.util.shape.VoxelShape OUTLINE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.OUTLINE_SHAPE); }
// public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}