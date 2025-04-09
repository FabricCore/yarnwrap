package yarnwrap.registry;
public class ExperimentalRegistriesValidator { public net.minecraft.registry.ExperimentalRegistriesValidator wrapperContained; public ExperimentalRegistriesValidator(net.minecraft.registry.ExperimentalRegistriesValidator wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.concurrent.CompletableFuture validate(java.util.concurrent.CompletableFuture registriesFuture,yarnwrap.registry.RegistryBuilder builder) { return wrapperContained.validate(registriesFuture,builder.wrapperContained); }

}