package yarnwrap.world;
public class TeleportTarget { public net.minecraft.world.TeleportTarget wrapperContained; public TeleportTarget(net.minecraft.world.TeleportTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public float yaw() { return wrapperContained.yaw; }
// public float pitch() { return wrapperContained.pitch; }
public Object NO_OP() { return wrapperContained.NO_OP; }
public Object SEND_TRAVEL_THROUGH_PORTAL_PACKET() { return wrapperContained.SEND_TRAVEL_THROUGH_PORTAL_PACKET; }
public Object ADD_PORTAL_CHUNK_TICKET() { return wrapperContained.ADD_PORTAL_CHUNK_TICKET; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world()); }
// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity()); }
// public float yaw() { return wrapperContained.yaw(); }
// public float pitch() { return wrapperContained.pitch(); }
// public yarnwrap.world.TeleportTarget missingSpawnBlock(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.missingSpawnBlock(world.wrapperContained,entity.wrapperContained,postDimensionTransition)); }
// public yarnwrap.util.math.Vec3d getWorldSpawnPos(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.getWorldSpawnPos(world.wrapperContained,entity.wrapperContained)); }
// public void sendTravelThroughPortalPacket(yarnwrap.entity.Entity entity) { wrapperContained.sendTravelThroughPortalPacket(entity.wrapperContained); }
// public void addPortalChunkTicket(yarnwrap.entity.Entity entity) { wrapperContained.addPortalChunkTicket(entity.wrapperContained); }

}