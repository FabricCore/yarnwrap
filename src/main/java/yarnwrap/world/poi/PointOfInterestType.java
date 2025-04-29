package yarnwrap.world.poi;
public class PointOfInterestType { public net.minecraft.world.poi.PointOfInterestType wrapperContained; public PointOfInterestType(net.minecraft.world.poi.PointOfInterestType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set blockStates() { return wrapperContained.blockStates; }
// public void blockStates(java.util.Set value) { wrapperContained.blockStates = value; }
// public static java.util.Set blockStates() { return net.minecraft.world.poi.PointOfInterestType.blockStates; }
// public static void blockStates(java.util.Set value, ) { net.minecraft.world.poi.PointOfInterestType.blockStates = value; }

// public int ticketCount() { return wrapperContained.ticketCount; }
// public void ticketCount(int value) { wrapperContained.ticketCount = value; }
// public static int ticketCount() { return net.minecraft.world.poi.PointOfInterestType.ticketCount; }
// public static void ticketCount(int value, ) { net.minecraft.world.poi.PointOfInterestType.ticketCount = value; }

// public int searchDistance() { return wrapperContained.searchDistance; }
// public void searchDistance(int value) { wrapperContained.searchDistance = value; }
// public static int searchDistance() { return net.minecraft.world.poi.PointOfInterestType.searchDistance; }
// public static void searchDistance(int value, ) { net.minecraft.world.poi.PointOfInterestType.searchDistance = value; }

// public java.util.function.Predicate NONE() { return wrapperContained.NONE; }
// public void NONE(java.util.function.Predicate value) { wrapperContained.NONE = value; }
public static java.util.function.Predicate NONE() { return net.minecraft.world.poi.PointOfInterestType.NONE; }
// public static void NONE(java.util.function.Predicate value, ) { net.minecraft.world.poi.PointOfInterestType.NONE = value; }

// public java.util.Set blockStates() { return wrapperContained.blockStates(); }
// // public static java.util.Set blockStates() { return net.minecraft.world.poi.PointOfInterestType.blockStates(); }
// public int ticketCount() { return wrapperContained.ticketCount(); }
// // public static int ticketCount() { return net.minecraft.world.poi.PointOfInterestType.ticketCount(); }
// public int searchDistance() { return wrapperContained.searchDistance(); }
// // public static int searchDistance() { return net.minecraft.world.poi.PointOfInterestType.searchDistance(); }
public boolean contains(yarnwrap.block.BlockState state) { return wrapperContained.contains(state.wrapperContained); }
// public static boolean contains(yarnwrap.block.BlockState state, ) { return net.minecraft.world.poi.PointOfInterestType.contains(state.wrapperContained); }
// public boolean method_43987(yarnwrap.registry.entry.RegistryEntry type) { return wrapperContained.method_43987(type.wrapperContained); }
// public static boolean method_43987(yarnwrap.registry.entry.RegistryEntry type, ) { return net.minecraft.world.poi.PointOfInterestType.method_43987(type.wrapperContained); }

}