package yarnwrap.server.integrated;
public class IntegratedPlayerManager { public net.minecraft.server.integrated.IntegratedPlayerManager wrapperContained; public IntegratedPlayerManager(net.minecraft.server.integrated.IntegratedPlayerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound userData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.userData); }
// public void userData(yarnwrap.nbt.NbtCompound value) { wrapperContained.userData = value.wrapperContained; }

}