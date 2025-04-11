package yarnwrap.server.network;
public class DebugInfoSender { public net.minecraft.server.network.DebugInfoSender wrapperContained; public DebugInfoSender(net.minecraft.server.network.DebugInfoSender wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public void sendGoalSelector(yarnwrap.world.World world,yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.ai.goal.GoalSelector goalSelector) { wrapperContained.sendGoalSelector(world.wrapperContained,mob.wrapperContained,goalSelector.wrapperContained); }
public void sendPathfindingData(yarnwrap.world.World world,yarnwrap.entity.mob.MobEntity mob,yarnwrap.entity.ai.pathing.Path path,float nodeReachProximity) { wrapperContained.sendPathfindingData(world.wrapperContained,mob.wrapperContained,path.wrapperContained,nodeReachProximity); }
public void sendNeighborUpdate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendNeighborUpdate(world.wrapperContained,pos.wrapperContained); }
public void sendStructureStart(yarnwrap.world.StructureWorldAccess world,yarnwrap.structure.StructureStart structureStart) { wrapperContained.sendStructureStart(world.wrapperContained,structureStart.wrapperContained); }
public void sendBrainDebugData(yarnwrap.entity.LivingEntity living) { wrapperContained.sendBrainDebugData(living.wrapperContained); }
public void sendChunkWatchingChange(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.ChunkPos pos) { wrapperContained.sendChunkWatchingChange(world.wrapperContained,pos.wrapperContained); }
public void sendPoiAddition(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendPoiAddition(world.wrapperContained,pos.wrapperContained); }
public void sendPoiRemoval(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendPoiRemoval(world.wrapperContained,pos.wrapperContained); }
public void sendPointOfInterest(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendPointOfInterest(world.wrapperContained,pos.wrapperContained); }
public void sendRaids(yarnwrap.server.world.ServerWorld server,java.util.Collection raids) { wrapperContained.sendRaids(server.wrapperContained,raids); }
public void clearGameTestMarkers(yarnwrap.server.world.ServerWorld world) { wrapperContained.clearGameTestMarkers(world.wrapperContained); }
public void addGameTestMarker(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,java.lang.String message,int color,int duration) { wrapperContained.addGameTestMarker(world.wrapperContained,pos.wrapperContained,message,color,duration); }
// public void sendToAll(yarnwrap.server.world.ServerWorld world,yarnwrap.network.packet.CustomPayload payload) { wrapperContained.sendToAll(world.wrapperContained,payload.wrapperContained); }
public void sendBeeDebugData(yarnwrap.entity.passive.BeeEntity bee) { wrapperContained.sendBeeDebugData(bee.wrapperContained); }
public void sendBeehiveDebugData(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BeehiveBlockEntity blockEntity) { wrapperContained.sendBeehiveDebugData(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public void sendPoi(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.sendPoi(world.wrapperContained,pos.wrapperContained); }
public void sendGameEvent(yarnwrap.world.World world,yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d pos) { wrapperContained.sendGameEvent(world.wrapperContained,event.wrapperContained,pos.wrapperContained); }
public void sendGameEventListener(yarnwrap.world.World world,yarnwrap.world.event.listener.GameEventListener eventListener) { wrapperContained.sendGameEventListener(world.wrapperContained,eventListener.wrapperContained); }
// public void method_36155(yarnwrap.server.world.ServerWorld world,yarnwrap.world.poi.PointOfInterest poi) { wrapperContained.method_36155(world.wrapperContained,poi.wrapperContained); }
// public java.lang.String format(yarnwrap.server.world.ServerWorld world,java.lang.Object object) { return wrapperContained.format(world.wrapperContained,object); }
// public java.util.List listMemories(yarnwrap.entity.LivingEntity entity,long currentTime) { return wrapperContained.listMemories(entity.wrapperContained,currentTime); }
// public void method_36162(java.util.List goal) { wrapperContained.method_36162(goal); }
public void sendBreezeDebugData(yarnwrap.entity.mob.BreezeEntity breeze) { wrapperContained.sendBreezeDebugData(breeze.wrapperContained); }

}