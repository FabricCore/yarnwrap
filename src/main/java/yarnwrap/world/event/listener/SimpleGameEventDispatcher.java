package yarnwrap.world.event.listener;
public class SimpleGameEventDispatcher { public net.minecraft.world.event.listener.SimpleGameEventDispatcher wrapperContained; public SimpleGameEventDispatcher(net.minecraft.world.event.listener.SimpleGameEventDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public void listeners(java.util.List value) { wrapperContained.listeners = value; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public java.util.Set toRemove() { return wrapperContained.toRemove; }
// public void toRemove(java.util.Set value) { wrapperContained.toRemove = value; }
// public java.util.List toAdd() { return wrapperContained.toAdd; }
// public void toAdd(java.util.List value) { wrapperContained.toAdd = value; }
// public boolean dispatching() { return wrapperContained.dispatching; }
// public void dispatching(boolean value) { wrapperContained.dispatching = value; }
// public int ySectionCoord() { return wrapperContained.ySectionCoord; }
// public void ySectionCoord(int value) { wrapperContained.ySectionCoord = value; }
// public Object disposalCallback() { return wrapperContained.disposalCallback; }
// // public void disposalCallback(Object value) { wrapperContained.disposalCallback = value; }
// public java.util.Optional dispatchTo(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d listenerPos,yarnwrap.world.event.listener.GameEventListener listener) { return wrapperContained.dispatchTo(world.wrapperContained,listenerPos.wrapperContained,listener.wrapperContained); }

}