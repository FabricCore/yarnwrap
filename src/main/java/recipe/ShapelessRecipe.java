package yarnwrap.recipe;
public class ShapelessRecipe { public net.minecraft.recipe.ShapelessRecipe wrapperContained; public ShapelessRecipe(net.minecraft.recipe.ShapelessRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.CraftingRecipeCategory category() { return new yarnwrap.recipe.book.CraftingRecipeCategory(wrapperContained.category); }
// public yarnwrap.util.collection.DefaultedList ingredients() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.ingredients); }
// public java.lang.String group() { return wrapperContained.group; }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }

}