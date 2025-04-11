package yarnwrap.block;
public class SweetBerryBushBlock { public net.minecraft.block.SweetBerryBushBlock wrapperContained; public SweetBerryBushBlock(net.minecraft.block.SweetBerryBushBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SMALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMALL_SHAPE); }
// public void SMALL_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SMALL_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape LARGE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LARGE_SHAPE); }
// public void LARGE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LARGE_SHAPE = value.wrapperContained; }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
// public float MIN_MOVEMENT_FOR_DAMAGE() { return wrapperContained.MIN_MOVEMENT_FOR_DAMAGE; }
// public void MIN_MOVEMENT_FOR_DAMAGE(float value) { wrapperContained.MIN_MOVEMENT_FOR_DAMAGE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}