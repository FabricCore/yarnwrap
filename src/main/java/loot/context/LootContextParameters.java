package yarnwrap.loot.context;
public class LootContextParameters { public net.minecraft.loot.context.LootContextParameters wrapperContained; public LootContextParameters(net.minecraft.loot.context.LootContextParameters wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.context.LootContextParameter register(java.lang.String name) { return new yarnwrap.loot.context.LootContextParameter(wrapperContained.register(name)); }

}