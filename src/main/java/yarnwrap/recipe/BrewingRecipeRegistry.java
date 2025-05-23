package yarnwrap.recipe;
public class BrewingRecipeRegistry { public net.minecraft.recipe.BrewingRecipeRegistry wrapperContained; public BrewingRecipeRegistry(net.minecraft.recipe.BrewingRecipeRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.BrewingRecipeRegistry EMPTY() { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.recipe.BrewingRecipeRegistry value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.recipe.BrewingRecipeRegistry EMPTY() { return new yarnwrap.recipe.BrewingRecipeRegistry(net.minecraft.recipe.BrewingRecipeRegistry.EMPTY); }
// public static void EMPTY(yarnwrap.recipe.BrewingRecipeRegistry value, ) { net.minecraft.recipe.BrewingRecipeRegistry.EMPTY = value.wrapperContained; }

// public java.util.List potionTypes() { return wrapperContained.potionTypes; }
// public void potionTypes(java.util.List value) { wrapperContained.potionTypes = value; }
// public static java.util.List potionTypes() { return net.minecraft.recipe.BrewingRecipeRegistry.potionTypes; }
// public static void potionTypes(java.util.List value, ) { net.minecraft.recipe.BrewingRecipeRegistry.potionTypes = value; }

// public java.util.List potionRecipes() { return wrapperContained.potionRecipes; }
// public void potionRecipes(java.util.List value) { wrapperContained.potionRecipes = value; }
// public static java.util.List potionRecipes() { return net.minecraft.recipe.BrewingRecipeRegistry.potionRecipes; }
// public static void potionRecipes(java.util.List value, ) { net.minecraft.recipe.BrewingRecipeRegistry.potionRecipes = value; }

// public java.util.List itemRecipes() { return wrapperContained.itemRecipes; }
// public void itemRecipes(java.util.List value) { wrapperContained.itemRecipes = value; }
// public static java.util.List itemRecipes() { return net.minecraft.recipe.BrewingRecipeRegistry.itemRecipes; }
// public static void itemRecipes(java.util.List value, ) { net.minecraft.recipe.BrewingRecipeRegistry.itemRecipes = value; }

// public BrewingRecipeRegistry(java.util.List potionTypes,java.util.List potionRecipes,java.util.List itemRecipes) { this.wrapperContained = new net.minecraft.recipe.BrewingRecipeRegistry(potionTypes,potionRecipes,itemRecipes); }
public boolean isPotionRecipeIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.isPotionRecipeIngredient(stack.wrapperContained); }
// public static boolean isPotionRecipeIngredient(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.BrewingRecipeRegistry.isPotionRecipeIngredient(stack.wrapperContained); }
public boolean hasItemRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient) { return wrapperContained.hasItemRecipe(input.wrapperContained,ingredient.wrapperContained); }
// public static boolean hasItemRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient, ) { return net.minecraft.recipe.BrewingRecipeRegistry.hasItemRecipe(input.wrapperContained,ingredient.wrapperContained); }
public boolean hasRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient) { return wrapperContained.hasRecipe(input.wrapperContained,ingredient.wrapperContained); }
// public static boolean hasRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient, ) { return net.minecraft.recipe.BrewingRecipeRegistry.hasRecipe(input.wrapperContained,ingredient.wrapperContained); }
public boolean hasPotionRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient) { return wrapperContained.hasPotionRecipe(input.wrapperContained,ingredient.wrapperContained); }
// public static boolean hasPotionRecipe(yarnwrap.item.ItemStack input,yarnwrap.item.ItemStack ingredient, ) { return net.minecraft.recipe.BrewingRecipeRegistry.hasPotionRecipe(input.wrapperContained,ingredient.wrapperContained); }
// public yarnwrap.recipe.BrewingRecipeRegistry create(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures) { return new yarnwrap.recipe.BrewingRecipeRegistry(wrapperContained.create(enabledFeatures.wrapperContained)); }
// public static yarnwrap.recipe.BrewingRecipeRegistry create(yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures, ) { return new yarnwrap.recipe.BrewingRecipeRegistry(net.minecraft.recipe.BrewingRecipeRegistry.create(enabledFeatures.wrapperContained)); }
public boolean isValidIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.isValidIngredient(stack.wrapperContained); }
// public static boolean isValidIngredient(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.BrewingRecipeRegistry.isValidIngredient(stack.wrapperContained); }
public yarnwrap.item.ItemStack craft(yarnwrap.item.ItemStack ingredient,yarnwrap.item.ItemStack input) { return new yarnwrap.item.ItemStack(wrapperContained.craft(ingredient.wrapperContained,input.wrapperContained)); }
// public static yarnwrap.item.ItemStack craft(yarnwrap.item.ItemStack ingredient,yarnwrap.item.ItemStack input, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.BrewingRecipeRegistry.craft(ingredient.wrapperContained,input.wrapperContained)); }
public boolean isItemRecipeIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.isItemRecipeIngredient(stack.wrapperContained); }
// public static boolean isItemRecipeIngredient(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.BrewingRecipeRegistry.isItemRecipeIngredient(stack.wrapperContained); }
public boolean isBrewable(yarnwrap.registry.entry.RegistryEntry potion) { return wrapperContained.isBrewable(potion.wrapperContained); }
// public static boolean isBrewable(yarnwrap.registry.entry.RegistryEntry potion, ) { return net.minecraft.recipe.BrewingRecipeRegistry.isBrewable(potion.wrapperContained); }
// public void registerDefaults(Object builder) { wrapperContained.registerDefaults(builder); }
// public static void registerDefaults(Object builder, ) { net.minecraft.recipe.BrewingRecipeRegistry.registerDefaults(builder); }
// public boolean isPotionType(yarnwrap.item.ItemStack stack) { return wrapperContained.isPotionType(stack.wrapperContained); }
// public static boolean isPotionType(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.BrewingRecipeRegistry.isPotionType(stack.wrapperContained); }

}