package yarnwrap.data;
public class Main { public net.minecraft.data.Main wrapperContained; public Main(net.minecraft.data.Main wrapperContained) { this.wrapperContained = wrapperContained; }

// public void main(java.lang.String[] args) { wrapperContained.main(args); }
// public yarnwrap.data.dev.NbtProvider method_46595(java.util.Collection outputx) { return new yarnwrap.data.dev.NbtProvider(wrapperContained.method_46595(outputx)); }
// public yarnwrap.data.MetadataProvider method_46597(yarnwrap.data.DataOutput outputx) { return new yarnwrap.data.MetadataProvider(wrapperContained.method_46597(outputx.wrapperContained)); }
// public yarnwrap.data.SnbtProvider method_46598(java.util.Collection outputx) { return new yarnwrap.data.SnbtProvider(wrapperContained.method_46598(outputx)); }
// public yarnwrap.data.server.tag.vanilla.VanillaItemTagProvider method_46599(java.util.concurrent.CompletableFuture outputx) { return new yarnwrap.data.server.tag.vanilla.VanillaItemTagProvider(wrapperContained.method_46599(outputx)); }
// public Object toFactory(java.util.function.BiFunction baseFactory,java.util.concurrent.CompletableFuture registryLookupFuture) { return wrapperContained.toFactory(baseFactory,registryLookupFuture); }
// public yarnwrap.data.DataProvider method_46840(java.util.function.BiFunction output) { return new yarnwrap.data.DataProvider(wrapperContained.method_46840(output)); }
// public java.nio.file.Path method_4967(java.lang.String input) { return wrapperContained.method_4967(input); }
public yarnwrap.data.DataGenerator create(java.nio.file.Path output,java.util.Collection inputs,boolean includeClient,boolean includeServer,boolean includeDev,boolean includeReports,boolean validate,yarnwrap.GameVersion gameVersion,boolean ignoreCache) { return new yarnwrap.data.DataGenerator(wrapperContained.create(output,inputs,includeClient,includeServer,includeDev,includeReports,validate,gameVersion.wrapperContained,ignoreCache)); }
// public yarnwrap.data.MetadataProvider method_52888(yarnwrap.data.DataOutput outputx) { return new yarnwrap.data.MetadataProvider(wrapperContained.method_52888(outputx.wrapperContained)); }

}