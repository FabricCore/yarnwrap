package yarnwrap.loot.context;
public class LootContextType { public net.minecraft.loot.context.LootContextType wrapperContained; public LootContextType(net.minecraft.loot.context.LootContextType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set allowed() { return wrapperContained.allowed; }
// public void allowed(java.util.Set value) { wrapperContained.allowed = value; }
// public static java.util.Set allowed() { return net.minecraft.loot.context.LootContextType.allowed; }
// public static void allowed(java.util.Set value, ) { net.minecraft.loot.context.LootContextType.allowed = value; }

// public java.util.Set required() { return wrapperContained.required; }
// public void required(java.util.Set value) { wrapperContained.required = value; }
// public static java.util.Set required() { return net.minecraft.loot.context.LootContextType.required; }
// public static void required(java.util.Set value, ) { net.minecraft.loot.context.LootContextType.required = value; }

// public LootContextType(java.util.Set required,java.util.Set allowed) { this.wrapperContained = new net.minecraft.loot.context.LootContextType(required,allowed); }
public boolean isAllowed(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.isAllowed(parameter.wrapperContained); }
// public static boolean isAllowed(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContextType.isAllowed(parameter.wrapperContained); }
// public Object create() { return wrapperContained.create(); }
public static Object create() { return net.minecraft.loot.context.LootContextType.create(); }
public void validate(yarnwrap.loot.LootTableReporter lootTableReporter,yarnwrap.loot.context.LootContextAware parameterConsumer) { wrapperContained.validate(lootTableReporter.wrapperContained,parameterConsumer.wrapperContained); }
// public static void validate(yarnwrap.loot.LootTableReporter lootTableReporter,yarnwrap.loot.context.LootContextAware parameterConsumer, ) { net.minecraft.loot.context.LootContextType.validate(lootTableReporter.wrapperContained,parameterConsumer.wrapperContained); }
public void validate(yarnwrap.util.ErrorReporter errorReporter,yarnwrap.loot.context.LootContextAware parameterConsumer) { wrapperContained.validate(errorReporter.wrapperContained,parameterConsumer.wrapperContained); }
// public static void validate(yarnwrap.util.ErrorReporter errorReporter,yarnwrap.loot.context.LootContextAware parameterConsumer, ) { net.minecraft.loot.context.LootContextType.validate(errorReporter.wrapperContained,parameterConsumer.wrapperContained); }
public java.util.Set getAllowed() { return wrapperContained.getAllowed(); }
// public static java.util.Set getAllowed() { return net.minecraft.loot.context.LootContextType.getAllowed(); }
public java.util.Set getRequired() { return wrapperContained.getRequired(); }
// public static java.util.Set getRequired() { return net.minecraft.loot.context.LootContextType.getRequired(); }
// public java.lang.String method_779(yarnwrap.loot.context.LootContextParameter parameter) { return wrapperContained.method_779(parameter.wrapperContained); }
// public static java.lang.String method_779(yarnwrap.loot.context.LootContextParameter parameter, ) { return net.minecraft.loot.context.LootContextType.method_779(parameter.wrapperContained); }

}