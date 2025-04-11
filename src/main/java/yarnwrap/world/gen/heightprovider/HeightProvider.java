package yarnwrap.world.gen.heightprovider;
public class HeightProvider { public net.minecraft.world.gen.heightprovider.HeightProvider wrapperContained; public HeightProvider(net.minecraft.world.gen.heightprovider.HeightProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec OFFSET_OR_HEIGHT_CODEC() { return wrapperContained.OFFSET_OR_HEIGHT_CODEC; }
// public void OFFSET_OR_HEIGHT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OFFSET_OR_HEIGHT_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.heightprovider.HeightProviderType getType() { return new yarnwrap.world.gen.heightprovider.HeightProviderType(wrapperContained.getType()); }
public int get(yarnwrap.util.math.random.Random random,yarnwrap.world.gen.HeightContext context) { return wrapperContained.get(random.wrapperContained,context.wrapperContained); }

}