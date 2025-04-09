package yarnwrap.entity.decoration.painting;
public class PaintingVariants { public net.minecraft.entity.decoration.painting.PaintingVariants wrapperContained; public PaintingVariants(net.minecraft.entity.decoration.painting.PaintingVariants wrapperContained) { this.wrapperContained = wrapperContained; }

public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,int width,int height) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,width,height); }

}