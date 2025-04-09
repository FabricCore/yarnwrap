package yarnwrap.screen;
public class LoomScreenHandler { public net.minecraft.screen.LoomScreenHandler wrapperContained; public LoomScreenHandler(net.minecraft.screen.LoomScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public yarnwrap.screen.Property selectedPattern() { return new yarnwrap.screen.Property(wrapperContained.selectedPattern); }
// public java.lang.Runnable inventoryChangeListener() { return wrapperContained.inventoryChangeListener; }
// public yarnwrap.screen.slot.Slot bannerSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.bannerSlot); }
// public yarnwrap.screen.slot.Slot dyeSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.dyeSlot); }
// public yarnwrap.screen.slot.Slot patternSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.patternSlot); }
// public yarnwrap.screen.slot.Slot outputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.outputSlot); }
// public yarnwrap.inventory.Inventory output() { return new yarnwrap.inventory.Inventory(wrapperContained.output); }
// public long lastTakeResultTime() { return wrapperContained.lastTakeResultTime; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public int NO_PATTERN() { return wrapperContained.NO_PATTERN; }
// public java.util.List bannerPatterns() { return wrapperContained.bannerPatterns; }
// public yarnwrap.registry.RegistryEntryLookup bannerPatternLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.bannerPatternLookup); }
// public yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(wrapperContained.input); }
public void setInventoryChangeListener(java.lang.Runnable inventoryChangeListener) { wrapperContained.setInventoryChangeListener(inventoryChangeListener); }
public yarnwrap.screen.slot.Slot getBannerSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getBannerSlot()); }
public yarnwrap.screen.slot.Slot getDyeSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getDyeSlot()); }
public yarnwrap.screen.slot.Slot getPatternSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getPatternSlot()); }
public yarnwrap.screen.slot.Slot getOutputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getOutputSlot()); }
// public java.util.List getPatternsFor(yarnwrap.item.ItemStack stack) { return wrapperContained.getPatternsFor(stack.wrapperContained); }
public java.util.List getBannerPatterns() { return wrapperContained.getBannerPatterns(); }
// public boolean isPatternIndexValid(int index) { return wrapperContained.isPatternIndexValid(index); }
public int getSelectedPattern() { return wrapperContained.getSelectedPattern(); }
// public void updateOutputSlot(yarnwrap.registry.entry.RegistryEntry pattern) { wrapperContained.updateOutputSlot(pattern.wrapperContained); }

}