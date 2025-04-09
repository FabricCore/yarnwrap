package yarnwrap.block;
public class PowderSnowBlock { public net.minecraft.block.PowderSnowBlock wrapperContained; public PowderSnowBlock(net.minecraft.block.PowderSnowBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public float HORIZONTAL_MOVEMENT_MULTIPLIER() { return wrapperContained.HORIZONTAL_MOVEMENT_MULTIPLIER; }
// public float VERTICAL_MOVEMENT_MULTIPLIER() { return wrapperContained.VERTICAL_MOVEMENT_MULTIPLIER; }
// public yarnwrap.util.shape.VoxelShape FALLING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FALLING_SHAPE); }
// public double SMALL_FALL_SOUND_MAX_DISTANCE() { return wrapperContained.SMALL_FALL_SOUND_MAX_DISTANCE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean canWalkOnPowderSnow(yarnwrap.entity.Entity entity) { return wrapperContained.canWalkOnPowderSnow(entity.wrapperContained); }

}