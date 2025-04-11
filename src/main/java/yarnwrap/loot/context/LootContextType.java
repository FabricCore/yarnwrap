package yarnwrap.loot.context;
public class LootContextType { public net.minecraft.loot.context.LootContextType wrapperContained; public LootContextType(net.minecraft.loot.context.LootContextType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set allowed() { return wrapperContained.allowed; }
// public void allowed(java.util.Set value) { wrapperContained.allowed = value; }
// public java.util.Set required() { return wrapperContained.required; }
// public void required(java.util.Set value) { wrapperContained.required = value; }
// public LootContextType(java.util.Set required,java.util.Set allowed) { this.wrapperContained = new net.minecraft.loot.context.LootContextType(required,allowed); }
public boolean isAllowed(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.isAllowed(parameter.wrapperContained); }
public Object create() { return wrapperContained.create(); }
public void validate(yarnwrap.loot.LootTableReporter lootTableReporter,yarnwrap.loot.context.LootContextAware parameterConsumer) { wrapperContained.validate(lootTableReporter.wrapperContained,parameterConsumer.wrapperContained); }
public void validate(yarnwrap.util.ErrorReporter errorReporter,yarnwrap.loot.context.LootContextAware parameterConsumer) { wrapperContained.validate(errorReporter.wrapperContained,parameterConsumer.wrapperContained); }
public java.util.Set getAllowed() { return wrapperContained.getAllowed(); }
public java.util.Set getRequired() { return wrapperContained.getRequired(); }
// public java.lang.String method_779(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.method_779(parameter.wrapperContained); }

}