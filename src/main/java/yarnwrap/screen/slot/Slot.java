package yarnwrap.screen.slot;
public class Slot { public net.minecraft.screen.slot.Slot wrapperContained; public Slot(net.minecraft.screen.slot.Slot wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.slot.Slot.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.slot.Slot.inventory = value.wrapperContained; }

public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.screen.slot.Slot.y; }
// public static void y(int value, ) { net.minecraft.screen.slot.Slot.y = value; }

public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.screen.slot.Slot.x; }
// public static void x(int value, ) { net.minecraft.screen.slot.Slot.x = value; }

public int id() { return wrapperContained.id; }
public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.screen.slot.Slot.id; }
// public static void id(int value, ) { net.minecraft.screen.slot.Slot.id = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.screen.slot.Slot.index; }
// public static void index(int value, ) { net.minecraft.screen.slot.Slot.index = value; }

public Slot(yarnwrap.inventory.Inventory inventory,int index,int x,int y) { this.wrapperContained = new net.minecraft.screen.slot.Slot(inventory.wrapperContained,index,x,y); }
public void onTakeItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.onTakeItem(player.wrapperContained,stack.wrapperContained); }
// public static void onTakeItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.slot.Slot.onTakeItem(player.wrapperContained,stack.wrapperContained); }
public void markDirty() { wrapperContained.markDirty(); }
// public static void markDirty() { net.minecraft.screen.slot.Slot.markDirty(); }
// public void onCrafted(yarnwrap.item.ItemStack stack) { wrapperContained.onCrafted(stack.wrapperContained); }
// public static void onCrafted(yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.slot.Slot.onCrafted(stack.wrapperContained); }
public void onQuickTransfer(yarnwrap.item.ItemStack newItem,yarnwrap.item.ItemStack original) { wrapperContained.onQuickTransfer(newItem.wrapperContained,original.wrapperContained); }
// public static void onQuickTransfer(yarnwrap.item.ItemStack newItem,yarnwrap.item.ItemStack original, ) { net.minecraft.screen.slot.Slot.onQuickTransfer(newItem.wrapperContained,original.wrapperContained); }
public yarnwrap.item.ItemStack takeStack(int amount) { return new yarnwrap.item.ItemStack(wrapperContained.takeStack(amount)); }
// public static yarnwrap.item.ItemStack takeStack(int amount, ) { return new yarnwrap.item.ItemStack(net.minecraft.screen.slot.Slot.takeStack(amount)); }
// public void onTake(int amount) { wrapperContained.onTake(amount); }
// public static void onTake(int amount, ) { net.minecraft.screen.slot.Slot.onTake(amount); }
public void setStackNoCallbacks(yarnwrap.item.ItemStack stack) { wrapperContained.setStackNoCallbacks(stack.wrapperContained); }
// public static void setStackNoCallbacks(yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.slot.Slot.setStackNoCallbacks(stack.wrapperContained); }
public boolean canTakeItems(yarnwrap.entity.player.PlayerEntity playerEntity) { return wrapperContained.canTakeItems(playerEntity.wrapperContained); }
// public static boolean canTakeItems(yarnwrap.entity.player.PlayerEntity playerEntity, ) { return net.minecraft.screen.slot.Slot.canTakeItems(playerEntity.wrapperContained); }
public int getMaxItemCount() { return wrapperContained.getMaxItemCount(); }
// public static int getMaxItemCount() { return net.minecraft.screen.slot.Slot.getMaxItemCount(); }
public int getMaxItemCount(yarnwrap.item.ItemStack stack) { return wrapperContained.getMaxItemCount(stack.wrapperContained); }
// public static int getMaxItemCount(yarnwrap.item.ItemStack stack, ) { return net.minecraft.screen.slot.Slot.getMaxItemCount(stack.wrapperContained); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
// public static yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(net.minecraft.screen.slot.Slot.getStack()); }
// public void onCrafted(yarnwrap.item.ItemStack stack,int amount) { wrapperContained.onCrafted(stack.wrapperContained,amount); }
// public static void onCrafted(yarnwrap.item.ItemStack stack,int amount, ) { net.minecraft.screen.slot.Slot.onCrafted(stack.wrapperContained,amount); }
public yarnwrap.util.Identifier getBackgroundSprite() { return new yarnwrap.util.Identifier(wrapperContained.getBackgroundSprite()); }
// public static yarnwrap.util.Identifier getBackgroundSprite() { return new yarnwrap.util.Identifier(net.minecraft.screen.slot.Slot.getBackgroundSprite()); }
public boolean canInsert(yarnwrap.item.ItemStack stack) { return wrapperContained.canInsert(stack.wrapperContained); }
// public static boolean canInsert(yarnwrap.item.ItemStack stack, ) { return net.minecraft.screen.slot.Slot.canInsert(stack.wrapperContained); }
public boolean hasStack() { return wrapperContained.hasStack(); }
// public static boolean hasStack() { return net.minecraft.screen.slot.Slot.hasStack(); }
public boolean isEnabled() { return wrapperContained.isEnabled(); }
// public static boolean isEnabled() { return net.minecraft.screen.slot.Slot.isEnabled(); }
public yarnwrap.item.ItemStack takeStackRange(int min,int max,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.takeStackRange(min,max,player.wrapperContained)); }
// public static yarnwrap.item.ItemStack takeStackRange(int min,int max,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.item.ItemStack(net.minecraft.screen.slot.Slot.takeStackRange(min,max,player.wrapperContained)); }
public boolean canTakePartial(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canTakePartial(player.wrapperContained); }
// public static boolean canTakePartial(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.screen.slot.Slot.canTakePartial(player.wrapperContained); }
public yarnwrap.item.ItemStack insertStack(yarnwrap.item.ItemStack stack,int count) { return new yarnwrap.item.ItemStack(wrapperContained.insertStack(stack.wrapperContained,count)); }
// public static yarnwrap.item.ItemStack insertStack(yarnwrap.item.ItemStack stack,int count, ) { return new yarnwrap.item.ItemStack(net.minecraft.screen.slot.Slot.insertStack(stack.wrapperContained,count)); }
public yarnwrap.item.ItemStack insertStack(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.insertStack(stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack insertStack(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.screen.slot.Slot.insertStack(stack.wrapperContained)); }
public java.util.Optional tryTakeStackRange(int min,int max,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.tryTakeStackRange(min,max,player.wrapperContained); }
// public static java.util.Optional tryTakeStackRange(int min,int max,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.screen.slot.Slot.tryTakeStackRange(min,max,player.wrapperContained); }
// public void method_34265(yarnwrap.entity.player.PlayerEntity stack) { wrapperContained.method_34265(stack.wrapperContained); }
// public static void method_34265(yarnwrap.entity.player.PlayerEntity stack, ) { net.minecraft.screen.slot.Slot.method_34265(stack.wrapperContained); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.screen.slot.Slot.getIndex(); }
public void setStack(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack previousStack) { wrapperContained.setStack(stack.wrapperContained,previousStack.wrapperContained); }
// public static void setStack(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack previousStack, ) { net.minecraft.screen.slot.Slot.setStack(stack.wrapperContained,previousStack.wrapperContained); }
public boolean canBeHighlighted() { return wrapperContained.canBeHighlighted(); }
// public static boolean canBeHighlighted() { return net.minecraft.screen.slot.Slot.canBeHighlighted(); }
public void setStack(yarnwrap.item.ItemStack stack) { wrapperContained.setStack(stack.wrapperContained); }
// public static void setStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.slot.Slot.setStack(stack.wrapperContained); }
public boolean disablesDynamicDisplay() { return wrapperContained.disablesDynamicDisplay(); }
// public static boolean disablesDynamicDisplay() { return net.minecraft.screen.slot.Slot.disablesDynamicDisplay(); }

}