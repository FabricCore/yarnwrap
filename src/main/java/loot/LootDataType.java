package yarnwrap.loot;
public class LootDataType { public net.minecraft.loot.LootDataType wrapperContained; public LootDataType(net.minecraft.loot.LootDataType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.LootDataType PREDICATES() { return new yarnwrap.loot.LootDataType(wrapperContained.PREDICATES); }
public yarnwrap.loot.LootDataType ITEM_MODIFIERS() { return new yarnwrap.loot.LootDataType(wrapperContained.ITEM_MODIFIERS); }
public yarnwrap.loot.LootDataType LOOT_TABLES() { return new yarnwrap.loot.LootDataType(wrapperContained.LOOT_TABLES); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public java.util.Optional parse(yarnwrap.util.Identifier id,com.mojang.serialization.DynamicOps ops,java.lang.Object json) { return wrapperContained.parse(id.wrapperContained,ops,json); }
public void validate(yarnwrap.loot.LootTableReporter reporter,yarnwrap.registry.RegistryKey key,java.lang.Object value) { wrapperContained.validate(reporter.wrapperContained,key.wrapperContained,value); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public Object simpleValidator() { return wrapperContained.simpleValidator(); }
// public Object tableValidator() { return wrapperContained.tableValidator(); }

}