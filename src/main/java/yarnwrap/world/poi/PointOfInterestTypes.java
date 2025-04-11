package yarnwrap.world.poi;
public class PointOfInterestTypes { public net.minecraft.world.poi.PointOfInterestTypes wrapperContained; public PointOfInterestTypes(net.minecraft.world.poi.PointOfInterestTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set BED_HEADS() { return wrapperContained.BED_HEADS; }
// public void BED_HEADS(java.util.Set value) { wrapperContained.BED_HEADS = value; }
// public java.util.Set CAULDRONS() { return wrapperContained.CAULDRONS; }
// public void CAULDRONS(java.util.Set value) { wrapperContained.CAULDRONS = value; }
// public java.util.Map POI_STATES_TO_TYPE() { return wrapperContained.POI_STATES_TO_TYPE; }
// public void POI_STATES_TO_TYPE(java.util.Map value) { wrapperContained.POI_STATES_TO_TYPE = value; }
// public java.util.Set getStatesOfBlock(yarnwrap.block.Block block) { return wrapperContained.getStatesOfBlock(block.wrapperContained); }
public java.util.Optional getTypeForState(yarnwrap.block.BlockState state) { return wrapperContained.getTypeForState(state.wrapperContained); }
// public void registerStates(yarnwrap.registry.entry.RegistryEntry poiTypeEntry,java.util.Set states) { wrapperContained.registerStates(poiTypeEntry.wrapperContained,states); }
// public void method_43991(yarnwrap.registry.entry.RegistryEntry state) { wrapperContained.method_43991(state.wrapperContained); }
public yarnwrap.world.poi.PointOfInterestType registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.world.poi.PointOfInterestType(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public yarnwrap.world.poi.PointOfInterestType register(yarnwrap.registry.Registry registry,yarnwrap.registry.RegistryKey key,java.util.Set states,int ticketCount,int searchDistance) { return new yarnwrap.world.poi.PointOfInterestType(wrapperContained.register(registry.wrapperContained,key.wrapperContained,states,ticketCount,searchDistance)); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public boolean isPointOfInterest(yarnwrap.block.BlockState state) { return wrapperContained.isPointOfInterest(state.wrapperContained); }

}