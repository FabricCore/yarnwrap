package yarnwrap.server.world;
public class ChunkTicket { public net.minecraft.server.world.ChunkTicket wrapperContained; public ChunkTicket(net.minecraft.server.world.ChunkTicket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object argument() { return wrapperContained.argument; }
// public void argument(java.lang.Object value) { wrapperContained.argument = value; }
// // public static java.lang.Object argument() { return net.minecraft.server.world.ChunkTicket.argument; }
// public static void argument(java.lang.Object value, ) { net.minecraft.server.world.ChunkTicket.argument = value; }

// public yarnwrap.server.world.ChunkTicketType type() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.type); }
// public void type(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.server.world.ChunkTicketType type() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicket.type); }
// public static void type(yarnwrap.server.world.ChunkTicketType value, ) { net.minecraft.server.world.ChunkTicket.type = value.wrapperContained; }

// public long tickCreated() { return wrapperContained.tickCreated; }
// public void tickCreated(long value) { wrapperContained.tickCreated = value; }
// public static long tickCreated() { return net.minecraft.server.world.ChunkTicket.tickCreated; }
// public static void tickCreated(long value, ) { net.minecraft.server.world.ChunkTicket.tickCreated = value; }

// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public static int level() { return net.minecraft.server.world.ChunkTicket.level; }
// public static void level(int value, ) { net.minecraft.server.world.ChunkTicket.level = value; }

// public ChunkTicket(yarnwrap.server.world.ChunkTicketType type,int level,java.lang.Object argument) { this.wrapperContained = new net.minecraft.server.world.ChunkTicket(type.wrapperContained,level,argument); }
// public int compareTo(java.lang.Object that) { return wrapperContained.compareTo(that); }
// public static int compareTo(java.lang.Object that, ) { return net.minecraft.server.world.ChunkTicket.compareTo(that); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.server.world.ChunkTicket.equals(o); }
public yarnwrap.server.world.ChunkTicketType getType() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.getType()); }
// public static yarnwrap.server.world.ChunkTicketType getType() { return new yarnwrap.server.world.ChunkTicketType(net.minecraft.server.world.ChunkTicket.getType()); }
public int getLevel() { return wrapperContained.getLevel(); }
// public static int getLevel() { return net.minecraft.server.world.ChunkTicket.getLevel(); }
// public boolean isExpired(long currentTick) { return wrapperContained.isExpired(currentTick); }
// public static boolean isExpired(long currentTick, ) { return net.minecraft.server.world.ChunkTicket.isExpired(currentTick); }
// public void setTickCreated(long tickCreated) { wrapperContained.setTickCreated(tickCreated); }
// public static void setTickCreated(long tickCreated, ) { net.minecraft.server.world.ChunkTicket.setTickCreated(tickCreated); }

}