package yarnwrap.loot;
public class LootTableReporter { public net.minecraft.loot.LootTableReporter wrapperContained; public LootTableReporter(net.minecraft.loot.LootTableReporter wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.context.ContextType contextType() { return new yarnwrap.util.context.ContextType(wrapperContained.contextType); }
// public void contextType(yarnwrap.util.context.ContextType value) { wrapperContained.contextType = value.wrapperContained; }
// public static yarnwrap.util.context.ContextType contextType() { return new yarnwrap.util.context.ContextType(net.minecraft.loot.LootTableReporter.contextType); }
// public static void contextType(yarnwrap.util.context.ContextType value, ) { net.minecraft.loot.LootTableReporter.contextType = value.wrapperContained; }

// public java.util.Optional dataLookup() { return wrapperContained.dataLookup; }
// public void dataLookup(java.util.Optional value) { wrapperContained.dataLookup = value; }
// public static java.util.Optional dataLookup() { return net.minecraft.loot.LootTableReporter.dataLookup; }
// public static void dataLookup(java.util.Optional value, ) { net.minecraft.loot.LootTableReporter.dataLookup = value; }

// public java.util.Set referenceStack() { return wrapperContained.referenceStack; }
// public void referenceStack(java.util.Set value) { wrapperContained.referenceStack = value; }
// public static java.util.Set referenceStack() { return net.minecraft.loot.LootTableReporter.referenceStack; }
// public static void referenceStack(java.util.Set value, ) { net.minecraft.loot.LootTableReporter.referenceStack = value; }

// public yarnwrap.util.ErrorReporter errorReporter() { return new yarnwrap.util.ErrorReporter(wrapperContained.errorReporter); }
// public void errorReporter(yarnwrap.util.ErrorReporter value) { wrapperContained.errorReporter = value.wrapperContained; }
// public static yarnwrap.util.ErrorReporter errorReporter() { return new yarnwrap.util.ErrorReporter(net.minecraft.loot.LootTableReporter.errorReporter); }
// public static void errorReporter(yarnwrap.util.ErrorReporter value, ) { net.minecraft.loot.LootTableReporter.errorReporter = value.wrapperContained; }

public LootTableReporter(yarnwrap.util.ErrorReporter errorReporter,yarnwrap.util.context.ContextType contextType) { this.wrapperContained = new net.minecraft.loot.LootTableReporter(errorReporter.wrapperContained,contextType.wrapperContained); }
// public LootTableReporter(yarnwrap.util.ErrorReporter errorReporter,yarnwrap.util.context.ContextType contextType,java.util.Optional dataLookup,java.util.Set referenceStack) { this.wrapperContained = new net.minecraft.loot.LootTableReporter(errorReporter.wrapperContained,contextType.wrapperContained,dataLookup,referenceStack); }
// public LootTableReporter(yarnwrap.util.ErrorReporter errorReporter,yarnwrap.util.context.ContextType contextType,Object dataLookup) { this.wrapperContained = new net.minecraft.loot.LootTableReporter(errorReporter.wrapperContained,contextType.wrapperContained,dataLookup); }
// public void report() { wrapperContained.report(); }
// public static void report() { net.minecraft.loot.LootTableReporter.report(); }
// public yarnwrap.loot.LootTableReporter makeChild() { return new yarnwrap.loot.LootTableReporter(wrapperContained.makeChild()); }
// public static yarnwrap.loot.LootTableReporter makeChild() { return new yarnwrap.loot.LootTableReporter(net.minecraft.loot.LootTableReporter.makeChild()); }
public void validateContext(yarnwrap.loot.context.LootContextAware contextAware) { wrapperContained.validateContext(contextAware.wrapperContained); }
// public static void validateContext(yarnwrap.loot.context.LootContextAware contextAware, ) { net.minecraft.loot.LootTableReporter.validateContext(contextAware.wrapperContained); }
public yarnwrap.loot.LootTableReporter withContextType(yarnwrap.util.context.ContextType contextType) { return new yarnwrap.loot.LootTableReporter(wrapperContained.withContextType(contextType.wrapperContained)); }
// public static yarnwrap.loot.LootTableReporter withContextType(yarnwrap.util.context.ContextType contextType, ) { return new yarnwrap.loot.LootTableReporter(net.minecraft.loot.LootTableReporter.withContextType(contextType.wrapperContained)); }
public boolean isInStack(yarnwrap.registry.RegistryKey key) { return wrapperContained.isInStack(key.wrapperContained); }
// public static boolean isInStack(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.loot.LootTableReporter.isInStack(key.wrapperContained); }
// // public yarnwrap.loot.LootTableReporter makeChild(Object key) { return new yarnwrap.loot.LootTableReporter(wrapperContained.makeChild(key)); }
// public static yarnwrap.loot.LootTableReporter makeChild(Object key, ) { return new yarnwrap.loot.LootTableReporter(net.minecraft.loot.LootTableReporter.makeChild(key)); }
public Object getDataLookup() { return wrapperContained.getDataLookup(); }
// public static Object getDataLookup() { return net.minecraft.loot.LootTableReporter.getDataLookup(); }
public yarnwrap.util.ErrorReporter getErrorReporter() { return new yarnwrap.util.ErrorReporter(wrapperContained.getErrorReporter()); }
// public static yarnwrap.util.ErrorReporter getErrorReporter() { return new yarnwrap.util.ErrorReporter(net.minecraft.loot.LootTableReporter.getErrorReporter()); }
public boolean canUseReferences() { return wrapperContained.canUseReferences(); }
// public static boolean canUseReferences() { return net.minecraft.loot.LootTableReporter.canUseReferences(); }

}