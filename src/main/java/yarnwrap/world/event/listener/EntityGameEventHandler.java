package yarnwrap.world.event.listener;
public class EntityGameEventHandler { public net.minecraft.world.event.listener.EntityGameEventHandler wrapperContained; public EntityGameEventHandler(net.minecraft.world.event.listener.EntityGameEventHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.event.listener.GameEventListener listener() { return new yarnwrap.world.event.listener.GameEventListener(wrapperContained.listener); }
// public void listener(yarnwrap.world.event.listener.GameEventListener value) { wrapperContained.listener = value.wrapperContained; }
// public yarnwrap.util.math.ChunkSectionPos sectionPos() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.sectionPos); }
// public void sectionPos(yarnwrap.util.math.ChunkSectionPos value) { wrapperContained.sectionPos = value.wrapperContained; }
public void onEntityRemoval(yarnwrap.server.world.ServerWorld world) { wrapperContained.onEntityRemoval(world.wrapperContained); }
// public void updateDispatcher(yarnwrap.world.WorldView world,yarnwrap.util.math.ChunkSectionPos sectionPos,java.util.function.Consumer dispatcherConsumer) { wrapperContained.updateDispatcher(world.wrapperContained,sectionPos.wrapperContained,dispatcherConsumer); }
public void onEntitySetPos(yarnwrap.server.world.ServerWorld world) { wrapperContained.onEntitySetPos(world.wrapperContained); }
public void onEntitySetPosCallback(yarnwrap.server.world.ServerWorld world) { wrapperContained.onEntitySetPosCallback(world.wrapperContained); }
public yarnwrap.world.event.listener.GameEventListener getListener() { return new yarnwrap.world.event.listener.GameEventListener(wrapperContained.getListener()); }

}