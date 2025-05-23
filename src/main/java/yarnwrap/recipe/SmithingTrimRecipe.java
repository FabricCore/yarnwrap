package yarnwrap.recipe;
public class SmithingTrimRecipe { public net.minecraft.recipe.SmithingTrimRecipe wrapperContained; public SmithingTrimRecipe(net.minecraft.recipe.SmithingTrimRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public void template(yarnwrap.recipe.Ingredient value) { wrapperContained.template = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SmithingTrimRecipe.template); }
// public static void template(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.SmithingTrimRecipe.template = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public void base(yarnwrap.recipe.Ingredient value) { wrapperContained.base = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SmithingTrimRecipe.base); }
// public static void base(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.SmithingTrimRecipe.base = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public void addition(yarnwrap.recipe.Ingredient value) { wrapperContained.addition = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SmithingTrimRecipe.addition); }
// public static void addition(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.SmithingTrimRecipe.addition = value.wrapperContained; }

// public yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.ingredientPlacement); }
// public void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value) { wrapperContained.ingredientPlacement = value.wrapperContained; }
// public static yarnwrap.recipe.IngredientPlacement ingredientPlacement() { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.SmithingTrimRecipe.ingredientPlacement); }
// public static void ingredientPlacement(yarnwrap.recipe.IngredientPlacement value, ) { net.minecraft.recipe.SmithingTrimRecipe.ingredientPlacement = value.wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.pattern); }
// public void pattern(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.pattern = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry pattern() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.recipe.SmithingTrimRecipe.pattern); }
// public static void pattern(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.recipe.SmithingTrimRecipe.pattern = value.wrapperContained; }

public SmithingTrimRecipe(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.registry.entry.RegistryEntry pattern) { this.wrapperContained = new net.minecraft.recipe.SmithingTrimRecipe(template.wrapperContained,base.wrapperContained,addition.wrapperContained,pattern.wrapperContained); }
// public yarnwrap.item.ItemStack craft(Object registries,yarnwrap.item.ItemStack base,yarnwrap.item.ItemStack addition,yarnwrap.registry.entry.RegistryEntry pattern) { return new yarnwrap.item.ItemStack(wrapperContained.craft(registries,base.wrapperContained,addition.wrapperContained,pattern.wrapperContained)); }
// public static yarnwrap.item.ItemStack craft(Object registries,yarnwrap.item.ItemStack base,yarnwrap.item.ItemStack addition,yarnwrap.registry.entry.RegistryEntry pattern, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.SmithingTrimRecipe.craft(registries,base.wrapperContained,addition.wrapperContained,pattern.wrapperContained)); }

}