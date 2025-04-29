package yarnwrap.block;
public class ChiseledBookshelfBlock { public net.minecraft.block.ChiseledBookshelfBlock wrapperContained; public ChiseledBookshelfBlock(net.minecraft.block.ChiseledBookshelfBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public int BOOK_HEIGHT() { return wrapperContained.BOOK_HEIGHT; }
// public void BOOK_HEIGHT(int value) { wrapperContained.BOOK_HEIGHT = value; }
public static int BOOK_HEIGHT() { return net.minecraft.block.ChiseledBookshelfBlock.BOOK_HEIGHT; }
// public static void BOOK_HEIGHT(int value, ) { net.minecraft.block.ChiseledBookshelfBlock.BOOK_HEIGHT = value; }

// public java.util.List SLOT_OCCUPIED_PROPERTIES() { return wrapperContained.SLOT_OCCUPIED_PROPERTIES; }
// public void SLOT_OCCUPIED_PROPERTIES(java.util.List value) { wrapperContained.SLOT_OCCUPIED_PROPERTIES = value; }
public static java.util.List SLOT_OCCUPIED_PROPERTIES() { return net.minecraft.block.ChiseledBookshelfBlock.SLOT_OCCUPIED_PROPERTIES; }
// public static void SLOT_OCCUPIED_PROPERTIES(java.util.List value, ) { net.minecraft.block.ChiseledBookshelfBlock.SLOT_OCCUPIED_PROPERTIES = value; }

// public int MAX_BOOK_COUNT() { return wrapperContained.MAX_BOOK_COUNT; }
// public void MAX_BOOK_COUNT(int value) { wrapperContained.MAX_BOOK_COUNT = value; }
// public static int MAX_BOOK_COUNT() { return net.minecraft.block.ChiseledBookshelfBlock.MAX_BOOK_COUNT; }
// public static void MAX_BOOK_COUNT(int value, ) { net.minecraft.block.ChiseledBookshelfBlock.MAX_BOOK_COUNT = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ChiseledBookshelfBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ChiseledBookshelfBlock.CODEC = value; }

// public void tryRemoveBook(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.ChiseledBookshelfBlockEntity blockEntity,int slot) { wrapperContained.tryRemoveBook(world.wrapperContained,pos.wrapperContained,player.wrapperContained,blockEntity.wrapperContained,slot); }
// public static void tryRemoveBook(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.ChiseledBookshelfBlockEntity blockEntity,int slot, ) { net.minecraft.block.ChiseledBookshelfBlock.tryRemoveBook(world.wrapperContained,pos.wrapperContained,player.wrapperContained,blockEntity.wrapperContained,slot); }
// public void tryAddBook(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.ChiseledBookshelfBlockEntity blockEntity,yarnwrap.item.ItemStack stack,int slot) { wrapperContained.tryAddBook(world.wrapperContained,pos.wrapperContained,player.wrapperContained,blockEntity.wrapperContained,stack.wrapperContained,slot); }
// public static void tryAddBook(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.entity.ChiseledBookshelfBlockEntity blockEntity,yarnwrap.item.ItemStack stack,int slot, ) { net.minecraft.block.ChiseledBookshelfBlock.tryAddBook(world.wrapperContained,pos.wrapperContained,player.wrapperContained,blockEntity.wrapperContained,stack.wrapperContained,slot); }
// public int getColumn(float x) { return wrapperContained.getColumn(x); }
// public static int getColumn(float x, ) { return net.minecraft.block.ChiseledBookshelfBlock.getColumn(x); }
// public void method_47578(Object property) { wrapperContained.method_47578(property); }
// public static void method_47578(Object property, ) { net.minecraft.block.ChiseledBookshelfBlock.method_47578(property); }
// public java.util.Optional getHitPos(yarnwrap.util.hit.BlockHitResult hit,yarnwrap.util.math.Direction facing) { return wrapperContained.getHitPos(hit.wrapperContained,facing.wrapperContained); }
// public static java.util.Optional getHitPos(yarnwrap.util.hit.BlockHitResult hit,yarnwrap.util.math.Direction facing, ) { return net.minecraft.block.ChiseledBookshelfBlock.getHitPos(hit.wrapperContained,facing.wrapperContained); }
// public java.util.OptionalInt getSlotForHitPos(yarnwrap.util.hit.BlockHitResult hit,yarnwrap.block.BlockState state) { return wrapperContained.getSlotForHitPos(hit.wrapperContained,state.wrapperContained); }
// public static java.util.OptionalInt getSlotForHitPos(yarnwrap.util.hit.BlockHitResult hit,yarnwrap.block.BlockState state, ) { return net.minecraft.block.ChiseledBookshelfBlock.getSlotForHitPos(hit.wrapperContained,state.wrapperContained); }
// public java.util.OptionalInt method_55772(yarnwrap.util.math.Vec2f hitPos) { return wrapperContained.method_55772(hitPos.wrapperContained); }
// public static java.util.OptionalInt method_55772(yarnwrap.util.math.Vec2f hitPos, ) { return net.minecraft.block.ChiseledBookshelfBlock.method_55772(hitPos.wrapperContained); }

}