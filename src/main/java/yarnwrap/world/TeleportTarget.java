package yarnwrap.world;
public class TeleportTarget { public net.minecraft.world.TeleportTarget wrapperContained; public TeleportTarget(net.minecraft.world.TeleportTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.TeleportTarget.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.world.TeleportTarget.world = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public void velocity(yarnwrap.util.math.Vec3d value) { wrapperContained.velocity = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.TeleportTarget.velocity); }
// public static void velocity(yarnwrap.util.math.Vec3d value, ) { net.minecraft.world.TeleportTarget.velocity = value.wrapperContained; }

// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public static float yaw() { return net.minecraft.world.TeleportTarget.yaw; }
// public static void yaw(float value, ) { net.minecraft.world.TeleportTarget.yaw = value; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.world.TeleportTarget.pitch; }
// public static void pitch(float value, ) { net.minecraft.world.TeleportTarget.pitch = value; }

// public Object NO_OP() { return wrapperContained.NO_OP; }
// // public void NO_OP(Object value) { wrapperContained.NO_OP = value; }
// public static Object NO_OP() { return net.minecraft.world.TeleportTarget.NO_OP; }
// // public static void NO_OP(Object value, ) { net.minecraft.world.TeleportTarget.NO_OP = value; }

// public Object SEND_TRAVEL_THROUGH_PORTAL_PACKET() { return wrapperContained.SEND_TRAVEL_THROUGH_PORTAL_PACKET; }
// // public void SEND_TRAVEL_THROUGH_PORTAL_PACKET(Object value) { wrapperContained.SEND_TRAVEL_THROUGH_PORTAL_PACKET = value; }
// public static Object SEND_TRAVEL_THROUGH_PORTAL_PACKET() { return net.minecraft.world.TeleportTarget.SEND_TRAVEL_THROUGH_PORTAL_PACKET; }
// // public static void SEND_TRAVEL_THROUGH_PORTAL_PACKET(Object value, ) { net.minecraft.world.TeleportTarget.SEND_TRAVEL_THROUGH_PORTAL_PACKET = value; }

// public Object ADD_PORTAL_CHUNK_TICKET() { return wrapperContained.ADD_PORTAL_CHUNK_TICKET; }
// // public void ADD_PORTAL_CHUNK_TICKET(Object value) { wrapperContained.ADD_PORTAL_CHUNK_TICKET = value; }
// public static Object ADD_PORTAL_CHUNK_TICKET() { return net.minecraft.world.TeleportTarget.ADD_PORTAL_CHUNK_TICKET; }
// // public static void ADD_PORTAL_CHUNK_TICKET(Object value, ) { net.minecraft.world.TeleportTarget.ADD_PORTAL_CHUNK_TICKET = value; }

// public TeleportTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,Object postDimensionTransition) { this.wrapperContained = new net.minecraft.world.TeleportTarget(world.wrapperContained,entity.wrapperContained,postDimensionTransition); }
// public TeleportTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Vec3d velocity,float yaw,float pitch,Object postDimensionTransition) { this.wrapperContained = new net.minecraft.world.TeleportTarget(world.wrapperContained,pos.wrapperContained,velocity.wrapperContained,yaw,pitch,postDimensionTransition); }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world()); }
// // public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.TeleportTarget.world()); }
// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity()); }
// // public static yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.TeleportTarget.velocity()); }
// public float yaw() { return wrapperContained.yaw(); }
// // public static float yaw() { return net.minecraft.world.TeleportTarget.yaw(); }
// public float pitch() { return wrapperContained.pitch(); }
// // public static float pitch() { return net.minecraft.world.TeleportTarget.pitch(); }
// public yarnwrap.world.TeleportTarget missingSpawnBlock(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,Object postDimensionTransition) { return new yarnwrap.world.TeleportTarget(wrapperContained.missingSpawnBlock(world.wrapperContained,entity.wrapperContained,postDimensionTransition)); }
// public static yarnwrap.world.TeleportTarget missingSpawnBlock(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity,Object postDimensionTransition, ) { return new yarnwrap.world.TeleportTarget(net.minecraft.world.TeleportTarget.missingSpawnBlock(world.wrapperContained,entity.wrapperContained,postDimensionTransition)); }
// public yarnwrap.util.math.Vec3d getWorldSpawnPos(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.getWorldSpawnPos(world.wrapperContained,entity.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getWorldSpawnPos(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity entity, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.world.TeleportTarget.getWorldSpawnPos(world.wrapperContained,entity.wrapperContained)); }
// public void sendTravelThroughPortalPacket(yarnwrap.entity.Entity entity) { wrapperContained.sendTravelThroughPortalPacket(entity.wrapperContained); }
// public static void sendTravelThroughPortalPacket(yarnwrap.entity.Entity entity, ) { net.minecraft.world.TeleportTarget.sendTravelThroughPortalPacket(entity.wrapperContained); }
// public void addPortalChunkTicket(yarnwrap.entity.Entity entity) { wrapperContained.addPortalChunkTicket(entity.wrapperContained); }
// public static void addPortalChunkTicket(yarnwrap.entity.Entity entity, ) { net.minecraft.world.TeleportTarget.addPortalChunkTicket(entity.wrapperContained); }
// public void method_61026(yarnwrap.entity.Entity entity) { wrapperContained.method_61026(entity.wrapperContained); }
// public static void method_61026(yarnwrap.entity.Entity entity, ) { net.minecraft.world.TeleportTarget.method_61026(entity.wrapperContained); }

}