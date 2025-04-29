package yarnwrap.data.client;
public class BlockStateVariant { public net.minecraft.data.client.BlockStateVariant wrapperContained; public BlockStateVariant(net.minecraft.data.client.BlockStateVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map properties() { return wrapperContained.properties; }
// public void properties(java.util.Map value) { wrapperContained.properties = value; }
// public static java.util.Map properties() { return net.minecraft.data.client.BlockStateVariant.properties; }
// public static void properties(java.util.Map value, ) { net.minecraft.data.client.BlockStateVariant.properties = value; }

// public yarnwrap.data.client.BlockStateVariant create() { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.create()); }
public static yarnwrap.data.client.BlockStateVariant create() { return new yarnwrap.data.client.BlockStateVariant(net.minecraft.data.client.BlockStateVariant.create()); }
// public void method_25825(com.google.gson.JsonArray variant) { wrapperContained.method_25825(variant); }
// public static void method_25825(com.google.gson.JsonArray variant, ) { net.minecraft.data.client.BlockStateVariant.method_25825(variant); }
// public void method_25826(com.google.gson.JsonObject value) { wrapperContained.method_25826(value); }
// public static void method_25826(com.google.gson.JsonObject value, ) { net.minecraft.data.client.BlockStateVariant.method_25826(value); }
// public yarnwrap.data.client.BlockStateVariant union(yarnwrap.data.client.BlockStateVariant first,yarnwrap.data.client.BlockStateVariant second) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.union(first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.data.client.BlockStateVariant union(yarnwrap.data.client.BlockStateVariant first,yarnwrap.data.client.BlockStateVariant second, ) { return new yarnwrap.data.client.BlockStateVariant(net.minecraft.data.client.BlockStateVariant.union(first.wrapperContained,second.wrapperContained)); }
public yarnwrap.data.client.BlockStateVariant put(yarnwrap.data.client.VariantSetting key,java.lang.Object value) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.put(key.wrapperContained,value)); }
// public static yarnwrap.data.client.BlockStateVariant put(yarnwrap.data.client.VariantSetting key,java.lang.Object value, ) { return new yarnwrap.data.client.BlockStateVariant(net.minecraft.data.client.BlockStateVariant.put(key.wrapperContained,value)); }
// public com.google.gson.JsonElement toJson(java.util.List variants) { return wrapperContained.toJson(variants); }
// public static com.google.gson.JsonElement toJson(java.util.List variants, ) { return net.minecraft.data.client.BlockStateVariant.toJson(variants); }

}