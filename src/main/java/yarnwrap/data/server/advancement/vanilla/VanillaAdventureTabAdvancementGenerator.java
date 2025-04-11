package yarnwrap.data.server.advancement.vanilla;
public class VanillaAdventureTabAdvancementGenerator { public net.minecraft.data.server.advancement.vanilla.VanillaAdventureTabAdvancementGenerator wrapperContained; public VanillaAdventureTabAdvancementGenerator(net.minecraft.data.server.advancement.vanilla.VanillaAdventureTabAdvancementGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List MONSTERS() { return wrapperContained.MONSTERS; }
// public void MONSTERS(java.util.List value) { wrapperContained.MONSTERS = value; }
// public int OVERWORLD_HEIGHT() { return wrapperContained.OVERWORLD_HEIGHT; }
// public void OVERWORLD_HEIGHT(int value) { wrapperContained.OVERWORLD_HEIGHT = value; }
// public int OVERWORLD_MAX_Y() { return wrapperContained.OVERWORLD_MAX_Y; }
// public void OVERWORLD_MAX_Y(int value) { wrapperContained.OVERWORLD_MAX_Y = value; }
// public int OVERWORLD_MIN_Y() { return wrapperContained.OVERWORLD_MIN_Y; }
// public void OVERWORLD_MIN_Y(int value) { wrapperContained.OVERWORLD_MIN_Y = value; }
// public int OVERWORLD_BEDROCK_LAYER_HEIGHT() { return wrapperContained.OVERWORLD_BEDROCK_LAYER_HEIGHT; }
// public void OVERWORLD_BEDROCK_LAYER_HEIGHT(int value) { wrapperContained.OVERWORLD_BEDROCK_LAYER_HEIGHT = value; }
// public Object requireListedMobsKilled(Object builder,java.util.List entityTypes) { return wrapperContained.requireListedMobsKilled(builder,entityTypes); }
// public Object requireListedBiomesVisited(Object builder,Object registryLookup,java.util.List biomes) { return wrapperContained.requireListedBiomesVisited(builder,registryLookup,biomes); }
// public yarnwrap.advancement.AdvancementCriterion createLookingAtEntityUsing(yarnwrap.entity.EntityType entity,yarnwrap.item.Item item) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.createLookingAtEntityUsing(entity.wrapperContained,item.wrapperContained)); }
// public yarnwrap.advancement.AdvancementCriterion createLightningStrike(Object range,java.util.Optional entity) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.createLightningStrike(range,entity)); }
// public void buildAdventuringTime(Object registryLookup,java.util.function.Consumer exporter,yarnwrap.advancement.AdvancementEntry parent,Object biomeSourceListPreset) { wrapperContained.buildAdventuringTime(registryLookup,exporter,parent.wrapperContained,biomeSourceListPreset); }
// public Object requireAllExclusiveTrimmedArmor(Object builder) { return wrapperContained.requireAllExclusiveTrimmedArmor(builder); }
// public Object requireTrimmedArmor(Object builder) { return wrapperContained.requireTrimmedArmor(builder); }
// public Object requireSalvagedSherd(Object builder) { return wrapperContained.requireSalvagedSherd(builder); }
// public yarnwrap.advancement.AdvancementCriterion requirePlacedBlockReadByComparator(yarnwrap.block.Block block) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.requirePlacedBlockReadByComparator(block.wrapperContained)); }
// public yarnwrap.advancement.AdvancementCriterion requirePlacedComparatorReadingBlock(yarnwrap.block.Block block) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.requirePlacedComparatorReadingBlock(block.wrapperContained)); }
public yarnwrap.advancement.AdvancementEntry createKillMobAdvancements(yarnwrap.advancement.AdvancementEntry parent,java.util.function.Consumer exporter,java.util.List monsters) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.createKillMobAdvancements(parent.wrapperContained,exporter,monsters)); }

}