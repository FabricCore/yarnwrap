package yarnwrap.component.type;
public class ContainerLootComponent { public net.minecraft.component.type.ContainerLootComponent wrapperContained; public ContainerLootComponent(net.minecraft.component.type.ContainerLootComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}