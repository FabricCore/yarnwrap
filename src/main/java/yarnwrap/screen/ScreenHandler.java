package yarnwrap.screen;
public class ScreenHandler { public net.minecraft.screen.ScreenHandler wrapperContained; public ScreenHandler(net.minecraft.screen.ScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set quickCraftSlots() { return wrapperContained.quickCraftSlots; }
// public void quickCraftSlots(java.util.Set value) { wrapperContained.quickCraftSlots = value; }
// public static java.util.Set quickCraftSlots() { return net.minecraft.screen.ScreenHandler.quickCraftSlots; }
// public static void quickCraftSlots(java.util.Set value, ) { net.minecraft.screen.ScreenHandler.quickCraftSlots = value; }

// public int quickCraftStage() { return wrapperContained.quickCraftStage; }
// public void quickCraftStage(int value) { wrapperContained.quickCraftStage = value; }
// public static int quickCraftStage() { return net.minecraft.screen.ScreenHandler.quickCraftStage; }
// public static void quickCraftStage(int value, ) { net.minecraft.screen.ScreenHandler.quickCraftStage = value; }

public yarnwrap.util.collection.DefaultedList slots() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.slots); }
// public void slots(yarnwrap.util.collection.DefaultedList value) { wrapperContained.slots = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList slots() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.screen.ScreenHandler.slots); }
// public static void slots(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.screen.ScreenHandler.slots = value.wrapperContained; }

// public int quickCraftButton() { return wrapperContained.quickCraftButton; }
// public void quickCraftButton(int value) { wrapperContained.quickCraftButton = value; }
// public static int quickCraftButton() { return net.minecraft.screen.ScreenHandler.quickCraftButton; }
// public static void quickCraftButton(int value, ) { net.minecraft.screen.ScreenHandler.quickCraftButton = value; }

public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.screen.ScreenHandler.syncId; }
// public static void syncId(int value, ) { net.minecraft.screen.ScreenHandler.syncId = value; }

// public yarnwrap.util.collection.DefaultedList trackedStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.trackedStacks); }
// public void trackedStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.trackedStacks = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList trackedStacks() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.screen.ScreenHandler.trackedStacks); }
// public static void trackedStacks(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.screen.ScreenHandler.trackedStacks = value.wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public static java.util.List listeners() { return net.minecraft.screen.ScreenHandler.listeners; }
// public static void listeners(java.util.List value, ) { net.minecraft.screen.ScreenHandler.listeners = value; }

// public java.util.List properties() { return wrapperContained.properties; }
// public void properties(java.util.List value) { wrapperContained.properties = value; }
// public static java.util.List properties() { return net.minecraft.screen.ScreenHandler.properties; }
// public static void properties(java.util.List value, ) { net.minecraft.screen.ScreenHandler.properties = value; }

// public yarnwrap.screen.ScreenHandlerType type() { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.type); }
// public void type(yarnwrap.screen.ScreenHandlerType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerType type() { return new yarnwrap.screen.ScreenHandlerType(net.minecraft.screen.ScreenHandler.type); }
// public static void type(yarnwrap.screen.ScreenHandlerType value, ) { net.minecraft.screen.ScreenHandler.type = value.wrapperContained; }

// public yarnwrap.item.ItemStack cursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.cursorStack); }
// public void cursorStack(yarnwrap.item.ItemStack value) { wrapperContained.cursorStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack cursorStack() { return new yarnwrap.item.ItemStack(net.minecraft.screen.ScreenHandler.cursorStack); }
// public static void cursorStack(yarnwrap.item.ItemStack value, ) { net.minecraft.screen.ScreenHandler.cursorStack = value.wrapperContained; }

// public yarnwrap.util.collection.DefaultedList trackedSlots() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.trackedSlots); }
// public void trackedSlots(yarnwrap.util.collection.DefaultedList value) { wrapperContained.trackedSlots = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList trackedSlots() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.screen.ScreenHandler.trackedSlots); }
// public static void trackedSlots(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.screen.ScreenHandler.trackedSlots = value.wrapperContained; }

// public yarnwrap.screen.sync.TrackedSlot trackedCursorSlot() { return new yarnwrap.screen.sync.TrackedSlot(wrapperContained.trackedCursorSlot); }
// public void trackedCursorSlot(yarnwrap.screen.sync.TrackedSlot value) { wrapperContained.trackedCursorSlot = value.wrapperContained; }
// public static yarnwrap.screen.sync.TrackedSlot trackedCursorSlot() { return new yarnwrap.screen.sync.TrackedSlot(net.minecraft.screen.ScreenHandler.trackedCursorSlot); }
// public static void trackedCursorSlot(yarnwrap.screen.sync.TrackedSlot value, ) { net.minecraft.screen.ScreenHandler.trackedCursorSlot = value.wrapperContained; }

// public yarnwrap.screen.ScreenHandlerSyncHandler syncHandler() { return new yarnwrap.screen.ScreenHandlerSyncHandler(wrapperContained.syncHandler); }
// public void syncHandler(yarnwrap.screen.ScreenHandlerSyncHandler value) { wrapperContained.syncHandler = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerSyncHandler syncHandler() { return new yarnwrap.screen.ScreenHandlerSyncHandler(net.minecraft.screen.ScreenHandler.syncHandler); }
// public static void syncHandler(yarnwrap.screen.ScreenHandlerSyncHandler value, ) { net.minecraft.screen.ScreenHandler.syncHandler = value.wrapperContained; }

// public boolean disableSync() { return wrapperContained.disableSync; }
// public void disableSync(boolean value) { wrapperContained.disableSync = value; }
// public static boolean disableSync() { return net.minecraft.screen.ScreenHandler.disableSync; }
// public static void disableSync(boolean value, ) { net.minecraft.screen.ScreenHandler.disableSync = value; }

// public it.unimi.dsi.fastutil.ints.IntList trackedPropertyValues() { return wrapperContained.trackedPropertyValues; }
// public void trackedPropertyValues(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.trackedPropertyValues = value; }
// public static it.unimi.dsi.fastutil.ints.IntList trackedPropertyValues() { return net.minecraft.screen.ScreenHandler.trackedPropertyValues; }
// public static void trackedPropertyValues(it.unimi.dsi.fastutil.ints.IntList value, ) { net.minecraft.screen.ScreenHandler.trackedPropertyValues = value; }

// public int EMPTY_SPACE_SLOT_INDEX() { return wrapperContained.EMPTY_SPACE_SLOT_INDEX; }
// public void EMPTY_SPACE_SLOT_INDEX(int value) { wrapperContained.EMPTY_SPACE_SLOT_INDEX = value; }
public static int EMPTY_SPACE_SLOT_INDEX() { return net.minecraft.screen.ScreenHandler.EMPTY_SPACE_SLOT_INDEX; }
// public static void EMPTY_SPACE_SLOT_INDEX(int value, ) { net.minecraft.screen.ScreenHandler.EMPTY_SPACE_SLOT_INDEX = value; }

// public int revision() { return wrapperContained.revision; }
// public void revision(int value) { wrapperContained.revision = value; }
// public static int revision() { return net.minecraft.screen.ScreenHandler.revision; }
// public static void revision(int value, ) { net.minecraft.screen.ScreenHandler.revision = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.screen.ScreenHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.screen.ScreenHandler.LOGGER = value; }

// public ScreenHandler(yarnwrap.screen.ScreenHandlerType type,int syncId) { this.wrapperContained = new net.minecraft.screen.ScreenHandler(type.wrapperContained,syncId); }
// public int packQuickCraftData(int quickCraftStage,int buttonId) { return wrapperContained.packQuickCraftData(quickCraftStage,buttonId); }
// public static int packQuickCraftData(int quickCraftStage,int buttonId, ) { return net.minecraft.screen.ScreenHandler.packQuickCraftData(quickCraftStage,buttonId); }
// public boolean canInsertItemIntoSlot(yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack,boolean allowOverflow) { return wrapperContained.canInsertItemIntoSlot(slot.wrapperContained,stack.wrapperContained,allowOverflow); }
// public static boolean canInsertItemIntoSlot(yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack,boolean allowOverflow, ) { return net.minecraft.screen.ScreenHandler.canInsertItemIntoSlot(slot.wrapperContained,stack.wrapperContained,allowOverflow); }
public void onSlotClick(int slotIndex,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onSlotClick(slotIndex,button,actionType.wrapperContained,player.wrapperContained); }
// public static void onSlotClick(int slotIndex,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.screen.ScreenHandler.onSlotClick(slotIndex,button,actionType.wrapperContained,player.wrapperContained); }
// public int unpackQuickCraftStage(int quickCraftData) { return wrapperContained.unpackQuickCraftStage(quickCraftData); }
// public static int unpackQuickCraftStage(int quickCraftData, ) { return net.minecraft.screen.ScreenHandler.unpackQuickCraftStage(quickCraftData); }
public void onClosed(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onClosed(player.wrapperContained); }
// public static void onClosed(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.screen.ScreenHandler.onClosed(player.wrapperContained); }
public void addListener(yarnwrap.screen.ScreenHandlerListener listener) { wrapperContained.addListener(listener.wrapperContained); }
// public static void addListener(yarnwrap.screen.ScreenHandlerListener listener, ) { net.minecraft.screen.ScreenHandler.addListener(listener.wrapperContained); }
public boolean canUse(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canUse(player.wrapperContained); }
// public static boolean canUse(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.screen.ScreenHandler.canUse(player.wrapperContained); }
// public boolean shouldQuickCraftContinue(int stage,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.shouldQuickCraftContinue(stage,player.wrapperContained); }
// public static boolean shouldQuickCraftContinue(int stage,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.screen.ScreenHandler.shouldQuickCraftContinue(stage,player.wrapperContained); }
public yarnwrap.item.ItemStack quickMove(yarnwrap.entity.player.PlayerEntity player,int slot) { return new yarnwrap.item.ItemStack(wrapperContained.quickMove(player.wrapperContained,slot)); }
// public static yarnwrap.item.ItemStack quickMove(yarnwrap.entity.player.PlayerEntity player,int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.screen.ScreenHandler.quickMove(player.wrapperContained,slot)); }
public yarnwrap.util.collection.DefaultedList getStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getStacks()); }
// public static yarnwrap.util.collection.DefaultedList getStacks() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.screen.ScreenHandler.getStacks()); }
public void removeListener(yarnwrap.screen.ScreenHandlerListener listener) { wrapperContained.removeListener(listener.wrapperContained); }
// public static void removeListener(yarnwrap.screen.ScreenHandlerListener listener, ) { net.minecraft.screen.ScreenHandler.removeListener(listener.wrapperContained); }
public boolean onButtonClick(yarnwrap.entity.player.PlayerEntity player,int id) { return wrapperContained.onButtonClick(player.wrapperContained,id); }
// public static boolean onButtonClick(yarnwrap.entity.player.PlayerEntity player,int id, ) { return net.minecraft.screen.ScreenHandler.onButtonClick(player.wrapperContained,id); }
// public void endQuickCraft() { wrapperContained.endQuickCraft(); }
// public static void endQuickCraft() { net.minecraft.screen.ScreenHandler.endQuickCraft(); }
public void setProperty(int id,int value) { wrapperContained.setProperty(id,value); }
// public static void setProperty(int id,int value, ) { net.minecraft.screen.ScreenHandler.setProperty(id,value); }
// public void dropInventory(yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.Inventory inventory) { wrapperContained.dropInventory(player.wrapperContained,inventory.wrapperContained); }
// public static void dropInventory(yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.Inventory inventory, ) { net.minecraft.screen.ScreenHandler.dropInventory(player.wrapperContained,inventory.wrapperContained); }
// public int calculateComparatorOutput(yarnwrap.block.entity.BlockEntity entity) { return wrapperContained.calculateComparatorOutput(entity.wrapperContained); }
// public static int calculateComparatorOutput(yarnwrap.block.entity.BlockEntity entity, ) { return net.minecraft.screen.ScreenHandler.calculateComparatorOutput(entity.wrapperContained); }
public void onContentChanged(yarnwrap.inventory.Inventory inventory) { wrapperContained.onContentChanged(inventory.wrapperContained); }
// public static void onContentChanged(yarnwrap.inventory.Inventory inventory, ) { net.minecraft.screen.ScreenHandler.onContentChanged(inventory.wrapperContained); }
public void updateSlotStacks(int revision,java.util.List stacks,yarnwrap.item.ItemStack cursorStack) { wrapperContained.updateSlotStacks(revision,stacks,cursorStack.wrapperContained); }
// public static void updateSlotStacks(int revision,java.util.List stacks,yarnwrap.item.ItemStack cursorStack, ) { net.minecraft.screen.ScreenHandler.updateSlotStacks(revision,stacks,cursorStack.wrapperContained); }
public yarnwrap.screen.slot.Slot getSlot(int index) { return new yarnwrap.screen.slot.Slot(wrapperContained.getSlot(index)); }
// public static yarnwrap.screen.slot.Slot getSlot(int index, ) { return new yarnwrap.screen.slot.Slot(net.minecraft.screen.ScreenHandler.getSlot(index)); }
public boolean canInsertIntoSlot(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot) { return wrapperContained.canInsertIntoSlot(stack.wrapperContained,slot.wrapperContained); }
// public static boolean canInsertIntoSlot(yarnwrap.item.ItemStack stack,yarnwrap.screen.slot.Slot slot, ) { return net.minecraft.screen.ScreenHandler.canInsertIntoSlot(stack.wrapperContained,slot.wrapperContained); }
public boolean canInsertIntoSlot(yarnwrap.screen.slot.Slot slot) { return wrapperContained.canInsertIntoSlot(slot.wrapperContained); }
// public static boolean canInsertIntoSlot(yarnwrap.screen.slot.Slot slot, ) { return net.minecraft.screen.ScreenHandler.canInsertIntoSlot(slot.wrapperContained); }
// public boolean insertItem(yarnwrap.item.ItemStack stack,int startIndex,int endIndex,boolean fromLast) { return wrapperContained.insertItem(stack.wrapperContained,startIndex,endIndex,fromLast); }
// public static boolean insertItem(yarnwrap.item.ItemStack stack,int startIndex,int endIndex,boolean fromLast, ) { return net.minecraft.screen.ScreenHandler.insertItem(stack.wrapperContained,startIndex,endIndex,fromLast); }
// public int calculateStackSize(java.util.Set slots,int mode,yarnwrap.item.ItemStack stack) { return wrapperContained.calculateStackSize(slots,mode,stack.wrapperContained); }
// public static int calculateStackSize(java.util.Set slots,int mode,yarnwrap.item.ItemStack stack, ) { return net.minecraft.screen.ScreenHandler.calculateStackSize(slots,mode,stack.wrapperContained); }
// public int calculateComparatorOutput(yarnwrap.inventory.Inventory inventory) { return wrapperContained.calculateComparatorOutput(inventory.wrapperContained); }
// public static int calculateComparatorOutput(yarnwrap.inventory.Inventory inventory, ) { return net.minecraft.screen.ScreenHandler.calculateComparatorOutput(inventory.wrapperContained); }
public void setStackInSlot(int slot,int revision,yarnwrap.item.ItemStack stack) { wrapperContained.setStackInSlot(slot,revision,stack.wrapperContained); }
// public static void setStackInSlot(int slot,int revision,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ScreenHandler.setStackInSlot(slot,revision,stack.wrapperContained); }
// public int unpackQuickCraftButton(int quickCraftData) { return wrapperContained.unpackQuickCraftButton(quickCraftData); }
// public static int unpackQuickCraftButton(int quickCraftData, ) { return net.minecraft.screen.ScreenHandler.unpackQuickCraftButton(quickCraftData); }
// public yarnwrap.screen.slot.Slot addSlot(yarnwrap.screen.slot.Slot slot) { return new yarnwrap.screen.slot.Slot(wrapperContained.addSlot(slot.wrapperContained)); }
// public static yarnwrap.screen.slot.Slot addSlot(yarnwrap.screen.slot.Slot slot, ) { return new yarnwrap.screen.slot.Slot(net.minecraft.screen.ScreenHandler.addSlot(slot.wrapperContained)); }
public void sendContentUpdates() { wrapperContained.sendContentUpdates(); }
// public static void sendContentUpdates() { net.minecraft.screen.ScreenHandler.sendContentUpdates(); }
public yarnwrap.screen.ScreenHandlerType getType() { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.getType()); }
// public static yarnwrap.screen.ScreenHandlerType getType() { return new yarnwrap.screen.ScreenHandlerType(net.minecraft.screen.ScreenHandler.getType()); }
// public void checkSize(yarnwrap.inventory.Inventory inventory,int expectedSize) { wrapperContained.checkSize(inventory.wrapperContained,expectedSize); }
// public static void checkSize(yarnwrap.inventory.Inventory inventory,int expectedSize, ) { net.minecraft.screen.ScreenHandler.checkSize(inventory.wrapperContained,expectedSize); }
// public void addProperties(yarnwrap.screen.PropertyDelegate propertyDelegate) { wrapperContained.addProperties(propertyDelegate.wrapperContained); }
// public static void addProperties(yarnwrap.screen.PropertyDelegate propertyDelegate, ) { net.minecraft.screen.ScreenHandler.addProperties(propertyDelegate.wrapperContained); }
// public void checkDataCount(yarnwrap.screen.PropertyDelegate data,int expectedCount) { wrapperContained.checkDataCount(data.wrapperContained,expectedCount); }
// public static void checkDataCount(yarnwrap.screen.PropertyDelegate data,int expectedCount, ) { net.minecraft.screen.ScreenHandler.checkDataCount(data.wrapperContained,expectedCount); }
// public yarnwrap.screen.Property addProperty(yarnwrap.screen.Property property) { return new yarnwrap.screen.Property(wrapperContained.addProperty(property.wrapperContained)); }
// public static yarnwrap.screen.Property addProperty(yarnwrap.screen.Property property, ) { return new yarnwrap.screen.Property(net.minecraft.screen.ScreenHandler.addProperty(property.wrapperContained)); }
// public boolean canUse(yarnwrap.screen.ScreenHandlerContext context,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.Block block) { return wrapperContained.canUse(context.wrapperContained,player.wrapperContained,block.wrapperContained); }
// public static boolean canUse(yarnwrap.screen.ScreenHandlerContext context,yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.Block block, ) { return net.minecraft.screen.ScreenHandler.canUse(context.wrapperContained,player.wrapperContained,block.wrapperContained); }
// public java.lang.Boolean method_17696(yarnwrap.block.Block world,yarnwrap.entity.player.PlayerEntity pos) { return wrapperContained.method_17696(world.wrapperContained,pos.wrapperContained); }
// public static java.lang.Boolean method_17696(yarnwrap.block.Block world,yarnwrap.entity.player.PlayerEntity pos, ) { return net.minecraft.screen.ScreenHandler.method_17696(world.wrapperContained,pos.wrapperContained); }
// public void internalOnSlotClick(int slotIndex,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.internalOnSlotClick(slotIndex,button,actionType.wrapperContained,player.wrapperContained); }
// public static void internalOnSlotClick(int slotIndex,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.screen.ScreenHandler.internalOnSlotClick(slotIndex,button,actionType.wrapperContained,player.wrapperContained); }
public void setReceivedStack(int slot,yarnwrap.item.ItemStack stack) { wrapperContained.setReceivedStack(slot,stack.wrapperContained); }
// public static void setReceivedStack(int slot,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ScreenHandler.setReceivedStack(slot,stack.wrapperContained); }
// public void updateTrackedSlot(int slot,yarnwrap.item.ItemStack stack,java.util.function.Supplier copySupplier) { wrapperContained.updateTrackedSlot(slot,stack.wrapperContained,copySupplier); }
// public static void updateTrackedSlot(int slot,yarnwrap.item.ItemStack stack,java.util.function.Supplier copySupplier, ) { net.minecraft.screen.ScreenHandler.updateTrackedSlot(slot,stack.wrapperContained,copySupplier); }
public void copySharedSlots(yarnwrap.screen.ScreenHandler handler) { wrapperContained.copySharedSlots(handler.wrapperContained); }
// public static void copySharedSlots(yarnwrap.screen.ScreenHandler handler, ) { net.minecraft.screen.ScreenHandler.copySharedSlots(handler.wrapperContained); }
public void updateSyncHandler(yarnwrap.screen.ScreenHandlerSyncHandler handler) { wrapperContained.updateSyncHandler(handler.wrapperContained); }
// public static void updateSyncHandler(yarnwrap.screen.ScreenHandlerSyncHandler handler, ) { net.minecraft.screen.ScreenHandler.updateSyncHandler(handler.wrapperContained); }
// public void method_34249(yarnwrap.screen.slot.Slot stack) { wrapperContained.method_34249(stack.wrapperContained); }
// public static void method_34249(yarnwrap.screen.slot.Slot stack, ) { net.minecraft.screen.ScreenHandler.method_34249(stack.wrapperContained); }
public void setReceivedCursorHash(yarnwrap.screen.sync.ItemStackHash cursorStackHash) { wrapperContained.setReceivedCursorHash(cursorStackHash.wrapperContained); }
// public static void setReceivedCursorHash(yarnwrap.screen.sync.ItemStackHash cursorStackHash, ) { net.minecraft.screen.ScreenHandler.setReceivedCursorHash(cursorStackHash.wrapperContained); }
// public void method_34251(yarnwrap.item.ItemStack stack) { wrapperContained.method_34251(stack.wrapperContained); }
// public static void method_34251(yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ScreenHandler.method_34251(stack.wrapperContained); }
public void syncState() { wrapperContained.syncState(); }
// public static void syncState() { net.minecraft.screen.ScreenHandler.syncState(); }
// public void checkSlotUpdates(int slot,yarnwrap.item.ItemStack stack,java.util.function.Supplier copySupplier) { wrapperContained.checkSlotUpdates(slot,stack.wrapperContained,copySupplier); }
// public static void checkSlotUpdates(int slot,yarnwrap.item.ItemStack stack,java.util.function.Supplier copySupplier, ) { net.minecraft.screen.ScreenHandler.checkSlotUpdates(slot,stack.wrapperContained,copySupplier); }
public void setCursorStack(yarnwrap.item.ItemStack stack) { wrapperContained.setCursorStack(stack.wrapperContained); }
// public static void setCursorStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ScreenHandler.setCursorStack(stack.wrapperContained); }
public yarnwrap.item.ItemStack getCursorStack() { return new yarnwrap.item.ItemStack(wrapperContained.getCursorStack()); }
// public static yarnwrap.item.ItemStack getCursorStack() { return new yarnwrap.item.ItemStack(net.minecraft.screen.ScreenHandler.getCursorStack()); }
public void disableSyncing() { wrapperContained.disableSyncing(); }
// public static void disableSyncing() { net.minecraft.screen.ScreenHandler.disableSyncing(); }
public void enableSyncing() { wrapperContained.enableSyncing(); }
// public static void enableSyncing() { net.minecraft.screen.ScreenHandler.enableSyncing(); }
// public void checkCursorStackUpdates() { wrapperContained.checkCursorStackUpdates(); }
// public static void checkCursorStackUpdates() { net.minecraft.screen.ScreenHandler.checkCursorStackUpdates(); }
// public yarnwrap.inventory.StackReference getCursorStackReference() { return new yarnwrap.inventory.StackReference(wrapperContained.getCursorStackReference()); }
// public static yarnwrap.inventory.StackReference getCursorStackReference() { return new yarnwrap.inventory.StackReference(net.minecraft.screen.ScreenHandler.getCursorStackReference()); }
// public void checkPropertyUpdates(int id,int value) { wrapperContained.checkPropertyUpdates(id,value); }
// public static void checkPropertyUpdates(int id,int value, ) { net.minecraft.screen.ScreenHandler.checkPropertyUpdates(id,value); }
public java.util.OptionalInt getSlotIndex(yarnwrap.inventory.Inventory inventory,int index) { return wrapperContained.getSlotIndex(inventory.wrapperContained,index); }
// public static java.util.OptionalInt getSlotIndex(yarnwrap.inventory.Inventory inventory,int index, ) { return net.minecraft.screen.ScreenHandler.getSlotIndex(inventory.wrapperContained,index); }
// public void notifyPropertyUpdate(int index,int value) { wrapperContained.notifyPropertyUpdate(index,value); }
// public static void notifyPropertyUpdate(int index,int value, ) { net.minecraft.screen.ScreenHandler.notifyPropertyUpdate(index,value); }
public void updateToClient() { wrapperContained.updateToClient(); }
// public static void updateToClient() { net.minecraft.screen.ScreenHandler.updateToClient(); }
public int getRevision() { return wrapperContained.getRevision(); }
// public static int getRevision() { return net.minecraft.screen.ScreenHandler.getRevision(); }
public int nextRevision() { return wrapperContained.nextRevision(); }
// public static int nextRevision() { return net.minecraft.screen.ScreenHandler.nextRevision(); }
public void setReceivedHash(int slot,yarnwrap.screen.sync.ItemStackHash hash) { wrapperContained.setReceivedHash(slot,hash.wrapperContained); }
// public static void setReceivedHash(int slot,yarnwrap.screen.sync.ItemStackHash hash, ) { net.minecraft.screen.ScreenHandler.setReceivedHash(slot,hash.wrapperContained); }
public boolean isValid(int slot) { return wrapperContained.isValid(slot); }
// public static boolean isValid(int slot, ) { return net.minecraft.screen.ScreenHandler.isValid(slot); }
// public boolean handleSlotClick(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.ClickType clickType,yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack cursorStack) { return wrapperContained.handleSlotClick(player.wrapperContained,clickType.wrapperContained,slot.wrapperContained,stack.wrapperContained,cursorStack.wrapperContained); }
// public static boolean handleSlotClick(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.ClickType clickType,yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack cursorStack, ) { return net.minecraft.screen.ScreenHandler.handleSlotClick(player.wrapperContained,clickType.wrapperContained,slot.wrapperContained,stack.wrapperContained,cursorStack.wrapperContained); }
public void selectBundleStack(int slot,int selectedStack) { wrapperContained.selectBundleStack(slot,selectedStack); }
// public static void selectBundleStack(int slot,int selectedStack, ) { net.minecraft.screen.ScreenHandler.selectBundleStack(slot,selectedStack); }
// public void addPlayerHotbarSlots(yarnwrap.inventory.Inventory playerInventory,int left,int y) { wrapperContained.addPlayerHotbarSlots(playerInventory.wrapperContained,left,y); }
// public static void addPlayerHotbarSlots(yarnwrap.inventory.Inventory playerInventory,int left,int y, ) { net.minecraft.screen.ScreenHandler.addPlayerHotbarSlots(playerInventory.wrapperContained,left,y); }
// public void addPlayerInventorySlots(yarnwrap.inventory.Inventory playerInventory,int left,int top) { wrapperContained.addPlayerInventorySlots(playerInventory.wrapperContained,left,top); }
// public static void addPlayerInventorySlots(yarnwrap.inventory.Inventory playerInventory,int left,int top, ) { net.minecraft.screen.ScreenHandler.addPlayerInventorySlots(playerInventory.wrapperContained,left,top); }
// public void addPlayerSlots(yarnwrap.inventory.Inventory playerInventory,int left,int top) { wrapperContained.addPlayerSlots(playerInventory.wrapperContained,left,top); }
// public static void addPlayerSlots(yarnwrap.inventory.Inventory playerInventory,int left,int top, ) { net.minecraft.screen.ScreenHandler.addPlayerSlots(playerInventory.wrapperContained,left,top); }
// public void offerOrDropStack(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.offerOrDropStack(player.wrapperContained,stack.wrapperContained); }
// public static void offerOrDropStack(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ScreenHandler.offerOrDropStack(player.wrapperContained,stack.wrapperContained); }
// public yarnwrap.screen.sync.TrackedSlot method_68804(yarnwrap.screen.ScreenHandlerSyncHandler slot) { return new yarnwrap.screen.sync.TrackedSlot(wrapperContained.method_68804(slot.wrapperContained)); }
// public static yarnwrap.screen.sync.TrackedSlot method_68804(yarnwrap.screen.ScreenHandlerSyncHandler slot, ) { return new yarnwrap.screen.sync.TrackedSlot(net.minecraft.screen.ScreenHandler.method_68804(slot.wrapperContained)); }

}