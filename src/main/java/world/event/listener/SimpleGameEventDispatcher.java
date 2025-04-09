package yarnwrap.world.event.listener;
public class SimpleGameEventDispatcher { public net.minecraft.world.event.listener.SimpleGameEventDispatcher wrapperContained; public SimpleGameEventDispatcher(net.minecraft.world.event.listener.SimpleGameEventDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List listeners() { return wrapperContained.listeners; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public java.util.Set toRemove() { return wrapperContained.toRemove; }
// public java.util.List toAdd() { return wrapperContained.toAdd; }
// public boolean dispatching() { return wrapperContained.dispatching; }
// public int ySectionCoord() { return wrapperContained.ySectionCoord; }
// public Object disposalCallback() { return wrapperContained.disposalCallback; }
// public java.util.Optional dispatchTo(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d listenerPos,yarnwrap.world.event.listener.GameEventListener listener) { return wrapperContained.dispatchTo(world.wrapperContained,listenerPos.wrapperContained,listener.wrapperContained); }

}