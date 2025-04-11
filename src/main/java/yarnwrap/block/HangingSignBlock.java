package yarnwrap.block;
public class HangingSignBlock { public net.minecraft.block.HangingSignBlock wrapperContained; public HangingSignBlock(net.minecraft.block.HangingSignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(wrapperContained.ROTATION); }
// public void ROTATION(yarnwrap.state.property.IntProperty value) { wrapperContained.ROTATION = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ATTACHED); }
// public void ATTACHED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.ATTACHED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DEFAULT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DEFAULT_SHAPE); }
// public void DEFAULT_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DEFAULT_SHAPE = value.wrapperContained; }
// public java.util.Map SHAPES_FOR_ROTATION() { return wrapperContained.SHAPES_FOR_ROTATION; }
// public void SHAPES_FOR_ROTATION(java.util.Map value) { wrapperContained.SHAPES_FOR_ROTATION = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean shouldTryAttaching(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.entity.SignBlockEntity sign,yarnwrap.item.ItemStack stack) { return wrapperContained.shouldTryAttaching(player.wrapperContained,hitResult.wrapperContained,sign.wrapperContained,stack.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53991(Object instance) { return wrapperContained.method_53991(instance); }

}