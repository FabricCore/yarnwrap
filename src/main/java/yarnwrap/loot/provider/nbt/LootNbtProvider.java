package yarnwrap.loot.provider.nbt;
public class LootNbtProvider { public net.minecraft.loot.provider.nbt.LootNbtProvider wrapperContained; public LootNbtProvider(net.minecraft.loot.provider.nbt.LootNbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.provider.nbt.LootNbtProviderType getType() { return new yarnwrap.loot.provider.nbt.LootNbtProviderType(wrapperContained.getType()); }
public yarnwrap.nbt.NbtElement getNbt(yarnwrap.loot.context.LootContext context) { return new yarnwrap.nbt.NbtElement(wrapperContained.getNbt(context.wrapperContained)); }
public java.util.Set getRequiredParameters() { return wrapperContained.getRequiredParameters(); }

}