package yarnwrap.screen;
public class BeaconScreenHandler { public net.minecraft.screen.BeaconScreenHandler wrapperContained; public BeaconScreenHandler(net.minecraft.screen.BeaconScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.Inventory payment() { return new yarnwrap.inventory.Inventory(wrapperContained.payment); }
// public Object paymentSlot() { return wrapperContained.paymentSlot; }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public int PAYMENT_SLOT_ID() { return wrapperContained.PAYMENT_SLOT_ID; }
// public int BEACON_INVENTORY_SIZE() { return wrapperContained.BEACON_INVENTORY_SIZE; }
// public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
public void setEffects(java.util.Optional primary,java.util.Optional secondary) { wrapperContained.setEffects(primary,secondary); }
public int getProperties() { return wrapperContained.getProperties(); }
public yarnwrap.registry.entry.RegistryEntry getPrimaryEffect() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getPrimaryEffect()); }
public yarnwrap.registry.entry.RegistryEntry getSecondaryEffect() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSecondaryEffect()); }
public boolean hasPayment() { return wrapperContained.hasPayment(); }
public int getRawIdForStatusEffect(yarnwrap.registry.entry.RegistryEntry effect) { return wrapperContained.getRawIdForStatusEffect(effect.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getStatusEffectForRawId(int id) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getStatusEffectForRawId(id)); }

}