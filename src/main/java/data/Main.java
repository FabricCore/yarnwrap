package yarnwrap.data;
public class Main { public net.minecraft.data.Main wrapperContained; public Main(net.minecraft.data.Main wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object toFactory(java.util.function.BiFunction baseFactory,java.util.concurrent.CompletableFuture registryLookupFuture) { return wrapperContained.toFactory(baseFactory,registryLookupFuture); }
public yarnwrap.data.DataGenerator create(java.nio.file.Path output,java.util.Collection inputs,boolean includeClient,boolean includeServer,boolean includeDev,boolean includeReports,boolean validate,yarnwrap.GameVersion gameVersion,boolean ignoreCache) { return new yarnwrap.data.DataGenerator(wrapperContained.create(output,inputs,includeClient,includeServer,includeDev,includeReports,validate,gameVersion.wrapperContained,ignoreCache)); }

}