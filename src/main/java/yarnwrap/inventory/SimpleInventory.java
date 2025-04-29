package yarnwrap.inventory;
public class SimpleInventory { public net.minecraft.inventory.SimpleInventory wrapperContained; public SimpleInventory(net.minecraft.inventory.SimpleInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.collection.DefaultedList heldStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.heldStacks); }
// public void heldStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.heldStacks = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList heldStacks() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.inventory.SimpleInventory.heldStacks); }
// public static void heldStacks(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.inventory.SimpleInventory.heldStacks = value.wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public static java.util.List listeners() { return net.minecraft.inventory.SimpleInventory.listeners; }
// public static void listeners(java.util.List value, ) { net.minecraft.inventory.SimpleInventory.listeners = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.inventory.SimpleInventory.size; }
// public static void size(int value, ) { net.minecraft.inventory.SimpleInventory.size = value; }

public SimpleInventory(int size) { this.wrapperContained = new net.minecraft.inventory.SimpleInventory(size); }
public SimpleInventory(net.minecraft.item.ItemStack[] items) { this.wrapperContained = new net.minecraft.inventory.SimpleInventory(items); }
public yarnwrap.item.ItemStack removeItem(yarnwrap.item.Item item,int count) { return new yarnwrap.item.ItemStack(wrapperContained.removeItem(item.wrapperContained,count)); }
// public static yarnwrap.item.ItemStack removeItem(yarnwrap.item.Item item,int count, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.SimpleInventory.removeItem(item.wrapperContained,count)); }
// public void transfer(yarnwrap.item.ItemStack source,yarnwrap.item.ItemStack target) { wrapperContained.transfer(source.wrapperContained,target.wrapperContained); }
// public static void transfer(yarnwrap.item.ItemStack source,yarnwrap.item.ItemStack target, ) { net.minecraft.inventory.SimpleInventory.transfer(source.wrapperContained,target.wrapperContained); }
// public void addToNewSlot(yarnwrap.item.ItemStack stack) { wrapperContained.addToNewSlot(stack.wrapperContained); }
// public static void addToNewSlot(yarnwrap.item.ItemStack stack, ) { net.minecraft.inventory.SimpleInventory.addToNewSlot(stack.wrapperContained); }
// public void addToExistingSlot(yarnwrap.item.ItemStack stack) { wrapperContained.addToExistingSlot(stack.wrapperContained); }
// public static void addToExistingSlot(yarnwrap.item.ItemStack stack, ) { net.minecraft.inventory.SimpleInventory.addToExistingSlot(stack.wrapperContained); }
// public boolean method_20635(yarnwrap.item.ItemStack stack) { return wrapperContained.method_20635(stack.wrapperContained); }
// public static boolean method_20635(yarnwrap.item.ItemStack stack, ) { return net.minecraft.inventory.SimpleInventory.method_20635(stack.wrapperContained); }
// public boolean method_24513(yarnwrap.item.ItemStack stack) { return wrapperContained.method_24513(stack.wrapperContained); }
// public static boolean method_24513(yarnwrap.item.ItemStack stack, ) { return net.minecraft.inventory.SimpleInventory.method_24513(stack.wrapperContained); }
public java.util.List clearToList() { return wrapperContained.clearToList(); }
// public static java.util.List clearToList() { return net.minecraft.inventory.SimpleInventory.clearToList(); }
public boolean canInsert(yarnwrap.item.ItemStack stack) { return wrapperContained.canInsert(stack.wrapperContained); }
// public static boolean canInsert(yarnwrap.item.ItemStack stack, ) { return net.minecraft.inventory.SimpleInventory.canInsert(stack.wrapperContained); }
public yarnwrap.util.collection.DefaultedList getHeldStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getHeldStacks()); }
// public static yarnwrap.util.collection.DefaultedList getHeldStacks() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.inventory.SimpleInventory.getHeldStacks()); }
public void removeListener(yarnwrap.inventory.InventoryChangedListener listener) { wrapperContained.removeListener(listener.wrapperContained); }
// public static void removeListener(yarnwrap.inventory.InventoryChangedListener listener, ) { net.minecraft.inventory.SimpleInventory.removeListener(listener.wrapperContained); }
public void addListener(yarnwrap.inventory.InventoryChangedListener listener) { wrapperContained.addListener(listener.wrapperContained); }
// public static void addListener(yarnwrap.inventory.InventoryChangedListener listener, ) { net.minecraft.inventory.SimpleInventory.addListener(listener.wrapperContained); }
public yarnwrap.item.ItemStack addStack(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.addStack(stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack addStack(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.SimpleInventory.addStack(stack.wrapperContained)); }
// public void readNbtList(yarnwrap.nbt.NbtList list,Object registries) { wrapperContained.readNbtList(list.wrapperContained,registries); }
// public static void readNbtList(yarnwrap.nbt.NbtList list,Object registries, ) { net.minecraft.inventory.SimpleInventory.readNbtList(list.wrapperContained,registries); }
// public yarnwrap.nbt.NbtList toNbtList(Object registries) { return new yarnwrap.nbt.NbtList(wrapperContained.toNbtList(registries)); }
// public static yarnwrap.nbt.NbtList toNbtList(Object registries, ) { return new yarnwrap.nbt.NbtList(net.minecraft.inventory.SimpleInventory.toNbtList(registries)); }

}