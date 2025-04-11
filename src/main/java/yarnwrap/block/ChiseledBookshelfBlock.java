package yarnwrap.block;
public class ChiseledBookshelfBlock { public net.minecraft.block.ChiseledBookshelfBlock wrapperContained; public ChiseledBookshelfBlock(net.minecraft.block.ChiseledBookshelfBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public int BOOK_HEIGHT() { return wrapperContained.BOOK_HEIGHT; }
// public void BOOK_HEIGHT(int value) { wrapperContained.BOOK_HEIGHT = value; }
public java.util.List SLOT_OCCUPIED_PROPERTIES() { return wrapperContained.SLOT_OCCUPIED_PROPERTIES; }
// public void SLOT_OCCUPIED_PROPERTIES(java.util.List value) { wrapperContained.SLOT_OCCUPIED_PROPERTIES = value; }
// public int MAX_BOOK_COUNT() { return wrapperContained.MAX_BOOK_COUNT; }
// public void MAX_BOOK_COUNT(int value) { wrapperContained.MAX_BOOK_COUNT = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void tryRemoveBook(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.ChiseledBookshelfBlockEntity blockEntity,int slot) { wrapperContained.tryRemoveBook(world.wrapperContained,pos.wrapperContained,player.wrapperContained,blockEntity.wrapperContained,slot); }
// public void tryAddBook(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.ChiseledBookshelfBlockEntity blockEntity,yarnwrap.item.ItemStack stack,int slot) { wrapperContained.tryAddBook(world.wrapperContained,pos.wrapperContained,player.wrapperContained,blockEntity.wrapperContained,stack.wrapperContained,slot); }
// public int getColumn(float x) { return wrapperContained.getColumn(x); }
// public java.util.Optional getHitPos(yarnwrap.util.hit.BlockHitResult hit,yarnwrap.util.math.Direction facing) { return wrapperContained.getHitPos(hit.wrapperContained,facing.wrapperContained); }
// public java.util.OptionalInt getSlotForHitPos(yarnwrap.util.hit.BlockHitResult hit,yarnwrap.block.BlockState state) { return wrapperContained.getSlotForHitPos(hit.wrapperContained,state.wrapperContained); }

}