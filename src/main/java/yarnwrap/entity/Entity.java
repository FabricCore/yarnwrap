package yarnwrap.entity;
public class Entity { public net.minecraft.entity.Entity wrapperContained; public Entity(net.minecraft.entity.Entity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d movementMultiplier() { return new yarnwrap.util.math.Vec3d(wrapperContained.movementMultiplier); }
// public void movementMultiplier(yarnwrap.util.math.Vec3d value) { wrapperContained.movementMultiplier = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData POSE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.POSE); }
// public void POSE(yarnwrap.entity.data.TrackedData value) { wrapperContained.POSE = value.wrapperContained; }
// public yarnwrap.entity.EntityDimensions dimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.dimensions); }
// public void dimensions(yarnwrap.entity.EntityDimensions value) { wrapperContained.dimensions = value.wrapperContained; }
// public float standingEyeHeight() { return wrapperContained.standingEyeHeight; }
// public void standingEyeHeight(float value) { wrapperContained.standingEyeHeight = value; }
// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public void velocity(yarnwrap.util.math.Vec3d value) { wrapperContained.velocity = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.blockPos); }
// public void blockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.blockPos = value.wrapperContained; }
public boolean intersectionChecked() { return wrapperContained.intersectionChecked; }
public void intersectionChecked(boolean value) { wrapperContained.intersectionChecked = value; }
// public java.util.Set submergedFluidTag() { return wrapperContained.submergedFluidTag; }
// public void submergedFluidTag(java.util.Set value) { wrapperContained.submergedFluidTag = value; }
// public int lastChimeAge() { return wrapperContained.lastChimeAge; }
// public void lastChimeAge(int value) { wrapperContained.lastChimeAge = value; }
// public Object removalReason() { return wrapperContained.removalReason; }
// // public void removalReason(Object value) { wrapperContained.removalReason = value; }
// public yarnwrap.world.entity.EntityChangeListener changeListener() { return new yarnwrap.world.entity.EntityChangeListener(wrapperContained.changeListener); }
// public void changeListener(yarnwrap.world.entity.EntityChangeListener value) { wrapperContained.changeListener = value.wrapperContained; }
// public float lastChimeIntensity() { return wrapperContained.lastChimeIntensity; }
// public void lastChimeIntensity(float value) { wrapperContained.lastChimeIntensity = value; }
public boolean inPowderSnow() { return wrapperContained.inPowderSnow; }
public void inPowderSnow(boolean value) { wrapperContained.inPowderSnow = value; }
// public yarnwrap.entity.data.TrackedData FROZEN_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FROZEN_TICKS); }
// public void FROZEN_TICKS(yarnwrap.entity.data.TrackedData value) { wrapperContained.FROZEN_TICKS = value.wrapperContained; }
public float speed() { return wrapperContained.speed; }
public void speed(float value) { wrapperContained.speed = value; }
public boolean wasInPowderSnow() { return wrapperContained.wasInPowderSnow; }
public void wasInPowderSnow(boolean value) { wrapperContained.wasInPowderSnow = value; }
public boolean wasOnFire() { return wrapperContained.wasOnFire; }
public void wasOnFire(boolean value) { wrapperContained.wasOnFire = value; }
public float DEFAULT_FRICTION() { return wrapperContained.DEFAULT_FRICTION; }
// public void DEFAULT_FRICTION(float value) { wrapperContained.DEFAULT_FRICTION = value; }
public float MIN_RISING_BUBBLE_COLUMN_SPEED() { return wrapperContained.MIN_RISING_BUBBLE_COLUMN_SPEED; }
// public void MIN_RISING_BUBBLE_COLUMN_SPEED(float value) { wrapperContained.MIN_RISING_BUBBLE_COLUMN_SPEED = value; }
// public int SNEAKING_FLAG_INDEX() { return wrapperContained.SNEAKING_FLAG_INDEX; }
// public void SNEAKING_FLAG_INDEX(int value) { wrapperContained.SNEAKING_FLAG_INDEX = value; }
// public int SPRINTING_FLAG_INDEX() { return wrapperContained.SPRINTING_FLAG_INDEX; }
// public void SPRINTING_FLAG_INDEX(int value) { wrapperContained.SPRINTING_FLAG_INDEX = value; }
// public int SWIMMING_FLAG_INDEX() { return wrapperContained.SWIMMING_FLAG_INDEX; }
// public void SWIMMING_FLAG_INDEX(int value) { wrapperContained.SWIMMING_FLAG_INDEX = value; }
// public int INVISIBLE_FLAG_INDEX() { return wrapperContained.INVISIBLE_FLAG_INDEX; }
// public void INVISIBLE_FLAG_INDEX(int value) { wrapperContained.INVISIBLE_FLAG_INDEX = value; }
// public int ON_FIRE_FLAG_INDEX() { return wrapperContained.ON_FIRE_FLAG_INDEX; }
// public void ON_FIRE_FLAG_INDEX(int value) { wrapperContained.ON_FIRE_FLAG_INDEX = value; }
// public int GLOWING_FLAG_INDEX() { return wrapperContained.GLOWING_FLAG_INDEX; }
// public void GLOWING_FLAG_INDEX(int value) { wrapperContained.GLOWING_FLAG_INDEX = value; }
// public int FALL_FLYING_FLAG_INDEX() { return wrapperContained.FALL_FLYING_FLAG_INDEX; }
// public void FALL_FLYING_FLAG_INDEX(int value) { wrapperContained.FALL_FLYING_FLAG_INDEX = value; }
// public double SPEED_IN_LAVA_IN_NETHER() { return wrapperContained.SPEED_IN_LAVA_IN_NETHER; }
// public void SPEED_IN_LAVA_IN_NETHER(double value) { wrapperContained.SPEED_IN_LAVA_IN_NETHER = value; }
// public double SPEED_IN_LAVA() { return wrapperContained.SPEED_IN_LAVA; }
// public void SPEED_IN_LAVA(double value) { wrapperContained.SPEED_IN_LAVA = value; }
// public double SPEED_IN_WATER() { return wrapperContained.SPEED_IN_WATER; }
// public void SPEED_IN_WATER(double value) { wrapperContained.SPEED_IN_WATER = value; }
public java.lang.String ID_KEY() { return wrapperContained.ID_KEY; }
// public void ID_KEY(java.lang.String value) { wrapperContained.ID_KEY = value; }
public java.lang.String PASSENGERS_KEY() { return wrapperContained.PASSENGERS_KEY; }
// public void PASSENGERS_KEY(java.lang.String value) { wrapperContained.PASSENGERS_KEY = value; }
public int MAX_RIDING_COOLDOWN() { return wrapperContained.MAX_RIDING_COOLDOWN; }
// public void MAX_RIDING_COOLDOWN(int value) { wrapperContained.MAX_RIDING_COOLDOWN = value; }
public int DEFAULT_PORTAL_COOLDOWN() { return wrapperContained.DEFAULT_PORTAL_COOLDOWN; }
// public void DEFAULT_PORTAL_COOLDOWN(int value) { wrapperContained.DEFAULT_PORTAL_COOLDOWN = value; }
public int MAX_COMMAND_TAGS() { return wrapperContained.MAX_COMMAND_TAGS; }
// public void MAX_COMMAND_TAGS(int value) { wrapperContained.MAX_COMMAND_TAGS = value; }
public int DEFAULT_MIN_FREEZE_DAMAGE_TICKS() { return wrapperContained.DEFAULT_MIN_FREEZE_DAMAGE_TICKS; }
// public void DEFAULT_MIN_FREEZE_DAMAGE_TICKS(int value) { wrapperContained.DEFAULT_MIN_FREEZE_DAMAGE_TICKS = value; }
public int FREEZING_DAMAGE_INTERVAL() { return wrapperContained.FREEZING_DAMAGE_INTERVAL; }
// public void FREEZING_DAMAGE_INTERVAL(int value) { wrapperContained.FREEZING_DAMAGE_INTERVAL = value; }
public java.lang.String UUID_KEY() { return wrapperContained.UUID_KEY; }
// public void UUID_KEY(java.lang.String value) { wrapperContained.UUID_KEY = value; }
// public boolean hasVisualFire() { return wrapperContained.hasVisualFire; }
// public void hasVisualFire(boolean value) { wrapperContained.hasVisualFire = value; }
public boolean collidedSoftly() { return wrapperContained.collidedSoftly; }
public void collidedSoftly(boolean value) { wrapperContained.collidedSoftly = value; }
// public yarnwrap.util.math.ChunkPos chunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.chunkPos); }
// public void chunkPos(yarnwrap.util.math.ChunkPos value) { wrapperContained.chunkPos = value.wrapperContained; }
public boolean groundCollision() { return wrapperContained.groundCollision; }
public void groundCollision(boolean value) { wrapperContained.groundCollision = value; }
// public yarnwrap.entity.TrackedPosition trackedPosition() { return new yarnwrap.entity.TrackedPosition(wrapperContained.trackedPosition); }
// public void trackedPosition(yarnwrap.entity.TrackedPosition value) { wrapperContained.trackedPosition = value.wrapperContained; }
public java.util.Optional supportingBlockPos() { return wrapperContained.supportingBlockPos; }
public void supportingBlockPos(java.util.Optional value) { wrapperContained.supportingBlockPos = value; }
// public boolean forceUpdateSupportingBlockPos() { return wrapperContained.forceUpdateSupportingBlockPos; }
// public void forceUpdateSupportingBlockPos(boolean value) { wrapperContained.forceUpdateSupportingBlockPos = value; }
// public yarnwrap.block.BlockState stateAtPos() { return new yarnwrap.block.BlockState(wrapperContained.stateAtPos); }
// public void stateAtPos(yarnwrap.block.BlockState value) { wrapperContained.stateAtPos = value.wrapperContained; }
public yarnwrap.world.dimension.PortalManager portalManager() { return new yarnwrap.world.dimension.PortalManager(wrapperContained.portalManager); }
public void portalManager(yarnwrap.world.dimension.PortalManager value) { wrapperContained.portalManager = value.wrapperContained; }
// public int ridingCooldown() { return wrapperContained.ridingCooldown; }
// public void ridingCooldown(int value) { wrapperContained.ridingCooldown = value; }
// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public boolean firstUpdate() { return wrapperContained.firstUpdate; }
// public void firstUpdate(boolean value) { wrapperContained.firstUpdate = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int fireTicks() { return wrapperContained.fireTicks; }
// public void fireTicks(int value) { wrapperContained.fireTicks = value; }
// public boolean touchingWater() { return wrapperContained.touchingWater; }
// public void touchingWater(boolean value) { wrapperContained.touchingWater = value; }
// public boolean glowing() { return wrapperContained.glowing; }
// public void glowing(boolean value) { wrapperContained.glowing = value; }
public boolean noClip() { return wrapperContained.noClip; }
public void noClip(boolean value) { wrapperContained.noClip = value; }
// public yarnwrap.entity.EntityType type() { return new yarnwrap.entity.EntityType(wrapperContained.type); }
// public void type(yarnwrap.entity.EntityType value) { wrapperContained.type = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData SILENT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SILENT); }
// public void SILENT(yarnwrap.entity.data.TrackedData value) { wrapperContained.SILENT = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2DoubleMap fluidHeight() { return wrapperContained.fluidHeight; }
// public void fluidHeight(it.unimi.dsi.fastutil.objects.Object2DoubleMap value) { wrapperContained.fluidHeight = value; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
public double prevZ() { return wrapperContained.prevZ; }
public void prevZ(double value) { wrapperContained.prevZ = value; }
public double lastRenderY() { return wrapperContained.lastRenderY; }
public void lastRenderY(double value) { wrapperContained.lastRenderY = value; }
public float horizontalSpeed() { return wrapperContained.horizontalSpeed; }
public void horizontalSpeed(float value) { wrapperContained.horizontalSpeed = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData NAME_VISIBLE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.NAME_VISIBLE); }
// public void NAME_VISIBLE(yarnwrap.entity.data.TrackedData value) { wrapperContained.NAME_VISIBLE = value.wrapperContained; }
public boolean horizontalCollision() { return wrapperContained.horizontalCollision; }
public void horizontalCollision(boolean value) { wrapperContained.horizontalCollision = value; }
// public java.util.concurrent.atomic.AtomicInteger CURRENT_ID() { return wrapperContained.CURRENT_ID; }
// public void CURRENT_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.CURRENT_ID = value; }
// public com.google.common.collect.ImmutableList passengerList() { return wrapperContained.passengerList; }
// public void passengerList(com.google.common.collect.ImmutableList value) { wrapperContained.passengerList = value; }
// public java.lang.String uuidString() { return wrapperContained.uuidString; }
// public void uuidString(java.lang.String value) { wrapperContained.uuidString = value; }
public float prevYaw() { return wrapperContained.prevYaw; }
public void prevYaw(float value) { wrapperContained.prevYaw = value; }
public boolean ignoreCameraFrustum() { return wrapperContained.ignoreCameraFrustum; }
public void ignoreCameraFrustum(boolean value) { wrapperContained.ignoreCameraFrustum = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
public double lastRenderZ() { return wrapperContained.lastRenderZ; }
public void lastRenderZ(double value) { wrapperContained.lastRenderZ = value; }
// public yarnwrap.entity.data.TrackedData FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FLAGS); }
// public void FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.FLAGS = value.wrapperContained; }
public boolean verticalCollision() { return wrapperContained.verticalCollision; }
public void verticalCollision(boolean value) { wrapperContained.verticalCollision = value; }
// public double[] pistonMovementDelta() { return wrapperContained.pistonMovementDelta; }
// public void pistonMovementDelta(double[] value) { wrapperContained.pistonMovementDelta = value; }
public float distanceTraveled() { return wrapperContained.distanceTraveled; }
public void distanceTraveled(float value) { wrapperContained.distanceTraveled = value; }
// public yarnwrap.entity.data.TrackedData NO_GRAVITY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.NO_GRAVITY); }
// public void NO_GRAVITY(yarnwrap.entity.data.TrackedData value) { wrapperContained.NO_GRAVITY = value.wrapperContained; }
// public long pistonMovementTick() { return wrapperContained.pistonMovementTick; }
// public void pistonMovementTick(long value) { wrapperContained.pistonMovementTick = value; }
// public double renderDistanceMultiplier() { return wrapperContained.renderDistanceMultiplier; }
// public void renderDistanceMultiplier(double value) { wrapperContained.renderDistanceMultiplier = value; }
// public boolean submergedInWater() { return wrapperContained.submergedInWater; }
// public void submergedInWater(boolean value) { wrapperContained.submergedInWater = value; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public float nextStepSoundDistance() { return wrapperContained.nextStepSoundDistance; }
// public void nextStepSoundDistance(float value) { wrapperContained.nextStepSoundDistance = value; }
public float prevPitch() { return wrapperContained.prevPitch; }
public void prevPitch(float value) { wrapperContained.prevPitch = value; }
// public yarnwrap.util.math.Box boundingBox() { return new yarnwrap.util.math.Box(wrapperContained.boundingBox); }
// public void boundingBox(yarnwrap.util.math.Box value) { wrapperContained.boundingBox = value.wrapperContained; }
public boolean velocityDirty() { return wrapperContained.velocityDirty; }
public void velocityDirty(boolean value) { wrapperContained.velocityDirty = value; }
public int timeUntilRegen() { return wrapperContained.timeUntilRegen; }
public void timeUntilRegen(int value) { wrapperContained.timeUntilRegen = value; }
// public boolean invulnerable() { return wrapperContained.invulnerable; }
// public void invulnerable(boolean value) { wrapperContained.invulnerable = value; }
// public yarnwrap.entity.data.DataTracker dataTracker() { return new yarnwrap.entity.data.DataTracker(wrapperContained.dataTracker); }
// public void dataTracker(yarnwrap.entity.data.DataTracker value) { wrapperContained.dataTracker = value.wrapperContained; }
public int age() { return wrapperContained.age; }
public void age(int value) { wrapperContained.age = value; }
public double prevX() { return wrapperContained.prevX; }
public void prevX(double value) { wrapperContained.prevX = value; }
public float fallDistance() { return wrapperContained.fallDistance; }
public void fallDistance(float value) { wrapperContained.fallDistance = value; }
// public int portalCooldown() { return wrapperContained.portalCooldown; }
// public void portalCooldown(int value) { wrapperContained.portalCooldown = value; }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public void uuid(java.util.UUID value) { wrapperContained.uuid = value; }
// public yarnwrap.util.math.Box NULL_BOX() { return new yarnwrap.util.math.Box(wrapperContained.NULL_BOX); }
// public void NULL_BOX(yarnwrap.util.math.Box value) { wrapperContained.NULL_BOX = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData CUSTOM_NAME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CUSTOM_NAME); }
// public void CUSTOM_NAME(yarnwrap.entity.data.TrackedData value) { wrapperContained.CUSTOM_NAME = value.wrapperContained; }
// public java.util.Set commandTags() { return wrapperContained.commandTags; }
// public void commandTags(java.util.Set value) { wrapperContained.commandTags = value; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public yarnwrap.entity.data.TrackedData AIR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.AIR); }
// public void AIR(yarnwrap.entity.data.TrackedData value) { wrapperContained.AIR = value.wrapperContained; }
// public yarnwrap.entity.Entity vehicle() { return new yarnwrap.entity.Entity(wrapperContained.vehicle); }
// public void vehicle(yarnwrap.entity.Entity value) { wrapperContained.vehicle = value.wrapperContained; }
public double prevY() { return wrapperContained.prevY; }
public void prevY(double value) { wrapperContained.prevY = value; }
public boolean velocityModified() { return wrapperContained.velocityModified; }
public void velocityModified(boolean value) { wrapperContained.velocityModified = value; }
public double lastRenderX() { return wrapperContained.lastRenderX; }
public void lastRenderX(double value) { wrapperContained.lastRenderX = value; }
public float prevHorizontalSpeed() { return wrapperContained.prevHorizontalSpeed; }
public void prevHorizontalSpeed(float value) { wrapperContained.prevHorizontalSpeed = value; }
// public Entity(yarnwrap.entity.EntityType type,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.Entity(type.wrapperContained,world.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.util.math.BlockPos getWorldSpawnPos(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos basePos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getWorldSpawnPos(world.wrapperContained,basePos.wrapperContained)); }
public float getWidth() { return wrapperContained.getWidth(); }
public float getHeight() { return wrapperContained.getHeight(); }
// public yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.util.math.Vec3d movement) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForCollisions(movement.wrapperContained)); }
public yarnwrap.network.packet.Packet createSpawnPacket(yarnwrap.server.network.EntityTrackerEntry entityTrackerEntry) { return new yarnwrap.network.packet.Packet(wrapperContained.createSpawnPacket(entityTrackerEntry.wrapperContained)); }
public boolean isInSneakingPose() { return wrapperContained.isInSneakingPose(); }
public void detach() { wrapperContained.detach(); }
public yarnwrap.entity.EntityPose getPose() { return new yarnwrap.entity.EntityPose(wrapperContained.getPose()); }
public yarnwrap.entity.EntityDimensions getDimensions(yarnwrap.entity.EntityPose pose) { return new yarnwrap.entity.EntityDimensions(wrapperContained.getDimensions(pose.wrapperContained)); }
public void setPose(yarnwrap.entity.EntityPose pose) { wrapperContained.setPose(pose.wrapperContained); }
public float getEyeHeight(yarnwrap.entity.EntityPose pose) { return wrapperContained.getEyeHeight(pose.wrapperContained); }
public void calculateDimensions() { wrapperContained.calculateDimensions(); }
// public yarnwrap.util.math.Vec3d adjustMovementForPiston(yarnwrap.util.math.Vec3d movement) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForPiston(movement.wrapperContained)); }
// public yarnwrap.util.math.Vec3d movementInputToVelocity(yarnwrap.util.math.Vec3d movementInput,float speed,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.movementInputToVelocity(movementInput.wrapperContained,speed,yaw)); }
// public yarnwrap.util.math.Vec3d adjustMovementForSneaking(yarnwrap.util.math.Vec3d movement,yarnwrap.entity.MovementType type) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForSneaking(movement.wrapperContained,type.wrapperContained)); }
// public double calculatePistonMovementFactor(Object axis,double offsetFactor) { return wrapperContained.calculatePistonMovementFactor(axis,offsetFactor); }
public yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity()); }
public void setVelocity(yarnwrap.util.math.Vec3d velocity) { wrapperContained.setVelocity(velocity.wrapperContained); }
public void setVelocity(double x,double y,double z) { wrapperContained.setVelocity(x,y,z); }
// public yarnwrap.util.math.Vec3d getOppositeRotationVector(float pitch,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getOppositeRotationVector(pitch,yaw)); }
public yarnwrap.util.math.Vec3d getOppositeRotationVector(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getOppositeRotationVector(tickDelta)); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
public boolean isInSwimmingPose() { return wrapperContained.isInSwimmingPose(); }
public boolean isCrawling() { return wrapperContained.isCrawling(); }
public yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.entity.Entity entity,yarnwrap.util.math.Vec3d movement,yarnwrap.util.math.Box entityBoundingBox,yarnwrap.world.World world,java.util.List collisions) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForCollisions(entity.wrapperContained,movement.wrapperContained,entityBoundingBox.wrapperContained,world.wrapperContained,collisions)); }
// public yarnwrap.util.math.Vec3d adjustMovementForCollisions(yarnwrap.util.math.Vec3d movement,yarnwrap.util.math.Box entityBoundingBox,java.util.List collisions) { return new yarnwrap.util.math.Vec3d(wrapperContained.adjustMovementForCollisions(movement.wrapperContained,entityBoundingBox.wrapperContained,collisions)); }
public int getFireTicks() { return wrapperContained.getFireTicks(); }
public void setFireTicks(int fireTicks) { wrapperContained.setFireTicks(fireTicks); }
public boolean bypassesSteppingEffects() { return wrapperContained.bypassesSteppingEffects(); }
public boolean bypassesLandingEffects() { return wrapperContained.bypassesLandingEffects(); }
public boolean isSneaky() { return wrapperContained.isSneaky(); }
public boolean isDescending() { return wrapperContained.isDescending(); }
public int getTeamColorValue() { return wrapperContained.getTeamColorValue(); }
public void resetPosition() { wrapperContained.resetPosition(); }
// public void refreshPosition() { wrapperContained.refreshPosition(); }
public yarnwrap.util.math.BlockPos getSteppingPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSteppingPos()); }
// public float getJumpVelocityMultiplier() { return wrapperContained.getJumpVelocityMultiplier(); }
public yarnwrap.util.math.BlockPos getVelocityAffectingPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getVelocityAffectingPos()); }
// public yarnwrap.text.Text getDefaultName() { return new yarnwrap.text.Text(wrapperContained.getDefaultName()); }
public double offsetX(double widthScale) { return wrapperContained.offsetX(widthScale); }
public double getX() { return wrapperContained.getX(); }
public double getY() { return wrapperContained.getY(); }
public double getRandomBodyY() { return wrapperContained.getRandomBodyY(); }
public double getEyeY() { return wrapperContained.getEyeY(); }
public double getZ() { return wrapperContained.getZ(); }
public double getParticleX(double widthScale) { return wrapperContained.getParticleX(widthScale); }
public double getBodyY(double heightScale) { return wrapperContained.getBodyY(heightScale); }
public double offsetZ(double widthScale) { return wrapperContained.offsetZ(widthScale); }
public double getParticleZ(double widthScale) { return wrapperContained.getParticleZ(widthScale); }
// public float getVelocityMultiplier() { return wrapperContained.getVelocityMultiplier(); }
public void setPos(double x,double y,double z) { wrapperContained.setPos(x,y,z); }
public void updatePassengerPosition(yarnwrap.entity.Entity passenger) { wrapperContained.updatePassengerPosition(passenger.wrapperContained); }
public void refreshPositionAfterTeleport(double x,double y,double z) { wrapperContained.refreshPositionAfterTeleport(x,y,z); }
public boolean isInRange(yarnwrap.entity.Entity entity,double radius) { return wrapperContained.isInRange(entity.wrapperContained,radius); }
// public yarnwrap.util.math.Vec3d getPassengerDismountOffset(double vehicleWidth,double passengerWidth,float passengerYaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPassengerDismountOffset(vehicleWidth,passengerWidth,passengerYaw)); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
public yarnwrap.util.math.Vec3d updatePassengerForDismount(yarnwrap.entity.LivingEntity passenger) { return new yarnwrap.util.math.Vec3d(wrapperContained.updatePassengerForDismount(passenger.wrapperContained)); }
public void setOnGround(boolean onGround) { wrapperContained.setOnGround(onGround); }
public yarnwrap.block.BlockState getSteppingBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getSteppingBlockState()); }
public boolean shouldSpawnSprintingParticles() { return wrapperContained.shouldSpawnSprintingParticles(); }
public void dismountVehicle() { wrapperContained.dismountVehicle(); }
public double getSwimHeight() { return wrapperContained.getSwimHeight(); }
// public boolean method_29494(yarnwrap.block.BlockState state) { return wrapperContained.method_29494(state.wrapperContained); }
public void refreshPositionAfterTeleport(yarnwrap.util.math.Vec3d pos) { wrapperContained.refreshPositionAfterTeleport(pos.wrapperContained); }
// public yarnwrap.util.math.Vec3d getLeashOffset() { return new yarnwrap.util.math.Vec3d(wrapperContained.getLeashOffset()); }
// public boolean method_30022(yarnwrap.util.math.Box pos) { return wrapperContained.method_30022(pos.wrapperContained); }
// public void removeFromDimension() { wrapperContained.removeFromDimension(); }
public void resetPortalCooldown() { wrapperContained.resetPortalCooldown(); }
public boolean hasPortalCooldown() { return wrapperContained.hasPortalCooldown(); }
public boolean collidesWithStateAtPos(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.collidesWithStateAtPos(pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.util.math.Vec3d positionInPortal(Object portalAxis,Object portalRect) { return new yarnwrap.util.math.Vec3d(wrapperContained.positionInPortal(portalAxis,portalRect)); }
public void updatePosition(double x,double y,double z) { wrapperContained.updatePosition(x,y,z); }
public boolean isCollidable() { return wrapperContained.isCollidable(); }
public boolean collidesWith(yarnwrap.entity.Entity other) { return wrapperContained.collidesWith(other.wrapperContained); }
public yarnwrap.util.math.Vec3d getLerpedPos(float delta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLerpedPos(delta)); }
public yarnwrap.util.math.Vec3d getLeashPos(float delta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLeashPos(delta)); }
public yarnwrap.util.math.Vec3d getClientCameraPosVec(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getClientCameraPosVec(tickDelta)); }
public void onSpawnPacket(yarnwrap.network.packet.s2c.play.EntitySpawnS2CPacket packet) { wrapperContained.onSpawnPacket(packet.wrapperContained); }
public void discard() { wrapperContained.discard(); }
public void attemptTickInVoid() { wrapperContained.attemptTickInVoid(); }
// public boolean method_31475(yarnwrap.entity.Entity entity) { return wrapperContained.method_31475(entity.wrapperContained); }
public yarnwrap.util.math.ChunkPos getChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getChunkPos()); }
public int getBlockX() { return wrapperContained.getBlockX(); }
public int getBlockY() { return wrapperContained.getBlockY(); }
public int getBlockZ() { return wrapperContained.getBlockZ(); }
public yarnwrap.item.ItemStack getPickBlockStack() { return new yarnwrap.item.ItemStack(wrapperContained.getPickBlockStack()); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
// public void unsetRemoved() { wrapperContained.unsetRemoved(); }
public yarnwrap.entity.Entity getFirstPassenger() { return new yarnwrap.entity.Entity(wrapperContained.getFirstPassenger()); }
// public java.util.stream.Stream streamIntoPassengers() { return wrapperContained.streamIntoPassengers(); }
public int getFrozenTicks() { return wrapperContained.getFrozenTicks(); }
public float getFreezingScale() { return wrapperContained.getFreezingScale(); }
public boolean isFrozen() { return wrapperContained.isFrozen(); }
public int getMinFreezeDamageTicks() { return wrapperContained.getMinFreezeDamageTicks(); }
public boolean canFreeze() { return wrapperContained.canFreeze(); }
public void setFrozenTicks(int frozenTicks) { wrapperContained.setFrozenTicks(frozenTicks); }
public yarnwrap.inventory.StackReference getStackReference(int mappedIndex) { return new yarnwrap.inventory.StackReference(wrapperContained.getStackReference(mappedIndex)); }
public void setInPowderSnow(boolean inPowderSnow) { wrapperContained.setInPowderSnow(inPowderSnow); }
public void emitGameEvent(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.entity.Entity entity) { wrapperContained.emitGameEvent(event.wrapperContained,entity.wrapperContained); }
public void emitGameEvent(yarnwrap.registry.entry.RegistryEntry event) { wrapperContained.emitGameEvent(event.wrapperContained); }
public boolean occludeVibrationSignals() { return wrapperContained.occludeVibrationSignals(); }
// public yarnwrap.util.math.Box calculateBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.calculateBoundingBox()); }
public void requestTeleportAndDismount(double destX,double destY,double destZ) { wrapperContained.requestTeleportAndDismount(destX,destY,destZ); }
// public Object getMoveEffect() { return wrapperContained.getMoveEffect(); }
public yarnwrap.util.math.Vec3d getEyePos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getEyePos()); }
public void setOnFire(boolean onFire) { wrapperContained.setOnFire(onFire); }
// public void addAirTravelEffects() { wrapperContained.addAirTravelEffects(); }
public void setPosition(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPosition(pos.wrapperContained); }
public boolean isRegionUnloaded() { return wrapperContained.isRegionUnloaded(); }
public Object getRemovalReason() { return wrapperContained.getRemovalReason(); }
public void onRemoved() { wrapperContained.onRemoved(); }
public boolean isGlowingLocal() { return wrapperContained.isGlowingLocal(); }
public float getYaw() { return wrapperContained.getYaw(); }
public float getPitch() { return wrapperContained.getPitch(); }
public void setYaw(float yaw) { wrapperContained.setYaw(yaw); }
public void setPitch(float pitch) { wrapperContained.setPitch(pitch); }
public boolean canModifyAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canModifyAt(world.wrapperContained,pos.wrapperContained); }
// public void tryCheckBlockCollision() { wrapperContained.tryCheckBlockCollision(); }
// public void playExtinguishSound() { wrapperContained.playExtinguishSound(); }
// public void playAmethystChimeSound() { wrapperContained.playAmethystChimeSound(); }
// public void method_37216(yarnwrap.entity.Entity player) { wrapperContained.method_37216(player.wrapperContained); }
// public boolean method_37217(yarnwrap.entity.Entity passenger) { return wrapperContained.method_37217(passenger.wrapperContained); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
public void onLanding() { wrapperContained.onLanding(); }
// public boolean hasCollidedSoftly(yarnwrap.util.math.Vec3d adjustedMovement) { return wrapperContained.hasCollidedSoftly(adjustedMovement.wrapperContained); }
public boolean shouldEscapePowderSnow() { return wrapperContained.shouldEscapePowderSnow(); }
public yarnwrap.util.math.Vec3d getHandPosOffset(yarnwrap.item.Item item) { return new yarnwrap.util.math.Vec3d(wrapperContained.getHandPosOffset(item.wrapperContained)); }
public boolean isInPose(yarnwrap.entity.EntityPose pose) { return wrapperContained.isInPose(pose.wrapperContained); }
public void updateEventHandler(java.util.function.BiConsumer callback) { wrapperContained.updateEventHandler(callback); }
public boolean hasControllingPassenger() { return wrapperContained.hasControllingPassenger(); }
public void playSoundIfNotSilent(yarnwrap.sound.SoundEvent event) { wrapperContained.playSoundIfNotSilent(event.wrapperContained); }
public float getBodyYaw() { return wrapperContained.getBodyYaw(); }
// public yarnwrap.util.math.BlockPos getPosWithYOffset(float offset) { return new yarnwrap.util.math.BlockPos(wrapperContained.getPosWithYOffset(offset)); }
public boolean isInRange(yarnwrap.entity.Entity entity,double horizontalRadius,double verticalRadius) { return wrapperContained.isInRange(entity.wrapperContained,horizontalRadius,verticalRadius); }
public yarnwrap.util.math.BlockPos getLandingPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getLandingPos()); }
// public yarnwrap.block.BlockState getLandingBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getLandingBlockState()); }
public yarnwrap.entity.TrackedPosition getTrackedPosition() { return new yarnwrap.entity.TrackedPosition(wrapperContained.getTrackedPosition()); }
public yarnwrap.util.math.Vec3d getSyncedPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getSyncedPos()); }
public void updateTrackedPosition(double x,double y,double z) { wrapperContained.updateTrackedPosition(x,y,z); }
public void requestTeleportOffset(double offsetX,double offsetY,double offsetZ) { wrapperContained.requestTeleportOffset(offsetX,offsetY,offsetZ); }
public void limitFallDistance() { wrapperContained.limitFallDistance(); }
public void addVelocityInternal(yarnwrap.util.math.Vec3d velocity) { wrapperContained.addVelocityInternal(velocity.wrapperContained); }
public yarnwrap.util.math.Vec3d getLeashOffset(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLeashOffset(tickDelta)); }
public void extinguishWithSound() { wrapperContained.extinguishWithSound(); }
// public void reinitDimensions() { wrapperContained.reinitDimensions(); }
public boolean teleport(yarnwrap.server.world.ServerWorld world,double destX,double destY,double destZ,java.util.Set flags,float yaw,float pitch) { return wrapperContained.teleport(world.wrapperContained,destX,destY,destZ,flags,yaw,pitch); }
public boolean canSprintAsVehicle() { return wrapperContained.canSprintAsVehicle(); }
// public boolean couldAcceptPassenger() { return wrapperContained.couldAcceptPassenger(); }
public void onDamaged(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.onDamaged(damageSource.wrapperContained); }
public yarnwrap.entity.damage.DamageSources getDamageSources() { return new yarnwrap.entity.damage.DamageSources(wrapperContained.getDamageSources()); }
public boolean canBeHitByProjectile() { return wrapperContained.canBeHitByProjectile(); }
public float getStepHeight() { return wrapperContained.getStepHeight(); }
public boolean shouldDismountUnderwater() { return wrapperContained.shouldDismountUnderwater(); }
public yarnwrap.entity.Entity getControllingVehicle() { return new yarnwrap.entity.Entity(wrapperContained.getControllingVehicle()); }
// public void playCombinationStepSounds(yarnwrap.block.BlockState primaryState,yarnwrap.block.BlockState secondaryState) { wrapperContained.playCombinationStepSounds(primaryState.wrapperContained,secondaryState.wrapperContained); }
// public yarnwrap.util.math.BlockPos getStepSoundPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getStepSoundPos(pos.wrapperContained)); }
// public void method_49789(yarnwrap.entity.Entity entity) { wrapperContained.method_49789(entity.wrapperContained); }
// public boolean shouldPlayAmethystChimeSound(yarnwrap.block.BlockState state) { return wrapperContained.shouldPlayAmethystChimeSound(state.wrapperContained); }
// public void teleportPassengers() { wrapperContained.teleportPassengers(); }
// public void playSwimSound() { wrapperContained.playSwimSound(); }
// public void playSecondaryStepSound(yarnwrap.block.BlockState state) { wrapperContained.playSecondaryStepSound(state.wrapperContained); }
// public void playStepSounds(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.playStepSounds(pos.wrapperContained,state.wrapperContained); }
// public void setWorld(yarnwrap.world.World world) { wrapperContained.setWorld(world.wrapperContained); }
// public boolean stepOnBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean playSound,boolean emitEvent,yarnwrap.util.math.Vec3d movement) { return wrapperContained.stepOnBlock(pos.wrapperContained,state.wrapperContained,playSound,emitEvent,movement.wrapperContained); }
// public boolean canClimb(yarnwrap.block.BlockState state) { return wrapperContained.canClimb(state.wrapperContained); }
// public void updateSupportingBlockPos(boolean onGround,yarnwrap.util.math.Vec3d movement) { wrapperContained.updateSupportingBlockPos(onGround,movement.wrapperContained); }
public int getPortalCooldown() { return wrapperContained.getPortalCooldown(); }
public boolean isSupportedBy(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSupportedBy(pos.wrapperContained); }
public void setPortalCooldown(int portalCooldown) { wrapperContained.setPortalCooldown(portalCooldown); }
public boolean isOnRail() { return wrapperContained.isOnRail(); }
// public void lerpPosAndRotation(int step,double x,double y,double z,double yaw,double pitch) { wrapperContained.lerpPosAndRotation(step,x,y,z,yaw,pitch); }
// public yarnwrap.util.math.Vec3d getPassengerAttachmentPos(yarnwrap.entity.Entity passenger,yarnwrap.entity.EntityDimensions dimensions,float scaleFactor) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPassengerAttachmentPos(passenger.wrapperContained,dimensions.wrapperContained,scaleFactor)); }
public boolean shouldControlVehicles() { return wrapperContained.shouldControlVehicles(); }
public boolean isInFluid() { return wrapperContained.isInFluid(); }
public yarnwrap.util.math.Vec3d getPassengerRidingPos(yarnwrap.entity.Entity passenger) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPassengerRidingPos(passenger.wrapperContained)); }
public double getLerpTargetY() { return wrapperContained.getLerpTargetY(); }
public double getLerpTargetZ() { return wrapperContained.getLerpTargetZ(); }
public float getLerpTargetPitch() { return wrapperContained.getLerpTargetPitch(); }
public double getLerpTargetX() { return wrapperContained.getLerpTargetX(); }
public float getLerpTargetYaw() { return wrapperContained.getLerpTargetYaw(); }
// public boolean method_54756(yarnwrap.entity.Entity passenger) { return wrapperContained.method_54756(passenger.wrapperContained); }
public int getPlayerPassengers() { return wrapperContained.getPlayerPassengers(); }
// public yarnwrap.util.math.Vec3d getPassengerAttachmentPos(yarnwrap.entity.Entity vehicle,yarnwrap.entity.Entity passenger,yarnwrap.entity.EntityAttachments attachments) { return new yarnwrap.util.math.Vec3d(wrapperContained.getPassengerAttachmentPos(vehicle.wrapperContained,passenger.wrapperContained,attachments.wrapperContained)); }
public yarnwrap.block.BlockState getBlockStateAtPos() { return new yarnwrap.block.BlockState(wrapperContained.getBlockStateAtPos()); }
public yarnwrap.util.math.Vec3d getVehicleAttachmentPos(yarnwrap.entity.Entity vehicle) { return new yarnwrap.util.math.Vec3d(wrapperContained.getVehicleAttachmentPos(vehicle.wrapperContained)); }
public yarnwrap.entity.ProjectileDeflection getProjectileDeflection(yarnwrap.entity.projectile.ProjectileEntity projectile) { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.getProjectileDeflection(projectile.wrapperContained)); }
public yarnwrap.entity.EntityAttachments getAttachments() { return new yarnwrap.entity.EntityAttachments(wrapperContained.getAttachments()); }
public void setOnFireForTicks(int ticks) { wrapperContained.setOnFireForTicks(ticks); }
// public void onBlockCollision(yarnwrap.block.BlockState state) { wrapperContained.onBlockCollision(state.wrapperContained); }
// public void fall(double heightDifference,boolean onGround,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos landedPosition) { wrapperContained.fall(heightDifference,onGround,state.wrapperContained,landedPosition.wrapperContained); }
public boolean isSprinting() { return wrapperContained.isSprinting(); }
// public yarnwrap.sound.SoundEvent getSplashSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSplashSound()); }
public boolean hasPassenger(yarnwrap.entity.Entity passenger) { return wrapperContained.hasPassenger(passenger.wrapperContained); }
// public void addPassenger(yarnwrap.entity.Entity passenger) { wrapperContained.addPassenger(passenger.wrapperContained); }
// public boolean doesNotCollide(yarnwrap.util.math.Box box) { return wrapperContained.doesNotCollide(box.wrapperContained); }
// public void updateSubmergedInWaterState() { wrapperContained.updateSubmergedInWaterState(); }
public yarnwrap.util.math.Vec3d getRotationVector(float pitch,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVector(pitch,yaw)); }
// public void pushOutOfBlocks(double x,double y,double z) { wrapperContained.pushOutOfBlocks(x,y,z); }
public yarnwrap.sound.SoundCategory getSoundCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getSoundCategory()); }
public void setBodyYaw(float bodyYaw) { wrapperContained.setBodyYaw(bodyYaw); }
public boolean isWet() { return wrapperContained.isWet(); }
// public boolean shouldSetPositionOnLoad() { return wrapperContained.shouldSetPositionOnLoad(); }
public void setOnFireFor(float seconds) { wrapperContained.setOnFireFor(seconds); }
public boolean shouldRender(double distance) { return wrapperContained.shouldRender(distance); }
public void updatePositionAndAngles(double x,double y,double z,float yaw,float pitch) { wrapperContained.updatePositionAndAngles(x,y,z,yaw,pitch); }
public yarnwrap.entity.LivingEntity getControllingPassenger() { return new yarnwrap.entity.LivingEntity(wrapperContained.getControllingPassenger()); }
public boolean damage(yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.damage(source.wrapperContained,amount); }
public void onPassengerLookAround(yarnwrap.entity.Entity passenger) { wrapperContained.onPassengerLookAround(passenger.wrapperContained); }
public boolean isTeamPlayer(yarnwrap.scoreboard.AbstractTeam team) { return wrapperContained.isTeamPlayer(team.wrapperContained); }
public void extinguish() { wrapperContained.extinguish(); }
public yarnwrap.nbt.NbtCompound writeNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeNbt(nbt.wrapperContained)); }
public void setInvisible(boolean invisible) { wrapperContained.setInvisible(invisible); }
public double squaredDistanceTo(double x,double y,double z) { return wrapperContained.squaredDistanceTo(x,y,z); }
// public void remove(Object reason) { wrapperContained.remove(reason); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
// public void writeCustomDataToNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeCustomDataToNbt(nbt.wrapperContained); }
// public java.lang.String getSavedEntityId() { return wrapperContained.getSavedEntityId(); }
public boolean doesNotCollide(double offsetX,double offsetY,double offsetZ) { return wrapperContained.doesNotCollide(offsetX,offsetY,offsetZ); }
public boolean isInvulnerable() { return wrapperContained.isInvulnerable(); }
public yarnwrap.block.piston.PistonBehavior getPistonBehavior() { return new yarnwrap.block.piston.PistonBehavior(wrapperContained.getPistonBehavior()); }
public boolean isImmuneToExplosion(yarnwrap.world.explosion.Explosion explosion) { return wrapperContained.isImmuneToExplosion(explosion.wrapperContained); }
public void setSneaking(boolean sneaking) { wrapperContained.setSneaking(sneaking); }
public boolean saveNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.saveNbt(nbt.wrapperContained); }
public yarnwrap.util.math.Vec3d getRotationVecClient() { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVecClient()); }
public yarnwrap.util.ActionResult interactAt(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.Vec3d hitPos,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactAt(player.wrapperContained,hitPos.wrapperContained,hand.wrapperContained)); }
public void setCustomName(yarnwrap.text.Text name) { wrapperContained.setCustomName(name.wrapperContained); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
public yarnwrap.entity.Entity getRootVehicle() { return new yarnwrap.entity.Entity(wrapperContained.getRootVehicle()); }
public int getAir() { return wrapperContained.getAir(); }
public void baseTick() { wrapperContained.baseTick(); }
public yarnwrap.server.command.ServerCommandSource getCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getCommandSource()); }
// public yarnwrap.sound.SoundEvent getHighSpeedSplashSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getHighSpeedSplashSound()); }
public boolean isPushedByFluids() { return wrapperContained.isPushedByFluids(); }
// public int getBurningDuration() { return wrapperContained.getBurningDuration(); }
public boolean isInvulnerableTo(yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.isInvulnerableTo(damageSource.wrapperContained); }
public boolean canBeSpectated(yarnwrap.server.network.ServerPlayerEntity spectator) { return wrapperContained.canBeSpectated(spectator.wrapperContained); }
public boolean isSwimming() { return wrapperContained.isSwimming(); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
public void updateTrackedHeadRotation(float yaw,int interpolationSteps) { wrapperContained.updateTrackedHeadRotation(yaw,interpolationSteps); }
public void setInvulnerable(boolean invulnerable) { wrapperContained.setInvulnerable(invulnerable); }
public java.util.List getPassengerList() { return wrapperContained.getPassengerList(); }
public boolean hasPermissionLevel(int permissionLevel) { return wrapperContained.hasPermissionLevel(permissionLevel); }
public yarnwrap.util.ActionResult interact(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interact(player.wrapperContained,hand.wrapperContained)); }
// public int getPermissionLevel() { return wrapperContained.getPermissionLevel(); }
public void onExplodedBy(yarnwrap.entity.Entity entity) { wrapperContained.onExplodedBy(entity.wrapperContained); }
public boolean updateMovementInFluid(yarnwrap.registry.tag.TagKey tag,double speed) { return wrapperContained.updateMovementInFluid(tag.wrapperContained,speed); }
// public void initDataTracker(Object builder) { wrapperContained.initDataTracker(builder); }
public void onPlayerCollision(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onPlayerCollision(player.wrapperContained); }
public float getPitch(float tickDelta) { return wrapperContained.getPitch(tickDelta); }
public boolean canAvoidTraps() { return wrapperContained.canAvoidTraps(); }
public void pushAwayFrom(yarnwrap.entity.Entity entity) { wrapperContained.pushAwayFrom(entity.wrapperContained); }
public boolean handleAttack(yarnwrap.entity.Entity attacker) { return wrapperContained.handleAttack(attacker.wrapperContained); }
public double getFinalGravity() { return wrapperContained.getFinalGravity(); }
public yarnwrap.entity.ItemEntity dropStack(yarnwrap.item.ItemStack stack,float yOffset) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropStack(stack.wrapperContained,yOffset)); }
// public void applyGravity() { wrapperContained.applyGravity(); }
public void onBubbleColumnSurfaceCollision(boolean drag) { wrapperContained.onBubbleColumnSurfaceCollision(drag); }
public boolean isSilent() { return wrapperContained.isSilent(); }
// public void lookAt(Object anchorPoint,yarnwrap.util.math.Vec3d target) { wrapperContained.lookAt(anchorPoint,target.wrapperContained); }
public boolean hasPassenger(java.util.function.Predicate predicate) { return wrapperContained.hasPassenger(predicate); }
public float getYaw(float tickDelta) { return wrapperContained.getYaw(tickDelta); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemConvertible item) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(item.wrapperContained)); }
public double squaredDistanceTo(yarnwrap.util.math.Vec3d vector) { return wrapperContained.squaredDistanceTo(vector.wrapperContained); }
public boolean isLiving() { return wrapperContained.isLiving(); }
// public void setRotation(float yaw,float pitch) { wrapperContained.setRotation(yaw,pitch); }
public void handleStatus(byte status) { wrapperContained.handleStatus(status); }
// public void playStepSound(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.playStepSound(pos.wrapperContained,state.wrapperContained); }
// public void checkWaterState() { wrapperContained.checkWaterState(); }
public boolean isSneaking() { return wrapperContained.isSneaking(); }
public void updateKilledAdvancementCriterion(yarnwrap.entity.Entity entityKilled,int score,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.updateKilledAdvancementCriterion(entityKilled.wrapperContained,score,damageSource.wrapperContained); }
public float getBrightnessAtEyes() { return wrapperContained.getBrightnessAtEyes(); }
public void copyPositionAndRotation(yarnwrap.entity.Entity entity) { wrapperContained.copyPositionAndRotation(entity.wrapperContained); }
public yarnwrap.util.math.Vec3d getRotationVector() { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVector()); }
public boolean isTouchingWaterOrRain() { return wrapperContained.isTouchingWaterOrRain(); }
public boolean isTeammate(yarnwrap.entity.Entity other) { return wrapperContained.isTeammate(other.wrapperContained); }
public void updateVelocity(float speed,yarnwrap.util.math.Vec3d movementInput) { wrapperContained.updateVelocity(speed,movementInput.wrapperContained); }
public void refreshPositionAndAngles(yarnwrap.util.math.BlockPos pos,float yaw,float pitch) { wrapperContained.refreshPositionAndAngles(pos.wrapperContained,yaw,pitch); }
// public yarnwrap.nbt.NbtList toNbtList(float values) { return new yarnwrap.nbt.NbtList(wrapperContained.toNbtList(values)); }
public boolean shouldRender(double cameraX,double cameraY,double cameraZ) { return wrapperContained.shouldRender(cameraX,cameraY,cameraZ); }
public void setSprinting(boolean sprinting) { wrapperContained.setSprinting(sprinting); }
// public void setFlag(int index,boolean value) { wrapperContained.setFlag(index,value); }
public void setOnFireFromLava() { wrapperContained.setOnFireFromLava(); }
public yarnwrap.entity.Entity teleportTo(yarnwrap.world.TeleportTarget teleportTarget) { return new yarnwrap.entity.Entity(wrapperContained.teleportTo(teleportTarget.wrapperContained)); }
public boolean isAttackable() { return wrapperContained.isAttackable(); }
public boolean shouldRenderName() { return wrapperContained.shouldRenderName(); }
// public void playSwimSound(float volume) { wrapperContained.playSwimSound(volume); }
public yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getHorizontalFacing()); }
public java.lang.Iterable getPassengersDeep() { return wrapperContained.getPassengersDeep(); }
// public yarnwrap.sound.SoundEvent getSwimSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSwimSound()); }
public boolean removeCommandTag(java.lang.String tag) { return wrapperContained.removeCommandTag(tag); }
public float distanceTo(yarnwrap.entity.Entity entity) { return wrapperContained.distanceTo(entity.wrapperContained); }
public boolean hasNoGravity() { return wrapperContained.hasNoGravity(); }
public void onStoppedTrackingBy(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onStoppedTrackingBy(player.wrapperContained); }
public yarnwrap.util.hit.HitResult raycast(double maxDistance,float tickDelta,boolean includeFluids) { return new yarnwrap.util.hit.HitResult(wrapperContained.raycast(maxDistance,tickDelta,includeFluids)); }
// public void onSwimmingStart() { wrapperContained.onSwimmingStart(); }
public boolean handleFallDamage(float fallDistance,float damageMultiplier,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.handleFallDamage(fallDistance,damageMultiplier,damageSource.wrapperContained); }
public int getMaxAir() { return wrapperContained.getMaxAir(); }
// public void readCustomDataFromNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readCustomDataFromNbt(nbt.wrapperContained); }
public void setVelocityClient(double x,double y,double z) { wrapperContained.setVelocityClient(x,y,z); }
public float getStandingEyeHeight() { return wrapperContained.getStandingEyeHeight(); }
public java.util.Set getCommandTags() { return wrapperContained.getCommandTags(); }
public boolean isFireImmune() { return wrapperContained.isFireImmune(); }
public yarnwrap.util.math.Direction getMovementDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getMovementDirection()); }
public boolean isInvisibleTo(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isInvisibleTo(player.wrapperContained); }
public boolean isInsideWall() { return wrapperContained.isInsideWall(); }
public void updateTrackedPositionAndAngles(double x,double y,double z,float yaw,float pitch,int interpolationSteps) { wrapperContained.updateTrackedPositionAndAngles(x,y,z,yaw,pitch,interpolationSteps); }
// public void tickPortalCooldown() { wrapperContained.tickPortalCooldown(); }
public void addVelocity(double deltaX,double deltaY,double deltaZ) { wrapperContained.addVelocity(deltaX,deltaY,deltaZ); }
public float applyMirror(yarnwrap.util.BlockMirror mirror) { return wrapperContained.applyMirror(mirror.wrapperContained); }
public void onBubbleColumnCollision(boolean drag) { wrapperContained.onBubbleColumnCollision(drag); }
public boolean hasVehicle() { return wrapperContained.hasVehicle(); }
public boolean isInvisible() { return wrapperContained.isInvisible(); }
public void kill() { wrapperContained.kill(); }
// public yarnwrap.text.HoverEvent getHoverEvent() { return new yarnwrap.text.HoverEvent(wrapperContained.getHoverEvent()); }
public yarnwrap.world.World getEntityWorld() { return new yarnwrap.world.World(wrapperContained.getEntityWorld()); }
public boolean isInLava() { return wrapperContained.isInLava(); }
public void removeAllPassengers() { wrapperContained.removeAllPassengers(); }
public void tick() { wrapperContained.tick(); }
public float getEffectiveExplosionResistance(yarnwrap.world.explosion.Explosion explosion,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState,float max) { return wrapperContained.getEffectiveExplosionResistance(explosion.wrapperContained,world.wrapperContained,pos.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained,max); }
public yarnwrap.entity.ItemEntity dropStack(yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropStack(stack.wrapperContained)); }
// public boolean isFlappingWings() { return wrapperContained.isFlappingWings(); }
public boolean isSubmergedIn(yarnwrap.registry.tag.TagKey fluidTag) { return wrapperContained.isSubmergedIn(fluidTag.wrapperContained); }
// public boolean isBeingRainedOn() { return wrapperContained.isBeingRainedOn(); }
public boolean isPartOf(yarnwrap.entity.Entity entity) { return wrapperContained.isPartOf(entity.wrapperContained); }
public boolean addCommandTag(java.lang.String tag) { return wrapperContained.addCommandTag(tag); }
public yarnwrap.scoreboard.Team getScoreboardTeam() { return new yarnwrap.scoreboard.Team(wrapperContained.getScoreboardTeam()); }
public boolean hasPassengers() { return wrapperContained.hasPassengers(); }
public void playSound(yarnwrap.sound.SoundEvent sound,float volume,float pitch) { wrapperContained.playSound(sound.wrapperContained,volume,pitch); }
public void move(yarnwrap.entity.MovementType movementType,yarnwrap.util.math.Vec3d movement) { wrapperContained.move(movementType.wrapperContained,movement.wrapperContained); }
// public void scheduleVelocityUpdate() { wrapperContained.scheduleVelocityUpdate(); }
public boolean saveSelfNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.saveSelfNbt(nbt.wrapperContained); }
public boolean isLogicalSideForUpdatingMovement() { return wrapperContained.isLogicalSideForUpdatingMovement(); }
public void updateSwimming() { wrapperContained.updateSwimming(); }
public float getHeadYaw() { return wrapperContained.getHeadYaw(); }
// public void removePassenger(yarnwrap.entity.Entity passenger) { wrapperContained.removePassenger(passenger.wrapperContained); }
public boolean isConnectedThroughVehicle(yarnwrap.entity.Entity entity) { return wrapperContained.isConnectedThroughVehicle(entity.wrapperContained); }
// public boolean getFlag(int index) { return wrapperContained.getFlag(index); }
public void setSwimming(boolean swimming) { wrapperContained.setSwimming(swimming); }
// public boolean isInsideBubbleColumn() { return wrapperContained.isInsideBubbleColumn(); }
public boolean isTouchingWater() { return wrapperContained.isTouchingWater(); }
public void onStruckByLightning(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LightningEntity lightning) { wrapperContained.onStruckByLightning(world.wrapperContained,lightning.wrapperContained); }
// public void addFlapEffects() { wrapperContained.addFlapEffects(); }
public yarnwrap.util.math.Vec2f getRotationClient() { return new yarnwrap.util.math.Vec2f(wrapperContained.getRotationClient()); }
public void setSilent(boolean silent) { wrapperContained.setSilent(silent); }
public boolean startRiding(yarnwrap.entity.Entity entity) { return wrapperContained.startRiding(entity.wrapperContained); }
public boolean isAlive() { return wrapperContained.isAlive(); }
public int getDefaultPortalCooldown() { return wrapperContained.getDefaultPortalCooldown(); }
public boolean isCustomNameVisible() { return wrapperContained.isCustomNameVisible(); }
public void refreshPositionAndAngles(double x,double y,double z,float yaw,float pitch) { wrapperContained.refreshPositionAndAngles(x,y,z,yaw,pitch); }
public boolean isOnFire() { return wrapperContained.isOnFire(); }
public boolean isPushable() { return wrapperContained.isPushable(); }
// public yarnwrap.text.Style method_5813(yarnwrap.text.Style style) { return new yarnwrap.text.Style(wrapperContained.method_5813(style.wrapperContained)); }
public void setPosition(double x,double y,double z) { wrapperContained.setPosition(x,y,z); }
public yarnwrap.util.math.Direction getFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getFacing()); }
public boolean isInsideWaterOrBubbleColumn() { return wrapperContained.isInsideWaterOrBubbleColumn(); }
public boolean hasPlayerRider() { return wrapperContained.hasPlayerRider(); }
// public boolean canAddPassenger(yarnwrap.entity.Entity passenger) { return wrapperContained.canAddPassenger(passenger.wrapperContained); }
public void populateCrashReport(yarnwrap.util.crash.CrashReportSection section) { wrapperContained.populateCrashReport(section.wrapperContained); }
public boolean hasPassengerDeep(yarnwrap.entity.Entity passenger) { return wrapperContained.hasPassengerDeep(passenger.wrapperContained); }
public boolean canUsePortals(boolean allowVehicles) { return wrapperContained.canUsePortals(allowVehicles); }
public double getRenderDistanceMultiplier() { return wrapperContained.getRenderDistanceMultiplier(); }
// public void tickInVoid() { wrapperContained.tickInVoid(); }
public void setUuid(java.util.UUID uuid) { wrapperContained.setUuid(uuid); }
public yarnwrap.util.math.Vec3d getRotationVec(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVec(tickDelta)); }
public yarnwrap.util.math.Box getVisibilityBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getVisibilityBoundingBox()); }
public float applyRotation(yarnwrap.util.BlockRotation rotation) { return wrapperContained.applyRotation(rotation.wrapperContained); }
public boolean entityDataRequiresOperator() { return wrapperContained.entityDataRequiresOperator(); }
public void setGlowing(boolean glowing) { wrapperContained.setGlowing(glowing); }
public yarnwrap.util.math.Vec3d getCameraPosVec(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getCameraPosVec(tickDelta)); }
public void onStartedTrackingBy(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onStartedTrackingBy(player.wrapperContained); }
public void setId(int id) { wrapperContained.setId(id); }
// public void spawnSprintingParticles() { wrapperContained.spawnSprintingParticles(); }
public void setRenderDistanceMultiplier(double value) { wrapperContained.setRenderDistanceMultiplier(value); }
public yarnwrap.entity.data.DataTracker getDataTracker() { return new yarnwrap.entity.data.DataTracker(wrapperContained.getDataTracker()); }
public void tickRiding() { wrapperContained.tickRiding(); }
public void slowMovement(yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d multiplier) { wrapperContained.slowMovement(state.wrapperContained,multiplier.wrapperContained); }
public java.lang.String getUuidAsString() { return wrapperContained.getUuidAsString(); }
// public yarnwrap.nbt.NbtList toNbtList(double values) { return new yarnwrap.nbt.NbtList(wrapperContained.toNbtList(values)); }
public void setHeadYaw(float headYaw) { wrapperContained.setHeadYaw(headYaw); }
public void stopRiding() { wrapperContained.stopRiding(); }
public int getSafeFallDistance() { return wrapperContained.getSafeFallDistance(); }
public boolean isGlowing() { return wrapperContained.isGlowing(); }
// public void checkBlockCollision() { wrapperContained.checkBlockCollision(); }
public boolean canExplosionDestroyBlock(yarnwrap.world.explosion.Explosion explosion,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float explosionPower) { return wrapperContained.canExplosionDestroyBlock(explosion.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,explosionPower); }
public yarnwrap.entity.Entity getVehicle() { return new yarnwrap.entity.Entity(wrapperContained.getVehicle()); }
public void setAir(int air) { wrapperContained.setAir(air); }
// public yarnwrap.text.Text removeClickEvents(yarnwrap.text.Text textComponent) { return new yarnwrap.text.Text(wrapperContained.removeClickEvents(textComponent.wrapperContained)); }
public void setBoundingBox(yarnwrap.util.math.Box boundingBox) { wrapperContained.setBoundingBox(boundingBox.wrapperContained); }
public double squaredDistanceTo(yarnwrap.entity.Entity entity) { return wrapperContained.squaredDistanceTo(entity.wrapperContained); }
public void requestTeleport(double destX,double destY,double destZ) { wrapperContained.requestTeleport(destX,destY,destZ); }
// public boolean canStartRiding(yarnwrap.entity.Entity entity) { return wrapperContained.canStartRiding(entity.wrapperContained); }
public double getFluidHeight(yarnwrap.registry.tag.TagKey fluid) { return wrapperContained.getFluidHeight(fluid.wrapperContained); }
public boolean doesRenderOnFire() { return wrapperContained.doesRenderOnFire(); }
public boolean canHit() { return wrapperContained.canHit(); }
public yarnwrap.entity.EntityType getType() { return new yarnwrap.entity.EntityType(wrapperContained.getType()); }
// public void updatePassengerPosition(yarnwrap.entity.Entity passenger,Object positionUpdater) { wrapperContained.updatePassengerPosition(passenger.wrapperContained,positionUpdater); }
// public float calculateNextStepSoundDistance() { return wrapperContained.calculateNextStepSoundDistance(); }
public boolean isSubmergedInWater() { return wrapperContained.isSubmergedInWater(); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemConvertible item,int yOffset) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(item.wrapperContained,yOffset)); }
public float getTargetingMargin() { return wrapperContained.getTargetingMargin(); }
public void changeLookDirection(double cursorDeltaX,double cursorDeltaY) { wrapperContained.changeLookDirection(cursorDeltaX,cursorDeltaY); }
public boolean startRiding(yarnwrap.entity.Entity entity,boolean force) { return wrapperContained.startRiding(entity.wrapperContained,force); }
public boolean onKilledOther(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity other) { return wrapperContained.onKilledOther(world.wrapperContained,other.wrapperContained); }
public void setNoGravity(boolean noGravity) { wrapperContained.setNoGravity(noGravity); }
// public boolean updateWaterState() { return wrapperContained.updateWaterState(); }
public void copyFrom(yarnwrap.entity.Entity original) { wrapperContained.copyFrom(original.wrapperContained); }
public void animateDamage(float yaw) { wrapperContained.animateDamage(yaw); }
public void setCustomNameVisible(boolean visible) { wrapperContained.setCustomNameVisible(visible); }
public void checkDespawn() { wrapperContained.checkDespawn(); }
// public java.util.List findCollisionsForMovement(yarnwrap.entity.Entity entity,yarnwrap.world.World world,java.util.List regularCollisions,yarnwrap.util.math.Box movingEntityBoundingBox) { return wrapperContained.findCollisionsForMovement(entity.wrapperContained,world.wrapperContained,regularCollisions,movingEntityBoundingBox.wrapperContained); }
// public float[] collectStepHeights(yarnwrap.util.math.Box collisionBox,java.util.List collisions,float stepHeight) { return wrapperContained.collectStepHeights(collisionBox.wrapperContained,collisions,stepHeight); }
public yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom()); }
public yarnwrap.item.ItemStack getWeaponStack() { return new yarnwrap.item.ItemStack(wrapperContained.getWeaponStack()); }
public boolean canMoveVoluntarily() { return wrapperContained.canMoveVoluntarily(); }
public yarnwrap.util.math.Vec3d getMovement() { return new yarnwrap.util.math.Vec3d(wrapperContained.getMovement()); }
public boolean recalculateDimensions(yarnwrap.entity.EntityDimensions previous) { return wrapperContained.recalculateDimensions(previous.wrapperContained); }
public void addVelocity(yarnwrap.util.math.Vec3d velocity) { wrapperContained.addVelocity(velocity.wrapperContained); }
public void setOnGround(boolean onGround,yarnwrap.util.math.Vec3d movement) { wrapperContained.setOnGround(onGround,movement.wrapperContained); }
public void setAngles(float yaw,float pitch) { wrapperContained.setAngles(yaw,pitch); }
public void tryUsePortal(yarnwrap.block.Portal portal,yarnwrap.util.math.BlockPos pos) { wrapperContained.tryUsePortal(portal.wrapperContained,pos.wrapperContained); }
// public void tickPortalTeleportation() { wrapperContained.tickPortalTeleportation(); }
public void refreshPositionAndAngles(yarnwrap.util.math.Vec3d pos,float yaw,float pitch) { wrapperContained.refreshPositionAndAngles(pos.wrapperContained,yaw,pitch); }
public void addPortalChunkTicketAt(yarnwrap.util.math.BlockPos pos) { wrapperContained.addPortalChunkTicketAt(pos.wrapperContained); }
public float lerpYaw(float delta) { return wrapperContained.lerpYaw(delta); }
public boolean canTeleportBetween(yarnwrap.world.World from,yarnwrap.world.World to) { return wrapperContained.canTeleportBetween(from.wrapperContained,to.wrapperContained); }
public boolean isSpectator() { return wrapperContained.isSpectator(); }
// public double getGravity() { return wrapperContained.getGravity(); }

}