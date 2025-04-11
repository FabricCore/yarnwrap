package yarnwrap.inventory;
public class Inventory { public net.minecraft.inventory.Inventory wrapperContained; public Inventory(net.minecraft.inventory.Inventory wrapperContained) { this.wrapperContained = wrapperContained; }

public float DEFAULT_MAX_INTERACTION_RANGE() { return wrapperContained.DEFAULT_MAX_INTERACTION_RANGE; }
// public void DEFAULT_MAX_INTERACTION_RANGE(float value) { wrapperContained.DEFAULT_MAX_INTERACTION_RANGE = value; }
public int count(yarnwrap.item.Item item) { return wrapperContained.count(item.wrapperContained); }
public boolean containsAny(java.util.Set items) { return wrapperContained.containsAny(items); }
// public boolean method_43255(java.util.Set stack) { return wrapperContained.method_43255(stack); }
public boolean containsAny(java.util.function.Predicate predicate) { return wrapperContained.containsAny(predicate); }
public boolean canTransferTo(yarnwrap.inventory.Inventory hopperInventory,int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.canTransferTo(hopperInventory.wrapperContained,slot,stack.wrapperContained); }
// public boolean canPlayerUse(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canPlayerUse(blockEntity.wrapperContained,player.wrapperContained); }
// public boolean canPlayerUse(yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.entity.player.PlayerEntity player,float range) { return wrapperContained.canPlayerUse(blockEntity.wrapperContained,player.wrapperContained,range); }
public void markDirty() { wrapperContained.markDirty(); }
public void onClose(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onClose(player.wrapperContained); }
public yarnwrap.item.ItemStack removeStack(int slot,int amount) { return new yarnwrap.item.ItemStack(wrapperContained.removeStack(slot,amount)); }
public void onOpen(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onOpen(player.wrapperContained); }
public boolean isValid(int slot,yarnwrap.item.ItemStack stack) { return wrapperContained.isValid(slot,stack.wrapperContained); }
public yarnwrap.item.ItemStack getStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.getStack(slot)); }
public int size() { return wrapperContained.size(); }
public yarnwrap.item.ItemStack removeStack(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.removeStack(slot)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public boolean canPlayerUse(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canPlayerUse(player.wrapperContained); }
public int getMaxCountPerStack() { return wrapperContained.getMaxCountPerStack(); }
public void setStack(int slot,yarnwrap.item.ItemStack stack) { wrapperContained.setStack(slot,stack.wrapperContained); }
public int getMaxCount(yarnwrap.item.ItemStack stack) { return wrapperContained.getMaxCount(stack.wrapperContained); }

}