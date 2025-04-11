package yarnwrap.recipe;
public class BrewingRecipeRegistry { public net.minecraft.recipe.BrewingRecipeRegistry wrapperContained; public BrewingRecipeRegistry(net.minecraft.recipe.BrewingRecipeRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.recipe.BrewingRecipeRegistry EMPTY() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.recipe.BrewingRecipeRegistry value) { wrapperContained.EMPTY = value.wrapperContained; }
// public java.util.List potionTypes() { return wrapperContained.potionTypes; }
// public void potionTypes(java.util.List value) { wrapperContained.potionTypes = value; }
// public java.util.List potionRecipes() { return wrapperContained.potionRecipes; }
// public void potionRecipes(java.util.List value) { wrapperContained.potionRecipes = value; }
// public java.util.List itemRecipes() { return wrapperContained.itemRecipes; }
// public void itemRecipes(java.util.List value) { wrapperContained.itemRecipes = value; }
public boolean isBrewable(yarnwrap.registry.entry.RegistryEntry potion) { return wrapperContained.isBrewable(potion.wrapperContained); }
// public void registerDefaults(Object builder) { wrapperContained.registerDefaults(builder); }
// public boolean isPotionType(yarnwrap.item.ItemStack stack) { return wrapperContained.isPotionType(stack.wrapperContained); }
public boolean isPotionRecipeIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.isPotionRecipeIngredient(stack.wrapperContained); }
public boolean hasItemRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient) { return wrapperContained.hasItemRecipe(input.wrapperContained,ingredient.wrapperContained); }
public boolean hasRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient) { return wrapperContained.hasRecipe(input.wrapperContained,ingredient.wrapperContained); }
public boolean hasPotionRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient) { return wrapperContained.hasPotionRecipe(input.wrapperContained,ingredient.wrapperContained); }
public yarnwrap.recipe.BrewingRecipeRegistry create(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.create(enabledFeatures.wrapperContained)); }
public boolean isValidIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.isValidIngredient(stack.wrapperContained); }
public yarnwrap.item.ItemStack craft(yarnwrap.item.ItemStack ingredient,yarnwrap.item.ItemStack input) { return new yarnwrap.item.ItemStack(wrapperContained.craft(ingredient.wrapperContained,input.wrapperContained)); }
public boolean isItemRecipeIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.isItemRecipeIngredient(stack.wrapperContained); }

}