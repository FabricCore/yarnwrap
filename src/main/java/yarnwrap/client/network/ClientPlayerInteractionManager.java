package yarnwrap.client.network;
public class ClientPlayerInteractionManager { public net.minecraft.client.network.ClientPlayerInteractionManager wrapperContained; public ClientPlayerInteractionManager(net.minecraft.client.network.ClientPlayerInteractionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.ClientPlayerInteractionManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.LOGGER = value; }

// public yarnwrap.world.GameMode previousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.previousGameMode); }
// public void previousGameMode(yarnwrap.world.GameMode value) { wrapperContained.previousGameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode previousGameMode() { return new yarnwrap.world.GameMode(net.minecraft.client.network.ClientPlayerInteractionManager.previousGameMode); }
// public static void previousGameMode(yarnwrap.world.GameMode value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.previousGameMode = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.network.ClientPlayerInteractionManager.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.client = value.wrapperContained; }

// public float blockBreakingSoundCooldown() { return wrapperContained.blockBreakingSoundCooldown; }
// public void blockBreakingSoundCooldown(float value) { wrapperContained.blockBreakingSoundCooldown = value; }
// public static float blockBreakingSoundCooldown() { return net.minecraft.client.network.ClientPlayerInteractionManager.blockBreakingSoundCooldown; }
// public static void blockBreakingSoundCooldown(float value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.blockBreakingSoundCooldown = value; }

// public yarnwrap.util.math.BlockPos currentBreakingPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.currentBreakingPos); }
// public void currentBreakingPos(yarnwrap.util.math.BlockPos value) { wrapperContained.currentBreakingPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos currentBreakingPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.client.network.ClientPlayerInteractionManager.currentBreakingPos); }
// public static void currentBreakingPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.currentBreakingPos = value.wrapperContained; }

// public float currentBreakingProgress() { return wrapperContained.currentBreakingProgress; }
// public void currentBreakingProgress(float value) { wrapperContained.currentBreakingProgress = value; }
// public static float currentBreakingProgress() { return net.minecraft.client.network.ClientPlayerInteractionManager.currentBreakingProgress; }
// public static void currentBreakingProgress(float value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.currentBreakingProgress = value; }

// public int blockBreakingCooldown() { return wrapperContained.blockBreakingCooldown; }
// public void blockBreakingCooldown(int value) { wrapperContained.blockBreakingCooldown = value; }
// public static int blockBreakingCooldown() { return net.minecraft.client.network.ClientPlayerInteractionManager.blockBreakingCooldown; }
// public static void blockBreakingCooldown(int value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.blockBreakingCooldown = value; }

// public boolean breakingBlock() { return wrapperContained.breakingBlock; }
// public void breakingBlock(boolean value) { wrapperContained.breakingBlock = value; }
// public static boolean breakingBlock() { return net.minecraft.client.network.ClientPlayerInteractionManager.breakingBlock; }
// public static void breakingBlock(boolean value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.breakingBlock = value; }

// public yarnwrap.item.ItemStack selectedStack() { return new yarnwrap.item.ItemStack(wrapperContained.selectedStack); }
// public void selectedStack(yarnwrap.item.ItemStack value) { wrapperContained.selectedStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack selectedStack() { return new yarnwrap.item.ItemStack(net.minecraft.client.network.ClientPlayerInteractionManager.selectedStack); }
// public static void selectedStack(yarnwrap.item.ItemStack value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.selectedStack = value.wrapperContained; }

// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameMode value) { wrapperContained.gameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(net.minecraft.client.network.ClientPlayerInteractionManager.gameMode); }
// public static void gameMode(yarnwrap.world.GameMode value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.gameMode = value.wrapperContained; }

// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(net.minecraft.client.network.ClientPlayerInteractionManager.networkHandler); }
// public static void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.networkHandler = value.wrapperContained; }

// public int lastSelectedSlot() { return wrapperContained.lastSelectedSlot; }
// public void lastSelectedSlot(int value) { wrapperContained.lastSelectedSlot = value; }
// public static int lastSelectedSlot() { return net.minecraft.client.network.ClientPlayerInteractionManager.lastSelectedSlot; }
// public static void lastSelectedSlot(int value, ) { net.minecraft.client.network.ClientPlayerInteractionManager.lastSelectedSlot = value; }

public ClientPlayerInteractionManager(yarnwrap.client.MinecraftClient client,yarnwrap.client.network.ClientPlayNetworkHandler networkHandler) { this.wrapperContained = new net.minecraft.client.network.ClientPlayerInteractionManager(client.wrapperContained,networkHandler.wrapperContained); }
public yarnwrap.world.GameMode getPreviousGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getPreviousGameMode()); }
// public static yarnwrap.world.GameMode getPreviousGameMode() { return new yarnwrap.world.GameMode(net.minecraft.client.network.ClientPlayerInteractionManager.getPreviousGameMode()); }
public boolean hasRidingInventory() { return wrapperContained.hasRidingInventory(); }
// public static boolean hasRidingInventory() { return net.minecraft.client.network.ClientPlayerInteractionManager.hasRidingInventory(); }
public yarnwrap.util.ActionResult interactBlock(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult) { return new yarnwrap.util.ActionResult(wrapperContained.interactBlock(player.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactBlock(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult, ) { return new yarnwrap.util.ActionResult(net.minecraft.client.network.ClientPlayerInteractionManager.interactBlock(player.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
public void stopUsingItem(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.stopUsingItem(player.wrapperContained); }
// public static void stopUsingItem(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.client.network.ClientPlayerInteractionManager.stopUsingItem(player.wrapperContained); }
public boolean breakBlock(yarnwrap.util.math.BlockPos pos) { return wrapperContained.breakBlock(pos.wrapperContained); }
// public static boolean breakBlock(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.network.ClientPlayerInteractionManager.breakBlock(pos.wrapperContained); }
public void clickButton(int syncId,int buttonId) { wrapperContained.clickButton(syncId,buttonId); }
// public static void clickButton(int syncId,int buttonId, ) { net.minecraft.client.network.ClientPlayerInteractionManager.clickButton(syncId,buttonId); }
public yarnwrap.client.network.ClientPlayerEntity createPlayer(yarnwrap.client.world.ClientWorld world,yarnwrap.stat.StatHandler statHandler,yarnwrap.client.recipebook.ClientRecipeBook recipeBook,boolean lastSneaking,boolean lastSprinting) { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.createPlayer(world.wrapperContained,statHandler.wrapperContained,recipeBook.wrapperContained,lastSneaking,lastSprinting)); }
// public static yarnwrap.client.network.ClientPlayerEntity createPlayer(yarnwrap.client.world.ClientWorld world,yarnwrap.stat.StatHandler statHandler,yarnwrap.client.recipebook.ClientRecipeBook recipeBook,boolean lastSneaking,boolean lastSprinting, ) { return new yarnwrap.client.network.ClientPlayerEntity(net.minecraft.client.network.ClientPlayerInteractionManager.createPlayer(world.wrapperContained,statHandler.wrapperContained,recipeBook.wrapperContained,lastSneaking,lastSprinting)); }
public boolean updateBlockBreakingProgress(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.updateBlockBreakingProgress(pos.wrapperContained,direction.wrapperContained); }
// public static boolean updateBlockBreakingProgress(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.client.network.ClientPlayerInteractionManager.updateBlockBreakingProgress(pos.wrapperContained,direction.wrapperContained); }
public void copyAbilities(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.copyAbilities(player.wrapperContained); }
// public static void copyAbilities(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.client.network.ClientPlayerInteractionManager.copyAbilities(player.wrapperContained); }
public yarnwrap.util.ActionResult interactEntity(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactEntity(player.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactEntity(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.client.network.ClientPlayerInteractionManager.interactEntity(player.wrapperContained,entity.wrapperContained,hand.wrapperContained)); }
public void clickSlot(int syncId,int slotId,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.clickSlot(syncId,slotId,button,actionType.wrapperContained,player.wrapperContained); }
// public static void clickSlot(int syncId,int slotId,int button,yarnwrap.screen.slot.SlotActionType actionType,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.client.network.ClientPlayerInteractionManager.clickSlot(syncId,slotId,button,actionType.wrapperContained,player.wrapperContained); }
public void setGameMode(yarnwrap.world.GameMode gameMode) { wrapperContained.setGameMode(gameMode.wrapperContained); }
// public static void setGameMode(yarnwrap.world.GameMode gameMode, ) { net.minecraft.client.network.ClientPlayerInteractionManager.setGameMode(gameMode.wrapperContained); }
public boolean hasStatusBars() { return wrapperContained.hasStatusBars(); }
// public static boolean hasStatusBars() { return net.minecraft.client.network.ClientPlayerInteractionManager.hasStatusBars(); }
public void clickCreativeStack(yarnwrap.item.ItemStack stack,int slotId) { wrapperContained.clickCreativeStack(stack.wrapperContained,slotId); }
// public static void clickCreativeStack(yarnwrap.item.ItemStack stack,int slotId, ) { net.minecraft.client.network.ClientPlayerInteractionManager.clickCreativeStack(stack.wrapperContained,slotId); }
public boolean attackBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.attackBlock(pos.wrapperContained,direction.wrapperContained); }
// public static boolean attackBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.client.network.ClientPlayerInteractionManager.attackBlock(pos.wrapperContained,direction.wrapperContained); }
// public void syncSelectedSlot() { wrapperContained.syncSelectedSlot(); }
// public static void syncSelectedSlot() { net.minecraft.client.network.ClientPlayerInteractionManager.syncSelectedSlot(); }
public void clickRecipe(int syncId,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll) { wrapperContained.clickRecipe(syncId,recipe.wrapperContained,craftAll); }
// public static void clickRecipe(int syncId,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll, ) { net.minecraft.client.network.ClientPlayerInteractionManager.clickRecipe(syncId,recipe.wrapperContained,craftAll); }
public boolean hasExperienceBar() { return wrapperContained.hasExperienceBar(); }
// public static boolean hasExperienceBar() { return net.minecraft.client.network.ClientPlayerInteractionManager.hasExperienceBar(); }
public boolean hasCreativeInventory() { return wrapperContained.hasCreativeInventory(); }
// public static boolean hasCreativeInventory() { return net.minecraft.client.network.ClientPlayerInteractionManager.hasCreativeInventory(); }
public void dropCreativeStack(yarnwrap.item.ItemStack stack) { wrapperContained.dropCreativeStack(stack.wrapperContained); }
// public static void dropCreativeStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.client.network.ClientPlayerInteractionManager.dropCreativeStack(stack.wrapperContained); }
public void pickFromInventory(int slot) { wrapperContained.pickFromInventory(slot); }
// public static void pickFromInventory(int slot, ) { net.minecraft.client.network.ClientPlayerInteractionManager.pickFromInventory(slot); }
public yarnwrap.util.ActionResult interactEntityAtLocation(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.util.hit.EntityHitResult hitResult,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactEntityAtLocation(player.wrapperContained,entity.wrapperContained,hitResult.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactEntityAtLocation(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity entity,yarnwrap.util.hit.EntityHitResult hitResult,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.client.network.ClientPlayerInteractionManager.interactEntityAtLocation(player.wrapperContained,entity.wrapperContained,hitResult.wrapperContained,hand.wrapperContained)); }
public void attackEntity(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity target) { wrapperContained.attackEntity(player.wrapperContained,target.wrapperContained); }
// public static void attackEntity(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity target, ) { net.minecraft.client.network.ClientPlayerInteractionManager.attackEntity(player.wrapperContained,target.wrapperContained); }
public yarnwrap.util.ActionResult interactItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactItem(player.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.client.network.ClientPlayerInteractionManager.interactItem(player.wrapperContained,hand.wrapperContained)); }
public yarnwrap.world.GameMode getCurrentGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getCurrentGameMode()); }
// public static yarnwrap.world.GameMode getCurrentGameMode() { return new yarnwrap.world.GameMode(net.minecraft.client.network.ClientPlayerInteractionManager.getCurrentGameMode()); }
// public boolean isCurrentlyBreaking(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isCurrentlyBreaking(pos.wrapperContained); }
// public static boolean isCurrentlyBreaking(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.network.ClientPlayerInteractionManager.isCurrentlyBreaking(pos.wrapperContained); }
public boolean isBreakingBlock() { return wrapperContained.isBreakingBlock(); }
// public static boolean isBreakingBlock() { return net.minecraft.client.network.ClientPlayerInteractionManager.isBreakingBlock(); }
public boolean hasLimitedAttackSpeed() { return wrapperContained.hasLimitedAttackSpeed(); }
// public static boolean hasLimitedAttackSpeed() { return net.minecraft.client.network.ClientPlayerInteractionManager.hasLimitedAttackSpeed(); }
public void cancelBlockBreaking() { wrapperContained.cancelBlockBreaking(); }
// public static void cancelBlockBreaking() { net.minecraft.client.network.ClientPlayerInteractionManager.cancelBlockBreaking(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.network.ClientPlayerInteractionManager.tick(); }
public boolean isFlyingLocked() { return wrapperContained.isFlyingLocked(); }
// public static boolean isFlyingLocked() { return net.minecraft.client.network.ClientPlayerInteractionManager.isFlyingLocked(); }
public yarnwrap.client.network.ClientPlayerEntity createPlayer(yarnwrap.client.world.ClientWorld world,yarnwrap.stat.StatHandler statHandler,yarnwrap.client.recipebook.ClientRecipeBook recipeBook) { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.createPlayer(world.wrapperContained,statHandler.wrapperContained,recipeBook.wrapperContained)); }
// public static yarnwrap.client.network.ClientPlayerEntity createPlayer(yarnwrap.client.world.ClientWorld world,yarnwrap.stat.StatHandler statHandler,yarnwrap.client.recipebook.ClientRecipeBook recipeBook, ) { return new yarnwrap.client.network.ClientPlayerEntity(net.minecraft.client.network.ClientPlayerInteractionManager.createPlayer(world.wrapperContained,statHandler.wrapperContained,recipeBook.wrapperContained)); }
public void setGameModes(yarnwrap.world.GameMode gameMode,yarnwrap.world.GameMode previousGameMode) { wrapperContained.setGameModes(gameMode.wrapperContained,previousGameMode.wrapperContained); }
// public static void setGameModes(yarnwrap.world.GameMode gameMode,yarnwrap.world.GameMode previousGameMode, ) { net.minecraft.client.network.ClientPlayerInteractionManager.setGameModes(gameMode.wrapperContained,previousGameMode.wrapperContained); }
// public yarnwrap.network.packet.Packet method_41929(yarnwrap.util.Hand sequence) { return new yarnwrap.network.packet.Packet(wrapperContained.method_41929(sequence.wrapperContained)); }
// public static yarnwrap.network.packet.Packet method_41929(yarnwrap.util.Hand sequence, ) { return new yarnwrap.network.packet.Packet(net.minecraft.client.network.ClientPlayerInteractionManager.method_41929(sequence.wrapperContained)); }
// public yarnwrap.network.packet.Packet method_41930(yarnwrap.block.BlockState sequence) { return new yarnwrap.network.packet.Packet(wrapperContained.method_41930(sequence.wrapperContained)); }
// public static yarnwrap.network.packet.Packet method_41930(yarnwrap.block.BlockState sequence, ) { return new yarnwrap.network.packet.Packet(net.minecraft.client.network.ClientPlayerInteractionManager.method_41930(sequence.wrapperContained)); }
// public void sendSequencedPacket(yarnwrap.client.world.ClientWorld world,yarnwrap.client.network.SequencedPacketCreator packetCreator) { wrapperContained.sendSequencedPacket(world.wrapperContained,packetCreator.wrapperContained); }
// public static void sendSequencedPacket(yarnwrap.client.world.ClientWorld world,yarnwrap.client.network.SequencedPacketCreator packetCreator, ) { net.minecraft.client.network.ClientPlayerInteractionManager.sendSequencedPacket(world.wrapperContained,packetCreator.wrapperContained); }
// public yarnwrap.network.packet.Packet method_41932(yarnwrap.util.math.BlockPos sequence) { return new yarnwrap.network.packet.Packet(wrapperContained.method_41932(sequence.wrapperContained)); }
// public static yarnwrap.network.packet.Packet method_41932(yarnwrap.util.math.BlockPos sequence, ) { return new yarnwrap.network.packet.Packet(net.minecraft.client.network.ClientPlayerInteractionManager.method_41932(sequence.wrapperContained)); }
// public yarnwrap.network.packet.Packet method_41933(org.apache.commons.lang3.mutable.MutableObject sequence) { return new yarnwrap.network.packet.Packet(wrapperContained.method_41933(sequence)); }
// public static yarnwrap.network.packet.Packet method_41933(org.apache.commons.lang3.mutable.MutableObject sequence, ) { return new yarnwrap.network.packet.Packet(net.minecraft.client.network.ClientPlayerInteractionManager.method_41933(sequence)); }
// public yarnwrap.util.ActionResult interactBlockInternal(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult) { return new yarnwrap.util.ActionResult(wrapperContained.interactBlockInternal(player.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactBlockInternal(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hitResult, ) { return new yarnwrap.util.ActionResult(net.minecraft.client.network.ClientPlayerInteractionManager.interactBlockInternal(player.wrapperContained,hand.wrapperContained,hitResult.wrapperContained)); }
// public yarnwrap.network.packet.Packet method_41935(yarnwrap.util.math.BlockPos sequence) { return new yarnwrap.network.packet.Packet(wrapperContained.method_41935(sequence.wrapperContained)); }
// public static yarnwrap.network.packet.Packet method_41935(yarnwrap.util.math.BlockPos sequence, ) { return new yarnwrap.network.packet.Packet(net.minecraft.client.network.ClientPlayerInteractionManager.method_41935(sequence.wrapperContained)); }
// public yarnwrap.network.packet.Packet method_41936(yarnwrap.util.math.BlockPos sequence) { return new yarnwrap.network.packet.Packet(wrapperContained.method_41936(sequence.wrapperContained)); }
// public static yarnwrap.network.packet.Packet method_41936(yarnwrap.util.math.BlockPos sequence, ) { return new yarnwrap.network.packet.Packet(net.minecraft.client.network.ClientPlayerInteractionManager.method_41936(sequence.wrapperContained)); }
public int getBlockBreakingProgress() { return wrapperContained.getBlockBreakingProgress(); }
// public static int getBlockBreakingProgress() { return net.minecraft.client.network.ClientPlayerInteractionManager.getBlockBreakingProgress(); }
public void slotChangedState(int slot,int screenHandlerId,boolean newState) { wrapperContained.slotChangedState(slot,screenHandlerId,newState); }
// public static void slotChangedState(int slot,int screenHandlerId,boolean newState, ) { net.minecraft.client.network.ClientPlayerInteractionManager.slotChangedState(slot,screenHandlerId,newState); }

}