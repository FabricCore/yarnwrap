package yarnwrap.recipe.book;
public class RecipeBook { public net.minecraft.recipe.book.RecipeBook wrapperContained; public RecipeBook(net.minecraft.recipe.book.RecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.options); }
// public void options(yarnwrap.recipe.book.RecipeBookOptions value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeBookOptions options() { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.recipe.book.RecipeBook.options); }
// public static void options(yarnwrap.recipe.book.RecipeBookOptions value, ) { net.minecraft.recipe.book.RecipeBook.options = value.wrapperContained; }

public void setGuiOpen(yarnwrap.recipe.book.RecipeBookType category,boolean open) { wrapperContained.setGuiOpen(category.wrapperContained,open); }
// public static void setGuiOpen(yarnwrap.recipe.book.RecipeBookType category,boolean open, ) { net.minecraft.recipe.book.RecipeBook.setGuiOpen(category.wrapperContained,open); }
public boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookType category) { return wrapperContained.isGuiOpen(category.wrapperContained); }
// public static boolean isGuiOpen(yarnwrap.recipe.book.RecipeBookType category, ) { return net.minecraft.recipe.book.RecipeBook.isGuiOpen(category.wrapperContained); }
public yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(wrapperContained.getOptions()); }
// public static yarnwrap.recipe.book.RecipeBookOptions getOptions() { return new yarnwrap.recipe.book.RecipeBookOptions(net.minecraft.recipe.book.RecipeBook.getOptions()); }
public void setOptions(yarnwrap.recipe.book.RecipeBookOptions options) { wrapperContained.setOptions(options.wrapperContained); }
// public static void setOptions(yarnwrap.recipe.book.RecipeBookOptions options, ) { net.minecraft.recipe.book.RecipeBook.setOptions(options.wrapperContained); }
public void setCategoryOptions(yarnwrap.recipe.book.RecipeBookType category,boolean guiOpen,boolean filteringCraftable) { wrapperContained.setCategoryOptions(category.wrapperContained,guiOpen,filteringCraftable); }
// public static void setCategoryOptions(yarnwrap.recipe.book.RecipeBookType category,boolean guiOpen,boolean filteringCraftable, ) { net.minecraft.recipe.book.RecipeBook.setCategoryOptions(category.wrapperContained,guiOpen,filteringCraftable); }
public boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookType category) { return wrapperContained.isFilteringCraftable(category.wrapperContained); }
// public static boolean isFilteringCraftable(yarnwrap.recipe.book.RecipeBookType category, ) { return net.minecraft.recipe.book.RecipeBook.isFilteringCraftable(category.wrapperContained); }
public void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookType category,boolean filteringCraftable) { wrapperContained.setFilteringCraftable(category.wrapperContained,filteringCraftable); }
// public static void setFilteringCraftable(yarnwrap.recipe.book.RecipeBookType category,boolean filteringCraftable, ) { net.minecraft.recipe.book.RecipeBook.setFilteringCraftable(category.wrapperContained,filteringCraftable); }

}