package yarnwrap.block;
public class HangingSignBlock { public net.minecraft.block.HangingSignBlock wrapperContained; public HangingSignBlock(net.minecraft.block.HangingSignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(wrapperContained.ROTATION); }
public yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ATTACHED); }
// public yarnwrap.util.shape.VoxelShape DEFAULT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DEFAULT_SHAPE); }
// public java.util.Map SHAPES_FOR_ROTATION() { return wrapperContained.SHAPES_FOR_ROTATION; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean shouldTryAttaching(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.block.entity.SignBlockEntity sign,yarnwrap.item.ItemStack stack) { return wrapperContained.shouldTryAttaching(player.wrapperContained,hitResult.wrapperContained,sign.wrapperContained,stack.wrapperContained); }

}