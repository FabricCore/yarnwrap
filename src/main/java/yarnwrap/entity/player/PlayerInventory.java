package yarnwrap.entity.player;
public class PlayerInventory { public net.minecraft.entity.player.PlayerInventory wrapperContained; public PlayerInventory(net.minecraft.entity.player.PlayerInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ITEM_USAGE_COOLDOWN() { return wrapperContained.ITEM_USAGE_COOLDOWN; }
// public void ITEM_USAGE_COOLDOWN(int value) { wrapperContained.ITEM_USAGE_COOLDOWN = value; }
public static int ITEM_USAGE_COOLDOWN() { return net.minecraft.entity.player.PlayerInventory.ITEM_USAGE_COOLDOWN; }
// public static void ITEM_USAGE_COOLDOWN(int value, ) { net.minecraft.entity.player.PlayerInventory.ITEM_USAGE_COOLDOWN = value; }

// public int MAIN_SIZE() { return wrapperContained.MAIN_SIZE; }
// public void MAIN_SIZE(int value) { wrapperContained.MAIN_SIZE = value; }
public static int MAIN_SIZE() { return net.minecraft.entity.player.PlayerInventory.MAIN_SIZE; }
// public static void MAIN_SIZE(int value, ) { net.minecraft.entity.player.PlayerInventory.MAIN_SIZE = value; }

// public int OFF_HAND_SLOT() { return wrapperContained.OFF_HAND_SLOT; }
// public void OFF_HAND_SLOT(int value) { wrapperContained.OFF_HAND_SLOT = value; }
public static int OFF_HAND_SLOT() { return net.minecraft.entity.player.PlayerInventory.OFF_HAND_SLOT; }
// public static void OFF_HAND_SLOT(int value, ) { net.minecraft.entity.player.PlayerInventory.OFF_HAND_SLOT = value; }

// public int NOT_FOUND() { return wrapperContained.NOT_FOUND; }
// public void NOT_FOUND(int value) { wrapperContained.NOT_FOUND = value; }
public static int NOT_FOUND() { return net.minecraft.entity.player.PlayerInventory.NOT_FOUND; }
// public static void NOT_FOUND(int value, ) { net.minecraft.entity.player.PlayerInventory.NOT_FOUND = value; }

// public int HOTBAR_SIZE() { return wrapperContained.HOTBAR_SIZE; }
// public void HOTBAR_SIZE(int value) { wrapperContained.HOTBAR_SIZE = value; }
// public static int HOTBAR_SIZE() { return net.minecraft.entity.player.PlayerInventory.HOTBAR_SIZE; }
// public static void HOTBAR_SIZE(int value, ) { net.minecraft.entity.player.PlayerInventory.HOTBAR_SIZE = value; }

// public int[] ARMOR_SLOTS() { return wrapperContained.ARMOR_SLOTS; }
// public void ARMOR_SLOTS(int[] value) { wrapperContained.ARMOR_SLOTS = value; }
public static int[] ARMOR_SLOTS() { return net.minecraft.entity.player.PlayerInventory.ARMOR_SLOTS; }
// public static void ARMOR_SLOTS(int[] value, ) { net.minecraft.entity.player.PlayerInventory.ARMOR_SLOTS = value; }

// public int[] HELMET_SLOTS() { return wrapperContained.HELMET_SLOTS; }
// public void HELMET_SLOTS(int[] value) { wrapperContained.HELMET_SLOTS = value; }
public static int[] HELMET_SLOTS() { return net.minecraft.entity.player.PlayerInventory.HELMET_SLOTS; }
// public static void HELMET_SLOTS(int[] value, ) { net.minecraft.entity.player.PlayerInventory.HELMET_SLOTS = value; }

// public int changeCount() { return wrapperContained.changeCount; }
// public void changeCount(int value) { wrapperContained.changeCount = value; }
// public static int changeCount() { return net.minecraft.entity.player.PlayerInventory.changeCount; }
// public static void changeCount(int value, ) { net.minecraft.entity.player.PlayerInventory.changeCount = value; }

// public java.util.List combinedInventory() { return wrapperContained.combinedInventory; }
// public void combinedInventory(java.util.List value) { wrapperContained.combinedInventory = value; }
// public static java.util.List combinedInventory() { return net.minecraft.entity.player.PlayerInventory.combinedInventory; }
// public static void combinedInventory(java.util.List value, ) { net.minecraft.entity.player.PlayerInventory.combinedInventory = value; }

public yarnwrap.util.collection.DefaultedList offHand() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.offHand); }
// public void offHand(yarnwrap.util.collection.DefaultedList value) { wrapperContained.offHand = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList offHand() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.entity.player.PlayerInventory.offHand); }
// public static void offHand(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.entity.player.PlayerInventory.offHand = value.wrapperContained; }

public int selectedSlot() { return wrapperContained.selectedSlot; }
public void selectedSlot(int value) { wrapperContained.selectedSlot = value; }
// public static int selectedSlot() { return net.minecraft.entity.player.PlayerInventory.selectedSlot; }
// public static void selectedSlot(int value, ) { net.minecraft.entity.player.PlayerInventory.selectedSlot = value; }

public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.player.PlayerInventory.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.entity.player.PlayerInventory.player = value.wrapperContained; }

public yarnwrap.util.collection.DefaultedList main() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.main); }
// public void main(yarnwrap.util.collection.DefaultedList value) { wrapperContained.main = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList main() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.entity.player.PlayerInventory.main); }
// public static void main(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.entity.player.PlayerInventory.main = value.wrapperContained; }

public yarnwrap.util.collection.DefaultedList armor() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.armor); }
// public void armor(yarnwrap.util.collection.DefaultedList value) { wrapperContained.armor = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList armor() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.entity.player.PlayerInventory.armor); }
// public static void armor(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.entity.player.PlayerInventory.armor = value.wrapperContained; }

public PlayerInventory(yarnwrap.entity.player.PlayerEntity player) { this.wrapperContained = new net.minecraft.entity.player.PlayerInventory(player.wrapperContained); }
public int remove(java.util.function.Predicate shouldRemove,int maxCount,yarnwrap.inventory.Inventory craftingInventory) { return wrapperContained.remove(shouldRemove,maxCount,craftingInventory.wrapperContained); }
// public static int remove(java.util.function.Predicate shouldRemove,int maxCount,yarnwrap.inventory.Inventory craftingInventory, ) { return net.minecraft.entity.player.PlayerInventory.remove(shouldRemove,maxCount,craftingInventory.wrapperContained); }
public void offer(yarnwrap.item.ItemStack stack,boolean notifiesClient) { wrapperContained.offer(stack.wrapperContained,notifiesClient); }
// public static void offer(yarnwrap.item.ItemStack stack,boolean notifiesClient, ) { net.minecraft.entity.player.PlayerInventory.offer(stack.wrapperContained,notifiesClient); }
public yarnwrap.item.ItemStack dropSelectedItem(boolean entireStack) { return new yarnwrap.item.ItemStack(wrapperContained.dropSelectedItem(entireStack)); }
// public static yarnwrap.item.ItemStack dropSelectedItem(boolean entireStack, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.player.PlayerInventory.dropSelectedItem(entireStack)); }
public boolean contains(java.util.function.Predicate predicate) { return wrapperContained.contains(predicate); }
// public static boolean contains(java.util.function.Predicate predicate, ) { return net.minecraft.entity.player.PlayerInventory.contains(predicate); }
public int getChangeCount() { return wrapperContained.getChangeCount(); }
// public static int getChangeCount() { return net.minecraft.entity.player.PlayerInventory.getChangeCount(); }
public void swapSlotWithHotbar(int slot) { wrapperContained.swapSlotWithHotbar(slot); }
// public static void swapSlotWithHotbar(int slot, ) { net.minecraft.entity.player.PlayerInventory.swapSlotWithHotbar(slot); }
// public int addStack(yarnwrap.item.ItemStack stack) { return wrapperContained.addStack(stack.wrapperContained); }
// public static int addStack(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.addStack(stack.wrapperContained); }
public boolean insertStack(int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.insertStack(slot,stack.wrapperContained); }
// public static boolean insertStack(int slot,yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.insertStack(slot,stack.wrapperContained); }
// public int getHotbarSize() { return wrapperContained.getHotbarSize(); }
public static int getHotbarSize() { return net.minecraft.entity.player.PlayerInventory.getHotbarSize(); }
public float getBlockBreakingSpeed(yarnwrap.block.BlockState block) { return wrapperContained.getBlockBreakingSpeed(block.wrapperContained); }
// public static float getBlockBreakingSpeed(yarnwrap.block.BlockState block, ) { return net.minecraft.entity.player.PlayerInventory.getBlockBreakingSpeed(block.wrapperContained); }
public int indexOf(yarnwrap.item.ItemStack stack) { return wrapperContained.indexOf(stack.wrapperContained); }
// public static int indexOf(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.indexOf(stack.wrapperContained); }
public yarnwrap.item.ItemStack getArmorStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.getArmorStack(slot)); }
// public static yarnwrap.item.ItemStack getArmorStack(int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.player.PlayerInventory.getArmorStack(slot)); }
public void scrollInHotbar(double scrollAmount) { wrapperContained.scrollInHotbar(scrollAmount); }
// public static void scrollInHotbar(double scrollAmount, ) { net.minecraft.entity.player.PlayerInventory.scrollInHotbar(scrollAmount); }
public void addPickBlock(yarnwrap.item.ItemStack stack) { wrapperContained.addPickBlock(stack.wrapperContained); }
// public static void addPickBlock(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.player.PlayerInventory.addPickBlock(stack.wrapperContained); }
public int getEmptySlot() { return wrapperContained.getEmptySlot(); }
// public static int getEmptySlot() { return net.minecraft.entity.player.PlayerInventory.getEmptySlot(); }
public void clone(yarnwrap.entity.player.PlayerInventory other) { wrapperContained.clone(other.wrapperContained); }
// public static void clone(yarnwrap.entity.player.PlayerInventory other, ) { net.minecraft.entity.player.PlayerInventory.clone(other.wrapperContained); }
public void removeOne(yarnwrap.item.ItemStack stack) { wrapperContained.removeOne(stack.wrapperContained); }
// public static void removeOne(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.player.PlayerInventory.removeOne(stack.wrapperContained); }
public boolean contains(yarnwrap.item.ItemStack stack) { return wrapperContained.contains(stack.wrapperContained); }
// public static boolean contains(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.contains(stack.wrapperContained); }
// public boolean isValidHotbarIndex(int slot) { return wrapperContained.isValidHotbarIndex(slot); }
// public static boolean isValidHotbarIndex(int slot, ) { return net.minecraft.entity.player.PlayerInventory.isValidHotbarIndex(slot); }
public void updateItems() { wrapperContained.updateItems(); }
// public static void updateItems() { net.minecraft.entity.player.PlayerInventory.updateItems(); }
public boolean contains(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.contains(tag.wrapperContained); }
// public static boolean contains(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.entity.player.PlayerInventory.contains(tag.wrapperContained); }
public yarnwrap.nbt.NbtList writeNbt(yarnwrap.nbt.NbtList nbtList) { return new yarnwrap.nbt.NbtList(wrapperContained.writeNbt(nbtList.wrapperContained)); }
// public static yarnwrap.nbt.NbtList writeNbt(yarnwrap.nbt.NbtList nbtList, ) { return new yarnwrap.nbt.NbtList(net.minecraft.entity.player.PlayerInventory.writeNbt(nbtList.wrapperContained)); }
// public int addStack(int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.addStack(slot,stack.wrapperContained); }
// public static int addStack(int slot,yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.addStack(slot,stack.wrapperContained); }
public int getSwappableHotbarSlot() { return wrapperContained.getSwappableHotbarSlot(); }
// public static int getSwappableHotbarSlot() { return net.minecraft.entity.player.PlayerInventory.getSwappableHotbarSlot(); }
public void populateRecipeFinder(yarnwrap.recipe.RecipeMatcher finder) { wrapperContained.populateRecipeFinder(finder.wrapperContained); }
// public static void populateRecipeFinder(yarnwrap.recipe.RecipeMatcher finder, ) { net.minecraft.entity.player.PlayerInventory.populateRecipeFinder(finder.wrapperContained); }
public void dropAll() { wrapperContained.dropAll(); }
// public static void dropAll() { net.minecraft.entity.player.PlayerInventory.dropAll(); }
public int getOccupiedSlotWithRoomForStack(yarnwrap.item.ItemStack stack) { return wrapperContained.getOccupiedSlotWithRoomForStack(stack.wrapperContained); }
// public static int getOccupiedSlotWithRoomForStack(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.getOccupiedSlotWithRoomForStack(stack.wrapperContained); }
public yarnwrap.item.ItemStack getMainHandStack() { return new yarnwrap.item.ItemStack(wrapperContained.getMainHandStack()); }
// public static yarnwrap.item.ItemStack getMainHandStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.player.PlayerInventory.getMainHandStack()); }
// public boolean canStackAddMore(yarnwrap.item.ItemStack existingStack,yarnwrap.item.ItemStack stack) { return wrapperContained.canStackAddMore(existingStack.wrapperContained,stack.wrapperContained); }
// public static boolean canStackAddMore(yarnwrap.item.ItemStack existingStack,yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.canStackAddMore(existingStack.wrapperContained,stack.wrapperContained); }
public boolean insertStack(yarnwrap.item.ItemStack stack) { return wrapperContained.insertStack(stack.wrapperContained); }
// public static boolean insertStack(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.insertStack(stack.wrapperContained); }
public int getSlotWithStack(yarnwrap.item.ItemStack stack) { return wrapperContained.getSlotWithStack(stack.wrapperContained); }
// public static int getSlotWithStack(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerInventory.getSlotWithStack(stack.wrapperContained); }
public void readNbt(yarnwrap.nbt.NbtList nbtList) { wrapperContained.readNbt(nbtList.wrapperContained); }
// public static void readNbt(yarnwrap.nbt.NbtList nbtList, ) { net.minecraft.entity.player.PlayerInventory.readNbt(nbtList.wrapperContained); }
public void offerOrDrop(yarnwrap.item.ItemStack stack) { wrapperContained.offerOrDrop(stack.wrapperContained); }
// public static void offerOrDrop(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.player.PlayerInventory.offerOrDrop(stack.wrapperContained); }

}