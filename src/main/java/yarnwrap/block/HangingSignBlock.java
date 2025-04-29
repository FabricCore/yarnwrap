package yarnwrap.block;
public class HangingSignBlock { public net.minecraft.block.HangingSignBlock wrapperContained; public HangingSignBlock(net.minecraft.block.HangingSignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(wrapperContained.ROTATION); }
// public void ROTATION(yarnwrap.state.property.IntProperty value) { wrapperContained.ROTATION = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.HangingSignBlock.ROTATION); }
// public static void ROTATION(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.HangingSignBlock.ROTATION = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ATTACHED); }
// public void ATTACHED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.ATTACHED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.HangingSignBlock.ATTACHED); }
// public static void ATTACHED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.HangingSignBlock.ATTACHED = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape DEFAULT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DEFAULT_SHAPE); }
// public void DEFAULT_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DEFAULT_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape DEFAULT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.HangingSignBlock.DEFAULT_SHAPE); }
// public static void DEFAULT_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.HangingSignBlock.DEFAULT_SHAPE = value.wrapperContained; }

// public java.util.Map SHAPES_FOR_ROTATION() { return wrapperContained.SHAPES_FOR_ROTATION; }
// public void SHAPES_FOR_ROTATION(java.util.Map value) { wrapperContained.SHAPES_FOR_ROTATION = value; }
// public static java.util.Map SHAPES_FOR_ROTATION() { return net.minecraft.block.HangingSignBlock.SHAPES_FOR_ROTATION; }
// public static void SHAPES_FOR_ROTATION(java.util.Map value, ) { net.minecraft.block.HangingSignBlock.SHAPES_FOR_ROTATION = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.HangingSignBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.HangingSignBlock.CODEC = value; }

// public boolean shouldTryAttaching(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.entity.SignBlockEntity sign,yarnwrap.item.ItemStack stack) { return wrapperContained.shouldTryAttaching(player.wrapperContained,hitResult.wrapperContained,sign.wrapperContained,stack.wrapperContained); }
// public static boolean shouldTryAttaching(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.entity.SignBlockEntity sign,yarnwrap.item.ItemStack stack, ) { return net.minecraft.block.HangingSignBlock.shouldTryAttaching(player.wrapperContained,hitResult.wrapperContained,sign.wrapperContained,stack.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53991(Object instance) { return wrapperContained.method_53991(instance); }
// public static com.mojang.datafixers.kinds.App method_53991(Object instance, ) { return net.minecraft.block.HangingSignBlock.method_53991(instance); }

}