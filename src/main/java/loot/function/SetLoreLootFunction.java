package yarnwrap.loot.function;
public class SetLoreLootFunction { public net.minecraft.loot.function.SetLoreLootFunction wrapperContained; public SetLoreLootFunction(net.minecraft.loot.function.SetLoreLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List lore() { return wrapperContained.lore; }
// public java.util.Optional entity() { return wrapperContained.entity; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(wrapperContained.operation); }
public Object builder() { return wrapperContained.builder(); }
// public java.util.List getNewLoreTexts(yarnwrap.component.type.LoreComponent current,yarnwrap.loot.context.LootContext context) { return wrapperContained.getNewLoreTexts(current.wrapperContained,context.wrapperContained); }

}