package yarnwrap.world.event.listener;
public class SimpleGameEventDispatcher { public net.minecraft.world.event.listener.SimpleGameEventDispatcher wrapperContained; public SimpleGameEventDispatcher(net.minecraft.world.event.listener.SimpleGameEventDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public static java.util.List listeners() { return net.minecraft.world.event.listener.SimpleGameEventDispatcher.listeners; }
// public static void listeners(java.util.List value, ) { net.minecraft.world.event.listener.SimpleGameEventDispatcher.listeners = value; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.event.listener.SimpleGameEventDispatcher.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.world.event.listener.SimpleGameEventDispatcher.world = value.wrapperContained; }

// public java.util.Set toRemove() { return wrapperContained.toRemove; }
// public void toRemove(java.util.Set value) { wrapperContained.toRemove = value; }
// public static java.util.Set toRemove() { return net.minecraft.world.event.listener.SimpleGameEventDispatcher.toRemove; }
// public static void toRemove(java.util.Set value, ) { net.minecraft.world.event.listener.SimpleGameEventDispatcher.toRemove = value; }

// public java.util.List toAdd() { return wrapperContained.toAdd; }
// public void toAdd(java.util.List value) { wrapperContained.toAdd = value; }
// public static java.util.List toAdd() { return net.minecraft.world.event.listener.SimpleGameEventDispatcher.toAdd; }
// public static void toAdd(java.util.List value, ) { net.minecraft.world.event.listener.SimpleGameEventDispatcher.toAdd = value; }

// public boolean dispatching() { return wrapperContained.dispatching; }
// public void dispatching(boolean value) { wrapperContained.dispatching = value; }
// public static boolean dispatching() { return net.minecraft.world.event.listener.SimpleGameEventDispatcher.dispatching; }
// public static void dispatching(boolean value, ) { net.minecraft.world.event.listener.SimpleGameEventDispatcher.dispatching = value; }

// public int ySectionCoord() { return wrapperContained.ySectionCoord; }
// public void ySectionCoord(int value) { wrapperContained.ySectionCoord = value; }
// public static int ySectionCoord() { return net.minecraft.world.event.listener.SimpleGameEventDispatcher.ySectionCoord; }
// public static void ySectionCoord(int value, ) { net.minecraft.world.event.listener.SimpleGameEventDispatcher.ySectionCoord = value; }

// public Object disposalCallback() { return wrapperContained.disposalCallback; }
// // public void disposalCallback(Object value) { wrapperContained.disposalCallback = value; }
// // public static Object disposalCallback() { return net.minecraft.world.event.listener.SimpleGameEventDispatcher.disposalCallback; }
// // public static void disposalCallback(Object value, ) { net.minecraft.world.event.listener.SimpleGameEventDispatcher.disposalCallback = value; }

// public SimpleGameEventDispatcher(yarnwrap.server.world.ServerWorld world,int ySectionCoord,Object disposalCallback) { this.wrapperContained = new net.minecraft.world.event.listener.SimpleGameEventDispatcher(world.wrapperContained,ySectionCoord,disposalCallback); }
// public java.util.Optional dispatchTo(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d listenerPos,yarnwrap.world.event.listener.GameEventListener listener) { return wrapperContained.dispatchTo(world.wrapperContained,listenerPos.wrapperContained,listener.wrapperContained); }
// public static java.util.Optional dispatchTo(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d listenerPos,yarnwrap.world.event.listener.GameEventListener listener, ) { return net.minecraft.world.event.listener.SimpleGameEventDispatcher.dispatchTo(world.wrapperContained,listenerPos.wrapperContained,listener.wrapperContained); }

}