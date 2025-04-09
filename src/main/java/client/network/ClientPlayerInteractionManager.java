package yarnwrap.client.network;
public class ClientPlayerInteractionManager { public net.minecraft.client.network.ClientPlayerInteractionManager wrapperContained; public ClientPlayerInteractionManager(net.minecraft.client.network.ClientPlayerInteractionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.GameMode previousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.previousGameMode); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public float blockBreakingSoundCooldown() { return wrapperContained.blockBreakingSoundCooldown; }
// public yarnwrap.util.math.BlockPos currentBreakingPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.currentBreakingPos); }
// public float currentBreakingProgress() { return wrapperContained.currentBreakingProgress; }
// public int blockBreakingCooldown() { return wrapperContained.blockBreakingCooldown; }
// public boolean breakingBlock() { return wrapperContained.breakingBlock; }
// public yarnwrap.item.ItemStack selectedStack() { return new yarnwrap.item.ItemStack(wrapperContained.selectedStack); }
// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public int lastSelectedSlot() { return wrapperContained.lastSelectedSlot; }
public yarnwrap.world.GameMode getPreviousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getPreviousGameMode()); }
public boolean hasRidingInventory() { return wrapperContained.hasRidingInventory(); }
public yarnwrap.util.ActionResult interactBlock(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult) { return new yarnwrap.util.ActionResult(wrapperContained.interactBlock(player.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
public void stopUsingItem(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.stopUsingItem(player.wrapperContained); }
public boolean breakBlock(yarnwrap.util.math.BlockPos pos) { return wrapperContained.breakBlock(pos.wrapperContained); }
public void clickButton(int syncId,int buttonId) { wrapperContained.clickButton(syncId,buttonId); }
public yarnwrap.client.network.ClientPlayerEntity createPlayer(yarnwrap.client.world.ClientWorld world,yarnwrap.stat.StatHandler statHandler,yarnwrap.client.recipebook.ClientRecipeBook recipeBook,boolean lastSneaking,boolean lastSprinting) { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.createPlayer(world.wrapperContained,statHandler.wrapperContained,recipeBook.wrapperContained,lastSneaking,lastSprinting)); }
public boolean updateBlockBreakingProgress(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.updateBlockBreakingProgress(pos.wrapperContained,direction.wrapperContained); }
public void copyAbilities(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.copyAbilities(player.wrapperContained); }
public yarnwrap.util.ActionResult interactEntity(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactEntity(player.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
public void clickSlot(int syncId,int slotId,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.clickSlot(syncId,slotId,button,actionType.wrapperContained,player.wrapperContained); }
public void setGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setGameMode(gameMode.wrapperContained); }
public boolean hasStatusBars() { return wrapperContained.hasStatusBars(); }
public void clickCreativeStack(yarnwrap.item.ItemStack stack,int slotId) { wrapperContained.clickCreativeStack(stack.wrapperContained,slotId); }
public boolean attackBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.attackBlock(pos.wrapperContained,direction.wrapperContained); }
// public void syncSelectedSlot() { wrapperContained.syncSelectedSlot(); }
public void clickRecipe(int syncId,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll) { wrapperContained.clickRecipe(syncId,recipe.wrapperContained,craftAll); }
public boolean hasExperienceBar() { return wrapperContained.hasExperienceBar(); }
public boolean hasCreativeInventory() { return wrapperContained.hasCreativeInventory(); }
public void dropCreativeStack(yarnwrap.item.ItemStack stack) { wrapperContained.dropCreativeStack(stack.wrapperContained); }
public void pickFromInventory(int slot) { wrapperContained.pickFromInventory(slot); }
public yarnwrap.util.ActionResult interactEntityAtLocation(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.util.hit.EntityHitResult hitResult,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactEntityAtLocation(player.wrapperContained,entity.wrapperContained,hitResult.wrapperContained,hand.wrapperContained)); }
public void attackEntity(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity target) { wrapperContained.attackEntity(player.wrapperContained,target.wrapperContained); }
public yarnwrap.util.ActionResult interactItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactItem(player.wrapperContained,hand.wrapperContained)); }
public yarnwrap.world.GameMode getCurrentGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getCurrentGameMode()); }
// public boolean isCurrentlyBreaking(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isCurrentlyBreaking(pos.wrapperContained); }
public boolean isBreakingBlock() { return wrapperContained.isBreakingBlock(); }
public boolean hasLimitedAttackSpeed() { return wrapperContained.hasLimitedAttackSpeed(); }
public void cancelBlockBreaking() { wrapperContained.cancelBlockBreaking(); }
public void tick() { wrapperContained.tick(); }
public boolean isFlyingLocked() { return wrapperContained.isFlyingLocked(); }
public yarnwrap.client.network.ClientPlayerEntity createPlayer(yarnwrap.client.world.ClientWorld world,yarnwrap.stat.StatHandler statHandler,yarnwrap.client.recipebook.ClientRecipeBook recipeBook) { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.createPlayer(world.wrapperContained,statHandler.wrapperContained,recipeBook.wrapperContained)); }
public void setGameModes(yarnwrap.world.GameMode gameMode,yarnwrap.world.GameMode previousGameMode) { wrapperContained.setGameModes(gameMode.wrapperContained,previousGameMode.wrapperContained); }
// public void sendSequencedPacket(yarnwrap.client.world.ClientWorld world,yarnwrap.client.network.SequencedPacketCreator packetCreator) { wrapperContained.sendSequencedPacket(world.wrapperContained,packetCreator.wrapperContained); }
// public yarnwrap.util.ActionResult interactBlockInternal(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult) { return new yarnwrap.util.ActionResult(wrapperContained.interactBlockInternal(player.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
public int getBlockBreakingProgress() { return wrapperContained.getBlockBreakingProgress(); }
public void slotChangedState(int slot,int screenHandlerId,boolean newState) { wrapperContained.slotChangedState(slot,screenHandlerId,newState); }

}