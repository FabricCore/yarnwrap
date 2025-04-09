package yarnwrap.network.packet.c2s.play;
public class PlayerInteractEntityC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket wrapperContained; public PlayerInteractEntityC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public Object type() { return wrapperContained.type; }
// public boolean playerSneaking() { return wrapperContained.playerSneaking; }
// public Object ATTACK() { return wrapperContained.ATTACK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.entity.Entity getEntity(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
public boolean isPlayerSneaking() { return wrapperContained.isPlayerSneaking(); }
public yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket attack(yarnwrap.entity.Entity entity,boolean playerSneaking) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(wrapperContained.attack(entity.wrapperContained,playerSneaking)); }
public yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket interact(yarnwrap.entity.Entity entity,boolean playerSneaking,yarnwrap.util.Hand hand) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(wrapperContained.interact(entity.wrapperContained,playerSneaking,hand.wrapperContained)); }
public yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket interactAt(yarnwrap.entity.Entity entity,boolean playerSneaking,yarnwrap.util.Hand hand,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(wrapperContained.interactAt(entity.wrapperContained,playerSneaking,hand.wrapperContained,pos.wrapperContained)); }
// public void handle(Object handler) { wrapperContained.handle(handler); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}