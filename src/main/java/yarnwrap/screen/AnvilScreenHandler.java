package yarnwrap.screen;
public class AnvilScreenHandler { public net.minecraft.screen.AnvilScreenHandler wrapperContained; public AnvilScreenHandler(net.minecraft.screen.AnvilScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.Property levelCost() { return new yarnwrap.screen.Property(wrapperContained.levelCost); }
// public void levelCost(yarnwrap.screen.Property value) { wrapperContained.levelCost = value.wrapperContained; }
// public static yarnwrap.screen.Property levelCost() { return new yarnwrap.screen.Property(net.minecraft.screen.AnvilScreenHandler.levelCost); }
// public static void levelCost(yarnwrap.screen.Property value, ) { net.minecraft.screen.AnvilScreenHandler.levelCost = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.screen.AnvilScreenHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.screen.AnvilScreenHandler.LOGGER = value; }

// public java.lang.String newItemName() { return wrapperContained.newItemName; }
// public void newItemName(java.lang.String value) { wrapperContained.newItemName = value; }
// public static java.lang.String newItemName() { return net.minecraft.screen.AnvilScreenHandler.newItemName; }
// public static void newItemName(java.lang.String value, ) { net.minecraft.screen.AnvilScreenHandler.newItemName = value; }

// public int repairItemUsage() { return wrapperContained.repairItemUsage; }
// public void repairItemUsage(int value) { wrapperContained.repairItemUsage = value; }
// public static int repairItemUsage() { return net.minecraft.screen.AnvilScreenHandler.repairItemUsage; }
// public static void repairItemUsage(int value, ) { net.minecraft.screen.AnvilScreenHandler.repairItemUsage = value; }

// public int MAX_NAME_LENGTH() { return wrapperContained.MAX_NAME_LENGTH; }
// public void MAX_NAME_LENGTH(int value) { wrapperContained.MAX_NAME_LENGTH = value; }
public static int MAX_NAME_LENGTH() { return net.minecraft.screen.AnvilScreenHandler.MAX_NAME_LENGTH; }
// public static void MAX_NAME_LENGTH(int value, ) { net.minecraft.screen.AnvilScreenHandler.MAX_NAME_LENGTH = value; }

// public int INPUT_1_X() { return wrapperContained.INPUT_1_X; }
// public void INPUT_1_X(int value) { wrapperContained.INPUT_1_X = value; }
// public static int INPUT_1_X() { return net.minecraft.screen.AnvilScreenHandler.INPUT_1_X; }
// public static void INPUT_1_X(int value, ) { net.minecraft.screen.AnvilScreenHandler.INPUT_1_X = value; }

// public int INPUT_2_X() { return wrapperContained.INPUT_2_X; }
// public void INPUT_2_X(int value) { wrapperContained.INPUT_2_X = value; }
// public static int INPUT_2_X() { return net.minecraft.screen.AnvilScreenHandler.INPUT_2_X; }
// public static void INPUT_2_X(int value, ) { net.minecraft.screen.AnvilScreenHandler.INPUT_2_X = value; }

// public int OUTPUT_X() { return wrapperContained.OUTPUT_X; }
// public void OUTPUT_X(int value) { wrapperContained.OUTPUT_X = value; }
// public static int OUTPUT_X() { return net.minecraft.screen.AnvilScreenHandler.OUTPUT_X; }
// public static void OUTPUT_X(int value, ) { net.minecraft.screen.AnvilScreenHandler.OUTPUT_X = value; }

// public int SLOT_Y() { return wrapperContained.SLOT_Y; }
// public void SLOT_Y(int value) { wrapperContained.SLOT_Y = value; }
// public static int SLOT_Y() { return net.minecraft.screen.AnvilScreenHandler.SLOT_Y; }
// public static void SLOT_Y(int value, ) { net.minecraft.screen.AnvilScreenHandler.SLOT_Y = value; }

// public int INPUT_1_ID() { return wrapperContained.INPUT_1_ID; }
// public void INPUT_1_ID(int value) { wrapperContained.INPUT_1_ID = value; }
public static int INPUT_1_ID() { return net.minecraft.screen.AnvilScreenHandler.INPUT_1_ID; }
// public static void INPUT_1_ID(int value, ) { net.minecraft.screen.AnvilScreenHandler.INPUT_1_ID = value; }

// public int INPUT_2_ID() { return wrapperContained.INPUT_2_ID; }
// public void INPUT_2_ID(int value) { wrapperContained.INPUT_2_ID = value; }
public static int INPUT_2_ID() { return net.minecraft.screen.AnvilScreenHandler.INPUT_2_ID; }
// public static void INPUT_2_ID(int value, ) { net.minecraft.screen.AnvilScreenHandler.INPUT_2_ID = value; }

// public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public void OUTPUT_ID(int value) { wrapperContained.OUTPUT_ID = value; }
public static int OUTPUT_ID() { return net.minecraft.screen.AnvilScreenHandler.OUTPUT_ID; }
// public static void OUTPUT_ID(int value, ) { net.minecraft.screen.AnvilScreenHandler.OUTPUT_ID = value; }

// public boolean keepSecondSlot() { return wrapperContained.keepSecondSlot; }
// public void keepSecondSlot(boolean value) { wrapperContained.keepSecondSlot = value; }
// public static boolean keepSecondSlot() { return net.minecraft.screen.AnvilScreenHandler.keepSecondSlot; }
// public static void keepSecondSlot(boolean value, ) { net.minecraft.screen.AnvilScreenHandler.keepSecondSlot = value; }

public AnvilScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory inventory) { this.wrapperContained = new net.minecraft.screen.AnvilScreenHandler(syncId,inventory.wrapperContained); }
public AnvilScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.AnvilScreenHandler(syncId,inventory.wrapperContained,context.wrapperContained); }
public boolean setNewItemName(java.lang.String newItemName) { return wrapperContained.setNewItemName(newItemName); }
// public static boolean setNewItemName(java.lang.String newItemName, ) { return net.minecraft.screen.AnvilScreenHandler.setNewItemName(newItemName); }
public int getLevelCost() { return wrapperContained.getLevelCost(); }
// public static int getLevelCost() { return net.minecraft.screen.AnvilScreenHandler.getLevelCost(); }
// public int getNextCost(int cost) { return wrapperContained.getNextCost(cost); }
// public static int getNextCost(int cost, ) { return net.minecraft.screen.AnvilScreenHandler.getNextCost(cost); }
// public void method_24922(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_24922(world.wrapperContained,pos.wrapperContained); }
// public static void method_24922(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos, ) { net.minecraft.screen.AnvilScreenHandler.method_24922(world.wrapperContained,pos.wrapperContained); }
// public boolean method_48350(yarnwrap.item.ItemStack stack) { return wrapperContained.method_48350(stack.wrapperContained); }
// public static boolean method_48350(yarnwrap.item.ItemStack stack, ) { return net.minecraft.screen.AnvilScreenHandler.method_48350(stack.wrapperContained); }
// public boolean method_48351(yarnwrap.item.ItemStack stack) { return wrapperContained.method_48351(stack.wrapperContained); }
// public static boolean method_48351(yarnwrap.item.ItemStack stack, ) { return net.minecraft.screen.AnvilScreenHandler.method_48351(stack.wrapperContained); }
// public yarnwrap.screen.slot.ForgingSlotsManager getForgingSlotsManager() { return new yarnwrap.screen.slot.ForgingSlotsManager(wrapperContained.getForgingSlotsManager()); }
// public static yarnwrap.screen.slot.ForgingSlotsManager getForgingSlotsManager() { return new yarnwrap.screen.slot.ForgingSlotsManager(net.minecraft.screen.AnvilScreenHandler.getForgingSlotsManager()); }
// public java.lang.String sanitize(java.lang.String name) { return wrapperContained.sanitize(name); }
// public static java.lang.String sanitize(java.lang.String name, ) { return net.minecraft.screen.AnvilScreenHandler.sanitize(name); }

}