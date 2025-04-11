package yarnwrap.world.event.listener;
public class GameEventDispatchManager { public net.minecraft.world.event.listener.GameEventDispatchManager wrapperContained; public GameEventDispatchManager(net.minecraft.world.event.listener.GameEventDispatchManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public void dispatch(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d emitterPos,Object emitter) { wrapperContained.dispatch(event.wrapperContained,emitterPos.wrapperContained,emitter); }
// public void dispatchListenersByDistance(java.util.List messages) { wrapperContained.dispatchListenersByDistance(messages); }

}