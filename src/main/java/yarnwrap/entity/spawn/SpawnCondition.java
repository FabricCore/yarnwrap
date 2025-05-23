package yarnwrap.entity.spawn;
public class SpawnCondition { public net.minecraft.entity.spawn.SpawnCondition wrapperContained; public SpawnCondition(net.minecraft.entity.spawn.SpawnCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.spawn.SpawnCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.spawn.SpawnCondition.CODEC = value; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.entity.spawn.SpawnCondition.getCodec(); }
// public com.mojang.serialization.MapCodec method_67167(com.mojang.serialization.MapCodec codec) { return wrapperContained.method_67167(codec); }
// public static com.mojang.serialization.MapCodec method_67167(com.mojang.serialization.MapCodec codec, ) { return net.minecraft.entity.spawn.SpawnCondition.method_67167(codec); }

}