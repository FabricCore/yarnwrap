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
// public java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,Object registries,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path) { return wrapperContained.writeCodecToPath(writer.wrapperContained,registries,codec,value,path); }
// public static java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,Object registries,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path, ) { return net.minecraft.data.DataProvider.writeCodecToPath(writer.wrapperContained,registries,codec,value,path); }
// public java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path) { return wrapperContained.writeCodecToPath(writer.wrapperContained,codec,value,path); }
// public static java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path, ) { return net.minecraft.data.DataProvider.writeCodecToPath(writer.wrapperContained,codec,value,path); }
// public java.util.concurrent.CompletableFuture method_64109(java.util.function.Function entry) { return wrapperContained.method_64109(entry); }
// public static java.util.concurrent.CompletableFuture method_64109(java.util.function.Function entry, ) { return net.minecraft.data.DataProvider.method_64109(entry); }
// public java.util.concurrent.CompletableFuture writeAllToPath(yarnwrap.data.DataWriter writer,com.mojang.serialization.Codec codec,Object pathResolver,java.util.Map idsToValues) { return wrapperContained.writeAllToPath(writer.wrapperContained,codec,pathResolver,idsToValues); }
// public static java.util.concurrent.CompletableFuture writeAllToPath(yarnwrap.data.DataWriter writer,com.mojang.serialization.Codec codec,Object pathResolver,java.util.Map idsToValues, ) { return net.minecraft.data.DataProvider.writeAllToPath(writer.wrapperContained,codec,pathResolver,idsToValues); }
// public java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path) { return wrapperContained.writeCodecToPath(writer.wrapperContained,ops,codec,value,path); }
// public static java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path, ) { return net.minecraft.data.DataProvider.writeCodecToPath(writer.wrapperContained,ops,codec,value,path); }
// public com.google.gson.JsonElement method_65770(com.mojang.serialization.Codec value) { return wrapperContained.method_65770(value); }
// public static com.google.gson.JsonElement method_65770(com.mojang.serialization.Codec value, ) { return net.minecraft.data.DataProvider.method_65770(value); }
// public java.util.concurrent.CompletableFuture writeAllToPath(yarnwrap.data.DataWriter writer,com.mojang.serialization.Codec codec,java.util.function.Function pathResolver,java.util.Map idsToValues) { return wrapperContained.writeAllToPath(writer.wrapperContained,codec,pathResolver,idsToValues); }
// public static java.util.concurrent.CompletableFuture writeAllToPath(yarnwrap.data.DataWriter writer,com.mojang.serialization.Codec codec,java.util.function.Function pathResolver,java.util.Map idsToValues, ) { return net.minecraft.data.DataProvider.writeAllToPath(writer.wrapperContained,codec,pathResolver,idsToValues); }
// public java.util.concurrent.CompletableFuture writeAllToPath(yarnwrap.data.DataWriter writer,java.util.function.Function serializer,java.util.function.Function pathResolver,java.util.Map idsToValues) { return wrapperContained.writeAllToPath(writer.wrapperContained,serializer,pathResolver,idsToValues); }
// public static java.util.concurrent.CompletableFuture writeAllToPath(yarnwrap.data.DataWriter writer,java.util.function.Function serializer,java.util.function.Function pathResolver,java.util.Map idsToValues, ) { return net.minecraft.data.DataProvider.writeAllToPath(writer.wrapperContained,serializer,pathResolver,idsToValues); }

}