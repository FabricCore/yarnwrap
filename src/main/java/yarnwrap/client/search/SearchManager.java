package yarnwrap.client.search;
public class SearchManager { public net.minecraft.client.search.SearchManager wrapperContained; public SearchManager(net.minecraft.client.search.SearchManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object RECIPE_OUTPUT() { return wrapperContained.RECIPE_OUTPUT; }
// // public void RECIPE_OUTPUT(Object value) { wrapperContained.RECIPE_OUTPUT = value; }
// // public static Object RECIPE_OUTPUT() { return net.minecraft.client.search.SearchManager.RECIPE_OUTPUT; }
// // public static void RECIPE_OUTPUT(Object value, ) { net.minecraft.client.search.SearchManager.RECIPE_OUTPUT = value; }

// public java.util.concurrent.CompletableFuture itemTooltipReloadFuture() { return wrapperContained.itemTooltipReloadFuture; }
// public void itemTooltipReloadFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.itemTooltipReloadFuture = value; }
// public static java.util.concurrent.CompletableFuture itemTooltipReloadFuture() { return net.minecraft.client.search.SearchManager.itemTooltipReloadFuture; }
// public static void itemTooltipReloadFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.search.SearchManager.itemTooltipReloadFuture = value; }

// public java.util.concurrent.CompletableFuture itemTagReloadFuture() { return wrapperContained.itemTagReloadFuture; }
// public void itemTagReloadFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.itemTagReloadFuture = value; }
// public static java.util.concurrent.CompletableFuture itemTagReloadFuture() { return net.minecraft.client.search.SearchManager.itemTagReloadFuture; }
// public static void itemTagReloadFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.search.SearchManager.itemTagReloadFuture = value; }

// public java.util.concurrent.CompletableFuture recipeOutputReloadFuture() { return wrapperContained.recipeOutputReloadFuture; }
// public void recipeOutputReloadFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.recipeOutputReloadFuture = value; }
// public static java.util.concurrent.CompletableFuture recipeOutputReloadFuture() { return net.minecraft.client.search.SearchManager.recipeOutputReloadFuture; }
// public static void recipeOutputReloadFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.search.SearchManager.recipeOutputReloadFuture = value; }

// public java.util.Map reloaders() { return wrapperContained.reloaders; }
// public void reloaders(java.util.Map value) { wrapperContained.reloaders = value; }
// public static java.util.Map reloaders() { return net.minecraft.client.search.SearchManager.reloaders; }
// public static void reloaders(java.util.Map value, ) { net.minecraft.client.search.SearchManager.reloaders = value; }

// public Object ITEM_TAG() { return wrapperContained.ITEM_TAG; }
// // public void ITEM_TAG(Object value) { wrapperContained.ITEM_TAG = value; }
// // public static Object ITEM_TAG() { return net.minecraft.client.search.SearchManager.ITEM_TAG; }
// // public static void ITEM_TAG(Object value, ) { net.minecraft.client.search.SearchManager.ITEM_TAG = value; }

// public Object ITEM_TOOLTIP() { return wrapperContained.ITEM_TOOLTIP; }
// // public void ITEM_TOOLTIP(Object value) { wrapperContained.ITEM_TOOLTIP = value; }
// // public static Object ITEM_TOOLTIP() { return net.minecraft.client.search.SearchManager.ITEM_TOOLTIP; }
// // public static void ITEM_TOOLTIP(Object value, ) { net.minecraft.client.search.SearchManager.ITEM_TOOLTIP = value; }

public void refresh() { wrapperContained.refresh(); }
// public static void refresh() { net.minecraft.client.search.SearchManager.refresh(); }
// public java.util.stream.Stream method_60349(Object stack) { return wrapperContained.method_60349(stack); }
// public static java.util.stream.Stream method_60349(Object stack, ) { return net.minecraft.client.search.SearchManager.method_60349(stack); }
// public java.util.stream.Stream method_60351(yarnwrap.item.ItemStack stack) { return wrapperContained.method_60351(stack.wrapperContained); }
// public static java.util.stream.Stream method_60351(yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.search.SearchManager.method_60351(stack.wrapperContained); }
// public void addRecipeOutputReloader(yarnwrap.client.recipebook.ClientRecipeBook recipeBook,Object registryManager) { wrapperContained.addRecipeOutputReloader(recipeBook.wrapperContained,registryManager); }
// public static void addRecipeOutputReloader(yarnwrap.client.recipebook.ClientRecipeBook recipeBook,Object registryManager, ) { net.minecraft.client.search.SearchManager.addRecipeOutputReloader(recipeBook.wrapperContained,registryManager); }
// public void addReloader(Object key,java.lang.Runnable reloader) { wrapperContained.addReloader(key,reloader); }
// public static void addReloader(Object key,java.lang.Runnable reloader, ) { net.minecraft.client.search.SearchManager.addReloader(key,reloader); }
// public boolean method_60354(java.lang.String string) { return wrapperContained.method_60354(string); }
// public static boolean method_60354(java.lang.String string, ) { return net.minecraft.client.search.SearchManager.method_60354(string); }
public void addItemTagReloader(java.util.List stacks) { wrapperContained.addItemTagReloader(stacks); }
// public static void addItemTagReloader(java.util.List stacks, ) { net.minecraft.client.search.SearchManager.addItemTagReloader(stacks); }
// public java.util.stream.Stream collectItemTooltips(java.util.stream.Stream stacks,Object context,yarnwrap.item.tooltip.TooltipType type) { return wrapperContained.collectItemTooltips(stacks,context,type.wrapperContained); }
// public static java.util.stream.Stream collectItemTooltips(java.util.stream.Stream stacks,Object context,yarnwrap.item.tooltip.TooltipType type, ) { return net.minecraft.client.search.SearchManager.collectItemTooltips(stacks,context,type.wrapperContained); }
// public void addItemTooltipReloader(Object registryLookup,java.util.List stacks) { wrapperContained.addItemTooltipReloader(registryLookup,stacks); }
// public static void addItemTooltipReloader(Object registryLookup,java.util.List stacks, ) { net.minecraft.client.search.SearchManager.addItemTooltipReloader(registryLookup,stacks); }
// public yarnwrap.util.Identifier method_60358(yarnwrap.registry.Registry recipe) { return new yarnwrap.util.Identifier(wrapperContained.method_60358(recipe.wrapperContained)); }
// public static yarnwrap.util.Identifier method_60358(yarnwrap.registry.Registry recipe, ) { return new yarnwrap.util.Identifier(net.minecraft.client.search.SearchManager.method_60358(recipe.wrapperContained)); }
// public java.util.stream.Stream method_60359(yarnwrap.registry.Registry resultCollection) { return wrapperContained.method_60359(resultCollection.wrapperContained); }
// public static java.util.stream.Stream method_60359(yarnwrap.registry.Registry resultCollection, ) { return net.minecraft.client.search.SearchManager.method_60359(resultCollection.wrapperContained); }
// public java.util.stream.Stream method_60360(Object resultCollection) { return wrapperContained.method_60360(resultCollection); }
// public static java.util.stream.Stream method_60360(Object resultCollection, ) { return net.minecraft.client.search.SearchManager.method_60360(resultCollection); }
// public yarnwrap.item.ItemStack method_60362(Object recipe) { return new yarnwrap.item.ItemStack(wrapperContained.method_60362(recipe)); }
// public static yarnwrap.item.ItemStack method_60362(Object recipe, ) { return new yarnwrap.item.ItemStack(net.minecraft.client.search.SearchManager.method_60362(recipe)); }
// public java.lang.String method_60363(yarnwrap.text.Text tooltip) { return wrapperContained.method_60363(tooltip.wrapperContained); }
// public static java.lang.String method_60363(yarnwrap.text.Text tooltip, ) { return net.minecraft.client.search.SearchManager.method_60363(tooltip.wrapperContained); }
public yarnwrap.client.search.SearchProvider getRecipeOutputReloadFuture() { return new yarnwrap.client.search.SearchProvider(wrapperContained.getRecipeOutputReloadFuture()); }
// public static yarnwrap.client.search.SearchProvider getRecipeOutputReloadFuture() { return new yarnwrap.client.search.SearchProvider(net.minecraft.client.search.SearchManager.getRecipeOutputReloadFuture()); }
// public java.util.stream.Stream method_60365(Object stack) { return wrapperContained.method_60365(stack); }
// public static java.util.stream.Stream method_60365(Object stack, ) { return net.minecraft.client.search.SearchManager.method_60365(stack); }
// public java.util.stream.Stream method_60366(yarnwrap.item.ItemStack stack) { return wrapperContained.method_60366(stack.wrapperContained); }
// public static java.util.stream.Stream method_60366(yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.search.SearchManager.method_60366(stack.wrapperContained); }
public yarnwrap.client.search.SearchProvider getItemTagReloadFuture() { return new yarnwrap.client.search.SearchProvider(wrapperContained.getItemTagReloadFuture()); }
// public static yarnwrap.client.search.SearchProvider getItemTagReloadFuture() { return new yarnwrap.client.search.SearchProvider(net.minecraft.client.search.SearchManager.getItemTagReloadFuture()); }
public yarnwrap.client.search.SearchProvider getItemTooltipReloadFuture() { return new yarnwrap.client.search.SearchProvider(wrapperContained.getItemTooltipReloadFuture()); }
// public static yarnwrap.client.search.SearchProvider getItemTooltipReloadFuture() { return new yarnwrap.client.search.SearchProvider(net.minecraft.client.search.SearchManager.getItemTooltipReloadFuture()); }

}