package yarnwrap.loot.provider.number;
public class LootNumberProvider { public net.minecraft.loot.provider.number.LootNumberProvider wrapperContained; public LootNumberProvider(net.minecraft.loot.provider.number.LootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.provider.number.LootNumberProviderType getType() { return new yarnwrap.loot.provider.number.LootNumberProviderType(wrapperContained.getType()); }
// public static yarnwrap.loot.provider.number.LootNumberProviderType getType() { return new yarnwrap.loot.provider.number.LootNumberProviderType(net.minecraft.loot.provider.number.LootNumberProvider.getType()); }
public int nextInt(yarnwrap.loot.context.LootContext context) { return wrapperContained.nextInt(context.wrapperContained); }
// public static int nextInt(yarnwrap.loot.context.LootContext context, ) { return net.minecraft.loot.provider.number.LootNumberProvider.nextInt(context.wrapperContained); }
public float nextFloat(yarnwrap.loot.context.LootContext context) { return wrapperContained.nextFloat(context.wrapperContained); }
// public static float nextFloat(yarnwrap.loot.context.LootContext context, ) { return net.minecraft.loot.provider.number.LootNumberProvider.nextFloat(context.wrapperContained); }

}