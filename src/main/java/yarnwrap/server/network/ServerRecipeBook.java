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

// public void sendUnlockRecipesPacket(Object action,yarnwrap.server.network.ServerPlayerEntity player,java.util.List recipeIds) { wrapperContained.sendUnlockRecipesPacket(action,player.wrapperContained,recipeIds); }
// public static void sendUnlockRecipesPacket(Object action,yarnwrap.server.network.ServerPlayerEntity player,java.util.List recipeIds, ) { net.minecraft.server.network.ServerRecipeBook.sendUnlockRecipesPacket(action,player.wrapperContained,recipeIds); }
public int lockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.lockRecipes(recipes,player.wrapperContained); }
// public static int lockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.network.ServerRecipeBook.lockRecipes(recipes,player.wrapperContained); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.recipe.RecipeManager recipeManager) { wrapperContained.readNbt(nbt.wrapperContained,recipeManager.wrapperContained); }
// public static void readNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.recipe.RecipeManager recipeManager, ) { net.minecraft.server.network.ServerRecipeBook.readNbt(nbt.wrapperContained,recipeManager.wrapperContained); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public static yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.server.network.ServerRecipeBook.toNbt()); }
public int unlockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.unlockRecipes(recipes,player.wrapperContained); }
// public static int unlockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.network.ServerRecipeBook.unlockRecipes(recipes,player.wrapperContained); }
public void sendInitRecipesPacket(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendInitRecipesPacket(player.wrapperContained); }
// public static void sendInitRecipesPacket(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.network.ServerRecipeBook.sendInitRecipesPacket(player.wrapperContained); }
// public void handleList(yarnwrap.nbt.NbtList list,java.util.function.Consumer handler,yarnwrap.recipe.RecipeManager recipeManager) { wrapperContained.handleList(list.wrapperContained,handler,recipeManager.wrapperContained); }
// public static void handleList(yarnwrap.nbt.NbtList list,java.util.function.Consumer handler,yarnwrap.recipe.RecipeManager recipeManager, ) { net.minecraft.server.network.ServerRecipeBook.handleList(list.wrapperContained,handler,recipeManager.wrapperContained); }

}