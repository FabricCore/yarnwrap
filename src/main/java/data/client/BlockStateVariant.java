package yarnwrap.data.client;
public class BlockStateVariant { public net.minecraft.data.client.BlockStateVariant wrapperContained; public BlockStateVariant(net.minecraft.data.client.BlockStateVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map properties() { return wrapperContained.properties; }
public yarnwrap.data.client.BlockStateVariant create() { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.create()); }
public yarnwrap.data.client.BlockStateVariant union(yarnwrap.data.client.BlockStateVariant first,yarnwrap.data.client.BlockStateVariant second) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.union(first.wrapperContained,second.wrapperContained)); }
public yarnwrap.data.client.BlockStateVariant put(yarnwrap.data.client.VariantSetting key,java.lang.Object value) { return new yarnwrap.data.client.BlockStateVariant(wrapperContained.put(key.wrapperContained,value)); }
public com.google.gson.JsonElement toJson(java.util.List variants) { return wrapperContained.toJson(variants); }

}