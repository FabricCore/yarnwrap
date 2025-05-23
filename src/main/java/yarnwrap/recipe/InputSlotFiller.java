package yarnwrap.recipe;
public class InputSlotFiller { public net.minecraft.recipe.InputSlotFiller wrapperContained; public InputSlotFiller(net.minecraft.recipe.InputSlotFiller wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object handler() { return wrapperContained.handler; }
// // public void handler(Object value) { wrapperContained.handler = value; }
// // public static Object handler() { return net.minecraft.recipe.InputSlotFiller.handler; }
// // public static void handler(Object value, ) { net.minecraft.recipe.InputSlotFiller.handler = value; }

// public yarnwrap.entity.player.PlayerInventory inventory() { return new yarnwrap.entity.player.PlayerInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.entity.player.PlayerInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerInventory inventory() { return new yarnwrap.entity.player.PlayerInventory(net.minecraft.recipe.InputSlotFiller.inventory); }
// public static void inventory(yarnwrap.entity.player.PlayerInventory value, ) { net.minecraft.recipe.InputSlotFiller.inventory = value.wrapperContained; }

// public boolean craftAll() { return wrapperContained.craftAll; }
// public void craftAll(boolean value) { wrapperContained.craftAll = value; }
// public static boolean craftAll() { return net.minecraft.recipe.InputSlotFiller.craftAll; }
// public static void craftAll(boolean value, ) { net.minecraft.recipe.InputSlotFiller.craftAll = value; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.recipe.InputSlotFiller.width; }
// public static void width(int value, ) { net.minecraft.recipe.InputSlotFiller.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.recipe.InputSlotFiller.height; }
// public static void height(int value, ) { net.minecraft.recipe.InputSlotFiller.height = value; }

// public java.util.List inputSlots() { return wrapperContained.inputSlots; }
// public void inputSlots(java.util.List value) { wrapperContained.inputSlots = value; }
// public static java.util.List inputSlots() { return net.minecraft.recipe.InputSlotFiller.inputSlots; }
// public static void inputSlots(java.util.List value, ) { net.minecraft.recipe.InputSlotFiller.inputSlots = value; }

// public java.util.List slotsToReturn() { return wrapperContained.slotsToReturn; }
// public void slotsToReturn(java.util.List value) { wrapperContained.slotsToReturn = value; }
// public static java.util.List slotsToReturn() { return net.minecraft.recipe.InputSlotFiller.slotsToReturn; }
// public static void slotsToReturn(java.util.List value, ) { net.minecraft.recipe.InputSlotFiller.slotsToReturn = value; }

// public InputSlotFiller(Object handler,yarnwrap.entity.player.PlayerInventory inventory,boolean craftAll,int width,int height,java.util.List inputSlots,java.util.List slotsToReturn) { this.wrapperContained = new net.minecraft.recipe.InputSlotFiller(handler,inventory.wrapperContained,craftAll,width,height,inputSlots,slotsToReturn); }
// public void returnInputs() { wrapperContained.returnInputs(); }
// public static void returnInputs() { net.minecraft.recipe.InputSlotFiller.returnInputs(); }
// public int getFreeInventorySlots() { return wrapperContained.getFreeInventorySlots(); }
// public static int getFreeInventorySlots() { return net.minecraft.recipe.InputSlotFiller.getFreeInventorySlots(); }
// public int fillInputSlot(yarnwrap.screen.slot.Slot slot,yarnwrap.registry.entry.RegistryEntry item,int count) { return wrapperContained.fillInputSlot(slot.wrapperContained,item.wrapperContained,count); }
// public static int fillInputSlot(yarnwrap.screen.slot.Slot slot,yarnwrap.registry.entry.RegistryEntry item,int count, ) { return net.minecraft.recipe.InputSlotFiller.fillInputSlot(slot.wrapperContained,item.wrapperContained,count); }
// public boolean canReturnInputs() { return wrapperContained.canReturnInputs(); }
// public static boolean canReturnInputs() { return net.minecraft.recipe.InputSlotFiller.canReturnInputs(); }
// public int calculateCraftAmount(int forCraftAll,boolean match) { return wrapperContained.calculateCraftAmount(forCraftAll,match); }
// public static int calculateCraftAmount(int forCraftAll,boolean match, ) { return net.minecraft.recipe.InputSlotFiller.calculateCraftAmount(forCraftAll,match); }
// public Object fill(Object handler,int width,int height,java.util.List inputSlots,java.util.List slotsToReturn,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll,boolean creative) { return wrapperContained.fill(handler,width,height,inputSlots,slotsToReturn,inventory.wrapperContained,recipe.wrapperContained,craftAll,creative); }
// public static Object fill(Object handler,int width,int height,java.util.List inputSlots,java.util.List slotsToReturn,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll,boolean creative, ) { return net.minecraft.recipe.InputSlotFiller.fill(handler,width,height,inputSlots,slotsToReturn,inventory.wrapperContained,recipe.wrapperContained,craftAll,creative); }
// public Object tryFill(yarnwrap.recipe.RecipeEntry recipe,yarnwrap.recipe.RecipeFinder finder) { return wrapperContained.tryFill(recipe.wrapperContained,finder.wrapperContained); }
// public static Object tryFill(yarnwrap.recipe.RecipeEntry recipe,yarnwrap.recipe.RecipeFinder finder, ) { return net.minecraft.recipe.InputSlotFiller.tryFill(recipe.wrapperContained,finder.wrapperContained); }
// public void fill(yarnwrap.recipe.RecipeEntry recipe,yarnwrap.recipe.RecipeFinder finder) { wrapperContained.fill(recipe.wrapperContained,finder.wrapperContained); }
// public static void fill(yarnwrap.recipe.RecipeEntry recipe,yarnwrap.recipe.RecipeFinder finder, ) { net.minecraft.recipe.InputSlotFiller.fill(recipe.wrapperContained,finder.wrapperContained); }
// public int clampToMaxCount(int count,java.util.List entries) { return wrapperContained.clampToMaxCount(count,entries); }
// public static int clampToMaxCount(int count,java.util.List entries, ) { return net.minecraft.recipe.InputSlotFiller.clampToMaxCount(count,entries); }
// public void method_65782(java.util.List slot,int index,java.lang.Integer x,int y) { wrapperContained.method_65782(slot,index,x,y); }
// public static void method_65782(java.util.List slot,int index,java.lang.Integer x,int y, ) { net.minecraft.recipe.InputSlotFiller.method_65782(slot,index,x,y); }

}