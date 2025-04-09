package yarnwrap.inventory;
public class Inventories { public net.minecraft.inventory.Inventories wrapperContained; public Inventories(net.minecraft.inventory.Inventories wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String ITEMS_NBT_KEY() { return wrapperContained.ITEMS_NBT_KEY; }
public int remove(yarnwrap.inventory.Inventory inventory,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun) { return wrapperContained.remove(inventory.wrapperContained,shouldRemove,maxCount,dryRun); }
public int remove(yarnwrap.item.ItemStack stack,java.util.function.Predicate shouldRemove,int maxCount,boolean dryRun) { return wrapperContained.remove(stack.wrapperContained,shouldRemove,maxCount,dryRun); }
// public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained,stacks.wrapperContained,registries)); }
// public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,boolean setIfEmpty,Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained,stacks.wrapperContained,setIfEmpty,registries)); }
public yarnwrap.item.ItemStack removeStack(java.util.List stacks,int slot) { return new yarnwrap.item.ItemStack(wrapperContained.removeStack(stacks,slot)); }
// public void readNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.collection.DefaultedList stacks,Object registries) { wrapperContained.readNbt(nbt.wrapperContained,stacks.wrapperContained,registries); }
public yarnwrap.item.ItemStack splitStack(java.util.List stacks,int slot,int amount) { return new yarnwrap.item.ItemStack(wrapperContained.splitStack(stacks,slot,amount)); }

}