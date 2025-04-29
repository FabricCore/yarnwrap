package yarnwrap.data.server.loottable.vanilla;
public class VanillaEquipmentLootTableGenerator { public net.minecraft.data.server.loottable.vanilla.VanillaEquipmentLootTableGenerator wrapperContained; public VanillaEquipmentLootTableGenerator(net.minecraft.data.server.loottable.vanilla.VanillaEquipmentLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object createEquipmentTableBuilder(yarnwrap.item.Item helmet,yarnwrap.item.Item chestplate,yarnwrap.item.trim.ArmorTrim trim,Object enchantmentRegistryWrapper) { return wrapperContained.createEquipmentTableBuilder(helmet.wrapperContained,chestplate.wrapperContained,trim.wrapperContained,enchantmentRegistryWrapper); }
// public static Object createEquipmentTableBuilder(yarnwrap.item.Item helmet,yarnwrap.item.Item chestplate,yarnwrap.item.trim.ArmorTrim trim,Object enchantmentRegistryWrapper, ) { return net.minecraft.data.server.loottable.vanilla.VanillaEquipmentLootTableGenerator.createEquipmentTableBuilder(helmet.wrapperContained,chestplate.wrapperContained,trim.wrapperContained,enchantmentRegistryWrapper); }

}