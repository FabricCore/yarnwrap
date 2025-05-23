package yarnwrap.recipe;
public class CraftingRecipe { public net.minecraft.recipe.CraftingRecipe wrapperContained; public CraftingRecipe(net.minecraft.recipe.CraftingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.collection.DefaultedList getRecipeRemainders(yarnwrap.recipe.input.CraftingRecipeInput input) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getRecipeRemainders(input.wrapperContained)); }
// public static yarnwrap.util.collection.DefaultedList getRecipeRemainders(yarnwrap.recipe.input.CraftingRecipeInput input, ) { return new yarnwrap.util.collection.DefaultedList(net.minecraft.recipe.CraftingRecipe.getRecipeRemainders(input.wrapperContained)); }
public yarnwrap.recipe.book.CraftingRecipeCategory getCategory() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.getCategory()); }
// public static yarnwrap.recipe.book.CraftingRecipeCategory getCategory() { return new yarnwrap.recipe.book.CraftingRecipeCategory(net.minecraft.recipe.CraftingRecipe.getCategory()); }
// public yarnwrap.util.collection.DefaultedList collectRecipeRemainders(yarnwrap.recipe.input.CraftingRecipeInput input) { return new yarnwrap.util.collection.DefaultedList(wrapperContained.collectRecipeRemainders(input.wrapperContained)); }
// public static yarnwrap.util.collection.DefaultedList collectRecipeRemainders(yarnwrap.recipe.input.CraftingRecipeInput input, ) { return new yarnwrap.util.collection.DefaultedList(net.minecraft.recipe.CraftingRecipe.collectRecipeRemainders(input.wrapperContained)); }

}