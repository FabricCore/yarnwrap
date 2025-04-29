package yarnwrap.screen;
public class CartographyTableScreenHandler { public net.minecraft.screen.CartographyTableScreenHandler wrapperContained; public CartographyTableScreenHandler(net.minecraft.screen.CartographyTableScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.CartographyTableScreenHandler.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.CartographyTableScreenHandler.inventory = value.wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(net.minecraft.screen.CartographyTableScreenHandler.context); }
// public static void context(yarnwrap.screen.ScreenHandlerContext value, ) { net.minecraft.screen.CartographyTableScreenHandler.context = value.wrapperContained; }

// public yarnwrap.inventory.CraftingResultInventory resultInventory() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.resultInventory); }
// public void resultInventory(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.resultInventory = value.wrapperContained; }
// public static yarnwrap.inventory.CraftingResultInventory resultInventory() { return new yarnwrap.inventory.CraftingResultInventory(net.minecraft.screen.CartographyTableScreenHandler.resultInventory); }
// public static void resultInventory(yarnwrap.inventory.CraftingResultInventory value, ) { net.minecraft.screen.CartographyTableScreenHandler.resultInventory = value.wrapperContained; }

// public long lastTakeResultTime() { return wrapperContained.lastTakeResultTime; }
// public void lastTakeResultTime(long value) { wrapperContained.lastTakeResultTime = value; }
// public static long lastTakeResultTime() { return net.minecraft.screen.CartographyTableScreenHandler.lastTakeResultTime; }
// public static void lastTakeResultTime(long value, ) { net.minecraft.screen.CartographyTableScreenHandler.lastTakeResultTime = value; }

// public int MAP_SLOT_INDEX() { return wrapperContained.MAP_SLOT_INDEX; }
// public void MAP_SLOT_INDEX(int value) { wrapperContained.MAP_SLOT_INDEX = value; }
public static int MAP_SLOT_INDEX() { return net.minecraft.screen.CartographyTableScreenHandler.MAP_SLOT_INDEX; }
// public static void MAP_SLOT_INDEX(int value, ) { net.minecraft.screen.CartographyTableScreenHandler.MAP_SLOT_INDEX = value; }

// public int MATERIAL_SLOT_INDEX() { return wrapperContained.MATERIAL_SLOT_INDEX; }
// public void MATERIAL_SLOT_INDEX(int value) { wrapperContained.MATERIAL_SLOT_INDEX = value; }
public static int MATERIAL_SLOT_INDEX() { return net.minecraft.screen.CartographyTableScreenHandler.MATERIAL_SLOT_INDEX; }
// public static void MATERIAL_SLOT_INDEX(int value, ) { net.minecraft.screen.CartographyTableScreenHandler.MATERIAL_SLOT_INDEX = value; }

// public int RESULT_SLOT_INDEX() { return wrapperContained.RESULT_SLOT_INDEX; }
// public void RESULT_SLOT_INDEX(int value) { wrapperContained.RESULT_SLOT_INDEX = value; }
public static int RESULT_SLOT_INDEX() { return net.minecraft.screen.CartographyTableScreenHandler.RESULT_SLOT_INDEX; }
// public static void RESULT_SLOT_INDEX(int value, ) { net.minecraft.screen.CartographyTableScreenHandler.RESULT_SLOT_INDEX = value; }

// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public static int INVENTORY_START() { return net.minecraft.screen.CartographyTableScreenHandler.INVENTORY_START; }
// public static void INVENTORY_START(int value, ) { net.minecraft.screen.CartographyTableScreenHandler.INVENTORY_START = value; }

// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public static int INVENTORY_END() { return net.minecraft.screen.CartographyTableScreenHandler.INVENTORY_END; }
// public static void INVENTORY_END(int value, ) { net.minecraft.screen.CartographyTableScreenHandler.INVENTORY_END = value; }

// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public static int HOTBAR_START() { return net.minecraft.screen.CartographyTableScreenHandler.HOTBAR_START; }
// public static void HOTBAR_START(int value, ) { net.minecraft.screen.CartographyTableScreenHandler.HOTBAR_START = value; }

// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public static int HOTBAR_END() { return net.minecraft.screen.CartographyTableScreenHandler.HOTBAR_END; }
// public static void HOTBAR_END(int value, ) { net.minecraft.screen.CartographyTableScreenHandler.HOTBAR_END = value; }

public CartographyTableScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory inventory) { this.wrapperContained = new net.minecraft.screen.CartographyTableScreenHandler(syncId,inventory.wrapperContained); }
public CartographyTableScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.CartographyTableScreenHandler(syncId,inventory.wrapperContained,context.wrapperContained); }
// public void method_17379(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_17379(world.wrapperContained,pos.wrapperContained); }
// public static void method_17379(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos, ) { net.minecraft.screen.CartographyTableScreenHandler.method_17379(world.wrapperContained,pos.wrapperContained); }
// public void updateResult(yarnwrap.item.ItemStack map,yarnwrap.item.ItemStack item,yarnwrap.item.ItemStack oldResult) { wrapperContained.updateResult(map.wrapperContained,item.wrapperContained,oldResult.wrapperContained); }
// public static void updateResult(yarnwrap.item.ItemStack map,yarnwrap.item.ItemStack item,yarnwrap.item.ItemStack oldResult, ) { net.minecraft.screen.CartographyTableScreenHandler.updateResult(map.wrapperContained,item.wrapperContained,oldResult.wrapperContained); }
// public void method_17382(yarnwrap.item.ItemStack world,yarnwrap.item.ItemStack pos) { wrapperContained.method_17382(world.wrapperContained,pos.wrapperContained); }
// public static void method_17382(yarnwrap.item.ItemStack world,yarnwrap.item.ItemStack pos, ) { net.minecraft.screen.CartographyTableScreenHandler.method_17382(world.wrapperContained,pos.wrapperContained); }

}