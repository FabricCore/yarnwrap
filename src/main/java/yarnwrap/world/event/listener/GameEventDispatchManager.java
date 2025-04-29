package yarnwrap.world.event.listener;
public class GameEventDispatchManager { public net.minecraft.world.event.listener.GameEventDispatchManager wrapperContained; public GameEventDispatchManager(net.minecraft.world.event.listener.GameEventDispatchManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.event.listener.GameEventDispatchManager.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.world.event.listener.GameEventDispatchManager.world = value.wrapperContained; }

public GameEventDispatchManager(yarnwrap.server.world.ServerWorld world) { this.wrapperContained = new net.minecraft.world.event.listener.GameEventDispatchManager(world.wrapperContained); }
// public void dispatch(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d emitterPos,Object emitter) { wrapperContained.dispatch(event.wrapperContained,emitterPos.wrapperContained,emitter); }
// public static void dispatch(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d emitterPos,Object emitter, ) { net.minecraft.world.event.listener.GameEventDispatchManager.dispatch(event.wrapperContained,emitterPos.wrapperContained,emitter); }
// public void dispatchListenersByDistance(java.util.List messages) { wrapperContained.dispatchListenersByDistance(messages); }
// public static void dispatchListenersByDistance(java.util.List messages, ) { net.minecraft.world.event.listener.GameEventDispatchManager.dispatchListenersByDistance(messages); }
// public void method_45492(java.util.List listener,yarnwrap.registry.entry.RegistryEntry listenerPos) { wrapperContained.method_45492(listener,listenerPos.wrapperContained); }
// public static void method_45492(java.util.List listener,yarnwrap.registry.entry.RegistryEntry listenerPos, ) { net.minecraft.world.event.listener.GameEventDispatchManager.method_45492(listener,listenerPos.wrapperContained); }

}