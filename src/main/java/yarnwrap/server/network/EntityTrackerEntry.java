package yarnwrap.server.network;
public class EntityTrackerEntry { public net.minecraft.server.network.EntityTrackerEntry wrapperContained; public EntityTrackerEntry(net.minecraft.server.network.EntityTrackerEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public void lastOnGround(boolean value) { wrapperContained.lastOnGround = value; }
// public int tickInterval() { return wrapperContained.tickInterval; }
// public void tickInterval(int value) { wrapperContained.tickInterval = value; }
// public boolean alwaysUpdateVelocity() { return wrapperContained.alwaysUpdateVelocity; }
// public void alwaysUpdateVelocity(boolean value) { wrapperContained.alwaysUpdateVelocity = value; }
// public int trackingTick() { return wrapperContained.trackingTick; }
// public void trackingTick(int value) { wrapperContained.trackingTick = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int updatesWithoutVehicle() { return wrapperContained.updatesWithoutVehicle; }
// public void updatesWithoutVehicle(int value) { wrapperContained.updatesWithoutVehicle = value; }
// public java.util.List lastPassengers() { return wrapperContained.lastPassengers; }
// public void lastPassengers(java.util.List value) { wrapperContained.lastPassengers = value; }
// public int lastPitch() { return wrapperContained.lastPitch; }
// public void lastPitch(int value) { wrapperContained.lastPitch = value; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public boolean hadVehicle() { return wrapperContained.hadVehicle; }
// public void hadVehicle(boolean value) { wrapperContained.hadVehicle = value; }
// public int lastHeadYaw() { return wrapperContained.lastHeadYaw; }
// public void lastHeadYaw(int value) { wrapperContained.lastHeadYaw = value; }
// public int lastYaw() { return wrapperContained.lastYaw; }
// public void lastYaw(int value) { wrapperContained.lastYaw = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public java.util.function.Consumer receiver() { return wrapperContained.receiver; }
// public void receiver(java.util.function.Consumer value) { wrapperContained.receiver = value; }
// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public void velocity(yarnwrap.util.math.Vec3d value) { wrapperContained.velocity = value.wrapperContained; }
// public yarnwrap.entity.TrackedPosition trackedPos() { return new yarnwrap.entity.TrackedPosition(wrapperContained.trackedPos); }
// public void trackedPos(yarnwrap.entity.TrackedPosition value) { wrapperContained.trackedPos = value.wrapperContained; }
// public java.util.List changedEntries() { return wrapperContained.changedEntries; }
// public void changedEntries(java.util.List value) { wrapperContained.changedEntries = value; }
public EntityTrackerEntry(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,int tickInterval,boolean alwaysUpdateVelocity,java.util.function.Consumer receiver) { this.wrapperContained = new net.minecraft.server.network.EntityTrackerEntry(world.wrapperContained,entity.wrapperContained,tickInterval,alwaysUpdateVelocity,receiver); }
public void stopTracking(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.stopTracking(player.wrapperContained); }
// public void syncEntityData() { wrapperContained.syncEntityData(); }
public void tick() { wrapperContained.tick(); }
public void sendPackets(yarnwrap.server.network.ServerPlayerEntity player,java.util.function.Consumer sender) { wrapperContained.sendPackets(player.wrapperContained,sender); }
// public void sendSyncPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendSyncPacket(packet.wrapperContained); }
public void startTracking(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.startTracking(player.wrapperContained); }
// public void method_49426(yarnwrap.entity.Entity passenger) { wrapperContained.method_49426(passenger.wrapperContained); }
// public boolean method_49752(java.util.List passenger) { return wrapperContained.method_49752(passenger); }
// public java.util.stream.Stream streamChangedPassengers(java.util.List passengers,java.util.List lastPassengers) { return wrapperContained.streamChangedPassengers(passengers,lastPassengers); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
public yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity()); }
public float getPitch() { return wrapperContained.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
public float getHeadYaw() { return wrapperContained.getHeadYaw(); }

}