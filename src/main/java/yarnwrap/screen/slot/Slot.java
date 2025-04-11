package yarnwrap.screen.slot;
public class Slot { public net.minecraft.screen.slot.Slot wrapperContained; public Slot(net.minecraft.screen.slot.Slot wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
public int id() { return wrapperContained.id; }
public void id(int value) { wrapperContained.id = value; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
public Slot(yarnwrap.inventory.Inventory inventory,int index,int x,int y) { this.wrapperContained = new net.minecraft.screen.slot.Slot(inventory.wrapperContained,index,x,y); }
public yarnwrap.item.ItemStack takeStackRange(int min,int max,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.takeStackRange(min,max,player.wrapperContained)); }
public boolean canTakePartial(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canTakePartial(player.wrapperContained); }
public yarnwrap.item.ItemStack insertStack(yarnwrap.item.ItemStack stack,int count) { return new yarnwrap.item.ItemStack(wrapperContained.insertStack(stack.wrapperContained,count)); }
public yarnwrap.item.ItemStack insertStack(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.insertStack(stack.wrapperContained)); }
public java.util.Optional tryTakeStackRange(int min,int max,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.tryTakeStackRange(min,max,player.wrapperContained); }
// public void method_34265(yarnwrap.entity.player.PlayerEntity stack) { wrapperContained.method_34265(stack.wrapperContained); }
public int getIndex() { return wrapperContained.getIndex(); }
public void setStack(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack previousStack) { wrapperContained.setStack(stack.wrapperContained,previousStack.wrapperContained); }
public boolean canBeHighlighted() { return wrapperContained.canBeHighlighted(); }
public void setStack(yarnwrap.item.ItemStack stack) { wrapperContained.setStack(stack.wrapperContained); }
public boolean disablesDynamicDisplay() { return wrapperContained.disablesDynamicDisplay(); }
public void onTakeItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.onTakeItem(player.wrapperContained,stack.wrapperContained); }
public void markDirty() { wrapperContained.markDirty(); }
// public void onCrafted(yarnwrap.item.ItemStack stack) { wrapperContained.onCrafted(stack.wrapperContained); }
public void onQuickTransfer(yarnwrap.item.ItemStack newItem,yarnwrap.item.ItemStack original) { wrapperContained.onQuickTransfer(newItem.wrapperContained,original.wrapperContained); }
public yarnwrap.item.ItemStack takeStack(int amount) { return new yarnwrap.item.ItemStack(wrapperContained.takeStack(amount)); }
// public void onTake(int amount) { wrapperContained.onTake(amount); }
public void setStackNoCallbacks(yarnwrap.item.ItemStack stack) { wrapperContained.setStackNoCallbacks(stack.wrapperContained); }
public boolean canTakeItems(yarnwrap.entity.player.PlayerEntity playerEntity) { return wrapperContained.canTakeItems(playerEntity.wrapperContained); }
public int getMaxItemCount() { return wrapperContained.getMaxItemCount(); }
public int getMaxItemCount(yarnwrap.item.ItemStack stack) { return wrapperContained.getMaxItemCount(stack.wrapperContained); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
// public void onCrafted(yarnwrap.item.ItemStack stack,int amount) { wrapperContained.onCrafted(stack.wrapperContained,amount); }
public com.mojang.datafixers.util.Pair getBackgroundSprite() { return wrapperContained.getBackgroundSprite(); }
public boolean canInsert(yarnwrap.item.ItemStack stack) { return wrapperContained.canInsert(stack.wrapperContained); }
public boolean hasStack() { return wrapperContained.hasStack(); }
public boolean isEnabled() { return wrapperContained.isEnabled(); }

}