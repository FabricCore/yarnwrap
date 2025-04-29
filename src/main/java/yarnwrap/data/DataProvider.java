package yarnwrap.data;
public class DataProvider { public net.minecraft.data.DataProvider wrapperContained; public DataProvider(net.minecraft.data.DataProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.ToIntFunction JSON_KEY_SORT_ORDER() { return wrapperContained.JSON_KEY_SORT_ORDER; }
// public void JSON_KEY_SORT_ORDER(java.util.function.ToIntFunction value) { wrapperContained.JSON_KEY_SORT_ORDER = value; }
public static java.util.function.ToIntFunction JSON_KEY_SORT_ORDER() { return net.minecraft.data.DataProvider.JSON_KEY_SORT_ORDER; }
// public static void JSON_KEY_SORT_ORDER(java.util.function.ToIntFunction value, ) { net.minecraft.data.DataProvider.JSON_KEY_SORT_ORDER = value; }

// public java.util.Comparator JSON_KEY_SORTING_COMPARATOR() { return wrapperContained.JSON_KEY_SORTING_COMPARATOR; }
// public void JSON_KEY_SORTING_COMPARATOR(java.util.Comparator value) { wrapperContained.JSON_KEY_SORTING_COMPARATOR = value; }
public static java.util.Comparator JSON_KEY_SORTING_COMPARATOR() { return net.minecraft.data.DataProvider.JSON_KEY_SORTING_COMPARATOR; }
// public static void JSON_KEY_SORTING_COMPARATOR(java.util.Comparator value, ) { net.minecraft.data.DataProvider.JSON_KEY_SORTING_COMPARATOR = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.data.DataProvider.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.data.DataProvider.LOGGER = value; }

public java.util.concurrent.CompletableFuture run(yarnwrap.data.DataWriter writer) { return wrapperContained.run(writer.wrapperContained); }
// public static java.util.concurrent.CompletableFuture run(yarnwrap.data.DataWriter writer, ) { return net.minecraft.data.DataProvider.run(writer.wrapperContained); }
// public java.util.concurrent.CompletableFuture writeToPath(yarnwrap.data.DataWriter writer,com.google.gson.JsonElement json,java.nio.file.Path path) { return wrapperContained.writeToPath(writer.wrapperContained,json,path); }
// public static java.util.concurrent.CompletableFuture writeToPath(yarnwrap.data.DataWriter writer,com.google.gson.JsonElement json,java.nio.file.Path path, ) { return net.minecraft.data.DataProvider.writeToPath(writer.wrapperContained,json,path); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.data.DataProvider.getName(); }
// public void method_43808(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map) { wrapperContained.method_43808(map); }
// public static void method_43808(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap map, ) { net.minecraft.data.DataProvider.method_43808(map); }
// public java.lang.String method_43809(java.lang.String key) { return wrapperContained.method_43809(key); }
// public static java.lang.String method_43809(java.lang.String key, ) { return net.minecraft.data.DataProvider.method_43809(key); }
// public java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,Object registryLookup,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path) { return wrapperContained.writeCodecToPath(writer.wrapperContained,registryLookup,codec,value,path); }
// public static java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,Object registryLookup,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path, ) { return net.minecraft.data.DataProvider.writeCodecToPath(writer.wrapperContained,registryLookup,codec,value,path); }

}