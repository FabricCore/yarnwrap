package yarnwrap.structure.pool;
public class EmptyPoolElement { public net.minecraft.structure.pool.EmptyPoolElement wrapperContained; public EmptyPoolElement(net.minecraft.structure.pool.EmptyPoolElement wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.pool.EmptyPoolElement INSTANCE() { return new yarnwrap.structure.pool.EmptyPoolElement(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.pool.EmptyPoolElement value) { wrapperContained.INSTANCE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}