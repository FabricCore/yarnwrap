package yarnwrap.data.server.loottable.rebalance;
public class TradeRebalanceChestLootTableGenerator { public net.minecraft.data.server.loottable.rebalance.TradeRebalanceChestLootTableGenerator wrapperContained; public TradeRebalanceChestLootTableGenerator(net.minecraft.data.server.loottable.rebalance.TradeRebalanceChestLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public Object createPillagerOutpostChestTableBuilder() { return wrapperContained.createPillagerOutpostChestTableBuilder(); }
public Object createDesertPyramidChestTableBuilder() { return wrapperContained.createDesertPyramidChestTableBuilder(); }
public Object createAncientCityChestTableBuilder() { return wrapperContained.createAncientCityChestTableBuilder(); }
public Object createJungleTempleChestTableBuilder() { return wrapperContained.createJungleTempleChestTableBuilder(); }

}