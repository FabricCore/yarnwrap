package yarnwrap.data.server.loottable.vanilla;
public class VanillaFishingLootTableGenerator { public net.minecraft.data.server.loottable.vanilla.VanillaFishingLootTableGenerator wrapperContained; public VanillaFishingLootTableGenerator(net.minecraft.data.server.loottable.vanilla.VanillaFishingLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object createFishTableBuilder() { return wrapperContained.createFishTableBuilder(); }
public static Object createFishTableBuilder() { return net.minecraft.data.server.loottable.vanilla.VanillaFishingLootTableGenerator.createFishTableBuilder(); }

}