package yarnwrap.data.tag;
public class ValueLookupTagProvider { public net.minecraft.data.tag.ValueLookupTagProvider wrapperContained; public ValueLookupTagProvider(net.minecraft.data.tag.ValueLookupTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Function valueToKey() { return wrapperContained.valueToKey; }
// public void valueToKey(java.util.function.Function value) { wrapperContained.valueToKey = value; }
// public static java.util.function.Function valueToKey() { return net.minecraft.data.tag.ValueLookupTagProvider.valueToKey; }
// public static void valueToKey(java.util.function.Function value, ) { net.minecraft.data.tag.ValueLookupTagProvider.valueToKey = value; }

// public ValueLookupTagProvider(yarnwrap.data.DataOutput output,yarnwrap.registry.RegistryKey registryRef,java.util.concurrent.CompletableFuture registriesFuture,java.util.concurrent.CompletableFuture parentTagLookupFuture,java.util.function.Function valueToKey) { this.wrapperContained = new net.minecraft.data.tag.ValueLookupTagProvider(output.wrapperContained,registryRef.wrapperContained,registriesFuture,parentTagLookupFuture,valueToKey); }
// public ValueLookupTagProvider(yarnwrap.data.DataOutput output,yarnwrap.registry.RegistryKey registryRef,java.util.concurrent.CompletableFuture registriesFuture,java.util.function.Function valueToKey) { this.wrapperContained = new net.minecraft.data.tag.ValueLookupTagProvider(output.wrapperContained,registryRef.wrapperContained,registriesFuture,valueToKey); }
// public yarnwrap.data.tag.ProvidedTagBuilder builder(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.data.tag.ProvidedTagBuilder(wrapperContained.builder(tag.wrapperContained)); }
// public static yarnwrap.data.tag.ProvidedTagBuilder builder(yarnwrap.registry.tag.TagKey tag, ) { return new yarnwrap.data.tag.ProvidedTagBuilder(net.minecraft.data.tag.ValueLookupTagProvider.builder(tag.wrapperContained)); }

}