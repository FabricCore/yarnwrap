package yarnwrap.data.server.loottable;
public class BlockLootTableGenerator { public net.minecraft.data.server.loottable.BlockLootTableGenerator wrapperContained; public BlockLootTableGenerator(net.minecraft.data.server.loottable.BlockLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object WITH_SHEARS() { return wrapperContained.WITH_SHEARS; }
// // public void WITH_SHEARS(Object value) { wrapperContained.WITH_SHEARS = value; }
// public static Object WITH_SHEARS() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.WITH_SHEARS; }
// // public static void WITH_SHEARS(Object value, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.WITH_SHEARS = value; }

// public float[] SAPLING_DROP_CHANCE() { return wrapperContained.SAPLING_DROP_CHANCE; }
// public void SAPLING_DROP_CHANCE(float[] value) { wrapperContained.SAPLING_DROP_CHANCE = value; }
// public static float[] SAPLING_DROP_CHANCE() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.SAPLING_DROP_CHANCE; }
// public static void SAPLING_DROP_CHANCE(float[] value, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.SAPLING_DROP_CHANCE = value; }

// public java.util.Set explosionImmuneItems() { return wrapperContained.explosionImmuneItems; }
// public void explosionImmuneItems(java.util.Set value) { wrapperContained.explosionImmuneItems = value; }
// public static java.util.Set explosionImmuneItems() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.explosionImmuneItems; }
// public static void explosionImmuneItems(java.util.Set value, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.explosionImmuneItems = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.data.server.loottable.BlockLootTableGenerator.requiredFeatures); }
// public static void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.requiredFeatures = value.wrapperContained; }

// public java.util.Map lootTables() { return wrapperContained.lootTables; }
// public void lootTables(java.util.Map value) { wrapperContained.lootTables = value; }
// public static java.util.Map lootTables() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.lootTables; }
// public static void lootTables(java.util.Map value, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.lootTables = value; }

// public float[] LEAVES_STICK_DROP_CHANCE() { return wrapperContained.LEAVES_STICK_DROP_CHANCE; }
// public void LEAVES_STICK_DROP_CHANCE(float[] value) { wrapperContained.LEAVES_STICK_DROP_CHANCE = value; }
// public static float[] LEAVES_STICK_DROP_CHANCE() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.LEAVES_STICK_DROP_CHANCE; }
// public static void LEAVES_STICK_DROP_CHANCE(float[] value, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.LEAVES_STICK_DROP_CHANCE = value; }

// public Object registryLookup() { return wrapperContained.registryLookup; }
// // public void registryLookup(Object value) { wrapperContained.registryLookup = value; }
// // public static Object registryLookup() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.registryLookup; }
// // public static void registryLookup(Object value, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.registryLookup = value; }

// public BlockLootTableGenerator(java.util.Set explosionImmuneItems,yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures,java.util.Map lootTables,Object registryLookup) { this.wrapperContained = new net.minecraft.data.server.loottable.BlockLootTableGenerator(explosionImmuneItems,requiredFeatures.wrapperContained,lootTables,registryLookup); }
// public BlockLootTableGenerator(java.util.Set explosionImmuneItems,yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures,Object registryLookup) { this.wrapperContained = new net.minecraft.data.server.loottable.BlockLootTableGenerator(explosionImmuneItems,requiredFeatures.wrapperContained,registryLookup); }
public void generate() { wrapperContained.generate(); }
// public static void generate() { net.minecraft.data.server.loottable.BlockLootTableGenerator.generate(); }
// public Object dropsNothing() { return wrapperContained.dropsNothing(); }
public static Object dropsNothing() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.dropsNothing(); }
public Object drops(yarnwrap.item.ItemConvertible drop) { return wrapperContained.drops(drop.wrapperContained); }
// public static Object drops(yarnwrap.item.ItemConvertible drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.drops(drop.wrapperContained); }
public yarnwrap.loot.function.LootFunctionConsumingBuilder applyExplosionDecay(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.function.LootFunctionConsumingBuilder builder) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(wrapperContained.applyExplosionDecay(drop.wrapperContained,builder.wrapperContained)); }
// public static yarnwrap.loot.function.LootFunctionConsumingBuilder applyExplosionDecay(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.function.LootFunctionConsumingBuilder builder, ) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(net.minecraft.data.server.loottable.BlockLootTableGenerator.applyExplosionDecay(drop.wrapperContained,builder.wrapperContained)); }
public yarnwrap.loot.condition.LootConditionConsumingBuilder addSurvivesExplosionCondition(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.condition.LootConditionConsumingBuilder builder) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(wrapperContained.addSurvivesExplosionCondition(drop.wrapperContained,builder.wrapperContained)); }
// public static yarnwrap.loot.condition.LootConditionConsumingBuilder addSurvivesExplosionCondition(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.condition.LootConditionConsumingBuilder builder, ) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(net.minecraft.data.server.loottable.BlockLootTableGenerator.addSurvivesExplosionCondition(drop.wrapperContained,builder.wrapperContained)); }
public Object drops(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.provider.number.LootNumberProvider count) { return wrapperContained.drops(drop.wrapperContained,count.wrapperContained); }
// public static Object drops(yarnwrap.item.ItemConvertible drop,yarnwrap.loot.provider.number.LootNumberProvider count, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.drops(drop.wrapperContained,count.wrapperContained); }
public Object slabDrops(yarnwrap.block.Block drop) { return wrapperContained.slabDrops(drop.wrapperContained); }
// public static Object slabDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.slabDrops(drop.wrapperContained); }
public Object oreDrops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.Item withoutSilkTouch) { return wrapperContained.oreDrops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
// public static Object oreDrops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.Item withoutSilkTouch, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.oreDrops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
// public Object cropDrops(yarnwrap.block.Block crop,yarnwrap.item.Item product,yarnwrap.item.Item seeds,Object condition) { return wrapperContained.cropDrops(crop.wrapperContained,product.wrapperContained,seeds.wrapperContained,condition); }
// public static Object cropDrops(yarnwrap.block.Block crop,yarnwrap.item.Item product,yarnwrap.item.Item seeds,Object condition, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.cropDrops(crop.wrapperContained,product.wrapperContained,seeds.wrapperContained,condition); }
public Object drops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.ItemConvertible withoutSilkTouch) { return wrapperContained.drops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
// public static Object drops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.ItemConvertible withoutSilkTouch, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.drops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
public Object drops(yarnwrap.block.Block block,yarnwrap.item.ItemConvertible drop,yarnwrap.loot.provider.number.LootNumberProvider count) { return wrapperContained.drops(block.wrapperContained,drop.wrapperContained,count.wrapperContained); }
// public static Object drops(yarnwrap.block.Block block,yarnwrap.item.ItemConvertible drop,yarnwrap.loot.provider.number.LootNumberProvider count, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.drops(block.wrapperContained,drop.wrapperContained,count.wrapperContained); }
public Object tallPlantDrops(yarnwrap.block.Block tallPlant,yarnwrap.block.Block shortPlant) { return wrapperContained.tallPlantDrops(tallPlant.wrapperContained,shortPlant.wrapperContained); }
// public static Object tallPlantDrops(yarnwrap.block.Block tallPlant,yarnwrap.block.Block shortPlant, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.tallPlantDrops(tallPlant.wrapperContained,shortPlant.wrapperContained); }
public Object leavesDrops(yarnwrap.block.Block leaves,yarnwrap.block.Block sapling,float saplingChance) { return wrapperContained.leavesDrops(leaves.wrapperContained,sapling.wrapperContained,saplingChance); }
// public static Object leavesDrops(yarnwrap.block.Block leaves,yarnwrap.block.Block sapling,float saplingChance, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.leavesDrops(leaves.wrapperContained,sapling.wrapperContained,saplingChance); }
// public Object dropsWithProperty(yarnwrap.block.Block drop,yarnwrap.state.property.Property property,java.lang.Comparable value) { return wrapperContained.dropsWithProperty(drop.wrapperContained,property.wrapperContained,value); }
// public static Object dropsWithProperty(yarnwrap.block.Block drop,yarnwrap.state.property.Property property,java.lang.Comparable value, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.dropsWithProperty(drop.wrapperContained,property.wrapperContained,value); }
// public void addDrop(yarnwrap.block.Block block,Object lootTable) { wrapperContained.addDrop(block.wrapperContained,lootTable); }
// public static void addDrop(yarnwrap.block.Block block,Object lootTable, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.addDrop(block.wrapperContained,lootTable); }
// public Object dropsWithSilkTouch(yarnwrap.block.Block block,Object loot) { return wrapperContained.dropsWithSilkTouch(block.wrapperContained,loot); }
// public static Object dropsWithSilkTouch(yarnwrap.block.Block block,Object loot, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.dropsWithSilkTouch(block.wrapperContained,loot); }
// public Object multifaceGrowthDrops(yarnwrap.block.Block drop,Object condition) { return wrapperContained.multifaceGrowthDrops(drop.wrapperContained,condition); }
// public static Object multifaceGrowthDrops(yarnwrap.block.Block drop,Object condition, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.multifaceGrowthDrops(drop.wrapperContained,condition); }
// public Object drops(yarnwrap.block.Block drop,Object conditionBuilder,Object child) { return wrapperContained.drops(drop.wrapperContained,conditionBuilder,child); }
// public static Object drops(yarnwrap.block.Block drop,Object conditionBuilder,Object child, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.drops(drop.wrapperContained,conditionBuilder,child); }
// public Object method_45992(yarnwrap.block.Block direction) { return wrapperContained.method_45992(direction.wrapperContained); }
// public static Object method_45992(yarnwrap.block.Block direction, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.method_45992(direction.wrapperContained); }
// public Object method_45993(yarnwrap.block.Block candles) { return wrapperContained.method_45993(candles.wrapperContained); }
// public static Object method_45993(yarnwrap.block.Block candles, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.method_45993(candles.wrapperContained); }
public void addDrop(yarnwrap.block.Block block,java.util.function.Function lootTableFunction) { wrapperContained.addDrop(block.wrapperContained,lootTableFunction); }
// public static void addDrop(yarnwrap.block.Block block,java.util.function.Function lootTableFunction, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.addDrop(block.wrapperContained,lootTableFunction); }
// public Object dropsWithShears(yarnwrap.item.ItemConvertible drop) { return wrapperContained.dropsWithShears(drop.wrapperContained); }
// public static Object dropsWithShears(yarnwrap.item.ItemConvertible drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.dropsWithShears(drop.wrapperContained); }
public Object nameableContainerDrops(yarnwrap.block.Block drop) { return wrapperContained.nameableContainerDrops(drop.wrapperContained); }
// public static Object nameableContainerDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.nameableContainerDrops(drop.wrapperContained); }
public Object cropStemDrops(yarnwrap.block.Block stem,yarnwrap.item.Item drop) { return wrapperContained.cropStemDrops(stem.wrapperContained,drop.wrapperContained); }
// public static Object cropStemDrops(yarnwrap.block.Block stem,yarnwrap.item.Item drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.cropStemDrops(stem.wrapperContained,drop.wrapperContained); }
public Object mushroomBlockDrops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.ItemConvertible withoutSilkTouch) { return wrapperContained.mushroomBlockDrops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
// public static Object mushroomBlockDrops(yarnwrap.block.Block withSilkTouch,yarnwrap.item.ItemConvertible withoutSilkTouch, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.mushroomBlockDrops(withSilkTouch.wrapperContained,withoutSilkTouch.wrapperContained); }
public void addVinePlantDrop(yarnwrap.block.Block vine,yarnwrap.block.Block vinePlant) { wrapperContained.addVinePlantDrop(vine.wrapperContained,vinePlant.wrapperContained); }
// public static void addVinePlantDrop(yarnwrap.block.Block vine,yarnwrap.block.Block vinePlant, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.addVinePlantDrop(vine.wrapperContained,vinePlant.wrapperContained); }
public Object oakLeavesDrops(yarnwrap.block.Block leaves,yarnwrap.block.Block sapling,float saplingChance) { return wrapperContained.oakLeavesDrops(leaves.wrapperContained,sapling.wrapperContained,saplingChance); }
// public static Object oakLeavesDrops(yarnwrap.block.Block leaves,yarnwrap.block.Block sapling,float saplingChance, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.oakLeavesDrops(leaves.wrapperContained,sapling.wrapperContained,saplingChance); }
// public Object dropsWithShears(yarnwrap.block.Block block,Object loot) { return wrapperContained.dropsWithShears(block.wrapperContained,loot); }
// public static Object dropsWithShears(yarnwrap.block.Block block,Object loot, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.dropsWithShears(block.wrapperContained,loot); }
// public Object method_46002(yarnwrap.block.Block age) { return wrapperContained.method_46002(age.wrapperContained); }
// public static Object method_46002(yarnwrap.block.Block age, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.method_46002(age.wrapperContained); }
public Object dropsWithSilkTouch(yarnwrap.item.ItemConvertible drop) { return wrapperContained.dropsWithSilkTouch(drop.wrapperContained); }
// public static Object dropsWithSilkTouch(yarnwrap.item.ItemConvertible drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.dropsWithSilkTouch(drop.wrapperContained); }
public Object shulkerBoxDrops(yarnwrap.block.Block drop) { return wrapperContained.shulkerBoxDrops(drop.wrapperContained); }
// public static Object shulkerBoxDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.shulkerBoxDrops(drop.wrapperContained); }
public Object attachedCropStemDrops(yarnwrap.block.Block stem,yarnwrap.item.Item drop) { return wrapperContained.attachedCropStemDrops(stem.wrapperContained,drop.wrapperContained); }
// public static Object attachedCropStemDrops(yarnwrap.block.Block stem,yarnwrap.item.Item drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.attachedCropStemDrops(stem.wrapperContained,drop.wrapperContained); }
public void addDrop(yarnwrap.block.Block block,yarnwrap.item.ItemConvertible drop) { wrapperContained.addDrop(block.wrapperContained,drop.wrapperContained); }
// public static void addDrop(yarnwrap.block.Block block,yarnwrap.item.ItemConvertible drop, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.addDrop(block.wrapperContained,drop.wrapperContained); }
public void addDropWithSilkTouch(yarnwrap.block.Block block,yarnwrap.block.Block drop) { wrapperContained.addDropWithSilkTouch(block.wrapperContained,drop.wrapperContained); }
// public static void addDropWithSilkTouch(yarnwrap.block.Block block,yarnwrap.block.Block drop, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.addDropWithSilkTouch(block.wrapperContained,drop.wrapperContained); }
// public Object dropsWithSilkTouchOrShears(yarnwrap.block.Block block,Object loot) { return wrapperContained.dropsWithSilkTouchOrShears(block.wrapperContained,loot); }
// public static Object dropsWithSilkTouchOrShears(yarnwrap.block.Block block,Object loot, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.dropsWithSilkTouchOrShears(block.wrapperContained,loot); }
public Object pottedPlantDrops(yarnwrap.item.ItemConvertible drop) { return wrapperContained.pottedPlantDrops(drop.wrapperContained); }
// public static Object pottedPlantDrops(yarnwrap.item.ItemConvertible drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.pottedPlantDrops(drop.wrapperContained); }
public Object copperOreDrops(yarnwrap.block.Block drop) { return wrapperContained.copperOreDrops(drop.wrapperContained); }
// public static Object copperOreDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.copperOreDrops(drop.wrapperContained); }
public Object lapisOreDrops(yarnwrap.block.Block drop) { return wrapperContained.lapisOreDrops(drop.wrapperContained); }
// public static Object lapisOreDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.lapisOreDrops(drop.wrapperContained); }
public Object redstoneOreDrops(yarnwrap.block.Block drop) { return wrapperContained.redstoneOreDrops(drop.wrapperContained); }
// public static Object redstoneOreDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.redstoneOreDrops(drop.wrapperContained); }
public Object bannerDrops(yarnwrap.block.Block drop) { return wrapperContained.bannerDrops(drop.wrapperContained); }
// public static Object bannerDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.bannerDrops(drop.wrapperContained); }
public Object beeNestDrops(yarnwrap.block.Block drop) { return wrapperContained.beeNestDrops(drop.wrapperContained); }
// public static Object beeNestDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.beeNestDrops(drop.wrapperContained); }
public Object beehiveDrops(yarnwrap.block.Block drop) { return wrapperContained.beehiveDrops(drop.wrapperContained); }
// public static Object beehiveDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.beehiveDrops(drop.wrapperContained); }
public Object glowBerryDrops(yarnwrap.block.Block drop) { return wrapperContained.glowBerryDrops(drop.wrapperContained); }
// public static Object glowBerryDrops(yarnwrap.block.Block drop, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.glowBerryDrops(drop.wrapperContained); }
public Object shortPlantDrops(yarnwrap.block.Block withShears) { return wrapperContained.shortPlantDrops(withShears.wrapperContained); }
// public static Object shortPlantDrops(yarnwrap.block.Block withShears, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.shortPlantDrops(withShears.wrapperContained); }
public Object mangroveLeavesDrops(yarnwrap.block.Block leaves) { return wrapperContained.mangroveLeavesDrops(leaves.wrapperContained); }
// public static Object mangroveLeavesDrops(yarnwrap.block.Block leaves, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.mangroveLeavesDrops(leaves.wrapperContained); }
public Object seagrassDrops(yarnwrap.block.Block seagrass) { return wrapperContained.seagrassDrops(seagrass.wrapperContained); }
// public static Object seagrassDrops(yarnwrap.block.Block seagrass, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.seagrassDrops(seagrass.wrapperContained); }
public Object candleDrops(yarnwrap.block.Block candle) { return wrapperContained.candleDrops(candle.wrapperContained); }
// public static Object candleDrops(yarnwrap.block.Block candle, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.candleDrops(candle.wrapperContained); }
// public Object candleCakeDrops(yarnwrap.block.Block candleCake) { return wrapperContained.candleCakeDrops(candleCake.wrapperContained); }
// public static Object candleCakeDrops(yarnwrap.block.Block candleCake, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.candleCakeDrops(candleCake.wrapperContained); }
public Object doorDrops(yarnwrap.block.Block block) { return wrapperContained.doorDrops(block.wrapperContained); }
// public static Object doorDrops(yarnwrap.block.Block block, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.doorDrops(block.wrapperContained); }
public void addPottedPlantDrops(yarnwrap.block.Block block) { wrapperContained.addPottedPlantDrops(block.wrapperContained); }
// public static void addPottedPlantDrops(yarnwrap.block.Block block, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.addPottedPlantDrops(block.wrapperContained); }
public void addDropWithSilkTouch(yarnwrap.block.Block block) { wrapperContained.addDropWithSilkTouch(block.wrapperContained); }
// public static void addDropWithSilkTouch(yarnwrap.block.Block block, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.addDropWithSilkTouch(block.wrapperContained); }
public void addDrop(yarnwrap.block.Block block) { wrapperContained.addDrop(block.wrapperContained); }
// // public static void addDrop(yarnwrap.block.Block block, ) { net.minecraft.data.server.loottable.BlockLootTableGenerator.addDrop(block.wrapperContained); }
// public Object method_46026(yarnwrap.block.Block flowerPot) { return wrapperContained.method_46026(flowerPot.wrapperContained); }
// public static Object method_46026(yarnwrap.block.Block flowerPot, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.method_46026(flowerPot.wrapperContained); }
// public Object method_49357(yarnwrap.block.Block flowerAmount) { return wrapperContained.method_49357(flowerAmount.wrapperContained); }
// public static Object method_49357(yarnwrap.block.Block flowerAmount, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.method_49357(flowerAmount.wrapperContained); }
public Object flowerbedDrops(yarnwrap.block.Block flowerbed) { return wrapperContained.flowerbedDrops(flowerbed.wrapperContained); }
// public static Object flowerbedDrops(yarnwrap.block.Block flowerbed, ) { return net.minecraft.data.server.loottable.BlockLootTableGenerator.flowerbedDrops(flowerbed.wrapperContained); }
public Object createSilkTouchCondition() { return wrapperContained.createSilkTouchCondition(); }
// public static Object createSilkTouchCondition() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.createSilkTouchCondition(); }
public Object createWithoutSilkTouchCondition() { return wrapperContained.createWithoutSilkTouchCondition(); }
// public static Object createWithoutSilkTouchCondition() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.createWithoutSilkTouchCondition(); }
public Object createWithShearsOrSilkTouchCondition() { return wrapperContained.createWithShearsOrSilkTouchCondition(); }
// public static Object createWithShearsOrSilkTouchCondition() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.createWithShearsOrSilkTouchCondition(); }
public Object createWithoutShearsOrSilkTouchCondition() { return wrapperContained.createWithoutShearsOrSilkTouchCondition(); }
// public static Object createWithoutShearsOrSilkTouchCondition() { return net.minecraft.data.server.loottable.BlockLootTableGenerator.createWithoutShearsOrSilkTouchCondition(); }

}