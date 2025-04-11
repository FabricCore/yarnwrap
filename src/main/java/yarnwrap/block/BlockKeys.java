package yarnwrap.block;
public class BlockKeys { public net.minecraft.block.BlockKeys wrapperContained; public BlockKeys(net.minecraft.block.BlockKeys wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }

}