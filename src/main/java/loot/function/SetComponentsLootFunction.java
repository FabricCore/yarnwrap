package yarnwrap.loot.function;
public class SetComponentsLootFunction { public net.minecraft.loot.function.SetComponentsLootFunction wrapperContained; public SetComponentsLootFunction(net.minecraft.loot.function.SetComponentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.component.ComponentChanges changes() { return new yarnwrap.component.ComponentChanges(wrapperContained.changes); }
public Object builder(yarnwrap.component.ComponentType componentType,java.lang.Object value) { return wrapperContained.builder(componentType.wrapperContained,value); }

}