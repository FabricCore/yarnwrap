package yarnwrap.recipe.book;
public class RecipeBook { public net.minecraft.recipe.book.RecipeBook wrapperContained; public RecipeBook(net.minecraft.recipe.book.RecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set toBeDisplayed() { return wrapperContained.toBeDisplayed; }
// public java.util.Set recipes() { return wrapperContained.recipes; }
// public yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.options); }
public void copyFrom(yarnwrap.recipe.book.RecipeBook book) { wrapperContained.copyFrom(book.wrapperContained); }
public void add(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.add(recipe.wrapperContained); }
// public void display(yarnwrap.util.Identifier id) { wrapperContained.display(id.wrapperContained); }
public boolean contains(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.contains(recipe.wrapperContained); }
// public void remove(yarnwrap.util.Identifier id) { wrapperContained.remove(id.wrapperContained); }
public boolean isFilteringCraftable(yarnwrap.screen.AbstractRecipeScreenHandler handler) { return wrapperContained.isFilteringCraftable(handler.wrapperContained); }
// public void add(yarnwrap.util.Identifier id) { wrapperContained.add(id.wrapperContained); }
public boolean shouldDisplay(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.shouldDisplay(recipe.wrapperContained); }
public void setGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category,boolean open) { wrapperContained.setGuiOpen(category.wrapperContained,open); }
public void display(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.display(recipe.wrapperContained); }
public void onRecipeDisplayed(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.onRecipeDisplayed(recipe.wrapperContained); }
public boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.isGuiOpen(category.wrapperContained); }
public void remove(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.remove(recipe.wrapperContained); }
public boolean contains(yarnwrap.util.Identifier id) { return wrapperContained.contains(id.wrapperContained); }
public yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.getOptions()); }
public void setOptions(yarnwrap.recipe.book.RecipeBookOptions options) { wrapperContained.setOptions(options.wrapperContained); }
public void setCategoryOptions(yarnwrap.recipe.book.RecipeBookCategory category,boolean guiOpen,boolean filteringCraftable) { wrapperContained.setCategoryOptions(category.wrapperContained,guiOpen,filteringCraftable); }
public boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.isFilteringCraftable(category.wrapperContained); }
public void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category,boolean filteringCraftable) { wrapperContained.setFilteringCraftable(category.wrapperContained,filteringCraftable); }

}