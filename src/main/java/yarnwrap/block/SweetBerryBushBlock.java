package yarnwrap.block;
public class SweetBerryBushBlock { public net.minecraft.block.SweetBerryBushBlock wrapperContained; public SweetBerryBushBlock(net.minecraft.block.SweetBerryBushBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.SweetBerryBushBlock.AGE); }
// public static void AGE(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.SweetBerryBushBlock.AGE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SMALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMALL_SHAPE); }
// public void SMALL_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SMALL_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SMALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.SweetBerryBushBlock.SMALL_SHAPE); }
// public static void SMALL_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.SweetBerryBushBlock.SMALL_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape LARGE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LARGE_SHAPE); }
// public void LARGE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LARGE_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape LARGE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.SweetBerryBushBlock.LARGE_SHAPE); }
// public static void LARGE_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.SweetBerryBushBlock.LARGE_SHAPE = value.wrapperContained; }

// public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public static int MAX_AGE() { return net.minecraft.block.SweetBerryBushBlock.MAX_AGE; }
// public static void MAX_AGE(int value, ) { net.minecraft.block.SweetBerryBushBlock.MAX_AGE = value; }

// public float MIN_MOVEMENT_FOR_DAMAGE() { return wrapperContained.MIN_MOVEMENT_FOR_DAMAGE; }
// public void MIN_MOVEMENT_FOR_DAMAGE(float value) { wrapperContained.MIN_MOVEMENT_FOR_DAMAGE = value; }
// public static float MIN_MOVEMENT_FOR_DAMAGE() { return net.minecraft.block.SweetBerryBushBlock.MIN_MOVEMENT_FOR_DAMAGE; }
// public static void MIN_MOVEMENT_FOR_DAMAGE(float value, ) { net.minecraft.block.SweetBerryBushBlock.MIN_MOVEMENT_FOR_DAMAGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SweetBerryBushBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SweetBerryBushBlock.CODEC = value; }


}