package yarnwrap.world;
public class ServerWorldAccess { public net.minecraft.world.ServerWorldAccess wrapperContained; public ServerWorldAccess(net.minecraft.world.ServerWorldAccess wrapperContained) { this.wrapperContained = wrapperContained; }

public void spawnEntityAndPassengers(yarnwrap.entity.Entity entity) { wrapperContained.spawnEntityAndPassengers(entity.wrapperContained); }
public yarnwrap.server.world.ServerWorld toServerWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.toServerWorld()); }

}