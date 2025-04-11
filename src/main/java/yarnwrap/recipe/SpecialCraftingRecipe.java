package yarnwrap.recipe;
public class SpecialCraftingRecipe { public net.minecraft.recipe.SpecialCraftingRecipe wrapperContained; public SpecialCraftingRecipe(net.minecraft.recipe.SpecialCraftingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.CraftingRecipeCategory value) { wrapperContained.category = value.wrapperContained; }

}