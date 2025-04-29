package yarnwrap.server.integrated;
public class IntegratedPlayerManager { public net.minecraft.server.integrated.IntegratedPlayerManager wrapperContained; public IntegratedPlayerManager(net.minecraft.server.integrated.IntegratedPlayerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound userData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.userData); }
// public void userData(yarnwrap.nbt.NbtCompound value) { wrapperContained.userData = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound userData() { return new yarnwrap.nbt.NbtCompound(net.minecraft.server.integrated.IntegratedPlayerManager.userData); }
// public static void userData(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.server.integrated.IntegratedPlayerManager.userData = value.wrapperContained; }

public IntegratedPlayerManager(yarnwrap.server.integrated.IntegratedServer server,yarnwrap.registry.CombinedDynamicRegistries registryManager,yarnwrap.world.PlayerSaveHandler saveHandler) { this.wrapperContained = new net.minecraft.server.integrated.IntegratedPlayerManager(server.wrapperContained,registryManager.wrapperContained,saveHandler.wrapperContained); }

}