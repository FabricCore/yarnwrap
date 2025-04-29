package yarnwrap.client.render.model;
public class BlockStatesLoader { public net.minecraft.client.render.model.BlockStatesLoader wrapperContained; public BlockStatesLoader(net.minecraft.client.render.model.BlockStatesLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
public static yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.client.render.model.BlockStatesLoader.FINDER); }
// public static void FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.client.render.model.BlockStatesLoader.FINDER = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.model.BlockStatesLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.model.BlockStatesLoader.LOGGER = value; }

// public com.google.common.base.Splitter COMMA_SPLITTER() { return wrapperContained.COMMA_SPLITTER; }
// public void COMMA_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.COMMA_SPLITTER = value; }
// public static com.google.common.base.Splitter COMMA_SPLITTER() { return net.minecraft.client.render.model.BlockStatesLoader.COMMA_SPLITTER; }
// public static void COMMA_SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.client.render.model.BlockStatesLoader.COMMA_SPLITTER = value; }

// public com.google.common.base.Splitter EQUAL_SIGN_SPLITTER() { return wrapperContained.EQUAL_SIGN_SPLITTER; }
// public void EQUAL_SIGN_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.EQUAL_SIGN_SPLITTER = value; }
// public static com.google.common.base.Splitter EQUAL_SIGN_SPLITTER() { return net.minecraft.client.render.model.BlockStatesLoader.EQUAL_SIGN_SPLITTER; }
// public static void EQUAL_SIGN_SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.client.render.model.BlockStatesLoader.EQUAL_SIGN_SPLITTER = value; }

// public yarnwrap.state.StateManager ITEM_FRAME_STATE_MANAGER() { return new yarnwrap.state.StateManager(wrapperContained.ITEM_FRAME_STATE_MANAGER); }
// public void ITEM_FRAME_STATE_MANAGER(yarnwrap.state.StateManager value) { wrapperContained.ITEM_FRAME_STATE_MANAGER = value.wrapperContained; }
// public static yarnwrap.state.StateManager ITEM_FRAME_STATE_MANAGER() { return new yarnwrap.state.StateManager(net.minecraft.client.render.model.BlockStatesLoader.ITEM_FRAME_STATE_MANAGER); }
// public static void ITEM_FRAME_STATE_MANAGER(yarnwrap.state.StateManager value, ) { net.minecraft.client.render.model.BlockStatesLoader.ITEM_FRAME_STATE_MANAGER = value.wrapperContained; }

// public java.util.Map STATIC_DEFINITIONS() { return wrapperContained.STATIC_DEFINITIONS; }
// public void STATIC_DEFINITIONS(java.util.Map value) { wrapperContained.STATIC_DEFINITIONS = value; }
// public static java.util.Map STATIC_DEFINITIONS() { return net.minecraft.client.render.model.BlockStatesLoader.STATIC_DEFINITIONS; }
// public static void STATIC_DEFINITIONS(java.util.Map value, ) { net.minecraft.client.render.model.BlockStatesLoader.STATIC_DEFINITIONS = value; }

// public java.util.Map blockStates() { return wrapperContained.blockStates; }
// public void blockStates(java.util.Map value) { wrapperContained.blockStates = value; }
// public static java.util.Map blockStates() { return net.minecraft.client.render.model.BlockStatesLoader.blockStates; }
// public static void blockStates(java.util.Map value, ) { net.minecraft.client.render.model.BlockStatesLoader.blockStates = value; }

// public yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.Profiler value) { wrapperContained.profiler = value.wrapperContained; }
// public static yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(net.minecraft.client.render.model.BlockStatesLoader.profiler); }
// public static void profiler(yarnwrap.util.profiler.Profiler value, ) { net.minecraft.client.render.model.BlockStatesLoader.profiler = value.wrapperContained; }

// public yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.blockColors); }
// public void blockColors(yarnwrap.client.color.block.BlockColors value) { wrapperContained.blockColors = value.wrapperContained; }
// public static yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(net.minecraft.client.render.model.BlockStatesLoader.blockColors); }
// public static void blockColors(yarnwrap.client.color.block.BlockColors value, ) { net.minecraft.client.render.model.BlockStatesLoader.blockColors = value.wrapperContained; }

// public java.util.function.BiConsumer onLoad() { return wrapperContained.onLoad; }
// public void onLoad(java.util.function.BiConsumer value) { wrapperContained.onLoad = value; }
// public static java.util.function.BiConsumer onLoad() { return net.minecraft.client.render.model.BlockStatesLoader.onLoad; }
// public static void onLoad(java.util.function.BiConsumer value, ) { net.minecraft.client.render.model.BlockStatesLoader.onLoad = value; }

// public int lookupId() { return wrapperContained.lookupId; }
// public void lookupId(int value) { wrapperContained.lookupId = value; }
// public static int lookupId() { return net.minecraft.client.render.model.BlockStatesLoader.lookupId; }
// public static void lookupId(int value, ) { net.minecraft.client.render.model.BlockStatesLoader.lookupId = value; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return wrapperContained.stateLookup; }
// public void stateLookup(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.stateLookup = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap stateLookup() { return net.minecraft.client.render.model.BlockStatesLoader.stateLookup; }
// public static void stateLookup(it.unimi.dsi.fastutil.objects.Object2IntMap value, ) { net.minecraft.client.render.model.BlockStatesLoader.stateLookup = value; }

// public Object missingModel() { return wrapperContained.missingModel; }
// // public void missingModel(Object value) { wrapperContained.missingModel = value; }
// // public static Object missingModel() { return net.minecraft.client.render.model.BlockStatesLoader.missingModel; }
// // public static void missingModel(Object value, ) { net.minecraft.client.render.model.BlockStatesLoader.missingModel = value; }

// public Object context() { return wrapperContained.context; }
// // public void context(Object value) { wrapperContained.context = value; }
// // public static Object context() { return net.minecraft.client.render.model.BlockStatesLoader.context; }
// // public static void context(Object value, ) { net.minecraft.client.render.model.BlockStatesLoader.context = value; }

public BlockStatesLoader(java.util.Map blockStates,yarnwrap.util.profiler.Profiler profiler,yarnwrap.client.render.model.UnbakedModel missingModel,yarnwrap.client.color.block.BlockColors blockColors,java.util.function.BiConsumer onLoad) { this.wrapperContained = new net.minecraft.client.render.model.BlockStatesLoader(blockStates,profiler.wrapperContained,missingModel.wrapperContained,blockColors.wrapperContained,onLoad); }
public void load() { wrapperContained.load(); }
// public static void load() { net.minecraft.client.render.model.BlockStatesLoader.load(); }
// public void method_61052(int state) { wrapperContained.method_61052(state); }
// public static void method_61052(int state, ) { net.minecraft.client.render.model.BlockStatesLoader.method_61052(state); }
// public void loadBlockStates(yarnwrap.util.Identifier id,yarnwrap.state.StateManager stateManager) { wrapperContained.loadBlockStates(id.wrapperContained,stateManager.wrapperContained); }
// public static void loadBlockStates(yarnwrap.util.Identifier id,yarnwrap.state.StateManager stateManager, ) { net.minecraft.client.render.model.BlockStatesLoader.loadBlockStates(id.wrapperContained,stateManager.wrapperContained); }
// public boolean method_61054(yarnwrap.block.Block state) { return wrapperContained.method_61054(state.wrapperContained); }
// public static boolean method_61054(yarnwrap.block.Block state, ) { return net.minecraft.client.render.model.BlockStatesLoader.method_61054(state.wrapperContained); }
// public java.util.function.Predicate toStatePredicate(yarnwrap.state.StateManager stateManager,java.lang.String predicate) { return wrapperContained.toStatePredicate(stateManager.wrapperContained,predicate); }
// public static java.util.function.Predicate toStatePredicate(yarnwrap.state.StateManager stateManager,java.lang.String predicate, ) { return net.minecraft.client.render.model.BlockStatesLoader.toStatePredicate(stateManager.wrapperContained,predicate); }
// public java.lang.Comparable parseProperty(yarnwrap.state.property.Property property,java.lang.String value) { return wrapperContained.parseProperty(property.wrapperContained,value); }
// public static java.lang.Comparable parseProperty(yarnwrap.state.property.Property property,java.lang.String value, ) { return net.minecraft.client.render.model.BlockStatesLoader.parseProperty(property.wrapperContained,value); }
// public java.util.Set method_61060(Object definition) { return wrapperContained.method_61060(definition); }
// public static java.util.Set method_61060(Object definition, ) { return net.minecraft.client.render.model.BlockStatesLoader.method_61060(definition); }
// public void method_61061(Object definition,java.util.Set states) { wrapperContained.method_61061(definition,states); }
// public static void method_61061(Object definition,java.util.Set states, ) { net.minecraft.client.render.model.BlockStatesLoader.method_61061(definition,states); }
// public void method_61062(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map) { wrapperContained.method_61062(map); }
// public static void method_61062(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map, ) { net.minecraft.client.render.model.BlockStatesLoader.method_61062(map); }
// public void addStates(java.lang.Iterable states) { wrapperContained.addStates(states); }
// public static void addStates(java.lang.Iterable states, ) { net.minecraft.client.render.model.BlockStatesLoader.addStates(states); }
// public void method_61064(java.util.List variant,yarnwrap.state.StateManager model) { wrapperContained.method_61064(variant,model.wrapperContained); }
// public static void method_61064(java.util.List variant,yarnwrap.state.StateManager model, ) { net.minecraft.client.render.model.BlockStatesLoader.method_61064(variant,model.wrapperContained); }
// public void method_61065(java.util.Map state) { wrapperContained.method_61065(state); }
// public static void method_61065(java.util.Map state, ) { net.minecraft.client.render.model.BlockStatesLoader.method_61065(state); }
// public void method_61066(java.util.Map modelId,yarnwrap.util.Identifier state) { wrapperContained.method_61066(modelId,state.wrapperContained); }
// public static void method_61066(java.util.Map modelId,yarnwrap.util.Identifier state, ) { net.minecraft.client.render.model.BlockStatesLoader.method_61066(modelId,state.wrapperContained); }
// public void method_61067(java.util.Map state) { wrapperContained.method_61067(state); }
// public static void method_61067(java.util.Map state, ) { net.minecraft.client.render.model.BlockStatesLoader.method_61067(state); }
// public void method_61068(java.util.Map state) { wrapperContained.method_61068(state); }
// public static void method_61068(java.util.Map state, ) { net.minecraft.client.render.model.BlockStatesLoader.method_61068(state); }
public it.unimi.dsi.fastutil.objects.Object2IntMap getStateLookup() { return wrapperContained.getStateLookup(); }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap getStateLookup() { return net.minecraft.client.render.model.BlockStatesLoader.getStateLookup(); }

}