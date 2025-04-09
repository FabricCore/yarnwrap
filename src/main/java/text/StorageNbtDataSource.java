package yarnwrap.text;
public class StorageNbtDataSource { public net.minecraft.text.StorageNbtDataSource wrapperContained; public StorageNbtDataSource(net.minecraft.text.StorageNbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object TYPE() { return wrapperContained.TYPE; }

}