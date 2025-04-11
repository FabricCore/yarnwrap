package yarnwrap.util;
public class JsonReaderUtils { public net.minecraft.util.JsonReaderUtils wrapperContained; public JsonReaderUtils(net.minecraft.util.JsonReaderUtils wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.reflect.Field POS() { return wrapperContained.POS; }
// public void POS(java.lang.reflect.Field value) { wrapperContained.POS = value; }
// public java.lang.reflect.Field LINE_START() { return wrapperContained.LINE_START; }
// public void LINE_START(java.lang.reflect.Field value) { wrapperContained.LINE_START = value; }
// public int getPos(com.google.gson.stream.JsonReader jsonReader) { return wrapperContained.getPos(jsonReader); }
// public java.lang.Object parse(Object registryLookup,com.mojang.brigadier.StringReader stringReader,com.mojang.serialization.Codec codec) { return wrapperContained.parse(registryLookup,stringReader,codec); }
public java.lang.String readWhileMatching(com.mojang.brigadier.StringReader stringReader,yarnwrap.util.function.CharPredicate predicate) { return wrapperContained.readWhileMatching(stringReader,predicate.wrapperContained); }

}