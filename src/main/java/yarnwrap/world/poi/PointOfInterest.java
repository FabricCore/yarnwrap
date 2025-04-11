package yarnwrap.world.poi;
public class PointOfInterest { public net.minecraft.world.poi.PointOfInterest wrapperContained; public PointOfInterest(net.minecraft.world.poi.PointOfInterest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public void type(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.type = value.wrapperContained; }
// public int freeTickets() { return wrapperContained.freeTickets; }
// public void freeTickets(int value) { wrapperContained.freeTickets = value; }
// public java.lang.Runnable updateListener() { return wrapperContained.updateListener; }
// public void updateListener(java.lang.Runnable value) { wrapperContained.updateListener = value; }
// public boolean reserveTicket() { return wrapperContained.reserveTicket(); }
// public boolean releaseTicket() { return wrapperContained.releaseTicket(); }
public boolean hasSpace() { return wrapperContained.hasSpace(); }
public boolean isOccupied() { return wrapperContained.isOccupied(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.registry.entry.RegistryEntry getType() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getType()); }
public com.mojang.serialization.Codec createCodec(java.lang.Runnable updateListener) { return wrapperContained.createCodec(updateListener); }
public int getFreeTickets() { return wrapperContained.getFreeTickets(); }

}