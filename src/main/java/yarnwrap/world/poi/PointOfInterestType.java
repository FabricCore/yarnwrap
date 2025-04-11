package yarnwrap.world.poi;
public class PointOfInterestType { public net.minecraft.world.poi.PointOfInterestType wrapperContained; public PointOfInterestType(net.minecraft.world.poi.PointOfInterestType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set blockStates() { return wrapperContained.blockStates; }
// public void blockStates(java.util.Set value) { wrapperContained.blockStates = value; }
// public int ticketCount() { return wrapperContained.ticketCount; }
// public void ticketCount(int value) { wrapperContained.ticketCount = value; }
// public int searchDistance() { return wrapperContained.searchDistance; }
// public void searchDistance(int value) { wrapperContained.searchDistance = value; }
public java.util.function.Predicate NONE() { return wrapperContained.NONE; }
// public void NONE(java.util.function.Predicate value) { wrapperContained.NONE = value; }
// public java.util.Set blockStates() { return wrapperContained.blockStates(); }
// public int ticketCount() { return wrapperContained.ticketCount(); }
// public int searchDistance() { return wrapperContained.searchDistance(); }
public boolean contains(yarnwrap.block.BlockState state) { return wrapperContained.contains(state.wrapperContained); }
// public boolean method_43987(yarnwrap.registry.entry.RegistryEntry type) { return wrapperContained.method_43987(type.wrapperContained); }

}