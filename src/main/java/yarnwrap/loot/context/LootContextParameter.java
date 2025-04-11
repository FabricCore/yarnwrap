package yarnwrap.loot.context;
public class LootContextParameter { public net.minecraft.loot.context.LootContextParameter wrapperContained; public LootContextParameter(net.minecraft.loot.context.LootContextParameter wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
public LootContextParameter(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.loot.context.LootContextParameter(id.wrapperContained); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }

}