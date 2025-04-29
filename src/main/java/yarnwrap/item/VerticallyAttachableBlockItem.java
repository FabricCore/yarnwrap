package yarnwrap.item;
public class VerticallyAttachableBlockItem { public net.minecraft.item.VerticallyAttachableBlockItem wrapperContained; public VerticallyAttachableBlockItem(net.minecraft.item.VerticallyAttachableBlockItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction verticalAttachmentDirection() { return new yarnwrap.util.math.Direction(wrapperContained.verticalAttachmentDirection); }
// public void verticalAttachmentDirection(yarnwrap.util.math.Direction value) { wrapperContained.verticalAttachmentDirection = value.wrapperContained; }
// public static yarnwrap.util.math.Direction verticalAttachmentDirection() { return new yarnwrap.util.math.Direction(net.minecraft.item.VerticallyAttachableBlockItem.verticalAttachmentDirection); }
// public static void verticalAttachmentDirection(yarnwrap.util.math.Direction value, ) { net.minecraft.item.VerticallyAttachableBlockItem.verticalAttachmentDirection = value.wrapperContained; }

// public yarnwrap.block.Block wallBlock() { return new yarnwrap.block.Block(wrapperContained.wallBlock); }
// public void wallBlock(yarnwrap.block.Block value) { wrapperContained.wallBlock = value.wrapperContained; }
// public static yarnwrap.block.Block wallBlock() { return new yarnwrap.block.Block(net.minecraft.item.VerticallyAttachableBlockItem.wallBlock); }
// public static void wallBlock(yarnwrap.block.Block value, ) { net.minecraft.item.VerticallyAttachableBlockItem.wallBlock = value.wrapperContained; }

// public VerticallyAttachableBlockItem(yarnwrap.block.Block standingBlock,yarnwrap.block.Block wallBlock,Object settings,yarnwrap.util.math.Direction verticalAttachmentDirection) { this.wrapperContained = new net.minecraft.item.VerticallyAttachableBlockItem(standingBlock.wrapperContained,wallBlock.wrapperContained,settings,verticalAttachmentDirection.wrapperContained); }
// public boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlaceAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public static boolean canPlaceAt(yarnwrap.world.WorldView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.item.VerticallyAttachableBlockItem.canPlaceAt(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }

}