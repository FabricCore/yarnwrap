package yarnwrap.data.server.loottable;
public class BlockLootTableGenerator { public net.minecraft.data.server.loottable.BlockLootTableGenerator wrapperContained; public BlockLootTableGenerator(net.minecraft.data.server.loottable.BlockLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object WITH_SHEARS() { return wrapperContained.WITH_SHEARS; }
// public float[] SAPLING_DROP_CHANCE() { return wrapperContained.SAPLING_DROP_CHANCE; }
// public java.util.Set explosionImmuneItems() { return wrapperContained.explosionImmuneItems; }
// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public java.util.Map lootTables() { return wrapperContained.lootTables; }
// public float[] LEAVES_STICK_DROP_CHANCE() { return wrapperContained.LEAVES_STICK_DROP_CHANCE; }
// public Object registryLookup() { return wrapperContained.registryLookup; }
// public void generate() { wrapperContained.generate(); }
public Object dropsNothing() { return wrapperContained.dropsNothing(); }
public Object drops(yarnwrap.item.ItemConvertible drop) { return wrapperContained.drops(drop.wrapperContained); }
// public yarnwrap.loot.function.LootFunctionConsumingBuilder applyExplosionDecay(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.function.LootFunctionConsumingBuilder builder) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(wrapperContained.applyExplosionDecay(drop.wrapperContained,builder.wrapperContained)); }
// public yarnwrap.loot.condition.LootConditionConsumingBuilder addSurvivesExplosionCondition(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.condition.LootConditionConsumingBuilder builder) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(wrapperContained.addSurvivesExplosionCondition(drop.wrapperContained,builder.wrapperContained)); }
// public Object drops(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.provider.number.LootNumberProvider count) { return wrapperContained.drops(drop.wrapperContained,count.wrapperContained); }
// public Object slabDrops(yarnwrap.block.Block drop) { return wrapperContained.slabDrops(drop.wrapperContained); }
// public Object oreDrops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.Item withoutSilkTouch) { return wrapperContained.oreDrops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
// public Object cropDrops(yarnwrap.block.Block crop,yarnwrap.item.Item product,yarnwrap.item.Item seeds,Object condition) { return wrapperContained.cropDrops(crop.wrapperContained,product.wrapperContained,seeds.wrapperContained,condition); }
// public Object drops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.ItemConvertible withoutSilkTouch) { return wrapperContained.drops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
// public Object drops(yarnwrap.block.Block block,yarnwrap.item.ItemConvertible drop,yarnwrap.loot.provider.number.LootNumberProvider count) { return wrapperContained.drops(block.wrapperContained,drop.wrapperContained,count.wrapperContained); }
// public Object tallPlantDrops(yarnwrap.block.Block tallPlant,yarnwrap.block.Block shortPlant) { return wrapperContained.tallPlantDrops(tallPlant.wrapperContained,shortPlant.wrapperContained); }
// public Object leavesDrops(yarnwrap.block.Block leaves,yarnwrap.block.Block sapling,float saplingChance) { return wrapperContained.leavesDrops(leaves.wrapperContained,sapling.wrapperContained,saplingChance); }
// public Object dropsWithProperty(yarnwrap.block.Block drop,yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.dropsWithProperty(drop.wrapperContained,property.wrapperContained,value); }
// public void addDrop(yarnwrap.block.Block block,Object lootTable) { wrapperContained.addDrop(block.wrapperContained,lootTable); }
// public Object dropsWithSilkTouch(yarnwrap.block.Block block,Object loot) { return wrapperContained.dropsWithSilkTouch(block.wrapperContained,loot); }
// public Object multifaceGrowthDrops(yarnwrap.block.Block drop,Object condition) { return wrapperContained.multifaceGrowthDrops(drop.wrapperContained,condition); }
// public Object drops(yarnwrap.block.Block drop,Object conditionBuilder,Object child) { return wrapperContained.drops(drop.wrapperContained,conditionBuilder,child); }
// public void addDrop(yarnwrap.block.Block block,java.util.function.Function lootTableFunction) { wrapperContained.addDrop(block.wrapperContained,lootTableFunction); }
// public Object dropsWithShears(yarnwrap.item.ItemConvertible drop) { return wrapperContained.dropsWithShears(drop.wrapperContained); }
// public Object nameableContainerDrops(yarnwrap.block.Block drop) { return wrapperContained.nameableContainerDrops(drop.wrapperContained); }
public Object cropStemDrops(yarnwrap.block.Block stem,yarnwrap.item.Item drop) { return wrapperContained.cropStemDrops(stem.wrapperContained,drop.wrapperContained); }
// public Object mushroomBlockDrops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.ItemConvertible withoutSilkTouch) { return wrapperContained.mushroomBlockDrops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
// public void addVinePlantDrop(yarnwrap.block.Block vine,yarnwrap.block.Block vinePlant) { wrapperContained.addVinePlantDrop(vine.wrapperContained,vinePlant.wrapperContained); }
// public Object oakLeavesDrops(yarnwrap.block.Block leaves,yarnwrap.block.Block sapling,float saplingChance) { return wrapperContained.oakLeavesDrops(leaves.wrapperContained,sapling.wrapperContained,saplingChance); }
// public Object dropsWithShears(yarnwrap.block.Block block,Object loot) { return wrapperContained.dropsWithShears(block.wrapperContained,loot); }
// public Object dropsWithSilkTouch(yarnwrap.item.ItemConvertible drop) { return wrapperContained.dropsWithSilkTouch(drop.wrapperContained); }
// public Object shulkerBoxDrops(yarnwrap.block.Block drop) { return wrapperContained.shulkerBoxDrops(drop.wrapperContained); }
public Object attachedCropStemDrops(yarnwrap.block.Block stem,yarnwrap.item.Item drop) { return wrapperContained.attachedCropStemDrops(stem.wrapperContained,drop.wrapperContained); }
// public void addDrop(yarnwrap.block.Block block,yarnwrap.item.ItemConvertible drop) { wrapperContained.addDrop(block.wrapperContained,drop.wrapperContained); }
// public void addDropWithSilkTouch(yarnwrap.block.Block block,yarnwrap.block.Block drop) { wrapperContained.addDropWithSilkTouch(block.wrapperContained,drop.wrapperContained); }
// public Object dropsWithSilkTouchOrShears(yarnwrap.block.Block block,Object loot) { return wrapperContained.dropsWithSilkTouchOrShears(block.wrapperContained,loot); }
// public Object pottedPlantDrops(yarnwrap.item.ItemConvertible drop) { return wrapperContained.pottedPlantDrops(drop.wrapperContained); }
// public Object copperOreDrops(yarnwrap.block.Block drop) { return wrapperContained.copperOreDrops(drop.wrapperContained); }
// public Object lapisOreDrops(yarnwrap.block.Block drop) { return wrapperContained.lapisOreDrops(drop.wrapperContained); }
// public Object redstoneOreDrops(yarnwrap.block.Block drop) { return wrapperContained.redstoneOreDrops(drop.wrapperContained); }
// public Object bannerDrops(yarnwrap.block.Block drop) { return wrapperContained.bannerDrops(drop.wrapperContained); }
// public Object beeNestDrops(yarnwrap.block.Block drop) { return wrapperContained.beeNestDrops(drop.wrapperContained); }
// public Object beehiveDrops(yarnwrap.block.Block drop) { return wrapperContained.beehiveDrops(drop.wrapperContained); }
// public Object glowBerryDrops(yarnwrap.block.Block drop) { return wrapperContained.glowBerryDrops(drop.wrapperContained); }
// public Object shortPlantDrops(yarnwrap.block.Block withShears) { return wrapperContained.shortPlantDrops(withShears.wrapperContained); }
// public Object mangroveLeavesDrops(yarnwrap.block.Block leaves) { return wrapperContained.mangroveLeavesDrops(leaves.wrapperContained); }
// public Object seagrassDrops(yarnwrap.block.Block seagrass) { return wrapperContained.seagrassDrops(seagrass.wrapperContained); }
// public Object candleDrops(yarnwrap.block.Block candle) { return wrapperContained.candleDrops(candle.wrapperContained); }
// public Object candleCakeDrops(yarnwrap.block.Block candleCake) { return wrapperContained.candleCakeDrops(candleCake.wrapperContained); }
// public Object doorDrops(yarnwrap.block.Block block) { return wrapperContained.doorDrops(block.wrapperContained); }
// public void addPottedPlantDrops(yarnwrap.block.Block block) { wrapperContained.addPottedPlantDrops(block.wrapperContained); }
// public void addDropWithSilkTouch(yarnwrap.block.Block block) { wrapperContained.addDropWithSilkTouch(block.wrapperContained); }
// public void addDrop(yarnwrap.block.Block block) { wrapperContained.addDrop(block.wrapperContained); }
// public Object flowerbedDrops(yarnwrap.block.Block flowerbed) { return wrapperContained.flowerbedDrops(flowerbed.wrapperContained); }
// public Object createSilkTouchCondition() { return wrapperContained.createSilkTouchCondition(); }
// public Object createWithoutSilkTouchCondition() { return wrapperContained.createWithoutSilkTouchCondition(); }
// public Object createWithShearsOrSilkTouchCondition() { return wrapperContained.createWithShearsOrSilkTouchCondition(); }
// public Object createWithoutShearsOrSilkTouchCondition() { return wrapperContained.createWithoutShearsOrSilkTouchCondition(); }

}