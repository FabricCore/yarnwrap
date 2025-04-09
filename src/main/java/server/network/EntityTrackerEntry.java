package yarnwrap.server.network;
public class EntityTrackerEntry { public net.minecraft.server.network.EntityTrackerEntry wrapperContained; public EntityTrackerEntry(net.minecraft.server.network.EntityTrackerEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public int tickInterval() { return wrapperContained.tickInterval; }
// public boolean alwaysUpdateVelocity() { return wrapperContained.alwaysUpdateVelocity; }
// public int trackingTick() { return wrapperContained.trackingTick; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int updatesWithoutVehicle() { return wrapperContained.updatesWithoutVehicle; }
// public java.util.List lastPassengers() { return wrapperContained.lastPassengers; }
// public int lastPitch() { return wrapperContained.lastPitch; }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public boolean hadVehicle() { return wrapperContained.hadVehicle; }
// public int lastHeadYaw() { return wrapperContained.lastHeadYaw; }
// public int lastYaw() { return wrapperContained.lastYaw; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public java.util.function.Consumer receiver() { return wrapperContained.receiver; }
// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public yarnwrap.entity.TrackedPosition trackedPos() { return new yarnwrap.entity.TrackedPosition(wrapperContained.trackedPos); }
// public java.util.List changedEntries() { return wrapperContained.changedEntries; }
public void stopTracking(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.stopTracking(player.wrapperContained); }
// public void syncEntityData() { wrapperContained.syncEntityData(); }
public void tick() { wrapperContained.tick(); }
public void sendPackets(yarnwrap.server.network.ServerPlayerEntity player,java.util.function.Consumer sender) { wrapperContained.sendPackets(player.wrapperContained,sender); }
// public void sendSyncPacket(yarnwrap.network.packet.Packet packet) { wrapperContained.sendSyncPacket(packet.wrapperContained); }
public void startTracking(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.startTracking(player.wrapperContained); }
// public java.util.stream.Stream streamChangedPassengers(java.util.List passengers,java.util.List lastPassengers) { return wrapperContained.streamChangedPassengers(passengers,lastPassengers); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
public yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity()); }
public float getPitch() { return wrapperContained.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
public float getHeadYaw() { return wrapperContained.getHeadYaw(); }

}