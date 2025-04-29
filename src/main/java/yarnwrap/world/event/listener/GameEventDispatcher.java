package yarnwrap.world.event.listener;
public class GameEventDispatcher { public net.minecraft.world.event.listener.GameEventDispatcher wrapperContained; public GameEventDispatcher(net.minecraft.world.event.listener.GameEventDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.event.listener.GameEventDispatcher EMPTY() { return new yarnwrap.world.event.listener.GameEventDispatcher(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.world.event.listener.GameEventDispatcher value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.world.event.listener.GameEventDispatcher EMPTY() { return new yarnwrap.world.event.listener.GameEventDispatcher(net.minecraft.world.event.listener.GameEventDispatcher.EMPTY); }
// public static void EMPTY(yarnwrap.world.event.listener.GameEventDispatcher value, ) { net.minecraft.world.event.listener.GameEventDispatcher.EMPTY = value.wrapperContained; }

public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.world.event.listener.GameEventDispatcher.isEmpty(); }
// public boolean dispatch(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d pos,Object emitter,Object callback) { return wrapperContained.dispatch(event.wrapperContained,pos.wrapperContained,emitter,callback); }
// public static boolean dispatch(yarnwrap.registry.entry.RegistryEntry event,yarnwrap.util.math.Vec3d pos,Object emitter,Object callback, ) { return net.minecraft.world.event.listener.GameEventDispatcher.dispatch(event.wrapperContained,pos.wrapperContained,emitter,callback); }
public void addListener(yarnwrap.world.event.listener.GameEventListener listener) { wrapperContained.addListener(listener.wrapperContained); }
// public static void addListener(yarnwrap.world.event.listener.GameEventListener listener, ) { net.minecraft.world.event.listener.GameEventDispatcher.addListener(listener.wrapperContained); }
public void removeListener(yarnwrap.world.event.listener.GameEventListener listener) { wrapperContained.removeListener(listener.wrapperContained); }
// public static void removeListener(yarnwrap.world.event.listener.GameEventListener listener, ) { net.minecraft.world.event.listener.GameEventDispatcher.removeListener(listener.wrapperContained); }

}