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
public BlockStatesLoader(java.util.Map blockStates,yarnwrap.util.profiler.Profiler profiler,yarnwrap.client.render.model.UnbakedModel missingModel,yarnwrap.client.color.block.BlockColors blockColors,java.util.function.BiConsumer onLoad) { this.wrapperContained = new net.minecraft.client.render.model.BlockStatesLoader(blockStates,profiler.wrapperContained,missingModel.wrapperContained,blockColors.wrapperContained,onLoad); }
public void load() { wrapperContained.load(); }
// public void method_61052(int state) { wrapperContained.method_61052(state); }
// public void loadBlockStates(yarnwrap.util.Identifier id,yarnwrap.state.StateManager stateManager) { wrapperContained.loadBlockStates(id.wrapperContained,stateManager.wrapperContained); }
// public boolean method_61054(yarnwrap.block.Block state) { return wrapperContained.method_61054(state.wrapperContained); }
// public java.util.function.Predicate toStatePredicate(yarnwrap.state.StateManager stateManager,java.lang.String predicate) { return wrapperContained.toStatePredicate(stateManager.wrapperContained,predicate); }
// public java.lang.Comparable parseProperty(yarnwrap.state.property.Property property,java.lang.String value) { return wrapperContained.parseProperty(property.wrapperContained,value); }
// public java.util.Set method_61060(Object definition) { return wrapperContained.method_61060(definition); }
// public void method_61061(Object definition,java.util.Set states) { wrapperContained.method_61061(definition,states); }
// public void method_61062(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map) { wrapperContained.method_61062(map); }
// public void addStates(java.lang.Iterable states) { wrapperContained.addStates(states); }
// public void method_61064(java.util.List variant,yarnwrap.state.StateManager model) { wrapperContained.method_61064(variant,model.wrapperContained); }
// public void method_61065(java.util.Map state) { wrapperContained.method_61065(state); }
// public void method_61066(java.util.Map modelId,yarnwrap.util.Identifier state) { wrapperContained.method_61066(modelId,state.wrapperContained); }
// public void method_61067(java.util.Map state) { wrapperContained.method_61067(state); }
// public void method_61068(java.util.Map state) { wrapperContained.method_61068(state); }
public it.unimi.dsi.fastutil.objects.Object2IntMap getStateLookup() { return wrapperContained.getStateLookup(); }

}