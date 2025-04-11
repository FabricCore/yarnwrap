package yarnwrap.registry;
public class ExperimentalRegistriesValidator { public net.minecraft.registry.ExperimentalRegistriesValidator wrapperContained; public ExperimentalRegistriesValidator(net.minecraft.registry.ExperimentalRegistriesValidator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object method_54839(yarnwrap.registry.RegistryBuilder lookup) { return wrapperContained.method_54839(lookup.wrapperContained); }
public java.util.concurrent.CompletableFuture validate(java.util.concurrent.CompletableFuture registriesFuture,yarnwrap.registry.RegistryBuilder builder) { return wrapperContained.validate(registriesFuture,builder.wrapperContained); }
// public void method_55310(Object entry) { wrapperContained.method_55310(entry); }

}