package yarnwrap.data.server.loottable.rebalance;
public class TradeRebalanceChestLootTableGenerator { public net.minecraft.data.server.loottable.rebalance.TradeRebalanceChestLootTableGenerator wrapperContained; public TradeRebalanceChestLootTableGenerator(net.minecraft.data.server.loottable.rebalance.TradeRebalanceChestLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public Object createPillagerOutpostChestTableBuilder() { return wrapperContained.createPillagerOutpostChestTableBuilder(); }
// public static Object createPillagerOutpostChestTableBuilder() { return net.minecraft.data.server.loottable.rebalance.TradeRebalanceChestLootTableGenerator.createPillagerOutpostChestTableBuilder(); }
public Object createDesertPyramidChestTableBuilder() { return wrapperContained.createDesertPyramidChestTableBuilder(); }
// public static Object createDesertPyramidChestTableBuilder() { return net.minecraft.data.server.loottable.rebalance.TradeRebalanceChestLootTableGenerator.createDesertPyramidChestTableBuilder(); }
public Object createAncientCityChestTableBuilder() { return wrapperContained.createAncientCityChestTableBuilder(); }
// public static Object createAncientCityChestTableBuilder() { return net.minecraft.data.server.loottable.rebalance.TradeRebalanceChestLootTableGenerator.createAncientCityChestTableBuilder(); }
public Object createJungleTempleChestTableBuilder() { return wrapperContained.createJungleTempleChestTableBuilder(); }
// public static Object createJungleTempleChestTableBuilder() { return net.minecraft.data.server.loottable.rebalance.TradeRebalanceChestLootTableGenerator.createJungleTempleChestTableBuilder(); }

}