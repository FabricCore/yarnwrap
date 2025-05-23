package yarnwrap.data.recipe;
public class ShapedRecipeJsonBuilder { public net.minecraft.data.recipe.ShapedRecipeJsonBuilder wrapperContained; public ShapedRecipeJsonBuilder(net.minecraft.data.recipe.ShapedRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map inputs() { return wrapperContained.inputs; }
// public void inputs(java.util.Map value) { wrapperContained.inputs = value; }
// public static java.util.Map inputs() { return net.minecraft.data.recipe.ShapedRecipeJsonBuilder.inputs; }
// public static void inputs(java.util.Map value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.inputs = value; }

// public java.util.List pattern() { return wrapperContained.pattern; }
// public void pattern(java.util.List value) { wrapperContained.pattern = value; }
// public static java.util.List pattern() { return net.minecraft.data.recipe.ShapedRecipeJsonBuilder.pattern; }
// public static void pattern(java.util.List value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.pattern = value; }

// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public static int count() { return net.minecraft.data.recipe.ShapedRecipeJsonBuilder.count; }
// public static void count(int value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.count = value; }

// public yarnwrap.item.Item output() { return new yarnwrap.item.Item(wrapperContained.output); }
// public void output(yarnwrap.item.Item value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.item.Item output() { return new yarnwrap.item.Item(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.output); }
// public static void output(yarnwrap.item.Item value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.output = value.wrapperContained; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.data.recipe.ShapedRecipeJsonBuilder.group; }
// public static void group(java.lang.String value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.group = value; }

// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.category); }
// public static void category(yarnwrap.recipe.book.RecipeCategory value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.category = value.wrapperContained; }

// public boolean showNotification() { return wrapperContained.showNotification; }
// public void showNotification(boolean value) { wrapperContained.showNotification = value; }
// public static boolean showNotification() { return net.minecraft.data.recipe.ShapedRecipeJsonBuilder.showNotification; }
// public static void showNotification(boolean value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.showNotification = value; }

// public java.util.Map criteria() { return wrapperContained.criteria; }
// public void criteria(java.util.Map value) { wrapperContained.criteria = value; }
// public static java.util.Map criteria() { return net.minecraft.data.recipe.ShapedRecipeJsonBuilder.criteria; }
// public static void criteria(java.util.Map value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.criteria = value; }

// public yarnwrap.registry.RegistryEntryLookup registryLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.registryLookup); }
// public void registryLookup(yarnwrap.registry.RegistryEntryLookup value) { wrapperContained.registryLookup = value.wrapperContained; }
// public static yarnwrap.registry.RegistryEntryLookup registryLookup() { return new yarnwrap.registry.RegistryEntryLookup(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.registryLookup); }
// public static void registryLookup(yarnwrap.registry.RegistryEntryLookup value, ) { net.minecraft.data.recipe.ShapedRecipeJsonBuilder.registryLookup = value.wrapperContained; }

// public ShapedRecipeJsonBuilder(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { this.wrapperContained = new net.minecraft.data.recipe.ShapedRecipeJsonBuilder(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained,count); }
public yarnwrap.data.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,ingredient.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.recipe.Ingredient ingredient, ) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.input(c,ingredient.wrapperContained)); }
// public yarnwrap.recipe.RawShapedRecipe validate(yarnwrap.registry.RegistryKey recipeKey) { return new yarnwrap.recipe.RawShapedRecipe(wrapperContained.validate(recipeKey.wrapperContained)); }
// public static yarnwrap.recipe.RawShapedRecipe validate(yarnwrap.registry.RegistryKey recipeKey, ) { return new yarnwrap.recipe.RawShapedRecipe(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.validate(recipeKey.wrapperContained)); }
public yarnwrap.data.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,tag.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.registry.tag.TagKey tag, ) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.input(c,tag.wrapperContained)); }
public yarnwrap.data.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.item.ItemConvertible item) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(wrapperContained.input(c,item.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapedRecipeJsonBuilder input(java.lang.Character c,yarnwrap.item.ItemConvertible item, ) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.input(c,item.wrapperContained)); }
// public yarnwrap.data.recipe.ShapedRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(wrapperContained.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained,count)); }
// public static yarnwrap.data.recipe.ShapedRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count, ) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained,count)); }
// public yarnwrap.data.recipe.ShapedRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(wrapperContained.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapedRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output, ) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained)); }
public yarnwrap.data.recipe.ShapedRecipeJsonBuilder pattern(java.lang.String patternStr) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(wrapperContained.pattern(patternStr)); }
// public static yarnwrap.data.recipe.ShapedRecipeJsonBuilder pattern(java.lang.String patternStr, ) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.pattern(patternStr)); }
// public yarnwrap.data.recipe.ShapedRecipeJsonBuilder showNotification(boolean showNotification) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(wrapperContained.showNotification(showNotification)); }
// // public static yarnwrap.data.recipe.ShapedRecipeJsonBuilder showNotification(boolean showNotification, ) { return new yarnwrap.data.recipe.ShapedRecipeJsonBuilder(net.minecraft.data.recipe.ShapedRecipeJsonBuilder.showNotification(showNotification)); }

}