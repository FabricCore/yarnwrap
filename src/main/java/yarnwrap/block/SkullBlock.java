package yarnwrap.block;
public class SkullBlock { public net.minecraft.block.SkullBlock wrapperContained; public SkullBlock(net.minecraft.block.SkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(wrapperContained.ROTATION); }
// public void ROTATION(yarnwrap.state.property.IntProperty value) { wrapperContained.ROTATION = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.SkullBlock.ROTATION); }
// public static void ROTATION(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.SkullBlock.ROTATION = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.SkullBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.SkullBlock.SHAPE = value.wrapperContained; }

// public int MAX_ROTATION_INDEX() { return wrapperContained.MAX_ROTATION_INDEX; }
// public void MAX_ROTATION_INDEX(int value) { wrapperContained.MAX_ROTATION_INDEX = value; }
public static int MAX_ROTATION_INDEX() { return net.minecraft.block.SkullBlock.MAX_ROTATION_INDEX; }
// public static void MAX_ROTATION_INDEX(int value, ) { net.minecraft.block.SkullBlock.MAX_ROTATION_INDEX = value; }

// public int MAX_ROTATIONS() { return wrapperContained.MAX_ROTATIONS; }
// public void MAX_ROTATIONS(int value) { wrapperContained.MAX_ROTATIONS = value; }
// public static int MAX_ROTATIONS() { return net.minecraft.block.SkullBlock.MAX_ROTATIONS; }
// public static void MAX_ROTATIONS(int value, ) { net.minecraft.block.SkullBlock.MAX_ROTATIONS = value; }

// public yarnwrap.util.shape.VoxelShape PIGLIN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.PIGLIN_SHAPE); }
// public void PIGLIN_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.PIGLIN_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape PIGLIN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.SkullBlock.PIGLIN_SHAPE); }
// public static void PIGLIN_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.SkullBlock.PIGLIN_SHAPE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SkullBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SkullBlock.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_54043(Object instance) { return wrapperContained.method_54043(instance); }
// public static com.mojang.datafixers.kinds.App method_54043(Object instance, ) { return net.minecraft.block.SkullBlock.method_54043(instance); }

}