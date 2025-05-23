package yarnwrap.component.type;
public class ContainerLootComponent { public net.minecraft.component.type.ContainerLootComponent wrapperContained; public ContainerLootComponent(net.minecraft.component.type.ContainerLootComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ContainerLootComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ContainerLootComponent.CODEC = value; }

// public yarnwrap.text.Text UNKNOWN_LOOT_TABLE_TOOLTIP_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNKNOWN_LOOT_TABLE_TOOLTIP_TEXT); }
// public void UNKNOWN_LOOT_TABLE_TOOLTIP_TEXT(yarnwrap.text.Text value) { wrapperContained.UNKNOWN_LOOT_TABLE_TOOLTIP_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text UNKNOWN_LOOT_TABLE_TOOLTIP_TEXT() { return new yarnwrap.text.Text(net.minecraft.component.type.ContainerLootComponent.UNKNOWN_LOOT_TABLE_TOOLTIP_TEXT); }
// public static void UNKNOWN_LOOT_TABLE_TOOLTIP_TEXT(yarnwrap.text.Text value, ) { net.minecraft.component.type.ContainerLootComponent.UNKNOWN_LOOT_TABLE_TOOLTIP_TEXT = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_57513(Object instance) { return wrapperContained.method_57513(instance); }
// public static com.mojang.datafixers.kinds.App method_57513(Object instance, ) { return net.minecraft.component.type.ContainerLootComponent.method_57513(instance); }

}