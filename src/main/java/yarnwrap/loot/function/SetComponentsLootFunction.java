package yarnwrap.loot.function;
public class SetComponentsLootFunction { public net.minecraft.loot.function.SetComponentsLootFunction wrapperContained; public SetComponentsLootFunction(net.minecraft.loot.function.SetComponentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.component.ComponentChanges changes() { return new yarnwrap.component.ComponentChanges(wrapperContained.changes); }
// public void changes(yarnwrap.component.ComponentChanges value) { wrapperContained.changes = value.wrapperContained; }
public Object builder(yarnwrap.component.ComponentType componentType,java.lang.Object value) { return wrapperContained.builder(componentType.wrapperContained,value); }

}