package yarnwrap.recipe;
public class CraftingRecipe { public net.minecraft.recipe.CraftingRecipe wrapperContained; public CraftingRecipe(net.minecraft.recipe.CraftingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.recipe.book.CraftingRecipeCategory getCategory() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.getCategory()); }

}