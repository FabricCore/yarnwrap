package yarnwrap.inventory;
public class Inventories { public net.minecraft.inventory.Inventories wrapperContained; public Inventories(net.minecraft.inventory.Inventories wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String ITEMS_NBT_KEY() { return wrapperContained.ITEMS_NBT_KEY; }
// public void ITEMS_NBT_KEY(java.lang.String value) { wrapperContained.ITEMS_NBT_KEY = value; }
public static java.lang.String ITEMS_NBT_KEY() { return net.minecraft.inventory.Inventories.ITEMS_NBT_KEY; }
// public static void ITEMS_NBT_KEY(java.lang.String value, ) { net.minecraft.inventory.Inventories.ITEMS_NBT_KEY = value; }

// public void writeData(yarnwrap.storage.WriteView view,yarnwrap.util.collection.DefaultedList stacks) { wrapperContained.writeData(view.wrapperContained,stacks.wrapperContained); }
// public static void writeData(yarnwrap.storage.WriteView view,yarnwrap.util.collection.DefaultedList stacks, ) { net.minecraft.inventory.Inventories.writeData(view.wrapperContained,stacks.wrapperContained); }
// public void writeData(yarnwrap.storage.WriteView view,yarnwrap.util.collection.DefaultedList stacks,boolean setIfEmpty) { wrapperContained.writeData(view.wrapperContained,stacks.wrapperContained,setIfEmpty); }
// public static void writeData(yarnwrap.storage.WriteView view,yarnwrap.util.collection.DefaultedList stacks,boolean setIfEmpty, ) { net.minecraft.inventory.Inventories.writeData(view.wrapperContained,stacks.wrapperContained,setIfEmpty); }
// public yarnwrap.item.ItemStack removeStack(java.util.List stacks,int slot) { return new yarnwrap.item.ItemStack(wrapperContained.removeStack(stacks,slot)); }
// public static yarnwrap.item.ItemStack removeStack(java.util.List stacks,int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.Inventories.removeStack(stacks,slot)); }
// public void readData(yarnwrap.storage.ReadView view,yarnwrap.util.collection.DefaultedList stacks) { wrapperContained.readData(view.wrapperContained,stacks.wrapperContained); }
// public static void readData(yarnwrap.storage.ReadView view,yarnwrap.util.collection.DefaultedList stacks, ) { net.minecraft.inventory.Inventories.readData(view.wrapperContained,stacks.wrapperContained); }
// public yarnwrap.item.ItemStack splitStack(java.util.List stacks,int slot,int amount) { return new yarnwrap.item.ItemStack(wrapperContained.splitStack(stacks,slot,amount)); }
// public static yarnwrap.item.ItemStack splitStack(java.util.List stacks,int slot,int amount, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.Inventories.splitStack(stacks,slot,amount)); }
// public int remove(yarnwrap.inventory.Inventory inventory,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun) { return wrapperContained.remove(inventory.wrapperContained,shouldRemove,maxCount,dryRun); }
// public static int remove(yarnwrap.inventory.Inventory inventory,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun, ) { return net.minecraft.inventory.Inventories.remove(inventory.wrapperContained,shouldRemove,maxCount,dryRun); }
// public int remove(yarnwrap.item.ItemStack stack,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun) { return wrapperContained.remove(stack.wrapperContained,shouldRemove,maxCount,dryRun); }
// public static int remove(yarnwrap.item.ItemStack stack,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun, ) { return net.minecraft.inventory.Inventories.remove(stack.wrapperContained,shouldRemove,maxCount,dryRun); }

}