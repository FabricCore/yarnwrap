package yarnwrap.data.loottable.vanilla;
public class VanillaEquipmentLootTableGenerator { public net.minecraft.data.loottable.vanilla.VanillaEquipmentLootTableGenerator wrapperContained; public VanillaEquipmentLootTableGenerator(net.minecraft.data.loottable.vanilla.VanillaEquipmentLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object createEquipmentTableBuilder(yarnwrap.item.Item helmet,yarnwrap.item.Item chestplate,yarnwrap.item.equipment.trim.ArmorTrim trim,Object enchantmentRegistryWrapper) { return wrapperContained.createEquipmentTableBuilder(helmet.wrapperContained,chestplate.wrapperContained,trim.wrapperContained,enchantmentRegistryWrapper); }
// public static Object createEquipmentTableBuilder(yarnwrap.item.Item helmet,yarnwrap.item.Item chestplate,yarnwrap.item.equipment.trim.ArmorTrim trim,Object enchantmentRegistryWrapper, ) { return net.minecraft.data.loottable.vanilla.VanillaEquipmentLootTableGenerator.createEquipmentTableBuilder(helmet.wrapperContained,chestplate.wrapperContained,trim.wrapperContained,enchantmentRegistryWrapper); }

}