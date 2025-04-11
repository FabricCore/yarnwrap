package yarnwrap.screen;
public class BeaconScreenHandler { public net.minecraft.screen.BeaconScreenHandler wrapperContained; public BeaconScreenHandler(net.minecraft.screen.BeaconScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory payment() { return new yarnwrap.inventory.Inventory(wrapperContained.payment); }
// public void payment(yarnwrap.inventory.Inventory value) { wrapperContained.payment = value.wrapperContained; }
// public Object paymentSlot() { return wrapperContained.paymentSlot; }
// // public void paymentSlot(Object value) { wrapperContained.paymentSlot = value; }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public int PAYMENT_SLOT_ID() { return wrapperContained.PAYMENT_SLOT_ID; }
// public void PAYMENT_SLOT_ID(int value) { wrapperContained.PAYMENT_SLOT_ID = value; }
// public int BEACON_INVENTORY_SIZE() { return wrapperContained.BEACON_INVENTORY_SIZE; }
// public void BEACON_INVENTORY_SIZE(int value) { wrapperContained.BEACON_INVENTORY_SIZE = value; }
// public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public void PROPERTY_COUNT(int value) { wrapperContained.PROPERTY_COUNT = value; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
public BeaconScreenHandler(int syncId,yarnwrap.inventory.Inventory inventory) { this.wrapperContained = new net.minecraft.screen.BeaconScreenHandler(syncId,inventory.wrapperContained); }
public BeaconScreenHandler(int syncId,yarnwrap.inventory.Inventory inventory,yarnwrap.screen.PropertyDelegate propertyDelegate,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.BeaconScreenHandler(syncId,inventory.wrapperContained,propertyDelegate.wrapperContained,context.wrapperContained); }
public void setEffects(java.util.Optional primary,java.util.Optional secondary) { wrapperContained.setEffects(primary,secondary); }
public int getProperties() { return wrapperContained.getProperties(); }
public yarnwrap.registry.entry.RegistryEntry getPrimaryEffect() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getPrimaryEffect()); }
public yarnwrap.registry.entry.RegistryEntry getSecondaryEffect() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSecondaryEffect()); }
public boolean hasPayment() { return wrapperContained.hasPayment(); }
public int getRawIdForStatusEffect(yarnwrap.registry.entry.RegistryEntry effect) { return wrapperContained.getRawIdForStatusEffect(effect.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getStatusEffectForRawId(int id) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getStatusEffectForRawId(id)); }

}