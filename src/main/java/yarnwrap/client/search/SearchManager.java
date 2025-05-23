package yarnwrap.client.search;
public class SearchManager { public net.minecraft.client.search.SearchManager wrapperContained; public SearchManager(net.minecraft.client.search.SearchManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object ITEM_TAG() { return wrapperContained.ITEM_TAG; }
// // public void ITEM_TAG(Object value) { wrapperContained.ITEM_TAG = value; }
// // public static Object ITEM_TAG() { return net.minecraft.client.search.SearchManager.ITEM_TAG; }
// // public static void ITEM_TAG(Object value, ) { net.minecraft.client.search.SearchManager.ITEM_TAG = value; }

// public Object ITEM_TOOLTIP() { return wrapperContained.ITEM_TOOLTIP; }
// // public void ITEM_TOOLTIP(Object value) { wrapperContained.ITEM_TOOLTIP = value; }
// // public static Object ITEM_TOOLTIP() { return net.minecraft.client.search.SearchManager.ITEM_TOOLTIP; }
// // public static void ITEM_TOOLTIP(Object value, ) { net.minecraft.client.search.SearchManager.ITEM_TOOLTIP = value; }

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

public void refresh() { wrapperContained.refresh(); }
// public static void refresh() { net.minecraft.client.search.SearchManager.refresh(); }
// public java.util.stream.Stream method_60349(Object stack) { return wrapperContained.method_60349(stack); }
// public static java.util.stream.Stream method_60349(Object stack, ) { return net.minecraft.client.search.SearchManager.method_60349(stack); }
// public java.util.stream.Stream method_60351(yarnwrap.item.ItemStack stack) { return wrapperContained.method_60351(stack.wrapperContained); }
// public static java.util.stream.Stream method_60351(yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.search.SearchManager.method_60351(stack.wrapperContained); }
public void addRecipeOutputReloader(yarnwrap.client.recipebook.ClientRecipeBook recipeBook,yarnwrap.world.World world) { wrapperContained.addRecipeOutputReloader(recipeBook.wrapperContained,world.wrapperContained); }
// public static void addRecipeOutputReloader(yarnwrap.client.recipebook.ClientRecipeBook recipeBook,yarnwrap.world.World world, ) { net.minecraft.client.search.SearchManager.addRecipeOutputReloader(recipeBook.wrapperContained,world.wrapperContained); }
// public void addReloader(Object key,java.lang.Runnable reloader) { wrapperContained.addReloader(key,reloader); }
// public static void addReloader(Object key,java.lang.Runnable reloader, ) { net.minecraft.client.search.SearchManager.addReloader(key,reloader); }
// public boolean method_60354(java.lang.String string) { return wrapperContained.method_60354(string); }
// public static boolean method_60354(java.lang.String string, ) { return net.minecraft.client.search.SearchManager.method_60354(string); }
public void addItemTagReloader(java.util.List stacks) { wrapperContained.addItemTagReloader(stacks); }
// public static void addItemTagReloader(java.util.List stacks, ) { net.minecraft.client.search.SearchManager.addItemTagReloader(stacks); }
// public java.util.stream.Stream collectItemTooltips(java.util.stream.Stream stacks,Object context,yarnwrap.item.tooltip.TooltipType type) { return wrapperContained.collectItemTooltips(stacks,context,type.wrapperContained); }
// public static java.util.stream.Stream collectItemTooltips(java.util.stream.Stream stacks,Object context,yarnwrap.item.tooltip.TooltipType type, ) { return net.minecraft.client.search.SearchManager.collectItemTooltips(stacks,context,type.wrapperContained); }
// public void addItemTooltipReloader(Object registries,java.util.List stacks) { wrapperContained.addItemTooltipReloader(registries,stacks); }
// public static void addItemTooltipReloader(Object registries,java.util.List stacks, ) { net.minecraft.client.search.SearchManager.addItemTooltipReloader(registries,stacks); }
// public java.util.stream.Stream method_60360(yarnwrap.util.context.ContextParameterMap resultCollection) { return wrapperContained.method_60360(resultCollection.wrapperContained); }
// public static java.util.stream.Stream method_60360(yarnwrap.util.context.ContextParameterMap resultCollection, ) { return net.minecraft.client.search.SearchManager.method_60360(resultCollection.wrapperContained); }
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
// public java.util.stream.Stream method_64907(yarnwrap.util.context.ContextParameterMap display) { return wrapperContained.method_64907(display.wrapperContained); }
// public static java.util.stream.Stream method_64907(yarnwrap.util.context.ContextParameterMap display, ) { return net.minecraft.client.search.SearchManager.method_64907(display.wrapperContained); }
// public java.util.stream.Stream method_64908(yarnwrap.util.context.ContextParameterMap resultCollection) { return wrapperContained.method_64908(resultCollection.wrapperContained); }
// public static java.util.stream.Stream method_64908(yarnwrap.util.context.ContextParameterMap resultCollection, ) { return net.minecraft.client.search.SearchManager.method_64908(resultCollection.wrapperContained); }
// public yarnwrap.util.Identifier method_64909(yarnwrap.registry.Registry stack) { return new yarnwrap.util.Identifier(wrapperContained.method_64909(stack.wrapperContained)); }
// public static yarnwrap.util.Identifier method_64909(yarnwrap.registry.Registry stack, ) { return new yarnwrap.util.Identifier(net.minecraft.client.search.SearchManager.method_64909(stack.wrapperContained)); }
// public java.util.stream.Stream method_64910(yarnwrap.util.context.ContextParameterMap display) { return wrapperContained.method_64910(display.wrapperContained); }
// public static java.util.stream.Stream method_64910(yarnwrap.util.context.ContextParameterMap display, ) { return net.minecraft.client.search.SearchManager.method_64910(display.wrapperContained); }

}