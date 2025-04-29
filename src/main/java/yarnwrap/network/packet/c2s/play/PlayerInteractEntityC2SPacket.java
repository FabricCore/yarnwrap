package yarnwrap.network.packet.c2s.play;
public class PlayerInteractEntityC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket wrapperContained; public PlayerInteractEntityC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.entityId = value; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.type; }
// // public static void type(Object value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.type = value; }

// public boolean playerSneaking() { return wrapperContained.playerSneaking; }
// public void playerSneaking(boolean value) { wrapperContained.playerSneaking = value; }
// public static boolean playerSneaking() { return net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.playerSneaking; }
// public static void playerSneaking(boolean value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.playerSneaking = value; }

// public Object ATTACK() { return wrapperContained.ATTACK; }
// // public void ATTACK(Object value) { wrapperContained.ATTACK = value; }
// // public static Object ATTACK() { return net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.ATTACK; }
// // public static void ATTACK(Object value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.ATTACK = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.CODEC = value.wrapperContained; }

// public PlayerInteractEntityC2SPacket(int entityId,boolean playerSneaking,Object type) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket(entityId,playerSneaking,type); }
// public PlayerInteractEntityC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket(buf.wrapperContained); }
public yarnwrap.entity.Entity getEntity(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
// public static yarnwrap.entity.Entity getEntity(yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.entity.Entity(net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.getEntity(world.wrapperContained)); }
public boolean isPlayerSneaking() { return wrapperContained.isPlayerSneaking(); }
// public static boolean isPlayerSneaking() { return net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.isPlayerSneaking(); }
// public yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket attack(yarnwrap.entity.Entity entity,boolean playerSneaking) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(wrapperContained.attack(entity.wrapperContained,playerSneaking)); }
// public static yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket attack(yarnwrap.entity.Entity entity,boolean playerSneaking, ) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.attack(entity.wrapperContained,playerSneaking)); }
// public yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket interact(yarnwrap.entity.Entity entity,boolean playerSneaking,yarnwrap.util.Hand hand) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(wrapperContained.interact(entity.wrapperContained,playerSneaking,hand.wrapperContained)); }
// public static yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket interact(yarnwrap.entity.Entity entity,boolean playerSneaking,yarnwrap.util.Hand hand, ) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.interact(entity.wrapperContained,playerSneaking,hand.wrapperContained)); }
// public yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket interactAt(yarnwrap.entity.Entity entity,boolean playerSneaking,yarnwrap.util.Hand hand,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(wrapperContained.interactAt(entity.wrapperContained,playerSneaking,hand.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket interactAt(yarnwrap.entity.Entity entity,boolean playerSneaking,yarnwrap.util.Hand hand,yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.network.packet.c2s.play.PlayerInteractEntityC2SPacket(net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.interactAt(entity.wrapperContained,playerSneaking,hand.wrapperContained,pos.wrapperContained)); }
// public void handle(Object handler) { wrapperContained.handle(handler); }
// public static void handle(Object handler, ) { net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.handle(handler); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.write(buf.wrapperContained); }

}