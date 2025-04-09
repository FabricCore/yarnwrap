package yarnwrap.client.render.model;
public class BlockStatesLoader { public net.minecraft.client.render.model.BlockStatesLoader wrapperContained; public BlockStatesLoader(net.minecraft.client.render.model.BlockStatesLoader wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public com.google.common.base.Splitter EQUAL_SIGN_SPLITTER() { return wrapperContained.EQUAL_SIGN_SPLITTER; }
// public yarnwrap.state.StateManager ITEM_FRAME_STATE_MANAGER() { return new yarnwrap.state.StateManager(wrapperContained.ITEM_FRAME_STATE_MANAGER); }
// public java.util.Map STATIC_DEFINITIONS() { return wrapperContained.STATIC_DEFINITIONS; }
// public java.util.Map blockStates() { return wrapperContained.blockStates; }
// public yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.profiler); }
// public yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.blockColors); }
// public java.util.function.BiConsumer onLoad() { return wrapperContained.onLoad; }
// public int lookupId() { return wrapperContained.lookupId; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return wrapperContained.stateLookup; }
// public Object missingModel() { return wrapperContained.missingModel; }
// public Object context() { return wrapperContained.context; }
public void load() { wrapperContained.load(); }
// public void loadBlockStates(yarnwrap.util.Identifier id,yarnwrap.state.StateManager stateManager) { wrapperContained.loadBlockStates(id.wrapperContained,stateManager.wrapperContained); }
// public java.util.function.Predicate toStatePredicate(yarnwrap.state.StateManager stateManager,java.lang.String predicate) { return wrapperContained.toStatePredicate(stateManager.wrapperContained,predicate); }
// public java.lang.Comparable parseProperty(yarnwrap.state.property.Property property,java.lang.String value) { return wrapperContained.parseProperty(property.wrapperContained,value); }
// public void addStates(java.lang.Iterable states) { wrapperContained.addStates(states); }
public it.unimi.dsi.fastutil.objects.Object2IntMap getStateLookup() { return wrapperContained.getStateLookup(); }

}