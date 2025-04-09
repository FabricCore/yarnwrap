package yarnwrap.data.server.loottable.vanilla;
public class VanillaChestLootTableGenerator { public net.minecraft.data.server.loottable.vanilla.VanillaChestLootTableGenerator wrapperContained; public VanillaChestLootTableGenerator(net.minecraft.data.server.loottable.vanilla.VanillaChestLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public Object createShipwreckSupplyChestTableBuilder() { return wrapperContained.createShipwreckSupplyChestTableBuilder(); }
public Object createShipwreckMapChestTableBuilder() { return wrapperContained.createShipwreckMapChestTableBuilder(); }
public Object createBastionHoglinStableChestTableBuilder() { return wrapperContained.createBastionHoglinStableChestTableBuilder(); }
public Object createBastionBridgeChestTableBuilder() { return wrapperContained.createBastionBridgeChestTableBuilder(); }
public Object createEndCityTreasureChestTableBuilder() { return wrapperContained.createEndCityTreasureChestTableBuilder(); }
public Object createNetherBridgeChestTableBuilder() { return wrapperContained.createNetherBridgeChestTableBuilder(); }
public Object createBastionTreasureChestTableBuilder() { return wrapperContained.createBastionTreasureChestTableBuilder(); }
public Object createBastionOtherChestTableBuilder() { return wrapperContained.createBastionOtherChestTableBuilder(); }
public Object createWoodlandMansionChestTableBuilder() { return wrapperContained.createWoodlandMansionChestTableBuilder(); }
public Object createStrongholdLibraryChestTableBuilder() { return wrapperContained.createStrongholdLibraryChestTableBuilder(); }
public Object createStrongholdCorridorChestTableBuilder() { return wrapperContained.createStrongholdCorridorChestTableBuilder(); }
public Object createAncientCityChestTableBuilder() { return wrapperContained.createAncientCityChestTableBuilder(); }
public Object createJungleTempleChestTableBuilder() { return wrapperContained.createJungleTempleChestTableBuilder(); }
public Object createShipwreckTreasureChestTableBuilder() { return wrapperContained.createShipwreckTreasureChestTableBuilder(); }
public Object createPillagerOutpostChestTableBuilder() { return wrapperContained.createPillagerOutpostChestTableBuilder(); }
public Object createDesertPyramidChestTableBuilder() { return wrapperContained.createDesertPyramidChestTableBuilder(); }
public void acceptTrialSpawnerTables(java.util.function.BiConsumer lootTableBiConsumer) { wrapperContained.acceptTrialSpawnerTables(lootTableBiConsumer); }

}