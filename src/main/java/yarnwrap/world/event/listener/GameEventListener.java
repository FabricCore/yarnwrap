package yarnwrap.world.event.listener;
public class GameEventListener { public net.minecraft.world.event.listener.GameEventListener wrapperContained; public GameEventListener(net.minecraft.world.event.listener.GameEventListener wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.event.PositionSource getPositionSource() { return new yarnwrap.world.event.PositionSource(wrapperContained.getPositionSource()); }
// public static yarnwrap.world.event.PositionSource getPositionSource() { return new yarnwrap.world.event.PositionSource(net.minecraft.world.event.listener.GameEventListener.getPositionSource()); }
// public boolean listen(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.entry.RegistryEntry event,Object emitter,yarnwrap.util.math.Vec3d emitterPos) { return wrapperContained.listen(world.wrapperContained,event.wrapperContained,emitter,emitterPos.wrapperContained); }
// public static boolean listen(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.entry.RegistryEntry event,Object emitter,yarnwrap.util.math.Vec3d emitterPos, ) { return net.minecraft.world.event.listener.GameEventListener.listen(world.wrapperContained,event.wrapperContained,emitter,emitterPos.wrapperContained); }
public int getRange() { return wrapperContained.getRange(); }
// public static int getRange() { return net.minecraft.world.event.listener.GameEventListener.getRange(); }
public Object getTriggerOrder() { return wrapperContained.getTriggerOrder(); }
// public static Object getTriggerOrder() { return net.minecraft.world.event.listener.GameEventListener.getTriggerOrder(); }

}