package yarnwrap.client.recipebook;
public class RecipeBookType { public net.minecraft.client.recipebook.RecipeBookType wrapperContained; public RecipeBookType(net.minecraft.client.recipebook.RecipeBookType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List categories() { return wrapperContained.categories; }
// public void categories(java.util.List value) { wrapperContained.categories = value; }
// public static java.util.List categories() { return net.minecraft.client.recipebook.RecipeBookType.categories; }
// public static void categories(java.util.List value, ) { net.minecraft.client.recipebook.RecipeBookType.categories = value; }

// public RecipeBookType(java.lang.String categories) { this.wrapperContained = new net.minecraft.client.recipebook.RecipeBookType(categories); }
public java.util.List getCategories() { return wrapperContained.getCategories(); }
// public static java.util.List getCategories() { return net.minecraft.client.recipebook.RecipeBookType.getCategories(); }

}