package yarnwrap.screen;
public class LoomScreenHandler { public net.minecraft.screen.LoomScreenHandler wrapperContained; public LoomScreenHandler(net.minecraft.screen.LoomScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public yarnwrap.screen.Property selectedPattern() { return new yarnwrap.screen.Property(wrapperContained.selectedPattern); }
// public void selectedPattern(yarnwrap.screen.Property value) { wrapperContained.selectedPattern = value.wrapperContained; }
// public java.lang.Runnable inventoryChangeListener() { return wrapperContained.inventoryChangeListener; }
// public void inventoryChangeListener(java.lang.Runnable value) { wrapperContained.inventoryChangeListener = value; }
// public yarnwrap.screen.slot.Slot bannerSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.bannerSlot); }
// public void bannerSlot(yarnwrap.screen.slot.Slot value) { wrapperContained.bannerSlot = value.wrapperContained; }
// public yarnwrap.screen.slot.Slot dyeSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.dyeSlot); }
// public void dyeSlot(yarnwrap.screen.slot.Slot value) { wrapperContained.dyeSlot = value.wrapperContained; }
// public yarnwrap.screen.slot.Slot patternSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.patternSlot); }
// public void patternSlot(yarnwrap.screen.slot.Slot value) { wrapperContained.patternSlot = value.wrapperContained; }
// public yarnwrap.screen.slot.Slot outputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.outputSlot); }
// public void outputSlot(yarnwrap.screen.slot.Slot value) { wrapperContained.outputSlot = value.wrapperContained; }
// public yarnwrap.inventory.Inventory output() { return new yarnwrap.inventory.Inventory(wrapperContained.output); }
// public void output(yarnwrap.inventory.Inventory value) { wrapperContained.output = value.wrapperContained; }
// public long lastTakeResultTime() { return wrapperContained.lastTakeResultTime; }
// public void lastTakeResultTime(long value) { wrapperContained.lastTakeResultTime = value; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public int NO_PATTERN() { return wrapperContained.NO_PATTERN; }
// public void NO_PATTERN(int value) { wrapperContained.NO_PATTERN = value; }
// public java.util.List bannerPatterns() { return wrapperContained.bannerPatterns; }
// public void bannerPatterns(java.util.List value) { wrapperContained.bannerPatterns = value; }
// public yarnwrap.registry.RegistryEntryLookup bannerPatternLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.bannerPatternLookup); }
// public void bannerPatternLookup(yarnwrap.registry.RegistryEntryLookup value) { wrapperContained.bannerPatternLookup = value.wrapperContained; }
// public yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(wrapperContained.input); }
// public void input(yarnwrap.inventory.Inventory value) { wrapperContained.input = value.wrapperContained; }
public LoomScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.LoomScreenHandler(syncId,playerInventory.wrapperContained); }
public LoomScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.LoomScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public void method_17420(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_17420(world.wrapperContained,pos.wrapperContained); }
public void setInventoryChangeListener(java.lang.Runnable inventoryChangeListener) { wrapperContained.setInventoryChangeListener(inventoryChangeListener); }
public yarnwrap.screen.slot.Slot getBannerSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getBannerSlot()); }
public yarnwrap.screen.slot.Slot getDyeSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getDyeSlot()); }
public yarnwrap.screen.slot.Slot getPatternSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getPatternSlot()); }
public yarnwrap.screen.slot.Slot getOutputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getOutputSlot()); }
// public java.util.List getPatternsFor(yarnwrap.item.ItemStack stack) { return wrapperContained.getPatternsFor(stack.wrapperContained); }
public java.util.List getBannerPatterns() { return wrapperContained.getBannerPatterns(); }
// public boolean isPatternIndexValid(int index) { return wrapperContained.isPatternIndexValid(index); }
// public yarnwrap.component.type.BannerPatternsComponent method_57322(yarnwrap.registry.entry.RegistryEntry component) { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.method_57322(component.wrapperContained)); }
public int getSelectedPattern() { return wrapperContained.getSelectedPattern(); }
// public void updateOutputSlot(yarnwrap.registry.entry.RegistryEntry pattern) { wrapperContained.updateOutputSlot(pattern.wrapperContained); }

}