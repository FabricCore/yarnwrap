package yarnwrap.recipe.book;
public class RecipeBookCategories { public net.minecraft.recipe.book.RecipeBookCategories wrapperContained; public RecipeBookCategories(net.minecraft.recipe.book.RecipeBookCategories wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.book.RecipeBookCategory register(java.lang.String id) { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.register(id)); }
// public static yarnwrap.recipe.book.RecipeBookCategory register(java.lang.String id, ) { return new yarnwrap.recipe.book.RecipeBookCategory(net.minecraft.recipe.book.RecipeBookCategories.register(id)); }
// public yarnwrap.recipe.book.RecipeBookCategory registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public static yarnwrap.recipe.book.RecipeBookCategory registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return new yarnwrap.recipe.book.RecipeBookCategory(net.minecraft.recipe.book.RecipeBookCategories.registerAndGetDefault(registry.wrapperContained)); }

}