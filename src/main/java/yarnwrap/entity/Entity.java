package yarnwrap.entity;
public class Entity { public net.minecraft.entity.Entity wrapperContained; public Entity(net.minecraft.entity.Entity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ridingCooldown() { return wrapperContained.ridingCooldown; }
// public void ridingCooldown(int value) { wrapperContained.ridingCooldown = value; }
// public static int ridingCooldown() { return net.minecraft.entity.Entity.ridingCooldown; }
// public static void ridingCooldown(int value, ) { net.minecraft.entity.Entity.ridingCooldown = value; }

// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public static boolean onGround() { return net.minecraft.entity.Entity.onGround; }
// public static void onGround(boolean value, ) { net.minecraft.entity.Entity.onGround = value; }

// public boolean firstUpdate() { return wrapperContained.firstUpdate; }
// public void firstUpdate(boolean value) { wrapperContained.firstUpdate = value; }
// public static boolean firstUpdate() { return net.minecraft.entity.Entity.firstUpdate; }
// public static void firstUpdate(boolean value, ) { net.minecraft.entity.Entity.firstUpdate = value; }

// public int fireTicks() { return wrapperContained.fireTicks; }
// public void fireTicks(int value) { wrapperContained.fireTicks = value; }
// public static int fireTicks() { return net.minecraft.entity.Entity.fireTicks; }
// public static void fireTicks(int value, ) { net.minecraft.entity.Entity.fireTicks = value; }

// public boolean touchingWater() { return wrapperContained.touchingWater; }
// public void touchingWater(boolean value) { wrapperContained.touchingWater = value; }
// public static boolean touchingWater() { return net.minecraft.entity.Entity.touchingWater; }
// public static void touchingWater(boolean value, ) { net.minecraft.entity.Entity.touchingWater = value; }

// public boolean glowing() { return wrapperContained.glowing; }
// public void glowing(boolean value) { wrapperContained.glowing = value; }
// public static boolean glowing() { return net.minecraft.entity.Entity.glowing; }
// public static void glowing(boolean value, ) { net.minecraft.entity.Entity.glowing = value; }

public boolean noClip() { return wrapperContained.noClip; }
public void noClip(boolean value) { wrapperContained.noClip = value; }
// public static boolean noClip() { return net.minecraft.entity.Entity.noClip; }
// public static void noClip(boolean value, ) { net.minecraft.entity.Entity.noClip = value; }

// public yarnwrap.entity.EntityType type() { return new yarnwrap.entity.EntityType(wrapperContained.type); }
// public void type(yarnwrap.entity.EntityType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.entity.EntityType type() { return new yarnwrap.entity.EntityType(net.minecraft.entity.Entity.type); }
// public static void type(yarnwrap.entity.EntityType value, ) { net.minecraft.entity.Entity.type = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData SILENT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SILENT); }
// public void SILENT(yarnwrap.entity.data.TrackedData value) { wrapperContained.SILENT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SILENT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.Entity.SILENT); }
// public static void SILENT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.Entity.SILENT = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2DoubleMap fluidHeight() { return wrapperContained.fluidHeight; }
// public void fluidHeight(it.unimi.dsi.fastutil.objects.Object2DoubleMap value) { wrapperContained.fluidHeight = value; }
// public static it.unimi.dsi.fastutil.objects.Object2DoubleMap fluidHeight() { return net.minecraft.entity.Entity.fluidHeight; }
// public static void fluidHeight(it.unimi.dsi.fastutil.objects.Object2DoubleMap value, ) { net.minecraft.entity.Entity.fluidHeight = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.entity.Entity.pitch; }
// public static void pitch(float value, ) { net.minecraft.entity.Entity.pitch = value; }

public double lastZ() { return wrapperContained.lastZ; }
public void lastZ(double value) { wrapperContained.lastZ = value; }
// public static double lastZ() { return net.minecraft.entity.Entity.lastZ; }
// public static void lastZ(double value, ) { net.minecraft.entity.Entity.lastZ = value; }

public double lastRenderY() { return wrapperContained.lastRenderY; }
public void lastRenderY(double value) { wrapperContained.lastRenderY = value; }
// public static double lastRenderY() { return net.minecraft.entity.Entity.lastRenderY; }
// public static void lastRenderY(double value, ) { net.minecraft.entity.Entity.lastRenderY = value; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.entity.Entity.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.entity.Entity.random = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData NAME_VISIBLE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.NAME_VISIBLE); }
// public void NAME_VISIBLE(yarnwrap.entity.data.TrackedData value) { wrapperContained.NAME_VISIBLE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData NAME_VISIBLE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.Entity.NAME_VISIBLE); }
// public static void NAME_VISIBLE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.Entity.NAME_VISIBLE = value.wrapperContained; }

public boolean horizontalCollision() { return wrapperContained.horizontalCollision; }
public void horizontalCollision(boolean value) { wrapperContained.horizontalCollision = value; }
// public static boolean horizontalCollision() { return net.minecraft.entity.Entity.horizontalCollision; }
// public static void horizontalCollision(boolean value, ) { net.minecraft.entity.Entity.horizontalCollision = value; }

// public java.util.concurrent.atomic.AtomicInteger CURRENT_ID() { return wrapperContained.CURRENT_ID; }
// public void CURRENT_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.CURRENT_ID = value; }
// public static java.util.concurrent.atomic.AtomicInteger CURRENT_ID() { return net.minecraft.entity.Entity.CURRENT_ID; }
// public static void CURRENT_ID(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.entity.Entity.CURRENT_ID = value; }

// public com.google.common.collect.ImmutableList passengerList() { return wrapperContained.passengerList; }
// public void passengerList(com.google.common.collect.ImmutableList value) { wrapperContained.passengerList = value; }
// public static com.google.common.collect.ImmutableList passengerList() { return net.minecraft.entity.Entity.passengerList; }
// public static void passengerList(com.google.common.collect.ImmutableList value, ) { net.minecraft.entity.Entity.passengerList = value; }

// public java.lang.String uuidString() { return wrapperContained.uuidString; }
// public void uuidString(java.lang.String value) { wrapperContained.uuidString = value; }
// public static java.lang.String uuidString() { return net.minecraft.entity.Entity.uuidString; }
// public static void uuidString(java.lang.String value, ) { net.minecraft.entity.Entity.uuidString = value; }

public float lastYaw() { return wrapperContained.lastYaw; }
public void lastYaw(float value) { wrapperContained.lastYaw = value; }
// public static float lastYaw() { return net.minecraft.entity.Entity.lastYaw; }
// public static void lastYaw(float value, ) { net.minecraft.entity.Entity.lastYaw = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.entity.Entity.id; }
// public static void id(int value, ) { net.minecraft.entity.Entity.id = value; }

public double lastRenderZ() { return wrapperContained.lastRenderZ; }
public void lastRenderZ(double value) { wrapperContained.lastRenderZ = value; }
// public static double lastRenderZ() { return net.minecraft.entity.Entity.lastRenderZ; }
// public static void lastRenderZ(double value, ) { net.minecraft.entity.Entity.lastRenderZ = value; }

// public yarnwrap.entity.data.TrackedData FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FLAGS); }
// public void FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.Entity.FLAGS); }
// public static void FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.Entity.FLAGS = value.wrapperContained; }

public boolean verticalCollision() { return wrapperContained.verticalCollision; }
public void verticalCollision(boolean value) { wrapperContained.verticalCollision = value; }
// public static boolean verticalCollision() { return net.minecraft.entity.Entity.verticalCollision; }
// public static void verticalCollision(boolean value, ) { net.minecraft.entity.Entity.verticalCollision = value; }

// public double[] pistonMovementDelta() { return wrapperContained.pistonMovementDelta; }
// public void pistonMovementDelta(double[] value) { wrapperContained.pistonMovementDelta = value; }
// public static double[] pistonMovementDelta() { return net.minecraft.entity.Entity.pistonMovementDelta; }
// public static void pistonMovementDelta(double[] value, ) { net.minecraft.entity.Entity.pistonMovementDelta = value; }

public float distanceTraveled() { return wrapperContained.distanceTraveled; }
public void distanceTraveled(float value) { wrapperContained.distanceTraveled = value; }
// public static float distanceTraveled() { return net.minecraft.entity.Entity.distanceTraveled; }
// public static void distanceTraveled(float value, ) { net.minecraft.entity.Entity.distanceTraveled = value; }

// public yarnwrap.entity.data.TrackedData NO_GRAVITY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.NO_GRAVITY); }
// public void NO_GRAVITY(yarnwrap.entity.data.TrackedData value) { wrapperContained.NO_GRAVITY = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData NO_GRAVITY() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.Entity.NO_GRAVITY); }
// public static void NO_GRAVITY(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.Entity.NO_GRAVITY = value.wrapperContained; }

// public long pistonMovementTick() { return wrapperContained.pistonMovementTick; }
// public void pistonMovementTick(long value) { wrapperContained.pistonMovementTick = value; }
// public static long pistonMovementTick() { return net.minecraft.entity.Entity.pistonMovementTick; }
// public static void pistonMovementTick(long value, ) { net.minecraft.entity.Entity.pistonMovementTick = value; }

// public double renderDistanceMultiplier() { return wrapperContained.renderDistanceMultiplier; }
// public void renderDistanceMultiplier(double value) { wrapperContained.renderDistanceMultiplier = value; }
// public static double renderDistanceMultiplier() { return net.minecraft.entity.Entity.renderDistanceMultiplier; }
// public static void renderDistanceMultiplier(double value, ) { net.minecraft.entity.Entity.renderDistanceMultiplier = value; }

// public boolean submergedInWater() { return wrapperContained.submergedInWater; }
// public void submergedInWater(boolean value) { wrapperContained.submergedInWater = value; }
// public static boolean submergedInWater() { return net.minecraft.entity.Entity.submergedInWater; }
// public static void submergedInWater(boolean value, ) { net.minecraft.entity.Entity.submergedInWater = value; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.entity.Entity.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.entity.Entity.world = value.wrapperContained; }

// public float nextStepSoundDistance() { return wrapperContained.nextStepSoundDistance; }
// public void nextStepSoundDistance(float value) { wrapperContained.nextStepSoundDistance = value; }
// public static float nextStepSoundDistance() { return net.minecraft.entity.Entity.nextStepSoundDistance; }
// public static void nextStepSoundDistance(float value, ) { net.minecraft.entity.Entity.nextStepSoundDistance = value; }

public float lastPitch() { return wrapperContained.lastPitch; }
public void lastPitch(float value) { wrapperContained.lastPitch = value; }
// public static float lastPitch() { return net.minecraft.entity.Entity.lastPitch; }
// public static void lastPitch(float value, ) { net.minecraft.entity.Entity.lastPitch = value; }

// public yarnwrap.util.math.Box boundingBox() { return new yarnwrap.util.math.Box(wrapperContained.boundingBox); }
// public void boundingBox(yarnwrap.util.math.Box value) { wrapperContained.boundingBox = value.wrapperContained; }
// public static yarnwrap.util.math.Box boundingBox() { return new yarnwrap.util.math.Box(net.minecraft.entity.Entity.boundingBox); }
// public static void boundingBox(yarnwrap.util.math.Box value, ) { net.minecraft.entity.Entity.boundingBox = value.wrapperContained; }

public boolean velocityDirty() { return wrapperContained.velocityDirty; }
public void velocityDirty(boolean value) { wrapperContained.velocityDirty = value; }
// public static boolean velocityDirty() { return net.minecraft.entity.Entity.velocityDirty; }
// public static void velocityDirty(boolean value, ) { net.minecraft.entity.Entity.velocityDirty = value; }

public int timeUntilRegen() { return wrapperContained.timeUntilRegen; }
public void timeUntilRegen(int value) { wrapperContained.timeUntilRegen = value; }
// public static int timeUntilRegen() { return net.minecraft.entity.Entity.timeUntilRegen; }
// public static void timeUntilRegen(int value, ) { net.minecraft.entity.Entity.timeUntilRegen = value; }

// public boolean invulnerable() { return wrapperContained.invulnerable; }
// public void invulnerable(boolean value) { wrapperContained.invulnerable = value; }
// public static boolean invulnerable() { return net.minecraft.entity.Entity.invulnerable; }
// public static void invulnerable(boolean value, ) { net.minecraft.entity.Entity.invulnerable = value; }

// public yarnwrap.entity.data.DataTracker dataTracker() { return new yarnwrap.entity.data.DataTracker(wrapperContained.dataTracker); }
// public void dataTracker(yarnwrap.entity.data.DataTracker value) { wrapperContained.dataTracker = value.wrapperContained; }
// public static yarnwrap.entity.data.DataTracker dataTracker() { return new yarnwrap.entity.data.DataTracker(net.minecraft.entity.Entity.dataTracker); }
// public static void dataTracker(yarnwrap.entity.data.DataTracker value, ) { net.minecraft.entity.Entity.dataTracker = value.wrapperContained; }

public int age() { return wrapperContained.age; }
public void age(int value) { wrapperContained.age = value; }
// public static int age() { return net.minecraft.entity.Entity.age; }
// public static void age(int value, ) { net.minecraft.entity.Entity.age = value; }

public double lastX() { return wrapperContained.lastX; }
public void lastX(double value) { wrapperContained.lastX = value; }
// public static double lastX() { return net.minecraft.entity.Entity.lastX; }
// public static void lastX(double value, ) { net.minecraft.entity.Entity.lastX = value; }

public double fallDistance() { return wrapperContained.fallDistance; }
public void fallDistance(double value) { wrapperContained.fallDistance = value; }
// public static double fallDistance() { return net.minecraft.entity.Entity.fallDistance; }
// public static void fallDistance(double value, ) { net.minecraft.entity.Entity.fallDistance = value; }

// public int portalCooldown() { return wrapperContained.portalCooldown; }
// public void portalCooldown(int value) { wrapperContained.portalCooldown = value; }
// public static int portalCooldown() { return net.minecraft.entity.Entity.portalCooldown; }
// public static void portalCooldown(int value, ) { net.minecraft.entity.Entity.portalCooldown = value; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public static java.util.UUID uuid() { return net.minecraft.entity.Entity.uuid; }
// public static void uuid(java.util.UUID value, ) { net.minecraft.entity.Entity.uuid = value; }

// public yarnwrap.util.math.Box NULL_BOX() { return new yarnwrap.util.math.Box(wrapperContained.NULL_BOX); }
// public void NULL_BOX(yarnwrap.util.math.Box value) { wrapperContained.NULL_BOX = value.wrapperContained; }
// public static yarnwrap.util.math.Box NULL_BOX() { return new yarnwrap.util.math.Box(net.minecraft.entity.Entity.NULL_BOX); }
// public static void NULL_BOX(yarnwrap.util.math.Box value, ) { net.minecraft.entity.Entity.NULL_BOX = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData CUSTOM_NAME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CUSTOM_NAME); }
// public void CUSTOM_NAME(yarnwrap.entity.data.TrackedData value) { wrapperContained.CUSTOM_NAME = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CUSTOM_NAME() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.Entity.CUSTOM_NAME); }
// public static void CUSTOM_NAME(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.Entity.CUSTOM_NAME = value.wrapperContained; }

// public java.util.Set commandTags() { return wrapperContained.commandTags; }
// public void commandTags(java.util.Set value) { wrapperContained.commandTags = value; }
// public static java.util.Set commandTags() { return net.minecraft.entity.Entity.commandTags; }
// public static void commandTags(java.util.Set value, ) { net.minecraft.entity.Entity.commandTags = value; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.entity.Entity.yaw; }
// public static void yaw(float value, ) { net.minecraft.entity.Entity.yaw = value; }

// public yarnwrap.entity.data.TrackedData AIR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.AIR); }
// public void AIR(yarnwrap.entity.data.TrackedData value) { wrapperContained.AIR = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData AIR() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.Entity.AIR); }
// public static void AIR(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.Entity.AIR = value.wrapperContained; }

// public yarnwrap.entity.Entity vehicle() { return new yarnwrap.entity.Entity(wrapperContained.vehicle); }
// public void vehicle(yarnwrap.entity.Entity value) { wrapperContained.vehicle = value.wrapperContained; }
// public static yarnwrap.entity.Entity vehicle() { return new yarnwrap.entity.Entity(net.minecraft.entity.Entity.vehicle); }
// public static void vehicle(yarnwrap.entity.Entity value, ) { net.minecraft.entity.Entity.vehicle = value.wrapperContained; }

public double lastY() { return wrapperContained.lastY; }
public void lastY(double value) { wrapperContained.lastY = value; }
// public static double lastY() { return net.minecraft.entity.Entity.lastY; }
// public static void lastY(double value, ) { net.minecraft.entity.Entity.lastY = value; }

public boolean velocityModified() { return wrapperContained.velocityModified; }
public void velocityModified(boolean value) { wrapperContained.velocityModified = value; }
// public static boolean velocityModified() { return net.minecraft.entity.Entity.velocityModified; }
// public static void velocityModified(boolean value, ) { net.minecraft.entity.Entity.velocityModified = value; }

public double lastRenderX() { return wrapperContained.lastRenderX; }
public void lastRenderX(double value) { wrapperContained.lastRenderX = value; }
// public static double lastRenderX() { return net.minecraft.entity.Entity.lastRenderX; }
// public static void lastRenderX(double value, ) { net.minecraft.entity.Entity.lastRenderX = value; }

// public yarnwrap.util.math.Vec3d movementMultiplier() { return new yarnwrap.util.math.Vec3d(wrapperContained.movementMultiplier); }
// public void movementMultiplier(yarnwrap.util.math.Vec3d value) { wrapperContained.movementMultiplier = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d movementMultiplier() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.movementMultiplier); }
// public static void movementMultiplier(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.Entity.movementMultiplier = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData POSE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.POSE); }
// public void POSE(yarnwrap.entity.data.TrackedData value) { wrapperContained.POSE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData POSE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.Entity.POSE); }
// public static void POSE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.Entity.POSE = value.wrapperContained; }

// public yarnwrap.entity.EntityDimensions dimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.dimensions); }
// public void dimensions(yarnwrap.entity.EntityDimensions value) { wrapperContained.dimensions = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions dimensions() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.Entity.dimensions); }
// public static void dimensions(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.Entity.dimensions = value.wrapperContained; }

// public float standingEyeHeight() { return wrapperContained.standingEyeHeight; }
// public void standingEyeHeight(float value) { wrapperContained.standingEyeHeight = value; }
// public static float standingEyeHeight() { return net.minecraft.entity.Entity.standingEyeHeight; }
// public static void standingEyeHeight(float value, ) { net.minecraft.entity.Entity.standingEyeHeight = value; }

// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public void velocity(yarnwrap.util.math.Vec3d value) { wrapperContained.velocity = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.velocity); }
// public static void velocity(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.Entity.velocity = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.pos); }
// public static void pos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.Entity.pos = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.blockPos); }
// public void blockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.blockPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.Entity.blockPos); }
// public static void blockPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.Entity.blockPos = value.wrapperContained; }

public boolean intersectionChecked() { return wrapperContained.intersectionChecked; }
public void intersectionChecked(boolean value) { wrapperContained.intersectionChecked = value; }
// public static boolean intersectionChecked() { return net.minecraft.entity.Entity.intersectionChecked; }
// public static void intersectionChecked(boolean value, ) { net.minecraft.entity.Entity.intersectionChecked = value; }

// public java.util.Set submergedFluidTag() { return wrapperContained.submergedFluidTag; }
// public void submergedFluidTag(java.util.Set value) { wrapperContained.submergedFluidTag = value; }
// public static java.util.Set submergedFluidTag() { return net.minecraft.entity.Entity.submergedFluidTag; }
// public static void submergedFluidTag(java.util.Set value, ) { net.minecraft.entity.Entity.submergedFluidTag = value; }

// public int lastChimeAge() { return wrapperContained.lastChimeAge; }
// public void lastChimeAge(int value) { wrapperContained.lastChimeAge = value; }
// public static int lastChimeAge() { return net.minecraft.entity.Entity.lastChimeAge; }
// public static void lastChimeAge(int value, ) { net.minecraft.entity.Entity.lastChimeAge = value; }

// public Object removalReason() { return wrapperContained.removalReason; }
// // public void removalReason(Object value) { wrapperContained.removalReason = value; }
// // public static Object removalReason() { return net.minecraft.entity.Entity.removalReason; }
// // public static void removalReason(Object value, ) { net.minecraft.entity.Entity.removalReason = value; }

// public yarnwrap.world.entity.EntityChangeListener changeListener() { return new yarnwrap.world.entity.EntityChangeListener(wrapperContained.changeListener); }
// public void changeListener(yarnwrap.world.entity.EntityChangeListener value) { wrapperContained.changeListener = value.wrapperContained; }
// public static yarnwrap.world.entity.EntityChangeListener changeListener() { return new yarnwrap.world.entity.EntityChangeListener(net.minecraft.entity.Entity.changeListener); }
// public static void changeListener(yarnwrap.world.entity.EntityChangeListener value, ) { net.minecraft.entity.Entity.changeListener = value.wrapperContained; }

// public float lastChimeIntensity() { return wrapperContained.lastChimeIntensity; }
// public void lastChimeIntensity(float value) { wrapperContained.lastChimeIntensity = value; }
// public static float lastChimeIntensity() { return net.minecraft.entity.Entity.lastChimeIntensity; }
// public static void lastChimeIntensity(float value, ) { net.minecraft.entity.Entity.lastChimeIntensity = value; }

public boolean inPowderSnow() { return wrapperContained.inPowderSnow; }
public void inPowderSnow(boolean value) { wrapperContained.inPowderSnow = value; }
// public static boolean inPowderSnow() { return net.minecraft.entity.Entity.inPowderSnow; }
// public static void inPowderSnow(boolean value, ) { net.minecraft.entity.Entity.inPowderSnow = value; }

// public yarnwrap.entity.data.TrackedData FROZEN_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FROZEN_TICKS); }
// public void FROZEN_TICKS(yarnwrap.entity.data.TrackedData value) { wrapperContained.FROZEN_TICKS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData FROZEN_TICKS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.Entity.FROZEN_TICKS); }
// public static void FROZEN_TICKS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.Entity.FROZEN_TICKS = value.wrapperContained; }

public float speed() { return wrapperContained.speed; }
public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.Entity.speed; }
// public static void speed(float value, ) { net.minecraft.entity.Entity.speed = value; }

public boolean wasInPowderSnow() { return wrapperContained.wasInPowderSnow; }
public void wasInPowderSnow(boolean value) { wrapperContained.wasInPowderSnow = value; }
// public static boolean wasInPowderSnow() { return net.minecraft.entity.Entity.wasInPowderSnow; }
// public static void wasInPowderSnow(boolean value, ) { net.minecraft.entity.Entity.wasInPowderSnow = value; }

// public float DEFAULT_FRICTION() { return wrapperContained.DEFAULT_FRICTION; }
// public void DEFAULT_FRICTION(float value) { wrapperContained.DEFAULT_FRICTION = value; }
public static float DEFAULT_FRICTION() { return net.minecraft.entity.Entity.DEFAULT_FRICTION; }
// public static void DEFAULT_FRICTION(float value, ) { net.minecraft.entity.Entity.DEFAULT_FRICTION = value; }

// public float MIN_RISING_BUBBLE_COLUMN_SPEED() { return wrapperContained.MIN_RISING_BUBBLE_COLUMN_SPEED; }
// public void MIN_RISING_BUBBLE_COLUMN_SPEED(float value) { wrapperContained.MIN_RISING_BUBBLE_COLUMN_SPEED = value; }
public static float MIN_RISING_BUBBLE_COLUMN_SPEED() { return net.minecraft.entity.Entity.MIN_RISING_BUBBLE_COLUMN_SPEED; }
// public static void MIN_RISING_BUBBLE_COLUMN_SPEED(float value, ) { net.minecraft.entity.Entity.MIN_RISING_BUBBLE_COLUMN_SPEED = value; }

// public int SNEAKING_FLAG_INDEX() { return wrapperContained.SNEAKING_FLAG_INDEX; }
// public void SNEAKING_FLAG_INDEX(int value) { wrapperContained.SNEAKING_FLAG_INDEX = value; }
// public static int SNEAKING_FLAG_INDEX() { return net.minecraft.entity.Entity.SNEAKING_FLAG_INDEX; }
// public static void SNEAKING_FLAG_INDEX(int value, ) { net.minecraft.entity.Entity.SNEAKING_FLAG_INDEX = value; }

// public int SPRINTING_FLAG_INDEX() { return wrapperContained.SPRINTING_FLAG_INDEX; }
// public void SPRINTING_FLAG_INDEX(int value) { wrapperContained.SPRINTING_FLAG_INDEX = value; }
// public static int SPRINTING_FLAG_INDEX() { return net.minecraft.entity.Entity.SPRINTING_FLAG_INDEX; }
// public static void SPRINTING_FLAG_INDEX(int value, ) { net.minecraft.entity.Entity.SPRINTING_FLAG_INDEX = value; }

// public int SWIMMING_FLAG_INDEX() { return wrapperContained.SWIMMING_FLAG_INDEX; }
// public void SWIMMING_FLAG_INDEX(int value) { wrapperContained.SWIMMING_FLAG_INDEX = value; }
// public static int SWIMMING_FLAG_INDEX() { return net.minecraft.entity.Entity.SWIMMING_FLAG_INDEX; }
// public static void SWIMMING_FLAG_INDEX(int value, ) { net.minecraft.entity.Entity.SWIMMING_FLAG_INDEX = value; }

// public int INVISIBLE_FLAG_INDEX() { return wrapperContained.INVISIBLE_FLAG_INDEX; }
// public void INVISIBLE_FLAG_INDEX(int value) { wrapperContained.INVISIBLE_FLAG_INDEX = value; }
// public static int INVISIBLE_FLAG_INDEX() { return net.minecraft.entity.Entity.INVISIBLE_FLAG_INDEX; }
// public static void INVISIBLE_FLAG_INDEX(int value, ) { net.minecraft.entity.Entity.INVISIBLE_FLAG_INDEX = value; }

// public int ON_FIRE_FLAG_INDEX() { return wrapperContained.ON_FIRE_FLAG_INDEX; }
// public void ON_FIRE_FLAG_INDEX(int value) { wrapperContained.ON_FIRE_FLAG_INDEX = value; }
// public static int ON_FIRE_FLAG_INDEX() { return net.minecraft.entity.Entity.ON_FIRE_FLAG_INDEX; }
// public static void ON_FIRE_FLAG_INDEX(int value, ) { net.minecraft.entity.Entity.ON_FIRE_FLAG_INDEX = value; }

// public int GLOWING_FLAG_INDEX() { return wrapperContained.GLOWING_FLAG_INDEX; }
// public void GLOWING_FLAG_INDEX(int value) { wrapperContained.GLOWING_FLAG_INDEX = value; }
// public static int GLOWING_FLAG_INDEX() { return net.minecraft.entity.Entity.GLOWING_FLAG_INDEX; }
// public static void GLOWING_FLAG_INDEX(int value, ) { net.minecraft.entity.Entity.GLOWING_FLAG_INDEX = value; }

// public int GLIDING_FLAG_INDEX() { return wrapperContained.GLIDING_FLAG_INDEX; }
// public void GLIDING_FLAG_INDEX(int value) { wrapperContained.GLIDING_FLAG_INDEX = value; }
// public static int GLIDING_FLAG_INDEX() { return net.minecraft.entity.Entity.GLIDING_FLAG_INDEX; }
// public static void GLIDING_FLAG_INDEX(int value, ) { net.minecraft.entity.Entity.GLIDING_FLAG_INDEX = value; }

// public double SPEED_IN_LAVA_IN_NETHER() { return wrapperContained.SPEED_IN_LAVA_IN_NETHER; }
// public void SPEED_IN_LAVA_IN_NETHER(double value) { wrapperContained.SPEED_IN_LAVA_IN_NETHER = value; }
// public static double SPEED_IN_LAVA_IN_NETHER() { return net.minecraft.entity.Entity.SPEED_IN_LAVA_IN_NETHER; }
// public static void SPEED_IN_LAVA_IN_NETHER(double value, ) { net.minecraft.entity.Entity.SPEED_IN_LAVA_IN_NETHER = value; }

// public double SPEED_IN_LAVA() { return wrapperContained.SPEED_IN_LAVA; }
// public void SPEED_IN_LAVA(double value) { wrapperContained.SPEED_IN_LAVA = value; }
// public static double SPEED_IN_LAVA() { return net.minecraft.entity.Entity.SPEED_IN_LAVA; }
// public static void SPEED_IN_LAVA(double value, ) { net.minecraft.entity.Entity.SPEED_IN_LAVA = value; }

// public double SPEED_IN_WATER() { return wrapperContained.SPEED_IN_WATER; }
// public void SPEED_IN_WATER(double value) { wrapperContained.SPEED_IN_WATER = value; }
// public static double SPEED_IN_WATER() { return net.minecraft.entity.Entity.SPEED_IN_WATER; }
// public static void SPEED_IN_WATER(double value, ) { net.minecraft.entity.Entity.SPEED_IN_WATER = value; }

// public java.lang.String ID_KEY() { return wrapperContained.ID_KEY; }
// public void ID_KEY(java.lang.String value) { wrapperContained.ID_KEY = value; }
public static java.lang.String ID_KEY() { return net.minecraft.entity.Entity.ID_KEY; }
// public static void ID_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.ID_KEY = value; }

// public java.lang.String PASSENGERS_KEY() { return wrapperContained.PASSENGERS_KEY; }
// public void PASSENGERS_KEY(java.lang.String value) { wrapperContained.PASSENGERS_KEY = value; }
public static java.lang.String PASSENGERS_KEY() { return net.minecraft.entity.Entity.PASSENGERS_KEY; }
// public static void PASSENGERS_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.PASSENGERS_KEY = value; }

// public int MAX_RIDING_COOLDOWN() { return wrapperContained.MAX_RIDING_COOLDOWN; }
// public void MAX_RIDING_COOLDOWN(int value) { wrapperContained.MAX_RIDING_COOLDOWN = value; }
public static int MAX_RIDING_COOLDOWN() { return net.minecraft.entity.Entity.MAX_RIDING_COOLDOWN; }
// public static void MAX_RIDING_COOLDOWN(int value, ) { net.minecraft.entity.Entity.MAX_RIDING_COOLDOWN = value; }

// public int DEFAULT_PORTAL_COOLDOWN() { return wrapperContained.DEFAULT_PORTAL_COOLDOWN; }
// public void DEFAULT_PORTAL_COOLDOWN(int value) { wrapperContained.DEFAULT_PORTAL_COOLDOWN = value; }
public static int DEFAULT_PORTAL_COOLDOWN() { return net.minecraft.entity.Entity.DEFAULT_PORTAL_COOLDOWN; }
// public static void DEFAULT_PORTAL_COOLDOWN(int value, ) { net.minecraft.entity.Entity.DEFAULT_PORTAL_COOLDOWN = value; }

// public int MAX_COMMAND_TAGS() { return wrapperContained.MAX_COMMAND_TAGS; }
// public void MAX_COMMAND_TAGS(int value) { wrapperContained.MAX_COMMAND_TAGS = value; }
public static int MAX_COMMAND_TAGS() { return net.minecraft.entity.Entity.MAX_COMMAND_TAGS; }
// public static void MAX_COMMAND_TAGS(int value, ) { net.minecraft.entity.Entity.MAX_COMMAND_TAGS = value; }

// public int DEFAULT_MIN_FREEZE_DAMAGE_TICKS() { return wrapperContained.DEFAULT_MIN_FREEZE_DAMAGE_TICKS; }
// public void DEFAULT_MIN_FREEZE_DAMAGE_TICKS(int value) { wrapperContained.DEFAULT_MIN_FREEZE_DAMAGE_TICKS = value; }
public static int DEFAULT_MIN_FREEZE_DAMAGE_TICKS() { return net.minecraft.entity.Entity.DEFAULT_MIN_FREEZE_DAMAGE_TICKS; }
// public static void DEFAULT_MIN_FREEZE_DAMAGE_TICKS(int value, ) { net.minecraft.entity.Entity.DEFAULT_MIN_FREEZE_DAMAGE_TICKS = value; }

// public int FREEZING_DAMAGE_INTERVAL() { return wrapperContained.FREEZING_DAMAGE_INTERVAL; }
// public void FREEZING_DAMAGE_INTERVAL(int value) { wrapperContained.FREEZING_DAMAGE_INTERVAL = value; }
public static int FREEZING_DAMAGE_INTERVAL() { return net.minecraft.entity.Entity.FREEZING_DAMAGE_INTERVAL; }
// public static void FREEZING_DAMAGE_INTERVAL(int value, ) { net.minecraft.entity.Entity.FREEZING_DAMAGE_INTERVAL = value; }

// public java.lang.String UUID_KEY() { return wrapperContained.UUID_KEY; }
// public void UUID_KEY(java.lang.String value) { wrapperContained.UUID_KEY = value; }
public static java.lang.String UUID_KEY() { return net.minecraft.entity.Entity.UUID_KEY; }
// public static void UUID_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.UUID_KEY = value; }

// public boolean hasVisualFire() { return wrapperContained.hasVisualFire; }
// public void hasVisualFire(boolean value) { wrapperContained.hasVisualFire = value; }
// public static boolean hasVisualFire() { return net.minecraft.entity.Entity.hasVisualFire; }
// public static void hasVisualFire(boolean value, ) { net.minecraft.entity.Entity.hasVisualFire = value; }

public boolean collidedSoftly() { return wrapperContained.collidedSoftly; }
public void collidedSoftly(boolean value) { wrapperContained.collidedSoftly = value; }
// public static boolean collidedSoftly() { return net.minecraft.entity.Entity.collidedSoftly; }
// public static void collidedSoftly(boolean value, ) { net.minecraft.entity.Entity.collidedSoftly = value; }

// public yarnwrap.util.math.ChunkPos chunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.chunkPos); }
// public void chunkPos(yarnwrap.util.math.ChunkPos value) { wrapperContained.chunkPos = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkPos chunkPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.entity.Entity.chunkPos); }
// public static void chunkPos(yarnwrap.util.math.ChunkPos value, ) { net.minecraft.entity.Entity.chunkPos = value.wrapperContained; }

public boolean groundCollision() { return wrapperContained.groundCollision; }
public void groundCollision(boolean value) { wrapperContained.groundCollision = value; }
// public static boolean groundCollision() { return net.minecraft.entity.Entity.groundCollision; }
// public static void groundCollision(boolean value, ) { net.minecraft.entity.Entity.groundCollision = value; }

// public yarnwrap.entity.TrackedPosition trackedPosition() { return new yarnwrap.entity.TrackedPosition(wrapperContained.trackedPosition); }
// public void trackedPosition(yarnwrap.entity.TrackedPosition value) { wrapperContained.trackedPosition = value.wrapperContained; }
// public static yarnwrap.entity.TrackedPosition trackedPosition() { return new yarnwrap.entity.TrackedPosition(net.minecraft.entity.Entity.trackedPosition); }
// public static void trackedPosition(yarnwrap.entity.TrackedPosition value, ) { net.minecraft.entity.Entity.trackedPosition = value.wrapperContained; }

public java.util.Optional supportingBlockPos() { return wrapperContained.supportingBlockPos; }
public void supportingBlockPos(java.util.Optional value) { wrapperContained.supportingBlockPos = value; }
// public static java.util.Optional supportingBlockPos() { return net.minecraft.entity.Entity.supportingBlockPos; }
// public static void supportingBlockPos(java.util.Optional value, ) { net.minecraft.entity.Entity.supportingBlockPos = value; }

// public boolean forceUpdateSupportingBlockPos() { return wrapperContained.forceUpdateSupportingBlockPos; }
// public void forceUpdateSupportingBlockPos(boolean value) { wrapperContained.forceUpdateSupportingBlockPos = value; }
// public static boolean forceUpdateSupportingBlockPos() { return net.minecraft.entity.Entity.forceUpdateSupportingBlockPos; }
// public static void forceUpdateSupportingBlockPos(boolean value, ) { net.minecraft.entity.Entity.forceUpdateSupportingBlockPos = value; }

// public yarnwrap.block.BlockState stateAtPos() { return new yarnwrap.block.BlockState(wrapperContained.stateAtPos); }
// public void stateAtPos(yarnwrap.block.BlockState value) { wrapperContained.stateAtPos = value.wrapperContained; }
// public static yarnwrap.block.BlockState stateAtPos() { return new yarnwrap.block.BlockState(net.minecraft.entity.Entity.stateAtPos); }
// public static void stateAtPos(yarnwrap.block.BlockState value, ) { net.minecraft.entity.Entity.stateAtPos = value.wrapperContained; }

public yarnwrap.world.dimension.PortalManager portalManager() { return new yarnwrap.world.dimension.PortalManager(wrapperContained.portalManager); }
public void portalManager(yarnwrap.world.dimension.PortalManager value) { wrapperContained.portalManager = value.wrapperContained; }
// public static yarnwrap.world.dimension.PortalManager portalManager() { return new yarnwrap.world.dimension.PortalManager(net.minecraft.entity.Entity.portalManager); }
// public static void portalManager(yarnwrap.world.dimension.PortalManager value, ) { net.minecraft.entity.Entity.portalManager = value.wrapperContained; }

// public java.util.ArrayDeque queuedCollisionChecks() { return wrapperContained.queuedCollisionChecks; }
// // public void queuedCollisionChecks(java.util.ArrayDeque value) { wrapperContained.queuedCollisionChecks = value; }
// public static java.util.ArrayDeque queuedCollisionChecks() { return net.minecraft.entity.Entity.queuedCollisionChecks; }
// // public static void queuedCollisionChecks(java.util.ArrayDeque value, ) { net.minecraft.entity.Entity.queuedCollisionChecks = value; }

// public it.unimi.dsi.fastutil.longs.LongSet collidedBlockPositions() { return wrapperContained.collidedBlockPositions; }
// public void collidedBlockPositions(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.collidedBlockPositions = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet collidedBlockPositions() { return net.minecraft.entity.Entity.collidedBlockPositions; }
// public static void collidedBlockPositions(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.entity.Entity.collidedBlockPositions = value; }

// public Object collisionHandler() { return wrapperContained.collisionHandler; }
// // public void collisionHandler(Object value) { wrapperContained.collisionHandler = value; }
// // public static Object collisionHandler() { return net.minecraft.entity.Entity.collisionHandler; }
// // public static void collisionHandler(Object value, ) { net.minecraft.entity.Entity.collisionHandler = value; }

// public com.mojang.serialization.Codec TAG_LIST_CODEC() { return wrapperContained.TAG_LIST_CODEC; }
// public void TAG_LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TAG_LIST_CODEC = value; }
// public static com.mojang.serialization.Codec TAG_LIST_CODEC() { return net.minecraft.entity.Entity.TAG_LIST_CODEC; }
// public static void TAG_LIST_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.Entity.TAG_LIST_CODEC = value; }

// public java.util.List currentlyCheckedCollisions() { return wrapperContained.currentlyCheckedCollisions; }
// public void currentlyCheckedCollisions(java.util.List value) { wrapperContained.currentlyCheckedCollisions = value; }
// public static java.util.List currentlyCheckedCollisions() { return net.minecraft.entity.Entity.currentlyCheckedCollisions; }
// public static void currentlyCheckedCollisions(java.util.List value, ) { net.minecraft.entity.Entity.currentlyCheckedCollisions = value; }

// public com.google.common.collect.ImmutableList X_THEN_Z() { return wrapperContained.X_THEN_Z; }
// public void X_THEN_Z(com.google.common.collect.ImmutableList value) { wrapperContained.X_THEN_Z = value; }
// public static com.google.common.collect.ImmutableList X_THEN_Z() { return net.minecraft.entity.Entity.X_THEN_Z; }
// public static void X_THEN_Z(com.google.common.collect.ImmutableList value, ) { net.minecraft.entity.Entity.X_THEN_Z = value; }

// public com.google.common.collect.ImmutableList Z_THEN_X() { return wrapperContained.Z_THEN_X; }
// public void Z_THEN_X(com.google.common.collect.ImmutableList value) { wrapperContained.Z_THEN_X = value; }
// public static com.google.common.collect.ImmutableList Z_THEN_X() { return net.minecraft.entity.Entity.Z_THEN_X; }
// public static void Z_THEN_X(com.google.common.collect.ImmutableList value, ) { net.minecraft.entity.Entity.Z_THEN_X = value; }

// public java.lang.String CUSTOM_DATA_KEY() { return wrapperContained.CUSTOM_DATA_KEY; }
// public void CUSTOM_DATA_KEY(java.lang.String value) { wrapperContained.CUSTOM_DATA_KEY = value; }
// public static java.lang.String CUSTOM_DATA_KEY() { return net.minecraft.entity.Entity.CUSTOM_DATA_KEY; }
// public static void CUSTOM_DATA_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.CUSTOM_DATA_KEY = value; }

// public yarnwrap.component.type.NbtComponent customData() { return new yarnwrap.component.type.NbtComponent(wrapperContained.customData); }
// public void customData(yarnwrap.component.type.NbtComponent value) { wrapperContained.customData = value.wrapperContained; }
// public static yarnwrap.component.type.NbtComponent customData() { return new yarnwrap.component.type.NbtComponent(net.minecraft.entity.Entity.customData); }
// public static void customData(yarnwrap.component.type.NbtComponent value, ) { net.minecraft.entity.Entity.customData = value.wrapperContained; }

// public boolean alwaysSyncAbsolute() { return wrapperContained.alwaysSyncAbsolute; }
// public void alwaysSyncAbsolute(boolean value) { wrapperContained.alwaysSyncAbsolute = value; }
// public static boolean alwaysSyncAbsolute() { return net.minecraft.entity.Entity.alwaysSyncAbsolute; }
// public static void alwaysSyncAbsolute(boolean value, ) { net.minecraft.entity.Entity.alwaysSyncAbsolute = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.Entity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.Entity.LOGGER = value; }

// public java.lang.String MOTION_KEY() { return wrapperContained.MOTION_KEY; }
// public void MOTION_KEY(java.lang.String value) { wrapperContained.MOTION_KEY = value; }
// public static java.lang.String MOTION_KEY() { return net.minecraft.entity.Entity.MOTION_KEY; }
// public static void MOTION_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.MOTION_KEY = value; }

// public java.lang.String ROTATION_KEY() { return wrapperContained.ROTATION_KEY; }
// public void ROTATION_KEY(java.lang.String value) { wrapperContained.ROTATION_KEY = value; }
// public static java.lang.String ROTATION_KEY() { return net.minecraft.entity.Entity.ROTATION_KEY; }
// public static void ROTATION_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.ROTATION_KEY = value; }

// public java.lang.String PORTAL_COOLDOWN_KEY() { return wrapperContained.PORTAL_COOLDOWN_KEY; }
// public void PORTAL_COOLDOWN_KEY(java.lang.String value) { wrapperContained.PORTAL_COOLDOWN_KEY = value; }
// public static java.lang.String PORTAL_COOLDOWN_KEY() { return net.minecraft.entity.Entity.PORTAL_COOLDOWN_KEY; }
// public static void PORTAL_COOLDOWN_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.PORTAL_COOLDOWN_KEY = value; }

// public java.lang.String NO_GRAVITY_KEY() { return wrapperContained.NO_GRAVITY_KEY; }
// public void NO_GRAVITY_KEY(java.lang.String value) { wrapperContained.NO_GRAVITY_KEY = value; }
// public static java.lang.String NO_GRAVITY_KEY() { return net.minecraft.entity.Entity.NO_GRAVITY_KEY; }
// public static void NO_GRAVITY_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.NO_GRAVITY_KEY = value; }

// public java.lang.String AIR_KEY() { return wrapperContained.AIR_KEY; }
// public void AIR_KEY(java.lang.String value) { wrapperContained.AIR_KEY = value; }
// public static java.lang.String AIR_KEY() { return net.minecraft.entity.Entity.AIR_KEY; }
// public static void AIR_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.AIR_KEY = value; }

// public java.lang.String ON_GROUND_KEY() { return wrapperContained.ON_GROUND_KEY; }
// public void ON_GROUND_KEY(java.lang.String value) { wrapperContained.ON_GROUND_KEY = value; }
// public static java.lang.String ON_GROUND_KEY() { return net.minecraft.entity.Entity.ON_GROUND_KEY; }
// public static void ON_GROUND_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.ON_GROUND_KEY = value; }

// public java.lang.String FALL_DISTANCE_KEY() { return wrapperContained.FALL_DISTANCE_KEY; }
// public void FALL_DISTANCE_KEY(java.lang.String value) { wrapperContained.FALL_DISTANCE_KEY = value; }
// public static java.lang.String FALL_DISTANCE_KEY() { return net.minecraft.entity.Entity.FALL_DISTANCE_KEY; }
// public static void FALL_DISTANCE_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.FALL_DISTANCE_KEY = value; }

// public java.lang.String FIRE_KEY() { return wrapperContained.FIRE_KEY; }
// public void FIRE_KEY(java.lang.String value) { wrapperContained.FIRE_KEY = value; }
// public static java.lang.String FIRE_KEY() { return net.minecraft.entity.Entity.FIRE_KEY; }
// public static void FIRE_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.FIRE_KEY = value; }

// public java.lang.String SILENT_KEY() { return wrapperContained.SILENT_KEY; }
// public void SILENT_KEY(java.lang.String value) { wrapperContained.SILENT_KEY = value; }
// public static java.lang.String SILENT_KEY() { return net.minecraft.entity.Entity.SILENT_KEY; }
// public static void SILENT_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.SILENT_KEY = value; }

// public java.lang.String GLOWING_KEY() { return wrapperContained.GLOWING_KEY; }
// public void GLOWING_KEY(java.lang.String value) { wrapperContained.GLOWING_KEY = value; }
// public static java.lang.String GLOWING_KEY() { return net.minecraft.entity.Entity.GLOWING_KEY; }
// public static void GLOWING_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.GLOWING_KEY = value; }

// public java.lang.String INVULNERABLE_KEY() { return wrapperContained.INVULNERABLE_KEY; }
// public void INVULNERABLE_KEY(java.lang.String value) { wrapperContained.INVULNERABLE_KEY = value; }
// public static java.lang.String INVULNERABLE_KEY() { return net.minecraft.entity.Entity.INVULNERABLE_KEY; }
// public static void INVULNERABLE_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.INVULNERABLE_KEY = value; }

// public java.lang.String POS_KEY() { return wrapperContained.POS_KEY; }
// public void POS_KEY(java.lang.String value) { wrapperContained.POS_KEY = value; }
// public static java.lang.String POS_KEY() { return net.minecraft.entity.Entity.POS_KEY; }
// public static void POS_KEY(java.lang.String value, ) { net.minecraft.entity.Entity.POS_KEY = value; }

// public Entity(yarnwrap.entity.EntityType type,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.Entity(type.wrapperContained,world.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.entity.Entity.equals(o); }
// public void onBlockCollision(yarnwrap.block.BlockState state) { wrapperContained.onBlockCollision(state.wrapperContained); }
// public static void onBlockCollision(yarnwrap.block.BlockState state, ) { net.minecraft.entity.Entity.onBlockCollision(state.wrapperContained); }
// public void fall(double heightDifference,boolean onGround,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos landedPosition) { wrapperContained.fall(heightDifference,onGround,state.wrapperContained,landedPosition.wrapperContained); }
// public static void fall(double heightDifference,boolean onGround,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos landedPosition, ) { net.minecraft.entity.Entity.fall(heightDifference,onGround,state.wrapperContained,landedPosition.wrapperContained); }
public boolean isSprinting() { return wrapperContained.isSprinting(); }
// public static boolean isSprinting() { return net.minecraft.entity.Entity.isSprinting(); }
// public yarnwrap.sound.SoundEvent getSplashSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSplashSound()); }
// public static yarnwrap.sound.SoundEvent getSplashSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.Entity.getSplashSound()); }
public boolean hasPassenger(yarnwrap.entity.Entity passenger) { return wrapperContained.hasPassenger(passenger.wrapperContained); }
// public static boolean hasPassenger(yarnwrap.entity.Entity passenger, ) { return net.minecraft.entity.Entity.hasPassenger(passenger.wrapperContained); }
// public void addPassenger(yarnwrap.entity.Entity passenger) { wrapperContained.addPassenger(passenger.wrapperContained); }
// public static void addPassenger(yarnwrap.entity.Entity passenger, ) { net.minecraft.entity.Entity.addPassenger(passenger.wrapperContained); }
// public boolean doesNotCollide(yarnwrap.util.math.Box box) { return wrapperContained.doesNotCollide(box.wrapperContained); }
// public static boolean doesNotCollide(yarnwrap.util.math.Box box, ) { return net.minecraft.entity.Entity.doesNotCollide(box.wrapperContained); }
// public void updateSubmergedInWaterState() { wrapperContained.updateSubmergedInWaterState(); }
// public static void updateSubmergedInWaterState() { net.minecraft.entity.Entity.updateSubmergedInWaterState(); }
public yarnwrap.util.math.Vec3d getRotationVector(float pitch,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVector(pitch,yaw)); }
// public static yarnwrap.util.math.Vec3d getRotationVector(float pitch,float yaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getRotationVector(pitch,yaw)); }
// public void pushOutOfBlocks(double x,double y,double z) { wrapperContained.pushOutOfBlocks(x,y,z); }
// public static void pushOutOfBlocks(double x,double y,double z, ) { net.minecraft.entity.Entity.pushOutOfBlocks(x,y,z); }
public yarnwrap.sound.SoundCategory getSoundCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getSoundCategory()); }
// public static yarnwrap.sound.SoundCategory getSoundCategory() { return new yarnwrap.sound.SoundCategory(net.minecraft.entity.Entity.getSoundCategory()); }
public void setBodyYaw(float bodyYaw) { wrapperContained.setBodyYaw(bodyYaw); }
// public static void setBodyYaw(float bodyYaw, ) { net.minecraft.entity.Entity.setBodyYaw(bodyYaw); }
// public boolean shouldSetPositionOnLoad() { return wrapperContained.shouldSetPositionOnLoad(); }
// public static boolean shouldSetPositionOnLoad() { return net.minecraft.entity.Entity.shouldSetPositionOnLoad(); }
public void setOnFireFor(float seconds) { wrapperContained.setOnFireFor(seconds); }
// public static void setOnFireFor(float seconds, ) { net.minecraft.entity.Entity.setOnFireFor(seconds); }
public boolean shouldRender(double distance) { return wrapperContained.shouldRender(distance); }
// public static boolean shouldRender(double distance, ) { return net.minecraft.entity.Entity.shouldRender(distance); }
public void updatePositionAndAngles(double x,double y,double z,float yaw,float pitch) { wrapperContained.updatePositionAndAngles(x,y,z,yaw,pitch); }
// public static void updatePositionAndAngles(double x,double y,double z,float yaw,float pitch, ) { net.minecraft.entity.Entity.updatePositionAndAngles(x,y,z,yaw,pitch); }
public yarnwrap.entity.LivingEntity getControllingPassenger() { return new yarnwrap.entity.LivingEntity(wrapperContained.getControllingPassenger()); }
// public static yarnwrap.entity.LivingEntity getControllingPassenger() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.Entity.getControllingPassenger()); }
public boolean clientDamage(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.clientDamage(source.wrapperContained); }
// public static boolean clientDamage(yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.entity.Entity.clientDamage(source.wrapperContained); }
public void onPassengerLookAround(yarnwrap.entity.Entity passenger) { wrapperContained.onPassengerLookAround(passenger.wrapperContained); }
// public static void onPassengerLookAround(yarnwrap.entity.Entity passenger, ) { net.minecraft.entity.Entity.onPassengerLookAround(passenger.wrapperContained); }
public boolean isTeamPlayer(yarnwrap.scoreboard.AbstractTeam team) { return wrapperContained.isTeamPlayer(team.wrapperContained); }
// public static boolean isTeamPlayer(yarnwrap.scoreboard.AbstractTeam team, ) { return net.minecraft.entity.Entity.isTeamPlayer(team.wrapperContained); }
public void extinguish() { wrapperContained.extinguish(); }
// public static void extinguish() { net.minecraft.entity.Entity.extinguish(); }
// public void writeData(yarnwrap.storage.WriteView view) { wrapperContained.writeData(view.wrapperContained); }
// public static void writeData(yarnwrap.storage.WriteView view, ) { net.minecraft.entity.Entity.writeData(view.wrapperContained); }
public void setInvisible(boolean invisible) { wrapperContained.setInvisible(invisible); }
// public static void setInvisible(boolean invisible, ) { net.minecraft.entity.Entity.setInvisible(invisible); }
public double squaredDistanceTo(double x,double y,double z) { return wrapperContained.squaredDistanceTo(x,y,z); }
// public static double squaredDistanceTo(double x,double y,double z, ) { return net.minecraft.entity.Entity.squaredDistanceTo(x,y,z); }
// public void remove(Object reason) { wrapperContained.remove(reason); }
// public static void remove(Object reason, ) { net.minecraft.entity.Entity.remove(reason); }
// public void readData(yarnwrap.storage.ReadView view) { wrapperContained.readData(view.wrapperContained); }
// public static void readData(yarnwrap.storage.ReadView view, ) { net.minecraft.entity.Entity.readData(view.wrapperContained); }
// public void writeCustomData(yarnwrap.storage.WriteView view) { wrapperContained.writeCustomData(view.wrapperContained); }
// public static void writeCustomData(yarnwrap.storage.WriteView view, ) { net.minecraft.entity.Entity.writeCustomData(view.wrapperContained); }
// public java.lang.String getSavedEntityId() { return wrapperContained.getSavedEntityId(); }
// public static java.lang.String getSavedEntityId() { return net.minecraft.entity.Entity.getSavedEntityId(); }
public boolean doesNotCollide(double offsetX,double offsetY,double offsetZ) { return wrapperContained.doesNotCollide(offsetX,offsetY,offsetZ); }
// public static boolean doesNotCollide(double offsetX,double offsetY,double offsetZ, ) { return net.minecraft.entity.Entity.doesNotCollide(offsetX,offsetY,offsetZ); }
public boolean isInvulnerable() { return wrapperContained.isInvulnerable(); }
// public static boolean isInvulnerable() { return net.minecraft.entity.Entity.isInvulnerable(); }
public yarnwrap.block.piston.PistonBehavior getPistonBehavior() { return new yarnwrap.block.piston.PistonBehavior(wrapperContained.getPistonBehavior()); }
// public static yarnwrap.block.piston.PistonBehavior getPistonBehavior() { return new yarnwrap.block.piston.PistonBehavior(net.minecraft.entity.Entity.getPistonBehavior()); }
public boolean isImmuneToExplosion(yarnwrap.world.explosion.Explosion explosion) { return wrapperContained.isImmuneToExplosion(explosion.wrapperContained); }
// public static boolean isImmuneToExplosion(yarnwrap.world.explosion.Explosion explosion, ) { return net.minecraft.entity.Entity.isImmuneToExplosion(explosion.wrapperContained); }
public void setSneaking(boolean sneaking) { wrapperContained.setSneaking(sneaking); }
// public static void setSneaking(boolean sneaking, ) { net.minecraft.entity.Entity.setSneaking(sneaking); }
// public boolean saveData(yarnwrap.storage.WriteView view) { return wrapperContained.saveData(view.wrapperContained); }
// public static boolean saveData(yarnwrap.storage.WriteView view, ) { return net.minecraft.entity.Entity.saveData(view.wrapperContained); }
public yarnwrap.util.math.Vec3d getRotationVecClient() { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVecClient()); }
// public static yarnwrap.util.math.Vec3d getRotationVecClient() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getRotationVecClient()); }
public yarnwrap.util.ActionResult interactAt(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.Vec3d hitPos,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactAt(player.wrapperContained,hitPos.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactAt(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.Vec3d hitPos,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.entity.Entity.interactAt(player.wrapperContained,hitPos.wrapperContained,hand.wrapperContained)); }
public void setCustomName(yarnwrap.text.Text name) { wrapperContained.setCustomName(name.wrapperContained); }
// public static void setCustomName(yarnwrap.text.Text name, ) { net.minecraft.entity.Entity.setCustomName(name.wrapperContained); }
public yarnwrap.entity.Entity getRootVehicle() { return new yarnwrap.entity.Entity(wrapperContained.getRootVehicle()); }
// public static yarnwrap.entity.Entity getRootVehicle() { return new yarnwrap.entity.Entity(net.minecraft.entity.Entity.getRootVehicle()); }
public int getAir() { return wrapperContained.getAir(); }
// public static int getAir() { return net.minecraft.entity.Entity.getAir(); }
public void baseTick() { wrapperContained.baseTick(); }
// public static void baseTick() { net.minecraft.entity.Entity.baseTick(); }
public yarnwrap.server.command.ServerCommandSource getCommandSource(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource(world.wrapperContained)); }
// public static yarnwrap.server.command.ServerCommandSource getCommandSource(yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.entity.Entity.getCommandSource(world.wrapperContained)); }
// public yarnwrap.sound.SoundEvent getHighSpeedSplashSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getHighSpeedSplashSound()); }
// public static yarnwrap.sound.SoundEvent getHighSpeedSplashSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.Entity.getHighSpeedSplashSound()); }
public boolean isPushedByFluids() { return wrapperContained.isPushedByFluids(); }
// public static boolean isPushedByFluids() { return net.minecraft.entity.Entity.isPushedByFluids(); }
// public int getBurningDuration() { return wrapperContained.getBurningDuration(); }
// public static int getBurningDuration() { return net.minecraft.entity.Entity.getBurningDuration(); }
public boolean canBeSpectated(yarnwrap.server.network.ServerPlayerEntity spectator) { return wrapperContained.canBeSpectated(spectator.wrapperContained); }
// public static boolean canBeSpectated(yarnwrap.server.network.ServerPlayerEntity spectator, ) { return net.minecraft.entity.Entity.canBeSpectated(spectator.wrapperContained); }
public boolean isSwimming() { return wrapperContained.isSwimming(); }
// public static boolean isSwimming() { return net.minecraft.entity.Entity.isSwimming(); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
// public static yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(net.minecraft.entity.Entity.getServer()); }
public void updateTrackedHeadRotation(float yaw,int interpolationSteps) { wrapperContained.updateTrackedHeadRotation(yaw,interpolationSteps); }
// public static void updateTrackedHeadRotation(float yaw,int interpolationSteps, ) { net.minecraft.entity.Entity.updateTrackedHeadRotation(yaw,interpolationSteps); }
public void setInvulnerable(boolean invulnerable) { wrapperContained.setInvulnerable(invulnerable); }
// public static void setInvulnerable(boolean invulnerable, ) { net.minecraft.entity.Entity.setInvulnerable(invulnerable); }
public java.util.List getPassengerList() { return wrapperContained.getPassengerList(); }
// public static java.util.List getPassengerList() { return net.minecraft.entity.Entity.getPassengerList(); }
public yarnwrap.util.ActionResult interact(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interact(player.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interact(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.entity.Entity.interact(player.wrapperContained,hand.wrapperContained)); }
public boolean updateMovementInFluid(yarnwrap.registry.tag.TagKey tag,double speed) { return wrapperContained.updateMovementInFluid(tag.wrapperContained,speed); }
// public static boolean updateMovementInFluid(yarnwrap.registry.tag.TagKey tag,double speed, ) { return net.minecraft.entity.Entity.updateMovementInFluid(tag.wrapperContained,speed); }
// public void initDataTracker(Object builder) { wrapperContained.initDataTracker(builder); }
// public static void initDataTracker(Object builder, ) { net.minecraft.entity.Entity.initDataTracker(builder); }
public void onPlayerCollision(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onPlayerCollision(player.wrapperContained); }
// public static void onPlayerCollision(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.Entity.onPlayerCollision(player.wrapperContained); }
public float getPitch(float tickProgress) { return wrapperContained.getPitch(tickProgress); }
// public static float getPitch(float tickProgress, ) { return net.minecraft.entity.Entity.getPitch(tickProgress); }
public boolean canAvoidTraps() { return wrapperContained.canAvoidTraps(); }
// public static boolean canAvoidTraps() { return net.minecraft.entity.Entity.canAvoidTraps(); }
public void pushAwayFrom(yarnwrap.entity.Entity entity) { wrapperContained.pushAwayFrom(entity.wrapperContained); }
// public static void pushAwayFrom(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Entity.pushAwayFrom(entity.wrapperContained); }
public boolean handleAttack(yarnwrap.entity.Entity attacker) { return wrapperContained.handleAttack(attacker.wrapperContained); }
// public static boolean handleAttack(yarnwrap.entity.Entity attacker, ) { return net.minecraft.entity.Entity.handleAttack(attacker.wrapperContained); }
public yarnwrap.entity.ItemEntity dropStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,float yOffset) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropStack(world.wrapperContained,stack.wrapperContained,yOffset)); }
// public static yarnwrap.entity.ItemEntity dropStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,float yOffset, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.Entity.dropStack(world.wrapperContained,stack.wrapperContained,yOffset)); }
public void onBubbleColumnSurfaceCollision(boolean drag,yarnwrap.util.math.BlockPos pos) { wrapperContained.onBubbleColumnSurfaceCollision(drag,pos.wrapperContained); }
// public static void onBubbleColumnSurfaceCollision(boolean drag,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.Entity.onBubbleColumnSurfaceCollision(drag,pos.wrapperContained); }
public boolean isSilent() { return wrapperContained.isSilent(); }
// public static boolean isSilent() { return net.minecraft.entity.Entity.isSilent(); }
// public void lookAt(Object anchorPoint,yarnwrap.util.math.Vec3d target) { wrapperContained.lookAt(anchorPoint,target.wrapperContained); }
// public static void lookAt(Object anchorPoint,yarnwrap.util.math.Vec3d target, ) { net.minecraft.entity.Entity.lookAt(anchorPoint,target.wrapperContained); }
public boolean hasPassenger(java.util.function.Predicate predicate) { return wrapperContained.hasPassenger(predicate); }
// public static boolean hasPassenger(java.util.function.Predicate predicate, ) { return net.minecraft.entity.Entity.hasPassenger(predicate); }
public float getYaw(float tickProgress) { return wrapperContained.getYaw(tickProgress); }
// public static float getYaw(float tickProgress, ) { return net.minecraft.entity.Entity.getYaw(tickProgress); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemConvertible item) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(world.wrapperContained,item.wrapperContained)); }
// public static yarnwrap.entity.ItemEntity dropItem(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemConvertible item, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.Entity.dropItem(world.wrapperContained,item.wrapperContained)); }
public double squaredDistanceTo(yarnwrap.util.math.Vec3d vector) { return wrapperContained.squaredDistanceTo(vector.wrapperContained); }
// public static double squaredDistanceTo(yarnwrap.util.math.Vec3d vector, ) { return net.minecraft.entity.Entity.squaredDistanceTo(vector.wrapperContained); }
public boolean isLiving() { return wrapperContained.isLiving(); }
// public static boolean isLiving() { return net.minecraft.entity.Entity.isLiving(); }
// public void setRotation(float yaw,float pitch) { wrapperContained.setRotation(yaw,pitch); }
// public static void setRotation(float yaw,float pitch, ) { net.minecraft.entity.Entity.setRotation(yaw,pitch); }
public void handleStatus(byte status) { wrapperContained.handleStatus(status); }
// public static void handleStatus(byte status, ) { net.minecraft.entity.Entity.handleStatus(status); }
// public void playStepSound(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.playStepSound(pos.wrapperContained,state.wrapperContained); }
// public static void playStepSound(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.entity.Entity.playStepSound(pos.wrapperContained,state.wrapperContained); }
// public void checkWaterState() { wrapperContained.checkWaterState(); }
// public static void checkWaterState() { net.minecraft.entity.Entity.checkWaterState(); }
public boolean isSneaking() { return wrapperContained.isSneaking(); }
// public static boolean isSneaking() { return net.minecraft.entity.Entity.isSneaking(); }
public void updateKilledAdvancementCriterion(yarnwrap.entity.Entity entityKilled,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.updateKilledAdvancementCriterion(entityKilled.wrapperContained,damageSource.wrapperContained); }
// public static void updateKilledAdvancementCriterion(yarnwrap.entity.Entity entityKilled,yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.Entity.updateKilledAdvancementCriterion(entityKilled.wrapperContained,damageSource.wrapperContained); }
public float getBrightnessAtEyes() { return wrapperContained.getBrightnessAtEyes(); }
// public static float getBrightnessAtEyes() { return net.minecraft.entity.Entity.getBrightnessAtEyes(); }
public void copyPositionAndRotation(yarnwrap.entity.Entity entity) { wrapperContained.copyPositionAndRotation(entity.wrapperContained); }
// public static void copyPositionAndRotation(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Entity.copyPositionAndRotation(entity.wrapperContained); }
public yarnwrap.util.math.Vec3d getRotationVector() { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVector()); }
// public static yarnwrap.util.math.Vec3d getRotationVector() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getRotationVector()); }
public boolean isTouchingWaterOrRain() { return wrapperContained.isTouchingWaterOrRain(); }
// public static boolean isTouchingWaterOrRain() { return net.minecraft.entity.Entity.isTouchingWaterOrRain(); }
public boolean isTeammate(yarnwrap.entity.Entity other) { return wrapperContained.isTeammate(other.wrapperContained); }
// public static boolean isTeammate(yarnwrap.entity.Entity other, ) { return net.minecraft.entity.Entity.isTeammate(other.wrapperContained); }
public void updateVelocity(float speed,yarnwrap.util.math.Vec3d movementInput) { wrapperContained.updateVelocity(speed,movementInput.wrapperContained); }
// public static void updateVelocity(float speed,yarnwrap.util.math.Vec3d movementInput, ) { net.minecraft.entity.Entity.updateVelocity(speed,movementInput.wrapperContained); }
public void refreshPositionAndAngles(yarnwrap.util.math.BlockPos pos,float yaw,float pitch) { wrapperContained.refreshPositionAndAngles(pos.wrapperContained,yaw,pitch); }
// public static void refreshPositionAndAngles(yarnwrap.util.math.BlockPos pos,float yaw,float pitch, ) { net.minecraft.entity.Entity.refreshPositionAndAngles(pos.wrapperContained,yaw,pitch); }
public boolean shouldRender(double cameraX,double cameraY,double cameraZ) { return wrapperContained.shouldRender(cameraX,cameraY,cameraZ); }
// public static boolean shouldRender(double cameraX,double cameraY,double cameraZ, ) { return net.minecraft.entity.Entity.shouldRender(cameraX,cameraY,cameraZ); }
public void setSprinting(boolean sprinting) { wrapperContained.setSprinting(sprinting); }
// public static void setSprinting(boolean sprinting, ) { net.minecraft.entity.Entity.setSprinting(sprinting); }
// public void setFlag(int index,boolean value) { wrapperContained.setFlag(index,value); }
// public static void setFlag(int index,boolean value, ) { net.minecraft.entity.Entity.setFlag(index,value); }
public void setOnFireFromLava() { wrapperContained.setOnFireFromLava(); }
// public static void setOnFireFromLava() { net.minecraft.entity.Entity.setOnFireFromLava(); }
public yarnwrap.entity.Entity teleportTo(yarnwrap.world.TeleportTarget teleportTarget) { return new yarnwrap.entity.Entity(wrapperContained.teleportTo(teleportTarget.wrapperContained)); }
// public static yarnwrap.entity.Entity teleportTo(yarnwrap.world.TeleportTarget teleportTarget, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.Entity.teleportTo(teleportTarget.wrapperContained)); }
public boolean isAttackable() { return wrapperContained.isAttackable(); }
// public static boolean isAttackable() { return net.minecraft.entity.Entity.isAttackable(); }
public boolean shouldRenderName() { return wrapperContained.shouldRenderName(); }
// public static boolean shouldRenderName() { return net.minecraft.entity.Entity.shouldRenderName(); }
// public void playSwimSound(float volume) { wrapperContained.playSwimSound(volume); }
// public static void playSwimSound(float volume, ) { net.minecraft.entity.Entity.playSwimSound(volume); }
public yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getHorizontalFacing()); }
// public static yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(net.minecraft.entity.Entity.getHorizontalFacing()); }
public java.lang.Iterable getPassengersDeep() { return wrapperContained.getPassengersDeep(); }
// public static java.lang.Iterable getPassengersDeep() { return net.minecraft.entity.Entity.getPassengersDeep(); }
// public yarnwrap.sound.SoundEvent getSwimSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSwimSound()); }
// public static yarnwrap.sound.SoundEvent getSwimSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.Entity.getSwimSound()); }
public boolean removeCommandTag(java.lang.String tag) { return wrapperContained.removeCommandTag(tag); }
// public static boolean removeCommandTag(java.lang.String tag, ) { return net.minecraft.entity.Entity.removeCommandTag(tag); }
public float distanceTo(yarnwrap.entity.Entity entity) { return wrapperContained.distanceTo(entity.wrapperContained); }
// public static float distanceTo(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Entity.distanceTo(entity.wrapperContained); }
public boolean hasNoGravity() { return wrapperContained.hasNoGravity(); }
// public static boolean hasNoGravity() { return net.minecraft.entity.Entity.hasNoGravity(); }
public void onStoppedTrackingBy(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onStoppedTrackingBy(player.wrapperContained); }
// public static void onStoppedTrackingBy(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.Entity.onStoppedTrackingBy(player.wrapperContained); }
public yarnwrap.util.hit.HitResult raycast(double maxDistance,float tickProgress,boolean includeFluids) { return new yarnwrap.util.hit.HitResult(wrapperContained.raycast(maxDistance,tickProgress,includeFluids)); }
// public static yarnwrap.util.hit.HitResult raycast(double maxDistance,float tickProgress,boolean includeFluids, ) { return new yarnwrap.util.hit.HitResult(net.minecraft.entity.Entity.raycast(maxDistance,tickProgress,includeFluids)); }
// public void onSwimmingStart() { wrapperContained.onSwimmingStart(); }
// public static void onSwimmingStart() { net.minecraft.entity.Entity.onSwimmingStart(); }
public boolean handleFallDamage(double fallDistance,float damagePerDistance,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.handleFallDamage(fallDistance,damagePerDistance,damageSource.wrapperContained); }
// public static boolean handleFallDamage(double fallDistance,float damagePerDistance,yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.entity.Entity.handleFallDamage(fallDistance,damagePerDistance,damageSource.wrapperContained); }
public int getMaxAir() { return wrapperContained.getMaxAir(); }
// public static int getMaxAir() { return net.minecraft.entity.Entity.getMaxAir(); }
// public void readCustomData(yarnwrap.storage.ReadView view) { wrapperContained.readCustomData(view.wrapperContained); }
// public static void readCustomData(yarnwrap.storage.ReadView view, ) { net.minecraft.entity.Entity.readCustomData(view.wrapperContained); }
public void setVelocityClient(double x,double y,double z) { wrapperContained.setVelocityClient(x,y,z); }
// public static void setVelocityClient(double x,double y,double z, ) { net.minecraft.entity.Entity.setVelocityClient(x,y,z); }
public float getStandingEyeHeight() { return wrapperContained.getStandingEyeHeight(); }
// public static float getStandingEyeHeight() { return net.minecraft.entity.Entity.getStandingEyeHeight(); }
public java.util.Set getCommandTags() { return wrapperContained.getCommandTags(); }
// public static java.util.Set getCommandTags() { return net.minecraft.entity.Entity.getCommandTags(); }
public boolean isFireImmune() { return wrapperContained.isFireImmune(); }
// public static boolean isFireImmune() { return net.minecraft.entity.Entity.isFireImmune(); }
public yarnwrap.util.math.Direction getMovementDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getMovementDirection()); }
// public static yarnwrap.util.math.Direction getMovementDirection() { return new yarnwrap.util.math.Direction(net.minecraft.entity.Entity.getMovementDirection()); }
public boolean isInvisibleTo(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isInvisibleTo(player.wrapperContained); }
// public static boolean isInvisibleTo(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.Entity.isInvisibleTo(player.wrapperContained); }
public boolean isInsideWall() { return wrapperContained.isInsideWall(); }
// public static boolean isInsideWall() { return net.minecraft.entity.Entity.isInsideWall(); }
// public void tickPortalCooldown() { wrapperContained.tickPortalCooldown(); }
// public static void tickPortalCooldown() { net.minecraft.entity.Entity.tickPortalCooldown(); }
public void addVelocity(double deltaX,double deltaY,double deltaZ) { wrapperContained.addVelocity(deltaX,deltaY,deltaZ); }
// public static void addVelocity(double deltaX,double deltaY,double deltaZ, ) { net.minecraft.entity.Entity.addVelocity(deltaX,deltaY,deltaZ); }
public float applyMirror(yarnwrap.util.BlockMirror mirror) { return wrapperContained.applyMirror(mirror.wrapperContained); }
// public static float applyMirror(yarnwrap.util.BlockMirror mirror, ) { return net.minecraft.entity.Entity.applyMirror(mirror.wrapperContained); }
public void onBubbleColumnCollision(boolean drag) { wrapperContained.onBubbleColumnCollision(drag); }
// public static void onBubbleColumnCollision(boolean drag, ) { net.minecraft.entity.Entity.onBubbleColumnCollision(drag); }
public boolean hasVehicle() { return wrapperContained.hasVehicle(); }
// public static boolean hasVehicle() { return net.minecraft.entity.Entity.hasVehicle(); }
public boolean isInvisible() { return wrapperContained.isInvisible(); }
// public static boolean isInvisible() { return net.minecraft.entity.Entity.isInvisible(); }
public void kill(yarnwrap.server.world.ServerWorld world) { wrapperContained.kill(world.wrapperContained); }
// public static void kill(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.Entity.kill(world.wrapperContained); }
// public yarnwrap.text.HoverEvent getHoverEvent() { return new yarnwrap.text.HoverEvent(wrapperContained.getHoverEvent()); }
// public static yarnwrap.text.HoverEvent getHoverEvent() { return new yarnwrap.text.HoverEvent(net.minecraft.entity.Entity.getHoverEvent()); }
public boolean isInLava() { return wrapperContained.isInLava(); }
// public static boolean isInLava() { return net.minecraft.entity.Entity.isInLava(); }
public void removeAllPassengers() { wrapperContained.removeAllPassengers(); }
// public static void removeAllPassengers() { net.minecraft.entity.Entity.removeAllPassengers(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.Entity.tick(); }
public float getEffectiveExplosionResistance(yarnwrap.world.explosion.Explosion explosion,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState,float max) { return wrapperContained.getEffectiveExplosionResistance(explosion.wrapperContained,world.wrapperContained,pos.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained,max); }
// public static float getEffectiveExplosionResistance(yarnwrap.world.explosion.Explosion explosion,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState,float max, ) { return net.minecraft.entity.Entity.getEffectiveExplosionResistance(explosion.wrapperContained,world.wrapperContained,pos.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained,max); }
public yarnwrap.entity.ItemEntity dropStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropStack(world.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.entity.ItemEntity dropStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.Entity.dropStack(world.wrapperContained,stack.wrapperContained)); }
// public boolean isFlappingWings() { return wrapperContained.isFlappingWings(); }
// public static boolean isFlappingWings() { return net.minecraft.entity.Entity.isFlappingWings(); }
public boolean isSubmergedIn(yarnwrap.registry.tag.TagKey fluidTag) { return wrapperContained.isSubmergedIn(fluidTag.wrapperContained); }
// public static boolean isSubmergedIn(yarnwrap.registry.tag.TagKey fluidTag, ) { return net.minecraft.entity.Entity.isSubmergedIn(fluidTag.wrapperContained); }
// public boolean isBeingRainedOn() { return wrapperContained.isBeingRainedOn(); }
// public static boolean isBeingRainedOn() { return net.minecraft.entity.Entity.isBeingRainedOn(); }
public boolean isPartOf(yarnwrap.entity.Entity entity) { return wrapperContained.isPartOf(entity.wrapperContained); }
// public static boolean isPartOf(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Entity.isPartOf(entity.wrapperContained); }
public boolean addCommandTag(java.lang.String tag) { return wrapperContained.addCommandTag(tag); }
// public static boolean addCommandTag(java.lang.String tag, ) { return net.minecraft.entity.Entity.addCommandTag(tag); }
public yarnwrap.scoreboard.Team getScoreboardTeam() { return new yarnwrap.scoreboard.Team(wrapperContained.getScoreboardTeam()); }
// public static yarnwrap.scoreboard.Team getScoreboardTeam() { return new yarnwrap.scoreboard.Team(net.minecraft.entity.Entity.getScoreboardTeam()); }
public boolean hasPassengers() { return wrapperContained.hasPassengers(); }
// public static boolean hasPassengers() { return net.minecraft.entity.Entity.hasPassengers(); }
public void playSound(yarnwrap.sound.SoundEvent sound,float volume,float pitch) { wrapperContained.playSound(sound.wrapperContained,volume,pitch); }
// public static void playSound(yarnwrap.sound.SoundEvent sound,float volume,float pitch, ) { net.minecraft.entity.Entity.playSound(sound.wrapperContained,volume,pitch); }
public void move(yarnwrap.entity.MovementType type,yarnwrap.util.math.Vec3d movement) { wrapperContained.move(type.wrapperContained,movement.wrapperContained); }
// public static void move(yarnwrap.entity.MovementType type,yarnwrap.util.math.Vec3d movement, ) { net.minecraft.entity.Entity.move(type.wrapperContained,movement.wrapperContained); }
// public void scheduleVelocityUpdate() { wrapperContained.scheduleVelocityUpdate(); }
// public static void scheduleVelocityUpdate() { net.minecraft.entity.Entity.scheduleVelocityUpdate(); }
// public boolean saveSelfData(yarnwrap.storage.WriteView view) { return wrapperContained.saveSelfData(view.wrapperContained); }
// public static boolean saveSelfData(yarnwrap.storage.WriteView view, ) { return net.minecraft.entity.Entity.saveSelfData(view.wrapperContained); }
public void updateSwimming() { wrapperContained.updateSwimming(); }
// public static void updateSwimming() { net.minecraft.entity.Entity.updateSwimming(); }
public float getHeadYaw() { return wrapperContained.getHeadYaw(); }
// public static float getHeadYaw() { return net.minecraft.entity.Entity.getHeadYaw(); }
// public void removePassenger(yarnwrap.entity.Entity passenger) { wrapperContained.removePassenger(passenger.wrapperContained); }
// public static void removePassenger(yarnwrap.entity.Entity passenger, ) { net.minecraft.entity.Entity.removePassenger(passenger.wrapperContained); }
public boolean isConnectedThroughVehicle(yarnwrap.entity.Entity entity) { return wrapperContained.isConnectedThroughVehicle(entity.wrapperContained); }
// public static boolean isConnectedThroughVehicle(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Entity.isConnectedThroughVehicle(entity.wrapperContained); }
// public boolean getFlag(int index) { return wrapperContained.getFlag(index); }
// public static boolean getFlag(int index, ) { return net.minecraft.entity.Entity.getFlag(index); }
public void setSwimming(boolean swimming) { wrapperContained.setSwimming(swimming); }
// public static void setSwimming(boolean swimming, ) { net.minecraft.entity.Entity.setSwimming(swimming); }
public boolean isTouchingWater() { return wrapperContained.isTouchingWater(); }
// public static boolean isTouchingWater() { return net.minecraft.entity.Entity.isTouchingWater(); }
public void onStruckByLightning(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LightningEntity lightning) { wrapperContained.onStruckByLightning(world.wrapperContained,lightning.wrapperContained); }
// public static void onStruckByLightning(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LightningEntity lightning, ) { net.minecraft.entity.Entity.onStruckByLightning(world.wrapperContained,lightning.wrapperContained); }
// public void addFlapEffects() { wrapperContained.addFlapEffects(); }
// public static void addFlapEffects() { net.minecraft.entity.Entity.addFlapEffects(); }
public yarnwrap.util.math.Vec2f getRotationClient() { return new yarnwrap.util.math.Vec2f(wrapperContained.getRotationClient()); }
// public static yarnwrap.util.math.Vec2f getRotationClient() { return new yarnwrap.util.math.Vec2f(net.minecraft.entity.Entity.getRotationClient()); }
public void setSilent(boolean silent) { wrapperContained.setSilent(silent); }
// public static void setSilent(boolean silent, ) { net.minecraft.entity.Entity.setSilent(silent); }
public boolean startRiding(yarnwrap.entity.Entity entity) { return wrapperContained.startRiding(entity.wrapperContained); }
// public static boolean startRiding(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Entity.startRiding(entity.wrapperContained); }
public boolean isAlive() { return wrapperContained.isAlive(); }
// public static boolean isAlive() { return net.minecraft.entity.Entity.isAlive(); }
public int getDefaultPortalCooldown() { return wrapperContained.getDefaultPortalCooldown(); }
// public static int getDefaultPortalCooldown() { return net.minecraft.entity.Entity.getDefaultPortalCooldown(); }
public boolean isCustomNameVisible() { return wrapperContained.isCustomNameVisible(); }
// public static boolean isCustomNameVisible() { return net.minecraft.entity.Entity.isCustomNameVisible(); }
public void refreshPositionAndAngles(double x,double y,double z,float yaw,float pitch) { wrapperContained.refreshPositionAndAngles(x,y,z,yaw,pitch); }
// public static void refreshPositionAndAngles(double x,double y,double z,float yaw,float pitch, ) { net.minecraft.entity.Entity.refreshPositionAndAngles(x,y,z,yaw,pitch); }
public boolean isOnFire() { return wrapperContained.isOnFire(); }
// public static boolean isOnFire() { return net.minecraft.entity.Entity.isOnFire(); }
public boolean isPushable() { return wrapperContained.isPushable(); }
// public static boolean isPushable() { return net.minecraft.entity.Entity.isPushable(); }
// public yarnwrap.text.Style method_5813(yarnwrap.text.Style style) { return new yarnwrap.text.Style(wrapperContained.method_5813(style.wrapperContained)); }
// public static yarnwrap.text.Style method_5813(yarnwrap.text.Style style, ) { return new yarnwrap.text.Style(net.minecraft.entity.Entity.method_5813(style.wrapperContained)); }
public void setPosition(double x,double y,double z) { wrapperContained.setPosition(x,y,z); }
// public static void setPosition(double x,double y,double z, ) { net.minecraft.entity.Entity.setPosition(x,y,z); }
public boolean hasPlayerRider() { return wrapperContained.hasPlayerRider(); }
// public static boolean hasPlayerRider() { return net.minecraft.entity.Entity.hasPlayerRider(); }
// public boolean canAddPassenger(yarnwrap.entity.Entity passenger) { return wrapperContained.canAddPassenger(passenger.wrapperContained); }
// public static boolean canAddPassenger(yarnwrap.entity.Entity passenger, ) { return net.minecraft.entity.Entity.canAddPassenger(passenger.wrapperContained); }
public void populateCrashReport(yarnwrap.util.crash.CrashReportSection section) { wrapperContained.populateCrashReport(section.wrapperContained); }
// public static void populateCrashReport(yarnwrap.util.crash.CrashReportSection section, ) { net.minecraft.entity.Entity.populateCrashReport(section.wrapperContained); }
public boolean hasPassengerDeep(yarnwrap.entity.Entity passenger) { return wrapperContained.hasPassengerDeep(passenger.wrapperContained); }
// public static boolean hasPassengerDeep(yarnwrap.entity.Entity passenger, ) { return net.minecraft.entity.Entity.hasPassengerDeep(passenger.wrapperContained); }
public boolean canUsePortals(boolean allowVehicles) { return wrapperContained.canUsePortals(allowVehicles); }
// public static boolean canUsePortals(boolean allowVehicles, ) { return net.minecraft.entity.Entity.canUsePortals(allowVehicles); }
// public double getRenderDistanceMultiplier() { return wrapperContained.getRenderDistanceMultiplier(); }
public static double getRenderDistanceMultiplier() { return net.minecraft.entity.Entity.getRenderDistanceMultiplier(); }
// public void tickInVoid() { wrapperContained.tickInVoid(); }
// public static void tickInVoid() { net.minecraft.entity.Entity.tickInVoid(); }
public void setUuid(java.util.UUID uuid) { wrapperContained.setUuid(uuid); }
// public static void setUuid(java.util.UUID uuid, ) { net.minecraft.entity.Entity.setUuid(uuid); }
public yarnwrap.util.math.Vec3d getRotationVec(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVec(tickProgress)); }
// public static yarnwrap.util.math.Vec3d getRotationVec(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getRotationVec(tickProgress)); }
public float applyRotation(yarnwrap.util.BlockRotation rotation) { return wrapperContained.applyRotation(rotation.wrapperContained); }
// public static float applyRotation(yarnwrap.util.BlockRotation rotation, ) { return net.minecraft.entity.Entity.applyRotation(rotation.wrapperContained); }
public void setGlowing(boolean glowing) { wrapperContained.setGlowing(glowing); }
// public static void setGlowing(boolean glowing, ) { net.minecraft.entity.Entity.setGlowing(glowing); }
public yarnwrap.util.math.Vec3d getCameraPosVec(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.getCameraPosVec(tickProgress)); }
// public static yarnwrap.util.math.Vec3d getCameraPosVec(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getCameraPosVec(tickProgress)); }
public void onStartedTrackingBy(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onStartedTrackingBy(player.wrapperContained); }
// public static void onStartedTrackingBy(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.Entity.onStartedTrackingBy(player.wrapperContained); }
public void setId(int id) { wrapperContained.setId(id); }
// public static void setId(int id, ) { net.minecraft.entity.Entity.setId(id); }
// public void spawnSprintingParticles() { wrapperContained.spawnSprintingParticles(); }
// public static void spawnSprintingParticles() { net.minecraft.entity.Entity.spawnSprintingParticles(); }
// public void setRenderDistanceMultiplier(double value) { wrapperContained.setRenderDistanceMultiplier(value); }
// public static void setRenderDistanceMultiplier(double value, ) { net.minecraft.entity.Entity.setRenderDistanceMultiplier(value); }
public yarnwrap.entity.data.DataTracker getDataTracker() { return new yarnwrap.entity.data.DataTracker(wrapperContained.getDataTracker()); }
// public static yarnwrap.entity.data.DataTracker getDataTracker() { return new yarnwrap.entity.data.DataTracker(net.minecraft.entity.Entity.getDataTracker()); }
public void tickRiding() { wrapperContained.tickRiding(); }
// public static void tickRiding() { net.minecraft.entity.Entity.tickRiding(); }
public void slowMovement(yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d multiplier) { wrapperContained.slowMovement(state.wrapperContained,multiplier.wrapperContained); }
// public static void slowMovement(yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d multiplier, ) { net.minecraft.entity.Entity.slowMovement(state.wrapperContained,multiplier.wrapperContained); }
public java.lang.String getUuidAsString() { return wrapperContained.getUuidAsString(); }
// public static java.lang.String getUuidAsString() { return net.minecraft.entity.Entity.getUuidAsString(); }
public void setHeadYaw(float headYaw) { wrapperContained.setHeadYaw(headYaw); }
// public static void setHeadYaw(float headYaw, ) { net.minecraft.entity.Entity.setHeadYaw(headYaw); }
public void stopRiding() { wrapperContained.stopRiding(); }
// public static void stopRiding() { net.minecraft.entity.Entity.stopRiding(); }
public int getSafeFallDistance() { return wrapperContained.getSafeFallDistance(); }
// public static int getSafeFallDistance() { return net.minecraft.entity.Entity.getSafeFallDistance(); }
public boolean isGlowing() { return wrapperContained.isGlowing(); }
// public static boolean isGlowing() { return net.minecraft.entity.Entity.isGlowing(); }
public boolean canExplosionDestroyBlock(yarnwrap.world.explosion.Explosion explosion,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float explosionPower) { return wrapperContained.canExplosionDestroyBlock(explosion.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,explosionPower); }
// public static boolean canExplosionDestroyBlock(yarnwrap.world.explosion.Explosion explosion,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float explosionPower, ) { return net.minecraft.entity.Entity.canExplosionDestroyBlock(explosion.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,explosionPower); }
public yarnwrap.entity.Entity getVehicle() { return new yarnwrap.entity.Entity(wrapperContained.getVehicle()); }
// public static yarnwrap.entity.Entity getVehicle() { return new yarnwrap.entity.Entity(net.minecraft.entity.Entity.getVehicle()); }
public void setAir(int air) { wrapperContained.setAir(air); }
// public static void setAir(int air, ) { net.minecraft.entity.Entity.setAir(air); }
// public yarnwrap.text.Text removeClickEvents(yarnwrap.text.Text textComponent) { return new yarnwrap.text.Text(wrapperContained.removeClickEvents(textComponent.wrapperContained)); }
// public static yarnwrap.text.Text removeClickEvents(yarnwrap.text.Text textComponent, ) { return new yarnwrap.text.Text(net.minecraft.entity.Entity.removeClickEvents(textComponent.wrapperContained)); }
public void setBoundingBox(yarnwrap.util.math.Box boundingBox) { wrapperContained.setBoundingBox(boundingBox.wrapperContained); }
// public static void setBoundingBox(yarnwrap.util.math.Box boundingBox, ) { net.minecraft.entity.Entity.setBoundingBox(boundingBox.wrapperContained); }
public double squaredDistanceTo(yarnwrap.entity.Entity entity) { return wrapperContained.squaredDistanceTo(entity.wrapperContained); }
// public static double squaredDistanceTo(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Entity.squaredDistanceTo(entity.wrapperContained); }
public void requestTeleport(double destX,double destY,double destZ) { wrapperContained.requestTeleport(destX,destY,destZ); }
// public static void requestTeleport(double destX,double destY,double destZ, ) { net.minecraft.entity.Entity.requestTeleport(destX,destY,destZ); }
// public boolean canStartRiding(yarnwrap.entity.Entity entity) { return wrapperContained.canStartRiding(entity.wrapperContained); }
// public static boolean canStartRiding(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Entity.canStartRiding(entity.wrapperContained); }
public double getFluidHeight(yarnwrap.registry.tag.TagKey fluid) { return wrapperContained.getFluidHeight(fluid.wrapperContained); }
// public static double getFluidHeight(yarnwrap.registry.tag.TagKey fluid, ) { return net.minecraft.entity.Entity.getFluidHeight(fluid.wrapperContained); }
public boolean doesRenderOnFire() { return wrapperContained.doesRenderOnFire(); }
// public static boolean doesRenderOnFire() { return net.minecraft.entity.Entity.doesRenderOnFire(); }
public boolean canHit() { return wrapperContained.canHit(); }
// public static boolean canHit() { return net.minecraft.entity.Entity.canHit(); }
public yarnwrap.entity.EntityType getType() { return new yarnwrap.entity.EntityType(wrapperContained.getType()); }
// public static yarnwrap.entity.EntityType getType() { return new yarnwrap.entity.EntityType(net.minecraft.entity.Entity.getType()); }
// public void updatePassengerPosition(yarnwrap.entity.Entity passenger,Object positionUpdater) { wrapperContained.updatePassengerPosition(passenger.wrapperContained,positionUpdater); }
// public static void updatePassengerPosition(yarnwrap.entity.Entity passenger,Object positionUpdater, ) { net.minecraft.entity.Entity.updatePassengerPosition(passenger.wrapperContained,positionUpdater); }
// public float calculateNextStepSoundDistance() { return wrapperContained.calculateNextStepSoundDistance(); }
// public static float calculateNextStepSoundDistance() { return net.minecraft.entity.Entity.calculateNextStepSoundDistance(); }
public boolean isSubmergedInWater() { return wrapperContained.isSubmergedInWater(); }
// public static boolean isSubmergedInWater() { return net.minecraft.entity.Entity.isSubmergedInWater(); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemConvertible item,int offsetY) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(world.wrapperContained,item.wrapperContained,offsetY)); }
// public static yarnwrap.entity.ItemEntity dropItem(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemConvertible item,int offsetY, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.Entity.dropItem(world.wrapperContained,item.wrapperContained,offsetY)); }
public float getTargetingMargin() { return wrapperContained.getTargetingMargin(); }
// public static float getTargetingMargin() { return net.minecraft.entity.Entity.getTargetingMargin(); }
public void changeLookDirection(double cursorDeltaX,double cursorDeltaY) { wrapperContained.changeLookDirection(cursorDeltaX,cursorDeltaY); }
// public static void changeLookDirection(double cursorDeltaX,double cursorDeltaY, ) { net.minecraft.entity.Entity.changeLookDirection(cursorDeltaX,cursorDeltaY); }
public boolean startRiding(yarnwrap.entity.Entity entity,boolean force) { return wrapperContained.startRiding(entity.wrapperContained,force); }
// public static boolean startRiding(yarnwrap.entity.Entity entity,boolean force, ) { return net.minecraft.entity.Entity.startRiding(entity.wrapperContained,force); }
public boolean onKilledOther(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity other) { return wrapperContained.onKilledOther(world.wrapperContained,other.wrapperContained); }
// public static boolean onKilledOther(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity other, ) { return net.minecraft.entity.Entity.onKilledOther(world.wrapperContained,other.wrapperContained); }
public void setNoGravity(boolean noGravity) { wrapperContained.setNoGravity(noGravity); }
// public static void setNoGravity(boolean noGravity, ) { net.minecraft.entity.Entity.setNoGravity(noGravity); }
// public boolean updateWaterState() { return wrapperContained.updateWaterState(); }
// public static boolean updateWaterState() { return net.minecraft.entity.Entity.updateWaterState(); }
public void copyFrom(yarnwrap.entity.Entity original) { wrapperContained.copyFrom(original.wrapperContained); }
// public static void copyFrom(yarnwrap.entity.Entity original, ) { net.minecraft.entity.Entity.copyFrom(original.wrapperContained); }
public void animateDamage(float yaw) { wrapperContained.animateDamage(yaw); }
// public static void animateDamage(float yaw, ) { net.minecraft.entity.Entity.animateDamage(yaw); }
public void setCustomNameVisible(boolean visible) { wrapperContained.setCustomNameVisible(visible); }
// public static void setCustomNameVisible(boolean visible, ) { net.minecraft.entity.Entity.setCustomNameVisible(visible); }
public void checkDespawn() { wrapperContained.checkDespawn(); }
// public static void checkDespawn() { net.minecraft.entity.Entity.checkDespawn(); }
public java.util.Optional getLootTableKey() { return wrapperContained.getLootTableKey(); }
// public static java.util.Optional getLootTableKey() { return net.minecraft.entity.Entity.getLootTableKey(); }
public boolean canActVoluntarily() { return wrapperContained.canActVoluntarily(); }
// public static boolean canActVoluntarily() { return net.minecraft.entity.Entity.canActVoluntarily(); }
public boolean isSpectator() { return wrapperContained.isSpectator(); }
// public static boolean isSpectator() { return net.minecraft.entity.Entity.isSpectator(); }
// public double getGravity() { return wrapperContained.getGravity(); }
// public static double getGravity() { return net.minecraft.entity.Entity.getGravity(); }
public yarnwrap.util.math.BlockPos getWorldSpawnPos(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos basePos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getWorldSpawnPos(world.wrapperContained,basePos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getWorldSpawnPos(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos basePos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.Entity.getWorldSpawnPos(world.wrapperContained,basePos.wrapperContained)); }
public float getWidth() { return wrapperContained.getWidth(); }
// public static float getWidth() { return net.minecraft.entity.Entity.getWidth(); }
public float getHeight() { return wrapperContained.getHeight(); }
// public static float getHeight() { return net.minecraft.entity.Entity.getHeight(); }
// public yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.util.math.Vec3d movement) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForCollisions(movement.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.util.math.Vec3d movement, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.adjustMovementForCollisions(movement.wrapperContained)); }
public yarnwrap.network.packet.Packet createSpawnPacket(yarnwrap.server.network.EntityTrackerEntry entityTrackerEntry) { return new yarnwrap.network.packet.Packet(wrapperContained.createSpawnPacket(entityTrackerEntry.wrapperContained)); }
// public static yarnwrap.network.packet.Packet createSpawnPacket(yarnwrap.server.network.EntityTrackerEntry entityTrackerEntry, ) { return new yarnwrap.network.packet.Packet(net.minecraft.entity.Entity.createSpawnPacket(entityTrackerEntry.wrapperContained)); }
public boolean isInSneakingPose() { return wrapperContained.isInSneakingPose(); }
// public static boolean isInSneakingPose() { return net.minecraft.entity.Entity.isInSneakingPose(); }
public void detach() { wrapperContained.detach(); }
// public static void detach() { net.minecraft.entity.Entity.detach(); }
public yarnwrap.entity.EntityPose getPose() { return new yarnwrap.entity.EntityPose(wrapperContained.getPose()); }
// public static yarnwrap.entity.EntityPose getPose() { return new yarnwrap.entity.EntityPose(net.minecraft.entity.Entity.getPose()); }
public yarnwrap.entity.EntityDimensions getDimensions(yarnwrap.entity.EntityPose pose) { return new yarnwrap.entity.EntityDimensions(wrapperContained.getDimensions(pose.wrapperContained)); }
// public static yarnwrap.entity.EntityDimensions getDimensions(yarnwrap.entity.EntityPose pose, ) { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.Entity.getDimensions(pose.wrapperContained)); }
public void setPose(yarnwrap.entity.EntityPose pose) { wrapperContained.setPose(pose.wrapperContained); }
// public static void setPose(yarnwrap.entity.EntityPose pose, ) { net.minecraft.entity.Entity.setPose(pose.wrapperContained); }
public float getEyeHeight(yarnwrap.entity.EntityPose pose) { return wrapperContained.getEyeHeight(pose.wrapperContained); }
// public static float getEyeHeight(yarnwrap.entity.EntityPose pose, ) { return net.minecraft.entity.Entity.getEyeHeight(pose.wrapperContained); }
public void calculateDimensions() { wrapperContained.calculateDimensions(); }
// public static void calculateDimensions() { net.minecraft.entity.Entity.calculateDimensions(); }
// public yarnwrap.util.math.Vec3d adjustMovementForPiston(yarnwrap.util.math.Vec3d movement) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForPiston(movement.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d adjustMovementForPiston(yarnwrap.util.math.Vec3d movement, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.adjustMovementForPiston(movement.wrapperContained)); }
// public yarnwrap.util.math.Vec3d movementInputToVelocity(yarnwrap.util.math.Vec3d movementInput,float speed,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.movementInputToVelocity(movementInput.wrapperContained,speed,yaw)); }
// public static yarnwrap.util.math.Vec3d movementInputToVelocity(yarnwrap.util.math.Vec3d movementInput,float speed,float yaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.movementInputToVelocity(movementInput.wrapperContained,speed,yaw)); }
// public yarnwrap.util.math.Vec3d adjustMovementForSneaking(yarnwrap.util.math.Vec3d movement,yarnwrap.entity.MovementType type) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForSneaking(movement.wrapperContained,type.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d adjustMovementForSneaking(yarnwrap.util.math.Vec3d movement,yarnwrap.entity.MovementType type, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.adjustMovementForSneaking(movement.wrapperContained,type.wrapperContained)); }
// public double calculatePistonMovementFactor(Object axis,double offsetFactor) { return wrapperContained.calculatePistonMovementFactor(axis,offsetFactor); }
// public static double calculatePistonMovementFactor(Object axis,double offsetFactor, ) { return net.minecraft.entity.Entity.calculatePistonMovementFactor(axis,offsetFactor); }
public yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity()); }
// public static yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getVelocity()); }
public void setVelocity(yarnwrap.util.math.Vec3d velocity) { wrapperContained.setVelocity(velocity.wrapperContained); }
// public static void setVelocity(yarnwrap.util.math.Vec3d velocity, ) { net.minecraft.entity.Entity.setVelocity(velocity.wrapperContained); }
public void setVelocity(double x,double y,double z) { wrapperContained.setVelocity(x,y,z); }
// public static void setVelocity(double x,double y,double z, ) { net.minecraft.entity.Entity.setVelocity(x,y,z); }
// public yarnwrap.util.math.Vec3d getOppositeRotationVector(float pitch,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getOppositeRotationVector(pitch,yaw)); }
// public static yarnwrap.util.math.Vec3d getOppositeRotationVector(float pitch,float yaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getOppositeRotationVector(pitch,yaw)); }
public yarnwrap.util.math.Vec3d getOppositeRotationVector(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.getOppositeRotationVector(tickProgress)); }
// public static yarnwrap.util.math.Vec3d getOppositeRotationVector(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getOppositeRotationVector(tickProgress)); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getPos()); }
public boolean isInSwimmingPose() { return wrapperContained.isInSwimmingPose(); }
// public static boolean isInSwimmingPose() { return net.minecraft.entity.Entity.isInSwimmingPose(); }
public boolean isCrawling() { return wrapperContained.isCrawling(); }
// public static boolean isCrawling() { return net.minecraft.entity.Entity.isCrawling(); }
// public yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d movement,yarnwrap.util.math.Box entityBoundingBox,yarnwrap.world.World world,java.util.List collisions) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForCollisions(entity.wrapperContained,movement.wrapperContained,entityBoundingBox.wrapperContained,world.wrapperContained,collisions)); }
// public static yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d movement,yarnwrap.util.math.Box entityBoundingBox,yarnwrap.world.World world,java.util.List collisions, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.adjustMovementForCollisions(entity.wrapperContained,movement.wrapperContained,entityBoundingBox.wrapperContained,world.wrapperContained,collisions)); }
// public yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.util.math.Vec3d movement,yarnwrap.util.math.Box entityBoundingBox,java.util.List collisions) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForCollisions(movement.wrapperContained,entityBoundingBox.wrapperContained,collisions)); }
// public static yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.util.math.Vec3d movement,yarnwrap.util.math.Box entityBoundingBox,java.util.List collisions, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.adjustMovementForCollisions(movement.wrapperContained,entityBoundingBox.wrapperContained,collisions)); }
public int getFireTicks() { return wrapperContained.getFireTicks(); }
// public static int getFireTicks() { return net.minecraft.entity.Entity.getFireTicks(); }
public void setFireTicks(int fireTicks) { wrapperContained.setFireTicks(fireTicks); }
// public static void setFireTicks(int fireTicks, ) { net.minecraft.entity.Entity.setFireTicks(fireTicks); }
public boolean bypassesSteppingEffects() { return wrapperContained.bypassesSteppingEffects(); }
// public static boolean bypassesSteppingEffects() { return net.minecraft.entity.Entity.bypassesSteppingEffects(); }
public boolean bypassesLandingEffects() { return wrapperContained.bypassesLandingEffects(); }
// public static boolean bypassesLandingEffects() { return net.minecraft.entity.Entity.bypassesLandingEffects(); }
public boolean isSneaky() { return wrapperContained.isSneaky(); }
// public static boolean isSneaky() { return net.minecraft.entity.Entity.isSneaky(); }
public boolean isDescending() { return wrapperContained.isDescending(); }
// public static boolean isDescending() { return net.minecraft.entity.Entity.isDescending(); }
public int getTeamColorValue() { return wrapperContained.getTeamColorValue(); }
// public static int getTeamColorValue() { return net.minecraft.entity.Entity.getTeamColorValue(); }
public void resetPosition() { wrapperContained.resetPosition(); }
// public static void resetPosition() { net.minecraft.entity.Entity.resetPosition(); }
// public void refreshPosition() { wrapperContained.refreshPosition(); }
// public static void refreshPosition() { net.minecraft.entity.Entity.refreshPosition(); }
public yarnwrap.util.math.BlockPos getSteppingPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSteppingPos()); }
// public static yarnwrap.util.math.BlockPos getSteppingPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.Entity.getSteppingPos()); }
// public float getJumpVelocityMultiplier() { return wrapperContained.getJumpVelocityMultiplier(); }
// public static float getJumpVelocityMultiplier() { return net.minecraft.entity.Entity.getJumpVelocityMultiplier(); }
public yarnwrap.util.math.BlockPos getVelocityAffectingPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getVelocityAffectingPos()); }
// public static yarnwrap.util.math.BlockPos getVelocityAffectingPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.Entity.getVelocityAffectingPos()); }
// public yarnwrap.text.Text getDefaultName() { return new yarnwrap.text.Text(wrapperContained.getDefaultName()); }
// public static yarnwrap.text.Text getDefaultName() { return new yarnwrap.text.Text(net.minecraft.entity.Entity.getDefaultName()); }
public double getBodyX(double widthScale) { return wrapperContained.getBodyX(widthScale); }
// public static double getBodyX(double widthScale, ) { return net.minecraft.entity.Entity.getBodyX(widthScale); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.entity.Entity.getX(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.entity.Entity.getY(); }
public double getRandomBodyY() { return wrapperContained.getRandomBodyY(); }
// public static double getRandomBodyY() { return net.minecraft.entity.Entity.getRandomBodyY(); }
public double getEyeY() { return wrapperContained.getEyeY(); }
// public static double getEyeY() { return net.minecraft.entity.Entity.getEyeY(); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.entity.Entity.getZ(); }
public double getParticleX(double widthScale) { return wrapperContained.getParticleX(widthScale); }
// public static double getParticleX(double widthScale, ) { return net.minecraft.entity.Entity.getParticleX(widthScale); }
public double getBodyY(double heightScale) { return wrapperContained.getBodyY(heightScale); }
// public static double getBodyY(double heightScale, ) { return net.minecraft.entity.Entity.getBodyY(heightScale); }
public double getBodyZ(double widthScale) { return wrapperContained.getBodyZ(widthScale); }
// public static double getBodyZ(double widthScale, ) { return net.minecraft.entity.Entity.getBodyZ(widthScale); }
public double getParticleZ(double widthScale) { return wrapperContained.getParticleZ(widthScale); }
// public static double getParticleZ(double widthScale, ) { return net.minecraft.entity.Entity.getParticleZ(widthScale); }
// public float getVelocityMultiplier() { return wrapperContained.getVelocityMultiplier(); }
// public static float getVelocityMultiplier() { return net.minecraft.entity.Entity.getVelocityMultiplier(); }
public void setPos(double x,double y,double z) { wrapperContained.setPos(x,y,z); }
// public static void setPos(double x,double y,double z, ) { net.minecraft.entity.Entity.setPos(x,y,z); }
public void updatePassengerPosition(yarnwrap.entity.Entity passenger) { wrapperContained.updatePassengerPosition(passenger.wrapperContained); }
// // public static void updatePassengerPosition(yarnwrap.entity.Entity passenger, ) { net.minecraft.entity.Entity.updatePassengerPosition(passenger.wrapperContained); }
public void refreshPositionAfterTeleport(double x,double y,double z) { wrapperContained.refreshPositionAfterTeleport(x,y,z); }
// public static void refreshPositionAfterTeleport(double x,double y,double z, ) { net.minecraft.entity.Entity.refreshPositionAfterTeleport(x,y,z); }
public boolean isInRange(yarnwrap.entity.Entity entity,double radius) { return wrapperContained.isInRange(entity.wrapperContained,radius); }
// public static boolean isInRange(yarnwrap.entity.Entity entity,double radius, ) { return net.minecraft.entity.Entity.isInRange(entity.wrapperContained,radius); }
// public yarnwrap.util.math.Vec3d getPassengerDismountOffset(double vehicleWidth,double passengerWidth,float passengerYaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPassengerDismountOffset(vehicleWidth,passengerWidth,passengerYaw)); }
// public static yarnwrap.util.math.Vec3d getPassengerDismountOffset(double vehicleWidth,double passengerWidth,float passengerYaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getPassengerDismountOffset(vehicleWidth,passengerWidth,passengerYaw)); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
// public static boolean isOnGround() { return net.minecraft.entity.Entity.isOnGround(); }
public yarnwrap.util.math.Vec3d updatePassengerForDismount(yarnwrap.entity.LivingEntity passenger) { return new yarnwrap.util.math.Vec3d(wrapperContained.updatePassengerForDismount(passenger.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d updatePassengerForDismount(yarnwrap.entity.LivingEntity passenger, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.updatePassengerForDismount(passenger.wrapperContained)); }
public void setOnGround(boolean onGround) { wrapperContained.setOnGround(onGround); }
// public static void setOnGround(boolean onGround, ) { net.minecraft.entity.Entity.setOnGround(onGround); }
public yarnwrap.block.BlockState getSteppingBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getSteppingBlockState()); }
// public static yarnwrap.block.BlockState getSteppingBlockState() { return new yarnwrap.block.BlockState(net.minecraft.entity.Entity.getSteppingBlockState()); }
public boolean shouldSpawnSprintingParticles() { return wrapperContained.shouldSpawnSprintingParticles(); }
// public static boolean shouldSpawnSprintingParticles() { return net.minecraft.entity.Entity.shouldSpawnSprintingParticles(); }
public void dismountVehicle() { wrapperContained.dismountVehicle(); }
// public static void dismountVehicle() { net.minecraft.entity.Entity.dismountVehicle(); }
public double getSwimHeight() { return wrapperContained.getSwimHeight(); }
// public static double getSwimHeight() { return net.minecraft.entity.Entity.getSwimHeight(); }
public void refreshPositionAfterTeleport(yarnwrap.util.math.Vec3d pos) { wrapperContained.refreshPositionAfterTeleport(pos.wrapperContained); }
// public static void refreshPositionAfterTeleport(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.Entity.refreshPositionAfterTeleport(pos.wrapperContained); }
// public boolean method_30022(yarnwrap.util.math.Box pos) { return wrapperContained.method_30022(pos.wrapperContained); }
// public static boolean method_30022(yarnwrap.util.math.Box pos, ) { return net.minecraft.entity.Entity.method_30022(pos.wrapperContained); }
// public void removeFromDimension() { wrapperContained.removeFromDimension(); }
// public static void removeFromDimension() { net.minecraft.entity.Entity.removeFromDimension(); }
public void resetPortalCooldown() { wrapperContained.resetPortalCooldown(); }
// public static void resetPortalCooldown() { net.minecraft.entity.Entity.resetPortalCooldown(); }
public boolean hasPortalCooldown() { return wrapperContained.hasPortalCooldown(); }
// public static boolean hasPortalCooldown() { return net.minecraft.entity.Entity.hasPortalCooldown(); }
public boolean collidesWithStateAtPos(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.collidesWithStateAtPos(pos.wrapperContained,state.wrapperContained); }
// public static boolean collidesWithStateAtPos(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.entity.Entity.collidesWithStateAtPos(pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.util.math.Vec3d positionInPortal(Object portalAxis,Object portalRect) { return new yarnwrap.util.math.Vec3d(wrapperContained.positionInPortal(portalAxis,portalRect)); }
// public static yarnwrap.util.math.Vec3d positionInPortal(Object portalAxis,Object portalRect, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.positionInPortal(portalAxis,portalRect)); }
public void updatePosition(double x,double y,double z) { wrapperContained.updatePosition(x,y,z); }
// public static void updatePosition(double x,double y,double z, ) { net.minecraft.entity.Entity.updatePosition(x,y,z); }
// public boolean isCollidable(yarnwrap.entity.Entity entity) { return wrapperContained.isCollidable(entity.wrapperContained); }
// public static boolean isCollidable(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Entity.isCollidable(entity.wrapperContained); }
public boolean collidesWith(yarnwrap.entity.Entity other) { return wrapperContained.collidesWith(other.wrapperContained); }
// public static boolean collidesWith(yarnwrap.entity.Entity other, ) { return net.minecraft.entity.Entity.collidesWith(other.wrapperContained); }
public yarnwrap.util.math.Vec3d getLerpedPos(float deltaTicks) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLerpedPos(deltaTicks)); }
// public static yarnwrap.util.math.Vec3d getLerpedPos(float deltaTicks, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getLerpedPos(deltaTicks)); }
public yarnwrap.util.math.Vec3d getLeashPos(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLeashPos(tickProgress)); }
// public static yarnwrap.util.math.Vec3d getLeashPos(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getLeashPos(tickProgress)); }
public yarnwrap.util.math.Vec3d getClientCameraPosVec(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.getClientCameraPosVec(tickProgress)); }
// public static yarnwrap.util.math.Vec3d getClientCameraPosVec(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getClientCameraPosVec(tickProgress)); }
public void onSpawnPacket(yarnwrap.network.packet.s2c.play.EntitySpawnS2CPacket packet) { wrapperContained.onSpawnPacket(packet.wrapperContained); }
// public static void onSpawnPacket(yarnwrap.network.packet.s2c.play.EntitySpawnS2CPacket packet, ) { net.minecraft.entity.Entity.onSpawnPacket(packet.wrapperContained); }
public void discard() { wrapperContained.discard(); }
// public static void discard() { net.minecraft.entity.Entity.discard(); }
public void attemptTickInVoid() { wrapperContained.attemptTickInVoid(); }
// public static void attemptTickInVoid() { net.minecraft.entity.Entity.attemptTickInVoid(); }
// public boolean method_31475(yarnwrap.entity.Entity entity) { return wrapperContained.method_31475(entity.wrapperContained); }
// public static boolean method_31475(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.Entity.method_31475(entity.wrapperContained); }
public yarnwrap.util.math.ChunkPos getChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getChunkPos()); }
// public static yarnwrap.util.math.ChunkPos getChunkPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.entity.Entity.getChunkPos()); }
public int getBlockX() { return wrapperContained.getBlockX(); }
// public static int getBlockX() { return net.minecraft.entity.Entity.getBlockX(); }
public int getBlockY() { return wrapperContained.getBlockY(); }
// public static int getBlockY() { return net.minecraft.entity.Entity.getBlockY(); }
public int getBlockZ() { return wrapperContained.getBlockZ(); }
// public static int getBlockZ() { return net.minecraft.entity.Entity.getBlockZ(); }
public yarnwrap.item.ItemStack getPickBlockStack() { return new yarnwrap.item.ItemStack(wrapperContained.getPickBlockStack()); }
// public static yarnwrap.item.ItemStack getPickBlockStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.Entity.getPickBlockStack()); }
// public void unsetRemoved() { wrapperContained.unsetRemoved(); }
// public static void unsetRemoved() { net.minecraft.entity.Entity.unsetRemoved(); }
public yarnwrap.entity.Entity getFirstPassenger() { return new yarnwrap.entity.Entity(wrapperContained.getFirstPassenger()); }
// public static yarnwrap.entity.Entity getFirstPassenger() { return new yarnwrap.entity.Entity(net.minecraft.entity.Entity.getFirstPassenger()); }
// public java.util.stream.Stream streamIntoPassengers() { return wrapperContained.streamIntoPassengers(); }
// public static java.util.stream.Stream streamIntoPassengers() { return net.minecraft.entity.Entity.streamIntoPassengers(); }
public int getFrozenTicks() { return wrapperContained.getFrozenTicks(); }
// public static int getFrozenTicks() { return net.minecraft.entity.Entity.getFrozenTicks(); }
public float getFreezingScale() { return wrapperContained.getFreezingScale(); }
// public static float getFreezingScale() { return net.minecraft.entity.Entity.getFreezingScale(); }
public boolean isFrozen() { return wrapperContained.isFrozen(); }
// public static boolean isFrozen() { return net.minecraft.entity.Entity.isFrozen(); }
public int getMinFreezeDamageTicks() { return wrapperContained.getMinFreezeDamageTicks(); }
// public static int getMinFreezeDamageTicks() { return net.minecraft.entity.Entity.getMinFreezeDamageTicks(); }
public boolean canFreeze() { return wrapperContained.canFreeze(); }
// public static boolean canFreeze() { return net.minecraft.entity.Entity.canFreeze(); }
public void setFrozenTicks(int frozenTicks) { wrapperContained.setFrozenTicks(frozenTicks); }
// public static void setFrozenTicks(int frozenTicks, ) { net.minecraft.entity.Entity.setFrozenTicks(frozenTicks); }
public yarnwrap.inventory.StackReference getStackReference(int mappedIndex) { return new yarnwrap.inventory.StackReference(wrapperContained.getStackReference(mappedIndex)); }
// public static yarnwrap.inventory.StackReference getStackReference(int mappedIndex, ) { return new yarnwrap.inventory.StackReference(net.minecraft.entity.Entity.getStackReference(mappedIndex)); }
public void setInPowderSnow(boolean inPowderSnow) { wrapperContained.setInPowderSnow(inPowderSnow); }
// public static void setInPowderSnow(boolean inPowderSnow, ) { net.minecraft.entity.Entity.setInPowderSnow(inPowderSnow); }
public void emitGameEvent(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.entity.Entity entity) { wrapperContained.emitGameEvent(event.wrapperContained,entity.wrapperContained); }
// public static void emitGameEvent(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Entity.emitGameEvent(event.wrapperContained,entity.wrapperContained); }
public void emitGameEvent(yarnwrap.registry.entry.RegistryEntry event) { wrapperContained.emitGameEvent(event.wrapperContained); }
// public static void emitGameEvent(yarnwrap.registry.entry.RegistryEntry event, ) { net.minecraft.entity.Entity.emitGameEvent(event.wrapperContained); }
public boolean occludeVibrationSignals() { return wrapperContained.occludeVibrationSignals(); }
// public static boolean occludeVibrationSignals() { return net.minecraft.entity.Entity.occludeVibrationSignals(); }
// public yarnwrap.util.math.Box calculateBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.calculateBoundingBox()); }
// public static yarnwrap.util.math.Box calculateBoundingBox() { return new yarnwrap.util.math.Box(net.minecraft.entity.Entity.calculateBoundingBox()); }
public void requestTeleportAndDismount(double destX,double destY,double destZ) { wrapperContained.requestTeleportAndDismount(destX,destY,destZ); }
// public static void requestTeleportAndDismount(double destX,double destY,double destZ, ) { net.minecraft.entity.Entity.requestTeleportAndDismount(destX,destY,destZ); }
// public Object getMoveEffect() { return wrapperContained.getMoveEffect(); }
// public static Object getMoveEffect() { return net.minecraft.entity.Entity.getMoveEffect(); }
public yarnwrap.util.math.Vec3d getEyePos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getEyePos()); }
// public static yarnwrap.util.math.Vec3d getEyePos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getEyePos()); }
public void setOnFire(boolean onFire) { wrapperContained.setOnFire(onFire); }
// public static void setOnFire(boolean onFire, ) { net.minecraft.entity.Entity.setOnFire(onFire); }
// public void addAirTravelEffects() { wrapperContained.addAirTravelEffects(); }
// public static void addAirTravelEffects() { net.minecraft.entity.Entity.addAirTravelEffects(); }
public void setPosition(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPosition(pos.wrapperContained); }
// public static void setPosition(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.Entity.setPosition(pos.wrapperContained); }
public boolean isRegionUnloaded() { return wrapperContained.isRegionUnloaded(); }
// public static boolean isRegionUnloaded() { return net.minecraft.entity.Entity.isRegionUnloaded(); }
public Object getRemovalReason() { return wrapperContained.getRemovalReason(); }
// public static Object getRemovalReason() { return net.minecraft.entity.Entity.getRemovalReason(); }
public void onRemoved() { wrapperContained.onRemoved(); }
// public static void onRemoved() { net.minecraft.entity.Entity.onRemoved(); }
public boolean isGlowingLocal() { return wrapperContained.isGlowingLocal(); }
// public static boolean isGlowingLocal() { return net.minecraft.entity.Entity.isGlowingLocal(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.entity.Entity.getYaw(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.entity.Entity.getPitch(); }
public void setYaw(float yaw) { wrapperContained.setYaw(yaw); }
// public static void setYaw(float yaw, ) { net.minecraft.entity.Entity.setYaw(yaw); }
public void setPitch(float pitch) { wrapperContained.setPitch(pitch); }
// public static void setPitch(float pitch, ) { net.minecraft.entity.Entity.setPitch(pitch); }
public boolean canModifyAt(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canModifyAt(world.wrapperContained,pos.wrapperContained); }
// public static boolean canModifyAt(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.Entity.canModifyAt(world.wrapperContained,pos.wrapperContained); }
// public void playExtinguishSound() { wrapperContained.playExtinguishSound(); }
// public static void playExtinguishSound() { net.minecraft.entity.Entity.playExtinguishSound(); }
// public void playAmethystChimeSound() { wrapperContained.playAmethystChimeSound(); }
// public static void playAmethystChimeSound() { net.minecraft.entity.Entity.playAmethystChimeSound(); }
// public void method_37216(yarnwrap.entity.Entity player) { wrapperContained.method_37216(player.wrapperContained); }
// public static void method_37216(yarnwrap.entity.Entity player, ) { net.minecraft.entity.Entity.method_37216(player.wrapperContained); }
// public boolean method_37217(yarnwrap.entity.Entity passenger) { return wrapperContained.method_37217(passenger.wrapperContained); }
// public static boolean method_37217(yarnwrap.entity.Entity passenger, ) { return net.minecraft.entity.Entity.method_37217(passenger.wrapperContained); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public static yarnwrap.world.World getWorld() { return new yarnwrap.world.World(net.minecraft.entity.Entity.getWorld()); }
public void onLanding() { wrapperContained.onLanding(); }
// public static void onLanding() { net.minecraft.entity.Entity.onLanding(); }
// public boolean hasCollidedSoftly(yarnwrap.util.math.Vec3d adjustedMovement) { return wrapperContained.hasCollidedSoftly(adjustedMovement.wrapperContained); }
// public static boolean hasCollidedSoftly(yarnwrap.util.math.Vec3d adjustedMovement, ) { return net.minecraft.entity.Entity.hasCollidedSoftly(adjustedMovement.wrapperContained); }
public boolean shouldEscapePowderSnow() { return wrapperContained.shouldEscapePowderSnow(); }
// public static boolean shouldEscapePowderSnow() { return net.minecraft.entity.Entity.shouldEscapePowderSnow(); }
public yarnwrap.util.math.Vec3d getHandPosOffset(yarnwrap.item.Item item) { return new yarnwrap.util.math.Vec3d(wrapperContained.getHandPosOffset(item.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getHandPosOffset(yarnwrap.item.Item item, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getHandPosOffset(item.wrapperContained)); }
public boolean isInPose(yarnwrap.entity.EntityPose pose) { return wrapperContained.isInPose(pose.wrapperContained); }
// public static boolean isInPose(yarnwrap.entity.EntityPose pose, ) { return net.minecraft.entity.Entity.isInPose(pose.wrapperContained); }
public void updateEventHandler(java.util.function.BiConsumer callback) { wrapperContained.updateEventHandler(callback); }
// public static void updateEventHandler(java.util.function.BiConsumer callback, ) { net.minecraft.entity.Entity.updateEventHandler(callback); }
public boolean hasControllingPassenger() { return wrapperContained.hasControllingPassenger(); }
// public static boolean hasControllingPassenger() { return net.minecraft.entity.Entity.hasControllingPassenger(); }
public void playSoundIfNotSilent(yarnwrap.sound.SoundEvent event) { wrapperContained.playSoundIfNotSilent(event.wrapperContained); }
// public static void playSoundIfNotSilent(yarnwrap.sound.SoundEvent event, ) { net.minecraft.entity.Entity.playSoundIfNotSilent(event.wrapperContained); }
public float getBodyYaw() { return wrapperContained.getBodyYaw(); }
// public static float getBodyYaw() { return net.minecraft.entity.Entity.getBodyYaw(); }
// public yarnwrap.util.math.BlockPos getPosWithYOffset(float offset) { return new yarnwrap.util.math.BlockPos(wrapperContained.getPosWithYOffset(offset)); }
// public static yarnwrap.util.math.BlockPos getPosWithYOffset(float offset, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.Entity.getPosWithYOffset(offset)); }
public boolean isInRange(yarnwrap.entity.Entity entity,double horizontalRadius,double verticalRadius) { return wrapperContained.isInRange(entity.wrapperContained,horizontalRadius,verticalRadius); }
// public static boolean isInRange(yarnwrap.entity.Entity entity,double horizontalRadius,double verticalRadius, ) { return net.minecraft.entity.Entity.isInRange(entity.wrapperContained,horizontalRadius,verticalRadius); }
public yarnwrap.util.math.BlockPos getLandingPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getLandingPos()); }
// public static yarnwrap.util.math.BlockPos getLandingPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.Entity.getLandingPos()); }
// public yarnwrap.block.BlockState getLandingBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getLandingBlockState()); }
// public static yarnwrap.block.BlockState getLandingBlockState() { return new yarnwrap.block.BlockState(net.minecraft.entity.Entity.getLandingBlockState()); }
public yarnwrap.entity.TrackedPosition getTrackedPosition() { return new yarnwrap.entity.TrackedPosition(wrapperContained.getTrackedPosition()); }
// public static yarnwrap.entity.TrackedPosition getTrackedPosition() { return new yarnwrap.entity.TrackedPosition(net.minecraft.entity.Entity.getTrackedPosition()); }
public yarnwrap.util.math.Vec3d getSyncedPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getSyncedPos()); }
// public static yarnwrap.util.math.Vec3d getSyncedPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getSyncedPos()); }
public void updateTrackedPosition(double x,double y,double z) { wrapperContained.updateTrackedPosition(x,y,z); }
// public static void updateTrackedPosition(double x,double y,double z, ) { net.minecraft.entity.Entity.updateTrackedPosition(x,y,z); }
public void requestTeleportOffset(double offsetX,double offsetY,double offsetZ) { wrapperContained.requestTeleportOffset(offsetX,offsetY,offsetZ); }
// public static void requestTeleportOffset(double offsetX,double offsetY,double offsetZ, ) { net.minecraft.entity.Entity.requestTeleportOffset(offsetX,offsetY,offsetZ); }
public void addVelocityInternal(yarnwrap.util.math.Vec3d velocity) { wrapperContained.addVelocityInternal(velocity.wrapperContained); }
// public static void addVelocityInternal(yarnwrap.util.math.Vec3d velocity, ) { net.minecraft.entity.Entity.addVelocityInternal(velocity.wrapperContained); }
public void extinguishWithSound() { wrapperContained.extinguishWithSound(); }
// public static void extinguishWithSound() { net.minecraft.entity.Entity.extinguishWithSound(); }
// public void reinitDimensions() { wrapperContained.reinitDimensions(); }
// public static void reinitDimensions() { net.minecraft.entity.Entity.reinitDimensions(); }
public boolean teleport(yarnwrap.server.world.ServerWorld world,double destX,double destY,double destZ,java.util.Set flags,float yaw,float pitch,boolean resetCamera) { return wrapperContained.teleport(world.wrapperContained,destX,destY,destZ,flags,yaw,pitch,resetCamera); }
// public static boolean teleport(yarnwrap.server.world.ServerWorld world,double destX,double destY,double destZ,java.util.Set flags,float yaw,float pitch,boolean resetCamera, ) { return net.minecraft.entity.Entity.teleport(world.wrapperContained,destX,destY,destZ,flags,yaw,pitch,resetCamera); }
public boolean canSprintAsVehicle() { return wrapperContained.canSprintAsVehicle(); }
// public static boolean canSprintAsVehicle() { return net.minecraft.entity.Entity.canSprintAsVehicle(); }
// public boolean couldAcceptPassenger() { return wrapperContained.couldAcceptPassenger(); }
// public static boolean couldAcceptPassenger() { return net.minecraft.entity.Entity.couldAcceptPassenger(); }
public void onDamaged(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.onDamaged(damageSource.wrapperContained); }
// public static void onDamaged(yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.Entity.onDamaged(damageSource.wrapperContained); }
public yarnwrap.entity.damage.DamageSources getDamageSources() { return new yarnwrap.entity.damage.DamageSources(wrapperContained.getDamageSources()); }
// public static yarnwrap.entity.damage.DamageSources getDamageSources() { return new yarnwrap.entity.damage.DamageSources(net.minecraft.entity.Entity.getDamageSources()); }
public boolean canBeHitByProjectile() { return wrapperContained.canBeHitByProjectile(); }
// public static boolean canBeHitByProjectile() { return net.minecraft.entity.Entity.canBeHitByProjectile(); }
public float getStepHeight() { return wrapperContained.getStepHeight(); }
// public static float getStepHeight() { return net.minecraft.entity.Entity.getStepHeight(); }
public boolean shouldDismountUnderwater() { return wrapperContained.shouldDismountUnderwater(); }
// public static boolean shouldDismountUnderwater() { return net.minecraft.entity.Entity.shouldDismountUnderwater(); }
public yarnwrap.entity.Entity getControllingVehicle() { return new yarnwrap.entity.Entity(wrapperContained.getControllingVehicle()); }
// public static yarnwrap.entity.Entity getControllingVehicle() { return new yarnwrap.entity.Entity(net.minecraft.entity.Entity.getControllingVehicle()); }
// public void playCombinationStepSounds(yarnwrap.block.BlockState primaryState,yarnwrap.block.BlockState secondaryState) { wrapperContained.playCombinationStepSounds(primaryState.wrapperContained,secondaryState.wrapperContained); }
// public static void playCombinationStepSounds(yarnwrap.block.BlockState primaryState,yarnwrap.block.BlockState secondaryState, ) { net.minecraft.entity.Entity.playCombinationStepSounds(primaryState.wrapperContained,secondaryState.wrapperContained); }
// public yarnwrap.util.math.BlockPos getStepSoundPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getStepSoundPos(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getStepSoundPos(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.Entity.getStepSoundPos(pos.wrapperContained)); }
// public void method_49789(yarnwrap.entity.Entity entity) { wrapperContained.method_49789(entity.wrapperContained); }
// public static void method_49789(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Entity.method_49789(entity.wrapperContained); }
// public boolean shouldPlayAmethystChimeSound(yarnwrap.block.BlockState state) { return wrapperContained.shouldPlayAmethystChimeSound(state.wrapperContained); }
// public static boolean shouldPlayAmethystChimeSound(yarnwrap.block.BlockState state, ) { return net.minecraft.entity.Entity.shouldPlayAmethystChimeSound(state.wrapperContained); }
// public void teleportPassengers() { wrapperContained.teleportPassengers(); }
// public static void teleportPassengers() { net.minecraft.entity.Entity.teleportPassengers(); }
// public void playSwimSound() { wrapperContained.playSwimSound(); }
// public static void playSwimSound() { net.minecraft.entity.Entity.playSwimSound(); }
// public void playSecondaryStepSound(yarnwrap.block.BlockState state) { wrapperContained.playSecondaryStepSound(state.wrapperContained); }
// public static void playSecondaryStepSound(yarnwrap.block.BlockState state, ) { net.minecraft.entity.Entity.playSecondaryStepSound(state.wrapperContained); }
// public void playStepSounds(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.playStepSounds(pos.wrapperContained,state.wrapperContained); }
// public static void playStepSounds(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.entity.Entity.playStepSounds(pos.wrapperContained,state.wrapperContained); }
// public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.world.World world, ) { net.minecraft.entity.Entity.setWorld(world.wrapperContained); }
// public yarnwrap.block.BlockState method_51700(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.method_51700(pos.wrapperContained)); }
// public static yarnwrap.block.BlockState method_51700(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.entity.Entity.method_51700(pos.wrapperContained)); }
// public boolean stepOnBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean playSound,boolean emitEvent,yarnwrap.util.math.Vec3d movement) { return wrapperContained.stepOnBlock(pos.wrapperContained,state.wrapperContained,playSound,emitEvent,movement.wrapperContained); }
// public static boolean stepOnBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean playSound,boolean emitEvent,yarnwrap.util.math.Vec3d movement, ) { return net.minecraft.entity.Entity.stepOnBlock(pos.wrapperContained,state.wrapperContained,playSound,emitEvent,movement.wrapperContained); }
// public boolean canClimb(yarnwrap.block.BlockState state) { return wrapperContained.canClimb(state.wrapperContained); }
// public static boolean canClimb(yarnwrap.block.BlockState state, ) { return net.minecraft.entity.Entity.canClimb(state.wrapperContained); }
// public void updateSupportingBlockPos(boolean onGround,yarnwrap.util.math.Vec3d movement) { wrapperContained.updateSupportingBlockPos(onGround,movement.wrapperContained); }
// public static void updateSupportingBlockPos(boolean onGround,yarnwrap.util.math.Vec3d movement, ) { net.minecraft.entity.Entity.updateSupportingBlockPos(onGround,movement.wrapperContained); }
public int getPortalCooldown() { return wrapperContained.getPortalCooldown(); }
// public static int getPortalCooldown() { return net.minecraft.entity.Entity.getPortalCooldown(); }
public boolean isSupportedBy(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSupportedBy(pos.wrapperContained); }
// public static boolean isSupportedBy(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.Entity.isSupportedBy(pos.wrapperContained); }
public void setPortalCooldown(int portalCooldown) { wrapperContained.setPortalCooldown(portalCooldown); }
// public static void setPortalCooldown(int portalCooldown, ) { net.minecraft.entity.Entity.setPortalCooldown(portalCooldown); }
public boolean isOnRail() { return wrapperContained.isOnRail(); }
// public static boolean isOnRail() { return net.minecraft.entity.Entity.isOnRail(); }
// public void lerpPosAndRotation(int step,double x,double y,double z,double yaw,double pitch) { wrapperContained.lerpPosAndRotation(step,x,y,z,yaw,pitch); }
// public static void lerpPosAndRotation(int step,double x,double y,double z,double yaw,double pitch, ) { net.minecraft.entity.Entity.lerpPosAndRotation(step,x,y,z,yaw,pitch); }
// public yarnwrap.util.math.Vec3d getPassengerAttachmentPos(yarnwrap.entity.Entity passenger,yarnwrap.entity.EntityDimensions dimensions,float scaleFactor) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPassengerAttachmentPos(passenger.wrapperContained,dimensions.wrapperContained,scaleFactor)); }
// public static yarnwrap.util.math.Vec3d getPassengerAttachmentPos(yarnwrap.entity.Entity passenger,yarnwrap.entity.EntityDimensions dimensions,float scaleFactor, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getPassengerAttachmentPos(passenger.wrapperContained,dimensions.wrapperContained,scaleFactor)); }
public boolean shouldControlVehicles() { return wrapperContained.shouldControlVehicles(); }
// public static boolean shouldControlVehicles() { return net.minecraft.entity.Entity.shouldControlVehicles(); }
public boolean isInFluid() { return wrapperContained.isInFluid(); }
// public static boolean isInFluid() { return net.minecraft.entity.Entity.isInFluid(); }
public yarnwrap.util.math.Vec3d getPassengerRidingPos(yarnwrap.entity.Entity passenger) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPassengerRidingPos(passenger.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getPassengerRidingPos(yarnwrap.entity.Entity passenger, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getPassengerRidingPos(passenger.wrapperContained)); }
// public boolean method_54756(yarnwrap.entity.Entity passenger) { return wrapperContained.method_54756(passenger.wrapperContained); }
// public static boolean method_54756(yarnwrap.entity.Entity passenger, ) { return net.minecraft.entity.Entity.method_54756(passenger.wrapperContained); }
public int getPlayerPassengers() { return wrapperContained.getPlayerPassengers(); }
// public static int getPlayerPassengers() { return net.minecraft.entity.Entity.getPlayerPassengers(); }
// public yarnwrap.util.math.Vec3d getPassengerAttachmentPos(yarnwrap.entity.Entity vehicle,yarnwrap.entity.Entity passenger,yarnwrap.entity.EntityAttachments attachments) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPassengerAttachmentPos(vehicle.wrapperContained,passenger.wrapperContained,attachments.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getPassengerAttachmentPos(yarnwrap.entity.Entity vehicle,yarnwrap.entity.Entity passenger,yarnwrap.entity.EntityAttachments attachments, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getPassengerAttachmentPos(vehicle.wrapperContained,passenger.wrapperContained,attachments.wrapperContained)); }
public yarnwrap.block.BlockState getBlockStateAtPos() { return new yarnwrap.block.BlockState(wrapperContained.getBlockStateAtPos()); }
// public static yarnwrap.block.BlockState getBlockStateAtPos() { return new yarnwrap.block.BlockState(net.minecraft.entity.Entity.getBlockStateAtPos()); }
public yarnwrap.util.math.Vec3d getVehicleAttachmentPos(yarnwrap.entity.Entity vehicle) { return new yarnwrap.util.math.Vec3d(wrapperContained.getVehicleAttachmentPos(vehicle.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getVehicleAttachmentPos(yarnwrap.entity.Entity vehicle, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getVehicleAttachmentPos(vehicle.wrapperContained)); }
public yarnwrap.entity.ProjectileDeflection getProjectileDeflection(yarnwrap.entity.projectile.ProjectileEntity projectile) { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.getProjectileDeflection(projectile.wrapperContained)); }
// public static yarnwrap.entity.ProjectileDeflection getProjectileDeflection(yarnwrap.entity.projectile.ProjectileEntity projectile, ) { return new yarnwrap.entity.ProjectileDeflection(net.minecraft.entity.Entity.getProjectileDeflection(projectile.wrapperContained)); }
public yarnwrap.entity.EntityAttachments getAttachments() { return new yarnwrap.entity.EntityAttachments(wrapperContained.getAttachments()); }
// public static yarnwrap.entity.EntityAttachments getAttachments() { return new yarnwrap.entity.EntityAttachments(net.minecraft.entity.Entity.getAttachments()); }
public void setOnFireForTicks(int ticks) { wrapperContained.setOnFireForTicks(ticks); }
// public static void setOnFireForTicks(int ticks, ) { net.minecraft.entity.Entity.setOnFireForTicks(ticks); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
// public static yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.entity.Entity.getRegistryManager()); }
public void onExplodedBy(yarnwrap.entity.Entity entity) { wrapperContained.onExplodedBy(entity.wrapperContained); }
// public static void onExplodedBy(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Entity.onExplodedBy(entity.wrapperContained); }
public double getFinalGravity() { return wrapperContained.getFinalGravity(); }
// public static double getFinalGravity() { return net.minecraft.entity.Entity.getFinalGravity(); }
// public void applyGravity() { wrapperContained.applyGravity(); }
// public static void applyGravity() { net.minecraft.entity.Entity.applyGravity(); }
public yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getFacing()); }
// public static yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(net.minecraft.entity.Entity.getFacing()); }
// public java.util.List findCollisionsForMovement(yarnwrap.entity.Entity entity,yarnwrap.world.World world,java.util.List regularCollisions,yarnwrap.util.math.Box movingEntityBoundingBox) { return wrapperContained.findCollisionsForMovement(entity.wrapperContained,world.wrapperContained,regularCollisions,movingEntityBoundingBox.wrapperContained); }
// public static java.util.List findCollisionsForMovement(yarnwrap.entity.Entity entity,yarnwrap.world.World world,java.util.List regularCollisions,yarnwrap.util.math.Box movingEntityBoundingBox, ) { return net.minecraft.entity.Entity.findCollisionsForMovement(entity.wrapperContained,world.wrapperContained,regularCollisions,movingEntityBoundingBox.wrapperContained); }
// public float[] collectStepHeights(yarnwrap.util.math.Box collisionBox,java.util.List collisions,float stepHeight) { return wrapperContained.collectStepHeights(collisionBox.wrapperContained,collisions,stepHeight); }
// public static float[] collectStepHeights(yarnwrap.util.math.Box collisionBox,java.util.List collisions,float stepHeight, ) { return net.minecraft.entity.Entity.collectStepHeights(collisionBox.wrapperContained,collisions,stepHeight); }
public yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom()); }
// public static yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(net.minecraft.entity.Entity.getRandom()); }
public yarnwrap.item.ItemStack getWeaponStack() { return new yarnwrap.item.ItemStack(wrapperContained.getWeaponStack()); }
// public static yarnwrap.item.ItemStack getWeaponStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.Entity.getWeaponStack()); }
public yarnwrap.util.math.Vec3d getMovement() { return new yarnwrap.util.math.Vec3d(wrapperContained.getMovement()); }
// public static yarnwrap.util.math.Vec3d getMovement() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getMovement()); }
public boolean recalculateDimensions(yarnwrap.entity.EntityDimensions previous) { return wrapperContained.recalculateDimensions(previous.wrapperContained); }
// public static boolean recalculateDimensions(yarnwrap.entity.EntityDimensions previous, ) { return net.minecraft.entity.Entity.recalculateDimensions(previous.wrapperContained); }
public void addVelocity(yarnwrap.util.math.Vec3d velocity) { wrapperContained.addVelocity(velocity.wrapperContained); }
// public static void addVelocity(yarnwrap.util.math.Vec3d velocity, ) { net.minecraft.entity.Entity.addVelocity(velocity.wrapperContained); }
public void setMovement(boolean onGround,boolean horizontalCollision,yarnwrap.util.math.Vec3d movement) { wrapperContained.setMovement(onGround,horizontalCollision,movement.wrapperContained); }
// public static void setMovement(boolean onGround,boolean horizontalCollision,yarnwrap.util.math.Vec3d movement, ) { net.minecraft.entity.Entity.setMovement(onGround,horizontalCollision,movement.wrapperContained); }
public void setAngles(float yaw,float pitch) { wrapperContained.setAngles(yaw,pitch); }
// public static void setAngles(float yaw,float pitch, ) { net.minecraft.entity.Entity.setAngles(yaw,pitch); }
public void tryUsePortal(yarnwrap.block.Portal portal,yarnwrap.util.math.BlockPos pos) { wrapperContained.tryUsePortal(portal.wrapperContained,pos.wrapperContained); }
// public static void tryUsePortal(yarnwrap.block.Portal portal,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.Entity.tryUsePortal(portal.wrapperContained,pos.wrapperContained); }
// public void tickPortalTeleportation() { wrapperContained.tickPortalTeleportation(); }
// public static void tickPortalTeleportation() { net.minecraft.entity.Entity.tickPortalTeleportation(); }
public void refreshPositionAndAngles(yarnwrap.util.math.Vec3d pos,float yaw,float pitch) { wrapperContained.refreshPositionAndAngles(pos.wrapperContained,yaw,pitch); }
// public static void refreshPositionAndAngles(yarnwrap.util.math.Vec3d pos,float yaw,float pitch, ) { net.minecraft.entity.Entity.refreshPositionAndAngles(pos.wrapperContained,yaw,pitch); }
public void addPortalChunkTicketAt(yarnwrap.util.math.BlockPos pos) { wrapperContained.addPortalChunkTicketAt(pos.wrapperContained); }
// public static void addPortalChunkTicketAt(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.Entity.addPortalChunkTicketAt(pos.wrapperContained); }
public float lerpYaw(float tickProgress) { return wrapperContained.lerpYaw(tickProgress); }
// public static float lerpYaw(float tickProgress, ) { return net.minecraft.entity.Entity.lerpYaw(tickProgress); }
public boolean canTeleportBetween(yarnwrap.world.World from,yarnwrap.world.World to) { return wrapperContained.canTeleportBetween(from.wrapperContained,to.wrapperContained); }
// public static boolean canTeleportBetween(yarnwrap.world.World from,yarnwrap.world.World to, ) { return net.minecraft.entity.Entity.canTeleportBetween(from.wrapperContained,to.wrapperContained); }
// public void applyMoveEffect(Object moveEffect,yarnwrap.util.math.Vec3d movement,yarnwrap.util.math.BlockPos landingPos,yarnwrap.block.BlockState landingState) { wrapperContained.applyMoveEffect(moveEffect,movement.wrapperContained,landingPos.wrapperContained,landingState.wrapperContained); }
// public static void applyMoveEffect(Object moveEffect,yarnwrap.util.math.Vec3d movement,yarnwrap.util.math.BlockPos landingPos,yarnwrap.block.BlockState landingState, ) { net.minecraft.entity.Entity.applyMoveEffect(moveEffect,movement.wrapperContained,landingPos.wrapperContained,landingState.wrapperContained); }
// public void tickBlockCollision() { wrapperContained.tickBlockCollision(); }
// public static void tickBlockCollision() { net.minecraft.entity.Entity.tickBlockCollision(); }
// public boolean shouldTickBlockCollision() { return wrapperContained.shouldTickBlockCollision(); }
// public static boolean shouldTickBlockCollision() { return net.minecraft.entity.Entity.shouldTickBlockCollision(); }
public yarnwrap.util.math.Vec3d getLastRenderPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getLastRenderPos()); }
// public static yarnwrap.util.math.Vec3d getLastRenderPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.Entity.getLastRenderPos()); }
public void setPosition(yarnwrap.entity.player.PlayerPosition pos,java.util.Set flags) { wrapperContained.setPosition(pos.wrapperContained,flags); }
// public static void setPosition(yarnwrap.entity.player.PlayerPosition pos,java.util.Set flags, ) { net.minecraft.entity.Entity.setPosition(pos.wrapperContained,flags); }
public float getLerpedPitch(float tickProgress) { return wrapperContained.getLerpedPitch(tickProgress); }
// public static float getLerpedPitch(float tickProgress, ) { return net.minecraft.entity.Entity.getLerpedPitch(tickProgress); }
public float getLerpedYaw(float tickProgress) { return wrapperContained.getLerpedYaw(tickProgress); }
// public static float getLerpedYaw(float tickProgress, ) { return net.minecraft.entity.Entity.getLerpedYaw(tickProgress); }
// public boolean isInSameTeam(yarnwrap.entity.Entity other) { return wrapperContained.isInSameTeam(other.wrapperContained); }
// public static boolean isInSameTeam(yarnwrap.entity.Entity other, ) { return net.minecraft.entity.Entity.isInSameTeam(other.wrapperContained); }
// public boolean collides(yarnwrap.util.math.Vec3d oldPos,yarnwrap.util.math.Vec3d newPos,java.util.List boxes) { return wrapperContained.collides(oldPos.wrapperContained,newPos.wrapperContained,boxes); }
// public static boolean collides(yarnwrap.util.math.Vec3d oldPos,yarnwrap.util.math.Vec3d newPos,java.util.List boxes, ) { return net.minecraft.entity.Entity.collides(oldPos.wrapperContained,newPos.wrapperContained,boxes); }
// public void updateLastPosition() { wrapperContained.updateLastPosition(); }
// public static void updateLastPosition() { net.minecraft.entity.Entity.updateLastPosition(); }
public void updateLastAngles() { wrapperContained.updateLastAngles(); }
// public static void updateLastAngles() { net.minecraft.entity.Entity.updateLastAngles(); }
public void setLastPositionAndAngles(yarnwrap.util.math.Vec3d pos,float yaw,float pitch) { wrapperContained.setLastPositionAndAngles(pos.wrapperContained,yaw,pitch); }
// public static void setLastPositionAndAngles(yarnwrap.util.math.Vec3d pos,float yaw,float pitch, ) { net.minecraft.entity.Entity.setLastPositionAndAngles(pos.wrapperContained,yaw,pitch); }
// public void setLastAngles(float lastYaw,float lastPitch) { wrapperContained.setLastAngles(lastYaw,lastPitch); }
// public static void setLastAngles(float lastYaw,float lastPitch, ) { net.minecraft.entity.Entity.setLastAngles(lastYaw,lastPitch); }
// public void setLastPosition(yarnwrap.util.math.Vec3d pos) { wrapperContained.setLastPosition(pos.wrapperContained); }
// public static void setLastPosition(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.Entity.setLastPosition(pos.wrapperContained); }
public void tickBlockCollision(yarnwrap.util.math.Vec3d lastRenderPos,yarnwrap.util.math.Vec3d pos) { wrapperContained.tickBlockCollision(lastRenderPos.wrapperContained,pos.wrapperContained); }
// public static void tickBlockCollision(yarnwrap.util.math.Vec3d lastRenderPos,yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.Entity.tickBlockCollision(lastRenderPos.wrapperContained,pos.wrapperContained); }
// public boolean shouldPlayBurnSoundInLava() { return wrapperContained.shouldPlayBurnSoundInLava(); }
// public static boolean shouldPlayBurnSoundInLava() { return net.minecraft.entity.Entity.shouldPlayBurnSoundInLava(); }
public boolean damage(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.damage(world.wrapperContained,source.wrapperContained,amount); }
// public static boolean damage(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,float amount, ) { return net.minecraft.entity.Entity.damage(world.wrapperContained,source.wrapperContained,amount); }
public void serverDamage(yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.serverDamage(source.wrapperContained,amount); }
// public static void serverDamage(yarnwrap.entity.damage.DamageSource source,float amount, ) { net.minecraft.entity.Entity.serverDamage(source.wrapperContained,amount); }
public boolean sidedDamage(yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.sidedDamage(source.wrapperContained,amount); }
// public static boolean sidedDamage(yarnwrap.entity.damage.DamageSource source,float amount, ) { return net.minecraft.entity.Entity.sidedDamage(source.wrapperContained,amount); }
// public boolean isAlwaysInvulnerableTo(yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.isAlwaysInvulnerableTo(damageSource.wrapperContained); }
// public static boolean isAlwaysInvulnerableTo(yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.entity.Entity.isAlwaysInvulnerableTo(damageSource.wrapperContained); }
public void rotate(float yaw,float pitch) { wrapperContained.rotate(yaw,pitch); }
// public static void rotate(float yaw,float pitch, ) { net.minecraft.entity.Entity.rotate(yaw,pitch); }
// public yarnwrap.entity.Entity teleportSameDimension(yarnwrap.server.world.ServerWorld world,yarnwrap.world.TeleportTarget teleportTarget) { return new yarnwrap.entity.Entity(wrapperContained.teleportSameDimension(world.wrapperContained,teleportTarget.wrapperContained)); }
// public static yarnwrap.entity.Entity teleportSameDimension(yarnwrap.server.world.ServerWorld world,yarnwrap.world.TeleportTarget teleportTarget, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.Entity.teleportSameDimension(world.wrapperContained,teleportTarget.wrapperContained)); }
// public void sendTeleportPacket(yarnwrap.world.TeleportTarget teleportTarget) { wrapperContained.sendTeleportPacket(teleportTarget.wrapperContained); }
// public static void sendTeleportPacket(yarnwrap.world.TeleportTarget teleportTarget, ) { net.minecraft.entity.Entity.sendTeleportPacket(teleportTarget.wrapperContained); }
// public yarnwrap.world.TeleportTarget getPassengerTeleportTarget(yarnwrap.world.TeleportTarget teleportTarget,yarnwrap.entity.Entity passenger) { return new yarnwrap.world.TeleportTarget(wrapperContained.getPassengerTeleportTarget(teleportTarget.wrapperContained,passenger.wrapperContained)); }
// public static yarnwrap.world.TeleportTarget getPassengerTeleportTarget(yarnwrap.world.TeleportTarget teleportTarget,yarnwrap.entity.Entity passenger, ) { return new yarnwrap.world.TeleportTarget(net.minecraft.entity.Entity.getPassengerTeleportTarget(teleportTarget.wrapperContained,passenger.wrapperContained)); }
// public yarnwrap.entity.Entity teleportCrossDimension(yarnwrap.server.world.ServerWorld from,yarnwrap.server.world.ServerWorld to,yarnwrap.world.TeleportTarget teleportTarget) { return new yarnwrap.entity.Entity(wrapperContained.teleportCrossDimension(from.wrapperContained,to.wrapperContained,teleportTarget.wrapperContained)); }
// public static yarnwrap.entity.Entity teleportCrossDimension(yarnwrap.server.world.ServerWorld from,yarnwrap.server.world.ServerWorld to,yarnwrap.world.TeleportTarget teleportTarget, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.Entity.teleportCrossDimension(from.wrapperContained,to.wrapperContained,teleportTarget.wrapperContained)); }
// public void onRemove(Object reason) { wrapperContained.onRemove(reason); }
// public static void onRemove(Object reason, ) { net.minecraft.entity.Entity.onRemove(reason); }
// public void checkBlockCollision(java.util.List queuedCollisionChecks,Object collisionHandler) { wrapperContained.checkBlockCollision(queuedCollisionChecks,collisionHandler); }
// public static void checkBlockCollision(java.util.List queuedCollisionChecks,Object collisionHandler, ) { net.minecraft.entity.Entity.checkBlockCollision(queuedCollisionChecks,collisionHandler); }
public boolean isControlledByPlayer() { return wrapperContained.isControlledByPlayer(); }
// public static boolean isControlledByPlayer() { return net.minecraft.entity.Entity.isControlledByPlayer(); }
// public yarnwrap.util.math.Box calculateDefaultBoundingBox(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Box(wrapperContained.calculateDefaultBoundingBox(pos.wrapperContained)); }
// public static yarnwrap.util.math.Box calculateDefaultBoundingBox(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Box(net.minecraft.entity.Entity.calculateDefaultBoundingBox(pos.wrapperContained)); }
public void setMovement(boolean onGround,yarnwrap.util.math.Vec3d movement) { wrapperContained.setMovement(onGround,movement.wrapperContained); }
// public static void setMovement(boolean onGround,yarnwrap.util.math.Vec3d movement, ) { net.minecraft.entity.Entity.setMovement(onGround,movement.wrapperContained); }
public void handleFall(double xDifference,double yDifference,double zDifference,boolean onGround) { wrapperContained.handleFall(xDifference,yDifference,zDifference,onGround); }
// public static void handleFall(double xDifference,double yDifference,double zDifference,boolean onGround, ) { net.minecraft.entity.Entity.handleFall(xDifference,yDifference,zDifference,onGround); }
public yarnwrap.entity.PositionInterpolator getInterpolator() { return new yarnwrap.entity.PositionInterpolator(wrapperContained.getInterpolator()); }
// public static yarnwrap.entity.PositionInterpolator getInterpolator() { return new yarnwrap.entity.PositionInterpolator(net.minecraft.entity.Entity.getInterpolator()); }
public boolean isInterpolating() { return wrapperContained.isInterpolating(); }
// public static boolean isInterpolating() { return net.minecraft.entity.Entity.isInterpolating(); }
public void updateTrackedPositionAndAngles(yarnwrap.util.math.Vec3d pos,float yaw,float pitch) { wrapperContained.updateTrackedPositionAndAngles(pos.wrapperContained,yaw,pitch); }
// public static void updateTrackedPositionAndAngles(yarnwrap.util.math.Vec3d pos,float yaw,float pitch, ) { net.minecraft.entity.Entity.updateTrackedPositionAndAngles(pos.wrapperContained,yaw,pitch); }
public boolean isLogicalSideForUpdatingMovement() { return wrapperContained.isLogicalSideForUpdatingMovement(); }
// public static boolean isLogicalSideForUpdatingMovement() { return net.minecraft.entity.Entity.isLogicalSideForUpdatingMovement(); }
// public boolean isControlledByMainPlayer() { return wrapperContained.isControlledByMainPlayer(); }
// public static boolean isControlledByMainPlayer() { return net.minecraft.entity.Entity.isControlledByMainPlayer(); }
public boolean canMoveVoluntarily() { return wrapperContained.canMoveVoluntarily(); }
// public static boolean canMoveVoluntarily() { return net.minecraft.entity.Entity.canMoveVoluntarily(); }
// public void spawnBubbleColumnParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnBubbleColumnParticles(world.wrapperContained,pos.wrapperContained); }
// public static void spawnBubbleColumnParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.Entity.spawnBubbleColumnParticles(world.wrapperContained,pos.wrapperContained); }
// public boolean collidesWithFluid(yarnwrap.fluid.FluidState state,yarnwrap.util.math.BlockPos fluidPos,yarnwrap.util.math.Vec3d oldPos,yarnwrap.util.math.Vec3d newPos) { return wrapperContained.collidesWithFluid(state.wrapperContained,fluidPos.wrapperContained,oldPos.wrapperContained,newPos.wrapperContained); }
// public static boolean collidesWithFluid(yarnwrap.fluid.FluidState state,yarnwrap.util.math.BlockPos fluidPos,yarnwrap.util.math.Vec3d oldPos,yarnwrap.util.math.Vec3d newPos, ) { return net.minecraft.entity.Entity.collidesWithFluid(state.wrapperContained,fluidPos.wrapperContained,oldPos.wrapperContained,newPos.wrapperContained); }
// public void copyComponentsFrom(yarnwrap.component.ComponentsAccess from) { wrapperContained.copyComponentsFrom(from.wrapperContained); }
// public static void copyComponentsFrom(yarnwrap.component.ComponentsAccess from, ) { net.minecraft.entity.Entity.copyComponentsFrom(from.wrapperContained); }
// public boolean copyComponentFrom(yarnwrap.component.ComponentsAccess from,yarnwrap.component.ComponentType type) { return wrapperContained.copyComponentFrom(from.wrapperContained,type.wrapperContained); }
// public static boolean copyComponentFrom(yarnwrap.component.ComponentsAccess from,yarnwrap.component.ComponentType type, ) { return net.minecraft.entity.Entity.copyComponentFrom(from.wrapperContained,type.wrapperContained); }
// public java.lang.Object castComponentValue(yarnwrap.component.ComponentType type,java.lang.Object value) { return wrapperContained.castComponentValue(type.wrapperContained,value); }
// public static java.lang.Object castComponentValue(yarnwrap.component.ComponentType type,java.lang.Object value, ) { return net.minecraft.entity.Entity.castComponentValue(type.wrapperContained,value); }
public void copyComponentsFrom(yarnwrap.item.ItemStack stack) { wrapperContained.copyComponentsFrom(stack.wrapperContained); }
// public static void copyComponentsFrom(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.Entity.copyComponentsFrom(stack.wrapperContained); }
public void setComponent(yarnwrap.component.ComponentType type,java.lang.Object value) { wrapperContained.setComponent(type.wrapperContained,value); }
// public static void setComponent(yarnwrap.component.ComponentType type,java.lang.Object value, ) { net.minecraft.entity.Entity.setComponent(type.wrapperContained,value); }
// public boolean setApplicableComponent(yarnwrap.component.ComponentType type,java.lang.Object value) { return wrapperContained.setApplicableComponent(type.wrapperContained,value); }
// public static boolean setApplicableComponent(yarnwrap.component.ComponentType type,java.lang.Object value, ) { return net.minecraft.entity.Entity.setApplicableComponent(type.wrapperContained,value); }
// public void applyBubbleColumnSurfaceEffects(yarnwrap.entity.Entity entity,boolean drag,yarnwrap.util.math.BlockPos pos) { wrapperContained.applyBubbleColumnSurfaceEffects(entity.wrapperContained,drag,pos.wrapperContained); }
// public static void applyBubbleColumnSurfaceEffects(yarnwrap.entity.Entity entity,boolean drag,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.Entity.applyBubbleColumnSurfaceEffects(entity.wrapperContained,drag,pos.wrapperContained); }
// public void applyBubbleColumnEffects(yarnwrap.entity.Entity entity,boolean drag) { wrapperContained.applyBubbleColumnEffects(entity.wrapperContained,drag); }
// public static void applyBubbleColumnEffects(yarnwrap.entity.Entity entity,boolean drag, ) { net.minecraft.entity.Entity.applyBubbleColumnEffects(entity.wrapperContained,drag); }
// public void handleFallDamageForPassengers(double fallDistance,float damagePerDistance,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.handleFallDamageForPassengers(fallDistance,damagePerDistance,damageSource.wrapperContained); }
// public static void handleFallDamageForPassengers(double fallDistance,float damagePerDistance,yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.Entity.handleFallDamageForPassengers(fallDistance,damagePerDistance,damageSource.wrapperContained); }
// public boolean method_67632(it.unimi.dsi.fastutil.longs.LongSet pos,yarnwrap.util.math.Vec3d version) { return wrapperContained.method_67632(pos,version.wrapperContained); }
// public static boolean method_67632(it.unimi.dsi.fastutil.longs.LongSet pos,yarnwrap.util.math.Vec3d version, ) { return net.minecraft.entity.Entity.method_67632(pos,version.wrapperContained); }
public void igniteByLava() { wrapperContained.igniteByLava(); }
// public static void igniteByLava() { net.minecraft.entity.Entity.igniteByLava(); }
// public void method_67634(java.util.UUID uuid) { wrapperContained.method_67634(uuid); }
// public static void method_67634(java.util.UUID uuid, ) { net.minecraft.entity.Entity.method_67634(uuid); }
public void defrost() { wrapperContained.defrost(); }
// public static void defrost() { net.minecraft.entity.Entity.defrost(); }
public void popQueuedCollisionCheck() { wrapperContained.popQueuedCollisionCheck(); }
// public static void popQueuedCollisionCheck() { net.minecraft.entity.Entity.popQueuedCollisionCheck(); }
// public void tickBlockCollisions(java.util.List checks) { wrapperContained.tickBlockCollisions(checks); }
// public static void tickBlockCollisions(java.util.List checks, ) { net.minecraft.entity.Entity.tickBlockCollisions(checks); }
// public java.lang.Iterable getAxisCheckOrder(yarnwrap.util.math.Vec3d movement) { return wrapperContained.getAxisCheckOrder(movement.wrapperContained); }
// public static java.lang.Iterable getAxisCheckOrder(yarnwrap.util.math.Vec3d movement, ) { return net.minecraft.entity.Entity.getAxisCheckOrder(movement.wrapperContained); }
// public void teleportSpectatingPlayers(yarnwrap.world.TeleportTarget teleportTarget,yarnwrap.server.world.ServerWorld from) { wrapperContained.teleportSpectatingPlayers(teleportTarget.wrapperContained,from.wrapperContained); }
// public static void teleportSpectatingPlayers(yarnwrap.world.TeleportTarget teleportTarget,yarnwrap.server.world.ServerWorld from, ) { net.minecraft.entity.Entity.teleportSpectatingPlayers(teleportTarget.wrapperContained,from.wrapperContained); }
// public boolean shouldAlwaysSyncAbsolute() { return wrapperContained.shouldAlwaysSyncAbsolute(); }
// public static boolean shouldAlwaysSyncAbsolute() { return net.minecraft.entity.Entity.shouldAlwaysSyncAbsolute(); }
// public boolean isAtCloudHeight() { return wrapperContained.isAtCloudHeight(); }
// public static boolean isAtCloudHeight() { return net.minecraft.entity.Entity.isAtCloudHeight(); }
// public void setAlwaysSyncAbsolute(boolean alwaysSyncAbsolute) { wrapperContained.setAlwaysSyncAbsolute(alwaysSyncAbsolute); }
// public static void setAlwaysSyncAbsolute(boolean alwaysSyncAbsolute, ) { net.minecraft.entity.Entity.setAlwaysSyncAbsolute(alwaysSyncAbsolute); }
// public void tickHeldLeash(yarnwrap.entity.Leashable leashedEntity) { wrapperContained.tickHeldLeash(leashedEntity.wrapperContained); }
// public static void tickHeldLeash(yarnwrap.entity.Leashable leashedEntity, ) { net.minecraft.entity.Entity.tickHeldLeash(leashedEntity.wrapperContained); }
// public boolean method_70981(yarnwrap.entity.player.PlayerEntity leashable) { return wrapperContained.method_70981(leashable.wrapperContained); }
// public static boolean method_70981(yarnwrap.entity.player.PlayerEntity leashable, ) { return net.minecraft.entity.Entity.method_70981(leashable.wrapperContained); }
// public void onHeldLeashUpdate(yarnwrap.entity.Leashable heldLeashable) { wrapperContained.onHeldLeashUpdate(heldLeashable.wrapperContained); }
// public static void onHeldLeashUpdate(yarnwrap.entity.Leashable heldLeashable, ) { net.minecraft.entity.Entity.onHeldLeashUpdate(heldLeashable.wrapperContained); }
public void limitFallDistance() { wrapperContained.limitFallDistance(); }
// public static void limitFallDistance() { net.minecraft.entity.Entity.limitFallDistance(); }
// public boolean snipAllHeldLeashes(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.snipAllHeldLeashes(player.wrapperContained); }
// public static boolean snipAllHeldLeashes(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.Entity.snipAllHeldLeashes(player.wrapperContained); }
// public net.minecraft.util.math.Vec3d[] getHeldQuadLeashOffsets() { return wrapperContained.getHeldQuadLeashOffsets(); }
// public static net.minecraft.util.math.Vec3d[] getHeldQuadLeashOffsets() { return net.minecraft.entity.Entity.getHeldQuadLeashOffsets(); }
// public boolean hasQuadLeashAttachmentPoints() { return wrapperContained.hasQuadLeashAttachmentPoints(); }
// public static boolean hasQuadLeashAttachmentPoints() { return net.minecraft.entity.Entity.hasQuadLeashAttachmentPoints(); }
// public boolean isFlyingVehicle() { return wrapperContained.isFlyingVehicle(); }
// public static boolean isFlyingVehicle() { return net.minecraft.entity.Entity.isFlyingVehicle(); }
// public boolean detachAllHeldLeashes(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.detachAllHeldLeashes(player.wrapperContained); }
// public static boolean detachAllHeldLeashes(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.Entity.detachAllHeldLeashes(player.wrapperContained); }
// public Object getErrorReporterContext() { return wrapperContained.getErrorReporterContext(); }
// public static Object getErrorReporterContext() { return net.minecraft.entity.Entity.getErrorReporterContext(); }
// public yarnwrap.entity.ItemEntity dropStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Vec3d offset) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropStack(world.wrapperContained,stack.wrapperContained,offset.wrapperContained)); }
// public static yarnwrap.entity.ItemEntity dropStack(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Vec3d offset, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.Entity.dropStack(world.wrapperContained,stack.wrapperContained,offset.wrapperContained)); }
// public boolean shearEquipment(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack shears,yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.shearEquipment(player.wrapperContained,hand.wrapperContained,shears.wrapperContained,entity.wrapperContained); }
// public static boolean shearEquipment(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack shears,yarnwrap.entity.mob.MobEntity entity, ) { return net.minecraft.entity.Entity.shearEquipment(player.wrapperContained,hand.wrapperContained,shears.wrapperContained,entity.wrapperContained); }

}