package yarnwrap.world.poi;
public class PointOfInterestType { public net.minecraft.world.poi.PointOfInterestType wrapperContained; public PointOfInterestType(net.minecraft.world.poi.PointOfInterestType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set blockStates() { return wrapperContained.blockStates; }
// public int ticketCount() { return wrapperContained.ticketCount; }
// public int searchDistance() { return wrapperContained.searchDistance; }
public java.util.function.Predicate NONE() { return wrapperContained.NONE; }
// public java.util.Set blockStates() { return wrapperContained.blockStates(); }
// public int ticketCount() { return wrapperContained.ticketCount(); }
// public int searchDistance() { return wrapperContained.searchDistance(); }
public boolean contains(yarnwrap.block.BlockState state) { return wrapperContained.contains(state.wrapperContained); }

}