package yarnwrap.block.entity;
public class ChiseledBookshelfBlockEntity { public net.minecraft.block.entity.ChiseledBookshelfBlockEntity wrapperContained; public ChiseledBookshelfBlockEntity(net.minecraft.block.entity.ChiseledBookshelfBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_BOOKS() { return wrapperContained.MAX_BOOKS; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public int lastInteractedSlot() { return wrapperContained.lastInteractedSlot; }
// public void updateState(int interactedSlot) { wrapperContained.updateState(interactedSlot); }
public int getFilledSlotCount() { return wrapperContained.getFilledSlotCount(); }
public int getLastInteractedSlot() { return wrapperContained.getLastInteractedSlot(); }

}