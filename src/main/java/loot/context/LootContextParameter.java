package yarnwrap.loot.context;
public class LootContextParameter { public net.minecraft.loot.context.LootContextParameter wrapperContained; public LootContextParameter(net.minecraft.loot.context.LootContextParameter wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }

}