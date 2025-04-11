package yarnwrap.server.world;
public class ChunkTicket { public net.minecraft.server.world.ChunkTicket wrapperContained; public ChunkTicket(net.minecraft.server.world.ChunkTicket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object argument() { return wrapperContained.argument; }
// public void argument(java.lang.Object value) { wrapperContained.argument = value; }
// public yarnwrap.server.world.ChunkTicketType type() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.type); }
// public void type(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.type = value.wrapperContained; }
// public long tickCreated() { return wrapperContained.tickCreated; }
// public void tickCreated(long value) { wrapperContained.tickCreated = value; }
// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public ChunkTicket(yarnwrap.server.world.ChunkTicketType type,int level,java.lang.Object argument) { this.wrapperContained = new net.minecraft.server.world.ChunkTicket(type.wrapperContained,level,argument); }
// public int compareTo(java.lang.Object that) { return wrapperContained.compareTo(that); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.server.world.ChunkTicketType getType() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.getType()); }
public int getLevel() { return wrapperContained.getLevel(); }
// public boolean isExpired(long currentTick) { return wrapperContained.isExpired(currentTick); }
// public void setTickCreated(long tickCreated) { wrapperContained.setTickCreated(tickCreated); }

}