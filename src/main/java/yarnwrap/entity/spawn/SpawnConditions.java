package yarnwrap.entity.spawn;
public class SpawnConditions { public net.minecraft.entity.spawn.SpawnConditions wrapperContained; public SpawnConditions(net.minecraft.entity.spawn.SpawnConditions wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.entity.spawn.SpawnConditions.registerAndGetDefault(registry.wrapperContained); }

}