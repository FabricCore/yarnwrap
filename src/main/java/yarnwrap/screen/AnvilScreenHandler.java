package yarnwrap.screen;
public class AnvilScreenHandler { public net.minecraft.screen.AnvilScreenHandler wrapperContained; public AnvilScreenHandler(net.minecraft.screen.AnvilScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_NAME_LENGTH() { return wrapperContained.MAX_NAME_LENGTH; }
// public void MAX_NAME_LENGTH(int value) { wrapperContained.MAX_NAME_LENGTH = value; }
// public int INPUT_1_X() { return wrapperContained.INPUT_1_X; }
// public void INPUT_1_X(int value) { wrapperContained.INPUT_1_X = value; }
// public int INPUT_2_X() { return wrapperContained.INPUT_2_X; }
// public void INPUT_2_X(int value) { wrapperContained.INPUT_2_X = value; }
// public int OUTPUT_X() { return wrapperContained.OUTPUT_X; }
// public void OUTPUT_X(int value) { wrapperContained.OUTPUT_X = value; }
// public int SLOT_Y() { return wrapperContained.SLOT_Y; }
// public void SLOT_Y(int value) { wrapperContained.SLOT_Y = value; }
public int INPUT_1_ID() { return wrapperContained.INPUT_1_ID; }
// public void INPUT_1_ID(int value) { wrapperContained.INPUT_1_ID = value; }
public int INPUT_2_ID() { return wrapperContained.INPUT_2_ID; }
// public void INPUT_2_ID(int value) { wrapperContained.INPUT_2_ID = value; }
public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public void OUTPUT_ID(int value) { wrapperContained.OUTPUT_ID = value; }
// public yarnwrap.screen.Property levelCost() { return new yarnwrap.screen.Property(wrapperContained.levelCost); }
// public void levelCost(yarnwrap.screen.Property value) { wrapperContained.levelCost = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String newItemName() { return wrapperContained.newItemName; }
// public void newItemName(java.lang.String value) { wrapperContained.newItemName = value; }
// public int repairItemUsage() { return wrapperContained.repairItemUsage; }
// public void repairItemUsage(int value) { wrapperContained.repairItemUsage = value; }
public AnvilScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory inventory) { this.wrapperContained = new net.minecraft.screen.AnvilScreenHandler(syncId,inventory.wrapperContained); }
public AnvilScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.AnvilScreenHandler(syncId,inventory.wrapperContained,context.wrapperContained); }
public int getLevelCost() { return wrapperContained.getLevelCost(); }
public int getNextCost(int cost) { return wrapperContained.getNextCost(cost); }
// public void method_24922(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_24922(world.wrapperContained,pos.wrapperContained); }
// public boolean method_48350(yarnwrap.item.ItemStack stack) { return wrapperContained.method_48350(stack.wrapperContained); }
// public boolean method_48351(yarnwrap.item.ItemStack stack) { return wrapperContained.method_48351(stack.wrapperContained); }
// public java.lang.String sanitize(java.lang.String name) { return wrapperContained.sanitize(name); }
public boolean setNewItemName(java.lang.String newItemName) { return wrapperContained.setNewItemName(newItemName); }

}