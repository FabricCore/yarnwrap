package yarnwrap.screen;
public class AnvilScreenHandler { public net.minecraft.screen.AnvilScreenHandler wrapperContained; public AnvilScreenHandler(net.minecraft.screen.AnvilScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_NAME_LENGTH() { return wrapperContained.MAX_NAME_LENGTH; }
// public int INPUT_1_X() { return wrapperContained.INPUT_1_X; }
// public int INPUT_2_X() { return wrapperContained.INPUT_2_X; }
// public int OUTPUT_X() { return wrapperContained.OUTPUT_X; }
// public int SLOT_Y() { return wrapperContained.SLOT_Y; }
public int INPUT_1_ID() { return wrapperContained.INPUT_1_ID; }
public int INPUT_2_ID() { return wrapperContained.INPUT_2_ID; }
public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public yarnwrap.screen.Property levelCost() { return new yarnwrap.screen.Property(wrapperContained.levelCost); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String newItemName() { return wrapperContained.newItemName; }
// public int repairItemUsage() { return wrapperContained.repairItemUsage; }
public int getLevelCost() { return wrapperContained.getLevelCost(); }
public int getNextCost(int cost) { return wrapperContained.getNextCost(cost); }
// public java.lang.String sanitize(java.lang.String name) { return wrapperContained.sanitize(name); }
public boolean setNewItemName(java.lang.String newItemName) { return wrapperContained.setNewItemName(newItemName); }

}