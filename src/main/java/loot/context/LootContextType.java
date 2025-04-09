package yarnwrap.loot.context;
public class LootContextType { public net.minecraft.loot.context.LootContextType wrapperContained; public LootContextType(net.minecraft.loot.context.LootContextType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set allowed() { return wrapperContained.allowed; }
// public java.util.Set required() { return wrapperContained.required; }
public boolean isAllowed(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.isAllowed(parameter.wrapperContained); }
public Object create() { return wrapperContained.create(); }
public void validate(yarnwrap.loot.LootTableReporter lootTableReporter,yarnwrap.loot.context.LootContextAware parameterConsumer) { wrapperContained.validate(lootTableReporter.wrapperContained,parameterConsumer.wrapperContained); }
public void validate(yarnwrap.util.ErrorReporter errorReporter,yarnwrap.loot.context.LootContextAware parameterConsumer) { wrapperContained.validate(errorReporter.wrapperContained,parameterConsumer.wrapperContained); }
public java.util.Set getAllowed() { return wrapperContained.getAllowed(); }
public java.util.Set getRequired() { return wrapperContained.getRequired(); }

}