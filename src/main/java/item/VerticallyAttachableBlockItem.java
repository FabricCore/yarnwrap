package yarnwrap.item;
public class VerticallyAttachableBlockItem { public net.minecraft.item.VerticallyAttachableBlockItem wrapperContained; public VerticallyAttachableBlockItem(net.minecraft.item.VerticallyAttachableBlockItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction verticalAttachmentDirection() { return new yarnwrap.util.math.Direction(wrapperContained.verticalAttachmentDirection); }
// public yarnwrap.block.Block wallBlock() { return new yarnwrap.block.Block(wrapperContained.wallBlock); }
// public boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlaceAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }

}