package yarnwrap.data.loottable.vanilla;
public class VanillaFishingLootTableGenerator { public net.minecraft.data.loottable.vanilla.VanillaFishingLootTableGenerator wrapperContained; public VanillaFishingLootTableGenerator(net.minecraft.data.loottable.vanilla.VanillaFishingLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object createFishTableBuilder() { return wrapperContained.createFishTableBuilder(); }
public static Object createFishTableBuilder() { return net.minecraft.data.loottable.vanilla.VanillaFishingLootTableGenerator.createFishTableBuilder(); }

}