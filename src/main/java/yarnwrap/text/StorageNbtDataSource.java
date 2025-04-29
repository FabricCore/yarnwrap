package yarnwrap.text;
public class StorageNbtDataSource { public net.minecraft.text.StorageNbtDataSource wrapperContained; public StorageNbtDataSource(net.minecraft.text.StorageNbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.text.StorageNbtDataSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.text.StorageNbtDataSource.CODEC = value; }

// public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public static Object TYPE() { return net.minecraft.text.StorageNbtDataSource.TYPE; }
// // public static void TYPE(Object value, ) { net.minecraft.text.StorageNbtDataSource.TYPE = value; }

// public com.mojang.datafixers.kinds.App method_54235(Object instance) { return wrapperContained.method_54235(instance); }
// public static com.mojang.datafixers.kinds.App method_54235(Object instance, ) { return net.minecraft.text.StorageNbtDataSource.method_54235(instance); }

}