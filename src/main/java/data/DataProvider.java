package yarnwrap.data;
public class DataProvider { public net.minecraft.data.DataProvider wrapperContained; public DataProvider(net.minecraft.data.DataProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.ToIntFunction JSON_KEY_SORT_ORDER() { return wrapperContained.JSON_KEY_SORT_ORDER; }
public java.util.Comparator JSON_KEY_SORTING_COMPARATOR() { return wrapperContained.JSON_KEY_SORTING_COMPARATOR; }
public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public java.util.concurrent.CompletableFuture run(yarnwrap.data.DataWriter writer) { return wrapperContained.run(writer.wrapperContained); }
// public java.util.concurrent.CompletableFuture writeToPath(yarnwrap.data.DataWriter writer,com.google.gson.JsonElement json,java.nio.file.Path path) { return wrapperContained.writeToPath(writer.wrapperContained,json,path); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public java.util.concurrent.CompletableFuture writeCodecToPath(yarnwrap.data.DataWriter writer,Object registryLookup,com.mojang.serialization.Codec codec,java.lang.Object value,java.nio.file.Path path) { return wrapperContained.writeCodecToPath(writer.wrapperContained,registryLookup,codec,value,path); }

}