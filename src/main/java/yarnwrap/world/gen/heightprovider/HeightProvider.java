package yarnwrap.world.gen.heightprovider;
public class HeightProvider { public net.minecraft.world.gen.heightprovider.HeightProvider wrapperContained; public HeightProvider(net.minecraft.world.gen.heightprovider.HeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec OFFSET_OR_HEIGHT_CODEC() { return wrapperContained.OFFSET_OR_HEIGHT_CODEC; }
// public void OFFSET_OR_HEIGHT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OFFSET_OR_HEIGHT_CODEC = value; }
// public static com.mojang.serialization.Codec OFFSET_OR_HEIGHT_CODEC() { return net.minecraft.world.gen.heightprovider.HeightProvider.OFFSET_OR_HEIGHT_CODEC; }
// public static void OFFSET_OR_HEIGHT_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.heightprovider.HeightProvider.OFFSET_OR_HEIGHT_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.heightprovider.HeightProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.heightprovider.HeightProvider.CODEC = value; }

public yarnwrap.world.gen.heightprovider.HeightProviderType getType() { return new yarnwrap.world.gen.heightprovider.HeightProviderType(wrapperContained.getType()); }
// public static yarnwrap.world.gen.heightprovider.HeightProviderType getType() { return new yarnwrap.world.gen.heightprovider.HeightProviderType(net.minecraft.world.gen.heightprovider.HeightProvider.getType()); }
// public yarnwrap.world.gen.heightprovider.HeightProvider method_35389(com.mojang.datafixers.util.Either either) { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.method_35389(either)); }
// public static yarnwrap.world.gen.heightprovider.HeightProvider method_35389(com.mojang.datafixers.util.Either either, ) { return new yarnwrap.world.gen.heightprovider.HeightProvider(net.minecraft.world.gen.heightprovider.HeightProvider.method_35389(either)); }
// public com.mojang.datafixers.util.Either method_35390(yarnwrap.world.gen.heightprovider.HeightProvider provider) { return wrapperContained.method_35390(provider.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_35390(yarnwrap.world.gen.heightprovider.HeightProvider provider, ) { return net.minecraft.world.gen.heightprovider.HeightProvider.method_35390(provider.wrapperContained); }
public int get(yarnwrap.util.math.random.Random random,yarnwrap.world.gen.HeightContext context) { return wrapperContained.get(random.wrapperContained,context.wrapperContained); }
// public static int get(yarnwrap.util.math.random.Random random,yarnwrap.world.gen.HeightContext context, ) { return net.minecraft.world.gen.heightprovider.HeightProvider.get(random.wrapperContained,context.wrapperContained); }
// public yarnwrap.world.gen.heightprovider.HeightProvider method_35392(yarnwrap.world.gen.heightprovider.HeightProvider provider) { return new yarnwrap.world.gen.heightprovider.HeightProvider(wrapperContained.method_35392(provider.wrapperContained)); }
// public static yarnwrap.world.gen.heightprovider.HeightProvider method_35392(yarnwrap.world.gen.heightprovider.HeightProvider provider, ) { return new yarnwrap.world.gen.heightprovider.HeightProvider(net.minecraft.world.gen.heightprovider.HeightProvider.method_35392(provider.wrapperContained)); }

}