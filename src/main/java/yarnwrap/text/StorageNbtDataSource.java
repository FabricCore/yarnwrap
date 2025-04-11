package yarnwrap.text;
public class StorageNbtDataSource { public net.minecraft.text.StorageNbtDataSource wrapperContained; public StorageNbtDataSource(net.minecraft.text.StorageNbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public com.mojang.datafixers.kinds.App method_54235(Object instance) { return wrapperContained.method_54235(instance); }

}