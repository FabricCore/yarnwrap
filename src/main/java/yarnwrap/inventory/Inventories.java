package yarnwrap.inventory;
public class Inventories { public net.minecraft.inventory.Inventories wrapperContained; public Inventories(net.minecraft.inventory.Inventories wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String ITEMS_NBT_KEY() { return wrapperContained.ITEMS_NBT_KEY; }
// public void ITEMS_NBT_KEY(java.lang.String value) { wrapperContained.ITEMS_NBT_KEY = value; }
public static java.lang.String ITEMS_NBT_KEY() { return net.minecraft.inventory.Inventories.ITEMS_NBT_KEY; }
// public static void ITEMS_NBT_KEY(java.lang.String value, ) { net.minecraft.inventory.Inventories.ITEMS_NBT_KEY = value; }

// public int remove(yarnwrap.inventory.Inventory inventory,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun) { return wrapperContained.remove(inventory.wrapperContained,shouldRemove,maxCount,dryRun); }
// public static int remove(yarnwrap.inventory.Inventory inventory,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun, ) { return net.minecraft.inventory.Inventories.remove(inventory.wrapperContained,shouldRemove,maxCount,dryRun); }
// public int remove(yarnwrap.item.ItemStack stack,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun) { return wrapperContained.remove(stack.wrapperContained,shouldRemove,maxCount,dryRun); }
// public static int remove(yarnwrap.item.ItemStack stack,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun, ) { return net.minecraft.inventory.Inventories.remove(stack.wrapperContained,shouldRemove,maxCount,dryRun); }
// public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained,stacks.wrapperContained,registries)); }
// public static yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,Object registries, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.inventory.Inventories.writeNbt(nbt.wrapperContained,stacks.wrapperContained,registries)); }
// public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,boolean setIfEmpty,Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained,stacks.wrapperContained,setIfEmpty,registries)); }
// public static yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,boolean setIfEmpty,Object registries, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.inventory.Inventories.writeNbt(nbt.wrapperContained,stacks.wrapperContained,setIfEmpty,registries)); }
// public yarnwrap.item.ItemStack removeStack(java.util.List stacks,int slot) { return new yarnwrap.item.ItemStack(wrapperContained.removeStack(stacks,slot)); }
// public static yarnwrap.item.ItemStack removeStack(java.util.List stacks,int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.Inventories.removeStack(stacks,slot)); }
// public void readNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,Object registries) { wrapperContained.readNbt(nbt.wrapperContained,stacks.wrapperContained,registries); }
// public static void readNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,Object registries, ) { net.minecraft.inventory.Inventories.readNbt(nbt.wrapperContained,stacks.wrapperContained,registries); }
// public yarnwrap.item.ItemStack splitStack(java.util.List stacks,int slot,int amount) { return new yarnwrap.item.ItemStack(wrapperContained.splitStack(stacks,slot,amount)); }
// public static yarnwrap.item.ItemStack splitStack(java.util.List stacks,int slot,int amount, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.Inventories.splitStack(stacks,slot,amount)); }

}