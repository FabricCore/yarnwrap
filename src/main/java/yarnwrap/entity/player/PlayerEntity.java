package yarnwrap.entity.player;
public class PlayerEntity { public net.minecraft.entity.player.PlayerEntity wrapperContained; public PlayerEntity(net.minecraft.entity.player.PlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map POSE_DIMENSIONS() { return wrapperContained.POSE_DIMENSIONS; }
// public void POSE_DIMENSIONS(java.util.Map value) { wrapperContained.POSE_DIMENSIONS = value; }
public yarnwrap.entity.EntityDimensions STANDING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.STANDING_DIMENSIONS); }
// public void STANDING_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.STANDING_DIMENSIONS = value.wrapperContained; }
// public long shoulderEntityAddedTime() { return wrapperContained.shoulderEntityAddedTime; }
// public void shoulderEntityAddedTime(long value) { wrapperContained.shoulderEntityAddedTime = value; }
public float DEFAULT_EYE_HEIGHT() { return wrapperContained.DEFAULT_EYE_HEIGHT; }
// public void DEFAULT_EYE_HEIGHT(float value) { wrapperContained.DEFAULT_EYE_HEIGHT = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Optional lastDeathPos() { return wrapperContained.lastDeathPos; }
// public void lastDeathPos(java.util.Optional value) { wrapperContained.lastDeathPos = value; }
// public float damageTiltYaw() { return wrapperContained.damageTiltYaw; }
// public void damageTiltYaw(float value) { wrapperContained.damageTiltYaw = value; }
public yarnwrap.util.Arm DEFAULT_MAIN_ARM() { return new yarnwrap.util.Arm(wrapperContained.DEFAULT_MAIN_ARM); }
// public void DEFAULT_MAIN_ARM(yarnwrap.util.Arm value) { wrapperContained.DEFAULT_MAIN_ARM = value.wrapperContained; }
public yarnwrap.util.math.Vec3d VEHICLE_ATTACHMENT_POS() { return new yarnwrap.util.math.Vec3d(wrapperContained.VEHICLE_ATTACHMENT_POS); }
// public void VEHICLE_ATTACHMENT_POS(yarnwrap.util.math.Vec3d value) { wrapperContained.VEHICLE_ATTACHMENT_POS = value.wrapperContained; }
public yarnwrap.util.math.Vec3d currentExplosionImpactPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.currentExplosionImpactPos); }
public void currentExplosionImpactPos(yarnwrap.util.math.Vec3d value) { wrapperContained.currentExplosionImpactPos = value.wrapperContained; }
public yarnwrap.entity.Entity explodedBy() { return new yarnwrap.entity.Entity(wrapperContained.explodedBy); }
public void explodedBy(yarnwrap.entity.Entity value) { wrapperContained.explodedBy = value.wrapperContained; }
// public boolean ignoreFallDamageFromCurrentExplosion() { return wrapperContained.ignoreFallDamageFromCurrentExplosion; }
// public void ignoreFallDamageFromCurrentExplosion(boolean value) { wrapperContained.ignoreFallDamageFromCurrentExplosion = value; }
// public int currentExplosionResetGraceTime() { return wrapperContained.currentExplosionResetGraceTime; }
// public void currentExplosionResetGraceTime(int value) { wrapperContained.currentExplosionResetGraceTime = value; }
public float strideDistance() { return wrapperContained.strideDistance; }
public void strideDistance(float value) { wrapperContained.strideDistance = value; }
// public yarnwrap.entity.player.ItemCooldownManager itemCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(wrapperContained.itemCooldownManager); }
// public void itemCooldownManager(yarnwrap.entity.player.ItemCooldownManager value) { wrapperContained.itemCooldownManager = value.wrapperContained; }
// public yarnwrap.inventory.EnderChestInventory enderChestInventory() { return new yarnwrap.inventory.EnderChestInventory(wrapperContained.enderChestInventory); }
// public void enderChestInventory(yarnwrap.inventory.EnderChestInventory value) { wrapperContained.enderChestInventory = value.wrapperContained; }
// public int sleepTimer() { return wrapperContained.sleepTimer; }
// public void sleepTimer(int value) { wrapperContained.sleepTimer = value; }
// public yarnwrap.entity.data.TrackedData MAIN_ARM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MAIN_ARM); }
// public void MAIN_ARM(yarnwrap.entity.data.TrackedData value) { wrapperContained.MAIN_ARM = value.wrapperContained; }
// public int abilityResyncCountdown() { return wrapperContained.abilityResyncCountdown; }
// public void abilityResyncCountdown(int value) { wrapperContained.abilityResyncCountdown = value; }
// public boolean isSubmergedInWater() { return wrapperContained.isSubmergedInWater; }
// public void isSubmergedInWater(boolean value) { wrapperContained.isSubmergedInWater = value; }
// public yarnwrap.entity.data.TrackedData ABSORPTION_AMOUNT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ABSORPTION_AMOUNT); }
// public void ABSORPTION_AMOUNT(yarnwrap.entity.data.TrackedData value) { wrapperContained.ABSORPTION_AMOUNT = value.wrapperContained; }
// public yarnwrap.entity.player.HungerManager hungerManager() { return new yarnwrap.entity.player.HungerManager(wrapperContained.hungerManager); }
// public void hungerManager(yarnwrap.entity.player.HungerManager value) { wrapperContained.hungerManager = value.wrapperContained; }
// public int enchantmentTableSeed() { return wrapperContained.enchantmentTableSeed; }
// public void enchantmentTableSeed(int value) { wrapperContained.enchantmentTableSeed = value; }
public int totalExperience() { return wrapperContained.totalExperience; }
public void totalExperience(int value) { wrapperContained.totalExperience = value; }
// public yarnwrap.entity.data.TrackedData LEFT_SHOULDER_ENTITY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LEFT_SHOULDER_ENTITY); }
// public void LEFT_SHOULDER_ENTITY(yarnwrap.entity.data.TrackedData value) { wrapperContained.LEFT_SHOULDER_ENTITY = value.wrapperContained; }
public yarnwrap.screen.PlayerScreenHandler playerScreenHandler() { return new yarnwrap.screen.PlayerScreenHandler(wrapperContained.playerScreenHandler); }
// public void playerScreenHandler(yarnwrap.screen.PlayerScreenHandler value) { wrapperContained.playerScreenHandler = value.wrapperContained; }
public double capeZ() { return wrapperContained.capeZ; }
public void capeZ(double value) { wrapperContained.capeZ = value; }
public double capeX() { return wrapperContained.capeX; }
public void capeX(double value) { wrapperContained.capeX = value; }
public double prevCapeY() { return wrapperContained.prevCapeY; }
public void prevCapeY(double value) { wrapperContained.prevCapeY = value; }
// public yarnwrap.entity.player.PlayerAbilities abilities() { return new yarnwrap.entity.player.PlayerAbilities(wrapperContained.abilities); }
// public void abilities(yarnwrap.entity.player.PlayerAbilities value) { wrapperContained.abilities = value.wrapperContained; }
public int experiencePickUpDelay() { return wrapperContained.experiencePickUpDelay; }
public void experiencePickUpDelay(int value) { wrapperContained.experiencePickUpDelay = value; }
public float prevStrideDistance() { return wrapperContained.prevStrideDistance; }
public void prevStrideDistance(float value) { wrapperContained.prevStrideDistance = value; }
// public yarnwrap.entity.data.TrackedData RIGHT_SHOULDER_ENTITY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RIGHT_SHOULDER_ENTITY); }
// public void RIGHT_SHOULDER_ENTITY(yarnwrap.entity.data.TrackedData value) { wrapperContained.RIGHT_SHOULDER_ENTITY = value.wrapperContained; }
// public com.mojang.authlib.GameProfile gameProfile() { return wrapperContained.gameProfile; }
// public void gameProfile(com.mojang.authlib.GameProfile value) { wrapperContained.gameProfile = value; }
// public int lastPlayedLevelUpSoundTime() { return wrapperContained.lastPlayedLevelUpSoundTime; }
// public void lastPlayedLevelUpSoundTime(int value) { wrapperContained.lastPlayedLevelUpSoundTime = value; }
public float experienceProgress() { return wrapperContained.experienceProgress; }
public void experienceProgress(float value) { wrapperContained.experienceProgress = value; }
// public yarnwrap.entity.data.TrackedData SCORE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SCORE); }
// public void SCORE(yarnwrap.entity.data.TrackedData value) { wrapperContained.SCORE = value.wrapperContained; }
public yarnwrap.screen.ScreenHandler currentScreenHandler() { return new yarnwrap.screen.ScreenHandler(wrapperContained.currentScreenHandler); }
public void currentScreenHandler(yarnwrap.screen.ScreenHandler value) { wrapperContained.currentScreenHandler = value.wrapperContained; }
public yarnwrap.entity.projectile.FishingBobberEntity fishHook() { return new yarnwrap.entity.projectile.FishingBobberEntity(wrapperContained.fishHook); }
public void fishHook(yarnwrap.entity.projectile.FishingBobberEntity value) { wrapperContained.fishHook = value.wrapperContained; }
// public yarnwrap.entity.player.PlayerInventory inventory() { return new yarnwrap.entity.player.PlayerInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.entity.player.PlayerInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData PLAYER_MODEL_PARTS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PLAYER_MODEL_PARTS); }
// public void PLAYER_MODEL_PARTS(yarnwrap.entity.data.TrackedData value) { wrapperContained.PLAYER_MODEL_PARTS = value.wrapperContained; }
public int experienceLevel() { return wrapperContained.experienceLevel; }
public void experienceLevel(int value) { wrapperContained.experienceLevel = value; }
public double capeY() { return wrapperContained.capeY; }
public void capeY(double value) { wrapperContained.capeY = value; }
public double prevCapeZ() { return wrapperContained.prevCapeZ; }
public void prevCapeZ(double value) { wrapperContained.prevCapeZ = value; }
// public boolean reducedDebugInfo() { return wrapperContained.reducedDebugInfo; }
// public void reducedDebugInfo(boolean value) { wrapperContained.reducedDebugInfo = value; }
public double prevCapeX() { return wrapperContained.prevCapeX; }
public void prevCapeX(double value) { wrapperContained.prevCapeX = value; }
// public yarnwrap.item.ItemStack selectedItem() { return new yarnwrap.item.ItemStack(wrapperContained.selectedItem); }
// public void selectedItem(yarnwrap.item.ItemStack value) { wrapperContained.selectedItem = value.wrapperContained; }
// public void onHandledScreenClosed() { wrapperContained.onHandledScreenClosed(); }
public void openJigsawScreen(yarnwrap.block.entity.JigsawBlockEntity jigsaw) { wrapperContained.openJigsawScreen(jigsaw.wrapperContained); }
public void sendTradeOffers(int syncId,yarnwrap.village.TradeOfferList offers,int levelProgress,int experience,boolean leveled,boolean refreshable) { wrapperContained.sendTradeOffers(syncId,offers.wrapperContained,levelProgress,experience,leveled,refreshable); }
public java.util.OptionalInt openHandledScreen(yarnwrap.screen.NamedScreenHandlerFactory factory) { return wrapperContained.openHandledScreen(factory.wrapperContained); }
public void playSoundToPlayer(yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSoundToPlayer(sound.wrapperContained,category.wrapperContained,volume,pitch); }
public boolean isBlockBreakingRestricted(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.GameMode gameMode) { return wrapperContained.isBlockBreakingRestricted(world.wrapperContained,pos.wrapperContained,gameMode.wrapperContained); }
public boolean shouldCancelInteraction() { return wrapperContained.shouldCancelInteraction(); }
// public boolean shouldDismount() { return wrapperContained.shouldDismount(); }
// public boolean clipAtLedge() { return wrapperContained.clipAtLedge(); }
public boolean checkFallFlying() { return wrapperContained.checkFallFlying(); }
public void startFallFlying() { wrapperContained.startFallFlying(); }
public void stopFallFlying() { wrapperContained.stopFallFlying(); }
public Object createPlayerAttributes() { return wrapperContained.createPlayerAttributes(); }
public yarnwrap.entity.player.PlayerInventory getInventory() { return new yarnwrap.entity.player.PlayerInventory(wrapperContained.getInventory()); }
public yarnwrap.entity.player.PlayerAbilities getAbilities() { return new yarnwrap.entity.player.PlayerAbilities(wrapperContained.getAbilities()); }
public boolean isUsingSpyglass() { return wrapperContained.isUsingSpyglass(); }
public void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType) { wrapperContained.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }
public boolean shouldFilterText() { return wrapperContained.shouldFilterText(); }
public void useRiptide(int riptideTicks,float riptideAttackDamage,yarnwrap.item.ItemStack stack) { wrapperContained.useRiptide(riptideTicks,riptideAttackDamage,stack.wrapperContained); }
public java.util.Optional getSculkShriekerWarningManager() { return wrapperContained.getSculkShriekerWarningManager(); }
public void setLastDeathPos(java.util.Optional lastDeathPos) { wrapperContained.setLastDeathPos(lastDeathPos); }
public java.util.Optional getLastDeathPos() { return wrapperContained.getLastDeathPos(); }
public boolean shouldCloseHandledScreenOnRespawn() { return wrapperContained.shouldCloseHandledScreenOnRespawn(); }
public void onRecipeCrafted(yarnwrap.recipe.RecipeEntry recipe,java.util.List ingredients) { wrapperContained.onRecipeCrafted(recipe.wrapperContained,ingredients); }
// public boolean canChangeIntoPose(yarnwrap.entity.EntityPose pose) { return wrapperContained.canChangeIntoPose(pose.wrapperContained); }
public double getBlockInteractionRange() { return wrapperContained.getBlockInteractionRange(); }
public double getEntityInteractionRange() { return wrapperContained.getEntityInteractionRange(); }
public boolean canInteractWithEntityIn(yarnwrap.util.math.Box box,double additionalRange) { return wrapperContained.canInteractWithEntityIn(box.wrapperContained,additionalRange); }
public boolean canInteractWithBlockAt(yarnwrap.util.math.BlockPos pos,double additionalRange) { return wrapperContained.canInteractWithBlockAt(pos.wrapperContained,additionalRange); }
public boolean canInteractWithEntity(yarnwrap.entity.Entity entity,double additionalRange) { return wrapperContained.canInteractWithEntity(entity.wrapperContained,additionalRange); }
public void clearCurrentExplosion() { wrapperContained.clearCurrentExplosion(); }
// public boolean isSpaceAroundPlayerEmpty(double offsetX,double offsetZ) { return wrapperContained.isSpaceAroundPlayerEmpty(offsetX,offsetZ); }
// public float getDamageAgainst(yarnwrap.entity.Entity target,float baseDamage,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.getDamageAgainst(target.wrapperContained,baseDamage,damageSource.wrapperContained); }
public void tryClearCurrentExplosion() { wrapperContained.tryClearCurrentExplosion(); }
public void setIgnoreFallDamageFromCurrentExplosion(boolean ignoreFallDamageFromCurrentExplosion) { wrapperContained.setIgnoreFallDamageFromCurrentExplosion(ignoreFallDamageFromCurrentExplosion); }
public boolean shouldIgnoreFallDamageFromCurrentExplosion() { return wrapperContained.shouldIgnoreFallDamageFromCurrentExplosion(); }
public int unlockRecipes(java.util.Collection recipes) { return wrapperContained.unlockRecipes(recipes); }
public void addExperience(int experience) { wrapperContained.addExperience(experience); }
public boolean shouldDamagePlayer(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.shouldDamagePlayer(player.wrapperContained); }
public void openCommandBlockMinecartScreen(yarnwrap.world.CommandBlockExecutor commandBlockExecutor) { wrapperContained.openCommandBlockMinecartScreen(commandBlockExecutor.wrapperContained); }
public void incrementStat(yarnwrap.stat.Stat stat) { wrapperContained.incrementStat(stat.wrapperContained); }
public float getAttackCooldownProgress(float baseTime) { return wrapperContained.getAttackCooldownProgress(baseTime); }
// public void dropShoulderEntities() { wrapperContained.dropShoulderEntities(); }
public void spawnSweepAttackParticles() { wrapperContained.spawnSweepAttackParticles(); }
// public yarnwrap.entity.player.ItemCooldownManager createCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(wrapperContained.createCooldownManager()); }
public void resetStat(yarnwrap.stat.Stat stat) { wrapperContained.resetStat(stat.wrapperContained); }
// public void updateShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.updateShoulderEntity(entityNbt.wrapperContained); }
public void setReducedDebugInfo(boolean reducedDebugInfo) { wrapperContained.setReducedDebugInfo(reducedDebugInfo); }
public com.mojang.datafixers.util.Either trySleep(yarnwrap.util.math.BlockPos pos) { return wrapperContained.trySleep(pos.wrapperContained); }
public boolean giveItemStack(yarnwrap.item.ItemStack stack) { return wrapperContained.giveItemStack(stack.wrapperContained); }
public int getScore() { return wrapperContained.getScore(); }
// public void setShoulderEntityLeft(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.setShoulderEntityLeft(entityNbt.wrapperContained); }
public yarnwrap.inventory.EnderChestInventory getEnderChestInventory() { return new yarnwrap.inventory.EnderChestInventory(wrapperContained.getEnderChestInventory()); }
public boolean canResetTimeBySleeping() { return wrapperContained.canResetTimeBySleeping(); }
public void addCritParticles(yarnwrap.entity.Entity target) { wrapperContained.addCritParticles(target.wrapperContained); }
public int getEnchantmentTableSeed() { return wrapperContained.getEnchantmentTableSeed(); }
public float getAttackCooldownProgressPerTick() { return wrapperContained.getAttackCooldownProgressPerTick(); }
public void incrementStat(yarnwrap.util.Identifier stat) { wrapperContained.incrementStat(stat.wrapperContained); }
public void setMainArm(yarnwrap.util.Arm arm) { wrapperContained.setMainArm(arm.wrapperContained); }
public void disableShield() { wrapperContained.disableShield(); }
public void addScore(int score) { wrapperContained.addScore(score); }
public void applyEnchantmentCosts(yarnwrap.item.ItemStack enchantedItem,int experienceLevels) { wrapperContained.applyEnchantmentCosts(enchantedItem.wrapperContained,experienceLevels); }
public yarnwrap.util.ActionResult interact(yarnwrap.entity.Entity entity,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interact(entity.wrapperContained,hand.wrapperContained)); }
public void openHorseInventory(yarnwrap.entity.passive.AbstractHorseEntity horse,yarnwrap.inventory.Inventory inventory) { wrapperContained.openHorseInventory(horse.wrapperContained,inventory.wrapperContained); }
public float getLuck() { return wrapperContained.getLuck(); }
// public void vanishCursedItems() { wrapperContained.vanishCursedItems(); }
public boolean canModifyBlocks() { return wrapperContained.canModifyBlocks(); }
// public boolean updateWaterSubmersionState() { return wrapperContained.updateWaterSubmersionState(); }
// public void dropShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.dropShoulderEntity(entityNbt.wrapperContained); }
public int getSleepTimer() { return wrapperContained.getSleepTimer(); }
public boolean addShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt) { return wrapperContained.addShoulderEntity(entityNbt.wrapperContained); }
// public yarnwrap.text.MutableText addTellClickEvent(yarnwrap.text.MutableText component) { return new yarnwrap.text.MutableText(wrapperContained.addTellClickEvent(component.wrapperContained)); }
public boolean hasReducedDebugInfo() { return wrapperContained.hasReducedDebugInfo(); }
public void openStructureBlockScreen(yarnwrap.block.entity.StructureBlockBlockEntity structureBlock) { wrapperContained.openStructureBlockScreen(structureBlock.wrapperContained); }
public void addEnchantedHitParticles(yarnwrap.entity.Entity target) { wrapperContained.addEnchantedHitParticles(target.wrapperContained); }
public boolean canHarvest(yarnwrap.block.BlockState state) { return wrapperContained.canHarvest(state.wrapperContained); }
public yarnwrap.nbt.NbtCompound getShoulderEntityRight() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getShoulderEntityRight()); }
public void openEditSignScreen(yarnwrap.block.entity.SignBlockEntity sign,boolean front) { wrapperContained.openEditSignScreen(sign.wrapperContained,front); }
// public void updateCapeAngles() { wrapperContained.updateCapeAngles(); }
public void useBook(yarnwrap.item.ItemStack book,yarnwrap.util.Hand hand) { wrapperContained.useBook(book.wrapperContained,hand.wrapperContained); }
public void addExperienceLevels(int levels) { wrapperContained.addExperienceLevels(levels); }
public boolean canFoodHeal() { return wrapperContained.canFoodHeal(); }
// public void updatePose() { wrapperContained.updatePose(); }
public void setScore(int score) { wrapperContained.setScore(score); }
public void addExhaustion(float exhaustion) { wrapperContained.addExhaustion(exhaustion); }
public void openCommandBlockScreen(yarnwrap.block.entity.CommandBlockBlockEntity commandBlock) { wrapperContained.openCommandBlockScreen(commandBlock.wrapperContained); }
public void attack(yarnwrap.entity.Entity target) { wrapperContained.attack(target.wrapperContained); }
// public boolean doesNotSuffocate(yarnwrap.util.math.BlockPos pos) { return wrapperContained.doesNotSuffocate(pos.wrapperContained); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemStack stack,boolean retainOwnership) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(stack.wrapperContained,retainOwnership)); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemStack stack,boolean throwRandomly,boolean retainOwnership) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(stack.wrapperContained,throwRandomly,retainOwnership)); }
// public void updateTurtleHelmet() { wrapperContained.updateTurtleHelmet(); }
public void requestRespawn() { wrapperContained.requestRespawn(); }
public boolean canConsume(boolean ignoreHunger) { return wrapperContained.canConsume(ignoreHunger); }
public int lockRecipes(java.util.Collection recipes) { return wrapperContained.lockRecipes(recipes); }
public com.mojang.authlib.GameProfile getGameProfile() { return wrapperContained.getGameProfile(); }
// public void unlockRecipes(java.util.List recipes) { wrapperContained.unlockRecipes(recipes); }
public boolean isCreative() { return wrapperContained.isCreative(); }
public boolean isCreativeLevelTwoOp() { return wrapperContained.isCreativeLevelTwoOp(); }
public void increaseStat(yarnwrap.util.Identifier stat,int amount) { wrapperContained.increaseStat(stat.wrapperContained,amount); }
public boolean isMainPlayer() { return wrapperContained.isMainPlayer(); }
// public void collideWithEntity(yarnwrap.entity.Entity entity) { wrapperContained.collideWithEntity(entity.wrapperContained); }
public void increaseStat(yarnwrap.stat.Stat stat,int amount) { wrapperContained.increaseStat(stat.wrapperContained,amount); }
public boolean canPlaceOn(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing,yarnwrap.item.ItemStack stack) { return wrapperContained.canPlaceOn(pos.wrapperContained,facing.wrapperContained,stack.wrapperContained); }
public yarnwrap.entity.player.HungerManager getHungerManager() { return new yarnwrap.entity.player.HungerManager(wrapperContained.getHungerManager()); }
// public void setShoulderEntityRight(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.setShoulderEntityRight(entityNbt.wrapperContained); }
// public void closeHandledScreen() { wrapperContained.closeHandledScreen(); }
public boolean isPartVisible(yarnwrap.entity.player.PlayerModelPart modelPart) { return wrapperContained.isPartVisible(modelPart.wrapperContained); }
public int getNextLevelExperience() { return wrapperContained.getNextLevelExperience(); }
public void resetLastAttackedTicks() { wrapperContained.resetLastAttackedTicks(); }
public float getBlockBreakingSpeed(yarnwrap.block.BlockState block) { return wrapperContained.getBlockBreakingSpeed(block.wrapperContained); }
public void sendMessage(yarnwrap.text.Text message,boolean overlay) { wrapperContained.sendMessage(message.wrapperContained,overlay); }
public void sendAbilitiesUpdate() { wrapperContained.sendAbilitiesUpdate(); }
public yarnwrap.nbt.NbtCompound getShoulderEntityLeft() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getShoulderEntityLeft()); }
public yarnwrap.entity.player.ItemCooldownManager getItemCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(wrapperContained.getItemCooldownManager()); }
public void wakeUp(boolean skipSleepTimer,boolean updateSleepingPlayers) { wrapperContained.wakeUp(skipSleepTimer,updateSleepingPlayers); }

}