package yarnwrap.loot;
public class LootTableReporter { public net.minecraft.loot.LootTableReporter wrapperContained; public LootTableReporter(net.minecraft.loot.LootTableReporter wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.context.LootContextType contextType() { return new yarnwrap.loot.context.LootContextType(wrapperContained.contextType); }
// public java.util.Optional dataLookup() { return wrapperContained.dataLookup; }
// public java.util.Set referenceStack() { return wrapperContained.referenceStack; }
// public yarnwrap.util.ErrorReporter errorReporter() { return new yarnwrap.util.ErrorReporter(wrapperContained.errorReporter); }
public void validateContext(yarnwrap.loot.context.LootContextAware contextAware) { wrapperContained.validateContext(contextAware.wrapperContained); }
public yarnwrap.loot.LootTableReporter withContextType(yarnwrap.loot.context.LootContextType contextType) { return new yarnwrap.loot.LootTableReporter(wrapperContained.withContextType(contextType.wrapperContained)); }
public void report(java.lang.String message) { wrapperContained.report(message); }
public yarnwrap.loot.LootTableReporter makeChild(java.lang.String name) { return new yarnwrap.loot.LootTableReporter(wrapperContained.makeChild(name)); }
public boolean isInStack(yarnwrap.registry.RegistryKey key) { return wrapperContained.isInStack(key.wrapperContained); }
public yarnwrap.loot.LootTableReporter makeChild(java.lang.String name,yarnwrap.registry.RegistryKey key) { return new yarnwrap.loot.LootTableReporter(wrapperContained.makeChild(name,key.wrapperContained)); }
public Object getDataLookup() { return wrapperContained.getDataLookup(); }
public yarnwrap.util.ErrorReporter getErrorReporter() { return new yarnwrap.util.ErrorReporter(wrapperContained.getErrorReporter()); }
public boolean canUseReferences() { return wrapperContained.canUseReferences(); }

}