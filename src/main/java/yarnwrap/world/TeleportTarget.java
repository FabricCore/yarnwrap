package yarnwrap.world;
public class TeleportTarget { public net.minecraft.world.TeleportTarget wrapperContained; public TeleportTarget(net.minecraft.world.TeleportTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public void velocity(yarnwrap.util.math.Vec3d value) { wrapperContained.velocity = value.wrapperContained; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
public Object NO_OP() { return wrapperContained.NO_OP; }
// // public void NO_OP(Object value) { wrapperContained.NO_OP = value; }
public Object SEND_TRAVEL_THROUGH_PORTAL_PACKET() { return wrapperContained.SEND_TRAVEL_THROUGH_PORTAL_PACKET; }
// // public void SEND_TRAVEL_THROUGH_PORTAL_PACKET(Object value) { wrapperContained.SEND_TRAVEL_THROUGH_PORTAL_PACKET = value; }
public Object ADD_PORTAL_CHUNK_TICKET() { return wrapperContained.ADD_PORTAL_CHUNK_TICKET; }
// // public void ADD_PORTAL_CHUNK_TICKET(Object value) { wrapperContained.ADD_PORTAL_CHUNK_TICKET = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world()); }
// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity()); }
// public float yaw() { return wrapperContained.yaw(); }
// public float pitch() { return wrapperContained.pitch(); }
// public yarnwrap.world.TeleportTarget missingSpawnBlock(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.missingSpawnBlock(world.wrapperContained,entity.wrapperContained,postDimensionTransition)); }
// public yarnwrap.util.math.Vec3d getWorldSpawnPos(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.getWorldSpawnPos(world.wrapperContained,entity.wrapperContained)); }
// public void sendTravelThroughPortalPacket(yarnwrap.entity.Entity entity) { wrapperContained.sendTravelThroughPortalPacket(entity.wrapperContained); }
// public void addPortalChunkTicket(yarnwrap.entity.Entity entity) { wrapperContained.addPortalChunkTicket(entity.wrapperContained); }

}