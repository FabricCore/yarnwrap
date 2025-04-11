package yarnwrap.screen;
public class ScreenHandler { public net.minecraft.screen.ScreenHandler wrapperContained; public ScreenHandler(net.minecraft.screen.ScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List properties() { return wrapperContained.properties; }
// public void properties(java.util.List value) { wrapperContained.properties = value; }
// public yarnwrap.screen.ScreenHandlerType type() { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.type); }
// public void type(yarnwrap.screen.ScreenHandlerType value) { wrapperContained.type = value.wrapperContained; }
// public yarnwrap.item.ItemStack cursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.cursorStack); }
// public void cursorStack(yarnwrap.item.ItemStack value) { wrapperContained.cursorStack = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList previousTrackedStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.previousTrackedStacks); }
// public void previousTrackedStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.previousTrackedStacks = value.wrapperContained; }
// public yarnwrap.item.ItemStack previousCursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.previousCursorStack); }
// public void previousCursorStack(yarnwrap.item.ItemStack value) { wrapperContained.previousCursorStack = value.wrapperContained; }
// public yarnwrap.screen.ScreenHandlerSyncHandler syncHandler() { return new yarnwrap.screen.ScreenHandlerSyncHandler(wrapperContained.syncHandler); }
// public void syncHandler(yarnwrap.screen.ScreenHandlerSyncHandler value) { wrapperContained.syncHandler = value.wrapperContained; }
// public boolean disableSync() { return wrapperContained.disableSync; }
// public void disableSync(boolean value) { wrapperContained.disableSync = value; }
// public it.unimi.dsi.fastutil.ints.IntList trackedPropertyValues() { return wrapperContained.trackedPropertyValues; }
// public void trackedPropertyValues(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.trackedPropertyValues = value; }
public int EMPTY_SPACE_SLOT_INDEX() { return wrapperContained.EMPTY_SPACE_SLOT_INDEX; }
// public void EMPTY_SPACE_SLOT_INDEX(int value) { wrapperContained.EMPTY_SPACE_SLOT_INDEX = value; }
// public int revision() { return wrapperContained.revision; }
// public void revision(int value) { wrapperContained.revision = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Set quickCraftSlots() { return wrapperContained.quickCraftSlots; }
// public void quickCraftSlots(java.util.Set value) { wrapperContained.quickCraftSlots = value; }
// public int quickCraftStage() { return wrapperContained.quickCraftStage; }
// public void quickCraftStage(int value) { wrapperContained.quickCraftStage = value; }
public yarnwrap.util.collection.DefaultedList slots() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.slots); }
// public void slots(yarnwrap.util.collection.DefaultedList value) { wrapperContained.slots = value.wrapperContained; }
// public int quickCraftButton() { return wrapperContained.quickCraftButton; }
// public void quickCraftButton(int value) { wrapperContained.quickCraftButton = value; }
public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public yarnwrap.util.collection.DefaultedList trackedStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.trackedStacks); }
// public void trackedStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.trackedStacks = value.wrapperContained; }
// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
public yarnwrap.screen.ScreenHandlerType getType() { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.getType()); }
// public void checkSize(yarnwrap.inventory.Inventory inventory,int expectedSize) { wrapperContained.checkSize(inventory.wrapperContained,expectedSize); }
// public void addProperties(yarnwrap.screen.PropertyDelegate propertyDelegate) { wrapperContained.addProperties(propertyDelegate.wrapperContained); }
// public void checkDataCount(yarnwrap.screen.PropertyDelegate data,int expectedCount) { wrapperContained.checkDataCount(data.wrapperContained,expectedCount); }
// public yarnwrap.screen.Property addProperty(yarnwrap.screen.Property property) { return new yarnwrap.screen.Property(wrapperContained.addProperty(property.wrapperContained)); }
// public boolean canUse(yarnwrap.screen.ScreenHandlerContext context,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.Block block) { return wrapperContained.canUse(context.wrapperContained,player.wrapperContained,block.wrapperContained); }
// public void internalOnSlotClick(int slotIndex,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.internalOnSlotClick(slotIndex,button,actionType.wrapperContained,player.wrapperContained); }
public void setPreviousTrackedSlot(int slot,yarnwrap.item.ItemStack stack) { wrapperContained.setPreviousTrackedSlot(slot,stack.wrapperContained); }
// public void updateTrackedSlot(int slot,yarnwrap.item.ItemStack stack,java.util.function.Supplier copySupplier) { wrapperContained.updateTrackedSlot(slot,stack.wrapperContained,copySupplier); }
public void copySharedSlots(yarnwrap.screen.ScreenHandler handler) { wrapperContained.copySharedSlots(handler.wrapperContained); }
public void updateSyncHandler(yarnwrap.screen.ScreenHandlerSyncHandler handler) { wrapperContained.updateSyncHandler(handler.wrapperContained); }
public void setPreviousCursorStack(yarnwrap.item.ItemStack stack) { wrapperContained.setPreviousCursorStack(stack.wrapperContained); }
public void syncState() { wrapperContained.syncState(); }
// public void checkSlotUpdates(int slot,yarnwrap.item.ItemStack stack,java.util.function.Supplier copySupplier) { wrapperContained.checkSlotUpdates(slot,stack.wrapperContained,copySupplier); }
public void setCursorStack(yarnwrap.item.ItemStack stack) { wrapperContained.setCursorStack(stack.wrapperContained); }
public yarnwrap.item.ItemStack getCursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.getCursorStack()); }
public void disableSyncing() { wrapperContained.disableSyncing(); }
public void enableSyncing() { wrapperContained.enableSyncing(); }
// public void checkCursorStackUpdates() { wrapperContained.checkCursorStackUpdates(); }
// public yarnwrap.inventory.StackReference getCursorStackReference() { return new yarnwrap.inventory.StackReference(wrapperContained.getCursorStackReference()); }
// public void checkPropertyUpdates(int id,int value) { wrapperContained.checkPropertyUpdates(id,value); }
public java.util.OptionalInt getSlotIndex(yarnwrap.inventory.Inventory inventory,int index) { return wrapperContained.getSlotIndex(inventory.wrapperContained,index); }
// public void notifyPropertyUpdate(int index,int value) { wrapperContained.notifyPropertyUpdate(index,value); }
public void updateToClient() { wrapperContained.updateToClient(); }
public int getRevision() { return wrapperContained.getRevision(); }
public int nextRevision() { return wrapperContained.nextRevision(); }
public void setPreviousTrackedSlotMutable(int slot,yarnwrap.item.ItemStack stack) { wrapperContained.setPreviousTrackedSlotMutable(slot,stack.wrapperContained); }
public boolean isValid(int slot) { return wrapperContained.isValid(slot); }
// public boolean handleSlotClick(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.ClickType clickType,yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack cursorStack) { return wrapperContained.handleSlotClick(player.wrapperContained,clickType.wrapperContained,slot.wrapperContained,stack.wrapperContained,cursorStack.wrapperContained); }
public int packQuickCraftData(int quickCraftStage,int buttonId) { return wrapperContained.packQuickCraftData(quickCraftStage,buttonId); }
public boolean canInsertItemIntoSlot(yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack,boolean allowOverflow) { return wrapperContained.canInsertItemIntoSlot(slot.wrapperContained,stack.wrapperContained,allowOverflow); }
public void onSlotClick(int slotIndex,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onSlotClick(slotIndex,button,actionType.wrapperContained,player.wrapperContained); }
public int unpackQuickCraftStage(int quickCraftData) { return wrapperContained.unpackQuickCraftStage(quickCraftData); }
public void onClosed(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onClosed(player.wrapperContained); }
public void addListener(yarnwrap.screen.ScreenHandlerListener listener) { wrapperContained.addListener(listener.wrapperContained); }
public boolean canUse(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canUse(player.wrapperContained); }
public boolean shouldQuickCraftContinue(int stage,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.shouldQuickCraftContinue(stage,player.wrapperContained); }
public yarnwrap.item.ItemStack quickMove(yarnwrap.entity.player.PlayerEntity player,int slot) { return new yarnwrap.item.ItemStack(wrapperContained.quickMove(player.wrapperContained,slot)); }
public yarnwrap.util.collection.DefaultedList getStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getStacks()); }
public void removeListener(yarnwrap.screen.ScreenHandlerListener listener) { wrapperContained.removeListener(listener.wrapperContained); }
public boolean onButtonClick(yarnwrap.entity.player.PlayerEntity player,int id) { return wrapperContained.onButtonClick(player.wrapperContained,id); }
// public void endQuickCraft() { wrapperContained.endQuickCraft(); }
public void setProperty(int id,int value) { wrapperContained.setProperty(id,value); }
// public void dropInventory(yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.Inventory inventory) { wrapperContained.dropInventory(player.wrapperContained,inventory.wrapperContained); }
public int calculateComparatorOutput(yarnwrap.block.entity.BlockEntity entity) { return wrapperContained.calculateComparatorOutput(entity.wrapperContained); }
public void onContentChanged(yarnwrap.inventory.Inventory inventory) { wrapperContained.onContentChanged(inventory.wrapperContained); }
public void updateSlotStacks(int revision,java.util.List stacks,yarnwrap.item.ItemStack cursorStack) { wrapperContained.updateSlotStacks(revision,stacks,cursorStack.wrapperContained); }
public yarnwrap.screen.slot.Slot getSlot(int index) { return new yarnwrap.screen.slot.Slot(wrapperContained.getSlot(index)); }
public boolean canInsertIntoSlot(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot) { return wrapperContained.canInsertIntoSlot(stack.wrapperContained,slot.wrapperContained); }
public boolean canInsertIntoSlot(yarnwrap.screen.slot.Slot slot) { return wrapperContained.canInsertIntoSlot(slot.wrapperContained); }
// public boolean insertItem(yarnwrap.item.ItemStack stack,int startIndex,int endIndex,boolean fromLast) { return wrapperContained.insertItem(stack.wrapperContained,startIndex,endIndex,fromLast); }
public int calculateStackSize(java.util.Set slots,int mode,yarnwrap.item.ItemStack stack) { return wrapperContained.calculateStackSize(slots,mode,stack.wrapperContained); }
public int calculateComparatorOutput(yarnwrap.inventory.Inventory inventory) { return wrapperContained.calculateComparatorOutput(inventory.wrapperContained); }
public void setStackInSlot(int slot,int revision,yarnwrap.item.ItemStack stack) { wrapperContained.setStackInSlot(slot,revision,stack.wrapperContained); }
public int unpackQuickCraftButton(int quickCraftData) { return wrapperContained.unpackQuickCraftButton(quickCraftData); }
// public yarnwrap.screen.slot.Slot addSlot(yarnwrap.screen.slot.Slot slot) { return new yarnwrap.screen.slot.Slot(wrapperContained.addSlot(slot.wrapperContained)); }
public void sendContentUpdates() { wrapperContained.sendContentUpdates(); }

}