package yarnwrap.entity.player;
public class PlayerInventory { public net.minecraft.entity.player.PlayerInventory wrapperContained; public PlayerInventory(net.minecraft.entity.player.PlayerInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public int ITEM_USAGE_COOLDOWN() { return wrapperContained.ITEM_USAGE_COOLDOWN; }
public int MAIN_SIZE() { return wrapperContained.MAIN_SIZE; }
public int OFF_HAND_SLOT() { return wrapperContained.OFF_HAND_SLOT; }
public int NOT_FOUND() { return wrapperContained.NOT_FOUND; }
// public int HOTBAR_SIZE() { return wrapperContained.HOTBAR_SIZE; }
public int[] ARMOR_SLOTS() { return wrapperContained.ARMOR_SLOTS; }
public int[] HELMET_SLOTS() { return wrapperContained.HELMET_SLOTS; }
// public int changeCount() { return wrapperContained.changeCount; }
// public java.util.List combinedInventory() { return wrapperContained.combinedInventory; }
public yarnwrap.util.collection.DefaultedList offHand() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.offHand); }
public int selectedSlot() { return wrapperContained.selectedSlot; }
public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
public yarnwrap.util.collection.DefaultedList main() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.main); }
public yarnwrap.util.collection.DefaultedList armor() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.armor); }
public int remove(java.util.function.Predicate shouldRemove,int maxCount,yarnwrap.inventory.Inventory craftingInventory) { return wrapperContained.remove(shouldRemove,maxCount,craftingInventory.wrapperContained); }
public void offer(yarnwrap.item.ItemStack stack,boolean notifiesClient) { wrapperContained.offer(stack.wrapperContained,notifiesClient); }
public yarnwrap.item.ItemStack dropSelectedItem(boolean entireStack) { return new yarnwrap.item.ItemStack(wrapperContained.dropSelectedItem(entireStack)); }
public boolean contains(java.util.function.Predicate predicate) { return wrapperContained.contains(predicate); }
public int getChangeCount() { return wrapperContained.getChangeCount(); }
public void swapSlotWithHotbar(int slot) { wrapperContained.swapSlotWithHotbar(slot); }
// public int addStack(yarnwrap.item.ItemStack stack) { return wrapperContained.addStack(stack.wrapperContained); }
public boolean insertStack(int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.insertStack(slot,stack.wrapperContained); }
public int getHotbarSize() { return wrapperContained.getHotbarSize(); }
public float getBlockBreakingSpeed(yarnwrap.block.BlockState block) { return wrapperContained.getBlockBreakingSpeed(block.wrapperContained); }
public int indexOf(yarnwrap.item.ItemStack stack) { return wrapperContained.indexOf(stack.wrapperContained); }
public yarnwrap.item.ItemStack getArmorStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.getArmorStack(slot)); }
public void scrollInHotbar(double scrollAmount) { wrapperContained.scrollInHotbar(scrollAmount); }
public void addPickBlock(yarnwrap.item.ItemStack stack) { wrapperContained.addPickBlock(stack.wrapperContained); }
public int getEmptySlot() { return wrapperContained.getEmptySlot(); }
public void clone(yarnwrap.entity.player.PlayerInventory other) { wrapperContained.clone(other.wrapperContained); }
public void removeOne(yarnwrap.item.ItemStack stack) { wrapperContained.removeOne(stack.wrapperContained); }
public boolean contains(yarnwrap.item.ItemStack stack) { return wrapperContained.contains(stack.wrapperContained); }
public boolean isValidHotbarIndex(int slot) { return wrapperContained.isValidHotbarIndex(slot); }
public void updateItems() { wrapperContained.updateItems(); }
public boolean contains(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.contains(tag.wrapperContained); }
public yarnwrap.nbt.NbtList writeNbt(yarnwrap.nbt.NbtList nbtList) { return new yarnwrap.nbt.NbtList(wrapperContained.writeNbt(nbtList.wrapperContained)); }
// public int addStack(int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.addStack(slot,stack.wrapperContained); }
public int getSwappableHotbarSlot() { return wrapperContained.getSwappableHotbarSlot(); }
public void populateRecipeFinder(yarnwrap.recipe.RecipeMatcher finder) { wrapperContained.populateRecipeFinder(finder.wrapperContained); }
public void dropAll() { wrapperContained.dropAll(); }
public int getOccupiedSlotWithRoomForStack(yarnwrap.item.ItemStack stack) { return wrapperContained.getOccupiedSlotWithRoomForStack(stack.wrapperContained); }
public yarnwrap.item.ItemStack getMainHandStack() { return new yarnwrap.item.ItemStack(wrapperContained.getMainHandStack()); }
// public boolean canStackAddMore(yarnwrap.item.ItemStack existingStack,yarnwrap.item.ItemStack stack) { return wrapperContained.canStackAddMore(existingStack.wrapperContained,stack.wrapperContained); }
public boolean insertStack(yarnwrap.item.ItemStack stack) { return wrapperContained.insertStack(stack.wrapperContained); }
public int getSlotWithStack(yarnwrap.item.ItemStack stack) { return wrapperContained.getSlotWithStack(stack.wrapperContained); }
public void readNbt(yarnwrap.nbt.NbtList nbtList) { wrapperContained.readNbt(nbtList.wrapperContained); }
public void offerOrDrop(yarnwrap.item.ItemStack stack) { wrapperContained.offerOrDrop(stack.wrapperContained); }

}