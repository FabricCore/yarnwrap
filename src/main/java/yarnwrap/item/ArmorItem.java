package yarnwrap.item;
public class ArmorItem { public net.minecraft.item.ArmorItem wrapperContained; public ArmorItem(net.minecraft.item.ArmorItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier attributeModifiers() { return wrapperContained.attributeModifiers; }
// public void attributeModifiers(java.util.function.Supplier value) { wrapperContained.attributeModifiers = value; }
// public static java.util.function.Supplier attributeModifiers() { return net.minecraft.item.ArmorItem.attributeModifiers; }
// public static void attributeModifiers(java.util.function.Supplier value, ) { net.minecraft.item.ArmorItem.attributeModifiers = value; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.item.ArmorItem.type; }
// // public static void type(Object value, ) { net.minecraft.item.ArmorItem.type = value; }

// public yarnwrap.block.dispenser.DispenserBehavior DISPENSER_BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.DISPENSER_BEHAVIOR); }
// public void DISPENSER_BEHAVIOR(yarnwrap.block.dispenser.DispenserBehavior value) { wrapperContained.DISPENSER_BEHAVIOR = value.wrapperContained; }
public static yarnwrap.block.dispenser.DispenserBehavior DISPENSER_BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(net.minecraft.item.ArmorItem.DISPENSER_BEHAVIOR); }
// public static void DISPENSER_BEHAVIOR(yarnwrap.block.dispenser.DispenserBehavior value, ) { net.minecraft.item.ArmorItem.DISPENSER_BEHAVIOR = value.wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry material() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.material); }
// public void material(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.material = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry material() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.item.ArmorItem.material); }
// public static void material(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.item.ArmorItem.material = value.wrapperContained; }

// public ArmorItem(yarnwrap.registry.entry.RegistryEntry material,Object type,Object settings) { this.wrapperContained = new net.minecraft.item.ArmorItem(material.wrapperContained,type,settings); }
public float getToughness() { return wrapperContained.getToughness(); }
// public static float getToughness() { return net.minecraft.item.ArmorItem.getToughness(); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.item.ArmorItem.getType(); }
// public boolean dispenseArmor(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack armor) { return wrapperContained.dispenseArmor(pointer.wrapperContained,armor.wrapperContained); }
// public static boolean dispenseArmor(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack armor, ) { return net.minecraft.item.ArmorItem.dispenseArmor(pointer.wrapperContained,armor.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getMaterial() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getMaterial()); }
// public static yarnwrap.registry.entry.RegistryEntry getMaterial() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.item.ArmorItem.getMaterial()); }
public int getProtection() { return wrapperContained.getProtection(); }
// public static int getProtection() { return net.minecraft.item.ArmorItem.getProtection(); }

}