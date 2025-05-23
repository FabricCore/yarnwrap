package yarnwrap.server.network;
public class EntityTrackerEntry { public net.minecraft.server.network.EntityTrackerEntry wrapperContained; public EntityTrackerEntry(net.minecraft.server.network.EntityTrackerEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public void lastOnGround(boolean value) { wrapperContained.lastOnGround = value; }
// public static boolean lastOnGround() { return net.minecraft.server.network.EntityTrackerEntry.lastOnGround; }
// public static void lastOnGround(boolean value, ) { net.minecraft.server.network.EntityTrackerEntry.lastOnGround = value; }

// public int tickInterval() { return wrapperContained.tickInterval; }
// public void tickInterval(int value) { wrapperContained.tickInterval = value; }
// public static int tickInterval() { return net.minecraft.server.network.EntityTrackerEntry.tickInterval; }
// public static void tickInterval(int value, ) { net.minecraft.server.network.EntityTrackerEntry.tickInterval = value; }

// public boolean alwaysUpdateVelocity() { return wrapperContained.alwaysUpdateVelocity; }
// public void alwaysUpdateVelocity(boolean value) { wrapperContained.alwaysUpdateVelocity = value; }
// public static boolean alwaysUpdateVelocity() { return net.minecraft.server.network.EntityTrackerEntry.alwaysUpdateVelocity; }
// public static void alwaysUpdateVelocity(boolean value, ) { net.minecraft.server.network.EntityTrackerEntry.alwaysUpdateVelocity = value; }

// public int trackingTick() { return wrapperContained.trackingTick; }
// public void trackingTick(int value) { wrapperContained.trackingTick = value; }
// public static int trackingTick() { return net.minecraft.server.network.EntityTrackerEntry.trackingTick; }
// public static void trackingTick(int value, ) { net.minecraft.server.network.EntityTrackerEntry.trackingTick = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.EntityTrackerEntry.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.EntityTrackerEntry.LOGGER = value; }

// public int updatesWithoutVehicle() { return wrapperContained.updatesWithoutVehicle; }
// public void updatesWithoutVehicle(int value) { wrapperContained.updatesWithoutVehicle = value; }
// public static int updatesWithoutVehicle() { return net.minecraft.server.network.EntityTrackerEntry.updatesWithoutVehicle; }
// public static void updatesWithoutVehicle(int value, ) { net.minecraft.server.network.EntityTrackerEntry.updatesWithoutVehicle = value; }

// public java.util.List lastPassengers() { return wrapperContained.lastPassengers; }
// public void lastPassengers(java.util.List value) { wrapperContained.lastPassengers = value; }
// public static java.util.List lastPassengers() { return net.minecraft.server.network.EntityTrackerEntry.lastPassengers; }
// public static void lastPassengers(java.util.List value, ) { net.minecraft.server.network.EntityTrackerEntry.lastPassengers = value; }

// public byte lastPitch() { return wrapperContained.lastPitch; }
// public void lastPitch(byte value) { wrapperContained.lastPitch = value; }
// public static byte lastPitch() { return net.minecraft.server.network.EntityTrackerEntry.lastPitch; }
// public static void lastPitch(byte value, ) { net.minecraft.server.network.EntityTrackerEntry.lastPitch = value; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.server.network.EntityTrackerEntry.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.server.network.EntityTrackerEntry.entity = value.wrapperContained; }

// public boolean hadVehicle() { return wrapperContained.hadVehicle; }
// public void hadVehicle(boolean value) { wrapperContained.hadVehicle = value; }
// public static boolean hadVehicle() { return net.minecraft.server.network.EntityTrackerEntry.hadVehicle; }
// public static void hadVehicle(boolean value, ) { net.minecraft.server.network.EntityTrackerEntry.hadVehicle = value; }

// public byte lastHeadYaw() { return wrapperContained.lastHeadYaw; }
// public void lastHeadYaw(byte value) { wrapperContained.lastHeadYaw = value; }
// public static byte lastHeadYaw() { return net.minecraft.server.network.EntityTrackerEntry.lastHeadYaw; }
// public static void lastHeadYaw(byte value, ) { net.minecraft.server.network.EntityTrackerEntry.lastHeadYaw = value; }

// public byte lastYaw() { return wrapperContained.lastYaw; }
// public void lastYaw(byte value) { wrapperContained.lastYaw = value; }
// public static byte lastYaw() { return net.minecraft.server.network.EntityTrackerEntry.lastYaw; }
// public static void lastYaw(byte value, ) { net.minecraft.server.network.EntityTrackerEntry.lastYaw = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.server.network.EntityTrackerEntry.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.server.network.EntityTrackerEntry.world = value.wrapperContained; }

// public java.util.function.Consumer watchingSender() { return wrapperContained.watchingSender; }
// public void watchingSender(java.util.function.Consumer value) { wrapperContained.watchingSender = value; }
// public static java.util.function.Consumer watchingSender() { return net.minecraft.server.network.EntityTrackerEntry.watchingSender; }
// public static void watchingSender(java.util.function.Consumer value, ) { net.minecraft.server.network.EntityTrackerEntry.watchingSender = value; }

// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public void velocity(yarnwrap.util.math.Vec3d value) { wrapperContained.velocity = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.EntityTrackerEntry.velocity); }
// public static void velocity(yarnwrap.util.math.Vec3d value, ) { net.minecraft.server.network.EntityTrackerEntry.velocity = value.wrapperContained; }

// public yarnwrap.entity.TrackedPosition trackedPos() { return new yarnwrap.entity.TrackedPosition(wrapperContained.trackedPos); }
// public void trackedPos(yarnwrap.entity.TrackedPosition value) { wrapperContained.trackedPos = value.wrapperContained; }
// public static yarnwrap.entity.TrackedPosition trackedPos() { return new yarnwrap.entity.TrackedPosition(net.minecraft.server.network.EntityTrackerEntry.trackedPos); }
// public static void trackedPos(yarnwrap.entity.TrackedPosition value, ) { net.minecraft.server.network.EntityTrackerEntry.trackedPos = value.wrapperContained; }

// public java.util.List changedEntries() { return wrapperContained.changedEntries; }
// public void changedEntries(java.util.List value) { wrapperContained.changedEntries = value; }
// public static java.util.List changedEntries() { return net.minecraft.server.network.EntityTrackerEntry.changedEntries; }
// public static void changedEntries(java.util.List value, ) { net.minecraft.server.network.EntityTrackerEntry.changedEntries = value; }

// public java.util.function.BiConsumer filteredWatchingSender() { return wrapperContained.filteredWatchingSender; }
// public void filteredWatchingSender(java.util.function.BiConsumer value) { wrapperContained.filteredWatchingSender = value; }
// public static java.util.function.BiConsumer filteredWatchingSender() { return net.minecraft.server.network.EntityTrackerEntry.filteredWatchingSender; }
// public static void filteredWatchingSender(java.util.function.BiConsumer value, ) { net.minecraft.server.network.EntityTrackerEntry.filteredWatchingSender = value; }

public EntityTrackerEntry(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,int tickInterval,boolean alwaysUpdateVelocity,java.util.function.Consumer watchingSender,java.util.function.BiConsumer filteredWatchingSender) { this.wrapperContained = new net.minecraft.server.network.EntityTrackerEntry(world.wrapperContained,entity.wrapperContained,tickInterval,alwaysUpdateVelocity,watchingSender,filteredWatchingSender); }
public void stopTracking(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.stopTracking(player.wrapperContained); }
// public static void stopTracking(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.network.EntityTrackerEntry.stopTracking(player.wrapperContained); }
// public void syncEntityData() { wrapperContained.syncEntityData(); }
// public static void syncEntityData() { net.minecraft.server.network.EntityTrackerEntry.syncEntityData(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.server.network.EntityTrackerEntry.tick(); }
public void sendPackets(yarnwrap.server.network.ServerPlayerEntity player,java.util.function.Consumer sender) { wrapperContained.sendPackets(player.wrapperContained,sender); }
// public static void sendPackets(yarnwrap.server.network.ServerPlayerEntity player,java.util.function.Consumer sender, ) { net.minecraft.server.network.EntityTrackerEntry.sendPackets(player.wrapperContained,sender); }
// public void sendSyncPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendSyncPacket(packet.wrapperContained); }
// public static void sendSyncPacket(yarnwrap.network.packet.Packet packet, ) { net.minecraft.server.network.EntityTrackerEntry.sendSyncPacket(packet.wrapperContained); }
public void startTracking(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.startTracking(player.wrapperContained); }
// public static void startTracking(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.network.EntityTrackerEntry.startTracking(player.wrapperContained); }
// public java.util.stream.Stream streamChangedPassengers(java.util.List newPassengers) { return wrapperContained.streamChangedPassengers(newPassengers); }
// public static java.util.stream.Stream streamChangedPassengers(java.util.List newPassengers, ) { return net.minecraft.server.network.EntityTrackerEntry.streamChangedPassengers(newPassengers); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.EntityTrackerEntry.getPos()); }
public yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity()); }
// public static yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.server.network.EntityTrackerEntry.getVelocity()); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.server.network.EntityTrackerEntry.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.server.network.EntityTrackerEntry.getYaw(); }
public float getHeadYaw() { return wrapperContained.getHeadYaw(); }
// public static float getHeadYaw() { return net.minecraft.server.network.EntityTrackerEntry.getHeadYaw(); }
// public void tickExperimentalMinecart(yarnwrap.entity.vehicle.ExperimentalMinecartController controller,byte yaw,byte pitch,boolean changedAngles) { wrapperContained.tickExperimentalMinecart(controller.wrapperContained,yaw,pitch,changedAngles); }
// public static void tickExperimentalMinecart(yarnwrap.entity.vehicle.ExperimentalMinecartController controller,byte yaw,byte pitch,boolean changedAngles, ) { net.minecraft.server.network.EntityTrackerEntry.tickExperimentalMinecart(controller.wrapperContained,yaw,pitch,changedAngles); }
// public boolean method_66013(yarnwrap.entity.Entity passenger) { return wrapperContained.method_66013(passenger.wrapperContained); }
// public static boolean method_66013(yarnwrap.entity.Entity passenger, ) { return net.minecraft.server.network.EntityTrackerEntry.method_66013(passenger.wrapperContained); }
// public boolean method_66014(java.util.List passenger) { return wrapperContained.method_66014(passenger); }
// public static boolean method_66014(java.util.List passenger, ) { return net.minecraft.server.network.EntityTrackerEntry.method_66014(passenger); }

}