package yarnwrap.block.entity;
public class ChiseledBookshelfBlockEntity { public net.minecraft.block.entity.ChiseledBookshelfBlockEntity wrapperContained; public ChiseledBookshelfBlockEntity(net.minecraft.block.entity.ChiseledBookshelfBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_BOOKS() { return wrapperContained.MAX_BOOKS; }
// public void MAX_BOOKS(int value) { wrapperContained.MAX_BOOKS = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public int lastInteractedSlot() { return wrapperContained.lastInteractedSlot; }
// public void lastInteractedSlot(int value) { wrapperContained.lastInteractedSlot = value; }
// public void updateState(int interactedSlot) { wrapperContained.updateState(interactedSlot); }
public int getFilledSlotCount() { return wrapperContained.getFilledSlotCount(); }
public int getLastInteractedSlot() { return wrapperContained.getLastInteractedSlot(); }

}