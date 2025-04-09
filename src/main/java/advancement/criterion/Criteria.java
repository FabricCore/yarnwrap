package yarnwrap.advancement.criterion;
public class Criteria { public net.minecraft.advancement.criterion.Criteria wrapperContained; public Criteria(net.minecraft.advancement.criterion.Criteria wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.advancement.criterion.EnterBlockCriterion ENTER_BLOCK() { return new yarnwrap.advancement.criterion.EnterBlockCriterion(wrapperContained.ENTER_BLOCK); }
public yarnwrap.advancement.criterion.EnchantedItemCriterion ENCHANTED_ITEM() { return new yarnwrap.advancement.criterion.EnchantedItemCriterion(wrapperContained.ENCHANTED_ITEM); }
public yarnwrap.advancement.criterion.SummonedEntityCriterion SUMMONED_ENTITY() { return new yarnwrap.advancement.criterion.SummonedEntityCriterion(wrapperContained.SUMMONED_ENTITY); }
public yarnwrap.advancement.criterion.ChangedDimensionCriterion CHANGED_DIMENSION() { return new yarnwrap.advancement.criterion.ChangedDimensionCriterion(wrapperContained.CHANGED_DIMENSION); }
public yarnwrap.advancement.criterion.ImpossibleCriterion IMPOSSIBLE() { return new yarnwrap.advancement.criterion.ImpossibleCriterion(wrapperContained.IMPOSSIBLE); }
public yarnwrap.advancement.criterion.ItemDurabilityChangedCriterion ITEM_DURABILITY_CHANGED() { return new yarnwrap.advancement.criterion.ItemDurabilityChangedCriterion(wrapperContained.ITEM_DURABILITY_CHANGED); }
public yarnwrap.advancement.criterion.UsedEnderEyeCriterion USED_ENDER_EYE() { return new yarnwrap.advancement.criterion.UsedEnderEyeCriterion(wrapperContained.USED_ENDER_EYE); }
public yarnwrap.advancement.criterion.TickCriterion TICK() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.TICK); }
public yarnwrap.advancement.criterion.OnKilledCriterion ENTITY_KILLED_PLAYER() { return new yarnwrap.advancement.criterion.OnKilledCriterion(wrapperContained.ENTITY_KILLED_PLAYER); }
public yarnwrap.advancement.criterion.ConstructBeaconCriterion CONSTRUCT_BEACON() { return new yarnwrap.advancement.criterion.ConstructBeaconCriterion(wrapperContained.CONSTRUCT_BEACON); }
public yarnwrap.advancement.criterion.BredAnimalsCriterion BRED_ANIMALS() { return new yarnwrap.advancement.criterion.BredAnimalsCriterion(wrapperContained.BRED_ANIMALS); }
public yarnwrap.advancement.criterion.ItemCriterion PLACED_BLOCK() { return new yarnwrap.advancement.criterion.ItemCriterion(wrapperContained.PLACED_BLOCK); }
public yarnwrap.advancement.criterion.OnKilledCriterion PLAYER_KILLED_ENTITY() { return new yarnwrap.advancement.criterion.OnKilledCriterion(wrapperContained.PLAYER_KILLED_ENTITY); }
public yarnwrap.advancement.criterion.EffectsChangedCriterion EFFECTS_CHANGED() { return new yarnwrap.advancement.criterion.EffectsChangedCriterion(wrapperContained.EFFECTS_CHANGED); }
public yarnwrap.advancement.criterion.TickCriterion LOCATION() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.LOCATION); }
public yarnwrap.advancement.criterion.InventoryChangedCriterion INVENTORY_CHANGED() { return new yarnwrap.advancement.criterion.InventoryChangedCriterion(wrapperContained.INVENTORY_CHANGED); }
public yarnwrap.advancement.criterion.ShotCrossbowCriterion SHOT_CROSSBOW() { return new yarnwrap.advancement.criterion.ShotCrossbowCriterion(wrapperContained.SHOT_CROSSBOW); }
public yarnwrap.advancement.criterion.KilledByCrossbowCriterion KILLED_BY_CROSSBOW() { return new yarnwrap.advancement.criterion.KilledByCrossbowCriterion(wrapperContained.KILLED_BY_CROSSBOW); }
public yarnwrap.advancement.criterion.ConsumeItemCriterion CONSUME_ITEM() { return new yarnwrap.advancement.criterion.ConsumeItemCriterion(wrapperContained.CONSUME_ITEM); }
public yarnwrap.advancement.criterion.PlayerHurtEntityCriterion PLAYER_HURT_ENTITY() { return new yarnwrap.advancement.criterion.PlayerHurtEntityCriterion(wrapperContained.PLAYER_HURT_ENTITY); }
public yarnwrap.advancement.criterion.LevitationCriterion LEVITATION() { return new yarnwrap.advancement.criterion.LevitationCriterion(wrapperContained.LEVITATION); }
public yarnwrap.advancement.criterion.TameAnimalCriterion TAME_ANIMAL() { return new yarnwrap.advancement.criterion.TameAnimalCriterion(wrapperContained.TAME_ANIMAL); }
public yarnwrap.advancement.criterion.ChanneledLightningCriterion CHANNELED_LIGHTNING() { return new yarnwrap.advancement.criterion.ChanneledLightningCriterion(wrapperContained.CHANNELED_LIGHTNING); }
public yarnwrap.advancement.criterion.FishingRodHookedCriterion FISHING_ROD_HOOKED() { return new yarnwrap.advancement.criterion.FishingRodHookedCriterion(wrapperContained.FISHING_ROD_HOOKED); }
public yarnwrap.advancement.criterion.UsedTotemCriterion USED_TOTEM() { return new yarnwrap.advancement.criterion.UsedTotemCriterion(wrapperContained.USED_TOTEM); }
public yarnwrap.advancement.criterion.VillagerTradeCriterion VILLAGER_TRADE() { return new yarnwrap.advancement.criterion.VillagerTradeCriterion(wrapperContained.VILLAGER_TRADE); }
public yarnwrap.advancement.criterion.RecipeUnlockedCriterion RECIPE_UNLOCKED() { return new yarnwrap.advancement.criterion.RecipeUnlockedCriterion(wrapperContained.RECIPE_UNLOCKED); }
public yarnwrap.advancement.criterion.FilledBucketCriterion FILLED_BUCKET() { return new yarnwrap.advancement.criterion.FilledBucketCriterion(wrapperContained.FILLED_BUCKET); }
public yarnwrap.advancement.criterion.EntityHurtPlayerCriterion ENTITY_HURT_PLAYER() { return new yarnwrap.advancement.criterion.EntityHurtPlayerCriterion(wrapperContained.ENTITY_HURT_PLAYER); }
public yarnwrap.advancement.criterion.CuredZombieVillagerCriterion CURED_ZOMBIE_VILLAGER() { return new yarnwrap.advancement.criterion.CuredZombieVillagerCriterion(wrapperContained.CURED_ZOMBIE_VILLAGER); }
public yarnwrap.advancement.criterion.TravelCriterion NETHER_TRAVEL() { return new yarnwrap.advancement.criterion.TravelCriterion(wrapperContained.NETHER_TRAVEL); }
public yarnwrap.advancement.criterion.TickCriterion SLEPT_IN_BED() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.SLEPT_IN_BED); }
public yarnwrap.advancement.criterion.BrewedPotionCriterion BREWED_POTION() { return new yarnwrap.advancement.criterion.BrewedPotionCriterion(wrapperContained.BREWED_POTION); }
public yarnwrap.advancement.criterion.TickCriterion HERO_OF_THE_VILLAGE() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.HERO_OF_THE_VILLAGE); }
public yarnwrap.advancement.criterion.TickCriterion VOLUNTARY_EXILE() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.VOLUNTARY_EXILE); }
public yarnwrap.advancement.criterion.SlideDownBlockCriterion SLIDE_DOWN_BLOCK() { return new yarnwrap.advancement.criterion.SlideDownBlockCriterion(wrapperContained.SLIDE_DOWN_BLOCK); }
public yarnwrap.advancement.criterion.BeeNestDestroyedCriterion BEE_NEST_DESTROYED() { return new yarnwrap.advancement.criterion.BeeNestDestroyedCriterion(wrapperContained.BEE_NEST_DESTROYED); }
public yarnwrap.advancement.criterion.TargetHitCriterion TARGET_HIT() { return new yarnwrap.advancement.criterion.TargetHitCriterion(wrapperContained.TARGET_HIT); }
public yarnwrap.advancement.criterion.ItemCriterion ITEM_USED_ON_BLOCK() { return new yarnwrap.advancement.criterion.ItemCriterion(wrapperContained.ITEM_USED_ON_BLOCK); }
public yarnwrap.advancement.criterion.PlayerGeneratesContainerLootCriterion PLAYER_GENERATES_CONTAINER_LOOT() { return new yarnwrap.advancement.criterion.PlayerGeneratesContainerLootCriterion(wrapperContained.PLAYER_GENERATES_CONTAINER_LOOT); }
public yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion THROWN_ITEM_PICKED_UP_BY_ENTITY() { return new yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion(wrapperContained.THROWN_ITEM_PICKED_UP_BY_ENTITY); }
public yarnwrap.advancement.criterion.PlayerInteractedWithEntityCriterion PLAYER_INTERACTED_WITH_ENTITY() { return new yarnwrap.advancement.criterion.PlayerInteractedWithEntityCriterion(wrapperContained.PLAYER_INTERACTED_WITH_ENTITY); }
public yarnwrap.advancement.criterion.StartedRidingCriterion STARTED_RIDING() { return new yarnwrap.advancement.criterion.StartedRidingCriterion(wrapperContained.STARTED_RIDING); }
public yarnwrap.advancement.criterion.LightningStrikeCriterion LIGHTNING_STRIKE() { return new yarnwrap.advancement.criterion.LightningStrikeCriterion(wrapperContained.LIGHTNING_STRIKE); }
public yarnwrap.advancement.criterion.UsingItemCriterion USING_ITEM() { return new yarnwrap.advancement.criterion.UsingItemCriterion(wrapperContained.USING_ITEM); }
public yarnwrap.advancement.criterion.TravelCriterion FALL_FROM_HEIGHT() { return new yarnwrap.advancement.criterion.TravelCriterion(wrapperContained.FALL_FROM_HEIGHT); }
public yarnwrap.advancement.criterion.TravelCriterion RIDE_ENTITY_IN_LAVA() { return new yarnwrap.advancement.criterion.TravelCriterion(wrapperContained.RIDE_ENTITY_IN_LAVA); }
public yarnwrap.advancement.criterion.OnKilledCriterion KILL_MOB_NEAR_SCULK_CATALYST() { return new yarnwrap.advancement.criterion.OnKilledCriterion(wrapperContained.KILL_MOB_NEAR_SCULK_CATALYST); }
public yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion THROWN_ITEM_PICKED_UP_BY_PLAYER() { return new yarnwrap.advancement.criterion.ThrownItemPickedUpByEntityCriterion(wrapperContained.THROWN_ITEM_PICKED_UP_BY_PLAYER); }
public yarnwrap.advancement.criterion.ItemCriterion ALLAY_DROP_ITEM_ON_BLOCK() { return new yarnwrap.advancement.criterion.ItemCriterion(wrapperContained.ALLAY_DROP_ITEM_ON_BLOCK); }
public yarnwrap.advancement.criterion.TickCriterion AVOID_VIBRATION() { return new yarnwrap.advancement.criterion.TickCriterion(wrapperContained.AVOID_VIBRATION); }
public yarnwrap.advancement.criterion.RecipeCraftedCriterion RECIPE_CRAFTED() { return new yarnwrap.advancement.criterion.RecipeCraftedCriterion(wrapperContained.RECIPE_CRAFTED); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.advancement.criterion.DefaultBlockUseCriterion DEFAULT_BLOCK_USE() { return new yarnwrap.advancement.criterion.DefaultBlockUseCriterion(wrapperContained.DEFAULT_BLOCK_USE); }
public yarnwrap.advancement.criterion.AnyBlockUseCriterion ANY_BLOCK_USE() { return new yarnwrap.advancement.criterion.AnyBlockUseCriterion(wrapperContained.ANY_BLOCK_USE); }
public yarnwrap.advancement.criterion.RecipeCraftedCriterion CRAFTER_RECIPE_CRAFTED() { return new yarnwrap.advancement.criterion.RecipeCraftedCriterion(wrapperContained.CRAFTER_RECIPE_CRAFTED); }
public yarnwrap.advancement.criterion.FallAfterExplosionCriterion FALL_AFTER_EXPLOSION() { return new yarnwrap.advancement.criterion.FallAfterExplosionCriterion(wrapperContained.FALL_AFTER_EXPLOSION); }
public yarnwrap.advancement.criterion.Criterion getDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.advancement.criterion.Criterion(wrapperContained.getDefault(registry.wrapperContained)); }
// public yarnwrap.advancement.criterion.Criterion register(java.lang.String id,yarnwrap.advancement.criterion.Criterion criterion) { return new yarnwrap.advancement.criterion.Criterion(wrapperContained.register(id,criterion.wrapperContained)); }

}