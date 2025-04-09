package yarnwrap.item;
public class ArmorItem { public net.minecraft.item.ArmorItem wrapperContained; public ArmorItem(net.minecraft.item.ArmorItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier attributeModifiers() { return wrapperContained.attributeModifiers; }
// public Object type() { return wrapperContained.type; }
public yarnwrap.block.dispenser.DispenserBehavior DISPENSER_BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.DISPENSER_BEHAVIOR); }
// public yarnwrap.registry.entry.RegistryEntry material() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.material); }
public float getToughness() { return wrapperContained.getToughness(); }
public Object getType() { return wrapperContained.getType(); }
public boolean dispenseArmor(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack armor) { return wrapperContained.dispenseArmor(pointer.wrapperContained,armor.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getMaterial() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getMaterial()); }
public int getProtection() { return wrapperContained.getProtection(); }

}