package yarnwrap.block.entity;
public class ChiseledBookshelfBlockEntity { public net.minecraft.block.entity.ChiseledBookshelfBlockEntity wrapperContained; public ChiseledBookshelfBlockEntity(net.minecraft.block.entity.ChiseledBookshelfBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_BOOKS() { return wrapperContained.MAX_BOOKS; }
// public void MAX_BOOKS(int value) { wrapperContained.MAX_BOOKS = value; }
public static int MAX_BOOKS() { return net.minecraft.block.entity.ChiseledBookshelfBlockEntity.MAX_BOOKS; }
// public static void MAX_BOOKS(int value, ) { net.minecraft.block.entity.ChiseledBookshelfBlockEntity.MAX_BOOKS = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.ChiseledBookshelfBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.ChiseledBookshelfBlockEntity.LOGGER = value; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.block.entity.ChiseledBookshelfBlockEntity.inventory); }
// public static void inventory(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.block.entity.ChiseledBookshelfBlockEntity.inventory = value.wrapperContained; }

// public int lastInteractedSlot() { return wrapperContained.lastInteractedSlot; }
// public void lastInteractedSlot(int value) { wrapperContained.lastInteractedSlot = value; }
// public static int lastInteractedSlot() { return net.minecraft.block.entity.ChiseledBookshelfBlockEntity.lastInteractedSlot; }
// public static void lastInteractedSlot(int value, ) { net.minecraft.block.entity.ChiseledBookshelfBlockEntity.lastInteractedSlot = value; }

public ChiseledBookshelfBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.ChiseledBookshelfBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public void updateState(int interactedSlot) { wrapperContained.updateState(interactedSlot); }
// public static void updateState(int interactedSlot, ) { net.minecraft.block.entity.ChiseledBookshelfBlockEntity.updateState(interactedSlot); }
public int getFilledSlotCount() { return wrapperContained.getFilledSlotCount(); }
// public static int getFilledSlotCount() { return net.minecraft.block.entity.ChiseledBookshelfBlockEntity.getFilledSlotCount(); }
public int getLastInteractedSlot() { return wrapperContained.getLastInteractedSlot(); }
// public static int getLastInteractedSlot() { return net.minecraft.block.entity.ChiseledBookshelfBlockEntity.getLastInteractedSlot(); }
// public boolean method_51356(yarnwrap.item.ItemStack stack2) { return wrapperContained.method_51356(stack2.wrapperContained); }
// public static boolean method_51356(yarnwrap.item.ItemStack stack2, ) { return net.minecraft.block.entity.ChiseledBookshelfBlockEntity.method_51356(stack2.wrapperContained); }

}