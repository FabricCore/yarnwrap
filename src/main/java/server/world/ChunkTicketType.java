package yarnwrap.server.world;
public class ChunkTicketType { public net.minecraft.server.world.ChunkTicketType wrapperContained; public ChunkTicketType(net.minecraft.server.world.ChunkTicketType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator argumentComparator() { return wrapperContained.argumentComparator; }
public yarnwrap.server.world.ChunkTicketType START() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.START); }
public yarnwrap.server.world.ChunkTicketType FORCED() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.FORCED); }
public yarnwrap.server.world.ChunkTicketType UNKNOWN() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.UNKNOWN); }
public yarnwrap.server.world.ChunkTicketType PLAYER() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.PLAYER); }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.server.world.ChunkTicketType DRAGON() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.DRAGON); }
public yarnwrap.server.world.ChunkTicketType PORTAL() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.PORTAL); }
public yarnwrap.server.world.ChunkTicketType POST_TELEPORT() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.POST_TELEPORT); }
// public long expiryTicks() { return wrapperContained.expiryTicks; }
public yarnwrap.server.world.ChunkTicketType create(java.lang.String name,java.util.Comparator argumentComparator) { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.create(name,argumentComparator)); }
public java.util.Comparator getArgumentComparator() { return wrapperContained.getArgumentComparator(); }
public yarnwrap.server.world.ChunkTicketType create(java.lang.String name,java.util.Comparator argumentComparator,int expiryTicks) { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.create(name,argumentComparator,expiryTicks)); }
public long getExpiryTicks() { return wrapperContained.getExpiryTicks(); }

}