package yarnwrap.recipe;
public class SmithingTransformRecipe { public net.minecraft.recipe.SmithingTransformRecipe wrapperContained; public SmithingTransformRecipe(net.minecraft.recipe.SmithingTransformRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }

}