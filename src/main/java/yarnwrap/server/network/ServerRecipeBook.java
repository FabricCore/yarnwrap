package yarnwrap.server.network;
public class ServerRecipeBook { public net.minecraft.server.network.ServerRecipeBook wrapperContained; public ServerRecipeBook(net.minecraft.server.network.ServerRecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.ServerRecipeBook.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.ServerRecipeBook.LOGGER = value; }

// public java.lang.String RECIPE_BOOK_KEY() { return wrapperContained.RECIPE_BOOK_KEY; }
// public void RECIPE_BOOK_KEY(java.lang.String value) { wrapperContained.RECIPE_BOOK_KEY = value; }
public static java.lang.String RECIPE_BOOK_KEY() { return net.minecraft.server.network.ServerRecipeBook.RECIPE_BOOK_KEY; }
// public static void RECIPE_BOOK_KEY(java.lang.String value, ) { net.minecraft.server.network.ServerRecipeBook.RECIPE_BOOK_KEY = value; }

// public java.util.Set unlocked() { return wrapperContained.unlocked; }
// public void unlocked(java.util.Set value) { wrapperContained.unlocked = value; }
// public static java.util.Set unlocked() { return net.minecraft.server.network.ServerRecipeBook.unlocked; }
// public static void unlocked(java.util.Set value, ) { net.minecraft.server.network.ServerRecipeBook.unlocked = value; }

// public java.util.Set highlighted() { return wrapperContained.highlighted; }
// public void highlighted(java.util.Set value) { wrapperContained.highlighted = value; }
// public static java.util.Set highlighted() { return net.minecraft.server.network.ServerRecipeBook.highlighted; }
// public static void highlighted(java.util.Set value, ) { net.minecraft.server.network.ServerRecipeBook.highlighted = value; }

// public Object collector() { return wrapperContained.collector; }
// // public void collector(Object value) { wrapperContained.collector = value; }
// // public static Object collector() { return net.minecraft.server.network.ServerRecipeBook.collector; }
// // public static void collector(Object value, ) { net.minecraft.server.network.ServerRecipeBook.collector = value; }

// public ServerRecipeBook(Object collector) { this.wrapperContained = new net.minecraft.server.network.ServerRecipeBook(collector); }
public int lockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.lockRecipes(recipes,player.wrapperContained); }
// public static int lockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.network.ServerRecipeBook.lockRecipes(recipes,player.wrapperContained); }
public int unlockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.unlockRecipes(recipes,player.wrapperContained); }
// public static int unlockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.network.ServerRecipeBook.unlockRecipes(recipes,player.wrapperContained); }
public void sendInitRecipesPacket(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendInitRecipesPacket(player.wrapperContained); }
// public static void sendInitRecipesPacket(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.network.ServerRecipeBook.sendInitRecipesPacket(player.wrapperContained); }
// public void handleList(java.util.List recipes,java.util.function.Consumer handler,java.util.function.Predicate validPredicate) { wrapperContained.handleList(recipes,handler,validPredicate); }
// public static void handleList(java.util.List recipes,java.util.function.Consumer handler,java.util.function.Predicate validPredicate, ) { net.minecraft.server.network.ServerRecipeBook.handleList(recipes,handler,validPredicate); }
public void unlock(yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.unlock(recipeKey.wrapperContained); }
// public static void unlock(yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.server.network.ServerRecipeBook.unlock(recipeKey.wrapperContained); }
public void copyFrom(yarnwrap.server.network.ServerRecipeBook recipeBook) { wrapperContained.copyFrom(recipeBook.wrapperContained); }
// public static void copyFrom(yarnwrap.server.network.ServerRecipeBook recipeBook, ) { net.minecraft.server.network.ServerRecipeBook.copyFrom(recipeBook.wrapperContained); }
// public void method_64590(java.util.List display) { wrapperContained.method_64590(display); }
// public static void method_64590(java.util.List display, ) { net.minecraft.server.network.ServerRecipeBook.method_64590(display); }
// public void method_64591(java.util.List display) { wrapperContained.method_64591(display); }
// public static void method_64591(java.util.List display, ) { net.minecraft.server.network.ServerRecipeBook.method_64591(display); }
// public void method_64592(java.util.List display) { wrapperContained.method_64592(display); }
// public static void method_64592(java.util.List display, ) { net.minecraft.server.network.ServerRecipeBook.method_64592(display); }
public boolean isUnlocked(yarnwrap.registry.RegistryKey recipeKey) { return wrapperContained.isUnlocked(recipeKey.wrapperContained); }
// public static boolean isUnlocked(yarnwrap.registry.RegistryKey recipeKey, ) { return net.minecraft.server.network.ServerRecipeBook.isUnlocked(recipeKey.wrapperContained); }
public void lock(yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.lock(recipeKey.wrapperContained); }
// public static void lock(yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.server.network.ServerRecipeBook.lock(recipeKey.wrapperContained); }
public void unmarkHighlighted(yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.unmarkHighlighted(recipeKey.wrapperContained); }
// public static void unmarkHighlighted(yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.server.network.ServerRecipeBook.unmarkHighlighted(recipeKey.wrapperContained); }
// public void markHighlighted(yarnwrap.registry.RegistryKey recipeKey) { wrapperContained.markHighlighted(recipeKey.wrapperContained); }
// public static void markHighlighted(yarnwrap.registry.RegistryKey recipeKey, ) { net.minecraft.server.network.ServerRecipeBook.markHighlighted(recipeKey.wrapperContained); }
// public void unpack(Object packed) { wrapperContained.unpack(packed); }
// public static void unpack(Object packed, ) { net.minecraft.server.network.ServerRecipeBook.unpack(packed); }
// public void unpack(Object packed,java.util.function.Predicate validPredicate) { wrapperContained.unpack(packed,validPredicate); }
// public static void unpack(Object packed,java.util.function.Predicate validPredicate, ) { net.minecraft.server.network.ServerRecipeBook.unpack(packed,validPredicate); }
// public Object pack() { return wrapperContained.pack(); }
// public static Object pack() { return net.minecraft.server.network.ServerRecipeBook.pack(); }

}