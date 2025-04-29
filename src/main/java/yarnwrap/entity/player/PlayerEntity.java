package yarnwrap.entity.player;
public class PlayerEntity { public net.minecraft.entity.player.PlayerEntity wrapperContained; public PlayerEntity(net.minecraft.entity.player.PlayerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map POSE_DIMENSIONS() { return wrapperContained.POSE_DIMENSIONS; }
// public void POSE_DIMENSIONS(java.util.Map value) { wrapperContained.POSE_DIMENSIONS = value; }
// public static java.util.Map POSE_DIMENSIONS() { return net.minecraft.entity.player.PlayerEntity.POSE_DIMENSIONS; }
// public static void POSE_DIMENSIONS(java.util.Map value, ) { net.minecraft.entity.player.PlayerEntity.POSE_DIMENSIONS = value; }

// public yarnwrap.entity.EntityDimensions STANDING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.STANDING_DIMENSIONS); }
// public void STANDING_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.STANDING_DIMENSIONS = value.wrapperContained; }
public static yarnwrap.entity.EntityDimensions STANDING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.player.PlayerEntity.STANDING_DIMENSIONS); }
// public static void STANDING_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.player.PlayerEntity.STANDING_DIMENSIONS = value.wrapperContained; }

// public long shoulderEntityAddedTime() { return wrapperContained.shoulderEntityAddedTime; }
// public void shoulderEntityAddedTime(long value) { wrapperContained.shoulderEntityAddedTime = value; }
// public static long shoulderEntityAddedTime() { return net.minecraft.entity.player.PlayerEntity.shoulderEntityAddedTime; }
// public static void shoulderEntityAddedTime(long value, ) { net.minecraft.entity.player.PlayerEntity.shoulderEntityAddedTime = value; }

// public float DEFAULT_EYE_HEIGHT() { return wrapperContained.DEFAULT_EYE_HEIGHT; }
// public void DEFAULT_EYE_HEIGHT(float value) { wrapperContained.DEFAULT_EYE_HEIGHT = value; }
public static float DEFAULT_EYE_HEIGHT() { return net.minecraft.entity.player.PlayerEntity.DEFAULT_EYE_HEIGHT; }
// public static void DEFAULT_EYE_HEIGHT(float value, ) { net.minecraft.entity.player.PlayerEntity.DEFAULT_EYE_HEIGHT = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.player.PlayerEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.player.PlayerEntity.LOGGER = value; }

// public java.util.Optional lastDeathPos() { return wrapperContained.lastDeathPos; }
// public void lastDeathPos(java.util.Optional value) { wrapperContained.lastDeathPos = value; }
// public static java.util.Optional lastDeathPos() { return net.minecraft.entity.player.PlayerEntity.lastDeathPos; }
// public static void lastDeathPos(java.util.Optional value, ) { net.minecraft.entity.player.PlayerEntity.lastDeathPos = value; }

// public float damageTiltYaw() { return wrapperContained.damageTiltYaw; }
// public void damageTiltYaw(float value) { wrapperContained.damageTiltYaw = value; }
// public static float damageTiltYaw() { return net.minecraft.entity.player.PlayerEntity.damageTiltYaw; }
// public static void damageTiltYaw(float value, ) { net.minecraft.entity.player.PlayerEntity.damageTiltYaw = value; }

// public yarnwrap.util.Arm DEFAULT_MAIN_ARM() { return new yarnwrap.util.Arm(wrapperContained.DEFAULT_MAIN_ARM); }
// public void DEFAULT_MAIN_ARM(yarnwrap.util.Arm value) { wrapperContained.DEFAULT_MAIN_ARM = value.wrapperContained; }
public static yarnwrap.util.Arm DEFAULT_MAIN_ARM() { return new yarnwrap.util.Arm(net.minecraft.entity.player.PlayerEntity.DEFAULT_MAIN_ARM); }
// public static void DEFAULT_MAIN_ARM(yarnwrap.util.Arm value, ) { net.minecraft.entity.player.PlayerEntity.DEFAULT_MAIN_ARM = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d VEHICLE_ATTACHMENT_POS() { return new yarnwrap.util.math.Vec3d(wrapperContained.VEHICLE_ATTACHMENT_POS); }
// public void VEHICLE_ATTACHMENT_POS(yarnwrap.util.math.Vec3d value) { wrapperContained.VEHICLE_ATTACHMENT_POS = value.wrapperContained; }
public static yarnwrap.util.math.Vec3d VEHICLE_ATTACHMENT_POS() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.player.PlayerEntity.VEHICLE_ATTACHMENT_POS); }
// public static void VEHICLE_ATTACHMENT_POS(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.player.PlayerEntity.VEHICLE_ATTACHMENT_POS = value.wrapperContained; }

public yarnwrap.util.math.Vec3d currentExplosionImpactPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.currentExplosionImpactPos); }
public void currentExplosionImpactPos(yarnwrap.util.math.Vec3d value) { wrapperContained.currentExplosionImpactPos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d currentExplosionImpactPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.player.PlayerEntity.currentExplosionImpactPos); }
// public static void currentExplosionImpactPos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.player.PlayerEntity.currentExplosionImpactPos = value.wrapperContained; }

public yarnwrap.entity.Entity explodedBy() { return new yarnwrap.entity.Entity(wrapperContained.explodedBy); }
public void explodedBy(yarnwrap.entity.Entity value) { wrapperContained.explodedBy = value.wrapperContained; }
// public static yarnwrap.entity.Entity explodedBy() { return new yarnwrap.entity.Entity(net.minecraft.entity.player.PlayerEntity.explodedBy); }
// public static void explodedBy(yarnwrap.entity.Entity value, ) { net.minecraft.entity.player.PlayerEntity.explodedBy = value.wrapperContained; }

// public boolean ignoreFallDamageFromCurrentExplosion() { return wrapperContained.ignoreFallDamageFromCurrentExplosion; }
// public void ignoreFallDamageFromCurrentExplosion(boolean value) { wrapperContained.ignoreFallDamageFromCurrentExplosion = value; }
// public static boolean ignoreFallDamageFromCurrentExplosion() { return net.minecraft.entity.player.PlayerEntity.ignoreFallDamageFromCurrentExplosion; }
// public static void ignoreFallDamageFromCurrentExplosion(boolean value, ) { net.minecraft.entity.player.PlayerEntity.ignoreFallDamageFromCurrentExplosion = value; }

// public int currentExplosionResetGraceTime() { return wrapperContained.currentExplosionResetGraceTime; }
// public void currentExplosionResetGraceTime(int value) { wrapperContained.currentExplosionResetGraceTime = value; }
// public static int currentExplosionResetGraceTime() { return net.minecraft.entity.player.PlayerEntity.currentExplosionResetGraceTime; }
// public static void currentExplosionResetGraceTime(int value, ) { net.minecraft.entity.player.PlayerEntity.currentExplosionResetGraceTime = value; }

public float strideDistance() { return wrapperContained.strideDistance; }
public void strideDistance(float value) { wrapperContained.strideDistance = value; }
// public static float strideDistance() { return net.minecraft.entity.player.PlayerEntity.strideDistance; }
// public static void strideDistance(float value, ) { net.minecraft.entity.player.PlayerEntity.strideDistance = value; }

// public yarnwrap.entity.player.ItemCooldownManager itemCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(wrapperContained.itemCooldownManager); }
// public void itemCooldownManager(yarnwrap.entity.player.ItemCooldownManager value) { wrapperContained.itemCooldownManager = value.wrapperContained; }
// public static yarnwrap.entity.player.ItemCooldownManager itemCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(net.minecraft.entity.player.PlayerEntity.itemCooldownManager); }
// public static void itemCooldownManager(yarnwrap.entity.player.ItemCooldownManager value, ) { net.minecraft.entity.player.PlayerEntity.itemCooldownManager = value.wrapperContained; }

// public yarnwrap.inventory.EnderChestInventory enderChestInventory() { return new yarnwrap.inventory.EnderChestInventory(wrapperContained.enderChestInventory); }
// public void enderChestInventory(yarnwrap.inventory.EnderChestInventory value) { wrapperContained.enderChestInventory = value.wrapperContained; }
// public static yarnwrap.inventory.EnderChestInventory enderChestInventory() { return new yarnwrap.inventory.EnderChestInventory(net.minecraft.entity.player.PlayerEntity.enderChestInventory); }
// public static void enderChestInventory(yarnwrap.inventory.EnderChestInventory value, ) { net.minecraft.entity.player.PlayerEntity.enderChestInventory = value.wrapperContained; }

// public int sleepTimer() { return wrapperContained.sleepTimer; }
// public void sleepTimer(int value) { wrapperContained.sleepTimer = value; }
// public static int sleepTimer() { return net.minecraft.entity.player.PlayerEntity.sleepTimer; }
// public static void sleepTimer(int value, ) { net.minecraft.entity.player.PlayerEntity.sleepTimer = value; }

// public yarnwrap.entity.data.TrackedData MAIN_ARM() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MAIN_ARM); }
// public void MAIN_ARM(yarnwrap.entity.data.TrackedData value) { wrapperContained.MAIN_ARM = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData MAIN_ARM() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.player.PlayerEntity.MAIN_ARM); }
// public static void MAIN_ARM(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.player.PlayerEntity.MAIN_ARM = value.wrapperContained; }

// public int abilityResyncCountdown() { return wrapperContained.abilityResyncCountdown; }
// public void abilityResyncCountdown(int value) { wrapperContained.abilityResyncCountdown = value; }
// public static int abilityResyncCountdown() { return net.minecraft.entity.player.PlayerEntity.abilityResyncCountdown; }
// public static void abilityResyncCountdown(int value, ) { net.minecraft.entity.player.PlayerEntity.abilityResyncCountdown = value; }

// public boolean isSubmergedInWater() { return wrapperContained.isSubmergedInWater; }
// public void isSubmergedInWater(boolean value) { wrapperContained.isSubmergedInWater = value; }
// public static boolean isSubmergedInWater() { return net.minecraft.entity.player.PlayerEntity.isSubmergedInWater; }
// public static void isSubmergedInWater(boolean value, ) { net.minecraft.entity.player.PlayerEntity.isSubmergedInWater = value; }

// public yarnwrap.entity.data.TrackedData ABSORPTION_AMOUNT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ABSORPTION_AMOUNT); }
// public void ABSORPTION_AMOUNT(yarnwrap.entity.data.TrackedData value) { wrapperContained.ABSORPTION_AMOUNT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ABSORPTION_AMOUNT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.player.PlayerEntity.ABSORPTION_AMOUNT); }
// public static void ABSORPTION_AMOUNT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.player.PlayerEntity.ABSORPTION_AMOUNT = value.wrapperContained; }

// public yarnwrap.entity.player.HungerManager hungerManager() { return new yarnwrap.entity.player.HungerManager(wrapperContained.hungerManager); }
// public void hungerManager(yarnwrap.entity.player.HungerManager value) { wrapperContained.hungerManager = value.wrapperContained; }
// public static yarnwrap.entity.player.HungerManager hungerManager() { return new yarnwrap.entity.player.HungerManager(net.minecraft.entity.player.PlayerEntity.hungerManager); }
// public static void hungerManager(yarnwrap.entity.player.HungerManager value, ) { net.minecraft.entity.player.PlayerEntity.hungerManager = value.wrapperContained; }

// public int enchantmentTableSeed() { return wrapperContained.enchantmentTableSeed; }
// public void enchantmentTableSeed(int value) { wrapperContained.enchantmentTableSeed = value; }
// public static int enchantmentTableSeed() { return net.minecraft.entity.player.PlayerEntity.enchantmentTableSeed; }
// public static void enchantmentTableSeed(int value, ) { net.minecraft.entity.player.PlayerEntity.enchantmentTableSeed = value; }

public int totalExperience() { return wrapperContained.totalExperience; }
public void totalExperience(int value) { wrapperContained.totalExperience = value; }
// public static int totalExperience() { return net.minecraft.entity.player.PlayerEntity.totalExperience; }
// public static void totalExperience(int value, ) { net.minecraft.entity.player.PlayerEntity.totalExperience = value; }

// public yarnwrap.entity.data.TrackedData LEFT_SHOULDER_ENTITY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LEFT_SHOULDER_ENTITY); }
// public void LEFT_SHOULDER_ENTITY(yarnwrap.entity.data.TrackedData value) { wrapperContained.LEFT_SHOULDER_ENTITY = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData LEFT_SHOULDER_ENTITY() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.player.PlayerEntity.LEFT_SHOULDER_ENTITY); }
// public static void LEFT_SHOULDER_ENTITY(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.player.PlayerEntity.LEFT_SHOULDER_ENTITY = value.wrapperContained; }

public yarnwrap.screen.PlayerScreenHandler playerScreenHandler() { return new yarnwrap.screen.PlayerScreenHandler(wrapperContained.playerScreenHandler); }
// public void playerScreenHandler(yarnwrap.screen.PlayerScreenHandler value) { wrapperContained.playerScreenHandler = value.wrapperContained; }
// public static yarnwrap.screen.PlayerScreenHandler playerScreenHandler() { return new yarnwrap.screen.PlayerScreenHandler(net.minecraft.entity.player.PlayerEntity.playerScreenHandler); }
// public static void playerScreenHandler(yarnwrap.screen.PlayerScreenHandler value, ) { net.minecraft.entity.player.PlayerEntity.playerScreenHandler = value.wrapperContained; }

public double capeZ() { return wrapperContained.capeZ; }
public void capeZ(double value) { wrapperContained.capeZ = value; }
// public static double capeZ() { return net.minecraft.entity.player.PlayerEntity.capeZ; }
// public static void capeZ(double value, ) { net.minecraft.entity.player.PlayerEntity.capeZ = value; }

public double capeX() { return wrapperContained.capeX; }
public void capeX(double value) { wrapperContained.capeX = value; }
// public static double capeX() { return net.minecraft.entity.player.PlayerEntity.capeX; }
// public static void capeX(double value, ) { net.minecraft.entity.player.PlayerEntity.capeX = value; }

public double prevCapeY() { return wrapperContained.prevCapeY; }
public void prevCapeY(double value) { wrapperContained.prevCapeY = value; }
// public static double prevCapeY() { return net.minecraft.entity.player.PlayerEntity.prevCapeY; }
// public static void prevCapeY(double value, ) { net.minecraft.entity.player.PlayerEntity.prevCapeY = value; }

// public yarnwrap.entity.player.PlayerAbilities abilities() { return new yarnwrap.entity.player.PlayerAbilities(wrapperContained.abilities); }
// public void abilities(yarnwrap.entity.player.PlayerAbilities value) { wrapperContained.abilities = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerAbilities abilities() { return new yarnwrap.entity.player.PlayerAbilities(net.minecraft.entity.player.PlayerEntity.abilities); }
// public static void abilities(yarnwrap.entity.player.PlayerAbilities value, ) { net.minecraft.entity.player.PlayerEntity.abilities = value.wrapperContained; }

public int experiencePickUpDelay() { return wrapperContained.experiencePickUpDelay; }
public void experiencePickUpDelay(int value) { wrapperContained.experiencePickUpDelay = value; }
// public static int experiencePickUpDelay() { return net.minecraft.entity.player.PlayerEntity.experiencePickUpDelay; }
// public static void experiencePickUpDelay(int value, ) { net.minecraft.entity.player.PlayerEntity.experiencePickUpDelay = value; }

public float prevStrideDistance() { return wrapperContained.prevStrideDistance; }
public void prevStrideDistance(float value) { wrapperContained.prevStrideDistance = value; }
// public static float prevStrideDistance() { return net.minecraft.entity.player.PlayerEntity.prevStrideDistance; }
// public static void prevStrideDistance(float value, ) { net.minecraft.entity.player.PlayerEntity.prevStrideDistance = value; }

// public yarnwrap.entity.data.TrackedData RIGHT_SHOULDER_ENTITY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RIGHT_SHOULDER_ENTITY); }
// public void RIGHT_SHOULDER_ENTITY(yarnwrap.entity.data.TrackedData value) { wrapperContained.RIGHT_SHOULDER_ENTITY = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData RIGHT_SHOULDER_ENTITY() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.player.PlayerEntity.RIGHT_SHOULDER_ENTITY); }
// public static void RIGHT_SHOULDER_ENTITY(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.player.PlayerEntity.RIGHT_SHOULDER_ENTITY = value.wrapperContained; }

// public com.mojang.authlib.GameProfile gameProfile() { return wrapperContained.gameProfile; }
// public void gameProfile(com.mojang.authlib.GameProfile value) { wrapperContained.gameProfile = value; }
// public static com.mojang.authlib.GameProfile gameProfile() { return net.minecraft.entity.player.PlayerEntity.gameProfile; }
// public static void gameProfile(com.mojang.authlib.GameProfile value, ) { net.minecraft.entity.player.PlayerEntity.gameProfile = value; }

// public int lastPlayedLevelUpSoundTime() { return wrapperContained.lastPlayedLevelUpSoundTime; }
// public void lastPlayedLevelUpSoundTime(int value) { wrapperContained.lastPlayedLevelUpSoundTime = value; }
// public static int lastPlayedLevelUpSoundTime() { return net.minecraft.entity.player.PlayerEntity.lastPlayedLevelUpSoundTime; }
// public static void lastPlayedLevelUpSoundTime(int value, ) { net.minecraft.entity.player.PlayerEntity.lastPlayedLevelUpSoundTime = value; }

public float experienceProgress() { return wrapperContained.experienceProgress; }
public void experienceProgress(float value) { wrapperContained.experienceProgress = value; }
// public static float experienceProgress() { return net.minecraft.entity.player.PlayerEntity.experienceProgress; }
// public static void experienceProgress(float value, ) { net.minecraft.entity.player.PlayerEntity.experienceProgress = value; }

// public yarnwrap.entity.data.TrackedData SCORE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SCORE); }
// public void SCORE(yarnwrap.entity.data.TrackedData value) { wrapperContained.SCORE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SCORE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.player.PlayerEntity.SCORE); }
// public static void SCORE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.player.PlayerEntity.SCORE = value.wrapperContained; }

public yarnwrap.screen.ScreenHandler currentScreenHandler() { return new yarnwrap.screen.ScreenHandler(wrapperContained.currentScreenHandler); }
public void currentScreenHandler(yarnwrap.screen.ScreenHandler value) { wrapperContained.currentScreenHandler = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandler currentScreenHandler() { return new yarnwrap.screen.ScreenHandler(net.minecraft.entity.player.PlayerEntity.currentScreenHandler); }
// public static void currentScreenHandler(yarnwrap.screen.ScreenHandler value, ) { net.minecraft.entity.player.PlayerEntity.currentScreenHandler = value.wrapperContained; }

public yarnwrap.entity.projectile.FishingBobberEntity fishHook() { return new yarnwrap.entity.projectile.FishingBobberEntity(wrapperContained.fishHook); }
public void fishHook(yarnwrap.entity.projectile.FishingBobberEntity value) { wrapperContained.fishHook = value.wrapperContained; }
// public static yarnwrap.entity.projectile.FishingBobberEntity fishHook() { return new yarnwrap.entity.projectile.FishingBobberEntity(net.minecraft.entity.player.PlayerEntity.fishHook); }
// public static void fishHook(yarnwrap.entity.projectile.FishingBobberEntity value, ) { net.minecraft.entity.player.PlayerEntity.fishHook = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerInventory inventory() { return new yarnwrap.entity.player.PlayerInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.entity.player.PlayerInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerInventory inventory() { return new yarnwrap.entity.player.PlayerInventory(net.minecraft.entity.player.PlayerEntity.inventory); }
// public static void inventory(yarnwrap.entity.player.PlayerInventory value, ) { net.minecraft.entity.player.PlayerEntity.inventory = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData PLAYER_MODEL_PARTS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PLAYER_MODEL_PARTS); }
// public void PLAYER_MODEL_PARTS(yarnwrap.entity.data.TrackedData value) { wrapperContained.PLAYER_MODEL_PARTS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData PLAYER_MODEL_PARTS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.player.PlayerEntity.PLAYER_MODEL_PARTS); }
// public static void PLAYER_MODEL_PARTS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.player.PlayerEntity.PLAYER_MODEL_PARTS = value.wrapperContained; }

public int experienceLevel() { return wrapperContained.experienceLevel; }
public void experienceLevel(int value) { wrapperContained.experienceLevel = value; }
// public static int experienceLevel() { return net.minecraft.entity.player.PlayerEntity.experienceLevel; }
// public static void experienceLevel(int value, ) { net.minecraft.entity.player.PlayerEntity.experienceLevel = value; }

public double capeY() { return wrapperContained.capeY; }
public void capeY(double value) { wrapperContained.capeY = value; }
// public static double capeY() { return net.minecraft.entity.player.PlayerEntity.capeY; }
// public static void capeY(double value, ) { net.minecraft.entity.player.PlayerEntity.capeY = value; }

public double prevCapeZ() { return wrapperContained.prevCapeZ; }
public void prevCapeZ(double value) { wrapperContained.prevCapeZ = value; }
// public static double prevCapeZ() { return net.minecraft.entity.player.PlayerEntity.prevCapeZ; }
// public static void prevCapeZ(double value, ) { net.minecraft.entity.player.PlayerEntity.prevCapeZ = value; }

// public boolean reducedDebugInfo() { return wrapperContained.reducedDebugInfo; }
// public void reducedDebugInfo(boolean value) { wrapperContained.reducedDebugInfo = value; }
// public static boolean reducedDebugInfo() { return net.minecraft.entity.player.PlayerEntity.reducedDebugInfo; }
// public static void reducedDebugInfo(boolean value, ) { net.minecraft.entity.player.PlayerEntity.reducedDebugInfo = value; }

public double prevCapeX() { return wrapperContained.prevCapeX; }
public void prevCapeX(double value) { wrapperContained.prevCapeX = value; }
// public static double prevCapeX() { return net.minecraft.entity.player.PlayerEntity.prevCapeX; }
// public static void prevCapeX(double value, ) { net.minecraft.entity.player.PlayerEntity.prevCapeX = value; }

// public yarnwrap.item.ItemStack selectedItem() { return new yarnwrap.item.ItemStack(wrapperContained.selectedItem); }
// public void selectedItem(yarnwrap.item.ItemStack value) { wrapperContained.selectedItem = value.wrapperContained; }
// public static yarnwrap.item.ItemStack selectedItem() { return new yarnwrap.item.ItemStack(net.minecraft.entity.player.PlayerEntity.selectedItem); }
// public static void selectedItem(yarnwrap.item.ItemStack value, ) { net.minecraft.entity.player.PlayerEntity.selectedItem = value.wrapperContained; }

// public PlayerEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,float yaw,com.mojang.authlib.GameProfile gameProfile) { this.wrapperContained = new net.minecraft.entity.player.PlayerEntity(world.wrapperContained,pos.wrapperContained,yaw,gameProfile); }
// public void onHandledScreenClosed() { wrapperContained.onHandledScreenClosed(); }
// public static void onHandledScreenClosed() { net.minecraft.entity.player.PlayerEntity.onHandledScreenClosed(); }
public void openJigsawScreen(yarnwrap.block.entity.JigsawBlockEntity jigsaw) { wrapperContained.openJigsawScreen(jigsaw.wrapperContained); }
// public static void openJigsawScreen(yarnwrap.block.entity.JigsawBlockEntity jigsaw, ) { net.minecraft.entity.player.PlayerEntity.openJigsawScreen(jigsaw.wrapperContained); }
public void sendTradeOffers(int syncId,yarnwrap.village.TradeOfferList offers,int levelProgress,int experience,boolean leveled,boolean refreshable) { wrapperContained.sendTradeOffers(syncId,offers.wrapperContained,levelProgress,experience,leveled,refreshable); }
// public static void sendTradeOffers(int syncId,yarnwrap.village.TradeOfferList offers,int levelProgress,int experience,boolean leveled,boolean refreshable, ) { net.minecraft.entity.player.PlayerEntity.sendTradeOffers(syncId,offers.wrapperContained,levelProgress,experience,leveled,refreshable); }
public java.util.OptionalInt openHandledScreen(yarnwrap.screen.NamedScreenHandlerFactory factory) { return wrapperContained.openHandledScreen(factory.wrapperContained); }
// public static java.util.OptionalInt openHandledScreen(yarnwrap.screen.NamedScreenHandlerFactory factory, ) { return net.minecraft.entity.player.PlayerEntity.openHandledScreen(factory.wrapperContained); }
public void playSoundToPlayer(yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch) { wrapperContained.playSoundToPlayer(sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public static void playSoundToPlayer(yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch, ) { net.minecraft.entity.player.PlayerEntity.playSoundToPlayer(sound.wrapperContained,category.wrapperContained,volume,pitch); }
// public void method_17851(yarnwrap.entity.EntityType parrotType) { wrapperContained.method_17851(parrotType.wrapperContained); }
// public static void method_17851(yarnwrap.entity.EntityType parrotType, ) { net.minecraft.entity.player.PlayerEntity.method_17851(parrotType.wrapperContained); }
// public boolean method_17852(yarnwrap.entity.EntityType entityType) { return wrapperContained.method_17852(entityType.wrapperContained); }
// public static boolean method_17852(yarnwrap.entity.EntityType entityType, ) { return net.minecraft.entity.player.PlayerEntity.method_17852(entityType.wrapperContained); }
// public void method_17853(yarnwrap.entity.Entity entity) { wrapperContained.method_17853(entity.wrapperContained); }
// public static void method_17853(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.player.PlayerEntity.method_17853(entity.wrapperContained); }
public boolean isBlockBreakingRestricted(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.GameMode gameMode) { return wrapperContained.isBlockBreakingRestricted(world.wrapperContained,pos.wrapperContained,gameMode.wrapperContained); }
// public static boolean isBlockBreakingRestricted(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.GameMode gameMode, ) { return net.minecraft.entity.player.PlayerEntity.isBlockBreakingRestricted(world.wrapperContained,pos.wrapperContained,gameMode.wrapperContained); }
public boolean shouldCancelInteraction() { return wrapperContained.shouldCancelInteraction(); }
// public static boolean shouldCancelInteraction() { return net.minecraft.entity.player.PlayerEntity.shouldCancelInteraction(); }
// public boolean shouldDismount() { return wrapperContained.shouldDismount(); }
// public static boolean shouldDismount() { return net.minecraft.entity.player.PlayerEntity.shouldDismount(); }
// public boolean clipAtLedge() { return wrapperContained.clipAtLedge(); }
// public static boolean clipAtLedge() { return net.minecraft.entity.player.PlayerEntity.clipAtLedge(); }
public boolean checkFallFlying() { return wrapperContained.checkFallFlying(); }
// public static boolean checkFallFlying() { return net.minecraft.entity.player.PlayerEntity.checkFallFlying(); }
public void startFallFlying() { wrapperContained.startFallFlying(); }
// public static void startFallFlying() { net.minecraft.entity.player.PlayerEntity.startFallFlying(); }
public void stopFallFlying() { wrapperContained.stopFallFlying(); }
// public static void stopFallFlying() { net.minecraft.entity.player.PlayerEntity.stopFallFlying(); }
// public Object createPlayerAttributes() { return wrapperContained.createPlayerAttributes(); }
public static Object createPlayerAttributes() { return net.minecraft.entity.player.PlayerEntity.createPlayerAttributes(); }
public yarnwrap.entity.player.PlayerInventory getInventory() { return new yarnwrap.entity.player.PlayerInventory(wrapperContained.getInventory()); }
// public static yarnwrap.entity.player.PlayerInventory getInventory() { return new yarnwrap.entity.player.PlayerInventory(net.minecraft.entity.player.PlayerEntity.getInventory()); }
public yarnwrap.entity.player.PlayerAbilities getAbilities() { return new yarnwrap.entity.player.PlayerAbilities(wrapperContained.getAbilities()); }
// public static yarnwrap.entity.player.PlayerAbilities getAbilities() { return new yarnwrap.entity.player.PlayerAbilities(net.minecraft.entity.player.PlayerEntity.getAbilities()); }
public boolean isUsingSpyglass() { return wrapperContained.isUsingSpyglass(); }
// public static boolean isUsingSpyglass() { return net.minecraft.entity.player.PlayerEntity.isUsingSpyglass(); }
public void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType) { wrapperContained.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }
// public static void onPickupSlotClick(yarnwrap.item.ItemStack cursorStack,yarnwrap.item.ItemStack slotStack,yarnwrap.util.ClickType clickType, ) { net.minecraft.entity.player.PlayerEntity.onPickupSlotClick(cursorStack.wrapperContained,slotStack.wrapperContained,clickType.wrapperContained); }
public boolean shouldFilterText() { return wrapperContained.shouldFilterText(); }
// public static boolean shouldFilterText() { return net.minecraft.entity.player.PlayerEntity.shouldFilterText(); }
public void useRiptide(int riptideTicks,float riptideAttackDamage,yarnwrap.item.ItemStack stack) { wrapperContained.useRiptide(riptideTicks,riptideAttackDamage,stack.wrapperContained); }
// public static void useRiptide(int riptideTicks,float riptideAttackDamage,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.player.PlayerEntity.useRiptide(riptideTicks,riptideAttackDamage,stack.wrapperContained); }
public java.util.Optional getSculkShriekerWarningManager() { return wrapperContained.getSculkShriekerWarningManager(); }
// public static java.util.Optional getSculkShriekerWarningManager() { return net.minecraft.entity.player.PlayerEntity.getSculkShriekerWarningManager(); }
// public java.util.Optional method_43119(yarnwrap.util.math.GlobalPos pos) { return wrapperContained.method_43119(pos.wrapperContained); }
// public static java.util.Optional method_43119(yarnwrap.util.math.GlobalPos pos, ) { return net.minecraft.entity.player.PlayerEntity.method_43119(pos.wrapperContained); }
public void setLastDeathPos(java.util.Optional lastDeathPos) { wrapperContained.setLastDeathPos(lastDeathPos); }
// public static void setLastDeathPos(java.util.Optional lastDeathPos, ) { net.minecraft.entity.player.PlayerEntity.setLastDeathPos(lastDeathPos); }
// public void method_43121(yarnwrap.nbt.NbtCompound pos) { wrapperContained.method_43121(pos.wrapperContained); }
// public static void method_43121(yarnwrap.nbt.NbtCompound pos, ) { net.minecraft.entity.player.PlayerEntity.method_43121(pos.wrapperContained); }
public java.util.Optional getLastDeathPos() { return wrapperContained.getLastDeathPos(); }
// public static java.util.Optional getLastDeathPos() { return net.minecraft.entity.player.PlayerEntity.getLastDeathPos(); }
public boolean shouldCloseHandledScreenOnRespawn() { return wrapperContained.shouldCloseHandledScreenOnRespawn(); }
// public static boolean shouldCloseHandledScreenOnRespawn() { return net.minecraft.entity.player.PlayerEntity.shouldCloseHandledScreenOnRespawn(); }
public void onRecipeCrafted(yarnwrap.recipe.RecipeEntry recipe,java.util.List ingredients) { wrapperContained.onRecipeCrafted(recipe.wrapperContained,ingredients); }
// public static void onRecipeCrafted(yarnwrap.recipe.RecipeEntry recipe,java.util.List ingredients, ) { net.minecraft.entity.player.PlayerEntity.onRecipeCrafted(recipe.wrapperContained,ingredients); }
// public boolean canChangeIntoPose(yarnwrap.entity.EntityPose pose) { return wrapperContained.canChangeIntoPose(pose.wrapperContained); }
// public static boolean canChangeIntoPose(yarnwrap.entity.EntityPose pose, ) { return net.minecraft.entity.player.PlayerEntity.canChangeIntoPose(pose.wrapperContained); }
public double getBlockInteractionRange() { return wrapperContained.getBlockInteractionRange(); }
// public static double getBlockInteractionRange() { return net.minecraft.entity.player.PlayerEntity.getBlockInteractionRange(); }
public double getEntityInteractionRange() { return wrapperContained.getEntityInteractionRange(); }
// public static double getEntityInteractionRange() { return net.minecraft.entity.player.PlayerEntity.getEntityInteractionRange(); }
public boolean canInteractWithEntityIn(yarnwrap.util.math.Box box,double additionalRange) { return wrapperContained.canInteractWithEntityIn(box.wrapperContained,additionalRange); }
// public static boolean canInteractWithEntityIn(yarnwrap.util.math.Box box,double additionalRange, ) { return net.minecraft.entity.player.PlayerEntity.canInteractWithEntityIn(box.wrapperContained,additionalRange); }
public boolean canInteractWithBlockAt(yarnwrap.util.math.BlockPos pos,double additionalRange) { return wrapperContained.canInteractWithBlockAt(pos.wrapperContained,additionalRange); }
// public static boolean canInteractWithBlockAt(yarnwrap.util.math.BlockPos pos,double additionalRange, ) { return net.minecraft.entity.player.PlayerEntity.canInteractWithBlockAt(pos.wrapperContained,additionalRange); }
public boolean canInteractWithEntity(yarnwrap.entity.Entity entity,double additionalRange) { return wrapperContained.canInteractWithEntity(entity.wrapperContained,additionalRange); }
// public static boolean canInteractWithEntity(yarnwrap.entity.Entity entity,double additionalRange, ) { return net.minecraft.entity.player.PlayerEntity.canInteractWithEntity(entity.wrapperContained,additionalRange); }
public void clearCurrentExplosion() { wrapperContained.clearCurrentExplosion(); }
// public static void clearCurrentExplosion() { net.minecraft.entity.player.PlayerEntity.clearCurrentExplosion(); }
// public void method_58397(yarnwrap.util.math.Vec3d currentExplosionImpactPos) { wrapperContained.method_58397(currentExplosionImpactPos.wrapperContained); }
// public static void method_58397(yarnwrap.util.math.Vec3d currentExplosionImpactPos, ) { net.minecraft.entity.player.PlayerEntity.method_58397(currentExplosionImpactPos.wrapperContained); }
// public boolean isSpaceAroundPlayerEmpty(double offsetX,double offsetZ) { return wrapperContained.isSpaceAroundPlayerEmpty(offsetX,offsetZ); }
// public static boolean isSpaceAroundPlayerEmpty(double offsetX,double offsetZ, ) { return net.minecraft.entity.player.PlayerEntity.isSpaceAroundPlayerEmpty(offsetX,offsetZ); }
// public float getDamageAgainst(yarnwrap.entity.Entity target,float baseDamage,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.getDamageAgainst(target.wrapperContained,baseDamage,damageSource.wrapperContained); }
// public static float getDamageAgainst(yarnwrap.entity.Entity target,float baseDamage,yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.entity.player.PlayerEntity.getDamageAgainst(target.wrapperContained,baseDamage,damageSource.wrapperContained); }
public void tryClearCurrentExplosion() { wrapperContained.tryClearCurrentExplosion(); }
// public static void tryClearCurrentExplosion() { net.minecraft.entity.player.PlayerEntity.tryClearCurrentExplosion(); }
public void setIgnoreFallDamageFromCurrentExplosion(boolean ignoreFallDamageFromCurrentExplosion) { wrapperContained.setIgnoreFallDamageFromCurrentExplosion(ignoreFallDamageFromCurrentExplosion); }
// public static void setIgnoreFallDamageFromCurrentExplosion(boolean ignoreFallDamageFromCurrentExplosion, ) { net.minecraft.entity.player.PlayerEntity.setIgnoreFallDamageFromCurrentExplosion(ignoreFallDamageFromCurrentExplosion); }
public boolean shouldIgnoreFallDamageFromCurrentExplosion() { return wrapperContained.shouldIgnoreFallDamageFromCurrentExplosion(); }
// public static boolean shouldIgnoreFallDamageFromCurrentExplosion() { return net.minecraft.entity.player.PlayerEntity.shouldIgnoreFallDamageFromCurrentExplosion(); }
public int unlockRecipes(java.util.Collection recipes) { return wrapperContained.unlockRecipes(recipes); }
// public static int unlockRecipes(java.util.Collection recipes, ) { return net.minecraft.entity.player.PlayerEntity.unlockRecipes(recipes); }
public void addExperience(int experience) { wrapperContained.addExperience(experience); }
// public static void addExperience(int experience, ) { net.minecraft.entity.player.PlayerEntity.addExperience(experience); }
public boolean shouldDamagePlayer(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.shouldDamagePlayer(player.wrapperContained); }
// public static boolean shouldDamagePlayer(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.player.PlayerEntity.shouldDamagePlayer(player.wrapperContained); }
public void openCommandBlockMinecartScreen(yarnwrap.world.CommandBlockExecutor commandBlockExecutor) { wrapperContained.openCommandBlockMinecartScreen(commandBlockExecutor.wrapperContained); }
// public static void openCommandBlockMinecartScreen(yarnwrap.world.CommandBlockExecutor commandBlockExecutor, ) { net.minecraft.entity.player.PlayerEntity.openCommandBlockMinecartScreen(commandBlockExecutor.wrapperContained); }
public void incrementStat(yarnwrap.stat.Stat stat) { wrapperContained.incrementStat(stat.wrapperContained); }
// public static void incrementStat(yarnwrap.stat.Stat stat, ) { net.minecraft.entity.player.PlayerEntity.incrementStat(stat.wrapperContained); }
public float getAttackCooldownProgress(float baseTime) { return wrapperContained.getAttackCooldownProgress(baseTime); }
// public static float getAttackCooldownProgress(float baseTime, ) { return net.minecraft.entity.player.PlayerEntity.getAttackCooldownProgress(baseTime); }
// public void dropShoulderEntities() { wrapperContained.dropShoulderEntities(); }
// public static void dropShoulderEntities() { net.minecraft.entity.player.PlayerEntity.dropShoulderEntities(); }
public void spawnSweepAttackParticles() { wrapperContained.spawnSweepAttackParticles(); }
// public static void spawnSweepAttackParticles() { net.minecraft.entity.player.PlayerEntity.spawnSweepAttackParticles(); }
// public yarnwrap.entity.player.ItemCooldownManager createCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(wrapperContained.createCooldownManager()); }
// public static yarnwrap.entity.player.ItemCooldownManager createCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(net.minecraft.entity.player.PlayerEntity.createCooldownManager()); }
public void resetStat(yarnwrap.stat.Stat stat) { wrapperContained.resetStat(stat.wrapperContained); }
// public static void resetStat(yarnwrap.stat.Stat stat, ) { net.minecraft.entity.player.PlayerEntity.resetStat(stat.wrapperContained); }
// public void updateShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.updateShoulderEntity(entityNbt.wrapperContained); }
// public static void updateShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt, ) { net.minecraft.entity.player.PlayerEntity.updateShoulderEntity(entityNbt.wrapperContained); }
public void setReducedDebugInfo(boolean reducedDebugInfo) { wrapperContained.setReducedDebugInfo(reducedDebugInfo); }
// public static void setReducedDebugInfo(boolean reducedDebugInfo, ) { net.minecraft.entity.player.PlayerEntity.setReducedDebugInfo(reducedDebugInfo); }
public com.mojang.datafixers.util.Either trySleep(yarnwrap.util.math.BlockPos pos) { return wrapperContained.trySleep(pos.wrapperContained); }
// public static com.mojang.datafixers.util.Either trySleep(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.player.PlayerEntity.trySleep(pos.wrapperContained); }
public boolean giveItemStack(yarnwrap.item.ItemStack stack) { return wrapperContained.giveItemStack(stack.wrapperContained); }
// public static boolean giveItemStack(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerEntity.giveItemStack(stack.wrapperContained); }
public int getScore() { return wrapperContained.getScore(); }
// public static int getScore() { return net.minecraft.entity.player.PlayerEntity.getScore(); }
// public void setShoulderEntityLeft(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.setShoulderEntityLeft(entityNbt.wrapperContained); }
// public static void setShoulderEntityLeft(yarnwrap.nbt.NbtCompound entityNbt, ) { net.minecraft.entity.player.PlayerEntity.setShoulderEntityLeft(entityNbt.wrapperContained); }
public yarnwrap.inventory.EnderChestInventory getEnderChestInventory() { return new yarnwrap.inventory.EnderChestInventory(wrapperContained.getEnderChestInventory()); }
// public static yarnwrap.inventory.EnderChestInventory getEnderChestInventory() { return new yarnwrap.inventory.EnderChestInventory(net.minecraft.entity.player.PlayerEntity.getEnderChestInventory()); }
public boolean canResetTimeBySleeping() { return wrapperContained.canResetTimeBySleeping(); }
// public static boolean canResetTimeBySleeping() { return net.minecraft.entity.player.PlayerEntity.canResetTimeBySleeping(); }
public void addCritParticles(yarnwrap.entity.Entity target) { wrapperContained.addCritParticles(target.wrapperContained); }
// public static void addCritParticles(yarnwrap.entity.Entity target, ) { net.minecraft.entity.player.PlayerEntity.addCritParticles(target.wrapperContained); }
public int getEnchantmentTableSeed() { return wrapperContained.getEnchantmentTableSeed(); }
// public static int getEnchantmentTableSeed() { return net.minecraft.entity.player.PlayerEntity.getEnchantmentTableSeed(); }
public float getAttackCooldownProgressPerTick() { return wrapperContained.getAttackCooldownProgressPerTick(); }
// public static float getAttackCooldownProgressPerTick() { return net.minecraft.entity.player.PlayerEntity.getAttackCooldownProgressPerTick(); }
public void incrementStat(yarnwrap.util.Identifier stat) { wrapperContained.incrementStat(stat.wrapperContained); }
// public static void incrementStat(yarnwrap.util.Identifier stat, ) { net.minecraft.entity.player.PlayerEntity.incrementStat(stat.wrapperContained); }
public void setMainArm(yarnwrap.util.Arm arm) { wrapperContained.setMainArm(arm.wrapperContained); }
// public static void setMainArm(yarnwrap.util.Arm arm, ) { net.minecraft.entity.player.PlayerEntity.setMainArm(arm.wrapperContained); }
public void disableShield() { wrapperContained.disableShield(); }
// public static void disableShield() { net.minecraft.entity.player.PlayerEntity.disableShield(); }
public void addScore(int score) { wrapperContained.addScore(score); }
// public static void addScore(int score, ) { net.minecraft.entity.player.PlayerEntity.addScore(score); }
public void applyEnchantmentCosts(yarnwrap.item.ItemStack enchantedItem,int experienceLevels) { wrapperContained.applyEnchantmentCosts(enchantedItem.wrapperContained,experienceLevels); }
// public static void applyEnchantmentCosts(yarnwrap.item.ItemStack enchantedItem,int experienceLevels, ) { net.minecraft.entity.player.PlayerEntity.applyEnchantmentCosts(enchantedItem.wrapperContained,experienceLevels); }
public yarnwrap.util.ActionResult interact(yarnwrap.entity.Entity entity,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interact(entity.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interact(yarnwrap.entity.Entity entity,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.entity.player.PlayerEntity.interact(entity.wrapperContained,hand.wrapperContained)); }
public void openHorseInventory(yarnwrap.entity.passive.AbstractHorseEntity horse,yarnwrap.inventory.Inventory inventory) { wrapperContained.openHorseInventory(horse.wrapperContained,inventory.wrapperContained); }
// public static void openHorseInventory(yarnwrap.entity.passive.AbstractHorseEntity horse,yarnwrap.inventory.Inventory inventory, ) { net.minecraft.entity.player.PlayerEntity.openHorseInventory(horse.wrapperContained,inventory.wrapperContained); }
public float getLuck() { return wrapperContained.getLuck(); }
// public static float getLuck() { return net.minecraft.entity.player.PlayerEntity.getLuck(); }
// public void vanishCursedItems() { wrapperContained.vanishCursedItems(); }
// public static void vanishCursedItems() { net.minecraft.entity.player.PlayerEntity.vanishCursedItems(); }
public boolean canModifyBlocks() { return wrapperContained.canModifyBlocks(); }
// public static boolean canModifyBlocks() { return net.minecraft.entity.player.PlayerEntity.canModifyBlocks(); }
// public boolean updateWaterSubmersionState() { return wrapperContained.updateWaterSubmersionState(); }
// public static boolean updateWaterSubmersionState() { return net.minecraft.entity.player.PlayerEntity.updateWaterSubmersionState(); }
// public void dropShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.dropShoulderEntity(entityNbt.wrapperContained); }
// public static void dropShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt, ) { net.minecraft.entity.player.PlayerEntity.dropShoulderEntity(entityNbt.wrapperContained); }
public int getSleepTimer() { return wrapperContained.getSleepTimer(); }
// public static int getSleepTimer() { return net.minecraft.entity.player.PlayerEntity.getSleepTimer(); }
public boolean addShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt) { return wrapperContained.addShoulderEntity(entityNbt.wrapperContained); }
// public static boolean addShoulderEntity(yarnwrap.nbt.NbtCompound entityNbt, ) { return net.minecraft.entity.player.PlayerEntity.addShoulderEntity(entityNbt.wrapperContained); }
// public yarnwrap.text.MutableText addTellClickEvent(yarnwrap.text.MutableText component) { return new yarnwrap.text.MutableText(wrapperContained.addTellClickEvent(component.wrapperContained)); }
// public static yarnwrap.text.MutableText addTellClickEvent(yarnwrap.text.MutableText component, ) { return new yarnwrap.text.MutableText(net.minecraft.entity.player.PlayerEntity.addTellClickEvent(component.wrapperContained)); }
public boolean hasReducedDebugInfo() { return wrapperContained.hasReducedDebugInfo(); }
// public static boolean hasReducedDebugInfo() { return net.minecraft.entity.player.PlayerEntity.hasReducedDebugInfo(); }
public void openStructureBlockScreen(yarnwrap.block.entity.StructureBlockBlockEntity structureBlock) { wrapperContained.openStructureBlockScreen(structureBlock.wrapperContained); }
// public static void openStructureBlockScreen(yarnwrap.block.entity.StructureBlockBlockEntity structureBlock, ) { net.minecraft.entity.player.PlayerEntity.openStructureBlockScreen(structureBlock.wrapperContained); }
public void addEnchantedHitParticles(yarnwrap.entity.Entity target) { wrapperContained.addEnchantedHitParticles(target.wrapperContained); }
// public static void addEnchantedHitParticles(yarnwrap.entity.Entity target, ) { net.minecraft.entity.player.PlayerEntity.addEnchantedHitParticles(target.wrapperContained); }
public boolean canHarvest(yarnwrap.block.BlockState state) { return wrapperContained.canHarvest(state.wrapperContained); }
// public static boolean canHarvest(yarnwrap.block.BlockState state, ) { return net.minecraft.entity.player.PlayerEntity.canHarvest(state.wrapperContained); }
public yarnwrap.nbt.NbtCompound getShoulderEntityRight() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getShoulderEntityRight()); }
// public static yarnwrap.nbt.NbtCompound getShoulderEntityRight() { return new yarnwrap.nbt.NbtCompound(net.minecraft.entity.player.PlayerEntity.getShoulderEntityRight()); }
public void openEditSignScreen(yarnwrap.block.entity.SignBlockEntity sign,boolean front) { wrapperContained.openEditSignScreen(sign.wrapperContained,front); }
// public static void openEditSignScreen(yarnwrap.block.entity.SignBlockEntity sign,boolean front, ) { net.minecraft.entity.player.PlayerEntity.openEditSignScreen(sign.wrapperContained,front); }
// public void updateCapeAngles() { wrapperContained.updateCapeAngles(); }
// public static void updateCapeAngles() { net.minecraft.entity.player.PlayerEntity.updateCapeAngles(); }
public void useBook(yarnwrap.item.ItemStack book,yarnwrap.util.Hand hand) { wrapperContained.useBook(book.wrapperContained,hand.wrapperContained); }
// public static void useBook(yarnwrap.item.ItemStack book,yarnwrap.util.Hand hand, ) { net.minecraft.entity.player.PlayerEntity.useBook(book.wrapperContained,hand.wrapperContained); }
public void addExperienceLevels(int levels) { wrapperContained.addExperienceLevels(levels); }
// public static void addExperienceLevels(int levels, ) { net.minecraft.entity.player.PlayerEntity.addExperienceLevels(levels); }
public boolean canFoodHeal() { return wrapperContained.canFoodHeal(); }
// public static boolean canFoodHeal() { return net.minecraft.entity.player.PlayerEntity.canFoodHeal(); }
// public void updatePose() { wrapperContained.updatePose(); }
// public static void updatePose() { net.minecraft.entity.player.PlayerEntity.updatePose(); }
public void setScore(int score) { wrapperContained.setScore(score); }
// public static void setScore(int score, ) { net.minecraft.entity.player.PlayerEntity.setScore(score); }
// public yarnwrap.text.Style method_7321(java.lang.String style) { return new yarnwrap.text.Style(wrapperContained.method_7321(style)); }
// public static yarnwrap.text.Style method_7321(java.lang.String style, ) { return new yarnwrap.text.Style(net.minecraft.entity.player.PlayerEntity.method_7321(style)); }
public void addExhaustion(float exhaustion) { wrapperContained.addExhaustion(exhaustion); }
// public static void addExhaustion(float exhaustion, ) { net.minecraft.entity.player.PlayerEntity.addExhaustion(exhaustion); }
public void openCommandBlockScreen(yarnwrap.block.entity.CommandBlockBlockEntity commandBlock) { wrapperContained.openCommandBlockScreen(commandBlock.wrapperContained); }
// public static void openCommandBlockScreen(yarnwrap.block.entity.CommandBlockBlockEntity commandBlock, ) { net.minecraft.entity.player.PlayerEntity.openCommandBlockScreen(commandBlock.wrapperContained); }
public void attack(yarnwrap.entity.Entity target) { wrapperContained.attack(target.wrapperContained); }
// public static void attack(yarnwrap.entity.Entity target, ) { net.minecraft.entity.player.PlayerEntity.attack(target.wrapperContained); }
// public boolean doesNotSuffocate(yarnwrap.util.math.BlockPos pos) { return wrapperContained.doesNotSuffocate(pos.wrapperContained); }
// public static boolean doesNotSuffocate(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.player.PlayerEntity.doesNotSuffocate(pos.wrapperContained); }
public yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(wrapperContained.getScoreboard()); }
// public static yarnwrap.scoreboard.Scoreboard getScoreboard() { return new yarnwrap.scoreboard.Scoreboard(net.minecraft.entity.player.PlayerEntity.getScoreboard()); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemStack stack,boolean retainOwnership) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(stack.wrapperContained,retainOwnership)); }
// public static yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemStack stack,boolean retainOwnership, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.player.PlayerEntity.dropItem(stack.wrapperContained,retainOwnership)); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemStack stack,boolean throwRandomly,boolean retainOwnership) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(stack.wrapperContained,throwRandomly,retainOwnership)); }
// public static yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemStack stack,boolean throwRandomly,boolean retainOwnership, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.player.PlayerEntity.dropItem(stack.wrapperContained,throwRandomly,retainOwnership)); }
// public void updateTurtleHelmet() { wrapperContained.updateTurtleHelmet(); }
// public static void updateTurtleHelmet() { net.minecraft.entity.player.PlayerEntity.updateTurtleHelmet(); }
public void requestRespawn() { wrapperContained.requestRespawn(); }
// public static void requestRespawn() { net.minecraft.entity.player.PlayerEntity.requestRespawn(); }
public boolean canConsume(boolean ignoreHunger) { return wrapperContained.canConsume(ignoreHunger); }
// public static boolean canConsume(boolean ignoreHunger, ) { return net.minecraft.entity.player.PlayerEntity.canConsume(ignoreHunger); }
public int lockRecipes(java.util.Collection recipes) { return wrapperContained.lockRecipes(recipes); }
// public static int lockRecipes(java.util.Collection recipes, ) { return net.minecraft.entity.player.PlayerEntity.lockRecipes(recipes); }
public com.mojang.authlib.GameProfile getGameProfile() { return wrapperContained.getGameProfile(); }
// public static com.mojang.authlib.GameProfile getGameProfile() { return net.minecraft.entity.player.PlayerEntity.getGameProfile(); }
// public void unlockRecipes(java.util.List recipes) { wrapperContained.unlockRecipes(recipes); }
// public static void unlockRecipes(java.util.List recipes, ) { net.minecraft.entity.player.PlayerEntity.unlockRecipes(recipes); }
public boolean isCreative() { return wrapperContained.isCreative(); }
// public static boolean isCreative() { return net.minecraft.entity.player.PlayerEntity.isCreative(); }
public boolean isCreativeLevelTwoOp() { return wrapperContained.isCreativeLevelTwoOp(); }
// public static boolean isCreativeLevelTwoOp() { return net.minecraft.entity.player.PlayerEntity.isCreativeLevelTwoOp(); }
public void increaseStat(yarnwrap.util.Identifier stat,int amount) { wrapperContained.increaseStat(stat.wrapperContained,amount); }
// public static void increaseStat(yarnwrap.util.Identifier stat,int amount, ) { net.minecraft.entity.player.PlayerEntity.increaseStat(stat.wrapperContained,amount); }
public boolean isMainPlayer() { return wrapperContained.isMainPlayer(); }
// public static boolean isMainPlayer() { return net.minecraft.entity.player.PlayerEntity.isMainPlayer(); }
// public void collideWithEntity(yarnwrap.entity.Entity entity) { wrapperContained.collideWithEntity(entity.wrapperContained); }
// public static void collideWithEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.player.PlayerEntity.collideWithEntity(entity.wrapperContained); }
public void increaseStat(yarnwrap.stat.Stat stat,int amount) { wrapperContained.increaseStat(stat.wrapperContained,amount); }
// public static void increaseStat(yarnwrap.stat.Stat stat,int amount, ) { net.minecraft.entity.player.PlayerEntity.increaseStat(stat.wrapperContained,amount); }
public boolean canPlaceOn(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing,yarnwrap.item.ItemStack stack) { return wrapperContained.canPlaceOn(pos.wrapperContained,facing.wrapperContained,stack.wrapperContained); }
// public static boolean canPlaceOn(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing,yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.PlayerEntity.canPlaceOn(pos.wrapperContained,facing.wrapperContained,stack.wrapperContained); }
public yarnwrap.entity.player.HungerManager getHungerManager() { return new yarnwrap.entity.player.HungerManager(wrapperContained.getHungerManager()); }
// public static yarnwrap.entity.player.HungerManager getHungerManager() { return new yarnwrap.entity.player.HungerManager(net.minecraft.entity.player.PlayerEntity.getHungerManager()); }
// public void setShoulderEntityRight(yarnwrap.nbt.NbtCompound entityNbt) { wrapperContained.setShoulderEntityRight(entityNbt.wrapperContained); }
// public static void setShoulderEntityRight(yarnwrap.nbt.NbtCompound entityNbt, ) { net.minecraft.entity.player.PlayerEntity.setShoulderEntityRight(entityNbt.wrapperContained); }
// public void closeHandledScreen() { wrapperContained.closeHandledScreen(); }
// public static void closeHandledScreen() { net.minecraft.entity.player.PlayerEntity.closeHandledScreen(); }
public boolean isPartVisible(yarnwrap.entity.player.PlayerModelPart modelPart) { return wrapperContained.isPartVisible(modelPart.wrapperContained); }
// public static boolean isPartVisible(yarnwrap.entity.player.PlayerModelPart modelPart, ) { return net.minecraft.entity.player.PlayerEntity.isPartVisible(modelPart.wrapperContained); }
public int getNextLevelExperience() { return wrapperContained.getNextLevelExperience(); }
// public static int getNextLevelExperience() { return net.minecraft.entity.player.PlayerEntity.getNextLevelExperience(); }
public void resetLastAttackedTicks() { wrapperContained.resetLastAttackedTicks(); }
// public static void resetLastAttackedTicks() { net.minecraft.entity.player.PlayerEntity.resetLastAttackedTicks(); }
public float getBlockBreakingSpeed(yarnwrap.block.BlockState block) { return wrapperContained.getBlockBreakingSpeed(block.wrapperContained); }
// public static float getBlockBreakingSpeed(yarnwrap.block.BlockState block, ) { return net.minecraft.entity.player.PlayerEntity.getBlockBreakingSpeed(block.wrapperContained); }
public void sendMessage(yarnwrap.text.Text message,boolean overlay) { wrapperContained.sendMessage(message.wrapperContained,overlay); }
// public static void sendMessage(yarnwrap.text.Text message,boolean overlay, ) { net.minecraft.entity.player.PlayerEntity.sendMessage(message.wrapperContained,overlay); }
public void sendAbilitiesUpdate() { wrapperContained.sendAbilitiesUpdate(); }
// public static void sendAbilitiesUpdate() { net.minecraft.entity.player.PlayerEntity.sendAbilitiesUpdate(); }
public yarnwrap.nbt.NbtCompound getShoulderEntityLeft() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getShoulderEntityLeft()); }
// public static yarnwrap.nbt.NbtCompound getShoulderEntityLeft() { return new yarnwrap.nbt.NbtCompound(net.minecraft.entity.player.PlayerEntity.getShoulderEntityLeft()); }
public yarnwrap.entity.player.ItemCooldownManager getItemCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(wrapperContained.getItemCooldownManager()); }
// public static yarnwrap.entity.player.ItemCooldownManager getItemCooldownManager() { return new yarnwrap.entity.player.ItemCooldownManager(net.minecraft.entity.player.PlayerEntity.getItemCooldownManager()); }
public void wakeUp(boolean skipSleepTimer,boolean updateSleepingPlayers) { wrapperContained.wakeUp(skipSleepTimer,updateSleepingPlayers); }
// public static void wakeUp(boolean skipSleepTimer,boolean updateSleepingPlayers, ) { net.minecraft.entity.player.PlayerEntity.wakeUp(skipSleepTimer,updateSleepingPlayers); }

}