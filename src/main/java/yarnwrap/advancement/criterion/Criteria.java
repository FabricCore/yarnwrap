package yarnwrap.advancement.criterion;
public class Criteria { public net.minecraft.advancement.criterion.Criteria wrapperContained; public Criteria(net.minecraft.advancement.criterion.Criteria wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.advancement.criterion.EnterBlockCriterion ENTER_BLOCK() { return new yarnwrap.advancement.criterion.EnterBlockCriterion(wrapperContained.ENTER_BLOCK); }
// public void ENTER_BLOCK(yarnwrap.advancement.criterion.EnterBlockCriterion value) { wrapperContained.ENTER_BLOCK = value.wrapperContained; }
public yarnwrap.advancement.criterion.EnchantedItemCriterion ENCHANTED_ITEM() { return new yarnwrap.advancement.criterion.EnchantedItemCriterion(wrapperContained.ENCHANTED_ITEM); }
// public void ENCHANTED_ITEM(yarnwrap.advancement.criterion.EnchantedItemCriterion value) { wrapperContained.ENCHANTED_ITEM = value.wrapperContained; }
public yarnwrap.advancement.criterion.SummonedEntityCriterion SUMMONED_ENTITY() { return new yarnwrap.advancement.criterion.SummonedEntityCriterion(wrapperContained.SUMMONED_ENTITY); }
// public void SUMMONED_ENTITY(yarnwrap.advancement.criterion.SummonedEntityCriterion value) { wrapperContained.SUMMONED_ENTITY = value.wrapperContained; }
public yarnwrap.advancement.criterion.ChangedDimensionCriterion CHANGED_DIMENSION() { return new yarnwrap.advancement.criterion.ChangedDimensionCriterion(wrapperContained.CHANGED_DIMENSION); }
// public void CHANGED_DIMENSION(yarnwrap.advancement.criterion.ChangedDimensionCriterion value) { wrapperContained.CHANGED_DIMENSION = value.wrapperContained; }
public yarnwrap.advancement.criterion.ImpossibleCriterion IMPOSSIBLE() { return new yarnwrap.advancement.criterion.ImpossibleCriterion(wrapperContained.IMPOSSIBLE); }
// public void IMPOSSIBLE(yarnwrap.advancement.criterion.ImpossibleCriterion value) { wrapperContained.IMPOSSIBLE = value.wrapperContained; }
public yarnwrap.advancement.criterion.ItemDurabilityChangedCriterion ITEM_DURABILITY_CHANGED() { return new yarnwrap.advancement.criterion.ItemDurabilityChangedCriterion(wrapperContained.ITEM_DURABILITY_CHANGED); }
// public void ITEM_DURABILITY_CHANGED(yarnwrap.advancement.criterion.ItemDurabilityChangedCriterion value) { wrapperContained.ITEM_DURABILITY_CHANGED = value.wrapperContained; }
public yarnwrap.advancement.criterion.UsedEnderEyeCriterion USED_ENDER_EYE() { return new yarnwrap.advancement.criterion.UsedEnderEyeCriterion(wrapperContained.USED_ENDER_EYE); }
// public void USED_ENDER_EYE(yarnwrap.advancement.criterion.UsedEnderEyeCriterion value) { wrapperContained.USED_ENDER_EYE = value.wrapperContained; }
public yarnwrap.advancement.criterion.TickCriterion TICK() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.TICK); }
// public void TICK(yarnwrap.advancement.criterion.TickCriterion value) { wrapperContained.TICK = value.wrapperContained; }
public yarnwrap.advancement.criterion.OnKilledCriterion ENTITY_KILLED_PLAYER() { return new yarnwrap.advancement.criterion.OnKilledCriterion(wrapperContained.ENTITY_KILLED_PLAYER); }
// public void ENTITY_KILLED_PLAYER(yarnwrap.advancement.criterion.OnKilledCriterion value) { wrapperContained.ENTITY_KILLED_PLAYER = value.wrapperContained; }
public yarnwrap.advancement.criterion.ConstructBeaconCriterion CONSTRUCT_BEACON() { return new yarnwrap.advancement.criterion.ConstructBeaconCriterion(wrapperContained.CONSTRUCT_BEACON); }
// public void CONSTRUCT_BEACON(yarnwrap.advancement.criterion.ConstructBeaconCriterion value) { wrapperContained.CONSTRUCT_BEACON = value.wrapperContained; }
public yarnwrap.advancement.criterion.BredAnimalsCriterion BRED_ANIMALS() { return new yarnwrap.advancement.criterion.BredAnimalsCriterion(wrapperContained.BRED_ANIMALS); }
// public void BRED_ANIMALS(yarnwrap.advancement.criterion.BredAnimalsCriterion value) { wrapperContained.BRED_ANIMALS = value.wrapperContained; }
public yarnwrap.advancement.criterion.ItemCriterion PLACED_BLOCK() { return new yarnwrap.advancement.criterion.ItemCriterion(wrapperContained.PLACED_BLOCK); }
// public void PLACED_BLOCK(yarnwrap.advancement.criterion.ItemCriterion value) { wrapperContained.PLACED_BLOCK = value.wrapperContained; }
public yarnwrap.advancement.criterion.OnKilledCriterion PLAYER_KILLED_ENTITY() { return new yarnwrap.advancement.criterion.OnKilledCriterion(wrapperContained.PLAYER_KILLED_ENTITY); }
// public void PLAYER_KILLED_ENTITY(yarnwrap.advancement.criterion.OnKilledCriterion value) { wrapperContained.PLAYER_KILLED_ENTITY = value.wrapperContained; }
public yarnwrap.advancement.criterion.EffectsChangedCriterion EFFECTS_CHANGED() { return new yarnwrap.advancement.criterion.EffectsChangedCriterion(wrapperContained.EFFECTS_CHANGED); }
// public void EFFECTS_CHANGED(yarnwrap.advancement.criterion.EffectsChangedCriterion value) { wrapperContained.EFFECTS_CHANGED = value.wrapperContained; }
public yarnwrap.advancement.criterion.TickCriterion LOCATION() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.LOCATION); }
// public void LOCATION(yarnwrap.advancement.criterion.TickCriterion value) { wrapperContained.LOCATION = value.wrapperContained; }
public yarnwrap.advancement.criterion.InventoryChangedCriterion INVENTORY_CHANGED() { return new yarnwrap.advancement.criterion.InventoryChangedCriterion(wrapperContained.INVENTORY_CHANGED); }
// public void INVENTORY_CHANGED(yarnwrap.advancement.criterion.InventoryChangedCriterion value) { wrapperContained.INVENTORY_CHANGED = value.wrapperContained; }
public yarnwrap.advancement.criterion.ShotCrossbowCriterion SHOT_CROSSBOW() { return new yarnwrap.advancement.criterion.ShotCrossbowCriterion(wrapperContained.SHOT_CROSSBOW); }
// public void SHOT_CROSSBOW(yarnwrap.advancement.criterion.ShotCrossbowCriterion value) { wrapperContained.SHOT_CROSSBOW = value.wrapperContained; }
public yarnwrap.advancement.criterion.KilledByCrossbowCriterion KILLED_BY_CROSSBOW() { return new yarnwrap.advancement.criterion.KilledByCrossbowCriterion(wrapperContained.KILLED_BY_CROSSBOW); }
// public void KILLED_BY_CROSSBOW(yarnwrap.advancement.criterion.KilledByCrossbowCriterion value) { wrapperContained.KILLED_BY_CROSSBOW = value.wrapperContained; }
public yarnwrap.advancement.criterion.ConsumeItemCriterion CONSUME_ITEM() { return new yarnwrap.advancement.criterion.ConsumeItemCriterion(wrapperContained.CONSUME_ITEM); }
// public void CONSUME_ITEM(yarnwrap.advancement.criterion.ConsumeItemCriterion value) { wrapperContained.CONSUME_ITEM = value.wrapperContained; }
public yarnwrap.advancement.criterion.PlayerHurtEntityCriterion PLAYER_HURT_ENTITY() { return new yarnwrap.advancement.criterion.PlayerHurtEntityCriterion(wrapperContained.PLAYER_HURT_ENTITY); }
// public void PLAYER_HURT_ENTITY(yarnwrap.advancement.criterion.PlayerHurtEntityCriterion value) { wrapperContained.PLAYER_HURT_ENTITY = value.wrapperContained; }
public yarnwrap.advancement.criterion.LevitationCriterion LEVITATION() { return new yarnwrap.advancement.criterion.LevitationCriterion(wrapperContained.LEVITATION); }
// public void LEVITATION(yarnwrap.advancement.criterion.LevitationCriterion value) { wrapperContained.LEVITATION = value.wrapperContained; }
public yarnwrap.advancement.criterion.TameAnimalCriterion TAME_ANIMAL() { return new yarnwrap.advancement.criterion.TameAnimalCriterion(wrapperContained.TAME_ANIMAL); }
// public void TAME_ANIMAL(yarnwrap.advancement.criterion.TameAnimalCriterion value) { wrapperContained.TAME_ANIMAL = value.wrapperContained; }
public yarnwrap.advancement.criterion.ChanneledLightningCriterion CHANNELED_LIGHTNING() { return new yarnwrap.advancement.criterion.ChanneledLightningCriterion(wrapperContained.CHANNELED_LIGHTNING); }
// public void CHANNELED_LIGHTNING(yarnwrap.advancement.criterion.ChanneledLightningCriterion value) { wrapperContained.CHANNELED_LIGHTNING = value.wrapperContained; }
public yarnwrap.advancement.criterion.FishingRodHookedCriterion FISHING_ROD_HOOKED() { return new yarnwrap.advancement.criterion.FishingRodHookedCriterion(wrapperContained.FISHING_ROD_HOOKED); }
// public void FISHING_ROD_HOOKED(yarnwrap.advancement.criterion.FishingRodHookedCriterion value) { wrapperContained.FISHING_ROD_HOOKED = value.wrapperContained; }
public yarnwrap.advancement.criterion.UsedTotemCriterion USED_TOTEM() { return new yarnwrap.advancement.criterion.UsedTotemCriterion(wrapperContained.USED_TOTEM); }
// public void USED_TOTEM(yarnwrap.advancement.criterion.UsedTotemCriterion value) { wrapperContained.USED_TOTEM = value.wrapperContained; }
public yarnwrap.advancement.criterion.VillagerTradeCriterion VILLAGER_TRADE() { return new yarnwrap.advancement.criterion.VillagerTradeCriterion(wrapperContained.VILLAGER_TRADE); }
// public void VILLAGER_TRADE(yarnwrap.advancement.criterion.VillagerTradeCriterion value) { wrapperContained.VILLAGER_TRADE = value.wrapperContained; }
public yarnwrap.advancement.criterion.RecipeUnlockedCriterion RECIPE_UNLOCKED() { return new yarnwrap.advancement.criterion.RecipeUnlockedCriterion(wrapperContained.RECIPE_UNLOCKED); }
// public void RECIPE_UNLOCKED(yarnwrap.advancement.criterion.RecipeUnlockedCriterion value) { wrapperContained.RECIPE_UNLOCKED = value.wrapperContained; }
public yarnwrap.advancement.criterion.FilledBucketCriterion FILLED_BUCKET() { return new yarnwrap.advancement.criterion.FilledBucketCriterion(wrapperContained.FILLED_BUCKET); }
// public void FILLED_BUCKET(yarnwrap.advancement.criterion.FilledBucketCriterion value) { wrapperContained.FILLED_BUCKET = value.wrapperContained; }
public yarnwrap.advancement.criterion.EntityHurtPlayerCriterion ENTITY_HURT_PLAYER() { return new yarnwrap.advancement.criterion.EntityHurtPlayerCriterion(wrapperContained.ENTITY_HURT_PLAYER); }
// public void ENTITY_HURT_PLAYER(yarnwrap.advancement.criterion.EntityHurtPlayerCriterion value) { wrapperContained.ENTITY_HURT_PLAYER = value.wrapperContained; }
public yarnwrap.advancement.criterion.CuredZombieVillagerCriterion CURED_ZOMBIE_VILLAGER() { return new yarnwrap.advancement.criterion.CuredZombieVillagerCriterion(wrapperContained.CURED_ZOMBIE_VILLAGER); }
// public void CURED_ZOMBIE_VILLAGER(yarnwrap.advancement.criterion.CuredZombieVillagerCriterion value) { wrapperContained.CURED_ZOMBIE_VILLAGER = value.wrapperContained; }
public yarnwrap.advancement.criterion.TravelCriterion NETHER_TRAVEL() { return new yarnwrap.advancement.criterion.TravelCriterion(wrapperContained.NETHER_TRAVEL); }
// public void NETHER_TRAVEL(yarnwrap.advancement.criterion.TravelCriterion value) { wrapperContained.NETHER_TRAVEL = value.wrapperContained; }
public yarnwrap.advancement.criterion.TickCriterion SLEPT_IN_BED() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.SLEPT_IN_BED); }
// public void SLEPT_IN_BED(yarnwrap.advancement.criterion.TickCriterion value) { wrapperContained.SLEPT_IN_BED = value.wrapperContained; }
public yarnwrap.advancement.criterion.BrewedPotionCriterion BREWED_POTION() { return new yarnwrap.advancement.criterion.BrewedPotionCriterion(wrapperContained.BREWED_POTION); }
// public void BREWED_POTION(yarnwrap.advancement.criterion.BrewedPotionCriterion value) { wrapperContained.BREWED_POTION = value.wrapperContained; }
public yarnwrap.advancement.criterion.TickCriterion HERO_OF_THE_VILLAGE() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.HERO_OF_THE_VILLAGE); }
// public void HERO_OF_THE_VILLAGE(yarnwrap.advancement.criterion.TickCriterion value) { wrapperContained.HERO_OF_THE_VILLAGE = value.wrapperContained; }
public yarnwrap.advancement.criterion.TickCriterion VOLUNTARY_EXILE() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.VOLUNTARY_EXILE); }
// public void VOLUNTARY_EXILE(yarnwrap.advancement.criterion.TickCriterion value) { wrapperContained.VOLUNTARY_EXILE = value.wrapperContained; }
public yarnwrap.advancement.criterion.SlideDownBlockCriterion SLIDE_DOWN_BLOCK() { return new yarnwrap.advancement.criterion.SlideDownBlockCriterion(wrapperContained.SLIDE_DOWN_BLOCK); }
// public void SLIDE_DOWN_BLOCK(yarnwrap.advancement.criterion.SlideDownBlockCriterion value) { wrapperContained.SLIDE_DOWN_BLOCK = value.wrapperContained; }
public yarnwrap.advancement.criterion.BeeNestDestroyedCriterion BEE_NEST_DESTROYED() { return new yarnwrap.advancement.criterion.BeeNestDestroyedCriterion(wrapperContained.BEE_NEST_DESTROYED); }
// public void BEE_NEST_DESTROYED(yarnwrap.advancement.criterion.BeeNestDestroyedCriterion value) { wrapperContained.BEE_NEST_DESTROYED = value.wrapperContained; }
public yarnwrap.advancement.criterion.TargetHitCriterion TARGET_HIT() { return new yarnwrap.advancement.criterion.TargetHitCriterion(wrapperContained.TARGET_HIT); }
// public void TARGET_HIT(yarnwrap.advancement.criterion.TargetHitCriterion value) { wrapperContained.TARGET_HIT = value.wrapperContained; }
public yarnwrap.advancement.criterion.ItemCriterion ITEM_USED_ON_BLOCK() { return new yarnwrap.advancement.criterion.ItemCriterion(wrapperContained.ITEM_USED_ON_BLOCK); }
// public void ITEM_USED_ON_BLOCK(yarnwrap.advancement.criterion.ItemCriterion value) { wrapperContained.ITEM_USED_ON_BLOCK = value.wrapperContained; }
public yarnwrap.advancement.criterion.PlayerGeneratesContainerLootCriterion PLAYER_GENERATES_CONTAINER_LOOT() { return new yarnwrap.advancement.criterion.PlayerGeneratesContainerLootCriterion(wrapperContained.PLAYER_GENERATES_CONTAINER_LOOT); }
// public void PLAYER_GENERATES_CONTAINER_LOOT(yarnwrap.advancement.criterion.PlayerGeneratesContainerLootCriterion value) { wrapperContained.PLAYER_GENERATES_CONTAINER_LOOT = value.wrapperContained; }
public yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion THROWN_ITEM_PICKED_UP_BY_ENTITY() { return new yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion(wrapperContained.THROWN_ITEM_PICKED_UP_BY_ENTITY); }
// public void THROWN_ITEM_PICKED_UP_BY_ENTITY(yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion value) { wrapperContained.THROWN_ITEM_PICKED_UP_BY_ENTITY = value.wrapperContained; }
public yarnwrap.advancement.criterion.PlayerInteractedWithEntityCriterion PLAYER_INTERACTED_WITH_ENTITY() { return new yarnwrap.advancement.criterion.PlayerInteractedWithEntityCriterion(wrapperContained.PLAYER_INTERACTED_WITH_ENTITY); }
// public void PLAYER_INTERACTED_WITH_ENTITY(yarnwrap.advancement.criterion.PlayerInteractedWithEntityCriterion value) { wrapperContained.PLAYER_INTERACTED_WITH_ENTITY = value.wrapperContained; }
public yarnwrap.advancement.criterion.StartedRidingCriterion STARTED_RIDING() { return new yarnwrap.advancement.criterion.StartedRidingCriterion(wrapperContained.STARTED_RIDING); }
// public void STARTED_RIDING(yarnwrap.advancement.criterion.StartedRidingCriterion value) { wrapperContained.STARTED_RIDING = value.wrapperContained; }
public yarnwrap.advancement.criterion.LightningStrikeCriterion LIGHTNING_STRIKE() { return new yarnwrap.advancement.criterion.LightningStrikeCriterion(wrapperContained.LIGHTNING_STRIKE); }
// public void LIGHTNING_STRIKE(yarnwrap.advancement.criterion.LightningStrikeCriterion value) { wrapperContained.LIGHTNING_STRIKE = value.wrapperContained; }
public yarnwrap.advancement.criterion.UsingItemCriterion USING_ITEM() { return new yarnwrap.advancement.criterion.UsingItemCriterion(wrapperContained.USING_ITEM); }
// public void USING_ITEM(yarnwrap.advancement.criterion.UsingItemCriterion value) { wrapperContained.USING_ITEM = value.wrapperContained; }
public yarnwrap.advancement.criterion.TravelCriterion FALL_FROM_HEIGHT() { return new yarnwrap.advancement.criterion.TravelCriterion(wrapperContained.FALL_FROM_HEIGHT); }
// public void FALL_FROM_HEIGHT(yarnwrap.advancement.criterion.TravelCriterion value) { wrapperContained.FALL_FROM_HEIGHT = value.wrapperContained; }
public yarnwrap.advancement.criterion.TravelCriterion RIDE_ENTITY_IN_LAVA() { return new yarnwrap.advancement.criterion.TravelCriterion(wrapperContained.RIDE_ENTITY_IN_LAVA); }
// public void RIDE_ENTITY_IN_LAVA(yarnwrap.advancement.criterion.TravelCriterion value) { wrapperContained.RIDE_ENTITY_IN_LAVA = value.wrapperContained; }
public yarnwrap.advancement.criterion.OnKilledCriterion KILL_MOB_NEAR_SCULK_CATALYST() { return new yarnwrap.advancement.criterion.OnKilledCriterion(wrapperContained.KILL_MOB_NEAR_SCULK_CATALYST); }
// public void KILL_MOB_NEAR_SCULK_CATALYST(yarnwrap.advancement.criterion.OnKilledCriterion value) { wrapperContained.KILL_MOB_NEAR_SCULK_CATALYST = value.wrapperContained; }
public yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion THROWN_ITEM_PICKED_UP_BY_PLAYER() { return new yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion(wrapperContained.THROWN_ITEM_PICKED_UP_BY_PLAYER); }
// public void THROWN_ITEM_PICKED_UP_BY_PLAYER(yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion value) { wrapperContained.THROWN_ITEM_PICKED_UP_BY_PLAYER = value.wrapperContained; }
public yarnwrap.advancement.criterion.ItemCriterion ALLAY_DROP_ITEM_ON_BLOCK() { return new yarnwrap.advancement.criterion.ItemCriterion(wrapperContained.ALLAY_DROP_ITEM_ON_BLOCK); }
// public void ALLAY_DROP_ITEM_ON_BLOCK(yarnwrap.advancement.criterion.ItemCriterion value) { wrapperContained.ALLAY_DROP_ITEM_ON_BLOCK = value.wrapperContained; }
public yarnwrap.advancement.criterion.TickCriterion AVOID_VIBRATION() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.AVOID_VIBRATION); }
// public void AVOID_VIBRATION(yarnwrap.advancement.criterion.TickCriterion value) { wrapperContained.AVOID_VIBRATION = value.wrapperContained; }
public yarnwrap.advancement.criterion.RecipeCraftedCriterion RECIPE_CRAFTED() { return new yarnwrap.advancement.criterion.RecipeCraftedCriterion(wrapperContained.RECIPE_CRAFTED); }
// public void RECIPE_CRAFTED(yarnwrap.advancement.criterion.RecipeCraftedCriterion value) { wrapperContained.RECIPE_CRAFTED = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.advancement.criterion.DefaultBlockUseCriterion DEFAULT_BLOCK_USE() { return new yarnwrap.advancement.criterion.DefaultBlockUseCriterion(wrapperContained.DEFAULT_BLOCK_USE); }
// public void DEFAULT_BLOCK_USE(yarnwrap.advancement.criterion.DefaultBlockUseCriterion value) { wrapperContained.DEFAULT_BLOCK_USE = value.wrapperContained; }
public yarnwrap.advancement.criterion.AnyBlockUseCriterion ANY_BLOCK_USE() { return new yarnwrap.advancement.criterion.AnyBlockUseCriterion(wrapperContained.ANY_BLOCK_USE); }
// public void ANY_BLOCK_USE(yarnwrap.advancement.criterion.AnyBlockUseCriterion value) { wrapperContained.ANY_BLOCK_USE = value.wrapperContained; }
public yarnwrap.advancement.criterion.RecipeCraftedCriterion CRAFTER_RECIPE_CRAFTED() { return new yarnwrap.advancement.criterion.RecipeCraftedCriterion(wrapperContained.CRAFTER_RECIPE_CRAFTED); }
// public void CRAFTER_RECIPE_CRAFTED(yarnwrap.advancement.criterion.RecipeCraftedCriterion value) { wrapperContained.CRAFTER_RECIPE_CRAFTED = value.wrapperContained; }
public yarnwrap.advancement.criterion.FallAfterExplosionCriterion FALL_AFTER_EXPLOSION() { return new yarnwrap.advancement.criterion.FallAfterExplosionCriterion(wrapperContained.FALL_AFTER_EXPLOSION); }
// public void FALL_AFTER_EXPLOSION(yarnwrap.advancement.criterion.FallAfterExplosionCriterion value) { wrapperContained.FALL_AFTER_EXPLOSION = value.wrapperContained; }
public yarnwrap.advancement.criterion.Criterion getDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.advancement.criterion.Criterion(wrapperContained.getDefault(registry.wrapperContained)); }
// public yarnwrap.advancement.criterion.Criterion register(java.lang.String id,yarnwrap.advancement.criterion.Criterion criterion) { return new yarnwrap.advancement.criterion.Criterion(wrapperContained.register(id,criterion.wrapperContained)); }

}