package yarnwrap.loot.provider.number;
public class LootNumberProvider { public net.minecraft.loot.provider.number.LootNumberProvider wrapperContained; public LootNumberProvider(net.minecraft.loot.provider.number.LootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public float nextFloat(yarnwrap.loot.context.LootContext context) { return wrapperContained.nextFloat(context.wrapperContained); }
public yarnwrap.loot.provider.number.LootNumberProviderType getType() { return new yarnwrap.loot.provider.number.LootNumberProviderType(wrapperContained.getType()); }
public int nextInt(yarnwrap.loot.context.LootContext context) { return wrapperContained.nextInt(context.wrapperContained); }

}