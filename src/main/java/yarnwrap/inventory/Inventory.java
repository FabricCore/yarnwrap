package yarnwrap.inventory;
public class Inventory { public net.minecraft.inventory.Inventory wrapperContained; public Inventory(net.minecraft.inventory.Inventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public float DEFAULT_MAX_INTERACTION_RANGE() { return wrapperContained.DEFAULT_MAX_INTERACTION_RANGE; }
// public void DEFAULT_MAX_INTERACTION_RANGE(float value) { wrapperContained.DEFAULT_MAX_INTERACTION_RANGE = value; }
public static float DEFAULT_MAX_INTERACTION_RANGE() { return net.minecraft.inventory.Inventory.DEFAULT_MAX_INTERACTION_RANGE; }
// public static void DEFAULT_MAX_INTERACTION_RANGE(float value, ) { net.minecraft.inventory.Inventory.DEFAULT_MAX_INTERACTION_RANGE = value; }

public int count(yarnwrap.item.Item item) { return wrapperContained.count(item.wrapperContained); }
// public static int count(yarnwrap.item.Item item, ) { return net.minecraft.inventory.Inventory.count(item.wrapperContained); }
public boolean containsAny(java.util.Set items) { return wrapperContained.containsAny(items); }
// public static boolean containsAny(java.util.Set items, ) { return net.minecraft.inventory.Inventory.containsAny(items); }
// public boolean method_43255(java.util.Set stack) { return wrapperContained.method_43255(stack); }
// public static boolean method_43255(java.util.Set stack, ) { return net.minecraft.inventory.Inventory.method_43255(stack); }
public boolean containsAny(java.util.function.Predicate predicate) { return wrapperContained.containsAny(predicate); }
// public static boolean containsAny(java.util.function.Predicate predicate, ) { return net.minecraft.inventory.Inventory.containsAny(predicate); }
public boolean canTransferTo(yarnwrap.inventory.Inventory hopperInventory,int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.canTransferTo(hopperInventory.wrapperContained,slot,stack.wrapperContained); }
// public static boolean canTransferTo(yarnwrap.inventory.Inventory hopperInventory,int slot,yarnwrap.item.ItemStack stack, ) { return net.minecraft.inventory.Inventory.canTransferTo(hopperInventory.wrapperContained,slot,stack.wrapperContained); }
// public boolean canPlayerUse(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canPlayerUse(blockEntity.wrapperContained,player.wrapperContained); }
// public static boolean canPlayerUse(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.inventory.Inventory.canPlayerUse(blockEntity.wrapperContained,player.wrapperContained); }
// public boolean canPlayerUse(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.entity.player.PlayerEntity player,float range) { return wrapperContained.canPlayerUse(blockEntity.wrapperContained,player.wrapperContained,range); }
// public static boolean canPlayerUse(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.entity.player.PlayerEntity player,float range, ) { return net.minecraft.inventory.Inventory.canPlayerUse(blockEntity.wrapperContained,player.wrapperContained,range); }
public void markDirty() { wrapperContained.markDirty(); }
// public static void markDirty() { net.minecraft.inventory.Inventory.markDirty(); }
public void onClose(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onClose(player.wrapperContained); }
// public static void onClose(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.inventory.Inventory.onClose(player.wrapperContained); }
public yarnwrap.item.ItemStack removeStack(int slot,int amount) { return new yarnwrap.item.ItemStack(wrapperContained.removeStack(slot,amount)); }
// public static yarnwrap.item.ItemStack removeStack(int slot,int amount, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.Inventory.removeStack(slot,amount)); }
public void onOpen(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onOpen(player.wrapperContained); }
// public static void onOpen(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.inventory.Inventory.onOpen(player.wrapperContained); }
public boolean isValid(int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.isValid(slot,stack.wrapperContained); }
// public static boolean isValid(int slot,yarnwrap.item.ItemStack stack, ) { return net.minecraft.inventory.Inventory.isValid(slot,stack.wrapperContained); }
public yarnwrap.item.ItemStack getStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.getStack(slot)); }
// public static yarnwrap.item.ItemStack getStack(int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.Inventory.getStack(slot)); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.inventory.Inventory.size(); }
public yarnwrap.item.ItemStack removeStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.removeStack(slot)); }
// public static yarnwrap.item.ItemStack removeStack(int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.inventory.Inventory.removeStack(slot)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.inventory.Inventory.isEmpty(); }
public boolean canPlayerUse(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canPlayerUse(player.wrapperContained); }
// public static boolean canPlayerUse(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.inventory.Inventory.canPlayerUse(player.wrapperContained); }
public int getMaxCountPerStack() { return wrapperContained.getMaxCountPerStack(); }
// public static int getMaxCountPerStack() { return net.minecraft.inventory.Inventory.getMaxCountPerStack(); }
public void setStack(int slot,yarnwrap.item.ItemStack stack) { wrapperContained.setStack(slot,stack.wrapperContained); }
// public static void setStack(int slot,yarnwrap.item.ItemStack stack, ) { net.minecraft.inventory.Inventory.setStack(slot,stack.wrapperContained); }
public int getMaxCount(yarnwrap.item.ItemStack stack) { return wrapperContained.getMaxCount(stack.wrapperContained); }
// public static int getMaxCount(yarnwrap.item.ItemStack stack, ) { return net.minecraft.inventory.Inventory.getMaxCount(stack.wrapperContained); }

}