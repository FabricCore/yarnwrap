package yarnwrap.inventory;
public class SimpleInventory { public net.minecraft.inventory.SimpleInventory wrapperContained; public SimpleInventory(net.minecraft.inventory.SimpleInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DefaultedList heldStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.heldStacks); }
// public void heldStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.heldStacks = value.wrapperContained; }
// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
public SimpleInventory(int size) { this.wrapperContained = new net.minecraft.inventory.SimpleInventory(size); }
public SimpleInventory(net.minecraft.item.ItemStack[] items) { this.wrapperContained = new net.minecraft.inventory.SimpleInventory(items); }
public yarnwrap.item.ItemStack removeItem(yarnwrap.item.Item item,int count) { return new yarnwrap.item.ItemStack(wrapperContained.removeItem(item.wrapperContained,count)); }
// public void transfer(yarnwrap.item.ItemStack source,yarnwrap.item.ItemStack target) { wrapperContained.transfer(source.wrapperContained,target.wrapperContained); }
// public void addToNewSlot(yarnwrap.item.ItemStack stack) { wrapperContained.addToNewSlot(stack.wrapperContained); }
// public void addToExistingSlot(yarnwrap.item.ItemStack stack) { wrapperContained.addToExistingSlot(stack.wrapperContained); }
// public boolean method_20635(yarnwrap.item.ItemStack stack) { return wrapperContained.method_20635(stack.wrapperContained); }
// public boolean method_24513(yarnwrap.item.ItemStack stack) { return wrapperContained.method_24513(stack.wrapperContained); }
public java.util.List clearToList() { return wrapperContained.clearToList(); }
public boolean canInsert(yarnwrap.item.ItemStack stack) { return wrapperContained.canInsert(stack.wrapperContained); }
public yarnwrap.util.collection.DefaultedList getHeldStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getHeldStacks()); }
public void removeListener(yarnwrap.inventory.InventoryChangedListener listener) { wrapperContained.removeListener(listener.wrapperContained); }
public void addListener(yarnwrap.inventory.InventoryChangedListener listener) { wrapperContained.addListener(listener.wrapperContained); }
public yarnwrap.item.ItemStack addStack(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.addStack(stack.wrapperContained)); }
// public void readNbtList(yarnwrap.nbt.NbtList list,Object registries) { wrapperContained.readNbtList(list.wrapperContained,registries); }
// public yarnwrap.nbt.NbtList toNbtList(Object registries) { return new yarnwrap.nbt.NbtList(wrapperContained.toNbtList(registries)); }

}