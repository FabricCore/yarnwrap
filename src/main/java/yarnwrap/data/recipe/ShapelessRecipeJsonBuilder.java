package yarnwrap.data.recipe;
public class ShapelessRecipeJsonBuilder { public net.minecraft.data.recipe.ShapelessRecipeJsonBuilder wrapperContained; public ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map advancementBuilder() { return wrapperContained.advancementBuilder; }
// public void advancementBuilder(java.util.Map value) { wrapperContained.advancementBuilder = value; }
// public static java.util.Map advancementBuilder() { return net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.advancementBuilder; }
// public static void advancementBuilder(java.util.Map value, ) { net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.advancementBuilder = value; }

// public java.util.List inputs() { return wrapperContained.inputs; }
// public void inputs(java.util.List value) { wrapperContained.inputs = value; }
// public static java.util.List inputs() { return net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.inputs; }
// public static void inputs(java.util.List value, ) { net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.inputs = value; }

// public yarnwrap.item.ItemStack output() { return new yarnwrap.item.ItemStack(wrapperContained.output); }
// public void output(yarnwrap.item.ItemStack value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.item.ItemStack output() { return new yarnwrap.item.ItemStack(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.output); }
// public static void output(yarnwrap.item.ItemStack value, ) { net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.output = value.wrapperContained; }

// public java.lang.String group() { return wrapperContained.group; }
// public void group(java.lang.String value) { wrapperContained.group = value; }
// public static java.lang.String group() { return net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.group; }
// public static void group(java.lang.String value, ) { net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.group = value; }

// public yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeCategory category() { return new yarnwrap.recipe.book.RecipeCategory(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.category); }
// public static void category(yarnwrap.recipe.book.RecipeCategory value, ) { net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.category = value.wrapperContained; }

// public yarnwrap.registry.RegistryEntryLookup registryLookup() { return new yarnwrap.registry.RegistryEntryLookup(wrapperContained.registryLookup); }
// public void registryLookup(yarnwrap.registry.RegistryEntryLookup value) { wrapperContained.registryLookup = value.wrapperContained; }
// public static yarnwrap.registry.RegistryEntryLookup registryLookup() { return new yarnwrap.registry.RegistryEntryLookup(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.registryLookup); }
// public static void registryLookup(yarnwrap.registry.RegistryEntryLookup value, ) { net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.registryLookup = value.wrapperContained; }

// public ShapelessRecipeJsonBuilder(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemStack output) { this.wrapperContained = new net.minecraft.data.recipe.ShapelessRecipeJsonBuilder(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained); }
// public void validate(yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.validate(recipeKey.wrapperContained); }
// public static void validate(yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.validate(recipeKey.wrapperContained); }
public yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(tag.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.registry.tag.TagKey tag, ) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.input(tag.wrapperContained)); }
// public yarnwrap.data.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemStack output) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(wrapperContained.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemStack output, ) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained)); }
// public yarnwrap.data.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(wrapperContained.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained,count)); }
// public static yarnwrap.data.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output,int count, ) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained,count)); }
public yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible item,int amount) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(item.wrapperContained,amount)); }
// public static yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible item,int amount, ) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.input(item.wrapperContained,amount)); }
public yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(ingredient.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient, ) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.input(ingredient.wrapperContained)); }
public yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient,int amount) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(ingredient.wrapperContained,amount)); }
// public static yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.recipe.Ingredient ingredient,int amount, ) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.input(ingredient.wrapperContained,amount)); }
public yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible item) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(wrapperContained.input(item.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapelessRecipeJsonBuilder input(yarnwrap.item.ItemConvertible item, ) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.input(item.wrapperContained)); }
// public yarnwrap.data.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(wrapperContained.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained)); }
// public static yarnwrap.data.recipe.ShapelessRecipeJsonBuilder create(yarnwrap.registry.RegistryEntryLookup registryLookup,yarnwrap.recipe.book.RecipeCategory category,yarnwrap.item.ItemConvertible output, ) { return new yarnwrap.data.recipe.ShapelessRecipeJsonBuilder(net.minecraft.data.recipe.ShapelessRecipeJsonBuilder.create(registryLookup.wrapperContained,category.wrapperContained,output.wrapperContained)); }

}