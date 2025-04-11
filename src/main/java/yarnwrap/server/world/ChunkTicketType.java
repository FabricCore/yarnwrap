package yarnwrap.server.world;
public class ChunkTicketType { public net.minecraft.server.world.ChunkTicketType wrapperContained; public ChunkTicketType(net.minecraft.server.world.ChunkTicketType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator argumentComparator() { return wrapperContained.argumentComparator; }
// public void argumentComparator(java.util.Comparator value) { wrapperContained.argumentComparator = value; }
public yarnwrap.server.world.ChunkTicketType START() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.START); }
// public void START(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.START = value.wrapperContained; }
public yarnwrap.server.world.ChunkTicketType FORCED() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.FORCED); }
// public void FORCED(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.FORCED = value.wrapperContained; }
public yarnwrap.server.world.ChunkTicketType UNKNOWN() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.UNKNOWN); }
// public void UNKNOWN(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.UNKNOWN = value.wrapperContained; }
public yarnwrap.server.world.ChunkTicketType PLAYER() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.PLAYER); }
// public void PLAYER(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.PLAYER = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public yarnwrap.server.world.ChunkTicketType DRAGON() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.DRAGON); }
// public void DRAGON(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.DRAGON = value.wrapperContained; }
public yarnwrap.server.world.ChunkTicketType PORTAL() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.PORTAL); }
// public void PORTAL(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.PORTAL = value.wrapperContained; }
public yarnwrap.server.world.ChunkTicketType POST_TELEPORT() { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.POST_TELEPORT); }
// public void POST_TELEPORT(yarnwrap.server.world.ChunkTicketType value) { wrapperContained.POST_TELEPORT = value.wrapperContained; }
// public long expiryTicks() { return wrapperContained.expiryTicks; }
// public void expiryTicks(long value) { wrapperContained.expiryTicks = value; }
// public ChunkTicketType(java.lang.String name,java.util.Comparator argumentComparator,long expiryTicks) { this.wrapperContained = new net.minecraft.server.world.ChunkTicketType(name,argumentComparator,expiryTicks); }
public yarnwrap.server.world.ChunkTicketType create(java.lang.String name,java.util.Comparator argumentComparator) { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.create(name,argumentComparator)); }
public java.util.Comparator getArgumentComparator() { return wrapperContained.getArgumentComparator(); }
// public int method_17315(yarnwrap.util.Unit a,yarnwrap.util.Unit b) { return wrapperContained.method_17315(a.wrapperContained,b.wrapperContained); }
// public int method_17316(yarnwrap.util.Unit a,yarnwrap.util.Unit b) { return wrapperContained.method_17316(a.wrapperContained,b.wrapperContained); }
public yarnwrap.server.world.ChunkTicketType create(java.lang.String name,java.util.Comparator argumentComparator,int expiryTicks) { return new yarnwrap.server.world.ChunkTicketType(wrapperContained.create(name,argumentComparator,expiryTicks)); }
public long getExpiryTicks() { return wrapperContained.getExpiryTicks(); }

}