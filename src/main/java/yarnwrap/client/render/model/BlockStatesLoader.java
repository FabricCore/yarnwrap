package yarnwrap.client.render.model;
public class BlockStatesLoader { public net.minecraft.client.render.model.BlockStatesLoader wrapperContained; public BlockStatesLoader(net.minecraft.client.render.model.BlockStatesLoader wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public void COMMA_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COMMA_SPLITTER = value; }
// public com.google.common.base.Splitter EQUAL_SIGN_SPLITTER() { return wrapperContained.EQUAL_SIGN_SPLITTER; }
// public void EQUAL_SIGN_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.EQUAL_SIGN_SPLITTER = value; }
// public yarnwrap.state.StateManager ITEM_FRAME_STATE_MANAGER() { return new yarnwrap.state.StateManager(wrapperContained.ITEM_FRAME_STATE_MANAGER); }
// public void ITEM_FRAME_STATE_MANAGER(yarnwrap.state.StateManager value) { wrapperContained.ITEM_FRAME_STATE_MANAGER = value.wrapperContained; }
// public java.util.Map STATIC_DEFINITIONS() { return wrapperContained.STATIC_DEFINITIONS; }
// public void STATIC_DEFINITIONS(java.util.Map value) { wrapperContained.STATIC_DEFINITIONS = value; }
// public java.util.Map blockStates() { return wrapperContained.blockStates; }
// public void blockStates(java.util.Map value) { wrapperContained.blockStates = value; }
// public yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.Profiler value) { wrapperContained.profiler = value.wrapperContained; }
// public yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.blockColors); }
// public void blockColors(yarnwrap.client.color.block.BlockColors value) { wrapperContained.blockColors = value.wrapperContained; }
// public java.util.function.BiConsumer onLoad() { return wrapperContained.onLoad; }
// public void onLoad(java.util.function.BiConsumer value) { wrapperContained.onLoad = value; }
// public int lookupId() { return wrapperContained.lookupId; }
// public void lookupId(int value) { wrapperContained.lookupId = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return wrapperContained.stateLookup; }
// public void stateLookup(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.stateLookup = value; }
// public Object missingModel() { return wrapperContained.missingModel; }
// // public void missingModel(Object value) { wrapperContained.missingModel = value; }
// public Object context() { return wrapperContained.context; }
// // public void context(Object value) { wrapperContained.context = value; }
public void load() { wrapperContained.load(); }
// public void loadBlockStates(yarnwrap.util.Identifier id,yarnwrap.state.StateManager stateManager) { wrapperContained.loadBlockStates(id.wrapperContained,stateManager.wrapperContained); }
// public java.util.function.Predicate toStatePredicate(yarnwrap.state.StateManager stateManager,java.lang.String predicate) { return wrapperContained.toStatePredicate(stateManager.wrapperContained,predicate); }
// public java.lang.Comparable parseProperty(yarnwrap.state.property.Property property,java.lang.String value) { return wrapperContained.parseProperty(property.wrapperContained,value); }
// public void addStates(java.lang.Iterable states) { wrapperContained.addStates(states); }
public it.unimi.dsi.fastutil.objects.Object2IntMap getStateLookup() { return wrapperContained.getStateLookup(); }

}