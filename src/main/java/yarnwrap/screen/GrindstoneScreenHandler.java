package yarnwrap.screen;
public class GrindstoneScreenHandler { public net.minecraft.screen.GrindstoneScreenHandler wrapperContained; public GrindstoneScreenHandler(net.minecraft.screen.GrindstoneScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(wrapperContained.input); }
// public void input(yarnwrap.inventory.Inventory value) { wrapperContained.input = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.GrindstoneScreenHandler.input); }
// public static void input(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.GrindstoneScreenHandler.input = value.wrapperContained; }

// public yarnwrap.inventory.Inventory result() { return new yarnwrap.inventory.Inventory(wrapperContained.result); }
// public void result(yarnwrap.inventory.Inventory value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory result() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.GrindstoneScreenHandler.result); }
// public static void result(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.GrindstoneScreenHandler.result = value.wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(net.minecraft.screen.GrindstoneScreenHandler.context); }
// public static void context(yarnwrap.screen.ScreenHandlerContext value, ) { net.minecraft.screen.GrindstoneScreenHandler.context = value.wrapperContained; }

// public int INPUT_1_ID() { return wrapperContained.INPUT_1_ID; }
// public void INPUT_1_ID(int value) { wrapperContained.INPUT_1_ID = value; }
public static int INPUT_1_ID() { return net.minecraft.screen.GrindstoneScreenHandler.INPUT_1_ID; }
// public static void INPUT_1_ID(int value, ) { net.minecraft.screen.GrindstoneScreenHandler.INPUT_1_ID = value; }

// public int INPUT_2_ID() { return wrapperContained.INPUT_2_ID; }
// public void INPUT_2_ID(int value) { wrapperContained.INPUT_2_ID = value; }
public static int INPUT_2_ID() { return net.minecraft.screen.GrindstoneScreenHandler.INPUT_2_ID; }
// public static void INPUT_2_ID(int value, ) { net.minecraft.screen.GrindstoneScreenHandler.INPUT_2_ID = value; }

// public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public void OUTPUT_ID(int value) { wrapperContained.OUTPUT_ID = value; }
public static int OUTPUT_ID() { return net.minecraft.screen.GrindstoneScreenHandler.OUTPUT_ID; }
// public static void OUTPUT_ID(int value, ) { net.minecraft.screen.GrindstoneScreenHandler.OUTPUT_ID = value; }

// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public static int INVENTORY_START() { return net.minecraft.screen.GrindstoneScreenHandler.INVENTORY_START; }
// public static void INVENTORY_START(int value, ) { net.minecraft.screen.GrindstoneScreenHandler.INVENTORY_START = value; }

// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public static int INVENTORY_END() { return net.minecraft.screen.GrindstoneScreenHandler.INVENTORY_END; }
// public static void INVENTORY_END(int value, ) { net.minecraft.screen.GrindstoneScreenHandler.INVENTORY_END = value; }

// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public static int HOTBAR_START() { return net.minecraft.screen.GrindstoneScreenHandler.HOTBAR_START; }
// public static void HOTBAR_START(int value, ) { net.minecraft.screen.GrindstoneScreenHandler.HOTBAR_START = value; }

// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public static int HOTBAR_END() { return net.minecraft.screen.GrindstoneScreenHandler.HOTBAR_END; }
// public static void HOTBAR_END(int value, ) { net.minecraft.screen.GrindstoneScreenHandler.HOTBAR_END = value; }

public GrindstoneScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.GrindstoneScreenHandler(syncId,playerInventory.wrapperContained); }
public GrindstoneScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.GrindstoneScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public yarnwrap.item.ItemStack grind(yarnwrap.item.ItemStack item) { return new yarnwrap.item.ItemStack(wrapperContained.grind(item.wrapperContained)); }
// public static yarnwrap.item.ItemStack grind(yarnwrap.item.ItemStack item, ) { return new yarnwrap.item.ItemStack(net.minecraft.screen.GrindstoneScreenHandler.grind(item.wrapperContained)); }
// public void updateResult() { wrapperContained.updateResult(); }
// public static void updateResult() { net.minecraft.screen.GrindstoneScreenHandler.updateResult(); }
// public void method_17415(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_17415(world.wrapperContained,pos.wrapperContained); }
// public static void method_17415(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos, ) { net.minecraft.screen.GrindstoneScreenHandler.method_17415(world.wrapperContained,pos.wrapperContained); }
// public void transferEnchantments(yarnwrap.item.ItemStack target,yarnwrap.item.ItemStack source) { wrapperContained.transferEnchantments(target.wrapperContained,source.wrapperContained); }
// public static void transferEnchantments(yarnwrap.item.ItemStack target,yarnwrap.item.ItemStack source, ) { net.minecraft.screen.GrindstoneScreenHandler.transferEnchantments(target.wrapperContained,source.wrapperContained); }
// public yarnwrap.item.ItemStack getOutputStack(yarnwrap.item.ItemStack firstInput,yarnwrap.item.ItemStack secondInput) { return new yarnwrap.item.ItemStack(wrapperContained.getOutputStack(firstInput.wrapperContained,secondInput.wrapperContained)); }
// public static yarnwrap.item.ItemStack getOutputStack(yarnwrap.item.ItemStack firstInput,yarnwrap.item.ItemStack secondInput, ) { return new yarnwrap.item.ItemStack(net.minecraft.screen.GrindstoneScreenHandler.getOutputStack(firstInput.wrapperContained,secondInput.wrapperContained)); }
// public void method_58071(yarnwrap.item.ItemStack components) { wrapperContained.method_58071(components.wrapperContained); }
// public static void method_58071(yarnwrap.item.ItemStack components, ) { net.minecraft.screen.GrindstoneScreenHandler.method_58071(components.wrapperContained); }
// public void method_58072(Object components) { wrapperContained.method_58072(components); }
// public static void method_58072(Object components, ) { net.minecraft.screen.GrindstoneScreenHandler.method_58072(components); }
// public boolean method_58073(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.method_58073(enchantment.wrapperContained); }
// public static boolean method_58073(yarnwrap.registry.entry.RegistryEntry enchantment, ) { return net.minecraft.screen.GrindstoneScreenHandler.method_58073(enchantment.wrapperContained); }
// public yarnwrap.item.ItemStack combineItems(yarnwrap.item.ItemStack firstInput,yarnwrap.item.ItemStack secondInput) { return new yarnwrap.item.ItemStack(wrapperContained.combineItems(firstInput.wrapperContained,secondInput.wrapperContained)); }
// public static yarnwrap.item.ItemStack combineItems(yarnwrap.item.ItemStack firstInput,yarnwrap.item.ItemStack secondInput, ) { return new yarnwrap.item.ItemStack(net.minecraft.screen.GrindstoneScreenHandler.combineItems(firstInput.wrapperContained,secondInput.wrapperContained)); }

}