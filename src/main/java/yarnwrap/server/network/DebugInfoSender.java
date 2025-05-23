package yarnwrap.server.network;
public class DebugInfoSender { public net.minecraft.server.network.DebugInfoSender wrapperContained; public DebugInfoSender(net.minecraft.server.network.DebugInfoSender wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.network.DebugInfoSender.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.network.DebugInfoSender.LOGGER = value; }

// public void sendGoalSelector(yarnwrap.world.World world,yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.ai.goal.GoalSelector goalSelector) { wrapperContained.sendGoalSelector(world.wrapperContained,mob.wrapperContained,goalSelector.wrapperContained); }
// public static void sendGoalSelector(yarnwrap.world.World world,yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.ai.goal.GoalSelector goalSelector, ) { net.minecraft.server.network.DebugInfoSender.sendGoalSelector(world.wrapperContained,mob.wrapperContained,goalSelector.wrapperContained); }
// public void sendPathfindingData(yarnwrap.world.World world,yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.ai.pathing.Path path,float nodeReachProximity) { wrapperContained.sendPathfindingData(world.wrapperContained,mob.wrapperContained,path.wrapperContained,nodeReachProximity); }
// public static void sendPathfindingData(yarnwrap.world.World world,yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.ai.pathing.Path path,float nodeReachProximity, ) { net.minecraft.server.network.DebugInfoSender.sendPathfindingData(world.wrapperContained,mob.wrapperContained,path.wrapperContained,nodeReachProximity); }
// public void sendNeighborUpdate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendNeighborUpdate(world.wrapperContained,pos.wrapperContained); }
// public static void sendNeighborUpdate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.network.DebugInfoSender.sendNeighborUpdate(world.wrapperContained,pos.wrapperContained); }
// public void sendStructureStart(yarnwrap.world.StructureWorldAccess world,yarnwrap.structure.StructureStart structureStart) { wrapperContained.sendStructureStart(world.wrapperContained,structureStart.wrapperContained); }
// public static void sendStructureStart(yarnwrap.world.StructureWorldAccess world,yarnwrap.structure.StructureStart structureStart, ) { net.minecraft.server.network.DebugInfoSender.sendStructureStart(world.wrapperContained,structureStart.wrapperContained); }
// public void sendBrainDebugData(yarnwrap.entity.LivingEntity living) { wrapperContained.sendBrainDebugData(living.wrapperContained); }
// public static void sendBrainDebugData(yarnwrap.entity.LivingEntity living, ) { net.minecraft.server.network.DebugInfoSender.sendBrainDebugData(living.wrapperContained); }
// public void sendChunkWatchingChange(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.ChunkPos pos) { wrapperContained.sendChunkWatchingChange(world.wrapperContained,pos.wrapperContained); }
// public static void sendChunkWatchingChange(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.server.network.DebugInfoSender.sendChunkWatchingChange(world.wrapperContained,pos.wrapperContained); }
// public void sendPoiAddition(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendPoiAddition(world.wrapperContained,pos.wrapperContained); }
// public static void sendPoiAddition(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.network.DebugInfoSender.sendPoiAddition(world.wrapperContained,pos.wrapperContained); }
// public void sendPoiRemoval(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendPoiRemoval(world.wrapperContained,pos.wrapperContained); }
// public static void sendPoiRemoval(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.network.DebugInfoSender.sendPoiRemoval(world.wrapperContained,pos.wrapperContained); }
// public void sendPointOfInterest(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendPointOfInterest(world.wrapperContained,pos.wrapperContained); }
// public static void sendPointOfInterest(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.network.DebugInfoSender.sendPointOfInterest(world.wrapperContained,pos.wrapperContained); }
// public void sendRaids(yarnwrap.server.world.ServerWorld server,java.util.Collection raids) { wrapperContained.sendRaids(server.wrapperContained,raids); }
// public static void sendRaids(yarnwrap.server.world.ServerWorld server,java.util.Collection raids, ) { net.minecraft.server.network.DebugInfoSender.sendRaids(server.wrapperContained,raids); }
// public void clearGameTestMarkers(yarnwrap.server.world.ServerWorld world) { wrapperContained.clearGameTestMarkers(world.wrapperContained); }
// public static void clearGameTestMarkers(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.server.network.DebugInfoSender.clearGameTestMarkers(world.wrapperContained); }
// public void addGameTestMarker(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,java.lang.String message,int color,int duration) { wrapperContained.addGameTestMarker(world.wrapperContained,pos.wrapperContained,message,color,duration); }
// public static void addGameTestMarker(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,java.lang.String message,int color,int duration, ) { net.minecraft.server.network.DebugInfoSender.addGameTestMarker(world.wrapperContained,pos.wrapperContained,message,color,duration); }
// public void sendToAll(yarnwrap.server.world.ServerWorld world,yarnwrap.network.packet.CustomPayload payload) { wrapperContained.sendToAll(world.wrapperContained,payload.wrapperContained); }
// public static void sendToAll(yarnwrap.server.world.ServerWorld world,yarnwrap.network.packet.CustomPayload payload, ) { net.minecraft.server.network.DebugInfoSender.sendToAll(world.wrapperContained,payload.wrapperContained); }
// public void sendBeeDebugData(yarnwrap.entity.passive.BeeEntity bee) { wrapperContained.sendBeeDebugData(bee.wrapperContained); }
// public static void sendBeeDebugData(yarnwrap.entity.passive.BeeEntity bee, ) { net.minecraft.server.network.DebugInfoSender.sendBeeDebugData(bee.wrapperContained); }
// public void sendBeehiveDebugData(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BeehiveBlockEntity blockEntity) { wrapperContained.sendBeehiveDebugData(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void sendBeehiveDebugData(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BeehiveBlockEntity blockEntity, ) { net.minecraft.server.network.DebugInfoSender.sendBeehiveDebugData(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void sendPoi(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendPoi(world.wrapperContained,pos.wrapperContained); }
// public static void sendPoi(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.network.DebugInfoSender.sendPoi(world.wrapperContained,pos.wrapperContained); }
// public void sendGameEvent(yarnwrap.world.World world,yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d pos) { wrapperContained.sendGameEvent(world.wrapperContained,event.wrapperContained,pos.wrapperContained); }
// public static void sendGameEvent(yarnwrap.world.World world,yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d pos, ) { net.minecraft.server.network.DebugInfoSender.sendGameEvent(world.wrapperContained,event.wrapperContained,pos.wrapperContained); }
// public void sendGameEventListener(yarnwrap.world.World world,yarnwrap.world.event.listener.GameEventListener eventListener) { wrapperContained.sendGameEventListener(world.wrapperContained,eventListener.wrapperContained); }
// public static void sendGameEventListener(yarnwrap.world.World world,yarnwrap.world.event.listener.GameEventListener eventListener, ) { net.minecraft.server.network.DebugInfoSender.sendGameEventListener(world.wrapperContained,eventListener.wrapperContained); }
// public void method_36155(yarnwrap.server.world.ServerWorld world,yarnwrap.world.poi.PointOfInterest poi) { wrapperContained.method_36155(world.wrapperContained,poi.wrapperContained); }
// public static void method_36155(yarnwrap.server.world.ServerWorld world,yarnwrap.world.poi.PointOfInterest poi, ) { net.minecraft.server.network.DebugInfoSender.method_36155(world.wrapperContained,poi.wrapperContained); }
// public java.lang.String format(yarnwrap.server.world.ServerWorld world,java.lang.Object object) { return wrapperContained.format(world.wrapperContained,object); }
// public static java.lang.String format(yarnwrap.server.world.ServerWorld world,java.lang.Object object, ) { return net.minecraft.server.network.DebugInfoSender.format(world.wrapperContained,object); }
// public java.util.List listMemories(yarnwrap.entity.LivingEntity entity,long currentTime) { return wrapperContained.listMemories(entity.wrapperContained,currentTime); }
// public static java.util.List listMemories(yarnwrap.entity.LivingEntity entity,long currentTime, ) { return net.minecraft.server.network.DebugInfoSender.listMemories(entity.wrapperContained,currentTime); }
// public void method_36162(java.util.List goal) { wrapperContained.method_36162(goal); }
// public static void method_36162(java.util.List goal, ) { net.minecraft.server.network.DebugInfoSender.method_36162(goal); }
// public void sendBreezeDebugData(yarnwrap.entity.mob.BreezeEntity breeze) { wrapperContained.sendBreezeDebugData(breeze.wrapperContained); }
// public static void sendBreezeDebugData(yarnwrap.entity.mob.BreezeEntity breeze, ) { net.minecraft.server.network.DebugInfoSender.sendBreezeDebugData(breeze.wrapperContained); }
// public void sendRedstoneUpdateOrder(yarnwrap.world.World world,yarnwrap.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload payload) { wrapperContained.sendRedstoneUpdateOrder(world.wrapperContained,payload.wrapperContained); }
// public static void sendRedstoneUpdateOrder(yarnwrap.world.World world,yarnwrap.network.packet.s2c.custom.DebugRedstoneUpdateOrderCustomPayload payload, ) { net.minecraft.server.network.DebugInfoSender.sendRedstoneUpdateOrder(world.wrapperContained,payload.wrapperContained); }

}