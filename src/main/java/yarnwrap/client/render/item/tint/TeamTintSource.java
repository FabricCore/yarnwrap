package yarnwrap.client.render.item.tint;
public class TeamTintSource { public net.minecraft.client.render.item.tint.TeamTintSource wrapperContained; public TeamTintSource(net.minecraft.client.render.item.tint.TeamTintSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.tint.TeamTintSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.tint.TeamTintSource.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_65908(Object instance) { return wrapperContained.method_65908(instance); }
// public static com.mojang.datafixers.kinds.App method_65908(Object instance, ) { return net.minecraft.client.render.item.tint.TeamTintSource.method_65908(instance); }

}