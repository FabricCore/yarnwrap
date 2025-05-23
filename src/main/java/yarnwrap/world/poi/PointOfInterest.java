package yarnwrap.world.poi;
public class PointOfInterest { public net.minecraft.world.poi.PointOfInterest wrapperContained; public PointOfInterest(net.minecraft.world.poi.PointOfInterest wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.poi.PointOfInterest.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.world.poi.PointOfInterest.pos = value.wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public void type(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.poi.PointOfInterest.type); }
// public static void type(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.poi.PointOfInterest.type = value.wrapperContained; }

// public int freeTickets() { return wrapperContained.freeTickets; }
// public void freeTickets(int value) { wrapperContained.freeTickets = value; }
// public static int freeTickets() { return net.minecraft.world.poi.PointOfInterest.freeTickets; }
// public static void freeTickets(int value, ) { net.minecraft.world.poi.PointOfInterest.freeTickets = value; }

// public java.lang.Runnable updateListener() { return wrapperContained.updateListener; }
// public void updateListener(java.lang.Runnable value) { wrapperContained.updateListener = value; }
// public static java.lang.Runnable updateListener() { return net.minecraft.world.poi.PointOfInterest.updateListener; }
// public static void updateListener(java.lang.Runnable value, ) { net.minecraft.world.poi.PointOfInterest.updateListener = value; }

// public PointOfInterest(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type,int freeTickets,java.lang.Runnable updateListener) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterest(pos.wrapperContained,type.wrapperContained,freeTickets,updateListener); }
public PointOfInterest(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type,java.lang.Runnable updateListener) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterest(pos.wrapperContained,type.wrapperContained,updateListener); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.world.poi.PointOfInterest.equals(o); }
// public boolean reserveTicket() { return wrapperContained.reserveTicket(); }
// public static boolean reserveTicket() { return net.minecraft.world.poi.PointOfInterest.reserveTicket(); }
// public boolean releaseTicket() { return wrapperContained.releaseTicket(); }
// public static boolean releaseTicket() { return net.minecraft.world.poi.PointOfInterest.releaseTicket(); }
public boolean hasSpace() { return wrapperContained.hasSpace(); }
// public static boolean hasSpace() { return net.minecraft.world.poi.PointOfInterest.hasSpace(); }
public boolean isOccupied() { return wrapperContained.isOccupied(); }
// public static boolean isOccupied() { return net.minecraft.world.poi.PointOfInterest.isOccupied(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.poi.PointOfInterest.getPos()); }
public yarnwrap.registry.entry.RegistryEntry getType() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getType()); }
// public static yarnwrap.registry.entry.RegistryEntry getType() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.poi.PointOfInterest.getType()); }
public int getFreeTickets() { return wrapperContained.getFreeTickets(); }
// public static int getFreeTickets() { return net.minecraft.world.poi.PointOfInterest.getFreeTickets(); }
public Object toSerialized() { return wrapperContained.toSerialized(); }
// public static Object toSerialized() { return net.minecraft.world.poi.PointOfInterest.toSerialized(); }

}