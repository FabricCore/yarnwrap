package yarnwrap.recipe.book;
public class RecipeCategory { public net.minecraft.recipe.book.RecipeCategory wrapperContained; public RecipeCategory(net.minecraft.recipe.book.RecipeCategory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.recipe.book.RecipeCategory.name; }
// public static void name(java.lang.String value, ) { net.minecraft.recipe.book.RecipeCategory.name = value; }

// public RecipeCategory(java.lang.String name) { this.wrapperContained = new net.minecraft.recipe.book.RecipeCategory(name); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.recipe.book.RecipeCategory.getName(); }

}