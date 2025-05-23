package yarnwrap.data.loottable.vanilla;
public class VanillaEntityLootTableGenerator { public net.minecraft.data.loottable.vanilla.VanillaEntityLootTableGenerator wrapperContained; public VanillaEntityLootTableGenerator(net.minecraft.data.loottable.vanilla.VanillaEntityLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public VanillaEntityLootTableGenerator(Object registries) { this.wrapperContained = new net.minecraft.data.loottable.vanilla.VanillaEntityLootTableGenerator(registries); }
public Object createElderGuardianTableBuilder() { return wrapperContained.createElderGuardianTableBuilder(); }
// public static Object createElderGuardianTableBuilder() { return net.minecraft.data.loottable.vanilla.VanillaEntityLootTableGenerator.createElderGuardianTableBuilder(); }
// public void method_62736(yarnwrap.util.DyeColor color,yarnwrap.item.ItemConvertible wool) { wrapperContained.method_62736(color.wrapperContained,wool.wrapperContained); }
// public static void method_62736(yarnwrap.util.DyeColor color,yarnwrap.item.ItemConvertible wool, ) { net.minecraft.data.loottable.vanilla.VanillaEntityLootTableGenerator.method_62736(color.wrapperContained,wool.wrapperContained); }

}