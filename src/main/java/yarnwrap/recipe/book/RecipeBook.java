package yarnwrap.recipe.book;
public class RecipeBook { public net.minecraft.recipe.book.RecipeBook wrapperContained; public RecipeBook(net.minecraft.recipe.book.RecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set toBeDisplayed() { return wrapperContained.toBeDisplayed; }
// public void toBeDisplayed(java.util.Set value) { wrapperContained.toBeDisplayed = value; }
// public static java.util.Set toBeDisplayed() { return net.minecraft.recipe.book.RecipeBook.toBeDisplayed; }
// public static void toBeDisplayed(java.util.Set value, ) { net.minecraft.recipe.book.RecipeBook.toBeDisplayed = value; }

// public java.util.Set recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.Set value) { wrapperContained.recipes = value; }
// public static java.util.Set recipes() { return net.minecraft.recipe.book.RecipeBook.recipes; }
// public static void recipes(java.util.Set value, ) { net.minecraft.recipe.book.RecipeBook.recipes = value; }

// public yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.options); }
// public void options(yarnwrap.recipe.book.RecipeBookOptions value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.recipe.book.RecipeBook.options); }
// public static void options(yarnwrap.recipe.book.RecipeBookOptions value, ) { net.minecraft.recipe.book.RecipeBook.options = value.wrapperContained; }

public void copyFrom(yarnwrap.recipe.book.RecipeBook book) { wrapperContained.copyFrom(book.wrapperContained); }
// public static void copyFrom(yarnwrap.recipe.book.RecipeBook book, ) { net.minecraft.recipe.book.RecipeBook.copyFrom(book.wrapperContained); }
public void add(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.add(recipe.wrapperContained); }
// public static void add(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.recipe.book.RecipeBook.add(recipe.wrapperContained); }
// public void display(yarnwrap.util.Identifier id) { wrapperContained.display(id.wrapperContained); }
// public static void display(yarnwrap.util.Identifier id, ) { net.minecraft.recipe.book.RecipeBook.display(id.wrapperContained); }
public boolean contains(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.contains(recipe.wrapperContained); }
// public static boolean contains(yarnwrap.recipe.RecipeEntry recipe, ) { return net.minecraft.recipe.book.RecipeBook.contains(recipe.wrapperContained); }
// public void remove(yarnwrap.util.Identifier id) { wrapperContained.remove(id.wrapperContained); }
// public static void remove(yarnwrap.util.Identifier id, ) { net.minecraft.recipe.book.RecipeBook.remove(id.wrapperContained); }
public boolean isFilteringCraftable(yarnwrap.screen.AbstractRecipeScreenHandler handler) { return wrapperContained.isFilteringCraftable(handler.wrapperContained); }
// public static boolean isFilteringCraftable(yarnwrap.screen.AbstractRecipeScreenHandler handler, ) { return net.minecraft.recipe.book.RecipeBook.isFilteringCraftable(handler.wrapperContained); }
// public void add(yarnwrap.util.Identifier id) { wrapperContained.add(id.wrapperContained); }
// public static void add(yarnwrap.util.Identifier id, ) { net.minecraft.recipe.book.RecipeBook.add(id.wrapperContained); }
public boolean shouldDisplay(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.shouldDisplay(recipe.wrapperContained); }
// public static boolean shouldDisplay(yarnwrap.recipe.RecipeEntry recipe, ) { return net.minecraft.recipe.book.RecipeBook.shouldDisplay(recipe.wrapperContained); }
public void setGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category,boolean open) { wrapperContained.setGuiOpen(category.wrapperContained,open); }
// public static void setGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category,boolean open, ) { net.minecraft.recipe.book.RecipeBook.setGuiOpen(category.wrapperContained,open); }
public void display(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.display(recipe.wrapperContained); }
// public static void display(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.recipe.book.RecipeBook.display(recipe.wrapperContained); }
public void onRecipeDisplayed(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.onRecipeDisplayed(recipe.wrapperContained); }
// public static void onRecipeDisplayed(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.recipe.book.RecipeBook.onRecipeDisplayed(recipe.wrapperContained); }
public boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.isGuiOpen(category.wrapperContained); }
// public static boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookCategory category, ) { return net.minecraft.recipe.book.RecipeBook.isGuiOpen(category.wrapperContained); }
public void remove(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.remove(recipe.wrapperContained); }
// public static void remove(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.recipe.book.RecipeBook.remove(recipe.wrapperContained); }
public boolean contains(yarnwrap.util.Identifier id) { return wrapperContained.contains(id.wrapperContained); }
// public static boolean contains(yarnwrap.util.Identifier id, ) { return net.minecraft.recipe.book.RecipeBook.contains(id.wrapperContained); }
public yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.getOptions()); }
// public static yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.recipe.book.RecipeBook.getOptions()); }
public void setOptions(yarnwrap.recipe.book.RecipeBookOptions options) { wrapperContained.setOptions(options.wrapperContained); }
// public static void setOptions(yarnwrap.recipe.book.RecipeBookOptions options, ) { net.minecraft.recipe.book.RecipeBook.setOptions(options.wrapperContained); }
public void setCategoryOptions(yarnwrap.recipe.book.RecipeBookCategory category,boolean guiOpen,boolean filteringCraftable) { wrapperContained.setCategoryOptions(category.wrapperContained,guiOpen,filteringCraftable); }
// public static void setCategoryOptions(yarnwrap.recipe.book.RecipeBookCategory category,boolean guiOpen,boolean filteringCraftable, ) { net.minecraft.recipe.book.RecipeBook.setCategoryOptions(category.wrapperContained,guiOpen,filteringCraftable); }
public boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category) { return wrapperContained.isFilteringCraftable(category.wrapperContained); }
// public static boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category, ) { return net.minecraft.recipe.book.RecipeBook.isFilteringCraftable(category.wrapperContained); }
public void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category,boolean filteringCraftable) { wrapperContained.setFilteringCraftable(category.wrapperContained,filteringCraftable); }
// public static void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookCategory category,boolean filteringCraftable, ) { net.minecraft.recipe.book.RecipeBook.setFilteringCraftable(category.wrapperContained,filteringCraftable); }

}