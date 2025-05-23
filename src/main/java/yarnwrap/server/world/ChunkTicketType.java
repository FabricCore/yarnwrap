package yarnwrap.server.world;
public class ChunkTicketType { public net.minecraft.server.world.ChunkTicketType wrapperContained; public ChunkTicketType(net.minecraft.server.world.ChunkTicketType wrapperContained) { this.wrapperContained = wrapperContained; }

// public long expiryTicks() { return wrapperContained.expiryTicks; }
// public void expiryTicks(long value) { wrapperContained.expiryTicks = value; }
// public static long expiryTicks() { return net.minecraft.server.world.ChunkTicketType.expiryTicks; }
// public static void expiryTicks(long value, ) { net.minecraft.server.world.ChunkTicketType.expiryTicks = value; }

// public yarnwrap.server.world.ChunkTicketType START() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.START); }
// public void START(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.START = value.wrapperContained; }
public static yarnwrap.server.world.ChunkTicketType START() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicketType.START); }
// public static void START(yarnwrap.server.world.ChunkTicketType value, ) { net.minecraft.server.world.ChunkTicketType.START = value.wrapperContained; }

// public yarnwrap.server.world.ChunkTicketType FORCED() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.FORCED); }
// public void FORCED(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.FORCED = value.wrapperContained; }
public static yarnwrap.server.world.ChunkTicketType FORCED() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicketType.FORCED); }
// public static void FORCED(yarnwrap.server.world.ChunkTicketType value, ) { net.minecraft.server.world.ChunkTicketType.FORCED = value.wrapperContained; }

// public yarnwrap.server.world.ChunkTicketType UNKNOWN() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.UNKNOWN); }
// public void UNKNOWN(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.UNKNOWN = value.wrapperContained; }
public static yarnwrap.server.world.ChunkTicketType UNKNOWN() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicketType.UNKNOWN); }
// public static void UNKNOWN(yarnwrap.server.world.ChunkTicketType value, ) { net.minecraft.server.world.ChunkTicketType.UNKNOWN = value.wrapperContained; }

// public yarnwrap.server.world.ChunkTicketType DRAGON() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.DRAGON); }
// public void DRAGON(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.DRAGON = value.wrapperContained; }
public static yarnwrap.server.world.ChunkTicketType DRAGON() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicketType.DRAGON); }
// public static void DRAGON(yarnwrap.server.world.ChunkTicketType value, ) { net.minecraft.server.world.ChunkTicketType.DRAGON = value.wrapperContained; }

// public yarnwrap.server.world.ChunkTicketType PORTAL() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.PORTAL); }
// public void PORTAL(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.PORTAL = value.wrapperContained; }
public static yarnwrap.server.world.ChunkTicketType PORTAL() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicketType.PORTAL); }
// public static void PORTAL(yarnwrap.server.world.ChunkTicketType value, ) { net.minecraft.server.world.ChunkTicketType.PORTAL = value.wrapperContained; }

// public long NO_EXPIRATION() { return wrapperContained.NO_EXPIRATION; }
// public void NO_EXPIRATION(long value) { wrapperContained.NO_EXPIRATION = value; }
public static long NO_EXPIRATION() { return net.minecraft.server.world.ChunkTicketType.NO_EXPIRATION; }
// public static void NO_EXPIRATION(long value, ) { net.minecraft.server.world.ChunkTicketType.NO_EXPIRATION = value; }

// public long expiryTicks() { return wrapperContained.expiryTicks(); }
// // public static long expiryTicks() { return net.minecraft.server.world.ChunkTicketType.expiryTicks(); }
public boolean isForLoading() { return wrapperContained.isForLoading(); }
// public static boolean isForLoading() { return net.minecraft.server.world.ChunkTicketType.isForLoading(); }
// public yarnwrap.server.world.ChunkTicketType register(java.lang.String id,long expiryTicks,boolean persist,Object use) { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.register(id,expiryTicks,persist,use)); }
// public static yarnwrap.server.world.ChunkTicketType register(java.lang.String id,long expiryTicks,boolean persist,Object use, ) { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicketType.register(id,expiryTicks,persist,use)); }
public boolean isForSimulation() { return wrapperContained.isForSimulation(); }
// public static boolean isForSimulation() { return net.minecraft.server.world.ChunkTicketType.isForSimulation(); }
public boolean canExpire() { return wrapperContained.canExpire(); }
// public static boolean canExpire() { return net.minecraft.server.world.ChunkTicketType.canExpire(); }

}