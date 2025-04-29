package yarnwrap.loot.context;
public class LootContextAware { public net.minecraft.loot.context.LootContextAware wrapperContained; public LootContextAware(net.minecraft.loot.context.LootContextAware wrapperContained) { this.wrapperContained = wrapperContained; }

public void validate(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validate(reporter.wrapperContained); }
// public static void validate(yarnwrap.loot.LootTableReporter reporter, ) { net.minecraft.loot.context.LootContextAware.validate(reporter.wrapperContained); }
public java.util.Set getRequiredParameters() { return wrapperContained.getRequiredParameters(); }
// public static java.util.Set getRequiredParameters() { return net.minecraft.loot.context.LootContextAware.getRequiredParameters(); }

}