package yarnwrap.component.type;
public class ContainerLootComponent { public net.minecraft.component.type.ContainerLootComponent wrapperContained; public ContainerLootComponent(net.minecraft.component.type.ContainerLootComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ContainerLootComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ContainerLootComponent.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_57513(Object instance) { return wrapperContained.method_57513(instance); }
// public static com.mojang.datafixers.kinds.App method_57513(Object instance, ) { return net.minecraft.component.type.ContainerLootComponent.method_57513(instance); }

}