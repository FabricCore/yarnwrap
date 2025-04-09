package yarnwrap.structure.pool;
public class LegacySinglePoolElement { public net.minecraft.structure.pool.LegacySinglePoolElement wrapperContained; public LegacySinglePoolElement(net.minecraft.structure.pool.LegacySinglePoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}