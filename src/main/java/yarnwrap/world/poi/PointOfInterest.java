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
// public PointOfInterest(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type,int freeTickets,java.lang.Runnable updateListener) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterest(pos.wrapperContained,type.wrapperContained,freeTickets,updateListener); }
public PointOfInterest(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type,java.lang.Runnable updateListener) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterest(pos.wrapperContained,type.wrapperContained,updateListener); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public boolean reserveTicket() { return wrapperContained.reserveTicket(); }
// public boolean releaseTicket() { return wrapperContained.releaseTicket(); }
public boolean hasSpace() { return wrapperContained.hasSpace(); }
public boolean isOccupied() { return wrapperContained.isOccupied(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.registry.entry.RegistryEntry getType() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getType()); }
// public java.lang.Integer method_28358(yarnwrap.world.poi.PointOfInterest poi) { return wrapperContained.method_28358(poi.wrapperContained); }
public com.mojang.serialization.Codec createCodec(java.lang.Runnable updateListener) { return wrapperContained.createCodec(updateListener); }
// public com.mojang.datafixers.kinds.App method_28360(java.lang.Runnable instance) { return wrapperContained.method_28360(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_28361(yarnwrap.world.poi.PointOfInterest poi) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28361(poi.wrapperContained)); }
// public yarnwrap.util.math.BlockPos method_28362(yarnwrap.world.poi.PointOfInterest poi) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_28362(poi.wrapperContained)); }
public int getFreeTickets() { return wrapperContained.getFreeTickets(); }

}