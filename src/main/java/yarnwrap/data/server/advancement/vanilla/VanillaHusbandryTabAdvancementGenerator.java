package yarnwrap.data.server.advancement.vanilla;
public class VanillaHusbandryTabAdvancementGenerator { public net.minecraft.data.server.advancement.vanilla.VanillaHusbandryTabAdvancementGenerator wrapperContained; public VanillaHusbandryTabAdvancementGenerator(net.minecraft.data.server.advancement.vanilla.VanillaHusbandryTabAdvancementGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.item.Item[] FISH_ITEMS() { return wrapperContained.FISH_ITEMS; }
// public void FISH_ITEMS(net.minecraft.item.Item[] value) { wrapperContained.FISH_ITEMS = value; }
public java.util.List BREEDABLE_ANIMALS() { return wrapperContained.BREEDABLE_ANIMALS; }
// public void BREEDABLE_ANIMALS(java.util.List value) { wrapperContained.BREEDABLE_ANIMALS = value; }
// public net.minecraft.item.Item[] FISH_BUCKET_ITEMS() { return wrapperContained.FISH_BUCKET_ITEMS; }
// public void FISH_BUCKET_ITEMS(net.minecraft.item.Item[] value) { wrapperContained.FISH_BUCKET_ITEMS = value; }
// public net.minecraft.item.Item[] FOOD_ITEMS() { return wrapperContained.FOOD_ITEMS; }
// public void FOOD_ITEMS(net.minecraft.item.Item[] value) { wrapperContained.FOOD_ITEMS = value; }
public net.minecraft.item.Item[] AXE_ITEMS() { return wrapperContained.AXE_ITEMS; }
// public void AXE_ITEMS(net.minecraft.item.Item[] value) { wrapperContained.AXE_ITEMS = value; }
public java.util.List EGG_LAYING_ANIMALS() { return wrapperContained.EGG_LAYING_ANIMALS; }
// public void EGG_LAYING_ANIMALS(java.util.List value) { wrapperContained.EGG_LAYING_ANIMALS = value; }
// public Object requireListedFishCaught(Object builder) { return wrapperContained.requireListedFishCaught(builder); }
// public Object requireListedFishBucketsFilled(Object builder) { return wrapperContained.requireListedFishBucketsFilled(builder); }
// public Object requireFoodItemsEaten(Object builder) { return wrapperContained.requireFoodItemsEaten(builder); }
// public Object requireListedAnimalsBred(Object advancementBuilder,java.util.stream.Stream breedableAnimals,java.util.stream.Stream eggLayingAnimals) { return wrapperContained.requireListedAnimalsBred(advancementBuilder,breedableAnimals,eggLayingAnimals); }
// public Object requireAllCatsTamed(Object builder) { return wrapperContained.requireAllCatsTamed(builder); }
// public Object requireAllFrogsOnLeads(Object builder) { return wrapperContained.requireAllFrogsOnLeads(builder); }
public yarnwrap.advancement.AdvancementEntry createBreedAllAnimalsAdvancement(yarnwrap.advancement.AdvancementEntry parent,java.util.function.Consumer exporter,java.util.stream.Stream breedableAnimals,java.util.stream.Stream eggLayingAnimals) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.createBreedAllAnimalsAdvancement(parent.wrapperContained,exporter,breedableAnimals,eggLayingAnimals)); }
// public Object requireAllWolvesTamed(Object builder,Object registryLookup) { return wrapperContained.requireAllWolvesTamed(builder,registryLookup); }

}