package yarnwrap.server.world;
public class ChunkTicket { public net.minecraft.server.world.ChunkTicket wrapperContained; public ChunkTicket(net.minecraft.server.world.ChunkTicket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ChunkTicketType type() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.type); }
// public void type(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTicketType type() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicket.type); }
// public static void type(yarnwrap.server.world.ChunkTicketType value, ) { net.minecraft.server.world.ChunkTicket.type = value.wrapperContained; }

// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public static int level() { return net.minecraft.server.world.ChunkTicket.level; }
// public static void level(int value, ) { net.minecraft.server.world.ChunkTicket.level = value; }

// public long ticksLeft() { return wrapperContained.ticksLeft; }
// public void ticksLeft(long value) { wrapperContained.ticksLeft = value; }
// public static long ticksLeft() { return net.minecraft.server.world.ChunkTicket.ticksLeft; }
// public static void ticksLeft(long value, ) { net.minecraft.server.world.ChunkTicket.ticksLeft = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.server.world.ChunkTicket.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.server.world.ChunkTicket.CODEC = value; }

public ChunkTicket(yarnwrap.server.world.ChunkTicketType type,int level) { this.wrapperContained = new net.minecraft.server.world.ChunkTicket(type.wrapperContained,level); }
// public ChunkTicket(yarnwrap.server.world.ChunkTicketType type,int level,long ticksLeft) { this.wrapperContained = new net.minecraft.server.world.ChunkTicket(type.wrapperContained,level,ticksLeft); }
public yarnwrap.server.world.ChunkTicketType getType() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.getType()); }
// public static yarnwrap.server.world.ChunkTicketType getType() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicket.getType()); }
public int getLevel() { return wrapperContained.getLevel(); }
// public static int getLevel() { return net.minecraft.server.world.ChunkTicket.getLevel(); }
public void refreshExpiry() { wrapperContained.refreshExpiry(); }
// public static void refreshExpiry() { net.minecraft.server.world.ChunkTicket.refreshExpiry(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.server.world.ChunkTicket.tick(); }
public boolean isExpired() { return wrapperContained.isExpired(); }
// public static boolean isExpired() { return net.minecraft.server.world.ChunkTicket.isExpired(); }
// public java.lang.Long method_67328(yarnwrap.server.world.ChunkTicket ticket) { return wrapperContained.method_67328(ticket.wrapperContained); }
// public static java.lang.Long method_67328(yarnwrap.server.world.ChunkTicket ticket, ) { return net.minecraft.server.world.ChunkTicket.method_67328(ticket.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_67329(Object instance) { return wrapperContained.method_67329(instance); }
// public static com.mojang.datafixers.kinds.App method_67329(Object instance, ) { return net.minecraft.server.world.ChunkTicket.method_67329(instance); }

}