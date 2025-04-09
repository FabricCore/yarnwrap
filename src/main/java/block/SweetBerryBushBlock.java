package yarnwrap.block;
public class SweetBerryBushBlock { public net.minecraft.block.SweetBerryBushBlock wrapperContained; public SweetBerryBushBlock(net.minecraft.block.SweetBerryBushBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public yarnwrap.util.shape.VoxelShape SMALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMALL_SHAPE); }
// public yarnwrap.util.shape.VoxelShape LARGE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LARGE_SHAPE); }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public float MIN_MOVEMENT_FOR_DAMAGE() { return wrapperContained.MIN_MOVEMENT_FOR_DAMAGE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}