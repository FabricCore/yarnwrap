package yarnwrap.server.world;
public class ChunkTicket { public net.minecraft.server.world.ChunkTicket wrapperContained; public ChunkTicket(net.minecraft.server.world.ChunkTicket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object argument() { return wrapperContained.argument; }
// public yarnwrap.server.world.ChunkTicketType type() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.type); }
// public long tickCreated() { return wrapperContained.tickCreated; }
// public int level() { return wrapperContained.level; }
public yarnwrap.server.world.ChunkTicketType getType() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.getType()); }
public int getLevel() { return wrapperContained.getLevel(); }
// public boolean isExpired(long currentTick) { return wrapperContained.isExpired(currentTick); }
// public void setTickCreated(long tickCreated) { wrapperContained.setTickCreated(tickCreated); }

}