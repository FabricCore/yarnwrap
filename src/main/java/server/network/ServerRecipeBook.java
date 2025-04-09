package yarnwrap.server.network;
public class ServerRecipeBook { public net.minecraft.server.network.ServerRecipeBook wrapperContained; public ServerRecipeBook(net.minecraft.server.network.ServerRecipeBook wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public java.lang.String RECIPE_BOOK_KEY() { return wrapperContained.RECIPE_BOOK_KEY; }
// public void sendUnlockRecipesPacket(Object action,yarnwrap.server.network.ServerPlayerEntity player,java.util.List recipeIds) { wrapperContained.sendUnlockRecipesPacket(action,player.wrapperContained,recipeIds); }
public int lockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.lockRecipes(recipes,player.wrapperContained); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.recipe.RecipeManager recipeManager) { wrapperContained.readNbt(nbt.wrapperContained,recipeManager.wrapperContained); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
public int unlockRecipes(java.util.Collection recipes,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.unlockRecipes(recipes,player.wrapperContained); }
public void sendInitRecipesPacket(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendInitRecipesPacket(player.wrapperContained); }
// public void handleList(yarnwrap.nbt.NbtList list,java.util.function.Consumer handler,yarnwrap.recipe.RecipeManager recipeManager) { wrapperContained.handleList(list.wrapperContained,handler,recipeManager.wrapperContained); }

}